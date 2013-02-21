/*

  Further Developed by:
     Behrooz Nobakht
     bnobakht@liacs.nl
    
  for Cacoj at http://sf.net/projects/cacoj
  
  ==========================================

	A tree grammar to parse the Creol.g AST
	
	Copyright (c) 2008 by Maximilian Dylla
	
	email: Maximilian.Dylla {AT} gmail.com

    	This file is part of jCreol.
	
	jCreol is free software; you can redistribute it 
	and/or modify it under the terms of the GNU General 
	Public License as published by the Free Software 
	Foundation; either version 2 of the License, or (at your 
	option) any later version. 
    
	This program is distributed in the hope that it will be 
	useful, but WITHOUT ANY WARRANTY; without 
	even the implied warranty of MERCHANTABILITY 
	or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General 
	Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
 
 */

/*
	NOTES:
	======
	The tree grammar might be stricter in accepting a program than the Creol.g grammar.
	This is a empty walker. It is supposed to be used for future applications.
	The tree grammar should be the same as in the other walker files.
 */

tree grammar CreolWalker;

options {
	tokenVocab = Creol;
	ASTLabelType = CommonTree;
	output = template;
}


@header{
package nl.cwi.cacoj.creol;

import java.util.List;
import java.util.ArrayList;
import nl.cwi.cacoj.creol.lang.*;
}

@members{
	public void displayRecognitionError(String[] tokenNames,
		RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		// Now do something with hdr and msg...
		e.printStackTrace();
		System.out.println(hdr + " --- " + msg);
		throw new RuntimeException(e);
	}
	
	static StringTemplate template(String name) {
	  return CreolCompiler.template(name);
	}
	
	private String genVarName(String prefix) {
	   return CompilationContextUtils.generateVariableName(prefix);
	}
	
	private String lastVarName(String prefix) {
	   return CompilationContextUtils.getLastGeneratedNum(prefix);
	}
	
	private void setCurrentContext(String name) {
	   CompilationContextUtils.setCurrentContext(name);
	}
	
	private void setCurrentMethodContext(String name) {
	   CompilationContextUtils.setCurrentMethodContext(name);
	}
	   
	private String getMethodReturnType(String name) {
	   return CompilationContextUtils.getMethodReturnType(name);
	}
	
	private String refineMethodName(String name) {
	   return CompilationContextUtils.refineMethodName(name);
	}
	
	private CompilationContext getCurrentContext() {
	   return CompilationContextUtils.getCurrentContext();
	}
	
	private String getMiNameForFutureLabel(String label) {
	   String mi = CompilationContextUtils.getMiNameForFutureLabel(label);
	   if (mi == null) {
	     return "currentProcess";
	   }
	   return mi;
	}
	
  private void setMiNameFutureLabel(String mi, String label) {
     CompilationContextUtils.setMiNameFutureLabel(mi, label);
  }
  
  private void addMethodLevelPriority(CMethod m) {
     CompilationContextUtils.addMethodLevelPriority(m);
  }
  

}

//@constructor???


start		: ^(PROGRAM d+=declaration+) -> start_tmpl(decls={$d})
		;


declaration	: 
             im=j_import_decl -> declaration_tmpl(decl={$im.st})
            | id=interface_decl -> declaration_tmpl(decl={$id.st})
            | dd=datatype_decl -> declaration_tmpl(decl={$dd.st})
            | fd=function_decl -> declaration_tmpl(decl={$fd.st})
            | cd=class_decl -> declaration_tmpl(decl={$cd.st})
		;
		
class_decl	
  : 
    ^(CLASS 
			^(ID CLASS_IDENTIFIER {setCurrentContext($CLASS_IDENTIFIER.text);})
			(^(PRM initatts=var_decl_no_init_list?))?
		 	^(SUPER sd+=super_decl*)
			^(PRAGMAS pragma*)
			^(ATTRIBUTES at+=attribute*)
			^(METHODS awf=anon_with_def? wf+=with_def*)
		  ) -> class_decl_tmpl(cid={$CLASS_IDENTIFIER.text}, 
		                     supers={$sd}, 
		                     attribs={$at},
		                     initatts={initatts == null ? null : initatts.vars},
		                     with_methods={$wf},
		                     anon_methods={$awf.st},
		                     has_init={getCurrentContext().hasInitMethod()},
		                     context={getCurrentContext()})
	;

super_decl	: ^(CONTRACTS class_list)
		| ^(IMPLEMENTS cl=class_list) -> implements_tmpl(clist={$cl.st})
		| ^(INHERITS class_list)
	;

class_list	: celems += class_element+
              -> class_list_tmpl(celems={$celems})
	;

class_element	: ^(CLASS_IDENTIFIER parameter_list?)
                -> class_element_tmpl (ce={$CLASS_IDENTIFIER.text})
	;

pragma		: ^(PRAGMA CLASS_IDENTIFIER parameter_list?)
	;

attribute	: ^(VAR attlist=var_decl_list)
            -> attribute_list_tmpl(attlist={$attlist.st})
	;

var_decl_no_init returns [CVariable var;]
  : 
    ^(DECL IDENTIFIER t=type)
	    {retval.var = new CVariable($IDENTIFIER.text, t.ctype);}
	    //-> var_decl_no_init_tmpl (v={var})
	;

//var_decl_no_init_list returns [List vars;]
//  : 
//    {retval.vars = new ArrayList();}
//    ^(KOMMA v=var_decl_no_init l=var_decl_no_init_list)
//    {
//     retval.vars.add(v.var);
//     retval.vars.addAll(l.vars);
//    }
var_decl_no_init_list returns [List vars = new ArrayList();]
  : 
    {retval.vars = new ArrayList();}
    (vdlist=var_decl_no_init {retval.vars.add(((var_decl_no_init_return)vdlist).var);})+
    
      //-> var_decl_list_tmpl(vdlist={$vdlist})
//		| var_decl_no_init
	;

var_decl_list	
  : 
    vd += var_decl+ 
      -> var_decl_list_tmpl(vdlist={$vd})
	;

var_decl	
  : 
    vd=var_decl_no_init 
       -> var_decl_single_tmpl(v={vd.var})
		| ^(ASSIGN vd=var_decl_no_init value=expr_or_new)
		   -> var_decl_single_tmpl(v={vd.var}, value={$value.st})
	;

anon_with_def	: 
        m+=method_with_body+ invariant*
        -> anon_with_def_tmpl(methods={$m})
	;

with_def	: ^(WITH wt=type mwb+=method_with_body+ invariant*)
            -> with_def_tmpl(with_type={$wt.st}, methods={$mwb})
	;

method_with_body 
: 
    {CMethod mth;}
    ^(OP 
	    ^(ID IDENTIFIER) 
		    {
		     mth = new CMethod(); 
		     mth.name=$IDENTIFIER.text;
		     setCurrentMethodContext($IDENTIFIER.text);
		    }
			(^(PRM inp=method_param_in? outp=method_param_out?))?
				{
				mth.inparams = inp != null ? inp.inparams : null;
				mth.outparams = outp != null ? outp.outparams : null;
				}
			(^(REQUIRES expr))?
			(^(ENSURES expr))?
			pragma*
			(^(BODY pr=priority_decl? b=decl_statement) | ^(EXTERNAL STRING))
			{
			 if (pr != null) {
			   mth.priorityExpression = pr.st.toString();
			   addMethodLevelPriority(mth);
			 }
			}
		)
		  -> method_with_body_tmpl(m={mth}, stats={$b.st}, priority={$pr.st})
//		-> method_with_body_tmpl(name={$IDENTIFIER.text},
//		                         inparams={$inp.st},
//		                         outparams={$outp.st},
//		                         body={$b.st})
	;
	
priority_decl 
  :
  ^(PRIORITIZE e=expr)
  -> method_level_priority_tmpl(expr={$e.st})
  ;

method_param_in	returns [List inparams;]
  : 
    {retval.inparams = new ArrayList();}
    ^(IN_PRM pdl=var_decl_no_init_list)
    {retval.inparams.addAll(pdl.vars);}
//                  -> method_param_in_tmpl(param_decls={$pdl.st})
	;

method_param_out returns [List outparams;]
  : 
    {retval.outparams = new ArrayList();}
    ^(OUT pdl=var_decl_no_init_list)
    {retval.outparams.addAll(pdl.vars);}  
//                  -> method_param_out_tmpl(param_decls={$pdl.st})
	;

id_or_op	: ^(ID IDENTIFIER)
		| ^(OP operator)
		
	;

operator	: IN
		| NOT
		| EQUIVALENCE
		| IMPLICATION
		| XOR
		| OR
		| AND
		| EQUALITY
		| INEQUALITY
		| comp_op
		| PROJECTION
		| CONCAT
		| PREPEND
		| APPEND
		| PLUS
		| MINUS
		| MULT
		| DIV
		| MOD
		| POW
		| NUMBER_SIGN
	;

parameter_list 	
  : 
   ^(PRM el=expr_list?)
   -> parameter_list_tmpl (plist={$el.st})
	;

function_decl	: ^(FUNCTION id_or_op 
		(^(PRM var_decl_no_init_list?))? 
		type 
		pragma* 
		( ^(EXTERNAL STRING) | ^(BODY expr))
		)
	;

datatype_decl	: ^(DATATYPE type (^(FROM type_list))? pragma*)
	;

interface_decl	: ^(INTERFACE
		^(ID CLASS_IDENTIFIER)
		(^(PRM var_decl_no_init_list?))?
		^(SUPER interface_inherits*)
		^(PRAGMAS pragma*)
		invariant?
		^(METHODS with_decl*)
		)
		-> interface_decl_tmpl(cid={$CLASS_IDENTIFIER.text})
	;

with_decl	: ^(WITH type method_decl+ invariant*)
	;

method_decl	: ^(OP 
		 ^(ID IDENTIFIER)
		(^(PRM method_param_in? method_param_out?))?
		(^(REQUIRES expr))?
		(^(ENSURES expr))?
		pragma*
		)
	;



interface_inherits: ^(INHERITS class_list?)
	;

// statements ====================

decl_statement	: 
      stmt=statement
      -> decl_statement_tmpl(stmt={$stmt.st})
		| ^(SEMICOLON a=attribute s=decl_statement)
		  -> decl_statement_with_vars_tmpl(attrib={$a.st}, stmt={$s.st})
	;

statement	: 
      ^(INTERLEAVE statement statement)
      
		| ^(BOX statement statement)
		
		| ^(SEMICOLON s1=statement s2=statement)
		-> statement_multi_statements(s1={$s1.st}, s2={$s2.st})
		
		| ^(ASSIGN l=expr_list r=expr_or_new_list)
		-> statement_assign_expr(left={$l.st}, right={$r.st})
		
		// non local asyn call 
		| ^(EXCLENATION_MARK mylabel=IDENTIFIER?/* label */ ^(DOT object=expr ^(METHOD method=IDENTIFIER ^(PRM params=expr_list? (^(SEMICOLON results=lhs_list?))? ) ) (^(AS type))?) )
		  {
		  String miName = genVarName("mi");
		  if (mylabel != null) {setMiNameFutureLabel(miName, mylabel.getText() + ".isDone()");}
		  }
		-> method_call_nonlocal_async_tmpl(
		      object={$object.st}, 
		      method={refineMethodName($method.getText())}, 
		      params={$params.st}, 
		      mi_var_name={miName}, 
		      method_return_type={getMethodReturnType($method.getText())},
		      results={results == null || results.lhslist == null ? new ArrayList() : results.lhslist}
		   ) 
		
    // non local asyn bounded call //not-yet		
		| ^(EXCLENATION_MARK IDENTIFIER?/* label */ method_call_bounds )
		
		// non local syn call //not-yet 
//		| ^(DOT object=expr ^(METHOD IDENTIFIER mclsp=syn_method_call_prm) (^(AS type))?)
//		-> method_call_nonlocal_sync_tmpl(object={$object.st}, method={$IDENTIFIER.text}, inparams={mclsp.inparams}, outparams={mclsp.outparams})

    | nlsc=non_local_syn_call
      -> non_local_syn_call_tmpl(st={$nlsc.st})
		
    // local asyn call		 
		| ^(EXCLENATION_MARK mylabel=IDENTIFIER?/* label */ ^(METHOD method=IDENTIFIER ^(PRM params=expr_list?) (^(AS type))? ))
      {
      String miName = genVarName("mi");
      if (mylabel != null) {setMiNameFutureLabel(miName, mylabel.getText() + ".isDone()");}
      }
		-> method_call_local_async_tmpl(
		    label={$mylabel == null ? null : $mylabel.getText()}, 
		    method={refineMethodName($method.getText())}, 
		    params={$params.st}, 
		    mi_var_name={miName}, 
		    method_return_type={getMethodReturnType($method.getText())}
		  ) 
		 
		//local syn bounded call //not-yet
		| local_syn_bounded_call 
		
		// local syn call//not-yet
		| ^(METHOD IDENTIFIER ^(PRM p=expr_list? ^(SEMICOLON lhs_list?)))
		-> method_call_local_sync_tmpl(
		    method={refineMethodName($IDENTIFIER.text)}, 
		    params={$p.st})
		 
		| ^(QUESTION_MARK IDENTIFIER (^(PRM future_value_list=lhs_list?))?)
		-> future_value_get_tmpl(id={$IDENTIFIER.text}, values={future_value_list.lhslist})
		
		| ^(WHILE condition invariant? measure? body)
		| ^(DO body invariant?  measure? condition)
		| ^(IF ^(COND if_cond=expr) ^(THEN if_then=statement) (^(ELSE if_else=statement))?)
		-> if_tmpl(cond={$if_cond.st}, stmt={$if_then.st}, elce={$if_else.st})
		
		| ^(AWAIT e=expr)
		-> await_expr_tmpl(
		      e={$e.st}, 
		      mi_var_name={getMiNameForFutureLabel($e.st.toString())}
		   )   
		        //lastVarName("mi") == null ? "currentProcess" : "mi" + lastVarName("mi")})
		
		| ^(AWAIT local_syn_bounded_call) //not-yet?
		| ^(AWAIT ^(DOT expr ^(METHOD IDENTIFIER/* method id */ syn_method_call_prm)) ) //not-yet?
		| ^(PROVE expr)
		| ^(ASSERT expr)
		| ^(POSIT expr)
		| ^(BEGIN statement)
		| SKIP
		| RELEASE
		  -> release_tmpl()
		
		| BLOCK
	;


non_local_syn_call:
    ^(DOT object=expr  calls+=j_dotnotation+ (^(AS type))?)
    -> method_call_nonlocal_sync_tmpl(object={$object.st}, calls={$calls})
;
j_dotnotation:
    ^(METHOD IDENTIFIER mclsp=syn_method_call_prm)
    -> method_call_nonlocal_sync_single_tmpl(
    method={refineMethodName($IDENTIFIER.text)}, 
    inparams={mclsp.inparams}, outparams={mclsp.outparams})
;

/*lhs_list	: ^(KOMMA lhs_list lhs_list)
		| ^(AT IDENTIFIER type)
		| IDENTIFIER
		| ^(UNDERSCORE ^(AS type))
	;
*/
lhs_list returns [List lhslist = new ArrayList()]	
  : 
    (l=lhs {retval.lhslist.add(l.lhs);})+
	;

lhs	returns [CVariable lhs = new CVariable()]
  : 
    ^(AT IDENTIFIER t=type)
      {retval.lhs.name = $IDENTIFIER.text; retval.lhs.type = t.ctype;}
		| IDENTIFIER 
		  {retval.lhs.name = $IDENTIFIER.text;}
		| ^(UNDERSCORE ^(AS type))
	;

syn_method_call_prm returns [StringTemplate inparams; List outparams = new ArrayList()]	
  : 
    ^(
      PRM inlist=expr_list? ^(SEMICOLON outlist=lhs_list?)
      {retval.inparams = inlist==null?null:inlist.st; retval.outparams = outlist==null?null:outlist.lhslist;}
     )
	;

method_call_bounds	: ^(BOUND_L CLASS_IDENTIFIER (^(BOUND_R CLASS_IDENTIFIER))? ^(PRM expr_list?))
			| ^(BOUND_R CLASS_IDENTIFIER (^(BOUND_L CLASS_IDENTIFIER))? ^(PRM expr_list?))
	;

local_syn_bounded_call	:  ^(BOUND_L CLASS_IDENTIFIER (^(BOUND_R CLASS_IDENTIFIER))? syn_method_call_prm)
			| ^(BOUND_R CLASS_IDENTIFIER (^(BOUND_L CLASS_IDENTIFIER))? syn_method_call_prm)
	;

expr_stmt_method: ^(METHOD expr)
	;

expr_or_new	
  : 
      e=expr 
      -> expr_tmpl(e={$e.st})
		| ^(NEW CLASS_IDENTIFIER plist=parameter_list?)
		  -> new_object_statement_tmpl (cid={$CLASS_IDENTIFIER.text}, plist={$plist.st})
	;

expr_or_new_list: 
      ^(KOMMA f=expr_or_new_list s=expr_or_new_list)
      -> expr_or_new_list_tmpl(e1={$f.st}, e2={$s.st})
		| e=expr_or_new
		  -> expr_or_new_tmpl(e={$e.st})
		| nlsc=non_local_syn_call
		  -> non_local_syn_call_tmpl(st={$nlsc.st})
	;

condition	: ^(COND expr)
	;

body	: ^(BODY statement)
	;

measure		: ^(MEASURE expr ^(BY id_or_op))
	;

invariant	: ^(INV expr)
	;

// expressions =================

expr		
: 
      ^(IN expr expr)
		| ^(EQUIVALENCE expr expr)
		| ^(IMPLICATION expr expr)
		| ^(XOR l=expr r=expr) -> expr_xor_tmpl(left={$l.st}, right={$r.st})
		| ^(OR l=expr r=expr) -> expr_or_tmpl(left={$l.st}, right={$r.st})
		| ^(AND l=expr r=expr) -> expr_and_tmpl(left={$l.st}, right={$r.st})
		| ^(NOT r=expr) -> expr_not_tmpl(right={$r.st})
		| ^(EQUALITY l=expr r=expr) -> expr_eq_tmpl(left={$l.st}, right={$r.st})
		| ^(INEQUALITY l=expr r=expr) -> expr_ne_tmpl(left={$l.st}, right={$r.st})
		| ^(op=comp_op l=expr r=expr) -> expr_cmp_tmpl(op={$op.text}, left={$l.st}, right={$r.st})
		| ^(PROJECTION expr expr)
		| ^(CONCAT expr expr)
		| ^(PREPEND expr expr)
		| ^(APPEND expr expr)
		| ^(PLUS l=expr r=expr) -> expr_plus_tmpl(left={$l.st}, right={$r.st})  
		| ^(MINUS l=expr r=expr?) -> expr_minus_tmpl(left={$l.st}, right={$r.st})
		| ^(MULT l=expr r=expr) -> expr_mult_tmpl(left={$l.st}, right={$r.st})
		| ^(DIV l=expr r=expr) -> expr_div_tmpl(left={$l.st}, right={$r.st})
		| ^(MOD l=expr r=expr) -> expr_mod_tmpl(left={$l.st}, right={$r.st})
		| ^(POW l=expr r=expr) -> expr_pow_tmpl(left={$l.st}, right={$r.st})
		| ^(NUMBER_SIGN r=expr) -> expr_numsgn_tmpl(ns={$NUMBER_SIGN.text}, e={$r.st})
		| ^(METHOD IDENTIFIER ^(PRM expr_list?)) //it is a function call not a method
		| a=atom -> atom_tmpl(a={$a.st})
	;

comp_op 	: LESS_THAN -> comp_op_tmpl(op={"<"})
		| GREATER_THAN -> comp_op_tmpl(op={">"})
		| LESS_OR_EQUAL -> comp_op_tmpl(op={"<="})
		| GREATER_OR_EQUAL -> comp_op_tmpl(op={">="})
	;

atom		: TRUE -> atom_literal_tmpl(literal={"true"})
		| FALSE -> atom_literal_tmpl(literal={"false"})
		| INTEGER -> atom_literal_tmpl(literal={$INTEGER.text})
		| FLOAT -> atom_literal_tmpl(literal={$FLOAT.text})
		| STRING -> atom_literal_tmpl(literal={$STRING.text})
		| IDENTIFIER -> atom_literal_tmpl(literal={$IDENTIFIER.text})
		| ^(QUESTION_MARK IDENTIFIER)
		-> awaiting_future_value_tmpl(id={$IDENTIFIER.text}) 
		
		| ^(AT IDENTIFIER type)
		| THIS -> atom_literal_tmpl(literal={"this"})
		| ^(AS THIS type)
		| CALLER
		| NULL -> atom_literal_tmpl(literal={"null"})
		| NIL -> atom_literal_tmpl(literal={"null"})
		| NOW
		| HISTORY
		| ^(LIST expr_list?)
		| ^(SET_OR_BINDING expr_in_braces)
		| ^(PAREN expr_in_paren?)
//		| ^(IF condition ^(THEN statement) (^(ELSE statement))?)
	;

expr_in_braces	: ^(SET set?)
		| ^(BINDING binding_list)
	;

set		: expr_list
		| ^(VERTICAL ^(COLON IDENTIFIER expr) expr)
	;

binding_list	: ^(KOMMA binding binding_list)
		| binding
	;

binding	: ^(MAPSTO expr expr)
	;


expr_in_paren	:  expr_list
		| ^((FORALL|EXISTS|SOME) var_decl_no_init ^(EXPR expr))
	;


expr_list	: 
      ^(KOMMA f=expr_list s=expr_list)
      -> expr_list_tmpl(e1={$f.st}, e2={$s.st})
		| e=expr
		  -> expr_tmpl(e={$e.st})
	;

type returns [CType ctype;]		
  : 
    ^(TYPE h=type_real)
      {
        retval.ctype = h.ctype;
      }
//    -> type_tmpl(t={$type_real.st})
	;

type_real	returns [CType ctype;]
  :
    CLASS_IDENTIFIER (^(LBRACK l=type_list?))?
      {
        retval.ctype = new CType($CLASS_IDENTIFIER.text);
        if (l != null) retval.ctype.enclosures = l.types;
      } 
//            -> type_real_class_ident(t={type})
		| ^(LIST type_list)
//		| APOSTROPHE IDENTIFIER
		| ^(TYPEVAR IDENTIFIER)
	;

type_list returns[List types = new ArrayList()]	
  : 
    (t=type {retval.types.add(t.ctype);})+
	;

	
// Java

j_import_decl:
  ^(IMP url=j_import_expr) -> j_import_decl_tmpl(url={$url.st})
;

j_import_expr:
  ^(ID jids+=j_identifier*)
  -> j_import_expr_tmpl(jids={$jids})
;
  
j_identifier: 
      (id=IDENTIFIER 
    | cid=CLASS_IDENTIFIER) -> j_identifier_tmpl(id={$id != null ? $id.text : $cid.text}) 
;
