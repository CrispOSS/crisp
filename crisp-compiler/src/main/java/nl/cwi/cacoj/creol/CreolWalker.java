// $ANTLR 3.2 Sep 23, 2009 14:05:07 nl/cwi/cacoj/creol/CreolWalker.g 2011-08-10 11:52:26

package nl.cwi.cacoj.creol;

import java.util.List;
import java.util.ArrayList;
import nl.cwi.cacoj.creol.lang.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class CreolWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PRM", "IN_PRM", "ID", "SUPER", "PRAGMAS", "ATTRIBUTES", "METHODS", "BODY", "PROGRAM", "DECL", "TYPE", "ID_OR_OP", "COND", "LIST", "SET", "BINDING", "EXPR", "PAREN", "SET_OR_BINDING", "TYPEVAR", "IMP", "PRIORITIZE", "CLASS", "BEGIN", "END", "SEMICOLON", "CLASS_IDENTIFIER", "PRAGMA", "CONTRACTS", "IMPLEMENTS", "INHERITS", "KOMMA", "VAR", "WITH", "LPAREN", "RPAREN", "INTERFACE", "DATATYPE", "FROM", "FUNCTION", "COLON", "DOUBLE_EQUAL", "IDENTIFIER", "IN", "NOT", "EQUIVALENCE", "IMPLICATION", "XOR", "OR", "AND", "EQUALITY", "INEQUALITY", "PROJECTION", "CONCAT", "PREPEND", "APPEND", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "NUMBER_SIGN", "OP", "PRIORITY", "EXTERNAL", "STRING", "REQUIRES", "ENSURES", "OUT", "ASSIGN", "INTERLEAVE", "BOX", "EXCLENATION_MARK", "NEW", "SCHEMAVAR", "WHILE", "DO", "MEASURE", "BY", "INV", "AWAIT", "PROVE", "ASSERT", "POSIT", "SKIP", "RELEASE", "BLOCK", "RETURN", "LESS_THAN", "GREATER_THAN", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "AT", "DOT", "QUESTION_MARK", "AS", "TRUE", "FALSE", "INTEGER", "FLOAT", "THIS", "CALLER", "NULL", "NIL", "NOW", "HISTORY", "LBRACK", "RBRACK", "LBRACES", "RBRACES", "IF", "THEN", "ELSE", "BOUND_L", "BOUND_R", "UNDERSCORE", "FORALL", "EXISTS", "SOME", "VERTICAL", "MAPSTO", "APOSTROPHE", "CASE", "COMPONENT", "CONSTANT", "EXCEPTION", "EXPORTS", "FOR", "IMPORT", "IS", "METHOD", "OBJECT", "OF", "PROVIDES", "SIGNAL", "THROW", "THROWS", "TRY", "VOLATILE", "WHEN", "WHERE", "LOWER_CASE", "UPPER_CASE", "LETTER", "DIGIT", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "OCTAL_ESCAPE", "HEX_DIGIT", "WS", "COMMENT", "LINE_COMMENT"
    };
    public static final int FUNCTION=43;
    public static final int EXTERNAL=69;
    public static final int SCHEMAVAR=79;
    public static final int WHILE=80;
    public static final int LETTER=148;
    public static final int MOD=64;
    public static final int ID_OR_OP=15;
    public static final int CASE=127;
    public static final int PREPEND=58;
    public static final int NEW=78;
    public static final int DO=81;
    public static final int NOW=109;
    public static final int NOT=48;
    public static final int UPPER_CASE=147;
    public static final int EOF=-1;
    public static final int RELEASE=90;
    public static final int AWAIT=85;
    public static final int TYPE=14;
    public static final int HISTORY=110;
    public static final int RPAREN=39;
    public static final int IMPORT=133;
    public static final int POW=65;
    public static final int METHODS=10;
    public static final int INHERITS=34;
    public static final int MAPSTO=125;
    public static final int EXPORTS=131;
    public static final int BEGIN=27;
    public static final int RETURN=92;
    public static final int QUESTION_MARK=99;
    public static final int THIS=105;
    public static final int IMP=24;
    public static final int VAR=36;
    public static final int BODY=11;
    public static final int SUPER=7;
    public static final int APOSTROPHE=126;
    public static final int LBRACES=113;
    public static final int COMMENT=155;
    public static final int EXCEPTION=130;
    public static final int RBRACK=112;
    public static final int CONCAT=57;
    public static final int LINE_COMMENT=156;
    public static final int INV=84;
    public static final int NULL=107;
    public static final int ELSE=117;
    public static final int INEQUALITY=55;
    public static final int OCTAL_ESCAPE=152;
    public static final int THROWS=141;
    public static final int UNDERSCORE=120;
    public static final int SEMICOLON=29;
    public static final int DOUBLE_EQUAL=45;
    public static final int MULT=62;
    public static final int OF=137;
    public static final int LIST=17;
    public static final int ASSERT=87;
    public static final int TRY=142;
    public static final int SKIP=89;
    public static final int EXCLENATION_MARK=77;
    public static final int WS=154;
    public static final int NIL=108;
    public static final int PRIORITY=68;
    public static final int OUT=73;
    public static final int OP=67;
    public static final int OR=52;
    public static final int LESS_THAN=93;
    public static final int CONSTANT=129;
    public static final int DATATYPE=41;
    public static final int MEASURE=82;
    public static final int LOWER_CASE=146;
    public static final int FROM=42;
    public static final int END=28;
    public static final int FALSE=102;
    public static final int THROW=140;
    public static final int EQUALITY=54;
    public static final int WHERE=145;
    public static final int BINDING=19;
    public static final int APPEND=59;
    public static final int CLASS=26;
    public static final int LBRACK=111;
    public static final int ATTRIBUTES=9;
    public static final int BOUND_L=118;
    public static final int GREATER_OR_EQUAL=96;
    public static final int PRAGMA=31;
    public static final int BOUND_R=119;
    public static final int FOR=132;
    public static final int CALLER=106;
    public static final int FLOAT=104;
    public static final int ID=6;
    public static final int AND=53;
    public static final int PRM=4;
    public static final int PAREN=21;
    public static final int LPAREN=38;
    public static final int IF=115;
    public static final int TYPEVAR=23;
    public static final int AT=97;
    public static final int ENSURES=72;
    public static final int AS=100;
    public static final int ESCAPE_SEQUENCE=150;
    public static final int IN_PRM=5;
    public static final int BOX=76;
    public static final int UNICODE_ESCAPE=151;
    public static final int EXPR=20;
    public static final int IN=47;
    public static final int THEN=116;
    public static final int IMPLEMENTS=33;
    public static final int OBJECT=136;
    public static final int CONTRACTS=32;
    public static final int IS=134;
    public static final int IDENTIFIER=46;
    public static final int SOME=123;
    public static final int PRIORITIZE=25;
    public static final int SIGNAL=139;
    public static final int PLUS=60;
    public static final int IMPLICATION=50;
    public static final int EXISTS=122;
    public static final int DIGIT=149;
    public static final int DOT=98;
    public static final int PROVIDES=138;
    public static final int COMPONENT=128;
    public static final int SET_OR_BINDING=22;
    public static final int PRAGMAS=8;
    public static final int WITH=37;
    public static final int INTEGER=103;
    public static final int BY=83;
    public static final int XOR=51;
    public static final int GREATER_THAN=94;
    public static final int VOLATILE=143;
    public static final int LESS_OR_EQUAL=95;
    public static final int PROVE=86;
    public static final int VERTICAL=124;
    public static final int FORALL=121;
    public static final int HEX_DIGIT=153;
    public static final int SET=18;
    public static final int MINUS=61;
    public static final int TRUE=101;
    public static final int COLON=44;
    public static final int INTERLEAVE=75;
    public static final int REQUIRES=71;
    public static final int RBRACES=114;
    public static final int POSIT=88;
    public static final int KOMMA=35;
    public static final int CLASS_IDENTIFIER=30;
    public static final int WHEN=144;
    public static final int DECL=13;
    public static final int BLOCK=91;
    public static final int EQUIVALENCE=49;
    public static final int ASSIGN=74;
    public static final int NUMBER_SIGN=66;
    public static final int PROGRAM=12;
    public static final int INTERFACE=40;
    public static final int DIV=63;
    public static final int PROJECTION=56;
    public static final int COND=16;
    public static final int METHOD=135;
    public static final int STRING=70;

    // delegates
    // delegators


        public CreolWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public CreolWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("CreolWalkerTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return CreolWalker.tokenNames; }
    public String getGrammarFileName() { return "nl/cwi/cacoj/creol/CreolWalker.g"; }


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
      



    public static class start_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "start"
    // nl/cwi/cacoj/creol/CreolWalker.g:126:1: start : ^( PROGRAM (d+= declaration )+ ) -> start_tmpl(decls=$d);
    public final CreolWalker.start_return start() throws RecognitionException {
        CreolWalker.start_return retval = new CreolWalker.start_return();
        retval.start = input.LT(1);

        List list_d=null;
        RuleReturnScope d = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:126:8: ( ^( PROGRAM (d+= declaration )+ ) -> start_tmpl(decls=$d))
            // nl/cwi/cacoj/creol/CreolWalker.g:126:10: ^( PROGRAM (d+= declaration )+ )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_start63); 

            match(input, Token.DOWN, null); 
            // nl/cwi/cacoj/creol/CreolWalker.g:126:21: (d+= declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case IMP:
                case CLASS:
                case INTERFACE:
                case DATATYPE:
                case FUNCTION:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:126:21: d+= declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_start67);
            	    d=declaration();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 126:37: -> start_tmpl(decls=$d)
            {
                retval.st = templateLib.getInstanceOf("start_tmpl",
              new STAttrMap().put("decls", list_d));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // nl/cwi/cacoj/creol/CreolWalker.g:130:1: declaration : (im= j_import_decl -> declaration_tmpl(decl=$im.st) | id= interface_decl -> declaration_tmpl(decl=$id.st) | dd= datatype_decl -> declaration_tmpl(decl=$dd.st) | fd= function_decl -> declaration_tmpl(decl=$fd.st) | cd= class_decl -> declaration_tmpl(decl=$cd.st));
    public final CreolWalker.declaration_return declaration() throws RecognitionException {
        CreolWalker.declaration_return retval = new CreolWalker.declaration_return();
        retval.start = input.LT(1);

        CreolWalker.j_import_decl_return im = null;

        CreolWalker.interface_decl_return id = null;

        CreolWalker.datatype_decl_return dd = null;

        CreolWalker.function_decl_return fd = null;

        CreolWalker.class_decl_return cd = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:130:13: (im= j_import_decl -> declaration_tmpl(decl=$im.st) | id= interface_decl -> declaration_tmpl(decl=$id.st) | dd= datatype_decl -> declaration_tmpl(decl=$dd.st) | fd= function_decl -> declaration_tmpl(decl=$fd.st) | cd= class_decl -> declaration_tmpl(decl=$cd.st))
            int alt2=5;
            switch ( input.LA(1) ) {
            case IMP:
                {
                alt2=1;
                }
                break;
            case INTERFACE:
                {
                alt2=2;
                }
                break;
            case DATATYPE:
                {
                alt2=3;
                }
                break;
            case FUNCTION:
                {
                alt2=4;
                }
                break;
            case CLASS:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:131:14: im= j_import_decl
                    {
                    pushFollow(FOLLOW_j_import_decl_in_declaration106);
                    im=j_import_decl();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 131:31: -> declaration_tmpl(decl=$im.st)
                    {
                        retval.st = templateLib.getInstanceOf("declaration_tmpl",
                      new STAttrMap().put("decl", (im!=null?im.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:132:15: id= interface_decl
                    {
                    pushFollow(FOLLOW_interface_decl_in_declaration133);
                    id=interface_decl();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 132:33: -> declaration_tmpl(decl=$id.st)
                    {
                        retval.st = templateLib.getInstanceOf("declaration_tmpl",
                      new STAttrMap().put("decl", (id!=null?id.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:133:15: dd= datatype_decl
                    {
                    pushFollow(FOLLOW_datatype_decl_in_declaration160);
                    dd=datatype_decl();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 133:32: -> declaration_tmpl(decl=$dd.st)
                    {
                        retval.st = templateLib.getInstanceOf("declaration_tmpl",
                      new STAttrMap().put("decl", (dd!=null?dd.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:134:15: fd= function_decl
                    {
                    pushFollow(FOLLOW_function_decl_in_declaration187);
                    fd=function_decl();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 134:32: -> declaration_tmpl(decl=$fd.st)
                    {
                        retval.st = templateLib.getInstanceOf("declaration_tmpl",
                      new STAttrMap().put("decl", (fd!=null?fd.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:135:15: cd= class_decl
                    {
                    pushFollow(FOLLOW_class_decl_in_declaration214);
                    cd=class_decl();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 135:29: -> declaration_tmpl(decl=$cd.st)
                    {
                        retval.st = templateLib.getInstanceOf("declaration_tmpl",
                      new STAttrMap().put("decl", (cd!=null?cd.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class class_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "class_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:138:1: class_decl : ^( CLASS ^( ID CLASS_IDENTIFIER ) ( ^( PRM (initatts= var_decl_no_init_list )? ) )? ^( SUPER (sd+= super_decl )* ) ^( PRAGMAS ( pragma )* ) ^( ATTRIBUTES (at+= attribute )* ) ^( METHODS (awf= anon_with_def )? (wf+= with_def )* ) ) -> class_decl_tmpl(cid=$CLASS_IDENTIFIER.textsupers=$sdattribs=$atinitatts=initatts == null ? null : initatts.varswith_methods=$wfanon_methods=$awf.sthas_init=getCurrentContext().hasInitMethod()context=getCurrentContext());
    public final CreolWalker.class_decl_return class_decl() throws RecognitionException {
        CreolWalker.class_decl_return retval = new CreolWalker.class_decl_return();
        retval.start = input.LT(1);

        CommonTree CLASS_IDENTIFIER1=null;
        List list_sd=null;
        List list_at=null;
        List list_wf=null;
        CreolWalker.var_decl_no_init_list_return initatts = null;

        CreolWalker.anon_with_def_return awf = null;

        RuleReturnScope sd = null;
        RuleReturnScope at = null;
        RuleReturnScope wf = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:139:3: ( ^( CLASS ^( ID CLASS_IDENTIFIER ) ( ^( PRM (initatts= var_decl_no_init_list )? ) )? ^( SUPER (sd+= super_decl )* ) ^( PRAGMAS ( pragma )* ) ^( ATTRIBUTES (at+= attribute )* ) ^( METHODS (awf= anon_with_def )? (wf+= with_def )* ) ) -> class_decl_tmpl(cid=$CLASS_IDENTIFIER.textsupers=$sdattribs=$atinitatts=initatts == null ? null : initatts.varswith_methods=$wfanon_methods=$awf.sthas_init=getCurrentContext().hasInitMethod()context=getCurrentContext()))
            // nl/cwi/cacoj/creol/CreolWalker.g:140:5: ^( CLASS ^( ID CLASS_IDENTIFIER ) ( ^( PRM (initatts= var_decl_no_init_list )? ) )? ^( SUPER (sd+= super_decl )* ) ^( PRAGMAS ( pragma )* ) ^( ATTRIBUTES (at+= attribute )* ) ^( METHODS (awf= anon_with_def )? (wf+= with_def )* ) )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl245); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_class_decl252); 

            match(input, Token.DOWN, null); 
            CLASS_IDENTIFIER1=(CommonTree)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_class_decl254); 
            setCurrentContext((CLASS_IDENTIFIER1!=null?CLASS_IDENTIFIER1.getText():null));

            match(input, Token.UP, null); 
            // nl/cwi/cacoj/creol/CreolWalker.g:142:4: ( ^( PRM (initatts= var_decl_no_init_list )? ) )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case PRM:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:142:5: ^( PRM (initatts= var_decl_no_init_list )? )
                    {
                    match(input,PRM,FOLLOW_PRM_in_class_decl264); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:142:19: (initatts= var_decl_no_init_list )?
                        int alt3=2;
                        switch ( input.LA(1) ) {
                            case DECL:
                                {
                                alt3=1;
                                }
                                break;
                        }

                        switch (alt3) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:142:19: initatts= var_decl_no_init_list
                                {
                                pushFollow(FOLLOW_var_decl_no_init_list_in_class_decl268);
                                initatts=var_decl_no_init_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }

            match(input,SUPER,FOLLOW_SUPER_in_class_decl279); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:143:15: (sd+= super_decl )*
                loop5:
                do {
                    int alt5=2;
                    switch ( input.LA(1) ) {
                    case CONTRACTS:
                    case IMPLEMENTS:
                    case INHERITS:
                        {
                        alt5=1;
                        }
                        break;

                    }

                    switch (alt5) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:143:15: sd+= super_decl
                	    {
                	    pushFollow(FOLLOW_super_decl_in_class_decl283);
                	    sd=super_decl();

                	    state._fsp--;

                	    if (list_sd==null) list_sd=new ArrayList();
                	    list_sd.add(sd.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,PRAGMAS,FOLLOW_PRAGMAS_in_class_decl291); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:144:14: ( pragma )*
                loop6:
                do {
                    int alt6=2;
                    switch ( input.LA(1) ) {
                    case PRAGMA:
                        {
                        alt6=1;
                        }
                        break;

                    }

                    switch (alt6) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:144:14: pragma
                	    {
                	    pushFollow(FOLLOW_pragma_in_class_decl293);
                	    pragma();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_class_decl301); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:145:19: (at+= attribute )*
                loop7:
                do {
                    int alt7=2;
                    switch ( input.LA(1) ) {
                    case VAR:
                        {
                        alt7=1;
                        }
                        break;

                    }

                    switch (alt7) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:145:19: at+= attribute
                	    {
                	    pushFollow(FOLLOW_attribute_in_class_decl305);
                	    at=attribute();

                	    state._fsp--;

                	    if (list_at==null) list_at=new ArrayList();
                	    list_at.add(at.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,METHODS,FOLLOW_METHODS_in_class_decl313); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:146:17: (awf= anon_with_def )?
                int alt8=2;
                switch ( input.LA(1) ) {
                    case OP:
                        {
                        alt8=1;
                        }
                        break;
                }

                switch (alt8) {
                    case 1 :
                        // nl/cwi/cacoj/creol/CreolWalker.g:146:17: awf= anon_with_def
                        {
                        pushFollow(FOLLOW_anon_with_def_in_class_decl317);
                        awf=anon_with_def();

                        state._fsp--;


                        }
                        break;

                }

                // nl/cwi/cacoj/creol/CreolWalker.g:146:35: (wf+= with_def )*
                loop9:
                do {
                    int alt9=2;
                    switch ( input.LA(1) ) {
                    case WITH:
                        {
                        alt9=1;
                        }
                        break;

                    }

                    switch (alt9) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:146:35: wf+= with_def
                	    {
                	    pushFollow(FOLLOW_with_def_in_class_decl322);
                	    wf=with_def();

                	    state._fsp--;

                	    if (list_wf==null) list_wf=new ArrayList();
                	    list_wf.add(wf.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 147:7: -> class_decl_tmpl(cid=$CLASS_IDENTIFIER.textsupers=$sdattribs=$atinitatts=initatts == null ? null : initatts.varswith_methods=$wfanon_methods=$awf.sthas_init=getCurrentContext().hasInitMethod()context=getCurrentContext())
            {
                retval.st = templateLib.getInstanceOf("class_decl_tmpl",
              new STAttrMap().put("cid", (CLASS_IDENTIFIER1!=null?CLASS_IDENTIFIER1.getText():null)).put("supers", list_sd).put("attribs", list_at).put("initatts", initatts == null ? null : initatts.vars).put("with_methods", list_wf).put("anon_methods", (awf!=null?awf.st:null)).put("has_init", getCurrentContext().hasInitMethod()).put("context", getCurrentContext()));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class super_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "super_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:157:1: super_decl : ( ^( CONTRACTS class_list ) | ^( IMPLEMENTS cl= class_list ) -> implements_tmpl(clist=$cl.st) | ^( INHERITS class_list ) );
    public final CreolWalker.super_decl_return super_decl() throws RecognitionException {
        CreolWalker.super_decl_return retval = new CreolWalker.super_decl_return();
        retval.start = input.LT(1);

        CreolWalker.class_list_return cl = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:157:12: ( ^( CONTRACTS class_list ) | ^( IMPLEMENTS cl= class_list ) -> implements_tmpl(clist=$cl.st) | ^( INHERITS class_list ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case CONTRACTS:
                {
                alt10=1;
                }
                break;
            case IMPLEMENTS:
                {
                alt10=2;
                }
                break;
            case INHERITS:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:157:14: ^( CONTRACTS class_list )
                    {
                    match(input,CONTRACTS,FOLLOW_CONTRACTS_in_super_decl548); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_class_list_in_super_decl550);
                    class_list();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:158:5: ^( IMPLEMENTS cl= class_list )
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_super_decl558); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_class_list_in_super_decl562);
                    cl=class_list();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 158:33: -> implements_tmpl(clist=$cl.st)
                    {
                        retval.st = templateLib.getInstanceOf("implements_tmpl",
                      new STAttrMap().put("clist", (cl!=null?cl.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:159:5: ^( INHERITS class_list )
                    {
                    match(input,INHERITS,FOLLOW_INHERITS_in_super_decl579); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_class_list_in_super_decl581);
                    class_list();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "super_decl"

    public static class class_list_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "class_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:162:1: class_list : (celems+= class_element )+ -> class_list_tmpl(celems=$celems);
    public final CreolWalker.class_list_return class_list() throws RecognitionException {
        CreolWalker.class_list_return retval = new CreolWalker.class_list_return();
        retval.start = input.LT(1);

        List list_celems=null;
        RuleReturnScope celems = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:162:12: ( (celems+= class_element )+ -> class_list_tmpl(celems=$celems))
            // nl/cwi/cacoj/creol/CreolWalker.g:162:14: (celems+= class_element )+
            {
            // nl/cwi/cacoj/creol/CreolWalker.g:162:21: (celems+= class_element )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case CLASS_IDENTIFIER:
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:162:21: celems+= class_element
            	    {
            	    pushFollow(FOLLOW_class_element_in_class_list596);
            	    celems=class_element();

            	    state._fsp--;

            	    if (list_celems==null) list_celems=new ArrayList();
            	    list_celems.add(celems.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);



            // TEMPLATE REWRITE
            // 163:15: -> class_list_tmpl(celems=$celems)
            {
                retval.st = templateLib.getInstanceOf("class_list_tmpl",
              new STAttrMap().put("celems", list_celems));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_list"

    public static class class_element_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "class_element"
    // nl/cwi/cacoj/creol/CreolWalker.g:166:1: class_element : ^( CLASS_IDENTIFIER ( parameter_list )? ) -> class_element_tmpl(ce=$CLASS_IDENTIFIER.text);
    public final CreolWalker.class_element_return class_element() throws RecognitionException {
        CreolWalker.class_element_return retval = new CreolWalker.class_element_return();
        retval.start = input.LT(1);

        CommonTree CLASS_IDENTIFIER2=null;

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:166:15: ( ^( CLASS_IDENTIFIER ( parameter_list )? ) -> class_element_tmpl(ce=$CLASS_IDENTIFIER.text))
            // nl/cwi/cacoj/creol/CreolWalker.g:166:17: ^( CLASS_IDENTIFIER ( parameter_list )? )
            {
            CLASS_IDENTIFIER2=(CommonTree)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_class_element631); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:166:36: ( parameter_list )?
                int alt12=2;
                switch ( input.LA(1) ) {
                    case PRM:
                        {
                        alt12=1;
                        }
                        break;
                }

                switch (alt12) {
                    case 1 :
                        // nl/cwi/cacoj/creol/CreolWalker.g:166:36: parameter_list
                        {
                        pushFollow(FOLLOW_parameter_list_in_class_element633);
                        parameter_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 167:17: -> class_element_tmpl(ce=$CLASS_IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("class_element_tmpl",
              new STAttrMap().put("ce", (CLASS_IDENTIFIER2!=null?CLASS_IDENTIFIER2.getText():null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_element"

    public static class pragma_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pragma"
    // nl/cwi/cacoj/creol/CreolWalker.g:170:1: pragma : ^( PRAGMA CLASS_IDENTIFIER ( parameter_list )? ) ;
    public final CreolWalker.pragma_return pragma() throws RecognitionException {
        CreolWalker.pragma_return retval = new CreolWalker.pragma_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:170:9: ( ^( PRAGMA CLASS_IDENTIFIER ( parameter_list )? ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:170:11: ^( PRAGMA CLASS_IDENTIFIER ( parameter_list )? )
            {
            match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma673); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_pragma675); 
            // nl/cwi/cacoj/creol/CreolWalker.g:170:37: ( parameter_list )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case PRM:
                    {
                    alt13=1;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:170:37: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_pragma677);
                    parameter_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma"

    public static class attribute_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "attribute"
    // nl/cwi/cacoj/creol/CreolWalker.g:173:1: attribute : ^( VAR attlist= var_decl_list ) -> attribute_list_tmpl(attlist=$attlist.st);
    public final CreolWalker.attribute_return attribute() throws RecognitionException {
        CreolWalker.attribute_return retval = new CreolWalker.attribute_return();
        retval.start = input.LT(1);

        CreolWalker.var_decl_list_return attlist = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:173:11: ( ^( VAR attlist= var_decl_list ) -> attribute_list_tmpl(attlist=$attlist.st))
            // nl/cwi/cacoj/creol/CreolWalker.g:173:13: ^( VAR attlist= var_decl_list )
            {
            match(input,VAR,FOLLOW_VAR_in_attribute690); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_var_decl_list_in_attribute694);
            attlist=var_decl_list();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 174:13: -> attribute_list_tmpl(attlist=$attlist.st)
            {
                retval.st = templateLib.getInstanceOf("attribute_list_tmpl",
              new STAttrMap().put("attlist", (attlist!=null?attlist.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class var_decl_no_init_return extends TreeRuleReturnScope {
        public CVariable var;;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_decl_no_init"
    // nl/cwi/cacoj/creol/CreolWalker.g:177:1: var_decl_no_init returns [CVariable var;] : ^( DECL IDENTIFIER t= type ) ;
    public final CreolWalker.var_decl_no_init_return var_decl_no_init() throws RecognitionException {
        CreolWalker.var_decl_no_init_return retval = new CreolWalker.var_decl_no_init_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER3=null;
        CreolWalker.type_return t = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:178:3: ( ^( DECL IDENTIFIER t= type ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:179:5: ^( DECL IDENTIFIER t= type )
            {
            match(input,DECL,FOLLOW_DECL_in_var_decl_no_init738); 

            match(input, Token.DOWN, null); 
            IDENTIFIER3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_decl_no_init740); 
            pushFollow(FOLLOW_type_in_var_decl_no_init744);
            t=type();

            state._fsp--;


            match(input, Token.UP, null); 
            retval.var = new CVariable((IDENTIFIER3!=null?IDENTIFIER3.getText():null), t.ctype);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl_no_init"

    public static class var_decl_no_init_list_return extends TreeRuleReturnScope {
        public List vars = new ArrayList();;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_decl_no_init_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:192:1: var_decl_no_init_list returns [List vars = new ArrayList();] : (vdlist= var_decl_no_init )+ ;
    public final CreolWalker.var_decl_no_init_list_return var_decl_no_init_list() throws RecognitionException {
        CreolWalker.var_decl_no_init_list_return retval = new CreolWalker.var_decl_no_init_list_return();
        retval.start = input.LT(1);

        CreolWalker.var_decl_no_init_return vdlist = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:193:3: ( (vdlist= var_decl_no_init )+ )
            // nl/cwi/cacoj/creol/CreolWalker.g:194:5: (vdlist= var_decl_no_init )+
            {
            retval.vars = new ArrayList();
            // nl/cwi/cacoj/creol/CreolWalker.g:195:5: (vdlist= var_decl_no_init )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case DECL:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:195:6: vdlist= var_decl_no_init
            	    {
            	    pushFollow(FOLLOW_var_decl_no_init_in_var_decl_no_init_list796);
            	    vdlist=var_decl_no_init();

            	    state._fsp--;

            	    retval.vars.add(((var_decl_no_init_return)vdlist).var);

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl_no_init_list"

    public static class var_decl_list_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_decl_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:201:1: var_decl_list : (vd+= var_decl )+ -> var_decl_list_tmpl(vdlist=$vd);
    public final CreolWalker.var_decl_list_return var_decl_list() throws RecognitionException {
        CreolWalker.var_decl_list_return retval = new CreolWalker.var_decl_list_return();
        retval.start = input.LT(1);

        List list_vd=null;
        RuleReturnScope vd = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:202:3: ( (vd+= var_decl )+ -> var_decl_list_tmpl(vdlist=$vd))
            // nl/cwi/cacoj/creol/CreolWalker.g:203:5: (vd+= var_decl )+
            {
            // nl/cwi/cacoj/creol/CreolWalker.g:203:8: (vd+= var_decl )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case DECL:
                case ASSIGN:
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:203:8: vd+= var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_var_decl_list835);
            	    vd=var_decl();

            	    state._fsp--;

            	    if (list_vd==null) list_vd=new ArrayList();
            	    list_vd.add(vd.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);



            // TEMPLATE REWRITE
            // 204:7: -> var_decl_list_tmpl(vdlist=$vd)
            {
                retval.st = templateLib.getInstanceOf("var_decl_list_tmpl",
              new STAttrMap().put("vdlist", list_vd));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl_list"

    public static class var_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:207:1: var_decl : (vd= var_decl_no_init -> var_decl_single_tmpl(v=vd.var) | ^( ASSIGN vd= var_decl_no_init value= expr_or_new ) -> var_decl_single_tmpl(v=vd.varvalue=$value.st));
    public final CreolWalker.var_decl_return var_decl() throws RecognitionException {
        CreolWalker.var_decl_return retval = new CreolWalker.var_decl_return();
        retval.start = input.LT(1);

        CreolWalker.var_decl_no_init_return vd = null;

        CreolWalker.expr_or_new_return value = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:208:3: (vd= var_decl_no_init -> var_decl_single_tmpl(v=vd.var) | ^( ASSIGN vd= var_decl_no_init value= expr_or_new ) -> var_decl_single_tmpl(v=vd.varvalue=$value.st))
            int alt16=2;
            switch ( input.LA(1) ) {
            case DECL:
                {
                alt16=1;
                }
                break;
            case ASSIGN:
                {
                alt16=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:209:5: vd= var_decl_no_init
                    {
                    pushFollow(FOLLOW_var_decl_no_init_in_var_decl872);
                    vd=var_decl_no_init();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 210:8: -> var_decl_single_tmpl(v=vd.var)
                    {
                        retval.st = templateLib.getInstanceOf("var_decl_single_tmpl",
                      new STAttrMap().put("v", vd.var));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:211:5: ^( ASSIGN vd= var_decl_no_init value= expr_or_new )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_var_decl896); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_var_decl_no_init_in_var_decl900);
                    vd=var_decl_no_init();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_or_new_in_var_decl904);
                    value=expr_or_new();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 212:6: -> var_decl_single_tmpl(v=vd.varvalue=$value.st)
                    {
                        retval.st = templateLib.getInstanceOf("var_decl_single_tmpl",
                      new STAttrMap().put("v", vd.var).put("value", (value!=null?value.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl"

    public static class anon_with_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "anon_with_def"
    // nl/cwi/cacoj/creol/CreolWalker.g:215:1: anon_with_def : (m+= method_with_body )+ ( invariant )* -> anon_with_def_tmpl(methods=$m);
    public final CreolWalker.anon_with_def_return anon_with_def() throws RecognitionException {
        CreolWalker.anon_with_def_return retval = new CreolWalker.anon_with_def_return();
        retval.start = input.LT(1);

        List list_m=null;
        RuleReturnScope m = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:215:15: ( (m+= method_with_body )+ ( invariant )* -> anon_with_def_tmpl(methods=$m))
            // nl/cwi/cacoj/creol/CreolWalker.g:216:9: (m+= method_with_body )+ ( invariant )*
            {
            // nl/cwi/cacoj/creol/CreolWalker.g:216:10: (m+= method_with_body )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case OP:
                    {
                    alt17=1;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:216:10: m+= method_with_body
            	    {
            	    pushFollow(FOLLOW_method_with_body_in_anon_with_def945);
            	    m=method_with_body();

            	    state._fsp--;

            	    if (list_m==null) list_m=new ArrayList();
            	    list_m.add(m.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // nl/cwi/cacoj/creol/CreolWalker.g:216:30: ( invariant )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case INV:
                    {
                    alt18=1;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:216:30: invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_anon_with_def948);
            	    invariant();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 217:9: -> anon_with_def_tmpl(methods=$m)
            {
                retval.st = templateLib.getInstanceOf("anon_with_def_tmpl",
              new STAttrMap().put("methods", list_m));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "anon_with_def"

    public static class with_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "with_def"
    // nl/cwi/cacoj/creol/CreolWalker.g:220:1: with_def : ^( WITH wt= type (mwb+= method_with_body )+ ( invariant )* ) -> with_def_tmpl(with_type=$wt.stmethods=$mwb);
    public final CreolWalker.with_def_return with_def() throws RecognitionException {
        CreolWalker.with_def_return retval = new CreolWalker.with_def_return();
        retval.start = input.LT(1);

        List list_mwb=null;
        CreolWalker.type_return wt = null;

        RuleReturnScope mwb = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:220:10: ( ^( WITH wt= type (mwb+= method_with_body )+ ( invariant )* ) -> with_def_tmpl(with_type=$wt.stmethods=$mwb))
            // nl/cwi/cacoj/creol/CreolWalker.g:220:12: ^( WITH wt= type (mwb+= method_with_body )+ ( invariant )* )
            {
            match(input,WITH,FOLLOW_WITH_in_with_def977); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_with_def981);
            wt=type();

            state._fsp--;

            // nl/cwi/cacoj/creol/CreolWalker.g:220:30: (mwb+= method_with_body )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case OP:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:220:30: mwb+= method_with_body
            	    {
            	    pushFollow(FOLLOW_method_with_body_in_with_def985);
            	    mwb=method_with_body();

            	    state._fsp--;

            	    if (list_mwb==null) list_mwb=new ArrayList();
            	    list_mwb.add(mwb.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // nl/cwi/cacoj/creol/CreolWalker.g:220:50: ( invariant )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case INV:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:220:50: invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_with_def988);
            	    invariant();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 221:13: -> with_def_tmpl(with_type=$wt.stmethods=$mwb)
            {
                retval.st = templateLib.getInstanceOf("with_def_tmpl",
              new STAttrMap().put("with_type", (wt!=null?wt.st:null)).put("methods", list_mwb));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_def"

    public static class method_with_body_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "method_with_body"
    // nl/cwi/cacoj/creol/CreolWalker.g:224:1: method_with_body : ^( OP ^( ID IDENTIFIER ) ( ^( PRM (inp= method_param_in )? (outp= method_param_out )? ) )? ( ^( REQUIRES expr ) )? ( ^( ENSURES expr ) )? ( pragma )* ( ^( BODY (pr= priority_decl )? b= decl_statement ) | ^( EXTERNAL STRING ) ) ) -> method_with_body_tmpl(m=mthstats=$b.stpriority=$pr.st);
    public final CreolWalker.method_with_body_return method_with_body() throws RecognitionException {
        CreolWalker.method_with_body_return retval = new CreolWalker.method_with_body_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER4=null;
        CreolWalker.method_param_in_return inp = null;

        CreolWalker.method_param_out_return outp = null;

        CreolWalker.priority_decl_return pr = null;

        CreolWalker.decl_statement_return b = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:225:1: ( ^( OP ^( ID IDENTIFIER ) ( ^( PRM (inp= method_param_in )? (outp= method_param_out )? ) )? ( ^( REQUIRES expr ) )? ( ^( ENSURES expr ) )? ( pragma )* ( ^( BODY (pr= priority_decl )? b= decl_statement ) | ^( EXTERNAL STRING ) ) ) -> method_with_body_tmpl(m=mthstats=$b.stpriority=$pr.st))
            // nl/cwi/cacoj/creol/CreolWalker.g:226:5: ^( OP ^( ID IDENTIFIER ) ( ^( PRM (inp= method_param_in )? (outp= method_param_out )? ) )? ( ^( REQUIRES expr ) )? ( ^( ENSURES expr ) )? ( pragma )* ( ^( BODY (pr= priority_decl )? b= decl_statement ) | ^( EXTERNAL STRING ) ) )
            {
            CMethod mth;
            match(input,OP,FOLLOW_OP_in_method_with_body1039); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_method_with_body1048); 

            match(input, Token.DOWN, null); 
            IDENTIFIER4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_method_with_body1050); 

            match(input, Token.UP, null); 

            		     mth = new CMethod(); 
            		     mth.name=(IDENTIFIER4!=null?IDENTIFIER4.getText():null);
            		     setCurrentMethodContext((IDENTIFIER4!=null?IDENTIFIER4.getText():null));
            		    
            // nl/cwi/cacoj/creol/CreolWalker.g:234:4: ( ^( PRM (inp= method_param_in )? (outp= method_param_out )? ) )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case PRM:
                    {
                    alt23=1;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:234:5: ^( PRM (inp= method_param_in )? (outp= method_param_out )? )
                    {
                    match(input,PRM,FOLLOW_PRM_in_method_with_body1067); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:234:14: (inp= method_param_in )?
                        int alt21=2;
                        switch ( input.LA(1) ) {
                            case IN_PRM:
                                {
                                alt21=1;
                                }
                                break;
                        }

                        switch (alt21) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:234:14: inp= method_param_in
                                {
                                pushFollow(FOLLOW_method_param_in_in_method_with_body1071);
                                inp=method_param_in();

                                state._fsp--;


                                }
                                break;

                        }

                        // nl/cwi/cacoj/creol/CreolWalker.g:234:36: (outp= method_param_out )?
                        int alt22=2;
                        switch ( input.LA(1) ) {
                            case OUT:
                                {
                                alt22=1;
                                }
                                break;
                        }

                        switch (alt22) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:234:36: outp= method_param_out
                                {
                                pushFollow(FOLLOW_method_param_out_in_method_with_body1076);
                                outp=method_param_out();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }


            				mth.inparams = inp != null ? inp.inparams : null;
            				mth.outparams = outp != null ? outp.outparams : null;
            				
            // nl/cwi/cacoj/creol/CreolWalker.g:239:4: ( ^( REQUIRES expr ) )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case REQUIRES:
                    {
                    alt24=1;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:239:5: ^( REQUIRES expr )
                    {
                    match(input,REQUIRES,FOLLOW_REQUIRES_in_method_with_body1093); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_method_with_body1095);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/CreolWalker.g:240:4: ( ^( ENSURES expr ) )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case ENSURES:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:240:5: ^( ENSURES expr )
                    {
                    match(input,ENSURES,FOLLOW_ENSURES_in_method_with_body1105); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_method_with_body1107);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/CreolWalker.g:241:4: ( pragma )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case PRAGMA:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:241:4: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_method_with_body1115);
            	    pragma();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // nl/cwi/cacoj/creol/CreolWalker.g:242:4: ( ^( BODY (pr= priority_decl )? b= decl_statement ) | ^( EXTERNAL STRING ) )
            int alt28=2;
            switch ( input.LA(1) ) {
            case BODY:
                {
                alt28=1;
                }
                break;
            case EXTERNAL:
                {
                alt28=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:242:5: ^( BODY (pr= priority_decl )? b= decl_statement )
                    {
                    match(input,BODY,FOLLOW_BODY_in_method_with_body1123); 

                    match(input, Token.DOWN, null); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:242:14: (pr= priority_decl )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case PRIORITIZE:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:242:14: pr= priority_decl
                            {
                            pushFollow(FOLLOW_priority_decl_in_method_with_body1127);
                            pr=priority_decl();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_decl_statement_in_method_with_body1132);
                    b=decl_statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:242:50: ^( EXTERNAL STRING )
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_method_with_body1138); 

                    match(input, Token.DOWN, null); 
                    match(input,STRING,FOLLOW_STRING_in_method_with_body1140); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }


            			 if (pr != null) {
            			   mth.priorityExpression = pr.st.toString();
            			   addMethodLevelPriority(mth);
            			 }
            			

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 250:5: -> method_with_body_tmpl(m=mthstats=$b.stpriority=$pr.st)
            {
                retval.st = templateLib.getInstanceOf("method_with_body_tmpl",
              new STAttrMap().put("m", mth).put("stats", (b!=null?b.st:null)).put("priority", (pr!=null?pr.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_with_body"

    public static class priority_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "priority_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:257:1: priority_decl : ^( PRIORITIZE e= expr ) -> method_level_priority_tmpl(expr=$e.st);
    public final CreolWalker.priority_decl_return priority_decl() throws RecognitionException {
        CreolWalker.priority_decl_return retval = new CreolWalker.priority_decl_return();
        retval.start = input.LT(1);

        CreolWalker.expr_return e = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:258:3: ( ^( PRIORITIZE e= expr ) -> method_level_priority_tmpl(expr=$e.st))
            // nl/cwi/cacoj/creol/CreolWalker.g:259:3: ^( PRIORITIZE e= expr )
            {
            match(input,PRIORITIZE,FOLLOW_PRIORITIZE_in_priority_decl1195); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_priority_decl1199);
            e=expr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 260:3: -> method_level_priority_tmpl(expr=$e.st)
            {
                retval.st = templateLib.getInstanceOf("method_level_priority_tmpl",
              new STAttrMap().put("expr", (e!=null?e.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "priority_decl"

    public static class method_param_in_return extends TreeRuleReturnScope {
        public List inparams;;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "method_param_in"
    // nl/cwi/cacoj/creol/CreolWalker.g:263:1: method_param_in returns [List inparams;] : ^( IN_PRM pdl= var_decl_no_init_list ) ;
    public final CreolWalker.method_param_in_return method_param_in() throws RecognitionException {
        CreolWalker.method_param_in_return retval = new CreolWalker.method_param_in_return();
        retval.start = input.LT(1);

        CreolWalker.var_decl_no_init_list_return pdl = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:264:3: ( ^( IN_PRM pdl= var_decl_no_init_list ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:265:5: ^( IN_PRM pdl= var_decl_no_init_list )
            {
            retval.inparams = new ArrayList();
            match(input,IN_PRM,FOLLOW_IN_PRM_in_method_param_in1240); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_var_decl_no_init_list_in_method_param_in1244);
            pdl=var_decl_no_init_list();

            state._fsp--;


            match(input, Token.UP, null); 
            retval.inparams.addAll(pdl.vars);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_param_in"

    public static class method_param_out_return extends TreeRuleReturnScope {
        public List outparams;;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "method_param_out"
    // nl/cwi/cacoj/creol/CreolWalker.g:271:1: method_param_out returns [List outparams;] : ^( OUT pdl= var_decl_no_init_list ) ;
    public final CreolWalker.method_param_out_return method_param_out() throws RecognitionException {
        CreolWalker.method_param_out_return retval = new CreolWalker.method_param_out_return();
        retval.start = input.LT(1);

        CreolWalker.var_decl_no_init_list_return pdl = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:272:3: ( ^( OUT pdl= var_decl_no_init_list ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:273:5: ^( OUT pdl= var_decl_no_init_list )
            {
            retval.outparams = new ArrayList();
            match(input,OUT,FOLLOW_OUT_in_method_param_out1280); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_var_decl_no_init_list_in_method_param_out1284);
            pdl=var_decl_no_init_list();

            state._fsp--;


            match(input, Token.UP, null); 
            retval.outparams.addAll(pdl.vars);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_param_out"

    public static class id_or_op_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_or_op"
    // nl/cwi/cacoj/creol/CreolWalker.g:279:1: id_or_op : ( ^( ID IDENTIFIER ) | ^( OP operator ) );
    public final CreolWalker.id_or_op_return id_or_op() throws RecognitionException {
        CreolWalker.id_or_op_return retval = new CreolWalker.id_or_op_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:279:10: ( ^( ID IDENTIFIER ) | ^( OP operator ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt29=1;
                }
                break;
            case OP:
                {
                alt29=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:279:12: ^( ID IDENTIFIER )
                    {
                    match(input,ID,FOLLOW_ID_in_id_or_op1305); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id_or_op1307); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:280:5: ^( OP operator )
                    {
                    match(input,OP,FOLLOW_OP_in_id_or_op1315); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_operator_in_id_or_op1317);
                    operator();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id_or_op"

    public static class operator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operator"
    // nl/cwi/cacoj/creol/CreolWalker.g:284:1: operator : ( IN | NOT | EQUIVALENCE | IMPLICATION | XOR | OR | AND | EQUALITY | INEQUALITY | comp_op | PROJECTION | CONCAT | PREPEND | APPEND | PLUS | MINUS | MULT | DIV | MOD | POW | NUMBER_SIGN );
    public final CreolWalker.operator_return operator() throws RecognitionException {
        CreolWalker.operator_return retval = new CreolWalker.operator_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:284:10: ( IN | NOT | EQUIVALENCE | IMPLICATION | XOR | OR | AND | EQUALITY | INEQUALITY | comp_op | PROJECTION | CONCAT | PREPEND | APPEND | PLUS | MINUS | MULT | DIV | MOD | POW | NUMBER_SIGN )
            int alt30=21;
            switch ( input.LA(1) ) {
            case IN:
                {
                alt30=1;
                }
                break;
            case NOT:
                {
                alt30=2;
                }
                break;
            case EQUIVALENCE:
                {
                alt30=3;
                }
                break;
            case IMPLICATION:
                {
                alt30=4;
                }
                break;
            case XOR:
                {
                alt30=5;
                }
                break;
            case OR:
                {
                alt30=6;
                }
                break;
            case AND:
                {
                alt30=7;
                }
                break;
            case EQUALITY:
                {
                alt30=8;
                }
                break;
            case INEQUALITY:
                {
                alt30=9;
                }
                break;
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
                {
                alt30=10;
                }
                break;
            case PROJECTION:
                {
                alt30=11;
                }
                break;
            case CONCAT:
                {
                alt30=12;
                }
                break;
            case PREPEND:
                {
                alt30=13;
                }
                break;
            case APPEND:
                {
                alt30=14;
                }
                break;
            case PLUS:
                {
                alt30=15;
                }
                break;
            case MINUS:
                {
                alt30=16;
                }
                break;
            case MULT:
                {
                alt30=17;
                }
                break;
            case DIV:
                {
                alt30=18;
                }
                break;
            case MOD:
                {
                alt30=19;
                }
                break;
            case POW:
                {
                alt30=20;
                }
                break;
            case NUMBER_SIGN:
                {
                alt30=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:284:12: IN
                    {
                    match(input,IN,FOLLOW_IN_in_operator1331); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:285:5: NOT
                    {
                    match(input,NOT,FOLLOW_NOT_in_operator1337); 

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:286:5: EQUIVALENCE
                    {
                    match(input,EQUIVALENCE,FOLLOW_EQUIVALENCE_in_operator1343); 

                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:287:5: IMPLICATION
                    {
                    match(input,IMPLICATION,FOLLOW_IMPLICATION_in_operator1349); 

                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:288:5: XOR
                    {
                    match(input,XOR,FOLLOW_XOR_in_operator1355); 

                    }
                    break;
                case 6 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:289:5: OR
                    {
                    match(input,OR,FOLLOW_OR_in_operator1361); 

                    }
                    break;
                case 7 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:290:5: AND
                    {
                    match(input,AND,FOLLOW_AND_in_operator1367); 

                    }
                    break;
                case 8 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:291:5: EQUALITY
                    {
                    match(input,EQUALITY,FOLLOW_EQUALITY_in_operator1373); 

                    }
                    break;
                case 9 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:292:5: INEQUALITY
                    {
                    match(input,INEQUALITY,FOLLOW_INEQUALITY_in_operator1379); 

                    }
                    break;
                case 10 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:293:5: comp_op
                    {
                    pushFollow(FOLLOW_comp_op_in_operator1385);
                    comp_op();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:294:5: PROJECTION
                    {
                    match(input,PROJECTION,FOLLOW_PROJECTION_in_operator1391); 

                    }
                    break;
                case 12 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:295:5: CONCAT
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_operator1397); 

                    }
                    break;
                case 13 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:296:5: PREPEND
                    {
                    match(input,PREPEND,FOLLOW_PREPEND_in_operator1403); 

                    }
                    break;
                case 14 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:297:5: APPEND
                    {
                    match(input,APPEND,FOLLOW_APPEND_in_operator1409); 

                    }
                    break;
                case 15 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:298:5: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_operator1415); 

                    }
                    break;
                case 16 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:299:5: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_operator1421); 

                    }
                    break;
                case 17 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:300:5: MULT
                    {
                    match(input,MULT,FOLLOW_MULT_in_operator1427); 

                    }
                    break;
                case 18 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:301:5: DIV
                    {
                    match(input,DIV,FOLLOW_DIV_in_operator1433); 

                    }
                    break;
                case 19 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:302:5: MOD
                    {
                    match(input,MOD,FOLLOW_MOD_in_operator1439); 

                    }
                    break;
                case 20 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:303:5: POW
                    {
                    match(input,POW,FOLLOW_POW_in_operator1445); 

                    }
                    break;
                case 21 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:304:5: NUMBER_SIGN
                    {
                    match(input,NUMBER_SIGN,FOLLOW_NUMBER_SIGN_in_operator1451); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class parameter_list_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parameter_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:307:1: parameter_list : ^( PRM (el= expr_list )? ) -> parameter_list_tmpl(plist=$el.st);
    public final CreolWalker.parameter_list_return parameter_list() throws RecognitionException {
        CreolWalker.parameter_list_return retval = new CreolWalker.parameter_list_return();
        retval.start = input.LT(1);

        CreolWalker.expr_list_return el = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:308:3: ( ^( PRM (el= expr_list )? ) -> parameter_list_tmpl(plist=$el.st))
            // nl/cwi/cacoj/creol/CreolWalker.g:309:4: ^( PRM (el= expr_list )? )
            {
            match(input,PRM,FOLLOW_PRM_in_parameter_list1470); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:309:12: (el= expr_list )?
                int alt31=2;
                switch ( input.LA(1) ) {
                    case LIST:
                    case PAREN:
                    case SET_OR_BINDING:
                    case KOMMA:
                    case IDENTIFIER:
                    case IN:
                    case NOT:
                    case EQUIVALENCE:
                    case IMPLICATION:
                    case XOR:
                    case OR:
                    case AND:
                    case EQUALITY:
                    case INEQUALITY:
                    case PROJECTION:
                    case CONCAT:
                    case PREPEND:
                    case APPEND:
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case MOD:
                    case POW:
                    case NUMBER_SIGN:
                    case STRING:
                    case LESS_THAN:
                    case GREATER_THAN:
                    case LESS_OR_EQUAL:
                    case GREATER_OR_EQUAL:
                    case AT:
                    case QUESTION_MARK:
                    case AS:
                    case TRUE:
                    case FALSE:
                    case INTEGER:
                    case FLOAT:
                    case THIS:
                    case CALLER:
                    case NULL:
                    case NIL:
                    case NOW:
                    case HISTORY:
                    case METHOD:
                        {
                        alt31=1;
                        }
                        break;
                }

                switch (alt31) {
                    case 1 :
                        // nl/cwi/cacoj/creol/CreolWalker.g:309:12: el= expr_list
                        {
                        pushFollow(FOLLOW_expr_list_in_parameter_list1474);
                        el=expr_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 310:4: -> parameter_list_tmpl(plist=$el.st)
            {
                retval.st = templateLib.getInstanceOf("parameter_list_tmpl",
              new STAttrMap().put("plist", (el!=null?el.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class function_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:313:1: function_decl : ^( FUNCTION id_or_op ( ^( PRM ( var_decl_no_init_list )? ) )? type ( pragma )* ( ^( EXTERNAL STRING ) | ^( BODY expr ) ) ) ;
    public final CreolWalker.function_decl_return function_decl() throws RecognitionException {
        CreolWalker.function_decl_return retval = new CreolWalker.function_decl_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:313:15: ( ^( FUNCTION id_or_op ( ^( PRM ( var_decl_no_init_list )? ) )? type ( pragma )* ( ^( EXTERNAL STRING ) | ^( BODY expr ) ) ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:313:17: ^( FUNCTION id_or_op ( ^( PRM ( var_decl_no_init_list )? ) )? type ( pragma )* ( ^( EXTERNAL STRING ) | ^( BODY expr ) ) )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function_decl1500); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_id_or_op_in_function_decl1502);
            id_or_op();

            state._fsp--;

            // nl/cwi/cacoj/creol/CreolWalker.g:314:3: ( ^( PRM ( var_decl_no_init_list )? ) )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case PRM:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:314:4: ^( PRM ( var_decl_no_init_list )? )
                    {
                    match(input,PRM,FOLLOW_PRM_in_function_decl1509); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:314:10: ( var_decl_no_init_list )?
                        int alt32=2;
                        switch ( input.LA(1) ) {
                            case DECL:
                                {
                                alt32=1;
                                }
                                break;
                        }

                        switch (alt32) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:314:10: var_decl_no_init_list
                                {
                                pushFollow(FOLLOW_var_decl_no_init_list_in_function_decl1511);
                                var_decl_no_init_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_function_decl1520);
            type();

            state._fsp--;

            // nl/cwi/cacoj/creol/CreolWalker.g:316:3: ( pragma )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case PRAGMA:
                    {
                    alt34=1;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:316:3: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_function_decl1525);
            	    pragma();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // nl/cwi/cacoj/creol/CreolWalker.g:317:3: ( ^( EXTERNAL STRING ) | ^( BODY expr ) )
            int alt35=2;
            switch ( input.LA(1) ) {
            case EXTERNAL:
                {
                alt35=1;
                }
                break;
            case BODY:
                {
                alt35=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:317:5: ^( EXTERNAL STRING )
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_function_decl1534); 

                    match(input, Token.DOWN, null); 
                    match(input,STRING,FOLLOW_STRING_in_function_decl1536); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:317:26: ^( BODY expr )
                    {
                    match(input,BODY,FOLLOW_BODY_in_function_decl1542); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_function_decl1544);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_decl"

    public static class datatype_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "datatype_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:321:1: datatype_decl : ^( DATATYPE type ( ^( FROM type_list ) )? ( pragma )* ) ;
    public final CreolWalker.datatype_decl_return datatype_decl() throws RecognitionException {
        CreolWalker.datatype_decl_return retval = new CreolWalker.datatype_decl_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:321:15: ( ^( DATATYPE type ( ^( FROM type_list ) )? ( pragma )* ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:321:17: ^( DATATYPE type ( ^( FROM type_list ) )? ( pragma )* )
            {
            match(input,DATATYPE,FOLLOW_DATATYPE_in_datatype_decl1561); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_datatype_decl1563);
            type();

            state._fsp--;

            // nl/cwi/cacoj/creol/CreolWalker.g:321:33: ( ^( FROM type_list ) )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt36=1;
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:321:34: ^( FROM type_list )
                    {
                    match(input,FROM,FOLLOW_FROM_in_datatype_decl1567); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_list_in_datatype_decl1569);
                    type_list();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/CreolWalker.g:321:54: ( pragma )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case PRAGMA:
                    {
                    alt37=1;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:321:54: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_datatype_decl1574);
            	    pragma();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datatype_decl"

    public static class interface_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interface_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:324:1: interface_decl : ^( INTERFACE ^( ID CLASS_IDENTIFIER ) ( ^( PRM ( var_decl_no_init_list )? ) )? ^( SUPER ( interface_inherits )* ) ^( PRAGMAS ( pragma )* ) ( invariant )? ^( METHODS ( with_decl )* ) ) -> interface_decl_tmpl(cid=$CLASS_IDENTIFIER.text);
    public final CreolWalker.interface_decl_return interface_decl() throws RecognitionException {
        CreolWalker.interface_decl_return retval = new CreolWalker.interface_decl_return();
        retval.start = input.LT(1);

        CommonTree CLASS_IDENTIFIER5=null;

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:324:16: ( ^( INTERFACE ^( ID CLASS_IDENTIFIER ) ( ^( PRM ( var_decl_no_init_list )? ) )? ^( SUPER ( interface_inherits )* ) ^( PRAGMAS ( pragma )* ) ( invariant )? ^( METHODS ( with_decl )* ) ) -> interface_decl_tmpl(cid=$CLASS_IDENTIFIER.text))
            // nl/cwi/cacoj/creol/CreolWalker.g:324:18: ^( INTERFACE ^( ID CLASS_IDENTIFIER ) ( ^( PRM ( var_decl_no_init_list )? ) )? ^( SUPER ( interface_inherits )* ) ^( PRAGMAS ( pragma )* ) ( invariant )? ^( METHODS ( with_decl )* ) )
            {
            match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_decl1587); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_interface_decl1592); 

            match(input, Token.DOWN, null); 
            CLASS_IDENTIFIER5=(CommonTree)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_interface_decl1594); 

            match(input, Token.UP, null); 
            // nl/cwi/cacoj/creol/CreolWalker.g:326:3: ( ^( PRM ( var_decl_no_init_list )? ) )?
            int alt39=2;
            switch ( input.LA(1) ) {
                case PRM:
                    {
                    alt39=1;
                    }
                    break;
            }

            switch (alt39) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:326:4: ^( PRM ( var_decl_no_init_list )? )
                    {
                    match(input,PRM,FOLLOW_PRM_in_interface_decl1601); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:326:10: ( var_decl_no_init_list )?
                        int alt38=2;
                        switch ( input.LA(1) ) {
                            case DECL:
                                {
                                alt38=1;
                                }
                                break;
                        }

                        switch (alt38) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:326:10: var_decl_no_init_list
                                {
                                pushFollow(FOLLOW_var_decl_no_init_list_in_interface_decl1603);
                                var_decl_no_init_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }

            match(input,SUPER,FOLLOW_SUPER_in_interface_decl1612); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:327:11: ( interface_inherits )*
                loop40:
                do {
                    int alt40=2;
                    switch ( input.LA(1) ) {
                    case INHERITS:
                        {
                        alt40=1;
                        }
                        break;

                    }

                    switch (alt40) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:327:11: interface_inherits
                	    {
                	    pushFollow(FOLLOW_interface_inherits_in_interface_decl1614);
                	    interface_inherits();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop40;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,PRAGMAS,FOLLOW_PRAGMAS_in_interface_decl1621); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:328:13: ( pragma )*
                loop41:
                do {
                    int alt41=2;
                    switch ( input.LA(1) ) {
                    case PRAGMA:
                        {
                        alt41=1;
                        }
                        break;

                    }

                    switch (alt41) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:328:13: pragma
                	    {
                	    pushFollow(FOLLOW_pragma_in_interface_decl1623);
                	    pragma();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop41;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            // nl/cwi/cacoj/creol/CreolWalker.g:329:3: ( invariant )?
            int alt42=2;
            switch ( input.LA(1) ) {
                case INV:
                    {
                    alt42=1;
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:329:3: invariant
                    {
                    pushFollow(FOLLOW_invariant_in_interface_decl1629);
                    invariant();

                    state._fsp--;


                    }
                    break;

            }

            match(input,METHODS,FOLLOW_METHODS_in_interface_decl1635); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:330:13: ( with_decl )*
                loop43:
                do {
                    int alt43=2;
                    switch ( input.LA(1) ) {
                    case WITH:
                        {
                        alt43=1;
                        }
                        break;

                    }

                    switch (alt43) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:330:13: with_decl
                	    {
                	    pushFollow(FOLLOW_with_decl_in_interface_decl1637);
                	    with_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop43;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 332:3: -> interface_decl_tmpl(cid=$CLASS_IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("interface_decl_tmpl",
              new STAttrMap().put("cid", (CLASS_IDENTIFIER5!=null?CLASS_IDENTIFIER5.getText():null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interface_decl"

    public static class with_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "with_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:335:1: with_decl : ^( WITH type ( method_decl )+ ( invariant )* ) ;
    public final CreolWalker.with_decl_return with_decl() throws RecognitionException {
        CreolWalker.with_decl_return retval = new CreolWalker.with_decl_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:335:11: ( ^( WITH type ( method_decl )+ ( invariant )* ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:335:13: ^( WITH type ( method_decl )+ ( invariant )* )
            {
            match(input,WITH,FOLLOW_WITH_in_with_decl1665); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_with_decl1667);
            type();

            state._fsp--;

            // nl/cwi/cacoj/creol/CreolWalker.g:335:25: ( method_decl )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case OP:
                    {
                    alt44=1;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:335:25: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_with_decl1669);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // nl/cwi/cacoj/creol/CreolWalker.g:335:38: ( invariant )*
            loop45:
            do {
                int alt45=2;
                switch ( input.LA(1) ) {
                case INV:
                    {
                    alt45=1;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:335:38: invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_with_decl1672);
            	    invariant();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_decl"

    public static class method_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "method_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:338:1: method_decl : ^( OP ^( ID IDENTIFIER ) ( ^( PRM ( method_param_in )? ( method_param_out )? ) )? ( ^( REQUIRES expr ) )? ( ^( ENSURES expr ) )? ( pragma )* ) ;
    public final CreolWalker.method_decl_return method_decl() throws RecognitionException {
        CreolWalker.method_decl_return retval = new CreolWalker.method_decl_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:338:13: ( ^( OP ^( ID IDENTIFIER ) ( ^( PRM ( method_param_in )? ( method_param_out )? ) )? ( ^( REQUIRES expr ) )? ( ^( ENSURES expr ) )? ( pragma )* ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:338:15: ^( OP ^( ID IDENTIFIER ) ( ^( PRM ( method_param_in )? ( method_param_out )? ) )? ( ^( REQUIRES expr ) )? ( ^( ENSURES expr ) )? ( pragma )* )
            {
            match(input,OP,FOLLOW_OP_in_method_decl1685); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_method_decl1692); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_method_decl1694); 

            match(input, Token.UP, null); 
            // nl/cwi/cacoj/creol/CreolWalker.g:340:3: ( ^( PRM ( method_param_in )? ( method_param_out )? ) )?
            int alt48=2;
            switch ( input.LA(1) ) {
                case PRM:
                    {
                    alt48=1;
                    }
                    break;
            }

            switch (alt48) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:340:4: ^( PRM ( method_param_in )? ( method_param_out )? )
                    {
                    match(input,PRM,FOLLOW_PRM_in_method_decl1701); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:340:10: ( method_param_in )?
                        int alt46=2;
                        switch ( input.LA(1) ) {
                            case IN_PRM:
                                {
                                alt46=1;
                                }
                                break;
                        }

                        switch (alt46) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:340:10: method_param_in
                                {
                                pushFollow(FOLLOW_method_param_in_in_method_decl1703);
                                method_param_in();

                                state._fsp--;


                                }
                                break;

                        }

                        // nl/cwi/cacoj/creol/CreolWalker.g:340:27: ( method_param_out )?
                        int alt47=2;
                        switch ( input.LA(1) ) {
                            case OUT:
                                {
                                alt47=1;
                                }
                                break;
                        }

                        switch (alt47) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:340:27: method_param_out
                                {
                                pushFollow(FOLLOW_method_param_out_in_method_decl1706);
                                method_param_out();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/CreolWalker.g:341:3: ( ^( REQUIRES expr ) )?
            int alt49=2;
            switch ( input.LA(1) ) {
                case REQUIRES:
                    {
                    alt49=1;
                    }
                    break;
            }

            switch (alt49) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:341:4: ^( REQUIRES expr )
                    {
                    match(input,REQUIRES,FOLLOW_REQUIRES_in_method_decl1716); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_method_decl1718);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/CreolWalker.g:342:3: ( ^( ENSURES expr ) )?
            int alt50=2;
            switch ( input.LA(1) ) {
                case ENSURES:
                    {
                    alt50=1;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:342:4: ^( ENSURES expr )
                    {
                    match(input,ENSURES,FOLLOW_ENSURES_in_method_decl1727); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_method_decl1729);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/CreolWalker.g:343:3: ( pragma )*
            loop51:
            do {
                int alt51=2;
                switch ( input.LA(1) ) {
                case PRAGMA:
                    {
                    alt51=1;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:343:3: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_method_decl1736);
            	    pragma();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_decl"

    public static class interface_inherits_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interface_inherits"
    // nl/cwi/cacoj/creol/CreolWalker.g:349:1: interface_inherits : ^( INHERITS ( class_list )? ) ;
    public final CreolWalker.interface_inherits_return interface_inherits() throws RecognitionException {
        CreolWalker.interface_inherits_return retval = new CreolWalker.interface_inherits_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:349:19: ( ^( INHERITS ( class_list )? ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:349:21: ^( INHERITS ( class_list )? )
            {
            match(input,INHERITS,FOLLOW_INHERITS_in_interface_inherits1753); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:349:32: ( class_list )?
                int alt52=2;
                switch ( input.LA(1) ) {
                    case CLASS_IDENTIFIER:
                        {
                        alt52=1;
                        }
                        break;
                }

                switch (alt52) {
                    case 1 :
                        // nl/cwi/cacoj/creol/CreolWalker.g:349:32: class_list
                        {
                        pushFollow(FOLLOW_class_list_in_interface_inherits1755);
                        class_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interface_inherits"

    public static class decl_statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "decl_statement"
    // nl/cwi/cacoj/creol/CreolWalker.g:354:1: decl_statement : (stmt= statement -> decl_statement_tmpl(stmt=$stmt.st) | ^( SEMICOLON a= attribute s= decl_statement ) -> decl_statement_with_vars_tmpl(attrib=$a.ststmt=$s.st));
    public final CreolWalker.decl_statement_return decl_statement() throws RecognitionException {
        CreolWalker.decl_statement_return retval = new CreolWalker.decl_statement_return();
        retval.start = input.LT(1);

        CreolWalker.statement_return stmt = null;

        CreolWalker.attribute_return a = null;

        CreolWalker.decl_statement_return s = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:354:16: (stmt= statement -> decl_statement_tmpl(stmt=$stmt.st) | ^( SEMICOLON a= attribute s= decl_statement ) -> decl_statement_with_vars_tmpl(attrib=$a.ststmt=$s.st))
            int alt53=2;
            switch ( input.LA(1) ) {
            case BEGIN:
            case ASSIGN:
            case INTERLEAVE:
            case BOX:
            case EXCLENATION_MARK:
            case WHILE:
            case DO:
            case AWAIT:
            case PROVE:
            case ASSERT:
            case POSIT:
            case SKIP:
            case RELEASE:
            case BLOCK:
            case DOT:
            case QUESTION_MARK:
            case IF:
            case BOUND_L:
            case BOUND_R:
            case METHOD:
                {
                alt53=1;
                }
                break;
            case SEMICOLON:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case BEGIN:
                    case SEMICOLON:
                    case ASSIGN:
                    case INTERLEAVE:
                    case BOX:
                    case EXCLENATION_MARK:
                    case WHILE:
                    case DO:
                    case AWAIT:
                    case PROVE:
                    case ASSERT:
                    case POSIT:
                    case SKIP:
                    case RELEASE:
                    case BLOCK:
                    case DOT:
                    case QUESTION_MARK:
                    case IF:
                    case BOUND_L:
                    case BOUND_R:
                    case METHOD:
                        {
                        alt53=1;
                        }
                        break;
                    case VAR:
                        {
                        alt53=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:355:7: stmt= statement
                    {
                    pushFollow(FOLLOW_statement_in_decl_statement1778);
                    stmt=statement();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 356:7: -> decl_statement_tmpl(stmt=$stmt.st)
                    {
                        retval.st = templateLib.getInstanceOf("decl_statement_tmpl",
                      new STAttrMap().put("stmt", (stmt!=null?stmt.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:357:5: ^( SEMICOLON a= attribute s= decl_statement )
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_statement1800); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_attribute_in_decl_statement1804);
                    a=attribute();

                    state._fsp--;

                    pushFollow(FOLLOW_decl_statement_in_decl_statement1808);
                    s=decl_statement();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 358:5: -> decl_statement_with_vars_tmpl(attrib=$a.ststmt=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("decl_statement_with_vars_tmpl",
                      new STAttrMap().put("attrib", (a!=null?a.st:null)).put("stmt", (s!=null?s.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl_statement"

    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // nl/cwi/cacoj/creol/CreolWalker.g:361:1: statement : ( ^( INTERLEAVE statement statement ) | ^( BOX statement statement ) | ^( SEMICOLON s1= statement s2= statement ) -> statement_multi_statements(s1=$s1.sts2=$s2.st) | ^( ASSIGN l= expr_list r= expr_or_new_list ) -> statement_assign_expr(left=$l.stright=$r.st) | ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( DOT object= expr ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ( ^( SEMICOLON (results= lhs_list )? ) )? ) ) ( ^( AS type ) )? ) ) -> method_call_nonlocal_async_tmpl(object=$object.stmethod=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText())results=results == null || results.lhslist == null ? new ArrayList() : results.lhslist) | ^( EXCLENATION_MARK ( IDENTIFIER )? method_call_bounds ) | nlsc= non_local_syn_call -> non_local_syn_call_tmpl(st=$nlsc.st) | ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ) ( ^( AS type ) )? ) ) -> method_call_local_async_tmpl(label=$mylabel == null ? null : $mylabel.getText()method=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText())) | local_syn_bounded_call | ^( METHOD IDENTIFIER ^( PRM (p= expr_list )? ^( SEMICOLON ( lhs_list )? ) ) ) -> method_call_local_sync_tmpl(method=refineMethodName($IDENTIFIER.text)params=$p.st) | ^( QUESTION_MARK IDENTIFIER ( ^( PRM (future_value_list= lhs_list )? ) )? ) -> future_value_get_tmpl(id=$IDENTIFIER.textvalues=future_value_list.lhslist) | ^( WHILE condition ( invariant )? ( measure )? body ) | ^( DO body ( invariant )? ( measure )? condition ) | ^( IF ^( COND if_cond= expr ) ^( THEN if_then= statement ) ( ^( ELSE if_else= statement ) )? ) -> if_tmpl(cond=$if_cond.ststmt=$if_then.stelce=$if_else.st) | ^( AWAIT e= expr ) -> await_expr_tmpl(e=$e.stmi_var_name=getMiNameForFutureLabel($e.st.toString())) | ^( AWAIT local_syn_bounded_call ) | ^( AWAIT ^( DOT expr ^( METHOD IDENTIFIER syn_method_call_prm ) ) ) | ^( PROVE expr ) | ^( ASSERT expr ) | ^( POSIT expr ) | ^( BEGIN statement ) | SKIP | RELEASE -> release_tmpl() | BLOCK );
    public final CreolWalker.statement_return statement() throws RecognitionException {
        CreolWalker.statement_return retval = new CreolWalker.statement_return();
        retval.start = input.LT(1);

        CommonTree mylabel=null;
        CommonTree method=null;
        CommonTree IDENTIFIER6=null;
        CommonTree IDENTIFIER7=null;
        CreolWalker.statement_return s1 = null;

        CreolWalker.statement_return s2 = null;

        CreolWalker.expr_list_return l = null;

        CreolWalker.expr_or_new_list_return r = null;

        CreolWalker.expr_return object = null;

        CreolWalker.expr_list_return params = null;

        CreolWalker.lhs_list_return results = null;

        CreolWalker.non_local_syn_call_return nlsc = null;

        CreolWalker.expr_list_return p = null;

        CreolWalker.lhs_list_return future_value_list = null;

        CreolWalker.expr_return if_cond = null;

        CreolWalker.statement_return if_then = null;

        CreolWalker.statement_return if_else = null;

        CreolWalker.expr_return e = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:361:11: ( ^( INTERLEAVE statement statement ) | ^( BOX statement statement ) | ^( SEMICOLON s1= statement s2= statement ) -> statement_multi_statements(s1=$s1.sts2=$s2.st) | ^( ASSIGN l= expr_list r= expr_or_new_list ) -> statement_assign_expr(left=$l.stright=$r.st) | ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( DOT object= expr ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ( ^( SEMICOLON (results= lhs_list )? ) )? ) ) ( ^( AS type ) )? ) ) -> method_call_nonlocal_async_tmpl(object=$object.stmethod=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText())results=results == null || results.lhslist == null ? new ArrayList() : results.lhslist) | ^( EXCLENATION_MARK ( IDENTIFIER )? method_call_bounds ) | nlsc= non_local_syn_call -> non_local_syn_call_tmpl(st=$nlsc.st) | ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ) ( ^( AS type ) )? ) ) -> method_call_local_async_tmpl(label=$mylabel == null ? null : $mylabel.getText()method=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText())) | local_syn_bounded_call | ^( METHOD IDENTIFIER ^( PRM (p= expr_list )? ^( SEMICOLON ( lhs_list )? ) ) ) -> method_call_local_sync_tmpl(method=refineMethodName($IDENTIFIER.text)params=$p.st) | ^( QUESTION_MARK IDENTIFIER ( ^( PRM (future_value_list= lhs_list )? ) )? ) -> future_value_get_tmpl(id=$IDENTIFIER.textvalues=future_value_list.lhslist) | ^( WHILE condition ( invariant )? ( measure )? body ) | ^( DO body ( invariant )? ( measure )? condition ) | ^( IF ^( COND if_cond= expr ) ^( THEN if_then= statement ) ( ^( ELSE if_else= statement ) )? ) -> if_tmpl(cond=$if_cond.ststmt=$if_then.stelce=$if_else.st) | ^( AWAIT e= expr ) -> await_expr_tmpl(e=$e.stmi_var_name=getMiNameForFutureLabel($e.st.toString())) | ^( AWAIT local_syn_bounded_call ) | ^( AWAIT ^( DOT expr ^( METHOD IDENTIFIER syn_method_call_prm ) ) ) | ^( PROVE expr ) | ^( ASSERT expr ) | ^( POSIT expr ) | ^( BEGIN statement ) | SKIP | RELEASE -> release_tmpl() | BLOCK )
            int alt72=24;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:362:7: ^( INTERLEAVE statement statement )
                    {
                    match(input,INTERLEAVE,FOLLOW_INTERLEAVE_in_statement1845); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1847);
                    statement();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement1849);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:364:5: ^( BOX statement statement )
                    {
                    match(input,BOX,FOLLOW_BOX_in_statement1864); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1866);
                    statement();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement1868);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:366:5: ^( SEMICOLON s1= statement s2= statement )
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement1879); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement1883);
                    s1=statement();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement1887);
                    s2=statement();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 367:3: -> statement_multi_statements(s1=$s1.sts2=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement_multi_statements",
                      new STAttrMap().put("s1", (s1!=null?s1.st:null)).put("s2", (s2!=null?s2.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:369:5: ^( ASSIGN l= expr_list r= expr_or_new_list )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement1914); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_list_in_statement1918);
                    l=expr_list();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_or_new_list_in_statement1922);
                    r=expr_or_new_list();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 370:3: -> statement_assign_expr(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement_assign_expr",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:373:5: ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( DOT object= expr ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ( ^( SEMICOLON (results= lhs_list )? ) )? ) ) ( ^( AS type ) )? ) )
                    {
                    match(input,EXCLENATION_MARK,FOLLOW_EXCLENATION_MARK_in_statement1952); 

                    match(input, Token.DOWN, null); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:373:31: (mylabel= IDENTIFIER )?
                    int alt54=2;
                    switch ( input.LA(1) ) {
                        case IDENTIFIER:
                            {
                            alt54=1;
                            }
                            break;
                    }

                    switch (alt54) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:373:31: mylabel= IDENTIFIER
                            {
                            mylabel=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1956); 

                            }
                            break;

                    }

                    match(input,DOT,FOLLOW_DOT_in_statement1961); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement1965);
                    object=expr();

                    state._fsp--;

                    match(input,METHOD,FOLLOW_METHOD_in_statement1968); 

                    match(input, Token.DOWN, null); 
                    method=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1972); 
                    match(input,PRM,FOLLOW_PRM_in_statement1975); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:373:112: (params= expr_list )?
                        int alt55=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case METHOD:
                                {
                                alt55=1;
                                }
                                break;
                        }

                        switch (alt55) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:373:112: params= expr_list
                                {
                                pushFollow(FOLLOW_expr_list_in_statement1979);
                                params=expr_list();

                                state._fsp--;


                                }
                                break;

                        }

                        // nl/cwi/cacoj/creol/CreolWalker.g:373:124: ( ^( SEMICOLON (results= lhs_list )? ) )?
                        int alt57=2;
                        switch ( input.LA(1) ) {
                            case SEMICOLON:
                                {
                                alt57=1;
                                }
                                break;
                        }

                        switch (alt57) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:373:125: ^( SEMICOLON (results= lhs_list )? )
                                {
                                match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement1984); 

                                if ( input.LA(1)==Token.DOWN ) {
                                    match(input, Token.DOWN, null); 
                                    // nl/cwi/cacoj/creol/CreolWalker.g:373:144: (results= lhs_list )?
                                    int alt56=2;
                                    switch ( input.LA(1) ) {
                                        case IDENTIFIER:
                                        case AT:
                                        case UNDERSCORE:
                                            {
                                            alt56=1;
                                            }
                                            break;
                                    }

                                    switch (alt56) {
                                        case 1 :
                                            // nl/cwi/cacoj/creol/CreolWalker.g:373:144: results= lhs_list
                                            {
                                            pushFollow(FOLLOW_lhs_list_in_statement1988);
                                            results=lhs_list();

                                            state._fsp--;


                                            }
                                            break;

                                    }


                                    match(input, Token.UP, null); 
                                }

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    match(input, Token.UP, null); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:373:162: ( ^( AS type ) )?
                    int alt58=2;
                    switch ( input.LA(1) ) {
                        case AS:
                            {
                            alt58=1;
                            }
                            break;
                    }

                    switch (alt58) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:373:163: ^( AS type )
                            {
                            match(input,AS,FOLLOW_AS_in_statement2000); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_type_in_statement2002);
                            type();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    		  String miName = genVarName("mi");
                    		  if (mylabel != null) {setMiNameFutureLabel(miName, mylabel.getText() + ".isDone()");}
                    		  


                    // TEMPLATE REWRITE
                    // 378:3: -> method_call_nonlocal_async_tmpl(object=$object.stmethod=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText())results=results == null || results.lhslist == null ? new ArrayList() : results.lhslist)
                    {
                        retval.st = templateLib.getInstanceOf("method_call_nonlocal_async_tmpl",
                      new STAttrMap().put("object", (object!=null?object.st:null)).put("method", refineMethodName(method.getText())).put("params", (params!=null?params.st:null)).put("mi_var_name", miName).put("method_return_type", getMethodReturnType(method.getText())).put("results", results == null || results.lhslist == null ? new ArrayList() : results.lhslist));
                    }


                    }
                    break;
                case 6 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:388:5: ^( EXCLENATION_MARK ( IDENTIFIER )? method_call_bounds )
                    {
                    match(input,EXCLENATION_MARK,FOLLOW_EXCLENATION_MARK_in_statement2125); 

                    match(input, Token.DOWN, null); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:388:24: ( IDENTIFIER )?
                    int alt59=2;
                    switch ( input.LA(1) ) {
                        case IDENTIFIER:
                            {
                            alt59=1;
                            }
                            break;
                    }

                    switch (alt59) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:388:24: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2127); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_method_call_bounds_in_statement2131);
                    method_call_bounds();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:394:7: nlsc= non_local_syn_call
                    {
                    pushFollow(FOLLOW_non_local_syn_call_in_statement2152);
                    nlsc=non_local_syn_call();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 395:7: -> non_local_syn_call_tmpl(st=$nlsc.st)
                    {
                        retval.st = templateLib.getInstanceOf("non_local_syn_call_tmpl",
                      new STAttrMap().put("st", (nlsc!=null?nlsc.st:null)));
                    }


                    }
                    break;
                case 8 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:398:5: ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ) ( ^( AS type ) )? ) )
                    {
                    match(input,EXCLENATION_MARK,FOLLOW_EXCLENATION_MARK_in_statement2182); 

                    match(input, Token.DOWN, null); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:398:31: (mylabel= IDENTIFIER )?
                    int alt60=2;
                    switch ( input.LA(1) ) {
                        case IDENTIFIER:
                            {
                            alt60=1;
                            }
                            break;
                    }

                    switch (alt60) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:398:31: mylabel= IDENTIFIER
                            {
                            mylabel=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2186); 

                            }
                            break;

                    }

                    match(input,METHOD,FOLLOW_METHOD_in_statement2191); 

                    match(input, Token.DOWN, null); 
                    method=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2195); 
                    match(input,PRM,FOLLOW_PRM_in_statement2198); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:398:94: (params= expr_list )?
                        int alt61=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case METHOD:
                                {
                                alt61=1;
                                }
                                break;
                        }

                        switch (alt61) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:398:94: params= expr_list
                                {
                                pushFollow(FOLLOW_expr_list_in_statement2202);
                                params=expr_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    // nl/cwi/cacoj/creol/CreolWalker.g:398:107: ( ^( AS type ) )?
                    int alt62=2;
                    switch ( input.LA(1) ) {
                        case AS:
                            {
                            alt62=1;
                            }
                            break;
                    }

                    switch (alt62) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:398:108: ^( AS type )
                            {
                            match(input,AS,FOLLOW_AS_in_statement2208); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_type_in_statement2210);
                            type();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                          String miName = genVarName("mi");
                          if (mylabel != null) {setMiNameFutureLabel(miName, mylabel.getText() + ".isDone()");}
                          


                    // TEMPLATE REWRITE
                    // 403:3: -> method_call_local_async_tmpl(label=$mylabel == null ? null : $mylabel.getText()method=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText()))
                    {
                        retval.st = templateLib.getInstanceOf("method_call_local_async_tmpl",
                      new STAttrMap().put("label", mylabel == null ? null : mylabel.getText()).put("method", refineMethodName(method.getText())).put("params", (params!=null?params.st:null)).put("mi_var_name", miName).put("method_return_type", getMethodReturnType(method.getText())));
                    }


                    }
                    break;
                case 9 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:412:5: local_syn_bounded_call
                    {
                    pushFollow(FOLLOW_local_syn_bounded_call_in_statement2309);
                    local_syn_bounded_call();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:415:5: ^( METHOD IDENTIFIER ^( PRM (p= expr_list )? ^( SEMICOLON ( lhs_list )? ) ) )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_statement2323); 

                    match(input, Token.DOWN, null); 
                    IDENTIFIER6=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2325); 
                    match(input,PRM,FOLLOW_PRM_in_statement2328); 

                    match(input, Token.DOWN, null); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:415:32: (p= expr_list )?
                    int alt63=2;
                    switch ( input.LA(1) ) {
                        case LIST:
                        case PAREN:
                        case SET_OR_BINDING:
                        case KOMMA:
                        case IDENTIFIER:
                        case IN:
                        case NOT:
                        case EQUIVALENCE:
                        case IMPLICATION:
                        case XOR:
                        case OR:
                        case AND:
                        case EQUALITY:
                        case INEQUALITY:
                        case PROJECTION:
                        case CONCAT:
                        case PREPEND:
                        case APPEND:
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case MOD:
                        case POW:
                        case NUMBER_SIGN:
                        case STRING:
                        case LESS_THAN:
                        case GREATER_THAN:
                        case LESS_OR_EQUAL:
                        case GREATER_OR_EQUAL:
                        case AT:
                        case QUESTION_MARK:
                        case AS:
                        case TRUE:
                        case FALSE:
                        case INTEGER:
                        case FLOAT:
                        case THIS:
                        case CALLER:
                        case NULL:
                        case NIL:
                        case NOW:
                        case HISTORY:
                        case METHOD:
                            {
                            alt63=1;
                            }
                            break;
                    }

                    switch (alt63) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:415:32: p= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_statement2332);
                            p=expr_list();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement2336); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:415:56: ( lhs_list )?
                        int alt64=2;
                        switch ( input.LA(1) ) {
                            case IDENTIFIER:
                            case AT:
                            case UNDERSCORE:
                                {
                                alt64=1;
                                }
                                break;
                        }

                        switch (alt64) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:415:56: lhs_list
                                {
                                pushFollow(FOLLOW_lhs_list_in_statement2338);
                                lhs_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 416:3: -> method_call_local_sync_tmpl(method=refineMethodName($IDENTIFIER.text)params=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("method_call_local_sync_tmpl",
                      new STAttrMap().put("method", refineMethodName((IDENTIFIER6!=null?IDENTIFIER6.getText():null))).put("params", (p!=null?p.st:null)));
                    }


                    }
                    break;
                case 11 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:420:5: ^( QUESTION_MARK IDENTIFIER ( ^( PRM (future_value_list= lhs_list )? ) )? )
                    {
                    match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_statement2383); 

                    match(input, Token.DOWN, null); 
                    IDENTIFIER7=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2385); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:420:32: ( ^( PRM (future_value_list= lhs_list )? ) )?
                    int alt66=2;
                    switch ( input.LA(1) ) {
                        case PRM:
                            {
                            alt66=1;
                            }
                            break;
                    }

                    switch (alt66) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:420:33: ^( PRM (future_value_list= lhs_list )? )
                            {
                            match(input,PRM,FOLLOW_PRM_in_statement2389); 

                            if ( input.LA(1)==Token.DOWN ) {
                                match(input, Token.DOWN, null); 
                                // nl/cwi/cacoj/creol/CreolWalker.g:420:56: (future_value_list= lhs_list )?
                                int alt65=2;
                                switch ( input.LA(1) ) {
                                    case IDENTIFIER:
                                    case AT:
                                    case UNDERSCORE:
                                        {
                                        alt65=1;
                                        }
                                        break;
                                }

                                switch (alt65) {
                                    case 1 :
                                        // nl/cwi/cacoj/creol/CreolWalker.g:420:56: future_value_list= lhs_list
                                        {
                                        pushFollow(FOLLOW_lhs_list_in_statement2393);
                                        future_value_list=lhs_list();

                                        state._fsp--;


                                        }
                                        break;

                                }


                                match(input, Token.UP, null); 
                            }

                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 421:3: -> future_value_get_tmpl(id=$IDENTIFIER.textvalues=future_value_list.lhslist)
                    {
                        retval.st = templateLib.getInstanceOf("future_value_get_tmpl",
                      new STAttrMap().put("id", (IDENTIFIER7!=null?IDENTIFIER7.getText():null)).put("values", future_value_list.lhslist));
                    }


                    }
                    break;
                case 12 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:423:5: ^( WHILE condition ( invariant )? ( measure )? body )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2424); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_statement2426);
                    condition();

                    state._fsp--;

                    // nl/cwi/cacoj/creol/CreolWalker.g:423:23: ( invariant )?
                    int alt67=2;
                    switch ( input.LA(1) ) {
                        case INV:
                            {
                            alt67=1;
                            }
                            break;
                    }

                    switch (alt67) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:423:23: invariant
                            {
                            pushFollow(FOLLOW_invariant_in_statement2428);
                            invariant();

                            state._fsp--;


                            }
                            break;

                    }

                    // nl/cwi/cacoj/creol/CreolWalker.g:423:34: ( measure )?
                    int alt68=2;
                    switch ( input.LA(1) ) {
                        case MEASURE:
                            {
                            alt68=1;
                            }
                            break;
                    }

                    switch (alt68) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:423:34: measure
                            {
                            pushFollow(FOLLOW_measure_in_statement2431);
                            measure();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_body_in_statement2434);
                    body();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:424:5: ^( DO body ( invariant )? ( measure )? condition )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2442); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_body_in_statement2444);
                    body();

                    state._fsp--;

                    // nl/cwi/cacoj/creol/CreolWalker.g:424:15: ( invariant )?
                    int alt69=2;
                    switch ( input.LA(1) ) {
                        case INV:
                            {
                            alt69=1;
                            }
                            break;
                    }

                    switch (alt69) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:424:15: invariant
                            {
                            pushFollow(FOLLOW_invariant_in_statement2446);
                            invariant();

                            state._fsp--;


                            }
                            break;

                    }

                    // nl/cwi/cacoj/creol/CreolWalker.g:424:27: ( measure )?
                    int alt70=2;
                    switch ( input.LA(1) ) {
                        case MEASURE:
                            {
                            alt70=1;
                            }
                            break;
                    }

                    switch (alt70) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:424:27: measure
                            {
                            pushFollow(FOLLOW_measure_in_statement2450);
                            measure();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_condition_in_statement2453);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:425:5: ^( IF ^( COND if_cond= expr ) ^( THEN if_then= statement ) ( ^( ELSE if_else= statement ) )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement2461); 

                    match(input, Token.DOWN, null); 
                    match(input,COND,FOLLOW_COND_in_statement2464); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement2468);
                    if_cond=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    match(input,THEN,FOLLOW_THEN_in_statement2472); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement2476);
                    if_then=statement();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:425:57: ( ^( ELSE if_else= statement ) )?
                    int alt71=2;
                    switch ( input.LA(1) ) {
                        case ELSE:
                            {
                            alt71=1;
                            }
                            break;
                    }

                    switch (alt71) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:425:58: ^( ELSE if_else= statement )
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_statement2481); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_statement_in_statement2485);
                            if_else=statement();

                            state._fsp--;


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 426:3: -> if_tmpl(cond=$if_cond.ststmt=$if_then.stelce=$if_else.st)
                    {
                        retval.st = templateLib.getInstanceOf("if_tmpl",
                      new STAttrMap().put("cond", (if_cond!=null?if_cond.st:null)).put("stmt", (if_then!=null?if_then.st:null)).put("elce", (if_else!=null?if_else.st:null)));
                    }


                    }
                    break;
                case 15 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:428:5: ^( AWAIT e= expr )
                    {
                    match(input,AWAIT,FOLLOW_AWAIT_in_statement2520); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement2524);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 429:3: -> await_expr_tmpl(e=$e.stmi_var_name=getMiNameForFutureLabel($e.st.toString()))
                    {
                        retval.st = templateLib.getInstanceOf("await_expr_tmpl",
                      new STAttrMap().put("e", (e!=null?e.st:null)).put("mi_var_name", getMiNameForFutureLabel((e!=null?e.st:null).toString())));
                    }


                    }
                    break;
                case 16 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:435:5: ^( AWAIT local_syn_bounded_call )
                    {
                    match(input,AWAIT,FOLLOW_AWAIT_in_statement2589); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_local_syn_bounded_call_in_statement2591);
                    local_syn_bounded_call();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:436:5: ^( AWAIT ^( DOT expr ^( METHOD IDENTIFIER syn_method_call_prm ) ) )
                    {
                    match(input,AWAIT,FOLLOW_AWAIT_in_statement2600); 

                    match(input, Token.DOWN, null); 
                    match(input,DOT,FOLLOW_DOT_in_statement2603); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement2605);
                    expr();

                    state._fsp--;

                    match(input,METHOD,FOLLOW_METHOD_in_statement2608); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2610); 
                    pushFollow(FOLLOW_syn_method_call_prm_in_statement2613);
                    syn_method_call_prm();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:437:5: ^( PROVE expr )
                    {
                    match(input,PROVE,FOLLOW_PROVE_in_statement2625); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement2627);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:438:5: ^( ASSERT expr )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2635); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement2637);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:439:5: ^( POSIT expr )
                    {
                    match(input,POSIT,FOLLOW_POSIT_in_statement2645); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_statement2647);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:440:5: ^( BEGIN statement )
                    {
                    match(input,BEGIN,FOLLOW_BEGIN_in_statement2655); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_statement_in_statement2657);
                    statement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:441:5: SKIP
                    {
                    match(input,SKIP,FOLLOW_SKIP_in_statement2664); 

                    }
                    break;
                case 23 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:442:5: RELEASE
                    {
                    match(input,RELEASE,FOLLOW_RELEASE_in_statement2670); 


                    // TEMPLATE REWRITE
                    // 443:5: -> release_tmpl()
                    {
                        retval.st = templateLib.getInstanceOf("release_tmpl");
                    }


                    }
                    break;
                case 24 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:445:5: BLOCK
                    {
                    match(input,BLOCK,FOLLOW_BLOCK_in_statement2689); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class non_local_syn_call_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "non_local_syn_call"
    // nl/cwi/cacoj/creol/CreolWalker.g:449:1: non_local_syn_call : ^( DOT object= expr (calls+= j_dotnotation )+ ( ^( AS type ) )? ) -> method_call_nonlocal_sync_tmpl(object=$object.stcalls=$calls);
    public final CreolWalker.non_local_syn_call_return non_local_syn_call() throws RecognitionException {
        CreolWalker.non_local_syn_call_return retval = new CreolWalker.non_local_syn_call_return();
        retval.start = input.LT(1);

        List list_calls=null;
        CreolWalker.expr_return object = null;

        RuleReturnScope calls = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:449:19: ( ^( DOT object= expr (calls+= j_dotnotation )+ ( ^( AS type ) )? ) -> method_call_nonlocal_sync_tmpl(object=$object.stcalls=$calls))
            // nl/cwi/cacoj/creol/CreolWalker.g:450:5: ^( DOT object= expr (calls+= j_dotnotation )+ ( ^( AS type ) )? )
            {
            match(input,DOT,FOLLOW_DOT_in_non_local_syn_call2704); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_non_local_syn_call2708);
            object=expr();

            state._fsp--;

            // nl/cwi/cacoj/creol/CreolWalker.g:450:29: (calls+= j_dotnotation )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                switch ( input.LA(1) ) {
                case METHOD:
                    {
                    alt73=1;
                    }
                    break;

                }

                switch (alt73) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:450:29: calls+= j_dotnotation
            	    {
            	    pushFollow(FOLLOW_j_dotnotation_in_non_local_syn_call2713);
            	    calls=j_dotnotation();

            	    state._fsp--;

            	    if (list_calls==null) list_calls=new ArrayList();
            	    list_calls.add(calls.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);

            // nl/cwi/cacoj/creol/CreolWalker.g:450:46: ( ^( AS type ) )?
            int alt74=2;
            switch ( input.LA(1) ) {
                case AS:
                    {
                    alt74=1;
                    }
                    break;
            }

            switch (alt74) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:450:47: ^( AS type )
                    {
                    match(input,AS,FOLLOW_AS_in_non_local_syn_call2718); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_non_local_syn_call2720);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 451:5: -> method_call_nonlocal_sync_tmpl(object=$object.stcalls=$calls)
            {
                retval.st = templateLib.getInstanceOf("method_call_nonlocal_sync_tmpl",
              new STAttrMap().put("object", (object!=null?object.st:null)).put("calls", list_calls));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "non_local_syn_call"

    public static class j_dotnotation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "j_dotnotation"
    // nl/cwi/cacoj/creol/CreolWalker.g:453:1: j_dotnotation : ^( METHOD IDENTIFIER mclsp= syn_method_call_prm ) -> method_call_nonlocal_sync_single_tmpl(method=refineMethodName($IDENTIFIER.text)inparams=mclsp.inparamsoutparams=mclsp.outparams);
    public final CreolWalker.j_dotnotation_return j_dotnotation() throws RecognitionException {
        CreolWalker.j_dotnotation_return retval = new CreolWalker.j_dotnotation_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER8=null;
        CreolWalker.syn_method_call_prm_return mclsp = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:453:14: ( ^( METHOD IDENTIFIER mclsp= syn_method_call_prm ) -> method_call_nonlocal_sync_single_tmpl(method=refineMethodName($IDENTIFIER.text)inparams=mclsp.inparamsoutparams=mclsp.outparams))
            // nl/cwi/cacoj/creol/CreolWalker.g:454:5: ^( METHOD IDENTIFIER mclsp= syn_method_call_prm )
            {
            match(input,METHOD,FOLLOW_METHOD_in_j_dotnotation2754); 

            match(input, Token.DOWN, null); 
            IDENTIFIER8=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_j_dotnotation2756); 
            pushFollow(FOLLOW_syn_method_call_prm_in_j_dotnotation2760);
            mclsp=syn_method_call_prm();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 455:5: -> method_call_nonlocal_sync_single_tmpl(method=refineMethodName($IDENTIFIER.text)inparams=mclsp.inparamsoutparams=mclsp.outparams)
            {
                retval.st = templateLib.getInstanceOf("method_call_nonlocal_sync_single_tmpl",
              new STAttrMap().put("method", refineMethodName((IDENTIFIER8!=null?IDENTIFIER8.getText():null))).put("inparams", mclsp.inparams).put("outparams", mclsp.outparams));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_dotnotation"

    public static class lhs_list_return extends TreeRuleReturnScope {
        public List lhslist = new ArrayList();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "lhs_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:466:1: lhs_list returns [List lhslist = new ArrayList()] : (l= lhs )+ ;
    public final CreolWalker.lhs_list_return lhs_list() throws RecognitionException {
        CreolWalker.lhs_list_return retval = new CreolWalker.lhs_list_return();
        retval.start = input.LT(1);

        CreolWalker.lhs_return l = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:467:3: ( (l= lhs )+ )
            // nl/cwi/cacoj/creol/CreolWalker.g:468:5: (l= lhs )+
            {
            // nl/cwi/cacoj/creol/CreolWalker.g:468:5: (l= lhs )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                case AT:
                case UNDERSCORE:
                    {
                    alt75=1;
                    }
                    break;

                }

                switch (alt75) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:468:6: l= lhs
            	    {
            	    pushFollow(FOLLOW_lhs_in_lhs_list2820);
            	    l=lhs();

            	    state._fsp--;

            	    retval.lhslist.add(l.lhs);

            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs_list"

    public static class lhs_return extends TreeRuleReturnScope {
        public CVariable lhs = new CVariable();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "lhs"
    // nl/cwi/cacoj/creol/CreolWalker.g:471:1: lhs returns [CVariable lhs = new CVariable()] : ( ^( AT IDENTIFIER t= type ) | IDENTIFIER | ^( UNDERSCORE ^( AS type ) ) );
    public final CreolWalker.lhs_return lhs() throws RecognitionException {
        CreolWalker.lhs_return retval = new CreolWalker.lhs_return();
        retval.start = input.LT(1);

        CommonTree IDENTIFIER9=null;
        CommonTree IDENTIFIER10=null;
        CreolWalker.type_return t = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:472:3: ( ^( AT IDENTIFIER t= type ) | IDENTIFIER | ^( UNDERSCORE ^( AS type ) ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                alt76=1;
                }
                break;
            case IDENTIFIER:
                {
                alt76=2;
                }
                break;
            case UNDERSCORE:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:473:5: ^( AT IDENTIFIER t= type )
                    {
                    match(input,AT,FOLLOW_AT_in_lhs2846); 

                    match(input, Token.DOWN, null); 
                    IDENTIFIER9=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lhs2848); 
                    pushFollow(FOLLOW_type_in_lhs2852);
                    t=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.lhs.name = (IDENTIFIER9!=null?IDENTIFIER9.getText():null); retval.lhs.type = t.ctype;

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:475:5: IDENTIFIER
                    {
                    IDENTIFIER10=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lhs2867); 
                    retval.lhs.name = (IDENTIFIER10!=null?IDENTIFIER10.getText():null);

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:477:5: ^( UNDERSCORE ^( AS type ) )
                    {
                    match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_lhs2881); 

                    match(input, Token.DOWN, null); 
                    match(input,AS,FOLLOW_AS_in_lhs2884); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_lhs2886);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs"

    public static class syn_method_call_prm_return extends TreeRuleReturnScope {
        public StringTemplate inparams; List outparams = new ArrayList();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "syn_method_call_prm"
    // nl/cwi/cacoj/creol/CreolWalker.g:480:1: syn_method_call_prm returns [StringTemplate inparams; List outparams = new ArrayList()] : ^( PRM (inlist= expr_list )? ^( SEMICOLON (outlist= lhs_list )? ) ) ;
    public final CreolWalker.syn_method_call_prm_return syn_method_call_prm() throws RecognitionException {
        CreolWalker.syn_method_call_prm_return retval = new CreolWalker.syn_method_call_prm_return();
        retval.start = input.LT(1);

        CreolWalker.expr_list_return inlist = null;

        CreolWalker.lhs_list_return outlist = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:481:3: ( ^( PRM (inlist= expr_list )? ^( SEMICOLON (outlist= lhs_list )? ) ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:482:5: ^( PRM (inlist= expr_list )? ^( SEMICOLON (outlist= lhs_list )? ) )
            {
            match(input,PRM,FOLLOW_PRM_in_syn_method_call_prm2918); 

            match(input, Token.DOWN, null); 
            // nl/cwi/cacoj/creol/CreolWalker.g:483:17: (inlist= expr_list )?
            int alt77=2;
            switch ( input.LA(1) ) {
                case LIST:
                case PAREN:
                case SET_OR_BINDING:
                case KOMMA:
                case IDENTIFIER:
                case IN:
                case NOT:
                case EQUIVALENCE:
                case IMPLICATION:
                case XOR:
                case OR:
                case AND:
                case EQUALITY:
                case INEQUALITY:
                case PROJECTION:
                case CONCAT:
                case PREPEND:
                case APPEND:
                case PLUS:
                case MINUS:
                case MULT:
                case DIV:
                case MOD:
                case POW:
                case NUMBER_SIGN:
                case STRING:
                case LESS_THAN:
                case GREATER_THAN:
                case LESS_OR_EQUAL:
                case GREATER_OR_EQUAL:
                case AT:
                case QUESTION_MARK:
                case AS:
                case TRUE:
                case FALSE:
                case INTEGER:
                case FLOAT:
                case THIS:
                case CALLER:
                case NULL:
                case NIL:
                case NOW:
                case HISTORY:
                case METHOD:
                    {
                    alt77=1;
                    }
                    break;
            }

            switch (alt77) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:483:17: inlist= expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_syn_method_call_prm2922);
                    inlist=expr_list();

                    state._fsp--;


                    }
                    break;

            }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_syn_method_call_prm2926); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:483:48: (outlist= lhs_list )?
                int alt78=2;
                switch ( input.LA(1) ) {
                    case IDENTIFIER:
                    case AT:
                    case UNDERSCORE:
                        {
                        alt78=1;
                        }
                        break;
                }

                switch (alt78) {
                    case 1 :
                        // nl/cwi/cacoj/creol/CreolWalker.g:483:48: outlist= lhs_list
                        {
                        pushFollow(FOLLOW_lhs_list_in_syn_method_call_prm2930);
                        outlist=lhs_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            retval.inparams = inlist==null?null:inlist.st; retval.outparams = outlist==null?null:outlist.lhslist;

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "syn_method_call_prm"

    public static class method_call_bounds_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "method_call_bounds"
    // nl/cwi/cacoj/creol/CreolWalker.g:488:1: method_call_bounds : ( ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? ^( PRM ( expr_list )? ) ) | ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? ^( PRM ( expr_list )? ) ) );
    public final CreolWalker.method_call_bounds_return method_call_bounds() throws RecognitionException {
        CreolWalker.method_call_bounds_return retval = new CreolWalker.method_call_bounds_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:488:20: ( ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? ^( PRM ( expr_list )? ) ) | ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? ^( PRM ( expr_list )? ) ) )
            int alt83=2;
            switch ( input.LA(1) ) {
            case BOUND_L:
                {
                alt83=1;
                }
                break;
            case BOUND_R:
                {
                alt83=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:488:22: ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? ^( PRM ( expr_list )? ) )
                    {
                    match(input,BOUND_L,FOLLOW_BOUND_L_in_method_call_bounds2958); 

                    match(input, Token.DOWN, null); 
                    match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2960); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:488:49: ( ^( BOUND_R CLASS_IDENTIFIER ) )?
                    int alt79=2;
                    switch ( input.LA(1) ) {
                        case BOUND_R:
                            {
                            alt79=1;
                            }
                            break;
                    }

                    switch (alt79) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:488:50: ^( BOUND_R CLASS_IDENTIFIER )
                            {
                            match(input,BOUND_R,FOLLOW_BOUND_R_in_method_call_bounds2964); 

                            match(input, Token.DOWN, null); 
                            match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2966); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    match(input,PRM,FOLLOW_PRM_in_method_call_bounds2972); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:488:86: ( expr_list )?
                        int alt80=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case METHOD:
                                {
                                alt80=1;
                                }
                                break;
                        }

                        switch (alt80) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:488:86: expr_list
                                {
                                pushFollow(FOLLOW_expr_list_in_method_call_bounds2974);
                                expr_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:489:6: ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? ^( PRM ( expr_list )? ) )
                    {
                    match(input,BOUND_R,FOLLOW_BOUND_R_in_method_call_bounds2985); 

                    match(input, Token.DOWN, null); 
                    match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2987); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:489:33: ( ^( BOUND_L CLASS_IDENTIFIER ) )?
                    int alt81=2;
                    switch ( input.LA(1) ) {
                        case BOUND_L:
                            {
                            alt81=1;
                            }
                            break;
                    }

                    switch (alt81) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:489:34: ^( BOUND_L CLASS_IDENTIFIER )
                            {
                            match(input,BOUND_L,FOLLOW_BOUND_L_in_method_call_bounds2991); 

                            match(input, Token.DOWN, null); 
                            match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2993); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    match(input,PRM,FOLLOW_PRM_in_method_call_bounds2999); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:489:70: ( expr_list )?
                        int alt82=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case METHOD:
                                {
                                alt82=1;
                                }
                                break;
                        }

                        switch (alt82) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:489:70: expr_list
                                {
                                pushFollow(FOLLOW_expr_list_in_method_call_bounds3001);
                                expr_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_call_bounds"

    public static class local_syn_bounded_call_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "local_syn_bounded_call"
    // nl/cwi/cacoj/creol/CreolWalker.g:492:1: local_syn_bounded_call : ( ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? syn_method_call_prm ) | ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? syn_method_call_prm ) );
    public final CreolWalker.local_syn_bounded_call_return local_syn_bounded_call() throws RecognitionException {
        CreolWalker.local_syn_bounded_call_return retval = new CreolWalker.local_syn_bounded_call_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:492:24: ( ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? syn_method_call_prm ) | ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? syn_method_call_prm ) )
            int alt86=2;
            switch ( input.LA(1) ) {
            case BOUND_L:
                {
                alt86=1;
                }
                break;
            case BOUND_R:
                {
                alt86=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:492:27: ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? syn_method_call_prm )
                    {
                    match(input,BOUND_L,FOLLOW_BOUND_L_in_local_syn_bounded_call3016); 

                    match(input, Token.DOWN, null); 
                    match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3018); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:492:54: ( ^( BOUND_R CLASS_IDENTIFIER ) )?
                    int alt84=2;
                    switch ( input.LA(1) ) {
                        case BOUND_R:
                            {
                            alt84=1;
                            }
                            break;
                    }

                    switch (alt84) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:492:55: ^( BOUND_R CLASS_IDENTIFIER )
                            {
                            match(input,BOUND_R,FOLLOW_BOUND_R_in_local_syn_bounded_call3022); 

                            match(input, Token.DOWN, null); 
                            match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3024); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_syn_method_call_prm_in_local_syn_bounded_call3029);
                    syn_method_call_prm();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:493:6: ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? syn_method_call_prm )
                    {
                    match(input,BOUND_R,FOLLOW_BOUND_R_in_local_syn_bounded_call3038); 

                    match(input, Token.DOWN, null); 
                    match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3040); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:493:33: ( ^( BOUND_L CLASS_IDENTIFIER ) )?
                    int alt85=2;
                    switch ( input.LA(1) ) {
                        case BOUND_L:
                            {
                            alt85=1;
                            }
                            break;
                    }

                    switch (alt85) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:493:34: ^( BOUND_L CLASS_IDENTIFIER )
                            {
                            match(input,BOUND_L,FOLLOW_BOUND_L_in_local_syn_bounded_call3044); 

                            match(input, Token.DOWN, null); 
                            match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3046); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_syn_method_call_prm_in_local_syn_bounded_call3051);
                    syn_method_call_prm();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "local_syn_bounded_call"

    public static class expr_stmt_method_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr_stmt_method"
    // nl/cwi/cacoj/creol/CreolWalker.g:496:1: expr_stmt_method : ^( METHOD expr ) ;
    public final CreolWalker.expr_stmt_method_return expr_stmt_method() throws RecognitionException {
        CreolWalker.expr_stmt_method_return retval = new CreolWalker.expr_stmt_method_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:496:17: ( ^( METHOD expr ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:496:19: ^( METHOD expr )
            {
            match(input,METHOD,FOLLOW_METHOD_in_expr_stmt_method3062); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_expr_stmt_method3064);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_stmt_method"

    public static class expr_or_new_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr_or_new"
    // nl/cwi/cacoj/creol/CreolWalker.g:499:1: expr_or_new : (e= expr -> expr_tmpl(e=$e.st) | ^( NEW CLASS_IDENTIFIER (plist= parameter_list )? ) -> new_object_statement_tmpl(cid=$CLASS_IDENTIFIER.textplist=$plist.st));
    public final CreolWalker.expr_or_new_return expr_or_new() throws RecognitionException {
        CreolWalker.expr_or_new_return retval = new CreolWalker.expr_or_new_return();
        retval.start = input.LT(1);

        CommonTree CLASS_IDENTIFIER11=null;
        CreolWalker.expr_return e = null;

        CreolWalker.parameter_list_return plist = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:500:3: (e= expr -> expr_tmpl(e=$e.st) | ^( NEW CLASS_IDENTIFIER (plist= parameter_list )? ) -> new_object_statement_tmpl(cid=$CLASS_IDENTIFIER.textplist=$plist.st))
            int alt88=2;
            switch ( input.LA(1) ) {
            case LIST:
            case PAREN:
            case SET_OR_BINDING:
            case IDENTIFIER:
            case IN:
            case NOT:
            case EQUIVALENCE:
            case IMPLICATION:
            case XOR:
            case OR:
            case AND:
            case EQUALITY:
            case INEQUALITY:
            case PROJECTION:
            case CONCAT:
            case PREPEND:
            case APPEND:
            case PLUS:
            case MINUS:
            case MULT:
            case DIV:
            case MOD:
            case POW:
            case NUMBER_SIGN:
            case STRING:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
            case AT:
            case QUESTION_MARK:
            case AS:
            case TRUE:
            case FALSE:
            case INTEGER:
            case FLOAT:
            case THIS:
            case CALLER:
            case NULL:
            case NIL:
            case NOW:
            case HISTORY:
            case METHOD:
                {
                alt88=1;
                }
                break;
            case NEW:
                {
                alt88=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:501:7: e= expr
                    {
                    pushFollow(FOLLOW_expr_in_expr_or_new3087);
                    e=expr();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 502:7: -> expr_tmpl(e=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_tmpl",
                      new STAttrMap().put("e", (e!=null?e.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:503:5: ^( NEW CLASS_IDENTIFIER (plist= parameter_list )? )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expr_or_new3110); 

                    match(input, Token.DOWN, null); 
                    CLASS_IDENTIFIER11=(CommonTree)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_expr_or_new3112); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:503:33: (plist= parameter_list )?
                    int alt87=2;
                    switch ( input.LA(1) ) {
                        case PRM:
                            {
                            alt87=1;
                            }
                            break;
                    }

                    switch (alt87) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:503:33: plist= parameter_list
                            {
                            pushFollow(FOLLOW_parameter_list_in_expr_or_new3116);
                            plist=parameter_list();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 504:5: -> new_object_statement_tmpl(cid=$CLASS_IDENTIFIER.textplist=$plist.st)
                    {
                        retval.st = templateLib.getInstanceOf("new_object_statement_tmpl",
                      new STAttrMap().put("cid", (CLASS_IDENTIFIER11!=null?CLASS_IDENTIFIER11.getText():null)).put("plist", (plist!=null?plist.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_or_new"

    public static class expr_or_new_list_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr_or_new_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:507:1: expr_or_new_list : ( ^( KOMMA f= expr_or_new_list s= expr_or_new_list ) -> expr_or_new_list_tmpl(e1=$f.ste2=$s.st) | e= expr_or_new -> expr_or_new_tmpl(e=$e.st) | nlsc= non_local_syn_call -> non_local_syn_call_tmpl(st=$nlsc.st));
    public final CreolWalker.expr_or_new_list_return expr_or_new_list() throws RecognitionException {
        CreolWalker.expr_or_new_list_return retval = new CreolWalker.expr_or_new_list_return();
        retval.start = input.LT(1);

        CreolWalker.expr_or_new_list_return f = null;

        CreolWalker.expr_or_new_list_return s = null;

        CreolWalker.expr_or_new_return e = null;

        CreolWalker.non_local_syn_call_return nlsc = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:507:17: ( ^( KOMMA f= expr_or_new_list s= expr_or_new_list ) -> expr_or_new_list_tmpl(e1=$f.ste2=$s.st) | e= expr_or_new -> expr_or_new_tmpl(e=$e.st) | nlsc= non_local_syn_call -> non_local_syn_call_tmpl(st=$nlsc.st))
            int alt89=3;
            switch ( input.LA(1) ) {
            case KOMMA:
                {
                alt89=1;
                }
                break;
            case LIST:
            case PAREN:
            case SET_OR_BINDING:
            case IDENTIFIER:
            case IN:
            case NOT:
            case EQUIVALENCE:
            case IMPLICATION:
            case XOR:
            case OR:
            case AND:
            case EQUALITY:
            case INEQUALITY:
            case PROJECTION:
            case CONCAT:
            case PREPEND:
            case APPEND:
            case PLUS:
            case MINUS:
            case MULT:
            case DIV:
            case MOD:
            case POW:
            case NUMBER_SIGN:
            case STRING:
            case NEW:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
            case AT:
            case QUESTION_MARK:
            case AS:
            case TRUE:
            case FALSE:
            case INTEGER:
            case FLOAT:
            case THIS:
            case CALLER:
            case NULL:
            case NIL:
            case NOW:
            case HISTORY:
            case METHOD:
                {
                alt89=2;
                }
                break;
            case DOT:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:508:7: ^( KOMMA f= expr_or_new_list s= expr_or_new_list )
                    {
                    match(input,KOMMA,FOLLOW_KOMMA_in_expr_or_new_list3154); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_or_new_list_in_expr_or_new_list3158);
                    f=expr_or_new_list();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_or_new_list_in_expr_or_new_list3162);
                    s=expr_or_new_list();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 509:7: -> expr_or_new_list_tmpl(e1=$f.ste2=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_or_new_list_tmpl",
                      new STAttrMap().put("e1", (f!=null?f.st:null)).put("e2", (s!=null?s.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:510:5: e= expr_or_new
                    {
                    pushFollow(FOLLOW_expr_or_new_in_expr_or_new_list3191);
                    e=expr_or_new();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 511:5: -> expr_or_new_tmpl(e=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_or_new_tmpl",
                      new STAttrMap().put("e", (e!=null?e.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:512:5: nlsc= non_local_syn_call
                    {
                    pushFollow(FOLLOW_non_local_syn_call_in_expr_or_new_list3212);
                    nlsc=non_local_syn_call();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 513:5: -> non_local_syn_call_tmpl(st=$nlsc.st)
                    {
                        retval.st = templateLib.getInstanceOf("non_local_syn_call_tmpl",
                      new STAttrMap().put("st", (nlsc!=null?nlsc.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_or_new_list"

    public static class condition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condition"
    // nl/cwi/cacoj/creol/CreolWalker.g:516:1: condition : ^( COND expr ) ;
    public final CreolWalker.condition_return condition() throws RecognitionException {
        CreolWalker.condition_return retval = new CreolWalker.condition_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:516:11: ( ^( COND expr ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:516:13: ^( COND expr )
            {
            match(input,COND,FOLLOW_COND_in_condition3236); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_condition3238);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class body_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "body"
    // nl/cwi/cacoj/creol/CreolWalker.g:519:1: body : ^( BODY statement ) ;
    public final CreolWalker.body_return body() throws RecognitionException {
        CreolWalker.body_return retval = new CreolWalker.body_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:519:6: ( ^( BODY statement ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:519:8: ^( BODY statement )
            {
            match(input,BODY,FOLLOW_BODY_in_body3250); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_in_body3252);
            statement();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class measure_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "measure"
    // nl/cwi/cacoj/creol/CreolWalker.g:522:1: measure : ^( MEASURE expr ^( BY id_or_op ) ) ;
    public final CreolWalker.measure_return measure() throws RecognitionException {
        CreolWalker.measure_return retval = new CreolWalker.measure_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:522:10: ( ^( MEASURE expr ^( BY id_or_op ) ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:522:12: ^( MEASURE expr ^( BY id_or_op ) )
            {
            match(input,MEASURE,FOLLOW_MEASURE_in_measure3265); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_measure3267);
            expr();

            state._fsp--;

            match(input,BY,FOLLOW_BY_in_measure3270); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_id_or_op_in_measure3272);
            id_or_op();

            state._fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "measure"

    public static class invariant_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "invariant"
    // nl/cwi/cacoj/creol/CreolWalker.g:525:1: invariant : ^( INV expr ) ;
    public final CreolWalker.invariant_return invariant() throws RecognitionException {
        CreolWalker.invariant_return retval = new CreolWalker.invariant_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:525:11: ( ^( INV expr ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:525:13: ^( INV expr )
            {
            match(input,INV,FOLLOW_INV_in_invariant3285); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_invariant3287);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invariant"

    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // nl/cwi/cacoj/creol/CreolWalker.g:530:1: expr : ( ^( IN expr expr ) | ^( EQUIVALENCE expr expr ) | ^( IMPLICATION expr expr ) | ^( XOR l= expr r= expr ) -> expr_xor_tmpl(left=$l.stright=$r.st) | ^( OR l= expr r= expr ) -> expr_or_tmpl(left=$l.stright=$r.st) | ^( AND l= expr r= expr ) -> expr_and_tmpl(left=$l.stright=$r.st) | ^( NOT r= expr ) -> expr_not_tmpl(right=$r.st) | ^( EQUALITY l= expr r= expr ) -> expr_eq_tmpl(left=$l.stright=$r.st) | ^( INEQUALITY l= expr r= expr ) -> expr_ne_tmpl(left=$l.stright=$r.st) | ^(op= comp_op l= expr r= expr ) -> expr_cmp_tmpl(op=$op.textleft=$l.stright=$r.st) | ^( PROJECTION expr expr ) | ^( CONCAT expr expr ) | ^( PREPEND expr expr ) | ^( APPEND expr expr ) | ^( PLUS l= expr r= expr ) -> expr_plus_tmpl(left=$l.stright=$r.st) | ^( MINUS l= expr (r= expr )? ) -> expr_minus_tmpl(left=$l.stright=$r.st) | ^( MULT l= expr r= expr ) -> expr_mult_tmpl(left=$l.stright=$r.st) | ^( DIV l= expr r= expr ) -> expr_div_tmpl(left=$l.stright=$r.st) | ^( MOD l= expr r= expr ) -> expr_mod_tmpl(left=$l.stright=$r.st) | ^( POW l= expr r= expr ) -> expr_pow_tmpl(left=$l.stright=$r.st) | ^( NUMBER_SIGN r= expr ) -> expr_numsgn_tmpl(ns=$NUMBER_SIGN.texte=$r.st) | ^( METHOD IDENTIFIER ^( PRM ( expr_list )? ) ) | a= atom -> atom_tmpl(a=$a.st));
    public final CreolWalker.expr_return expr() throws RecognitionException {
        CreolWalker.expr_return retval = new CreolWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree NUMBER_SIGN12=null;
        CreolWalker.expr_return l = null;

        CreolWalker.expr_return r = null;

        CreolWalker.comp_op_return op = null;

        CreolWalker.atom_return a = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:531:1: ( ^( IN expr expr ) | ^( EQUIVALENCE expr expr ) | ^( IMPLICATION expr expr ) | ^( XOR l= expr r= expr ) -> expr_xor_tmpl(left=$l.stright=$r.st) | ^( OR l= expr r= expr ) -> expr_or_tmpl(left=$l.stright=$r.st) | ^( AND l= expr r= expr ) -> expr_and_tmpl(left=$l.stright=$r.st) | ^( NOT r= expr ) -> expr_not_tmpl(right=$r.st) | ^( EQUALITY l= expr r= expr ) -> expr_eq_tmpl(left=$l.stright=$r.st) | ^( INEQUALITY l= expr r= expr ) -> expr_ne_tmpl(left=$l.stright=$r.st) | ^(op= comp_op l= expr r= expr ) -> expr_cmp_tmpl(op=$op.textleft=$l.stright=$r.st) | ^( PROJECTION expr expr ) | ^( CONCAT expr expr ) | ^( PREPEND expr expr ) | ^( APPEND expr expr ) | ^( PLUS l= expr r= expr ) -> expr_plus_tmpl(left=$l.stright=$r.st) | ^( MINUS l= expr (r= expr )? ) -> expr_minus_tmpl(left=$l.stright=$r.st) | ^( MULT l= expr r= expr ) -> expr_mult_tmpl(left=$l.stright=$r.st) | ^( DIV l= expr r= expr ) -> expr_div_tmpl(left=$l.stright=$r.st) | ^( MOD l= expr r= expr ) -> expr_mod_tmpl(left=$l.stright=$r.st) | ^( POW l= expr r= expr ) -> expr_pow_tmpl(left=$l.stright=$r.st) | ^( NUMBER_SIGN r= expr ) -> expr_numsgn_tmpl(ns=$NUMBER_SIGN.texte=$r.st) | ^( METHOD IDENTIFIER ^( PRM ( expr_list )? ) ) | a= atom -> atom_tmpl(a=$a.st))
            int alt92=23;
            switch ( input.LA(1) ) {
            case IN:
                {
                alt92=1;
                }
                break;
            case EQUIVALENCE:
                {
                alt92=2;
                }
                break;
            case IMPLICATION:
                {
                alt92=3;
                }
                break;
            case XOR:
                {
                alt92=4;
                }
                break;
            case OR:
                {
                alt92=5;
                }
                break;
            case AND:
                {
                alt92=6;
                }
                break;
            case NOT:
                {
                alt92=7;
                }
                break;
            case EQUALITY:
                {
                alt92=8;
                }
                break;
            case INEQUALITY:
                {
                alt92=9;
                }
                break;
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
                {
                alt92=10;
                }
                break;
            case PROJECTION:
                {
                alt92=11;
                }
                break;
            case CONCAT:
                {
                alt92=12;
                }
                break;
            case PREPEND:
                {
                alt92=13;
                }
                break;
            case APPEND:
                {
                alt92=14;
                }
                break;
            case PLUS:
                {
                alt92=15;
                }
                break;
            case MINUS:
                {
                alt92=16;
                }
                break;
            case MULT:
                {
                alt92=17;
                }
                break;
            case DIV:
                {
                alt92=18;
                }
                break;
            case MOD:
                {
                alt92=19;
                }
                break;
            case POW:
                {
                alt92=20;
                }
                break;
            case NUMBER_SIGN:
                {
                alt92=21;
                }
                break;
            case METHOD:
                {
                alt92=22;
                }
                break;
            case LIST:
            case PAREN:
            case SET_OR_BINDING:
            case IDENTIFIER:
            case STRING:
            case AT:
            case QUESTION_MARK:
            case AS:
            case TRUE:
            case FALSE:
            case INTEGER:
            case FLOAT:
            case THIS:
            case CALLER:
            case NULL:
            case NIL:
            case NOW:
            case HISTORY:
                {
                alt92=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:532:7: ^( IN expr expr )
                    {
                    match(input,IN,FOLLOW_IN_in_expr3310); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3312);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3314);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:533:5: ^( EQUIVALENCE expr expr )
                    {
                    match(input,EQUIVALENCE,FOLLOW_EQUIVALENCE_in_expr3322); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3324);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3326);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:534:5: ^( IMPLICATION expr expr )
                    {
                    match(input,IMPLICATION,FOLLOW_IMPLICATION_in_expr3334); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3336);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3338);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:535:5: ^( XOR l= expr r= expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr3346); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3350);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3354);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 535:26: -> expr_xor_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_xor_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:536:5: ^( OR l= expr r= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr3376); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3380);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3384);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 536:25: -> expr_or_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_or_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 6 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:537:5: ^( AND l= expr r= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr3406); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3410);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3414);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 537:26: -> expr_and_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_and_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 7 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:538:5: ^( NOT r= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr3436); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3440);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 538:19: -> expr_not_tmpl(right=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_not_tmpl",
                      new STAttrMap().put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 8 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:539:5: ^( EQUALITY l= expr r= expr )
                    {
                    match(input,EQUALITY,FOLLOW_EQUALITY_in_expr3457); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3461);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3465);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 539:31: -> expr_eq_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_eq_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 9 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:540:5: ^( INEQUALITY l= expr r= expr )
                    {
                    match(input,INEQUALITY,FOLLOW_INEQUALITY_in_expr3487); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3491);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3495);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 540:33: -> expr_ne_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_ne_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 10 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:541:5: ^(op= comp_op l= expr r= expr )
                    {
                    pushFollow(FOLLOW_comp_op_in_expr3519);
                    op=comp_op();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3523);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3527);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 541:33: -> expr_cmp_tmpl(op=$op.textleft=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_cmp_tmpl",
                      new STAttrMap().put("op", (op!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(op.start),
                      input.getTreeAdaptor().getTokenStopIndex(op.start))):null)).put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 11 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:542:5: ^( PROJECTION expr expr )
                    {
                    match(input,PROJECTION,FOLLOW_PROJECTION_in_expr3554); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3556);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3558);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:543:5: ^( CONCAT expr expr )
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_expr3566); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3568);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3570);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:544:5: ^( PREPEND expr expr )
                    {
                    match(input,PREPEND,FOLLOW_PREPEND_in_expr3578); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3580);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3582);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:545:5: ^( APPEND expr expr )
                    {
                    match(input,APPEND,FOLLOW_APPEND_in_expr3590); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3592);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3594);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:546:5: ^( PLUS l= expr r= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr3602); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3606);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3610);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 546:27: -> expr_plus_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_plus_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 16 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:547:5: ^( MINUS l= expr (r= expr )? )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr3634); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3638);
                    l=expr();

                    state._fsp--;

                    // nl/cwi/cacoj/creol/CreolWalker.g:547:21: (r= expr )?
                    int alt90=2;
                    switch ( input.LA(1) ) {
                        case LIST:
                        case PAREN:
                        case SET_OR_BINDING:
                        case IDENTIFIER:
                        case IN:
                        case NOT:
                        case EQUIVALENCE:
                        case IMPLICATION:
                        case XOR:
                        case OR:
                        case AND:
                        case EQUALITY:
                        case INEQUALITY:
                        case PROJECTION:
                        case CONCAT:
                        case PREPEND:
                        case APPEND:
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case MOD:
                        case POW:
                        case NUMBER_SIGN:
                        case STRING:
                        case LESS_THAN:
                        case GREATER_THAN:
                        case LESS_OR_EQUAL:
                        case GREATER_OR_EQUAL:
                        case AT:
                        case QUESTION_MARK:
                        case AS:
                        case TRUE:
                        case FALSE:
                        case INTEGER:
                        case FLOAT:
                        case THIS:
                        case CALLER:
                        case NULL:
                        case NIL:
                        case NOW:
                        case HISTORY:
                        case METHOD:
                            {
                            alt90=1;
                            }
                            break;
                    }

                    switch (alt90) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:547:21: r= expr
                            {
                            pushFollow(FOLLOW_expr_in_expr3642);
                            r=expr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 547:29: -> expr_minus_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_minus_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 17 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:548:5: ^( MULT l= expr r= expr )
                    {
                    match(input,MULT,FOLLOW_MULT_in_expr3665); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3669);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3673);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 548:27: -> expr_mult_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_mult_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 18 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:549:5: ^( DIV l= expr r= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr3695); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3699);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3703);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 549:26: -> expr_div_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_div_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 19 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:550:5: ^( MOD l= expr r= expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr3725); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3729);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3733);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 550:26: -> expr_mod_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_mod_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 20 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:551:5: ^( POW l= expr r= expr )
                    {
                    match(input,POW,FOLLOW_POW_in_expr3755); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3759);
                    l=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr3763);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 551:26: -> expr_pow_tmpl(left=$l.stright=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_pow_tmpl",
                      new STAttrMap().put("left", (l!=null?l.st:null)).put("right", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 21 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:552:5: ^( NUMBER_SIGN r= expr )
                    {
                    NUMBER_SIGN12=(CommonTree)match(input,NUMBER_SIGN,FOLLOW_NUMBER_SIGN_in_expr3785); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr3789);
                    r=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 552:27: -> expr_numsgn_tmpl(ns=$NUMBER_SIGN.texte=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_numsgn_tmpl",
                      new STAttrMap().put("ns", (NUMBER_SIGN12!=null?NUMBER_SIGN12.getText():null)).put("e", (r!=null?r.st:null)));
                    }


                    }
                    break;
                case 22 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:553:5: ^( METHOD IDENTIFIER ^( PRM ( expr_list )? ) )
                    {
                    match(input,METHOD,FOLLOW_METHOD_in_expr3811); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr3813); 
                    match(input,PRM,FOLLOW_PRM_in_expr3816); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:553:31: ( expr_list )?
                        int alt91=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case METHOD:
                                {
                                alt91=1;
                                }
                                break;
                        }

                        switch (alt91) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:553:31: expr_list
                                {
                                pushFollow(FOLLOW_expr_list_in_expr3818);
                                expr_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    match(input, Token.UP, null); 

                    }
                    break;
                case 23 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:554:5: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_expr3830);
                    a=atom();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 554:12: -> atom_tmpl(a=$a.st)
                    {
                        retval.st = templateLib.getInstanceOf("atom_tmpl",
                      new STAttrMap().put("a", (a!=null?a.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class comp_op_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "comp_op"
    // nl/cwi/cacoj/creol/CreolWalker.g:557:1: comp_op : ( LESS_THAN -> comp_op_tmpl(op=\"<\") | GREATER_THAN -> comp_op_tmpl(op=\">\") | LESS_OR_EQUAL -> comp_op_tmpl(op=\"<=\") | GREATER_OR_EQUAL -> comp_op_tmpl(op=\">=\"));
    public final CreolWalker.comp_op_return comp_op() throws RecognitionException {
        CreolWalker.comp_op_return retval = new CreolWalker.comp_op_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:557:10: ( LESS_THAN -> comp_op_tmpl(op=\"<\") | GREATER_THAN -> comp_op_tmpl(op=\">\") | LESS_OR_EQUAL -> comp_op_tmpl(op=\"<=\") | GREATER_OR_EQUAL -> comp_op_tmpl(op=\">=\"))
            int alt93=4;
            switch ( input.LA(1) ) {
            case LESS_THAN:
                {
                alt93=1;
                }
                break;
            case GREATER_THAN:
                {
                alt93=2;
                }
                break;
            case LESS_OR_EQUAL:
                {
                alt93=3;
                }
                break;
            case GREATER_OR_EQUAL:
                {
                alt93=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:557:12: LESS_THAN
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_comp_op3850); 


                    // TEMPLATE REWRITE
                    // 557:22: -> comp_op_tmpl(op=\"<\")
                    {
                        retval.st = templateLib.getInstanceOf("comp_op_tmpl",
                      new STAttrMap().put("op", "<"));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:558:5: GREATER_THAN
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_comp_op3865); 


                    // TEMPLATE REWRITE
                    // 558:18: -> comp_op_tmpl(op=\">\")
                    {
                        retval.st = templateLib.getInstanceOf("comp_op_tmpl",
                      new STAttrMap().put("op", ">"));
                    }


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:559:5: LESS_OR_EQUAL
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_comp_op3880); 


                    // TEMPLATE REWRITE
                    // 559:19: -> comp_op_tmpl(op=\"<=\")
                    {
                        retval.st = templateLib.getInstanceOf("comp_op_tmpl",
                      new STAttrMap().put("op", "<="));
                    }


                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:560:5: GREATER_OR_EQUAL
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_comp_op3895); 


                    // TEMPLATE REWRITE
                    // 560:22: -> comp_op_tmpl(op=\">=\")
                    {
                        retval.st = templateLib.getInstanceOf("comp_op_tmpl",
                      new STAttrMap().put("op", ">="));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comp_op"

    public static class atom_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // nl/cwi/cacoj/creol/CreolWalker.g:563:1: atom : ( TRUE -> atom_literal_tmpl(literal=\"true\") | FALSE -> atom_literal_tmpl(literal=\"false\") | INTEGER -> atom_literal_tmpl(literal=$INTEGER.text) | FLOAT -> atom_literal_tmpl(literal=$FLOAT.text) | STRING -> atom_literal_tmpl(literal=$STRING.text) | IDENTIFIER -> atom_literal_tmpl(literal=$IDENTIFIER.text) | ^( QUESTION_MARK IDENTIFIER ) -> awaiting_future_value_tmpl(id=$IDENTIFIER.text) | ^( AT IDENTIFIER type ) | THIS -> atom_literal_tmpl(literal=\"this\") | ^( AS THIS type ) | CALLER | NULL -> atom_literal_tmpl(literal=\"null\") | NIL -> atom_literal_tmpl(literal=\"null\") | NOW | HISTORY | ^( LIST ( expr_list )? ) | ^( SET_OR_BINDING expr_in_braces ) | ^( PAREN ( expr_in_paren )? ) );
    public final CreolWalker.atom_return atom() throws RecognitionException {
        CreolWalker.atom_return retval = new CreolWalker.atom_return();
        retval.start = input.LT(1);

        CommonTree INTEGER13=null;
        CommonTree FLOAT14=null;
        CommonTree STRING15=null;
        CommonTree IDENTIFIER16=null;
        CommonTree IDENTIFIER17=null;

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:563:7: ( TRUE -> atom_literal_tmpl(literal=\"true\") | FALSE -> atom_literal_tmpl(literal=\"false\") | INTEGER -> atom_literal_tmpl(literal=$INTEGER.text) | FLOAT -> atom_literal_tmpl(literal=$FLOAT.text) | STRING -> atom_literal_tmpl(literal=$STRING.text) | IDENTIFIER -> atom_literal_tmpl(literal=$IDENTIFIER.text) | ^( QUESTION_MARK IDENTIFIER ) -> awaiting_future_value_tmpl(id=$IDENTIFIER.text) | ^( AT IDENTIFIER type ) | THIS -> atom_literal_tmpl(literal=\"this\") | ^( AS THIS type ) | CALLER | NULL -> atom_literal_tmpl(literal=\"null\") | NIL -> atom_literal_tmpl(literal=\"null\") | NOW | HISTORY | ^( LIST ( expr_list )? ) | ^( SET_OR_BINDING expr_in_braces ) | ^( PAREN ( expr_in_paren )? ) )
            int alt96=18;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt96=1;
                }
                break;
            case FALSE:
                {
                alt96=2;
                }
                break;
            case INTEGER:
                {
                alt96=3;
                }
                break;
            case FLOAT:
                {
                alt96=4;
                }
                break;
            case STRING:
                {
                alt96=5;
                }
                break;
            case IDENTIFIER:
                {
                alt96=6;
                }
                break;
            case QUESTION_MARK:
                {
                alt96=7;
                }
                break;
            case AT:
                {
                alt96=8;
                }
                break;
            case THIS:
                {
                alt96=9;
                }
                break;
            case AS:
                {
                alt96=10;
                }
                break;
            case CALLER:
                {
                alt96=11;
                }
                break;
            case NULL:
                {
                alt96=12;
                }
                break;
            case NIL:
                {
                alt96=13;
                }
                break;
            case NOW:
                {
                alt96=14;
                }
                break;
            case HISTORY:
                {
                alt96=15;
                }
                break;
            case LIST:
                {
                alt96=16;
                }
                break;
            case SET_OR_BINDING:
                {
                alt96=17;
                }
                break;
            case PAREN:
                {
                alt96=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:563:9: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_atom3915); 


                    // TEMPLATE REWRITE
                    // 563:14: -> atom_literal_tmpl(literal=\"true\")
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", "true"));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:564:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_atom3930); 


                    // TEMPLATE REWRITE
                    // 564:11: -> atom_literal_tmpl(literal=\"false\")
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", "false"));
                    }


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:565:5: INTEGER
                    {
                    INTEGER13=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_atom3945); 


                    // TEMPLATE REWRITE
                    // 565:13: -> atom_literal_tmpl(literal=$INTEGER.text)
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", (INTEGER13!=null?INTEGER13.getText():null)));
                    }


                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:566:5: FLOAT
                    {
                    FLOAT14=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_atom3960); 


                    // TEMPLATE REWRITE
                    // 566:11: -> atom_literal_tmpl(literal=$FLOAT.text)
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", (FLOAT14!=null?FLOAT14.getText():null)));
                    }


                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:567:5: STRING
                    {
                    STRING15=(CommonTree)match(input,STRING,FOLLOW_STRING_in_atom3975); 


                    // TEMPLATE REWRITE
                    // 567:12: -> atom_literal_tmpl(literal=$STRING.text)
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", (STRING15!=null?STRING15.getText():null)));
                    }


                    }
                    break;
                case 6 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:568:5: IDENTIFIER
                    {
                    IDENTIFIER16=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom3990); 


                    // TEMPLATE REWRITE
                    // 568:16: -> atom_literal_tmpl(literal=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", (IDENTIFIER16!=null?IDENTIFIER16.getText():null)));
                    }


                    }
                    break;
                case 7 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:569:5: ^( QUESTION_MARK IDENTIFIER )
                    {
                    match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_atom4006); 

                    match(input, Token.DOWN, null); 
                    IDENTIFIER17=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom4008); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 570:3: -> awaiting_future_value_tmpl(id=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("awaiting_future_value_tmpl",
                      new STAttrMap().put("id", (IDENTIFIER17!=null?IDENTIFIER17.getText():null)));
                    }


                    }
                    break;
                case 8 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:572:5: ^( AT IDENTIFIER type )
                    {
                    match(input,AT,FOLLOW_AT_in_atom4031); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom4033); 
                    pushFollow(FOLLOW_type_in_atom4035);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:573:5: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_atom4042); 


                    // TEMPLATE REWRITE
                    // 573:10: -> atom_literal_tmpl(literal=\"this\")
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", "this"));
                    }


                    }
                    break;
                case 10 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:574:5: ^( AS THIS type )
                    {
                    match(input,AS,FOLLOW_AS_in_atom4058); 

                    match(input, Token.DOWN, null); 
                    match(input,THIS,FOLLOW_THIS_in_atom4060); 
                    pushFollow(FOLLOW_type_in_atom4062);
                    type();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:575:5: CALLER
                    {
                    match(input,CALLER,FOLLOW_CALLER_in_atom4069); 

                    }
                    break;
                case 12 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:576:5: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_atom4075); 


                    // TEMPLATE REWRITE
                    // 576:10: -> atom_literal_tmpl(literal=\"null\")
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", "null"));
                    }


                    }
                    break;
                case 13 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:577:5: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_atom4090); 


                    // TEMPLATE REWRITE
                    // 577:9: -> atom_literal_tmpl(literal=\"null\")
                    {
                        retval.st = templateLib.getInstanceOf("atom_literal_tmpl",
                      new STAttrMap().put("literal", "null"));
                    }


                    }
                    break;
                case 14 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:578:5: NOW
                    {
                    match(input,NOW,FOLLOW_NOW_in_atom4105); 

                    }
                    break;
                case 15 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:579:5: HISTORY
                    {
                    match(input,HISTORY,FOLLOW_HISTORY_in_atom4111); 

                    }
                    break;
                case 16 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:580:5: ^( LIST ( expr_list )? )
                    {
                    match(input,LIST,FOLLOW_LIST_in_atom4118); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:580:12: ( expr_list )?
                        int alt94=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case METHOD:
                                {
                                alt94=1;
                                }
                                break;
                        }

                        switch (alt94) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:580:12: expr_list
                                {
                                pushFollow(FOLLOW_expr_list_in_atom4120);
                                expr_list();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 17 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:581:5: ^( SET_OR_BINDING expr_in_braces )
                    {
                    match(input,SET_OR_BINDING,FOLLOW_SET_OR_BINDING_in_atom4129); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_braces_in_atom4131);
                    expr_in_braces();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:582:5: ^( PAREN ( expr_in_paren )? )
                    {
                    match(input,PAREN,FOLLOW_PAREN_in_atom4139); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:582:13: ( expr_in_paren )?
                        int alt95=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case FORALL:
                            case EXISTS:
                            case SOME:
                            case METHOD:
                                {
                                alt95=1;
                                }
                                break;
                        }

                        switch (alt95) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:582:13: expr_in_paren
                                {
                                pushFollow(FOLLOW_expr_in_paren_in_atom4141);
                                expr_in_paren();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class expr_in_braces_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr_in_braces"
    // nl/cwi/cacoj/creol/CreolWalker.g:586:1: expr_in_braces : ( ^( SET ( set )? ) | ^( BINDING binding_list ) );
    public final CreolWalker.expr_in_braces_return expr_in_braces() throws RecognitionException {
        CreolWalker.expr_in_braces_return retval = new CreolWalker.expr_in_braces_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:586:16: ( ^( SET ( set )? ) | ^( BINDING binding_list ) )
            int alt98=2;
            switch ( input.LA(1) ) {
            case SET:
                {
                alt98=1;
                }
                break;
            case BINDING:
                {
                alt98=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:586:18: ^( SET ( set )? )
                    {
                    match(input,SET,FOLLOW_SET_in_expr_in_braces4155); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // nl/cwi/cacoj/creol/CreolWalker.g:586:24: ( set )?
                        int alt97=2;
                        switch ( input.LA(1) ) {
                            case LIST:
                            case PAREN:
                            case SET_OR_BINDING:
                            case KOMMA:
                            case IDENTIFIER:
                            case IN:
                            case NOT:
                            case EQUIVALENCE:
                            case IMPLICATION:
                            case XOR:
                            case OR:
                            case AND:
                            case EQUALITY:
                            case INEQUALITY:
                            case PROJECTION:
                            case CONCAT:
                            case PREPEND:
                            case APPEND:
                            case PLUS:
                            case MINUS:
                            case MULT:
                            case DIV:
                            case MOD:
                            case POW:
                            case NUMBER_SIGN:
                            case STRING:
                            case LESS_THAN:
                            case GREATER_THAN:
                            case LESS_OR_EQUAL:
                            case GREATER_OR_EQUAL:
                            case AT:
                            case QUESTION_MARK:
                            case AS:
                            case TRUE:
                            case FALSE:
                            case INTEGER:
                            case FLOAT:
                            case THIS:
                            case CALLER:
                            case NULL:
                            case NIL:
                            case NOW:
                            case HISTORY:
                            case VERTICAL:
                            case METHOD:
                                {
                                alt97=1;
                                }
                                break;
                        }

                        switch (alt97) {
                            case 1 :
                                // nl/cwi/cacoj/creol/CreolWalker.g:586:24: set
                                {
                                pushFollow(FOLLOW_set_in_expr_in_braces4157);
                                set();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:587:5: ^( BINDING binding_list )
                    {
                    match(input,BINDING,FOLLOW_BINDING_in_expr_in_braces4166); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_binding_list_in_expr_in_braces4168);
                    binding_list();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_in_braces"

    public static class set_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "set"
    // nl/cwi/cacoj/creol/CreolWalker.g:590:1: set : ( expr_list | ^( VERTICAL ^( COLON IDENTIFIER expr ) expr ) );
    public final CreolWalker.set_return set() throws RecognitionException {
        CreolWalker.set_return retval = new CreolWalker.set_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:590:6: ( expr_list | ^( VERTICAL ^( COLON IDENTIFIER expr ) expr ) )
            int alt99=2;
            switch ( input.LA(1) ) {
            case LIST:
            case PAREN:
            case SET_OR_BINDING:
            case KOMMA:
            case IDENTIFIER:
            case IN:
            case NOT:
            case EQUIVALENCE:
            case IMPLICATION:
            case XOR:
            case OR:
            case AND:
            case EQUALITY:
            case INEQUALITY:
            case PROJECTION:
            case CONCAT:
            case PREPEND:
            case APPEND:
            case PLUS:
            case MINUS:
            case MULT:
            case DIV:
            case MOD:
            case POW:
            case NUMBER_SIGN:
            case STRING:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
            case AT:
            case QUESTION_MARK:
            case AS:
            case TRUE:
            case FALSE:
            case INTEGER:
            case FLOAT:
            case THIS:
            case CALLER:
            case NULL:
            case NIL:
            case NOW:
            case HISTORY:
            case METHOD:
                {
                alt99=1;
                }
                break;
            case VERTICAL:
                {
                alt99=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:590:8: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_set4180);
                    expr_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:591:5: ^( VERTICAL ^( COLON IDENTIFIER expr ) expr )
                    {
                    match(input,VERTICAL,FOLLOW_VERTICAL_in_set4187); 

                    match(input, Token.DOWN, null); 
                    match(input,COLON,FOLLOW_COLON_in_set4190); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_set4192); 
                    pushFollow(FOLLOW_expr_in_set4194);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_expr_in_set4197);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "set"

    public static class binding_list_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "binding_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:594:1: binding_list : ( ^( KOMMA binding binding_list ) | binding );
    public final CreolWalker.binding_list_return binding_list() throws RecognitionException {
        CreolWalker.binding_list_return retval = new CreolWalker.binding_list_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:594:14: ( ^( KOMMA binding binding_list ) | binding )
            int alt100=2;
            switch ( input.LA(1) ) {
            case KOMMA:
                {
                alt100=1;
                }
                break;
            case MAPSTO:
                {
                alt100=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:594:16: ^( KOMMA binding binding_list )
                    {
                    match(input,KOMMA,FOLLOW_KOMMA_in_binding_list4209); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_binding_in_binding_list4211);
                    binding();

                    state._fsp--;

                    pushFollow(FOLLOW_binding_list_in_binding_list4213);
                    binding_list();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:595:5: binding
                    {
                    pushFollow(FOLLOW_binding_in_binding_list4220);
                    binding();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding_list"

    public static class binding_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "binding"
    // nl/cwi/cacoj/creol/CreolWalker.g:598:1: binding : ^( MAPSTO expr expr ) ;
    public final CreolWalker.binding_return binding() throws RecognitionException {
        CreolWalker.binding_return retval = new CreolWalker.binding_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:598:9: ( ^( MAPSTO expr expr ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:598:11: ^( MAPSTO expr expr )
            {
            match(input,MAPSTO,FOLLOW_MAPSTO_in_binding4231); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_binding4233);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_in_binding4235);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding"

    public static class expr_in_paren_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr_in_paren"
    // nl/cwi/cacoj/creol/CreolWalker.g:602:1: expr_in_paren : ( expr_list | ^( ( FORALL | EXISTS | SOME ) var_decl_no_init ^( EXPR expr ) ) );
    public final CreolWalker.expr_in_paren_return expr_in_paren() throws RecognitionException {
        CreolWalker.expr_in_paren_return retval = new CreolWalker.expr_in_paren_return();
        retval.start = input.LT(1);

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:602:15: ( expr_list | ^( ( FORALL | EXISTS | SOME ) var_decl_no_init ^( EXPR expr ) ) )
            int alt101=2;
            switch ( input.LA(1) ) {
            case LIST:
            case PAREN:
            case SET_OR_BINDING:
            case KOMMA:
            case IDENTIFIER:
            case IN:
            case NOT:
            case EQUIVALENCE:
            case IMPLICATION:
            case XOR:
            case OR:
            case AND:
            case EQUALITY:
            case INEQUALITY:
            case PROJECTION:
            case CONCAT:
            case PREPEND:
            case APPEND:
            case PLUS:
            case MINUS:
            case MULT:
            case DIV:
            case MOD:
            case POW:
            case NUMBER_SIGN:
            case STRING:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
            case AT:
            case QUESTION_MARK:
            case AS:
            case TRUE:
            case FALSE:
            case INTEGER:
            case FLOAT:
            case THIS:
            case CALLER:
            case NULL:
            case NIL:
            case NOW:
            case HISTORY:
            case METHOD:
                {
                alt101=1;
                }
                break;
            case FORALL:
            case EXISTS:
            case SOME:
                {
                alt101=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:602:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_expr_in_paren4248);
                    expr_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:603:5: ^( ( FORALL | EXISTS | SOME ) var_decl_no_init ^( EXPR expr ) )
                    {
                    if ( (input.LA(1)>=FORALL && input.LA(1)<=SOME) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_var_decl_no_init_in_expr_in_paren4263);
                    var_decl_no_init();

                    state._fsp--;

                    match(input,EXPR,FOLLOW_EXPR_in_expr_in_paren4266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr_in_paren4268);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_in_paren"

    public static class expr_list_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:607:1: expr_list : ( ^( KOMMA f= expr_list s= expr_list ) -> expr_list_tmpl(e1=$f.ste2=$s.st) | e= expr -> expr_tmpl(e=$e.st));
    public final CreolWalker.expr_list_return expr_list() throws RecognitionException {
        CreolWalker.expr_list_return retval = new CreolWalker.expr_list_return();
        retval.start = input.LT(1);

        CreolWalker.expr_list_return f = null;

        CreolWalker.expr_list_return s = null;

        CreolWalker.expr_return e = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:607:11: ( ^( KOMMA f= expr_list s= expr_list ) -> expr_list_tmpl(e1=$f.ste2=$s.st) | e= expr -> expr_tmpl(e=$e.st))
            int alt102=2;
            switch ( input.LA(1) ) {
            case KOMMA:
                {
                alt102=1;
                }
                break;
            case LIST:
            case PAREN:
            case SET_OR_BINDING:
            case IDENTIFIER:
            case IN:
            case NOT:
            case EQUIVALENCE:
            case IMPLICATION:
            case XOR:
            case OR:
            case AND:
            case EQUALITY:
            case INEQUALITY:
            case PROJECTION:
            case CONCAT:
            case PREPEND:
            case APPEND:
            case PLUS:
            case MINUS:
            case MULT:
            case DIV:
            case MOD:
            case POW:
            case NUMBER_SIGN:
            case STRING:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
            case AT:
            case QUESTION_MARK:
            case AS:
            case TRUE:
            case FALSE:
            case INTEGER:
            case FLOAT:
            case THIS:
            case CALLER:
            case NULL:
            case NIL:
            case NOW:
            case HISTORY:
            case METHOD:
                {
                alt102=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:608:7: ^( KOMMA f= expr_list s= expr_list )
                    {
                    match(input,KOMMA,FOLLOW_KOMMA_in_expr_list4289); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_list_in_expr_list4293);
                    f=expr_list();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_list_in_expr_list4297);
                    s=expr_list();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 609:7: -> expr_list_tmpl(e1=$f.ste2=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_list_tmpl",
                      new STAttrMap().put("e1", (f!=null?f.st:null)).put("e2", (s!=null?s.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:610:5: e= expr
                    {
                    pushFollow(FOLLOW_expr_in_expr_list4326);
                    e=expr();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 611:5: -> expr_tmpl(e=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("expr_tmpl",
                      new STAttrMap().put("e", (e!=null?e.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    public static class type_return extends TreeRuleReturnScope {
        public CType ctype;;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // nl/cwi/cacoj/creol/CreolWalker.g:614:1: type returns [CType ctype;] : ^( TYPE h= type_real ) ;
    public final CreolWalker.type_return type() throws RecognitionException {
        CreolWalker.type_return retval = new CreolWalker.type_return();
        retval.start = input.LT(1);

        CreolWalker.type_real_return h = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:615:3: ( ^( TYPE h= type_real ) )
            // nl/cwi/cacoj/creol/CreolWalker.g:616:5: ^( TYPE h= type_real )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type4363); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_real_in_type4367);
            h=type_real();

            state._fsp--;


            match(input, Token.UP, null); 

                    retval.ctype = h.ctype;
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class type_real_return extends TreeRuleReturnScope {
        public CType ctype;;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type_real"
    // nl/cwi/cacoj/creol/CreolWalker.g:623:1: type_real returns [CType ctype;] : ( CLASS_IDENTIFIER ( ^( LBRACK (l= type_list )? ) )? | ^( LIST type_list ) | ^( TYPEVAR IDENTIFIER ) );
    public final CreolWalker.type_real_return type_real() throws RecognitionException {
        CreolWalker.type_real_return retval = new CreolWalker.type_real_return();
        retval.start = input.LT(1);

        CommonTree CLASS_IDENTIFIER18=null;
        CreolWalker.type_list_return l = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:624:3: ( CLASS_IDENTIFIER ( ^( LBRACK (l= type_list )? ) )? | ^( LIST type_list ) | ^( TYPEVAR IDENTIFIER ) )
            int alt105=3;
            switch ( input.LA(1) ) {
            case CLASS_IDENTIFIER:
                {
                alt105=1;
                }
                break;
            case LIST:
                {
                alt105=2;
                }
                break;
            case TYPEVAR:
                {
                alt105=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:625:5: CLASS_IDENTIFIER ( ^( LBRACK (l= type_list )? ) )?
                    {
                    CLASS_IDENTIFIER18=(CommonTree)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_type_real4397); 
                    // nl/cwi/cacoj/creol/CreolWalker.g:625:22: ( ^( LBRACK (l= type_list )? ) )?
                    int alt104=2;
                    switch ( input.LA(1) ) {
                        case LBRACK:
                            {
                            alt104=1;
                            }
                            break;
                    }

                    switch (alt104) {
                        case 1 :
                            // nl/cwi/cacoj/creol/CreolWalker.g:625:23: ^( LBRACK (l= type_list )? )
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_type_real4401); 

                            if ( input.LA(1)==Token.DOWN ) {
                                match(input, Token.DOWN, null); 
                                // nl/cwi/cacoj/creol/CreolWalker.g:625:33: (l= type_list )?
                                int alt103=2;
                                switch ( input.LA(1) ) {
                                    case TYPE:
                                        {
                                        alt103=1;
                                        }
                                        break;
                                }

                                switch (alt103) {
                                    case 1 :
                                        // nl/cwi/cacoj/creol/CreolWalker.g:625:33: l= type_list
                                        {
                                        pushFollow(FOLLOW_type_list_in_type_real4405);
                                        l=type_list();

                                        state._fsp--;


                                        }
                                        break;

                                }


                                match(input, Token.UP, null); 
                            }

                            }
                            break;

                    }


                            retval.ctype = new CType((CLASS_IDENTIFIER18!=null?CLASS_IDENTIFIER18.getText():null));
                            if (l != null) retval.ctype.enclosures = l.types;
                          

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:631:5: ^( LIST type_list )
                    {
                    match(input,LIST,FOLLOW_LIST_in_type_real4426); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_list_in_type_real4428);
                    type_list();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:633:5: ^( TYPEVAR IDENTIFIER )
                    {
                    match(input,TYPEVAR,FOLLOW_TYPEVAR_in_type_real4437); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_real4439); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_real"

    public static class type_list_return extends TreeRuleReturnScope {
        public List types = new ArrayList();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type_list"
    // nl/cwi/cacoj/creol/CreolWalker.g:636:1: type_list returns [List types = new ArrayList()] : (t= type )+ ;
    public final CreolWalker.type_list_return type_list() throws RecognitionException {
        CreolWalker.type_list_return retval = new CreolWalker.type_list_return();
        retval.start = input.LT(1);

        CreolWalker.type_return t = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:637:3: ( (t= type )+ )
            // nl/cwi/cacoj/creol/CreolWalker.g:638:5: (t= type )+
            {
            // nl/cwi/cacoj/creol/CreolWalker.g:638:5: (t= type )+
            int cnt106=0;
            loop106:
            do {
                int alt106=2;
                switch ( input.LA(1) ) {
                case TYPE:
                    {
                    alt106=1;
                    }
                    break;

                }

                switch (alt106) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/CreolWalker.g:638:6: t= type
            	    {
            	    pushFollow(FOLLOW_type_in_type_list4464);
            	    t=type();

            	    state._fsp--;

            	    retval.types.add(t.ctype);

            	    }
            	    break;

            	default :
            	    if ( cnt106 >= 1 ) break loop106;
                        EarlyExitException eee =
                            new EarlyExitException(106, input);
                        throw eee;
                }
                cnt106++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_list"

    public static class j_import_decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "j_import_decl"
    // nl/cwi/cacoj/creol/CreolWalker.g:644:1: j_import_decl : ^( IMP url= j_import_expr ) -> j_import_decl_tmpl(url=$url.st);
    public final CreolWalker.j_import_decl_return j_import_decl() throws RecognitionException {
        CreolWalker.j_import_decl_return retval = new CreolWalker.j_import_decl_return();
        retval.start = input.LT(1);

        CreolWalker.j_import_expr_return url = null;


        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:644:14: ( ^( IMP url= j_import_expr ) -> j_import_decl_tmpl(url=$url.st))
            // nl/cwi/cacoj/creol/CreolWalker.g:645:3: ^( IMP url= j_import_expr )
            {
            match(input,IMP,FOLLOW_IMP_in_j_import_decl4484); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_j_import_expr_in_j_import_decl4488);
            url=j_import_expr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 645:28: -> j_import_decl_tmpl(url=$url.st)
            {
                retval.st = templateLib.getInstanceOf("j_import_decl_tmpl",
              new STAttrMap().put("url", (url!=null?url.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_import_decl"

    public static class j_import_expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "j_import_expr"
    // nl/cwi/cacoj/creol/CreolWalker.g:648:1: j_import_expr : ^( ID (jids+= j_identifier )* ) -> j_import_expr_tmpl(jids=$jids);
    public final CreolWalker.j_import_expr_return j_import_expr() throws RecognitionException {
        CreolWalker.j_import_expr_return retval = new CreolWalker.j_import_expr_return();
        retval.start = input.LT(1);

        List list_jids=null;
        RuleReturnScope jids = null;
        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:648:14: ( ^( ID (jids+= j_identifier )* ) -> j_import_expr_tmpl(jids=$jids))
            // nl/cwi/cacoj/creol/CreolWalker.g:649:3: ^( ID (jids+= j_identifier )* )
            {
            match(input,ID,FOLLOW_ID_in_j_import_expr4509); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // nl/cwi/cacoj/creol/CreolWalker.g:649:12: (jids+= j_identifier )*
                loop107:
                do {
                    int alt107=2;
                    switch ( input.LA(1) ) {
                    case CLASS_IDENTIFIER:
                    case IDENTIFIER:
                        {
                        alt107=1;
                        }
                        break;

                    }

                    switch (alt107) {
                	case 1 :
                	    // nl/cwi/cacoj/creol/CreolWalker.g:649:12: jids+= j_identifier
                	    {
                	    pushFollow(FOLLOW_j_identifier_in_j_import_expr4513);
                	    jids=j_identifier();

                	    state._fsp--;

                	    if (list_jids==null) list_jids=new ArrayList();
                	    list_jids.add(jids.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop107;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 650:3: -> j_import_expr_tmpl(jids=$jids)
            {
                retval.st = templateLib.getInstanceOf("j_import_expr_tmpl",
              new STAttrMap().put("jids", list_jids));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_import_expr"

    public static class j_identifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "j_identifier"
    // nl/cwi/cacoj/creol/CreolWalker.g:653:1: j_identifier : (id= IDENTIFIER | cid= CLASS_IDENTIFIER ) -> j_identifier_tmpl(id=$id != null ? $id.text : $cid.text);
    public final CreolWalker.j_identifier_return j_identifier() throws RecognitionException {
        CreolWalker.j_identifier_return retval = new CreolWalker.j_identifier_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        CommonTree cid=null;

        try {
            // nl/cwi/cacoj/creol/CreolWalker.g:653:13: ( (id= IDENTIFIER | cid= CLASS_IDENTIFIER ) -> j_identifier_tmpl(id=$id != null ? $id.text : $cid.text))
            // nl/cwi/cacoj/creol/CreolWalker.g:654:7: (id= IDENTIFIER | cid= CLASS_IDENTIFIER )
            {
            // nl/cwi/cacoj/creol/CreolWalker.g:654:7: (id= IDENTIFIER | cid= CLASS_IDENTIFIER )
            int alt108=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt108=1;
                }
                break;
            case CLASS_IDENTIFIER:
                {
                alt108=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:654:8: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_j_identifier4546); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/CreolWalker.g:655:7: cid= CLASS_IDENTIFIER
                    {
                    cid=(CommonTree)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_j_identifier4557); 

                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 655:29: -> j_identifier_tmpl(id=$id != null ? $id.text : $cid.text)
            {
                retval.st = templateLib.getInstanceOf("j_identifier_tmpl",
              new STAttrMap().put("id", id != null ? (id!=null?id.getText():null) : (cid!=null?cid.getText():null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_identifier"

    // Delegated rules


    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA72_eotS =
        "\36\uffff";
    static final String DFA72_eofS =
        "\36\uffff";
    static final String DFA72_minS =
        "\1\33\4\uffff\1\2\7\uffff\1\2\7\uffff\1\56\1\21\1\142\6\uffff";
    static final String DFA72_maxS =
        "\1\u0087\4\uffff\1\2\7\uffff\1\2\7\uffff\3\u0087\6\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\3\uffff\1\5\1\6\1"+
        "\10\1\21\1\20\1\17";
    static final String DFA72_specialS =
        "\36\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\21\1\uffff\1\3\54\uffff\1\4\1\1\1\2\1\5\2\uffff\1\12\1\13"+
            "\3\uffff\1\15\1\16\1\17\1\20\1\22\1\23\1\24\6\uffff\1\6\1\11"+
            "\17\uffff\1\14\2\uffff\2\7\17\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\63\uffff\1\30\23\uffff\2\31\17\uffff\1\32",
            "\1\35\3\uffff\2\35\27\uffff\25\35\3\uffff\1\35\26\uffff\5\35"+
            "\1\33\14\35\7\uffff\2\34\17\uffff\1\35",
            "\1\30\23\uffff\2\31\17\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "361:1: statement : ( ^( INTERLEAVE statement statement ) | ^( BOX statement statement ) | ^( SEMICOLON s1= statement s2= statement ) -> statement_multi_statements(s1=$s1.sts2=$s2.st) | ^( ASSIGN l= expr_list r= expr_or_new_list ) -> statement_assign_expr(left=$l.stright=$r.st) | ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( DOT object= expr ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ( ^( SEMICOLON (results= lhs_list )? ) )? ) ) ( ^( AS type ) )? ) ) -> method_call_nonlocal_async_tmpl(object=$object.stmethod=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText())results=results == null || results.lhslist == null ? new ArrayList() : results.lhslist) | ^( EXCLENATION_MARK ( IDENTIFIER )? method_call_bounds ) | nlsc= non_local_syn_call -> non_local_syn_call_tmpl(st=$nlsc.st) | ^( EXCLENATION_MARK (mylabel= IDENTIFIER )? ^( METHOD method= IDENTIFIER ^( PRM (params= expr_list )? ) ( ^( AS type ) )? ) ) -> method_call_local_async_tmpl(label=$mylabel == null ? null : $mylabel.getText()method=refineMethodName($method.getText())params=$params.stmi_var_name=miNamemethod_return_type=getMethodReturnType($method.getText())) | local_syn_bounded_call | ^( METHOD IDENTIFIER ^( PRM (p= expr_list )? ^( SEMICOLON ( lhs_list )? ) ) ) -> method_call_local_sync_tmpl(method=refineMethodName($IDENTIFIER.text)params=$p.st) | ^( QUESTION_MARK IDENTIFIER ( ^( PRM (future_value_list= lhs_list )? ) )? ) -> future_value_get_tmpl(id=$IDENTIFIER.textvalues=future_value_list.lhslist) | ^( WHILE condition ( invariant )? ( measure )? body ) | ^( DO body ( invariant )? ( measure )? condition ) | ^( IF ^( COND if_cond= expr ) ^( THEN if_then= statement ) ( ^( ELSE if_else= statement ) )? ) -> if_tmpl(cond=$if_cond.ststmt=$if_then.stelce=$if_else.st) | ^( AWAIT e= expr ) -> await_expr_tmpl(e=$e.stmi_var_name=getMiNameForFutureLabel($e.st.toString())) | ^( AWAIT local_syn_bounded_call ) | ^( AWAIT ^( DOT expr ^( METHOD IDENTIFIER syn_method_call_prm ) ) ) | ^( PROVE expr ) | ^( ASSERT expr ) | ^( POSIT expr ) | ^( BEGIN statement ) | SKIP | RELEASE -> release_tmpl() | BLOCK );";
        }
    }
 

    public static final BitSet FOLLOW_PROGRAM_in_start63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_start67 = new BitSet(new long[]{0x00000B0005000008L});
    public static final BitSet FOLLOW_j_import_decl_in_declaration106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_decl_in_declaration133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_decl_in_declaration160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_in_declaration187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_decl_in_declaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class_decl245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_class_decl252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_class_decl254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRM_in_class_decl264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_class_decl268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_class_decl279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_super_decl_in_class_decl283 = new BitSet(new long[]{0x0000000700000008L});
    public static final BitSet FOLLOW_PRAGMAS_in_class_decl291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pragma_in_class_decl293 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_ATTRIBUTES_in_class_decl301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_class_decl305 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_METHODS_in_class_decl313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_anon_with_def_in_class_decl317 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_with_def_in_class_decl322 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_CONTRACTS_in_super_decl548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_list_in_super_decl550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_super_decl558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_list_in_super_decl562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INHERITS_in_super_decl579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_list_in_super_decl581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_class_element_in_class_list596 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_class_element631 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_class_element633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_pragma675 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_parameter_list_in_pragma677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_attribute690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_list_in_attribute694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECL_in_var_decl_no_init738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_var_decl_no_init740 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_var_decl_no_init744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_var_decl_no_init_in_var_decl_no_init_list796 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_var_decl_in_var_decl_list835 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000400L});
    public static final BitSet FOLLOW_var_decl_no_init_in_var_decl872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_var_decl896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_no_init_in_var_decl900 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0004047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_or_new_in_var_decl904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_method_with_body_in_anon_with_def945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100008L});
    public static final BitSet FOLLOW_invariant_in_anon_with_def948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_WITH_in_with_def977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_with_def981 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100008L});
    public static final BitSet FOLLOW_method_with_body_in_with_def985 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100008L});
    public static final BitSet FOLLOW_invariant_in_with_def988 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_in_method_with_body1039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_method_with_body1048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_method_with_body1050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRM_in_method_with_body1067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_param_in_in_method_with_body1071 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_method_param_out_in_method_with_body1076 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUIRES_in_method_with_body1093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_method_with_body1095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENSURES_in_method_with_body1105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_method_with_body1107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pragma_in_method_with_body1115 = new BitSet(new long[]{0x0000000080000808L,0x0000000000000020L});
    public static final BitSet FOLLOW_BODY_in_method_with_body1123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_priority_decl_in_method_with_body1127 = new BitSet(new long[]{0x0000000028000000L,0x00C8000C0FE33C00L,0x0000000000000080L});
    public static final BitSet FOLLOW_decl_statement_in_method_with_body1132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTERNAL_in_method_with_body1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_method_with_body1140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRIORITIZE_in_priority_decl1195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_priority_decl1199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_PRM_in_method_param_in1240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_method_param_in1244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_in_method_param_out1280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_method_param_out1284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_id_or_op1305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id_or_op1307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_in_id_or_op1315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operator_in_id_or_op1317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_operator1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_operator1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIVALENCE_in_operator1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLICATION_in_operator1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_operator1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operator1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_operator1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALITY_in_operator1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INEQUALITY_in_operator1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_operator1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROJECTION_in_operator1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCAT_in_operator1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREPEND_in_operator1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPEND_in_operator1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_operator1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_operator1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_in_operator1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_operator1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_operator1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POW_in_operator1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_SIGN_in_operator1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRM_in_parameter_list1470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_parameter_list1474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_function_decl1500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_id_or_op_in_function_decl1502 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_PRM_in_function_decl1509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_function_decl1511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_function_decl1520 = new BitSet(new long[]{0x0000000080000808L,0x0000000000000020L});
    public static final BitSet FOLLOW_pragma_in_function_decl1525 = new BitSet(new long[]{0x0000000080000808L,0x0000000000000020L});
    public static final BitSet FOLLOW_EXTERNAL_in_function_decl1534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_function_decl1536 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BODY_in_function_decl1542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_function_decl1544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATATYPE_in_datatype_decl1561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_datatype_decl1563 = new BitSet(new long[]{0x0000040080000008L});
    public static final BitSet FOLLOW_FROM_in_datatype_decl1567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_list_in_datatype_decl1569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pragma_in_datatype_decl1574 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_decl1587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_interface_decl1592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_interface_decl1594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRM_in_interface_decl1601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_interface_decl1603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_interface_decl1612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interface_inherits_in_interface_decl1614 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_PRAGMAS_in_interface_decl1621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pragma_in_interface_decl1623 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_invariant_in_interface_decl1629 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_METHODS_in_interface_decl1635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_with_decl_in_interface_decl1637 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_WITH_in_with_decl1665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_with_decl1667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_method_decl_in_with_decl1669 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100008L});
    public static final BitSet FOLLOW_invariant_in_with_decl1672 = new BitSet(new long[]{0x0000000000000008L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_in_method_decl1685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_method_decl1692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_method_decl1694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRM_in_method_decl1701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_param_in_in_method_decl1703 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_method_param_out_in_method_decl1706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUIRES_in_method_decl1716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_method_decl1718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENSURES_in_method_decl1727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_method_decl1729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pragma_in_method_decl1736 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_INHERITS_in_interface_inherits1753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_list_in_interface_inherits1755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_decl_statement1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_decl_statement1800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_decl_statement1804 = new BitSet(new long[]{0x0000000028000000L,0x00C8000C0FE33C00L,0x0000000000000080L});
    public static final BitSet FOLLOW_decl_statement_in_decl_statement1808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERLEAVE_in_statement1845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1847 = new BitSet(new long[]{0x0000000028000000L,0x00C8000C0FE33C00L,0x0000000000000080L});
    public static final BitSet FOLLOW_statement_in_statement1849 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOX_in_statement1864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1866 = new BitSet(new long[]{0x0000000028000000L,0x00C8000C0FE33C00L,0x0000000000000080L});
    public static final BitSet FOLLOW_statement_in_statement1868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement1879 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1883 = new BitSet(new long[]{0x0000000028000000L,0x00C8000C0FE33C00L,0x0000000000000080L});
    public static final BitSet FOLLOW_statement_in_statement1887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_statement1914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_statement1918 = new BitSet(new long[]{0xFFFFC00800620000L,0x00007FFFE0004047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_or_new_list_in_statement1922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXCLENATION_MARK_in_statement1952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_statement1961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement1965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_METHOD_in_statement1968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_PRM_in_statement1975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_statement1979 = new BitSet(new long[]{0x0000000020000008L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement1984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lhs_list_in_statement1988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_statement2000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_statement2002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXCLENATION_MARK_in_statement2125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2127 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_method_call_bounds_in_statement2131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_non_local_syn_call_in_statement2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLENATION_MARK_in_statement2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_METHOD_in_statement2191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_PRM_in_statement2198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_statement2202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_statement2208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_statement2210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_local_syn_bounded_call_in_statement2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_statement2323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_PRM_in_statement2328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_statement2332 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement2336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lhs_list_in_statement2338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_statement2383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2385 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_PRM_in_statement2389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lhs_list_in_statement2393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_statement2426 = new BitSet(new long[]{0x0000000000000800L,0x0000000000140000L});
    public static final BitSet FOLLOW_invariant_in_statement2428 = new BitSet(new long[]{0x0000000000000800L,0x0000000000140000L});
    public static final BitSet FOLLOW_measure_in_statement2431 = new BitSet(new long[]{0x0000000000000800L,0x0000000000140000L});
    public static final BitSet FOLLOW_body_in_statement2434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_statement2444 = new BitSet(new long[]{0x0000000000010000L,0x0000000000140000L});
    public static final BitSet FOLLOW_invariant_in_statement2446 = new BitSet(new long[]{0x0000000000010000L,0x0000000000140000L});
    public static final BitSet FOLLOW_measure_in_statement2450 = new BitSet(new long[]{0x0000000000010000L,0x0000000000140000L});
    public static final BitSet FOLLOW_condition_in_statement2453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_COND_in_statement2464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement2468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_statement2472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_statement2481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AWAIT_in_statement2520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement2524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AWAIT_in_statement2589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_local_syn_bounded_call_in_statement2591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AWAIT_in_statement2600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOT_in_statement2603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement2605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_METHOD_in_statement2608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_syn_method_call_prm_in_statement2613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROVE_in_statement2625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement2627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSERT_in_statement2635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement2637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSIT_in_statement2645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement2647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BEGIN_in_statement2655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_in_statement2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_statement2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_statement2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_non_local_syn_call2704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_non_local_syn_call2708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_j_dotnotation_in_non_local_syn_call2713 = new BitSet(new long[]{0x0000000000000008L,0x0000001000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_AS_in_non_local_syn_call2718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_non_local_syn_call2720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_j_dotnotation2754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_j_dotnotation2756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_syn_method_call_prm_in_j_dotnotation2760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_lhs_in_lhs_list2820 = new BitSet(new long[]{0x0000400000000002L,0x0100000200000000L});
    public static final BitSet FOLLOW_AT_in_lhs2846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lhs2848 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_lhs2852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lhs2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_lhs2881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AS_in_lhs2884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_lhs2886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRM_in_syn_method_call_prm2918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_syn_method_call_prm2922 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_syn_method_call_prm2926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lhs_list_in_syn_method_call_prm2930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_L_in_method_call_bounds2958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2960 = new BitSet(new long[]{0x0000000000000010L,0x0080000000000000L});
    public static final BitSet FOLLOW_BOUND_R_in_method_call_bounds2964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRM_in_method_call_bounds2972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_method_call_bounds2974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_R_in_method_call_bounds2985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2987 = new BitSet(new long[]{0x0000000000000010L,0x0040000000000000L});
    public static final BitSet FOLLOW_BOUND_L_in_method_call_bounds2991 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_method_call_bounds2993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRM_in_method_call_bounds2999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_method_call_bounds3001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_L_in_local_syn_bounded_call3016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3018 = new BitSet(new long[]{0x0000000000000010L,0x0080000000000000L});
    public static final BitSet FOLLOW_BOUND_R_in_local_syn_bounded_call3022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3024 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_syn_method_call_prm_in_local_syn_bounded_call3029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_R_in_local_syn_bounded_call3038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3040 = new BitSet(new long[]{0x0000000000000010L,0x0040000000000000L});
    public static final BitSet FOLLOW_BOUND_L_in_local_syn_bounded_call3044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_local_syn_bounded_call3046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_syn_method_call_prm_in_local_syn_bounded_call3051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_expr_stmt_method3062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_stmt_method3064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr_or_new3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_expr_or_new3110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_expr_or_new3112 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_parameter_list_in_expr_or_new3116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KOMMA_in_expr_or_new_list3154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_or_new_list_in_expr_or_new_list3158 = new BitSet(new long[]{0xFFFFC00800620000L,0x00007FFFE0004047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_or_new_list_in_expr_or_new_list3162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_or_new_in_expr_or_new_list3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_local_syn_call_in_expr_or_new_list3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_condition3236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_condition3238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BODY_in_body3250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_body3252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEASURE_in_measure3265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_measure3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_BY_in_measure3270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_id_or_op_in_measure3272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INV_in_invariant3285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_invariant3287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_expr3310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3312 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIVALENCE_in_expr3322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3324 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPLICATION_in_expr3334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3336 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3350 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3380 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3410 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3414 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALITY_in_expr3457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3461 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3465 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INEQUALITY_in_expr3487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3491 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3495 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_comp_op_in_expr3519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3523 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROJECTION_in_expr3554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3556 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_expr3566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3568 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREPEND_in_expr3578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3580 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPEND_in_expr3590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3592 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3606 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3610 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3638 = new BitSet(new long[]{0xFFFFC00000620008L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_in_expr3665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3669 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3699 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3729 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_expr3755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3759 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_expr3763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_SIGN_in_expr3785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_in_expr3811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expr3813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_PRM_in_expr3816 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_expr3818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expr3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_comp_op3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_in_comp_op3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_comp_op3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_comp_op3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_atom4006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom4008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_atom4031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom4033 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_atom4035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_atom4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom4058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_atom4060 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_atom4062 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALLER_in_atom4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_atom4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOW_in_atom4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HISTORY_in_atom4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_atom4118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_atom4120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_OR_BINDING_in_atom4129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_braces_in_atom4131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAREN_in_atom4139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_paren_in_atom4141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_expr_in_braces4155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_expr_in_braces4157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BINDING_in_expr_in_braces4166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_binding_list_in_expr_in_braces4168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_list_in_set4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTICAL_in_set4187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_COLON_in_set4190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_set4192 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_set4194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_set4197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KOMMA_in_binding_list4209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_binding_in_binding_list4211 = new BitSet(new long[]{0x0000000800000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_binding_list_in_binding_list4213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_binding_in_binding_list4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAPSTO_in_binding4231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binding4233 = new BitSet(new long[]{0xFFFFC00000620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_binding4235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_list_in_expr_in_paren4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_in_paren4255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_decl_no_init_in_expr_in_paren4263 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EXPR_in_expr_in_paren4266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_in_paren4268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KOMMA_in_expr_list4289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_expr_list4293 = new BitSet(new long[]{0xFFFFC00800620000L,0x00007FFBE0000047L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_list_in_expr_list4297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr_list4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type4363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_real_in_type4367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_type_real4397 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_LBRACK_in_type_real4401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_list_in_type_real4405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_type_real4426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_list_in_type_real4428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPEVAR_in_type_real4437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_real4439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_type_list4464 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_IMP_in_j_import_decl4484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_j_import_expr_in_j_import_decl4488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_j_import_expr4509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_j_identifier_in_j_import_expr4513 = new BitSet(new long[]{0x0000400040000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_j_identifier4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_j_identifier4557 = new BitSet(new long[]{0x0000000000000002L});

}