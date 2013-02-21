/*

	Further Developed by:
	   Behrooz Nobakht
	   bnobakht@liacs.nl
	  
	for Cacoj at http://sf.net/projects/cacoj
	
	==========================================
	
	A Creol LL(1) Grammar for ANTLR v3
	
	Copyright (c) 2008 by Maximilian Dylla
	
	email: Maximilian.Dylla {AT} gmail.com

 	This file was originally part of jCreol.
	
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
	VERSION:
	======
	Supported creoltools: 0.0m

	MAIN SOURCE:
	=========
	creoltools/creolc/CreolParser.mly
	
	NOTES:
	=====
	* Kleene star
	+ at least one occurence
	? optional occurence
	| or
	! does not occur in AST
	^ will be parent node in AST
	-> rewriting rule: grammar rule -> AST output
	Lexer tokens consist out of capital letters.
	Nonterminal symbols of the grammar consists out of lower case letters.
	The underscore is used to seperate different words in tokens or non-terminals.
	A xyz_list is considered to be not empty.
	The interpreter of ANTLRWorks 1.2.1 does not display the trees correctly. Use the debugger instead.
	The grammar accepts some combinations of statements which are not valid. For example:
	true.m() . But the grammar creates the correct AST for all programs (I know).
 
*/
grammar Creol;
options {
	k=1; // number of lookahead chars
	output = AST;
}

tokens { //additional tokens used in the rewriting rules
// those can only occur in the AST but not in the parse tree
	PRM; //parameter
	IN_PRM;
	ID; //identifier
	SUPER;
	PRAGMAS;
	ATTRIBUTES;
	METHODS;
	BODY;
	PROGRAM;
	DECL;
	TYPE;
	ID_OR_OP;
	COND;
	LIST;
	SET;
	BINDING;
	EXPR;
	PAREN;
	SET_OR_BINDING;
	TYPEVAR;
	IMP;
	PRIORITIZE;
}

@parser::header {
package nl.cwi.cacoj.creol;
}
@lexer::header {
package nl.cwi.cacoj.creol;
}

@lexer::members{
public void displayRecognitionError(String[] tokenNames,
	RecognitionException e) {
	String hdr = getErrorHeader(e);
	String msg = getErrorMessage(e, tokenNames);
	// Now do something with hdr and msg...
	throw new RuntimeException(hdr+" "+msg);
  }
}
@parser::members{
public void displayRecognitionError(String[] tokenNames,
	RecognitionException e) {
	String hdr = getErrorHeader(e);
	String msg = getErrorMessage(e, tokenNames);
	// Now do something with hdr and msg...
	throw new RuntimeException(hdr+" "+msg);
  }
}


//PARSER =====================
//============================


start	: declaration* -> ^(PROGRAM declaration*)
	;

// declarations

declaration	: j_import_decl | interface_decl | datatype_decl | function_decl | class_decl
	;

class_decl	: CLASS^ class_identifier
	var_decl_no_init_argument?
	super_decl_rw
	pragma_rw
	BEGIN!
	class_attributes
	class_methods
	END!
	;

class_attributes
	: ((attribute SEMICOLON?)*) -> ^(ATTRIBUTES attribute*)
	;

class_identifier
	: CLASS_IDENTIFIER -> ^(ID CLASS_IDENTIFIER)
	;

pragma_rw	: pragma* -> ^(PRAGMAS pragma*)
	;

pragma	: PRAGMA^ CLASS_IDENTIFIER parameter_list? SEMICOLON!?
	;

super_decl_rw
	: super_decl* -> ^(SUPER super_decl*)
	;

super_decl	: (CONTRACTS
	| IMPLEMENTS
	| INHERITS)^
	class_list
	;

class_list	: (class_element (KOMMA class_element)*) -> class_element+
	;

class_element	:CLASS_IDENTIFIER^ parameter_list?
	;

attribute	: VAR^ var_decl_list
	;

class_methods
	:( anon_with_def?
	with_def*)
	-> ^(METHODS anon_with_def? with_def*)
	;

anon_with_def	: method_with_body+ invariant*
	;

with_def	: WITH^ type method_with_body+ invariant*
	;

var_decl_no_init_argument
	: LPAREN var_decl_no_init_list? RPAREN -> ^(PRM var_decl_no_init_list?)
	;

parameter_list	: LPAREN expr_list? RPAREN -> ^(PRM expr_list?)
	;

interface_decl	: INTERFACE^ class_identifier 
	var_decl_no_init_argument?
	interface_super
	pragma_rw
	BEGIN!
	invariant?
	interface_methods
	END!
	;

interface_methods
	: with_decl* -> ^(METHODS with_decl*)
	;

interface_super
	: interface_inherits* -> ^(SUPER interface_inherits*) // is there a difference if we have 2x inherits?
	;

interface_inherits
	: INHERITS^ class_list*
	;

datatype_decl	: DATATYPE^ type from? pragma*
	;

from	: FROM^ type_list?
	;

function_decl	: FUNCTION^ id_or_op var_decl_no_init_argument? COLON! type pragma* function_body
	;

function_body	: DOUBLE_EQUAL
	( expr -> ^(BODY expr)
	|
	extern -> extern
	)
	;

id_or_op	: (IDENTIFIER -> ^(ID IDENTIFIER)
	| operator -> ^(OP operator)
	)
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

with_decl	: WITH^ type method_decl+ invariant*
	;

method_with_body: OP^ method_identifier
	method_param?
	requires?
	ensures?
	pragma*
	method_body
	;

method_identifier
	: IDENTIFIER -> ^(ID IDENTIFIER)
	;

method_body	: DOUBLE_EQUAL
	( priority_decl? decl_statement -> ^(BODY priority_decl? decl_statement)
	|
	extern -> extern
	)
	;

priority_decl
	:	PRIORITY LPAREN expr RPAREN SEMICOLON -> ^(PRIORITIZE expr);

extern	: EXTERNAL^ STRING
	;

method_decl	: (OP^ method_identifier
	method_param?
	requires?
	ensures?
	pragma*)
	;

requires	: REQUIRES^ expr
	;

ensures	: ENSURES^ expr
	;

method_param: (LPAREN
	method_param_in?
	method_param_out?
	RPAREN)
	-> ^(PRM method_param_in? method_param_out?)
	;

method_param_in
	: (IN? var_decl_no_init_list) -> ^(IN_PRM var_decl_no_init_list)
	;

method_param_out
	: (SEMICOLON!? OUT^ var_decl_no_init_list)
	;

var_decl_list	: var_decl (KOMMA var_decl)* -> var_decl+
	;

var_decl	: var_decl_no_init (ASSIGN^ expr_or_new)?
	;

var_decl_no_init: expr COLON type -> ^(DECL expr type)
	;

var_decl_no_init_list
	: var_decl_no_init (KOMMA var_decl_no_init)* -> var_decl_no_init+
	;


// statements ================
start_statement	:	(statement
			| attribute ( SEMICOLON^ decl_statement)?
			)?
	;

decl_statement
	: statement
	| attribute SEMICOLON^ decl_statement
	;
	
statement	: choice_stmt (INTERLEAVE^ statement)?
	;

choice_stmt	: seq_stmt (BOX^ choice_stmt)?
	;

seq_stmt	: basic_stmt (SEMICOLON^ seq_stmt )?
	;

basic_stmt	: small_stmt
	| control_flow_stmt
	| expr_stmt
	;

expr_stmt	: expr 
	((KOMMA^ expr)* ASSIGN^ expr_or_new_list 
	| (EXCLENATION_MARK^ expr /*_stmt_method */))?
	;
/*
expr_stmt_method
	: expr -> ^(METHOD expr)
	;
*/
expr_or_new	: expr
	| NEW^ (CLASS_IDENTIFIER | SCHEMAVAR) parameter_list?
	;

expr_or_new_list
	: expr_or_new (KOMMA^ expr_or_new_list)?
	;

control_flow_stmt
	: while_stmt
	| do_while_stmt
	| if_stmt
	; //if then else end is handled as a expression

while_stmt	: WHILE^ condition invariant? measure? while_body
	;

condition	: expr -> ^(COND expr)
	;

while_body	: DO statement END -> ^(BODY statement)
	;

measure	: MEASURE^ expr measure_by
	;

measure_by	: BY^ id_or_op
	;

invariant	: INV^ expr
	;

do_while_stmt	: DO^ do_while_body invariant?  measure? WHILE! condition
	;

do_while_body
	: statement -> ^(BODY statement)
	;
	
small_stmt	: atomic_stmt
	| block_stmt
	| posit_stmt
	| assert_stmt
	| prove_stmt
	| await_stmt
	| asyn_call_stmt
	;

asyn_call_stmt: EXCLENATION_MARK^ expr //_stmt_method
	;

await_stmt	: AWAIT^ expr
	;

prove_stmt	: PROVE^ expr
	;

assert_stmt	: ASSERT^ expr
	;

posit_stmt	: POSIT^ expr
		;

block_stmt	: BEGIN^ statement END!
	;

atomic_stmt	: SKIP
	| RELEASE
	| BLOCK
	| RETURN
	;

// expressions ===============

expr	:  equivalence_expr (IN^ equivalence_expr)* 
	;

equivalence_expr
	: impl_expr (EQUIVALENCE^ impl_expr)*
	;

impl_expr	: xor_expr (IMPLICATION^ xor_expr)*
	;

xor_expr	: or_expr (XOR^ or_expr)*
	;

or_expr	: and_expr (OR^ and_expr)*
	;

and_expr	: not_expr (AND^ and_expr)?
	;

not_expr	: (NOT^ not_expr)
	| equals_expr
	;

equals_expr	: comp_expr ((EQUALITY|INEQUALITY)^ comp_expr)? //carefull is this a problem?
	;

comp_expr	: projection_expr (comp_op^ projection_expr)? //carefull: is this a problem?
	;

comp_op 	: LESS_THAN
		| GREATER_THAN
		| LESS_OR_EQUAL
		| GREATER_OR_EQUAL
	;

projection_expr	: concat_expr (PROJECTION^ concat_expr)*
	;
	
concat_expr	: prepend_expr (CONCAT^ prepend_expr)*
	;

prepend_expr	: append_expr (PREPEND^ prepend_expr)? //right associative
	;

append_expr	: add_expr (APPEND^ add_expr)*
	;

add_expr	: mult_expr ((PLUS|MINUS)^ mult_expr)*
	;

mult_expr	: power ((MULT | DIV | MOD)^ power)*
	;

power	: factor (POW^ factor)*
	;

//unary operators
factor	: MINUS^ factor //right-associative
	| NUMBER_SIGN^ factor //right associative
	| atom_with_trailer
	;

atom_with_trailer: 
  atom (
		((
		(AT type) -> ^(AT atom type)
		| (DOT method_call)+ (as_type)? -> ^(DOT atom method_call+ as_type?)
		| bounds  -> ^(bounds)
		| arg_list (as_type)? -> ^(METHOD atom arg_list as_type?)
		| (QUESTION_MARK lhs_list_paren? ) -> ^(QUESTION_MARK atom lhs_list_paren?)
		| AS type -> ^(AS atom type)
		) trailer_rest?)
	| -> ^(atom)
	)
	;

method_call	: 
      IDENTIFIER arg_list? -> ^(METHOD IDENTIFIER arg_list?)
		| SCHEMAVAR arg_list -> ^(METHOD SCHEMAVAR arg_list)
		;

atom	: TRUE
	| FALSE
	| INTEGER
	| FLOAT
	| STRING
	| IDENTIFIER
	| THIS
	| CALLER
	| NULL
	| NIL
	| NOW
	| HISTORY
	| LBRACK expr_list? RBRACK -> ^(LIST expr_list?)
	| LBRACES expr_in_braces RBRACES ->^(SET_OR_BINDING expr_in_braces)
	| LPAREN expr_in_paren? RPAREN /* tuple or grouping of expressions */ -> ^(PAREN expr_in_paren?)
//	| IF^ expr if_then if_else? END!
	| SCHEMAVAR
	;
	
if_stmt:
  IF^ condition if_then if_else? END!
  ;

if_then	: THEN^ statement
	;

if_else	: ELSE^ statement
	;

trailer_rest	: (DOT^ (IDENTIFIER | SCHEMAVAR) arg_list (as_type)?)
		| bounds
	;

arg_list	: (LPAREN (expr_list)? arg_output_list? RPAREN) -> ^(PRM expr_list? arg_output_list?)	
;

arg_output_list
	: (SEMICOLON^ lhs_list?)
	;

bounds	: BOUND_L CLASS_IDENTIFIER (BOUND_R CLASS_IDENTIFIER)? arg_list (as_type)? -> ^(BOUND_L CLASS_IDENTIFIER (^(BOUND_R CLASS_IDENTIFIER))? arg_list as_type? )
	| BOUND_R CLASS_IDENTIFIER (BOUND_L CLASS_IDENTIFIER)? arg_list (as_type)? -> ^(BOUND_R CLASS_IDENTIFIER (^(BOUND_L CLASS_IDENTIFIER))? arg_list as_type? )

	; // no ast done

lhs_list_paren	: LPAREN lhs_list? RPAREN -> ^(PRM lhs_list?)
	;

lhs_list: 	lhs (KOMMA lhs)* -> lhs+
	;

lhs	: IDENTIFIER (AT^ type)?
	| UNDERSCORE^ as_type
	| SCHEMAVAR
	;

as_type	: AS^ type
	;

expr_in_paren	:  expr_list
	| (FORALL|EXISTS|SOME)^ var_decl_no_init COLON! expr_in_paren_expr
	;

expr_in_paren_expr
	: expr -> ^(EXPR expr)
	;

expr_list	: (expr (KOMMA^ expr)*)
	;

expr_in_braces	: -> ^(SET) //empty set
	| setmaker -> ^(SET setmaker)
	| VERTICAL binding_list VERTICAL -> ^(BINDING binding_list)
	;

setmaker	: expr (((KOMMA^ expr)*)|(COLON^ expr VERTICAL^ expr)) 
	;

binding_list	: binding (KOMMA^ binding)*
	;

binding	: expr MAPSTO^ expr
	;

type	: type_real
	->
	^(TYPE type_real)
	;

type_real	: CLASS_IDENTIFIER type_list_brackets?
	| type_bracket
	| APOSTROPHE IDENTIFIER -> ^(TYPEVAR IDENTIFIER)
	;

type_bracket	: LBRACK type_list RBRACK -> ^(LIST type_list)
	;

type_list_brackets
	: LBRACK^ type_list? RBRACK!
	;

type_list	: (type (KOMMA type)*) -> type+
	;

//LEXER ========================
//==============================
// All names for tokens consist out of capital letters.
// The keyword 'fragment' indicates that the token cannot be used by its own, but it is part of another token.


//punctuation ==================
//sorted by length

//length 1

APOSTROPHE
	: '`'
	;

DIV	: '/'
	;

MULT	: '*'
	;


NOT	: '~'
	;

EQUALITY: '='
	;

AT	: '@'
	;

XOR	: '^'
	;


MINUS	: '-'
	;


LBRACES	: '{'
	;

RBRACES	: '}'	
	;

LBRACK	: '['
	;

RBRACK	: ']'
	;


LPAREN	: '('
	;

PRIORITY:'priority by';

RPAREN	: ')'
	;

PROJECTION	: '\\'
	;

COLON	: ':'
	;

DOT	: '.'
	;

EXCLENATION_MARK
	: '!'
	;

GREATER_THAN
	: '>'
	;

KOMMA	: ','
	;

LESS_THAN
	: '<'
	;

NUMBER_SIGN
	: '#'
	;

MOD	: '%'
	;

PLUS	: '+'
	;

SEMICOLON
	: ';'
	;

UNDERSCORE
	: '_'
	;

VERTICAL
	: '|'
	;

QUESTION_MARK
	: '?'
	;

//length 2

ASSIGN	: ':='
	;

BOX	: '[]'
	;

POW	: '**'
	;

OR	: '||' | '\\/'
	;

AND	: '&&' | '/\\'
	;

DOUBLE_EQUAL
	: '=='
	;

INEQUALITY
	: '/='
	;

IMPLICATION
	: '=>'
	;

LESS_OR_EQUAL
	: '<='
	;

GREATER_OR_EQUAL
	: '>='
	;

PREPEND	: '-|'
	;

APPEND 	: '|-'
	;

BOUND_R	: ':>'	
	;

BOUND_L	: '<:'
	;

MAPSTO	: '|->'
	;

//length 3

EQUIVALENCE
	: '<=>'
	;

CONCAT	: '|-|'
	;

INTERLEAVE
	: '|||'
	;

//keywords ========================
//sorted alphabetically

AS	: 'as'
	;

ASSERT	: 'assert'
	;

AWAIT	: 'await'
	;

BEGIN	: 'begin'
	;

BY	: 'by'
	;

BLOCK	: 'block'
	;

CALLER	: 'caller'
	;

CASE	: 'case' // currently not used
	;

CLASS	: 'class'
	;

COMPONENT
	: 'component' // currently not used
	;

CONSTANT	: 'constant' // currently not used
	;

CONTRACTS	: 'contracts'
	;

DATATYPE	: 'datatype'
	;

DO	: 'do'
	;

ELSE	: 'else'
	;

END	: 'end'
	;

ENSURES	: 'ensures'
	;

EXCEPTION	: 'exception' // currently not used
	;

EXISTS	: 'exists'
	;

EXPORTS	: 'exports' // currently not used
	;

EXTERNAL	: 'external'
	;

FALSE	: 'false'
	;

FOR	: 'for' // currently not used
	;

FORALL	: 'forall'
	;

FROM	: 'from' // currently not used
	;

FUNCTION	: 'function'
	;

HISTORY	: 'history'
	;

IF	: 'if'
	;

IMPLEMENTS
	: 'implements'
	;

IMPORT:
  'java_import'
  ;

IN	: 'in'
	;

INHERITS: 'inherits'
	;

INTERFACE
	: 'interface'
	;

INV	: 'inv'
	;

IS	: 'is'
	;

MEASURE	: 'measure'
	;

METHOD	: 'method' // currently not used
	;

NEW	: 'new'
	;

NIL	: 'nil'
	;

NOW	: 'now'
	;
	
NULL	: 'null'
	;

OBJECT	: 'object' // currently not used
	;

OF	: 'of'
	;

OP	: 'op'
	;

OUT	: 'out'
	;

POSIT	: 'posit'
	;

PRAGMA	: 'pragma'
	;

PROVE	: 'prove'
	;

PROVIDES: 'provides' // currently not used
	;

RELEASE	: 'release'
	;

REQUIRES: 'requires'
	;

RETURN: 'return'
	;

SIGNAL	: 'signal' // currently not used
	;

SKIP	: 'skip'
	;

SOME	: 'some'
	;

THEN	: 'then'
	;

THIS	: 'this'
	;

THROW	: 'throw' // currently not used
	;

THROWS	: 'throws' // currently not used
	;

TRUE	: 'true'
	;

TRY	: 'try' // currently not used
	;

VAR	: 'var'
	;

VOLATILE: 'volatile' // currently not used
	;

WHEN	: 'when' // currently not used
	;

WHERE	: 'where' // currently not used
	;

WHILE	: 'while'
	;

WITH	: 'with'
	;

//datatypes ================

fragment
LOWER_CASE
	: 'a'..'z'
	;

fragment
UPPER_CASE
	: 'A'..'Z'
	;

fragment
LETTER	
	: LOWER_CASE | UPPER_CASE	
	;

fragment
DIGIT	: '0'..'9'	
	;

STRING	:  '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"'
 	;

fragment
ESCAPE_SEQUENCE
	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	|   UNICODE_ESCAPE
	|   OCTAL_ESCAPE
	;

fragment
OCTAL_ESCAPE
    	:   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    	|   '\\' ('0'..'7') ('0'..'7')
    	|   '\\' ('0'..'7')
    	;

fragment
UNICODE_ESCAPE
    	:   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    	;

fragment
HEX_DIGIT 	: ('0'..'9'|'a'..'f'|'A'..'F') 
	;

IDENTIFIER
	: (UNDERSCORE | LOWER_CASE) (UNDERSCORE | DIGIT | LETTER | APOSTROPHE)*
	;

CLASS_IDENTIFIER
	: UPPER_CASE (UNDERSCORE | DIGIT | LETTER )*
	;
	
INTEGER : DIGIT+
	;

FLOAT	: ('0' | ('1'..'9' DIGIT*)) DOT DIGIT* (('e'|'E') MINUS? '1'..'9' DIGIT*)?
	;

SCHEMAVAR	: '$' IDENTIFIER
	;

// whitespace and comments ================

WS	:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
	;

COMMENT
	:   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;

LINE_COMMENT
	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

// Java

j_import_decl:
  (IMPORT j_import_expr SEMICOLON?) -> ^(IMP j_import_expr);
  
j_import_expr:
  (j_identifier (DOT j_identifier)* SEMICOLON?) -> ^(ID j_identifier*);
  
j_identifier: IDENTIFIER | CLASS_IDENTIFIER;

j_parExpression 
    :   LPAREN j_expression RPAREN
    ;

j_expressionList 
    :   (expr | j_expression)
        (KOMMA (expr | j_expression) )*
    ;

j_expression 
    :   j_primary 
    ;


j_primary 
    :   j_parExpression            
//    |   'this'
//        ('.' IDENTIFIER
//        )*
//        (identifierSuffix
//        )?
    |   j_identifier (DOT j_identifier)* (j_identifierSuffix)?
//    |   'super'
//        superSuffix
//    |   j_literal
//    |   creator
//    |   primitiveType
//        ('[' ']'
//        )*
//        '.' 'class'
//    |   'void' '.' 'class'
    ;
    

j_identifierSuffix 
    :   
//        ('[' ']'
//        )+
//        '.' 'class'
//    |   ('[' expression ']'
//        )+
       j_arguments
//    |   '.' 'class'
//    |   '.' nonWildcardTypeArguments IDENTIFIER arguments
//    |   '.' 'this'
//    |   '.' 'super' arguments
//    |   innerCreator
    ;

j_arguments 
    :   LPAREN (j_expressionList)? RPAREN;



