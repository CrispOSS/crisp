// $ANTLR 3.2 Sep 23, 2009 14:05:07 nl/cwi/cacoj/creol/Creol.g 2011-08-10 11:08:16

package nl.cwi.cacoj.creol;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class CreolParser extends Parser {
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
    public static final int METHODS=10;
    public static final int POW=65;
    public static final int INHERITS=34;
    public static final int EXPORTS=131;
    public static final int MAPSTO=125;
    public static final int BEGIN=27;
    public static final int THIS=105;
    public static final int QUESTION_MARK=99;
    public static final int RETURN=92;
    public static final int IMP=24;
    public static final int VAR=36;
    public static final int BODY=11;
    public static final int APOSTROPHE=126;
    public static final int SUPER=7;
    public static final int COMMENT=155;
    public static final int LBRACES=113;
    public static final int EXCEPTION=130;
    public static final int RBRACK=112;
    public static final int LINE_COMMENT=156;
    public static final int CONCAT=57;
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
    public static final int LPAREN=38;
    public static final int PAREN=21;
    public static final int IF=115;
    public static final int AT=97;
    public static final int TYPEVAR=23;
    public static final int ESCAPE_SEQUENCE=150;
    public static final int AS=100;
    public static final int ENSURES=72;
    public static final int IN_PRM=5;
    public static final int UNICODE_ESCAPE=151;
    public static final int BOX=76;
    public static final int EXPR=20;
    public static final int THEN=116;
    public static final int IN=47;
    public static final int IMPLEMENTS=33;
    public static final int OBJECT=136;
    public static final int IS=134;
    public static final int CONTRACTS=32;
    public static final int IDENTIFIER=46;
    public static final int SOME=123;
    public static final int PRIORITIZE=25;
    public static final int SIGNAL=139;
    public static final int IMPLICATION=50;
    public static final int PLUS=60;
    public static final int DIGIT=149;
    public static final int EXISTS=122;
    public static final int PROVIDES=138;
    public static final int DOT=98;
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
    public static final int VERTICAL=124;
    public static final int PROVE=86;
    public static final int FORALL=121;
    public static final int HEX_DIGIT=153;
    public static final int SET=18;
    public static final int MINUS=61;
    public static final int TRUE=101;
    public static final int COLON=44;
    public static final int REQUIRES=71;
    public static final int INTERLEAVE=75;
    public static final int RBRACES=114;
    public static final int POSIT=88;
    public static final int KOMMA=35;
    public static final int WHEN=144;
    public static final int CLASS_IDENTIFIER=30;
    public static final int DECL=13;
    public static final int BLOCK=91;
    public static final int EQUIVALENCE=49;
    public static final int ASSIGN=74;
    public static final int PROGRAM=12;
    public static final int NUMBER_SIGN=66;
    public static final int INTERFACE=40;
    public static final int DIV=63;
    public static final int COND=16;
    public static final int PROJECTION=56;
    public static final int METHOD=135;
    public static final int STRING=70;

    // delegates
    // delegators


        public CreolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CreolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CreolParser.tokenNames; }
    public String getGrammarFileName() { return "nl/cwi/cacoj/creol/Creol.g"; }


    public void displayRecognitionError(String[] tokenNames,
    	RecognitionException e) {
    	String hdr = getErrorHeader(e);
    	String msg = getErrorMessage(e, tokenNames);
    	// Now do something with hdr and msg...
    	throw new RuntimeException(hdr+" "+msg);
      }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // nl/cwi/cacoj/creol/Creol.g:127:1: start : ( declaration )* -> ^( PROGRAM ( declaration )* ) ;
    public final CreolParser.start_return start() throws RecognitionException {
        CreolParser.start_return retval = new CreolParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.declaration_return declaration1 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // nl/cwi/cacoj/creol/Creol.g:127:7: ( ( declaration )* -> ^( PROGRAM ( declaration )* ) )
            // nl/cwi/cacoj/creol/Creol.g:127:9: ( declaration )*
            {
            // nl/cwi/cacoj/creol/Creol.g:127:9: ( declaration )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case CLASS:
                case INTERFACE:
                case DATATYPE:
                case FUNCTION:
                case IMPORT:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:127:9: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_start169);
            	    declaration1=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 127:22: -> ^( PROGRAM ( declaration )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:127:25: ^( PROGRAM ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:127:35: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // nl/cwi/cacoj/creol/Creol.g:132:1: declaration : ( j_import_decl | interface_decl | datatype_decl | function_decl | class_decl );
    public final CreolParser.declaration_return declaration() throws RecognitionException {
        CreolParser.declaration_return retval = new CreolParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.j_import_decl_return j_import_decl2 = null;

        CreolParser.interface_decl_return interface_decl3 = null;

        CreolParser.datatype_decl_return datatype_decl4 = null;

        CreolParser.function_decl_return function_decl5 = null;

        CreolParser.class_decl_return class_decl6 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:132:13: ( j_import_decl | interface_decl | datatype_decl | function_decl | class_decl )
            int alt2=5;
            switch ( input.LA(1) ) {
            case IMPORT:
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
                    // nl/cwi/cacoj/creol/Creol.g:132:15: j_import_decl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_j_import_decl_in_declaration191);
                    j_import_decl2=j_import_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, j_import_decl2.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:132:31: interface_decl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interface_decl_in_declaration195);
                    interface_decl3=interface_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_decl3.getTree());

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:132:48: datatype_decl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_datatype_decl_in_declaration199);
                    datatype_decl4=datatype_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype_decl4.getTree());

                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/Creol.g:132:64: function_decl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_decl_in_declaration203);
                    function_decl5=function_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, function_decl5.getTree());

                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/Creol.g:132:80: class_decl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_class_decl_in_declaration207);
                    class_decl6=class_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, class_decl6.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class class_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // nl/cwi/cacoj/creol/Creol.g:135:1: class_decl : CLASS class_identifier ( var_decl_no_init_argument )? super_decl_rw pragma_rw BEGIN class_attributes class_methods END ;
    public final CreolParser.class_decl_return class_decl() throws RecognitionException {
        CreolParser.class_decl_return retval = new CreolParser.class_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS7=null;
        Token BEGIN12=null;
        Token END15=null;
        CreolParser.class_identifier_return class_identifier8 = null;

        CreolParser.var_decl_no_init_argument_return var_decl_no_init_argument9 = null;

        CreolParser.super_decl_rw_return super_decl_rw10 = null;

        CreolParser.pragma_rw_return pragma_rw11 = null;

        CreolParser.class_attributes_return class_attributes13 = null;

        CreolParser.class_methods_return class_methods14 = null;


        Object CLASS7_tree=null;
        Object BEGIN12_tree=null;
        Object END15_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:135:12: ( CLASS class_identifier ( var_decl_no_init_argument )? super_decl_rw pragma_rw BEGIN class_attributes class_methods END )
            // nl/cwi/cacoj/creol/Creol.g:135:14: CLASS class_identifier ( var_decl_no_init_argument )? super_decl_rw pragma_rw BEGIN class_attributes class_methods END
            {
            root_0 = (Object)adaptor.nil();

            CLASS7=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl217); 
            CLASS7_tree = (Object)adaptor.create(CLASS7);
            root_0 = (Object)adaptor.becomeRoot(CLASS7_tree, root_0);

            pushFollow(FOLLOW_class_identifier_in_class_decl220);
            class_identifier8=class_identifier();

            state._fsp--;

            adaptor.addChild(root_0, class_identifier8.getTree());
            // nl/cwi/cacoj/creol/Creol.g:136:2: ( var_decl_no_init_argument )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:136:2: var_decl_no_init_argument
                    {
                    pushFollow(FOLLOW_var_decl_no_init_argument_in_class_decl223);
                    var_decl_no_init_argument9=var_decl_no_init_argument();

                    state._fsp--;

                    adaptor.addChild(root_0, var_decl_no_init_argument9.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_super_decl_rw_in_class_decl227);
            super_decl_rw10=super_decl_rw();

            state._fsp--;

            adaptor.addChild(root_0, super_decl_rw10.getTree());
            pushFollow(FOLLOW_pragma_rw_in_class_decl230);
            pragma_rw11=pragma_rw();

            state._fsp--;

            adaptor.addChild(root_0, pragma_rw11.getTree());
            BEGIN12=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_class_decl233); 
            pushFollow(FOLLOW_class_attributes_in_class_decl237);
            class_attributes13=class_attributes();

            state._fsp--;

            adaptor.addChild(root_0, class_attributes13.getTree());
            pushFollow(FOLLOW_class_methods_in_class_decl240);
            class_methods14=class_methods();

            state._fsp--;

            adaptor.addChild(root_0, class_methods14.getTree());
            END15=(Token)match(input,END,FOLLOW_END_in_class_decl243); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_attributes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_attributes"
    // nl/cwi/cacoj/creol/Creol.g:145:1: class_attributes : ( ( attribute ( SEMICOLON )? )* ) -> ^( ATTRIBUTES ( attribute )* ) ;
    public final CreolParser.class_attributes_return class_attributes() throws RecognitionException {
        CreolParser.class_attributes_return retval = new CreolParser.class_attributes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON17=null;
        CreolParser.attribute_return attribute16 = null;


        Object SEMICOLON17_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // nl/cwi/cacoj/creol/Creol.g:146:2: ( ( ( attribute ( SEMICOLON )? )* ) -> ^( ATTRIBUTES ( attribute )* ) )
            // nl/cwi/cacoj/creol/Creol.g:146:4: ( ( attribute ( SEMICOLON )? )* )
            {
            // nl/cwi/cacoj/creol/Creol.g:146:4: ( ( attribute ( SEMICOLON )? )* )
            // nl/cwi/cacoj/creol/Creol.g:146:5: ( attribute ( SEMICOLON )? )*
            {
            // nl/cwi/cacoj/creol/Creol.g:146:5: ( attribute ( SEMICOLON )? )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case VAR:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:146:6: attribute ( SEMICOLON )?
            	    {
            	    pushFollow(FOLLOW_attribute_in_class_attributes257);
            	    attribute16=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute16.getTree());
            	    // nl/cwi/cacoj/creol/Creol.g:146:16: ( SEMICOLON )?
            	    int alt4=2;
            	    switch ( input.LA(1) ) {
            	        case SEMICOLON:
            	            {
            	            alt4=1;
            	            }
            	            break;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // nl/cwi/cacoj/creol/Creol.g:146:16: SEMICOLON
            	            {
            	            SEMICOLON17=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_class_attributes259);  
            	            stream_SEMICOLON.add(SEMICOLON17);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:30: -> ^( ATTRIBUTES ( attribute )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:146:33: ^( ATTRIBUTES ( attribute )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTES, "ATTRIBUTES"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:146:46: ( attribute )*
                while ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_attributes"

    public static class class_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_identifier"
    // nl/cwi/cacoj/creol/Creol.g:149:1: class_identifier : CLASS_IDENTIFIER -> ^( ID CLASS_IDENTIFIER ) ;
    public final CreolParser.class_identifier_return class_identifier() throws RecognitionException {
        CreolParser.class_identifier_return retval = new CreolParser.class_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_IDENTIFIER18=null;

        Object CLASS_IDENTIFIER18_tree=null;
        RewriteRuleTokenStream stream_CLASS_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token CLASS_IDENTIFIER");

        try {
            // nl/cwi/cacoj/creol/Creol.g:150:2: ( CLASS_IDENTIFIER -> ^( ID CLASS_IDENTIFIER ) )
            // nl/cwi/cacoj/creol/Creol.g:150:4: CLASS_IDENTIFIER
            {
            CLASS_IDENTIFIER18=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_class_identifier283);  
            stream_CLASS_IDENTIFIER.add(CLASS_IDENTIFIER18);



            // AST REWRITE
            // elements: CLASS_IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 150:21: -> ^( ID CLASS_IDENTIFIER )
            {
                // nl/cwi/cacoj/creol/Creol.g:150:24: ^( ID CLASS_IDENTIFIER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);

                adaptor.addChild(root_1, stream_CLASS_IDENTIFIER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_identifier"

    public static class pragma_rw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma_rw"
    // nl/cwi/cacoj/creol/Creol.g:153:1: pragma_rw : ( pragma )* -> ^( PRAGMAS ( pragma )* ) ;
    public final CreolParser.pragma_rw_return pragma_rw() throws RecognitionException {
        CreolParser.pragma_rw_return retval = new CreolParser.pragma_rw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.pragma_return pragma19 = null;


        RewriteRuleSubtreeStream stream_pragma=new RewriteRuleSubtreeStream(adaptor,"rule pragma");
        try {
            // nl/cwi/cacoj/creol/Creol.g:153:11: ( ( pragma )* -> ^( PRAGMAS ( pragma )* ) )
            // nl/cwi/cacoj/creol/Creol.g:153:13: ( pragma )*
            {
            // nl/cwi/cacoj/creol/Creol.g:153:13: ( pragma )*
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
            	    // nl/cwi/cacoj/creol/Creol.g:153:13: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_pragma_rw301);
            	    pragma19=pragma();

            	    state._fsp--;

            	    stream_pragma.add(pragma19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: pragma
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 153:21: -> ^( PRAGMAS ( pragma )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:153:24: ^( PRAGMAS ( pragma )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRAGMAS, "PRAGMAS"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:153:34: ( pragma )*
                while ( stream_pragma.hasNext() ) {
                    adaptor.addChild(root_1, stream_pragma.nextTree());

                }
                stream_pragma.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma_rw"

    public static class pragma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pragma"
    // nl/cwi/cacoj/creol/Creol.g:156:1: pragma : PRAGMA CLASS_IDENTIFIER ( parameter_list )? ( SEMICOLON )? ;
    public final CreolParser.pragma_return pragma() throws RecognitionException {
        CreolParser.pragma_return retval = new CreolParser.pragma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA20=null;
        Token CLASS_IDENTIFIER21=null;
        Token SEMICOLON23=null;
        CreolParser.parameter_list_return parameter_list22 = null;


        Object PRAGMA20_tree=null;
        Object CLASS_IDENTIFIER21_tree=null;
        Object SEMICOLON23_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:156:8: ( PRAGMA CLASS_IDENTIFIER ( parameter_list )? ( SEMICOLON )? )
            // nl/cwi/cacoj/creol/Creol.g:156:10: PRAGMA CLASS_IDENTIFIER ( parameter_list )? ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA20=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma321); 
            PRAGMA20_tree = (Object)adaptor.create(PRAGMA20);
            root_0 = (Object)adaptor.becomeRoot(PRAGMA20_tree, root_0);

            CLASS_IDENTIFIER21=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_pragma324); 
            CLASS_IDENTIFIER21_tree = (Object)adaptor.create(CLASS_IDENTIFIER21);
            adaptor.addChild(root_0, CLASS_IDENTIFIER21_tree);

            // nl/cwi/cacoj/creol/Creol.g:156:35: ( parameter_list )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:156:35: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_pragma326);
                    parameter_list22=parameter_list();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_list22.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:156:60: ( SEMICOLON )?
            int alt8=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt8=1;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:156:60: SEMICOLON
                    {
                    SEMICOLON23=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pragma329); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pragma"

    public static class super_decl_rw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "super_decl_rw"
    // nl/cwi/cacoj/creol/Creol.g:159:1: super_decl_rw : ( super_decl )* -> ^( SUPER ( super_decl )* ) ;
    public final CreolParser.super_decl_rw_return super_decl_rw() throws RecognitionException {
        CreolParser.super_decl_rw_return retval = new CreolParser.super_decl_rw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.super_decl_return super_decl24 = null;


        RewriteRuleSubtreeStream stream_super_decl=new RewriteRuleSubtreeStream(adaptor,"rule super_decl");
        try {
            // nl/cwi/cacoj/creol/Creol.g:160:2: ( ( super_decl )* -> ^( SUPER ( super_decl )* ) )
            // nl/cwi/cacoj/creol/Creol.g:160:4: ( super_decl )*
            {
            // nl/cwi/cacoj/creol/Creol.g:160:4: ( super_decl )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case CONTRACTS:
                case IMPLEMENTS:
                case INHERITS:
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:160:4: super_decl
            	    {
            	    pushFollow(FOLLOW_super_decl_in_super_decl_rw342);
            	    super_decl24=super_decl();

            	    state._fsp--;

            	    stream_super_decl.add(super_decl24.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: super_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:16: -> ^( SUPER ( super_decl )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:160:19: ^( SUPER ( super_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUPER, "SUPER"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:160:27: ( super_decl )*
                while ( stream_super_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_super_decl.nextTree());

                }
                stream_super_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "super_decl_rw"

    public static class super_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "super_decl"
    // nl/cwi/cacoj/creol/Creol.g:163:1: super_decl : ( CONTRACTS | IMPLEMENTS | INHERITS ) class_list ;
    public final CreolParser.super_decl_return super_decl() throws RecognitionException {
        CreolParser.super_decl_return retval = new CreolParser.super_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set25=null;
        CreolParser.class_list_return class_list26 = null;


        Object set25_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:163:12: ( ( CONTRACTS | IMPLEMENTS | INHERITS ) class_list )
            // nl/cwi/cacoj/creol/Creol.g:163:14: ( CONTRACTS | IMPLEMENTS | INHERITS ) class_list
            {
            root_0 = (Object)adaptor.nil();

            set25=(Token)input.LT(1);
            set25=(Token)input.LT(1);
            if ( (input.LA(1)>=CONTRACTS && input.LA(1)<=INHERITS) ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set25), root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_class_list_in_super_decl378);
            class_list26=class_list();

            state._fsp--;

            adaptor.addChild(root_0, class_list26.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "super_decl"

    public static class class_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_list"
    // nl/cwi/cacoj/creol/Creol.g:169:1: class_list : ( class_element ( KOMMA class_element )* ) -> ( class_element )+ ;
    public final CreolParser.class_list_return class_list() throws RecognitionException {
        CreolParser.class_list_return retval = new CreolParser.class_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA28=null;
        CreolParser.class_element_return class_element27 = null;

        CreolParser.class_element_return class_element29 = null;


        Object KOMMA28_tree=null;
        RewriteRuleTokenStream stream_KOMMA=new RewriteRuleTokenStream(adaptor,"token KOMMA");
        RewriteRuleSubtreeStream stream_class_element=new RewriteRuleSubtreeStream(adaptor,"rule class_element");
        try {
            // nl/cwi/cacoj/creol/Creol.g:169:12: ( ( class_element ( KOMMA class_element )* ) -> ( class_element )+ )
            // nl/cwi/cacoj/creol/Creol.g:169:14: ( class_element ( KOMMA class_element )* )
            {
            // nl/cwi/cacoj/creol/Creol.g:169:14: ( class_element ( KOMMA class_element )* )
            // nl/cwi/cacoj/creol/Creol.g:169:15: class_element ( KOMMA class_element )*
            {
            pushFollow(FOLLOW_class_element_in_class_list389);
            class_element27=class_element();

            state._fsp--;

            stream_class_element.add(class_element27.getTree());
            // nl/cwi/cacoj/creol/Creol.g:169:29: ( KOMMA class_element )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:169:30: KOMMA class_element
            	    {
            	    KOMMA28=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_class_list392);  
            	    stream_KOMMA.add(KOMMA28);

            	    pushFollow(FOLLOW_class_element_in_class_list394);
            	    class_element29=class_element();

            	    state._fsp--;

            	    stream_class_element.add(class_element29.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: class_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:53: -> ( class_element )+
            {
                if ( !(stream_class_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_class_element.hasNext() ) {
                    adaptor.addChild(root_0, stream_class_element.nextTree());

                }
                stream_class_element.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_list"

    public static class class_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_element"
    // nl/cwi/cacoj/creol/Creol.g:172:1: class_element : CLASS_IDENTIFIER ( parameter_list )? ;
    public final CreolParser.class_element_return class_element() throws RecognitionException {
        CreolParser.class_element_return retval = new CreolParser.class_element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_IDENTIFIER30=null;
        CreolParser.parameter_list_return parameter_list31 = null;


        Object CLASS_IDENTIFIER30_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:172:15: ( CLASS_IDENTIFIER ( parameter_list )? )
            // nl/cwi/cacoj/creol/Creol.g:172:16: CLASS_IDENTIFIER ( parameter_list )?
            {
            root_0 = (Object)adaptor.nil();

            CLASS_IDENTIFIER30=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_class_element411); 
            CLASS_IDENTIFIER30_tree = (Object)adaptor.create(CLASS_IDENTIFIER30);
            root_0 = (Object)adaptor.becomeRoot(CLASS_IDENTIFIER30_tree, root_0);

            // nl/cwi/cacoj/creol/Creol.g:172:34: ( parameter_list )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:172:34: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_class_element414);
                    parameter_list31=parameter_list();

                    state._fsp--;

                    adaptor.addChild(root_0, parameter_list31.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_element"

    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // nl/cwi/cacoj/creol/Creol.g:175:1: attribute : VAR var_decl_list ;
    public final CreolParser.attribute_return attribute() throws RecognitionException {
        CreolParser.attribute_return retval = new CreolParser.attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR32=null;
        CreolParser.var_decl_list_return var_decl_list33 = null;


        Object VAR32_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:175:11: ( VAR var_decl_list )
            // nl/cwi/cacoj/creol/Creol.g:175:13: VAR var_decl_list
            {
            root_0 = (Object)adaptor.nil();

            VAR32=(Token)match(input,VAR,FOLLOW_VAR_in_attribute425); 
            VAR32_tree = (Object)adaptor.create(VAR32);
            root_0 = (Object)adaptor.becomeRoot(VAR32_tree, root_0);

            pushFollow(FOLLOW_var_decl_list_in_attribute428);
            var_decl_list33=var_decl_list();

            state._fsp--;

            adaptor.addChild(root_0, var_decl_list33.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class class_methods_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_methods"
    // nl/cwi/cacoj/creol/Creol.g:178:1: class_methods : ( ( anon_with_def )? ( with_def )* ) -> ^( METHODS ( anon_with_def )? ( with_def )* ) ;
    public final CreolParser.class_methods_return class_methods() throws RecognitionException {
        CreolParser.class_methods_return retval = new CreolParser.class_methods_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.anon_with_def_return anon_with_def34 = null;

        CreolParser.with_def_return with_def35 = null;


        RewriteRuleSubtreeStream stream_anon_with_def=new RewriteRuleSubtreeStream(adaptor,"rule anon_with_def");
        RewriteRuleSubtreeStream stream_with_def=new RewriteRuleSubtreeStream(adaptor,"rule with_def");
        try {
            // nl/cwi/cacoj/creol/Creol.g:179:2: ( ( ( anon_with_def )? ( with_def )* ) -> ^( METHODS ( anon_with_def )? ( with_def )* ) )
            // nl/cwi/cacoj/creol/Creol.g:179:3: ( ( anon_with_def )? ( with_def )* )
            {
            // nl/cwi/cacoj/creol/Creol.g:179:3: ( ( anon_with_def )? ( with_def )* )
            // nl/cwi/cacoj/creol/Creol.g:179:5: ( anon_with_def )? ( with_def )*
            {
            // nl/cwi/cacoj/creol/Creol.g:179:5: ( anon_with_def )?
            int alt12=2;
            switch ( input.LA(1) ) {
                case OP:
                    {
                    alt12=1;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:179:5: anon_with_def
                    {
                    pushFollow(FOLLOW_anon_with_def_in_class_methods440);
                    anon_with_def34=anon_with_def();

                    state._fsp--;

                    stream_anon_with_def.add(anon_with_def34.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:180:2: ( with_def )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case WITH:
                    {
                    alt13=1;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:180:2: with_def
            	    {
            	    pushFollow(FOLLOW_with_def_in_class_methods444);
            	    with_def35=with_def();

            	    state._fsp--;

            	    stream_with_def.add(with_def35.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: with_def, anon_with_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:2: -> ^( METHODS ( anon_with_def )? ( with_def )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:181:5: ^( METHODS ( anon_with_def )? ( with_def )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODS, "METHODS"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:181:15: ( anon_with_def )?
                if ( stream_anon_with_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_anon_with_def.nextTree());

                }
                stream_anon_with_def.reset();
                // nl/cwi/cacoj/creol/Creol.g:181:30: ( with_def )*
                while ( stream_with_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_def.nextTree());

                }
                stream_with_def.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_methods"

    public static class anon_with_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anon_with_def"
    // nl/cwi/cacoj/creol/Creol.g:184:1: anon_with_def : ( method_with_body )+ ( invariant )* ;
    public final CreolParser.anon_with_def_return anon_with_def() throws RecognitionException {
        CreolParser.anon_with_def_return retval = new CreolParser.anon_with_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.method_with_body_return method_with_body36 = null;

        CreolParser.invariant_return invariant37 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:184:15: ( ( method_with_body )+ ( invariant )* )
            // nl/cwi/cacoj/creol/Creol.g:184:17: ( method_with_body )+ ( invariant )*
            {
            root_0 = (Object)adaptor.nil();

            // nl/cwi/cacoj/creol/Creol.g:184:17: ( method_with_body )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case OP:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:184:17: method_with_body
            	    {
            	    pushFollow(FOLLOW_method_with_body_in_anon_with_def469);
            	    method_with_body36=method_with_body();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_with_body36.getTree());

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

            // nl/cwi/cacoj/creol/Creol.g:184:35: ( invariant )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case INV:
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:184:35: invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_anon_with_def472);
            	    invariant37=invariant();

            	    state._fsp--;

            	    adaptor.addChild(root_0, invariant37.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "anon_with_def"

    public static class with_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "with_def"
    // nl/cwi/cacoj/creol/Creol.g:187:1: with_def : WITH type ( method_with_body )+ ( invariant )* ;
    public final CreolParser.with_def_return with_def() throws RecognitionException {
        CreolParser.with_def_return retval = new CreolParser.with_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH38=null;
        CreolParser.type_return type39 = null;

        CreolParser.method_with_body_return method_with_body40 = null;

        CreolParser.invariant_return invariant41 = null;


        Object WITH38_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:187:10: ( WITH type ( method_with_body )+ ( invariant )* )
            // nl/cwi/cacoj/creol/Creol.g:187:12: WITH type ( method_with_body )+ ( invariant )*
            {
            root_0 = (Object)adaptor.nil();

            WITH38=(Token)match(input,WITH,FOLLOW_WITH_in_with_def483); 
            WITH38_tree = (Object)adaptor.create(WITH38);
            root_0 = (Object)adaptor.becomeRoot(WITH38_tree, root_0);

            pushFollow(FOLLOW_type_in_with_def486);
            type39=type();

            state._fsp--;

            adaptor.addChild(root_0, type39.getTree());
            // nl/cwi/cacoj/creol/Creol.g:187:23: ( method_with_body )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case OP:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:187:23: method_with_body
            	    {
            	    pushFollow(FOLLOW_method_with_body_in_with_def488);
            	    method_with_body40=method_with_body();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_with_body40.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // nl/cwi/cacoj/creol/Creol.g:187:41: ( invariant )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case INV:
                    {
                    alt17=1;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:187:41: invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_with_def491);
            	    invariant41=invariant();

            	    state._fsp--;

            	    adaptor.addChild(root_0, invariant41.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_def"

    public static class var_decl_no_init_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl_no_init_argument"
    // nl/cwi/cacoj/creol/Creol.g:190:1: var_decl_no_init_argument : LPAREN ( var_decl_no_init_list )? RPAREN -> ^( PRM ( var_decl_no_init_list )? ) ;
    public final CreolParser.var_decl_no_init_argument_return var_decl_no_init_argument() throws RecognitionException {
        CreolParser.var_decl_no_init_argument_return retval = new CreolParser.var_decl_no_init_argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN42=null;
        Token RPAREN44=null;
        CreolParser.var_decl_no_init_list_return var_decl_no_init_list43 = null;


        Object LPAREN42_tree=null;
        Object RPAREN44_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_var_decl_no_init_list=new RewriteRuleSubtreeStream(adaptor,"rule var_decl_no_init_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:191:2: ( LPAREN ( var_decl_no_init_list )? RPAREN -> ^( PRM ( var_decl_no_init_list )? ) )
            // nl/cwi/cacoj/creol/Creol.g:191:4: LPAREN ( var_decl_no_init_list )? RPAREN
            {
            LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_var_decl_no_init_argument503);  
            stream_LPAREN.add(LPAREN42);

            // nl/cwi/cacoj/creol/Creol.g:191:11: ( var_decl_no_init_list )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                case IDENTIFIER:
                case NOT:
                case MINUS:
                case NUMBER_SIGN:
                case STRING:
                case SCHEMAVAR:
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
                case LBRACK:
                case LBRACES:
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:191:11: var_decl_no_init_list
                    {
                    pushFollow(FOLLOW_var_decl_no_init_list_in_var_decl_no_init_argument505);
                    var_decl_no_init_list43=var_decl_no_init_list();

                    state._fsp--;

                    stream_var_decl_no_init_list.add(var_decl_no_init_list43.getTree());

                    }
                    break;

            }

            RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_var_decl_no_init_argument508);  
            stream_RPAREN.add(RPAREN44);



            // AST REWRITE
            // elements: var_decl_no_init_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:41: -> ^( PRM ( var_decl_no_init_list )? )
            {
                // nl/cwi/cacoj/creol/Creol.g:191:44: ^( PRM ( var_decl_no_init_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRM, "PRM"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:191:50: ( var_decl_no_init_list )?
                if ( stream_var_decl_no_init_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl_no_init_list.nextTree());

                }
                stream_var_decl_no_init_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl_no_init_argument"

    public static class parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_list"
    // nl/cwi/cacoj/creol/Creol.g:194:1: parameter_list : LPAREN ( expr_list )? RPAREN -> ^( PRM ( expr_list )? ) ;
    public final CreolParser.parameter_list_return parameter_list() throws RecognitionException {
        CreolParser.parameter_list_return retval = new CreolParser.parameter_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN45=null;
        Token RPAREN47=null;
        CreolParser.expr_list_return expr_list46 = null;


        Object LPAREN45_tree=null;
        Object RPAREN47_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:194:16: ( LPAREN ( expr_list )? RPAREN -> ^( PRM ( expr_list )? ) )
            // nl/cwi/cacoj/creol/Creol.g:194:18: LPAREN ( expr_list )? RPAREN
            {
            LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameter_list527);  
            stream_LPAREN.add(LPAREN45);

            // nl/cwi/cacoj/creol/Creol.g:194:25: ( expr_list )?
            int alt19=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                case IDENTIFIER:
                case NOT:
                case MINUS:
                case NUMBER_SIGN:
                case STRING:
                case SCHEMAVAR:
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
                case LBRACK:
                case LBRACES:
                    {
                    alt19=1;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:194:25: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_parameter_list529);
                    expr_list46=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list46.getTree());

                    }
                    break;

            }

            RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameter_list532);  
            stream_RPAREN.add(RPAREN47);



            // AST REWRITE
            // elements: expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 194:43: -> ^( PRM ( expr_list )? )
            {
                // nl/cwi/cacoj/creol/Creol.g:194:46: ^( PRM ( expr_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRM, "PRM"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:194:52: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class interface_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interface_decl"
    // nl/cwi/cacoj/creol/Creol.g:197:1: interface_decl : INTERFACE class_identifier ( var_decl_no_init_argument )? interface_super pragma_rw BEGIN ( invariant )? interface_methods END ;
    public final CreolParser.interface_decl_return interface_decl() throws RecognitionException {
        CreolParser.interface_decl_return retval = new CreolParser.interface_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTERFACE48=null;
        Token BEGIN53=null;
        Token END56=null;
        CreolParser.class_identifier_return class_identifier49 = null;

        CreolParser.var_decl_no_init_argument_return var_decl_no_init_argument50 = null;

        CreolParser.interface_super_return interface_super51 = null;

        CreolParser.pragma_rw_return pragma_rw52 = null;

        CreolParser.invariant_return invariant54 = null;

        CreolParser.interface_methods_return interface_methods55 = null;


        Object INTERFACE48_tree=null;
        Object BEGIN53_tree=null;
        Object END56_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:197:16: ( INTERFACE class_identifier ( var_decl_no_init_argument )? interface_super pragma_rw BEGIN ( invariant )? interface_methods END )
            // nl/cwi/cacoj/creol/Creol.g:197:18: INTERFACE class_identifier ( var_decl_no_init_argument )? interface_super pragma_rw BEGIN ( invariant )? interface_methods END
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE48=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interface_decl551); 
            INTERFACE48_tree = (Object)adaptor.create(INTERFACE48);
            root_0 = (Object)adaptor.becomeRoot(INTERFACE48_tree, root_0);

            pushFollow(FOLLOW_class_identifier_in_interface_decl554);
            class_identifier49=class_identifier();

            state._fsp--;

            adaptor.addChild(root_0, class_identifier49.getTree());
            // nl/cwi/cacoj/creol/Creol.g:198:2: ( var_decl_no_init_argument )?
            int alt20=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt20=1;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:198:2: var_decl_no_init_argument
                    {
                    pushFollow(FOLLOW_var_decl_no_init_argument_in_interface_decl558);
                    var_decl_no_init_argument50=var_decl_no_init_argument();

                    state._fsp--;

                    adaptor.addChild(root_0, var_decl_no_init_argument50.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_interface_super_in_interface_decl562);
            interface_super51=interface_super();

            state._fsp--;

            adaptor.addChild(root_0, interface_super51.getTree());
            pushFollow(FOLLOW_pragma_rw_in_interface_decl565);
            pragma_rw52=pragma_rw();

            state._fsp--;

            adaptor.addChild(root_0, pragma_rw52.getTree());
            BEGIN53=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_interface_decl568); 
            // nl/cwi/cacoj/creol/Creol.g:202:2: ( invariant )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case INV:
                    {
                    alt21=1;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:202:2: invariant
                    {
                    pushFollow(FOLLOW_invariant_in_interface_decl572);
                    invariant54=invariant();

                    state._fsp--;

                    adaptor.addChild(root_0, invariant54.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_interface_methods_in_interface_decl576);
            interface_methods55=interface_methods();

            state._fsp--;

            adaptor.addChild(root_0, interface_methods55.getTree());
            END56=(Token)match(input,END,FOLLOW_END_in_interface_decl579); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interface_decl"

    public static class interface_methods_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interface_methods"
    // nl/cwi/cacoj/creol/Creol.g:207:1: interface_methods : ( with_decl )* -> ^( METHODS ( with_decl )* ) ;
    public final CreolParser.interface_methods_return interface_methods() throws RecognitionException {
        CreolParser.interface_methods_return retval = new CreolParser.interface_methods_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.with_decl_return with_decl57 = null;


        RewriteRuleSubtreeStream stream_with_decl=new RewriteRuleSubtreeStream(adaptor,"rule with_decl");
        try {
            // nl/cwi/cacoj/creol/Creol.g:208:2: ( ( with_decl )* -> ^( METHODS ( with_decl )* ) )
            // nl/cwi/cacoj/creol/Creol.g:208:4: ( with_decl )*
            {
            // nl/cwi/cacoj/creol/Creol.g:208:4: ( with_decl )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case WITH:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:208:4: with_decl
            	    {
            	    pushFollow(FOLLOW_with_decl_in_interface_methods591);
            	    with_decl57=with_decl();

            	    state._fsp--;

            	    stream_with_decl.add(with_decl57.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);



            // AST REWRITE
            // elements: with_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 208:15: -> ^( METHODS ( with_decl )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:208:18: ^( METHODS ( with_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODS, "METHODS"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:208:28: ( with_decl )*
                while ( stream_with_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_decl.nextTree());

                }
                stream_with_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interface_methods"

    public static class interface_super_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interface_super"
    // nl/cwi/cacoj/creol/Creol.g:211:1: interface_super : ( interface_inherits )* -> ^( SUPER ( interface_inherits )* ) ;
    public final CreolParser.interface_super_return interface_super() throws RecognitionException {
        CreolParser.interface_super_return retval = new CreolParser.interface_super_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.interface_inherits_return interface_inherits58 = null;


        RewriteRuleSubtreeStream stream_interface_inherits=new RewriteRuleSubtreeStream(adaptor,"rule interface_inherits");
        try {
            // nl/cwi/cacoj/creol/Creol.g:212:2: ( ( interface_inherits )* -> ^( SUPER ( interface_inherits )* ) )
            // nl/cwi/cacoj/creol/Creol.g:212:4: ( interface_inherits )*
            {
            // nl/cwi/cacoj/creol/Creol.g:212:4: ( interface_inherits )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case INHERITS:
                    {
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:212:4: interface_inherits
            	    {
            	    pushFollow(FOLLOW_interface_inherits_in_interface_super612);
            	    interface_inherits58=interface_inherits();

            	    state._fsp--;

            	    stream_interface_inherits.add(interface_inherits58.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);



            // AST REWRITE
            // elements: interface_inherits
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 212:24: -> ^( SUPER ( interface_inherits )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:212:27: ^( SUPER ( interface_inherits )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUPER, "SUPER"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:212:35: ( interface_inherits )*
                while ( stream_interface_inherits.hasNext() ) {
                    adaptor.addChild(root_1, stream_interface_inherits.nextTree());

                }
                stream_interface_inherits.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interface_super"

    public static class interface_inherits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interface_inherits"
    // nl/cwi/cacoj/creol/Creol.g:215:1: interface_inherits : INHERITS ( class_list )* ;
    public final CreolParser.interface_inherits_return interface_inherits() throws RecognitionException {
        CreolParser.interface_inherits_return retval = new CreolParser.interface_inherits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INHERITS59=null;
        CreolParser.class_list_return class_list60 = null;


        Object INHERITS59_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:216:2: ( INHERITS ( class_list )* )
            // nl/cwi/cacoj/creol/Creol.g:216:4: INHERITS ( class_list )*
            {
            root_0 = (Object)adaptor.nil();

            INHERITS59=(Token)match(input,INHERITS,FOLLOW_INHERITS_in_interface_inherits634); 
            INHERITS59_tree = (Object)adaptor.create(INHERITS59);
            root_0 = (Object)adaptor.becomeRoot(INHERITS59_tree, root_0);

            // nl/cwi/cacoj/creol/Creol.g:216:14: ( class_list )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case CLASS_IDENTIFIER:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:216:14: class_list
            	    {
            	    pushFollow(FOLLOW_class_list_in_interface_inherits637);
            	    class_list60=class_list();

            	    state._fsp--;

            	    adaptor.addChild(root_0, class_list60.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interface_inherits"

    public static class datatype_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype_decl"
    // nl/cwi/cacoj/creol/Creol.g:219:1: datatype_decl : DATATYPE type ( from )? ( pragma )* ;
    public final CreolParser.datatype_decl_return datatype_decl() throws RecognitionException {
        CreolParser.datatype_decl_return retval = new CreolParser.datatype_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATATYPE61=null;
        CreolParser.type_return type62 = null;

        CreolParser.from_return from63 = null;

        CreolParser.pragma_return pragma64 = null;


        Object DATATYPE61_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:219:15: ( DATATYPE type ( from )? ( pragma )* )
            // nl/cwi/cacoj/creol/Creol.g:219:17: DATATYPE type ( from )? ( pragma )*
            {
            root_0 = (Object)adaptor.nil();

            DATATYPE61=(Token)match(input,DATATYPE,FOLLOW_DATATYPE_in_datatype_decl648); 
            DATATYPE61_tree = (Object)adaptor.create(DATATYPE61);
            root_0 = (Object)adaptor.becomeRoot(DATATYPE61_tree, root_0);

            pushFollow(FOLLOW_type_in_datatype_decl651);
            type62=type();

            state._fsp--;

            adaptor.addChild(root_0, type62.getTree());
            // nl/cwi/cacoj/creol/Creol.g:219:32: ( from )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:219:32: from
                    {
                    pushFollow(FOLLOW_from_in_datatype_decl653);
                    from63=from();

                    state._fsp--;

                    adaptor.addChild(root_0, from63.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:219:38: ( pragma )*
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
            	    // nl/cwi/cacoj/creol/Creol.g:219:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_datatype_decl656);
            	    pragma64=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma64.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datatype_decl"

    public static class from_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "from"
    // nl/cwi/cacoj/creol/Creol.g:222:1: from : FROM ( type_list )? ;
    public final CreolParser.from_return from() throws RecognitionException {
        CreolParser.from_return retval = new CreolParser.from_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM65=null;
        CreolParser.type_list_return type_list66 = null;


        Object FROM65_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:222:6: ( FROM ( type_list )? )
            // nl/cwi/cacoj/creol/Creol.g:222:8: FROM ( type_list )?
            {
            root_0 = (Object)adaptor.nil();

            FROM65=(Token)match(input,FROM,FOLLOW_FROM_in_from667); 
            FROM65_tree = (Object)adaptor.create(FROM65);
            root_0 = (Object)adaptor.becomeRoot(FROM65_tree, root_0);

            // nl/cwi/cacoj/creol/Creol.g:222:14: ( type_list )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case CLASS_IDENTIFIER:
                case LBRACK:
                case APOSTROPHE:
                    {
                    alt27=1;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:222:14: type_list
                    {
                    pushFollow(FOLLOW_type_list_in_from670);
                    type_list66=type_list();

                    state._fsp--;

                    adaptor.addChild(root_0, type_list66.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "from"

    public static class function_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_decl"
    // nl/cwi/cacoj/creol/Creol.g:225:1: function_decl : FUNCTION id_or_op ( var_decl_no_init_argument )? COLON type ( pragma )* function_body ;
    public final CreolParser.function_decl_return function_decl() throws RecognitionException {
        CreolParser.function_decl_return retval = new CreolParser.function_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FUNCTION67=null;
        Token COLON70=null;
        CreolParser.id_or_op_return id_or_op68 = null;

        CreolParser.var_decl_no_init_argument_return var_decl_no_init_argument69 = null;

        CreolParser.type_return type71 = null;

        CreolParser.pragma_return pragma72 = null;

        CreolParser.function_body_return function_body73 = null;


        Object FUNCTION67_tree=null;
        Object COLON70_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:225:15: ( FUNCTION id_or_op ( var_decl_no_init_argument )? COLON type ( pragma )* function_body )
            // nl/cwi/cacoj/creol/Creol.g:225:17: FUNCTION id_or_op ( var_decl_no_init_argument )? COLON type ( pragma )* function_body
            {
            root_0 = (Object)adaptor.nil();

            FUNCTION67=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_decl681); 
            FUNCTION67_tree = (Object)adaptor.create(FUNCTION67);
            root_0 = (Object)adaptor.becomeRoot(FUNCTION67_tree, root_0);

            pushFollow(FOLLOW_id_or_op_in_function_decl684);
            id_or_op68=id_or_op();

            state._fsp--;

            adaptor.addChild(root_0, id_or_op68.getTree());
            // nl/cwi/cacoj/creol/Creol.g:225:36: ( var_decl_no_init_argument )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt28=1;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:225:36: var_decl_no_init_argument
                    {
                    pushFollow(FOLLOW_var_decl_no_init_argument_in_function_decl686);
                    var_decl_no_init_argument69=var_decl_no_init_argument();

                    state._fsp--;

                    adaptor.addChild(root_0, var_decl_no_init_argument69.getTree());

                    }
                    break;

            }

            COLON70=(Token)match(input,COLON,FOLLOW_COLON_in_function_decl689); 
            pushFollow(FOLLOW_type_in_function_decl692);
            type71=type();

            state._fsp--;

            adaptor.addChild(root_0, type71.getTree());
            // nl/cwi/cacoj/creol/Creol.g:225:75: ( pragma )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case PRAGMA:
                    {
                    alt29=1;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:225:75: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_function_decl694);
            	    pragma72=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma72.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            pushFollow(FOLLOW_function_body_in_function_decl697);
            function_body73=function_body();

            state._fsp--;

            adaptor.addChild(root_0, function_body73.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_decl"

    public static class function_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_body"
    // nl/cwi/cacoj/creol/Creol.g:228:1: function_body : DOUBLE_EQUAL ( expr -> ^( BODY expr ) | extern -> extern ) ;
    public final CreolParser.function_body_return function_body() throws RecognitionException {
        CreolParser.function_body_return retval = new CreolParser.function_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_EQUAL74=null;
        CreolParser.expr_return expr75 = null;

        CreolParser.extern_return extern76 = null;


        Object DOUBLE_EQUAL74_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_EQUAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_EQUAL");
        RewriteRuleSubtreeStream stream_extern=new RewriteRuleSubtreeStream(adaptor,"rule extern");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // nl/cwi/cacoj/creol/Creol.g:228:15: ( DOUBLE_EQUAL ( expr -> ^( BODY expr ) | extern -> extern ) )
            // nl/cwi/cacoj/creol/Creol.g:228:17: DOUBLE_EQUAL ( expr -> ^( BODY expr ) | extern -> extern )
            {
            DOUBLE_EQUAL74=(Token)match(input,DOUBLE_EQUAL,FOLLOW_DOUBLE_EQUAL_in_function_body707);  
            stream_DOUBLE_EQUAL.add(DOUBLE_EQUAL74);

            // nl/cwi/cacoj/creol/Creol.g:229:2: ( expr -> ^( BODY expr ) | extern -> extern )
            int alt30=2;
            switch ( input.LA(1) ) {
            case LPAREN:
            case IDENTIFIER:
            case NOT:
            case MINUS:
            case NUMBER_SIGN:
            case STRING:
            case SCHEMAVAR:
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
            case LBRACK:
            case LBRACES:
                {
                alt30=1;
                }
                break;
            case EXTERNAL:
                {
                alt30=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:229:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_function_body712);
                    expr75=expr();

                    state._fsp--;

                    stream_expr.add(expr75.getTree());


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:9: -> ^( BODY expr )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:229:12: ^( BODY expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:231:2: extern
                    {
                    pushFollow(FOLLOW_extern_in_function_body726);
                    extern76=extern();

                    state._fsp--;

                    stream_extern.add(extern76.getTree());


                    // AST REWRITE
                    // elements: extern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:9: -> extern
                    {
                        adaptor.addChild(root_0, stream_extern.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_body"

    public static class id_or_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id_or_op"
    // nl/cwi/cacoj/creol/Creol.g:235:1: id_or_op : ( IDENTIFIER -> ^( ID IDENTIFIER ) | operator -> ^( OP operator ) ) ;
    public final CreolParser.id_or_op_return id_or_op() throws RecognitionException {
        CreolParser.id_or_op_return retval = new CreolParser.id_or_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER77=null;
        CreolParser.operator_return operator78 = null;


        Object IDENTIFIER77_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // nl/cwi/cacoj/creol/Creol.g:235:10: ( ( IDENTIFIER -> ^( ID IDENTIFIER ) | operator -> ^( OP operator ) ) )
            // nl/cwi/cacoj/creol/Creol.g:235:12: ( IDENTIFIER -> ^( ID IDENTIFIER ) | operator -> ^( OP operator ) )
            {
            // nl/cwi/cacoj/creol/Creol.g:235:12: ( IDENTIFIER -> ^( ID IDENTIFIER ) | operator -> ^( OP operator ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt31=1;
                }
                break;
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
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
                {
                alt31=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:235:13: IDENTIFIER
                    {
                    IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id_or_op744);  
                    stream_IDENTIFIER.add(IDENTIFIER77);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:24: -> ^( ID IDENTIFIER )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:235:27: ^( ID IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:236:4: operator
                    {
                    pushFollow(FOLLOW_operator_in_id_or_op757);
                    operator78=operator();

                    state._fsp--;

                    stream_operator.add(operator78.getTree());


                    // AST REWRITE
                    // elements: operator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:13: -> ^( OP operator )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:236:16: ^( OP operator )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OP, "OP"), root_1);

                        adaptor.addChild(root_1, stream_operator.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id_or_op"

    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // nl/cwi/cacoj/creol/Creol.g:240:1: operator : ( IN | NOT | EQUIVALENCE | IMPLICATION | XOR | OR | AND | EQUALITY | INEQUALITY | comp_op | PROJECTION | CONCAT | PREPEND | APPEND | PLUS | MINUS | MULT | DIV | MOD | POW | NUMBER_SIGN );
    public final CreolParser.operator_return operator() throws RecognitionException {
        CreolParser.operator_return retval = new CreolParser.operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN79=null;
        Token NOT80=null;
        Token EQUIVALENCE81=null;
        Token IMPLICATION82=null;
        Token XOR83=null;
        Token OR84=null;
        Token AND85=null;
        Token EQUALITY86=null;
        Token INEQUALITY87=null;
        Token PROJECTION89=null;
        Token CONCAT90=null;
        Token PREPEND91=null;
        Token APPEND92=null;
        Token PLUS93=null;
        Token MINUS94=null;
        Token MULT95=null;
        Token DIV96=null;
        Token MOD97=null;
        Token POW98=null;
        Token NUMBER_SIGN99=null;
        CreolParser.comp_op_return comp_op88 = null;


        Object IN79_tree=null;
        Object NOT80_tree=null;
        Object EQUIVALENCE81_tree=null;
        Object IMPLICATION82_tree=null;
        Object XOR83_tree=null;
        Object OR84_tree=null;
        Object AND85_tree=null;
        Object EQUALITY86_tree=null;
        Object INEQUALITY87_tree=null;
        Object PROJECTION89_tree=null;
        Object CONCAT90_tree=null;
        Object PREPEND91_tree=null;
        Object APPEND92_tree=null;
        Object PLUS93_tree=null;
        Object MINUS94_tree=null;
        Object MULT95_tree=null;
        Object DIV96_tree=null;
        Object MOD97_tree=null;
        Object POW98_tree=null;
        Object NUMBER_SIGN99_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:240:10: ( IN | NOT | EQUIVALENCE | IMPLICATION | XOR | OR | AND | EQUALITY | INEQUALITY | comp_op | PROJECTION | CONCAT | PREPEND | APPEND | PLUS | MINUS | MULT | DIV | MOD | POW | NUMBER_SIGN )
            int alt32=21;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:240:12: IN
                    {
                    root_0 = (Object)adaptor.nil();

                    IN79=(Token)match(input,IN,FOLLOW_IN_in_operator778); 
                    IN79_tree = (Object)adaptor.create(IN79);
                    adaptor.addChild(root_0, IN79_tree);


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:241:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT80=(Token)match(input,NOT,FOLLOW_NOT_in_operator783); 
                    NOT80_tree = (Object)adaptor.create(NOT80);
                    adaptor.addChild(root_0, NOT80_tree);


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:242:4: EQUIVALENCE
                    {
                    root_0 = (Object)adaptor.nil();

                    EQUIVALENCE81=(Token)match(input,EQUIVALENCE,FOLLOW_EQUIVALENCE_in_operator788); 
                    EQUIVALENCE81_tree = (Object)adaptor.create(EQUIVALENCE81);
                    adaptor.addChild(root_0, EQUIVALENCE81_tree);


                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/Creol.g:243:4: IMPLICATION
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPLICATION82=(Token)match(input,IMPLICATION,FOLLOW_IMPLICATION_in_operator793); 
                    IMPLICATION82_tree = (Object)adaptor.create(IMPLICATION82);
                    adaptor.addChild(root_0, IMPLICATION82_tree);


                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/Creol.g:244:4: XOR
                    {
                    root_0 = (Object)adaptor.nil();

                    XOR83=(Token)match(input,XOR,FOLLOW_XOR_in_operator798); 
                    XOR83_tree = (Object)adaptor.create(XOR83);
                    adaptor.addChild(root_0, XOR83_tree);


                    }
                    break;
                case 6 :
                    // nl/cwi/cacoj/creol/Creol.g:245:4: OR
                    {
                    root_0 = (Object)adaptor.nil();

                    OR84=(Token)match(input,OR,FOLLOW_OR_in_operator803); 
                    OR84_tree = (Object)adaptor.create(OR84);
                    adaptor.addChild(root_0, OR84_tree);


                    }
                    break;
                case 7 :
                    // nl/cwi/cacoj/creol/Creol.g:246:4: AND
                    {
                    root_0 = (Object)adaptor.nil();

                    AND85=(Token)match(input,AND,FOLLOW_AND_in_operator808); 
                    AND85_tree = (Object)adaptor.create(AND85);
                    adaptor.addChild(root_0, AND85_tree);


                    }
                    break;
                case 8 :
                    // nl/cwi/cacoj/creol/Creol.g:247:4: EQUALITY
                    {
                    root_0 = (Object)adaptor.nil();

                    EQUALITY86=(Token)match(input,EQUALITY,FOLLOW_EQUALITY_in_operator813); 
                    EQUALITY86_tree = (Object)adaptor.create(EQUALITY86);
                    adaptor.addChild(root_0, EQUALITY86_tree);


                    }
                    break;
                case 9 :
                    // nl/cwi/cacoj/creol/Creol.g:248:4: INEQUALITY
                    {
                    root_0 = (Object)adaptor.nil();

                    INEQUALITY87=(Token)match(input,INEQUALITY,FOLLOW_INEQUALITY_in_operator818); 
                    INEQUALITY87_tree = (Object)adaptor.create(INEQUALITY87);
                    adaptor.addChild(root_0, INEQUALITY87_tree);


                    }
                    break;
                case 10 :
                    // nl/cwi/cacoj/creol/Creol.g:249:4: comp_op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_comp_op_in_operator823);
                    comp_op88=comp_op();

                    state._fsp--;

                    adaptor.addChild(root_0, comp_op88.getTree());

                    }
                    break;
                case 11 :
                    // nl/cwi/cacoj/creol/Creol.g:250:4: PROJECTION
                    {
                    root_0 = (Object)adaptor.nil();

                    PROJECTION89=(Token)match(input,PROJECTION,FOLLOW_PROJECTION_in_operator828); 
                    PROJECTION89_tree = (Object)adaptor.create(PROJECTION89);
                    adaptor.addChild(root_0, PROJECTION89_tree);


                    }
                    break;
                case 12 :
                    // nl/cwi/cacoj/creol/Creol.g:251:4: CONCAT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONCAT90=(Token)match(input,CONCAT,FOLLOW_CONCAT_in_operator833); 
                    CONCAT90_tree = (Object)adaptor.create(CONCAT90);
                    adaptor.addChild(root_0, CONCAT90_tree);


                    }
                    break;
                case 13 :
                    // nl/cwi/cacoj/creol/Creol.g:252:4: PREPEND
                    {
                    root_0 = (Object)adaptor.nil();

                    PREPEND91=(Token)match(input,PREPEND,FOLLOW_PREPEND_in_operator838); 
                    PREPEND91_tree = (Object)adaptor.create(PREPEND91);
                    adaptor.addChild(root_0, PREPEND91_tree);


                    }
                    break;
                case 14 :
                    // nl/cwi/cacoj/creol/Creol.g:253:4: APPEND
                    {
                    root_0 = (Object)adaptor.nil();

                    APPEND92=(Token)match(input,APPEND,FOLLOW_APPEND_in_operator843); 
                    APPEND92_tree = (Object)adaptor.create(APPEND92);
                    adaptor.addChild(root_0, APPEND92_tree);


                    }
                    break;
                case 15 :
                    // nl/cwi/cacoj/creol/Creol.g:254:4: PLUS
                    {
                    root_0 = (Object)adaptor.nil();

                    PLUS93=(Token)match(input,PLUS,FOLLOW_PLUS_in_operator848); 
                    PLUS93_tree = (Object)adaptor.create(PLUS93);
                    adaptor.addChild(root_0, PLUS93_tree);


                    }
                    break;
                case 16 :
                    // nl/cwi/cacoj/creol/Creol.g:255:4: MINUS
                    {
                    root_0 = (Object)adaptor.nil();

                    MINUS94=(Token)match(input,MINUS,FOLLOW_MINUS_in_operator853); 
                    MINUS94_tree = (Object)adaptor.create(MINUS94);
                    adaptor.addChild(root_0, MINUS94_tree);


                    }
                    break;
                case 17 :
                    // nl/cwi/cacoj/creol/Creol.g:256:4: MULT
                    {
                    root_0 = (Object)adaptor.nil();

                    MULT95=(Token)match(input,MULT,FOLLOW_MULT_in_operator858); 
                    MULT95_tree = (Object)adaptor.create(MULT95);
                    adaptor.addChild(root_0, MULT95_tree);


                    }
                    break;
                case 18 :
                    // nl/cwi/cacoj/creol/Creol.g:257:4: DIV
                    {
                    root_0 = (Object)adaptor.nil();

                    DIV96=(Token)match(input,DIV,FOLLOW_DIV_in_operator863); 
                    DIV96_tree = (Object)adaptor.create(DIV96);
                    adaptor.addChild(root_0, DIV96_tree);


                    }
                    break;
                case 19 :
                    // nl/cwi/cacoj/creol/Creol.g:258:4: MOD
                    {
                    root_0 = (Object)adaptor.nil();

                    MOD97=(Token)match(input,MOD,FOLLOW_MOD_in_operator868); 
                    MOD97_tree = (Object)adaptor.create(MOD97);
                    adaptor.addChild(root_0, MOD97_tree);


                    }
                    break;
                case 20 :
                    // nl/cwi/cacoj/creol/Creol.g:259:4: POW
                    {
                    root_0 = (Object)adaptor.nil();

                    POW98=(Token)match(input,POW,FOLLOW_POW_in_operator873); 
                    POW98_tree = (Object)adaptor.create(POW98);
                    adaptor.addChild(root_0, POW98_tree);


                    }
                    break;
                case 21 :
                    // nl/cwi/cacoj/creol/Creol.g:260:4: NUMBER_SIGN
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER_SIGN99=(Token)match(input,NUMBER_SIGN,FOLLOW_NUMBER_SIGN_in_operator878); 
                    NUMBER_SIGN99_tree = (Object)adaptor.create(NUMBER_SIGN99);
                    adaptor.addChild(root_0, NUMBER_SIGN99_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class with_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "with_decl"
    // nl/cwi/cacoj/creol/Creol.g:263:1: with_decl : WITH type ( method_decl )+ ( invariant )* ;
    public final CreolParser.with_decl_return with_decl() throws RecognitionException {
        CreolParser.with_decl_return retval = new CreolParser.with_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH100=null;
        CreolParser.type_return type101 = null;

        CreolParser.method_decl_return method_decl102 = null;

        CreolParser.invariant_return invariant103 = null;


        Object WITH100_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:263:11: ( WITH type ( method_decl )+ ( invariant )* )
            // nl/cwi/cacoj/creol/Creol.g:263:13: WITH type ( method_decl )+ ( invariant )*
            {
            root_0 = (Object)adaptor.nil();

            WITH100=(Token)match(input,WITH,FOLLOW_WITH_in_with_decl888); 
            WITH100_tree = (Object)adaptor.create(WITH100);
            root_0 = (Object)adaptor.becomeRoot(WITH100_tree, root_0);

            pushFollow(FOLLOW_type_in_with_decl891);
            type101=type();

            state._fsp--;

            adaptor.addChild(root_0, type101.getTree());
            // nl/cwi/cacoj/creol/Creol.g:263:24: ( method_decl )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case OP:
                    {
                    alt33=1;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:263:24: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_with_decl893);
            	    method_decl102=method_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_decl102.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            // nl/cwi/cacoj/creol/Creol.g:263:37: ( invariant )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case INV:
                    {
                    alt34=1;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:263:37: invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_with_decl896);
            	    invariant103=invariant();

            	    state._fsp--;

            	    adaptor.addChild(root_0, invariant103.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_decl"

    public static class method_with_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_with_body"
    // nl/cwi/cacoj/creol/Creol.g:266:1: method_with_body : OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )* method_body ;
    public final CreolParser.method_with_body_return method_with_body() throws RecognitionException {
        CreolParser.method_with_body_return retval = new CreolParser.method_with_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP104=null;
        CreolParser.method_identifier_return method_identifier105 = null;

        CreolParser.method_param_return method_param106 = null;

        CreolParser.requires_return requires107 = null;

        CreolParser.ensures_return ensures108 = null;

        CreolParser.pragma_return pragma109 = null;

        CreolParser.method_body_return method_body110 = null;


        Object OP104_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:266:17: ( OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )* method_body )
            // nl/cwi/cacoj/creol/Creol.g:266:19: OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )* method_body
            {
            root_0 = (Object)adaptor.nil();

            OP104=(Token)match(input,OP,FOLLOW_OP_in_method_with_body906); 
            OP104_tree = (Object)adaptor.create(OP104);
            root_0 = (Object)adaptor.becomeRoot(OP104_tree, root_0);

            pushFollow(FOLLOW_method_identifier_in_method_with_body909);
            method_identifier105=method_identifier();

            state._fsp--;

            adaptor.addChild(root_0, method_identifier105.getTree());
            // nl/cwi/cacoj/creol/Creol.g:267:2: ( method_param )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt35=1;
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:267:2: method_param
                    {
                    pushFollow(FOLLOW_method_param_in_method_with_body912);
                    method_param106=method_param();

                    state._fsp--;

                    adaptor.addChild(root_0, method_param106.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:268:2: ( requires )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case REQUIRES:
                    {
                    alt36=1;
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:268:2: requires
                    {
                    pushFollow(FOLLOW_requires_in_method_with_body916);
                    requires107=requires();

                    state._fsp--;

                    adaptor.addChild(root_0, requires107.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:269:2: ( ensures )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case ENSURES:
                    {
                    alt37=1;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:269:2: ensures
                    {
                    pushFollow(FOLLOW_ensures_in_method_with_body920);
                    ensures108=ensures();

                    state._fsp--;

                    adaptor.addChild(root_0, ensures108.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:270:2: ( pragma )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case PRAGMA:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:270:2: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_method_with_body924);
            	    pragma109=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma109.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            pushFollow(FOLLOW_method_body_in_method_with_body928);
            method_body110=method_body();

            state._fsp--;

            adaptor.addChild(root_0, method_body110.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_with_body"

    public static class method_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_identifier"
    // nl/cwi/cacoj/creol/Creol.g:274:1: method_identifier : IDENTIFIER -> ^( ID IDENTIFIER ) ;
    public final CreolParser.method_identifier_return method_identifier() throws RecognitionException {
        CreolParser.method_identifier_return retval = new CreolParser.method_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER111=null;

        Object IDENTIFIER111_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // nl/cwi/cacoj/creol/Creol.g:275:2: ( IDENTIFIER -> ^( ID IDENTIFIER ) )
            // nl/cwi/cacoj/creol/Creol.g:275:4: IDENTIFIER
            {
            IDENTIFIER111=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_method_identifier939);  
            stream_IDENTIFIER.add(IDENTIFIER111);



            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 275:15: -> ^( ID IDENTIFIER )
            {
                // nl/cwi/cacoj/creol/Creol.g:275:18: ^( ID IDENTIFIER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_identifier"

    public static class method_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_body"
    // nl/cwi/cacoj/creol/Creol.g:278:1: method_body : DOUBLE_EQUAL ( ( priority_decl )? decl_statement -> ^( BODY ( priority_decl )? decl_statement ) | extern -> extern ) ;
    public final CreolParser.method_body_return method_body() throws RecognitionException {
        CreolParser.method_body_return retval = new CreolParser.method_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_EQUAL112=null;
        CreolParser.priority_decl_return priority_decl113 = null;

        CreolParser.decl_statement_return decl_statement114 = null;

        CreolParser.extern_return extern115 = null;


        Object DOUBLE_EQUAL112_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_EQUAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_EQUAL");
        RewriteRuleSubtreeStream stream_priority_decl=new RewriteRuleSubtreeStream(adaptor,"rule priority_decl");
        RewriteRuleSubtreeStream stream_extern=new RewriteRuleSubtreeStream(adaptor,"rule extern");
        RewriteRuleSubtreeStream stream_decl_statement=new RewriteRuleSubtreeStream(adaptor,"rule decl_statement");
        try {
            // nl/cwi/cacoj/creol/Creol.g:278:13: ( DOUBLE_EQUAL ( ( priority_decl )? decl_statement -> ^( BODY ( priority_decl )? decl_statement ) | extern -> extern ) )
            // nl/cwi/cacoj/creol/Creol.g:278:15: DOUBLE_EQUAL ( ( priority_decl )? decl_statement -> ^( BODY ( priority_decl )? decl_statement ) | extern -> extern )
            {
            DOUBLE_EQUAL112=(Token)match(input,DOUBLE_EQUAL,FOLLOW_DOUBLE_EQUAL_in_method_body957);  
            stream_DOUBLE_EQUAL.add(DOUBLE_EQUAL112);

            // nl/cwi/cacoj/creol/Creol.g:279:2: ( ( priority_decl )? decl_statement -> ^( BODY ( priority_decl )? decl_statement ) | extern -> extern )
            int alt40=2;
            switch ( input.LA(1) ) {
            case BEGIN:
            case VAR:
            case LPAREN:
            case IDENTIFIER:
            case NOT:
            case MINUS:
            case NUMBER_SIGN:
            case PRIORITY:
            case STRING:
            case EXCLENATION_MARK:
            case SCHEMAVAR:
            case WHILE:
            case DO:
            case AWAIT:
            case PROVE:
            case ASSERT:
            case POSIT:
            case SKIP:
            case RELEASE:
            case BLOCK:
            case RETURN:
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
            case LBRACK:
            case LBRACES:
            case IF:
                {
                alt40=1;
                }
                break;
            case EXTERNAL:
                {
                alt40=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:279:4: ( priority_decl )? decl_statement
                    {
                    // nl/cwi/cacoj/creol/Creol.g:279:4: ( priority_decl )?
                    int alt39=2;
                    switch ( input.LA(1) ) {
                        case PRIORITY:
                            {
                            alt39=1;
                            }
                            break;
                    }

                    switch (alt39) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:279:4: priority_decl
                            {
                            pushFollow(FOLLOW_priority_decl_in_method_body962);
                            priority_decl113=priority_decl();

                            state._fsp--;

                            stream_priority_decl.add(priority_decl113.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_decl_statement_in_method_body965);
                    decl_statement114=decl_statement();

                    state._fsp--;

                    stream_decl_statement.add(decl_statement114.getTree());


                    // AST REWRITE
                    // elements: decl_statement, priority_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 279:34: -> ^( BODY ( priority_decl )? decl_statement )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:279:37: ^( BODY ( priority_decl )? decl_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                        // nl/cwi/cacoj/creol/Creol.g:279:44: ( priority_decl )?
                        if ( stream_priority_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_priority_decl.nextTree());

                        }
                        stream_priority_decl.reset();
                        adaptor.addChild(root_1, stream_decl_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:281:2: extern
                    {
                    pushFollow(FOLLOW_extern_in_method_body982);
                    extern115=extern();

                    state._fsp--;

                    stream_extern.add(extern115.getTree());


                    // AST REWRITE
                    // elements: extern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 281:9: -> extern
                    {
                        adaptor.addChild(root_0, stream_extern.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_body"

    public static class priority_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "priority_decl"
    // nl/cwi/cacoj/creol/Creol.g:285:1: priority_decl : PRIORITY LPAREN expr RPAREN SEMICOLON -> ^( PRIORITIZE expr ) ;
    public final CreolParser.priority_decl_return priority_decl() throws RecognitionException {
        CreolParser.priority_decl_return retval = new CreolParser.priority_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIORITY116=null;
        Token LPAREN117=null;
        Token RPAREN119=null;
        Token SEMICOLON120=null;
        CreolParser.expr_return expr118 = null;


        Object PRIORITY116_tree=null;
        Object LPAREN117_tree=null;
        Object RPAREN119_tree=null;
        Object SEMICOLON120_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PRIORITY=new RewriteRuleTokenStream(adaptor,"token PRIORITY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // nl/cwi/cacoj/creol/Creol.g:286:2: ( PRIORITY LPAREN expr RPAREN SEMICOLON -> ^( PRIORITIZE expr ) )
            // nl/cwi/cacoj/creol/Creol.g:286:4: PRIORITY LPAREN expr RPAREN SEMICOLON
            {
            PRIORITY116=(Token)match(input,PRIORITY,FOLLOW_PRIORITY_in_priority_decl1000);  
            stream_PRIORITY.add(PRIORITY116);

            LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_priority_decl1002);  
            stream_LPAREN.add(LPAREN117);

            pushFollow(FOLLOW_expr_in_priority_decl1004);
            expr118=expr();

            state._fsp--;

            stream_expr.add(expr118.getTree());
            RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_priority_decl1006);  
            stream_RPAREN.add(RPAREN119);

            SEMICOLON120=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_priority_decl1008);  
            stream_SEMICOLON.add(SEMICOLON120);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:42: -> ^( PRIORITIZE expr )
            {
                // nl/cwi/cacoj/creol/Creol.g:286:45: ^( PRIORITIZE expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRIORITIZE, "PRIORITIZE"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "priority_decl"

    public static class extern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extern"
    // nl/cwi/cacoj/creol/Creol.g:288:1: extern : EXTERNAL STRING ;
    public final CreolParser.extern_return extern() throws RecognitionException {
        CreolParser.extern_return retval = new CreolParser.extern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXTERNAL121=null;
        Token STRING122=null;

        Object EXTERNAL121_tree=null;
        Object STRING122_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:288:8: ( EXTERNAL STRING )
            // nl/cwi/cacoj/creol/Creol.g:288:10: EXTERNAL STRING
            {
            root_0 = (Object)adaptor.nil();

            EXTERNAL121=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_extern1024); 
            EXTERNAL121_tree = (Object)adaptor.create(EXTERNAL121);
            root_0 = (Object)adaptor.becomeRoot(EXTERNAL121_tree, root_0);

            STRING122=(Token)match(input,STRING,FOLLOW_STRING_in_extern1027); 
            STRING122_tree = (Object)adaptor.create(STRING122);
            adaptor.addChild(root_0, STRING122_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extern"

    public static class method_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // nl/cwi/cacoj/creol/Creol.g:291:1: method_decl : ( OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )* ) ;
    public final CreolParser.method_decl_return method_decl() throws RecognitionException {
        CreolParser.method_decl_return retval = new CreolParser.method_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP123=null;
        CreolParser.method_identifier_return method_identifier124 = null;

        CreolParser.method_param_return method_param125 = null;

        CreolParser.requires_return requires126 = null;

        CreolParser.ensures_return ensures127 = null;

        CreolParser.pragma_return pragma128 = null;


        Object OP123_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:291:13: ( ( OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )* ) )
            // nl/cwi/cacoj/creol/Creol.g:291:15: ( OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )* )
            {
            root_0 = (Object)adaptor.nil();

            // nl/cwi/cacoj/creol/Creol.g:291:15: ( OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )* )
            // nl/cwi/cacoj/creol/Creol.g:291:16: OP method_identifier ( method_param )? ( requires )? ( ensures )? ( pragma )*
            {
            OP123=(Token)match(input,OP,FOLLOW_OP_in_method_decl1038); 
            OP123_tree = (Object)adaptor.create(OP123);
            root_0 = (Object)adaptor.becomeRoot(OP123_tree, root_0);

            pushFollow(FOLLOW_method_identifier_in_method_decl1041);
            method_identifier124=method_identifier();

            state._fsp--;

            adaptor.addChild(root_0, method_identifier124.getTree());
            // nl/cwi/cacoj/creol/Creol.g:292:2: ( method_param )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt41=1;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:292:2: method_param
                    {
                    pushFollow(FOLLOW_method_param_in_method_decl1044);
                    method_param125=method_param();

                    state._fsp--;

                    adaptor.addChild(root_0, method_param125.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:293:2: ( requires )?
            int alt42=2;
            switch ( input.LA(1) ) {
                case REQUIRES:
                    {
                    alt42=1;
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:293:2: requires
                    {
                    pushFollow(FOLLOW_requires_in_method_decl1048);
                    requires126=requires();

                    state._fsp--;

                    adaptor.addChild(root_0, requires126.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:294:2: ( ensures )?
            int alt43=2;
            switch ( input.LA(1) ) {
                case ENSURES:
                    {
                    alt43=1;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:294:2: ensures
                    {
                    pushFollow(FOLLOW_ensures_in_method_decl1052);
                    ensures127=ensures();

                    state._fsp--;

                    adaptor.addChild(root_0, ensures127.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:295:2: ( pragma )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case PRAGMA:
                    {
                    alt44=1;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:295:2: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_method_decl1056);
            	    pragma128=pragma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pragma128.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_decl"

    public static class requires_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "requires"
    // nl/cwi/cacoj/creol/Creol.g:298:1: requires : REQUIRES expr ;
    public final CreolParser.requires_return requires() throws RecognitionException {
        CreolParser.requires_return retval = new CreolParser.requires_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REQUIRES129=null;
        CreolParser.expr_return expr130 = null;


        Object REQUIRES129_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:298:10: ( REQUIRES expr )
            // nl/cwi/cacoj/creol/Creol.g:298:12: REQUIRES expr
            {
            root_0 = (Object)adaptor.nil();

            REQUIRES129=(Token)match(input,REQUIRES,FOLLOW_REQUIRES_in_requires1068); 
            REQUIRES129_tree = (Object)adaptor.create(REQUIRES129);
            root_0 = (Object)adaptor.becomeRoot(REQUIRES129_tree, root_0);

            pushFollow(FOLLOW_expr_in_requires1071);
            expr130=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr130.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "requires"

    public static class ensures_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ensures"
    // nl/cwi/cacoj/creol/Creol.g:301:1: ensures : ENSURES expr ;
    public final CreolParser.ensures_return ensures() throws RecognitionException {
        CreolParser.ensures_return retval = new CreolParser.ensures_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENSURES131=null;
        CreolParser.expr_return expr132 = null;


        Object ENSURES131_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:301:9: ( ENSURES expr )
            // nl/cwi/cacoj/creol/Creol.g:301:11: ENSURES expr
            {
            root_0 = (Object)adaptor.nil();

            ENSURES131=(Token)match(input,ENSURES,FOLLOW_ENSURES_in_ensures1081); 
            ENSURES131_tree = (Object)adaptor.create(ENSURES131);
            root_0 = (Object)adaptor.becomeRoot(ENSURES131_tree, root_0);

            pushFollow(FOLLOW_expr_in_ensures1084);
            expr132=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr132.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ensures"

    public static class method_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_param"
    // nl/cwi/cacoj/creol/Creol.g:304:1: method_param : ( LPAREN ( method_param_in )? ( method_param_out )? RPAREN ) -> ^( PRM ( method_param_in )? ( method_param_out )? ) ;
    public final CreolParser.method_param_return method_param() throws RecognitionException {
        CreolParser.method_param_return retval = new CreolParser.method_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN133=null;
        Token RPAREN136=null;
        CreolParser.method_param_in_return method_param_in134 = null;

        CreolParser.method_param_out_return method_param_out135 = null;


        Object LPAREN133_tree=null;
        Object RPAREN136_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_method_param_in=new RewriteRuleSubtreeStream(adaptor,"rule method_param_in");
        RewriteRuleSubtreeStream stream_method_param_out=new RewriteRuleSubtreeStream(adaptor,"rule method_param_out");
        try {
            // nl/cwi/cacoj/creol/Creol.g:304:13: ( ( LPAREN ( method_param_in )? ( method_param_out )? RPAREN ) -> ^( PRM ( method_param_in )? ( method_param_out )? ) )
            // nl/cwi/cacoj/creol/Creol.g:304:15: ( LPAREN ( method_param_in )? ( method_param_out )? RPAREN )
            {
            // nl/cwi/cacoj/creol/Creol.g:304:15: ( LPAREN ( method_param_in )? ( method_param_out )? RPAREN )
            // nl/cwi/cacoj/creol/Creol.g:304:16: LPAREN ( method_param_in )? ( method_param_out )? RPAREN
            {
            LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_param1094);  
            stream_LPAREN.add(LPAREN133);

            // nl/cwi/cacoj/creol/Creol.g:305:2: ( method_param_in )?
            int alt45=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                case IDENTIFIER:
                case IN:
                case NOT:
                case MINUS:
                case NUMBER_SIGN:
                case STRING:
                case SCHEMAVAR:
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
                case LBRACK:
                case LBRACES:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:305:2: method_param_in
                    {
                    pushFollow(FOLLOW_method_param_in_in_method_param1097);
                    method_param_in134=method_param_in();

                    state._fsp--;

                    stream_method_param_in.add(method_param_in134.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:306:2: ( method_param_out )?
            int alt46=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                case OUT:
                    {
                    alt46=1;
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:306:2: method_param_out
                    {
                    pushFollow(FOLLOW_method_param_out_in_method_param1101);
                    method_param_out135=method_param_out();

                    state._fsp--;

                    stream_method_param_out.add(method_param_out135.getTree());

                    }
                    break;

            }

            RPAREN136=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_param1105);  
            stream_RPAREN.add(RPAREN136);


            }



            // AST REWRITE
            // elements: method_param_in, method_param_out
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 308:2: -> ^( PRM ( method_param_in )? ( method_param_out )? )
            {
                // nl/cwi/cacoj/creol/Creol.g:308:5: ^( PRM ( method_param_in )? ( method_param_out )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRM, "PRM"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:308:11: ( method_param_in )?
                if ( stream_method_param_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_param_in.nextTree());

                }
                stream_method_param_in.reset();
                // nl/cwi/cacoj/creol/Creol.g:308:28: ( method_param_out )?
                if ( stream_method_param_out.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_param_out.nextTree());

                }
                stream_method_param_out.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_param"

    public static class method_param_in_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_param_in"
    // nl/cwi/cacoj/creol/Creol.g:311:1: method_param_in : ( ( IN )? var_decl_no_init_list ) -> ^( IN_PRM var_decl_no_init_list ) ;
    public final CreolParser.method_param_in_return method_param_in() throws RecognitionException {
        CreolParser.method_param_in_return retval = new CreolParser.method_param_in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN137=null;
        CreolParser.var_decl_no_init_list_return var_decl_no_init_list138 = null;


        Object IN137_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleSubtreeStream stream_var_decl_no_init_list=new RewriteRuleSubtreeStream(adaptor,"rule var_decl_no_init_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:312:2: ( ( ( IN )? var_decl_no_init_list ) -> ^( IN_PRM var_decl_no_init_list ) )
            // nl/cwi/cacoj/creol/Creol.g:312:4: ( ( IN )? var_decl_no_init_list )
            {
            // nl/cwi/cacoj/creol/Creol.g:312:4: ( ( IN )? var_decl_no_init_list )
            // nl/cwi/cacoj/creol/Creol.g:312:5: ( IN )? var_decl_no_init_list
            {
            // nl/cwi/cacoj/creol/Creol.g:312:5: ( IN )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case IN:
                    {
                    alt47=1;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:312:5: IN
                    {
                    IN137=(Token)match(input,IN,FOLLOW_IN_in_method_param_in1131);  
                    stream_IN.add(IN137);


                    }
                    break;

            }

            pushFollow(FOLLOW_var_decl_no_init_list_in_method_param_in1134);
            var_decl_no_init_list138=var_decl_no_init_list();

            state._fsp--;

            stream_var_decl_no_init_list.add(var_decl_no_init_list138.getTree());

            }



            // AST REWRITE
            // elements: var_decl_no_init_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 312:32: -> ^( IN_PRM var_decl_no_init_list )
            {
                // nl/cwi/cacoj/creol/Creol.g:312:35: ^( IN_PRM var_decl_no_init_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_PRM, "IN_PRM"), root_1);

                adaptor.addChild(root_1, stream_var_decl_no_init_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_param_in"

    public static class method_param_out_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_param_out"
    // nl/cwi/cacoj/creol/Creol.g:315:1: method_param_out : ( ( SEMICOLON )? OUT var_decl_no_init_list ) ;
    public final CreolParser.method_param_out_return method_param_out() throws RecognitionException {
        CreolParser.method_param_out_return retval = new CreolParser.method_param_out_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON139=null;
        Token OUT140=null;
        CreolParser.var_decl_no_init_list_return var_decl_no_init_list141 = null;


        Object SEMICOLON139_tree=null;
        Object OUT140_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:316:2: ( ( ( SEMICOLON )? OUT var_decl_no_init_list ) )
            // nl/cwi/cacoj/creol/Creol.g:316:4: ( ( SEMICOLON )? OUT var_decl_no_init_list )
            {
            root_0 = (Object)adaptor.nil();

            // nl/cwi/cacoj/creol/Creol.g:316:4: ( ( SEMICOLON )? OUT var_decl_no_init_list )
            // nl/cwi/cacoj/creol/Creol.g:316:5: ( SEMICOLON )? OUT var_decl_no_init_list
            {
            // nl/cwi/cacoj/creol/Creol.g:316:14: ( SEMICOLON )?
            int alt48=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt48=1;
                    }
                    break;
            }

            switch (alt48) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:316:14: SEMICOLON
                    {
                    SEMICOLON139=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method_param_out1155); 

                    }
                    break;

            }

            OUT140=(Token)match(input,OUT,FOLLOW_OUT_in_method_param_out1159); 
            OUT140_tree = (Object)adaptor.create(OUT140);
            root_0 = (Object)adaptor.becomeRoot(OUT140_tree, root_0);

            pushFollow(FOLLOW_var_decl_no_init_list_in_method_param_out1162);
            var_decl_no_init_list141=var_decl_no_init_list();

            state._fsp--;

            adaptor.addChild(root_0, var_decl_no_init_list141.getTree());

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_param_out"

    public static class var_decl_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl_list"
    // nl/cwi/cacoj/creol/Creol.g:319:1: var_decl_list : var_decl ( KOMMA var_decl )* -> ( var_decl )+ ;
    public final CreolParser.var_decl_list_return var_decl_list() throws RecognitionException {
        CreolParser.var_decl_list_return retval = new CreolParser.var_decl_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA143=null;
        CreolParser.var_decl_return var_decl142 = null;

        CreolParser.var_decl_return var_decl144 = null;


        Object KOMMA143_tree=null;
        RewriteRuleTokenStream stream_KOMMA=new RewriteRuleTokenStream(adaptor,"token KOMMA");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // nl/cwi/cacoj/creol/Creol.g:319:15: ( var_decl ( KOMMA var_decl )* -> ( var_decl )+ )
            // nl/cwi/cacoj/creol/Creol.g:319:17: var_decl ( KOMMA var_decl )*
            {
            pushFollow(FOLLOW_var_decl_in_var_decl_list1173);
            var_decl142=var_decl();

            state._fsp--;

            stream_var_decl.add(var_decl142.getTree());
            // nl/cwi/cacoj/creol/Creol.g:319:26: ( KOMMA var_decl )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt49=1;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:319:27: KOMMA var_decl
            	    {
            	    KOMMA143=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_var_decl_list1176);  
            	    stream_KOMMA.add(KOMMA143);

            	    pushFollow(FOLLOW_var_decl_in_var_decl_list1178);
            	    var_decl144=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl144.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);



            // AST REWRITE
            // elements: var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 319:44: -> ( var_decl )+
            {
                if ( !(stream_var_decl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_0, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl_list"

    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // nl/cwi/cacoj/creol/Creol.g:322:1: var_decl : var_decl_no_init ( ASSIGN expr_or_new )? ;
    public final CreolParser.var_decl_return var_decl() throws RecognitionException {
        CreolParser.var_decl_return retval = new CreolParser.var_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN146=null;
        CreolParser.var_decl_no_init_return var_decl_no_init145 = null;

        CreolParser.expr_or_new_return expr_or_new147 = null;


        Object ASSIGN146_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:322:10: ( var_decl_no_init ( ASSIGN expr_or_new )? )
            // nl/cwi/cacoj/creol/Creol.g:322:12: var_decl_no_init ( ASSIGN expr_or_new )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_decl_no_init_in_var_decl1195);
            var_decl_no_init145=var_decl_no_init();

            state._fsp--;

            adaptor.addChild(root_0, var_decl_no_init145.getTree());
            // nl/cwi/cacoj/creol/Creol.g:322:29: ( ASSIGN expr_or_new )?
            int alt50=2;
            switch ( input.LA(1) ) {
                case ASSIGN:
                    {
                    alt50=1;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:322:30: ASSIGN expr_or_new
                    {
                    ASSIGN146=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_decl1198); 
                    ASSIGN146_tree = (Object)adaptor.create(ASSIGN146);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN146_tree, root_0);

                    pushFollow(FOLLOW_expr_or_new_in_var_decl1201);
                    expr_or_new147=expr_or_new();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_or_new147.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl"

    public static class var_decl_no_init_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl_no_init"
    // nl/cwi/cacoj/creol/Creol.g:325:1: var_decl_no_init : expr COLON type -> ^( DECL expr type ) ;
    public final CreolParser.var_decl_no_init_return var_decl_no_init() throws RecognitionException {
        CreolParser.var_decl_no_init_return retval = new CreolParser.var_decl_no_init_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON149=null;
        CreolParser.expr_return expr148 = null;

        CreolParser.type_return type150 = null;


        Object COLON149_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // nl/cwi/cacoj/creol/Creol.g:325:17: ( expr COLON type -> ^( DECL expr type ) )
            // nl/cwi/cacoj/creol/Creol.g:325:19: expr COLON type
            {
            pushFollow(FOLLOW_expr_in_var_decl_no_init1212);
            expr148=expr();

            state._fsp--;

            stream_expr.add(expr148.getTree());
            COLON149=(Token)match(input,COLON,FOLLOW_COLON_in_var_decl_no_init1214);  
            stream_COLON.add(COLON149);

            pushFollow(FOLLOW_type_in_var_decl_no_init1216);
            type150=type();

            state._fsp--;

            stream_type.add(type150.getTree());


            // AST REWRITE
            // elements: type, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 325:35: -> ^( DECL expr type )
            {
                // nl/cwi/cacoj/creol/Creol.g:325:38: ^( DECL expr type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl_no_init"

    public static class var_decl_no_init_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl_no_init_list"
    // nl/cwi/cacoj/creol/Creol.g:328:1: var_decl_no_init_list : var_decl_no_init ( KOMMA var_decl_no_init )* -> ( var_decl_no_init )+ ;
    public final CreolParser.var_decl_no_init_list_return var_decl_no_init_list() throws RecognitionException {
        CreolParser.var_decl_no_init_list_return retval = new CreolParser.var_decl_no_init_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA152=null;
        CreolParser.var_decl_no_init_return var_decl_no_init151 = null;

        CreolParser.var_decl_no_init_return var_decl_no_init153 = null;


        Object KOMMA152_tree=null;
        RewriteRuleTokenStream stream_KOMMA=new RewriteRuleTokenStream(adaptor,"token KOMMA");
        RewriteRuleSubtreeStream stream_var_decl_no_init=new RewriteRuleSubtreeStream(adaptor,"rule var_decl_no_init");
        try {
            // nl/cwi/cacoj/creol/Creol.g:329:2: ( var_decl_no_init ( KOMMA var_decl_no_init )* -> ( var_decl_no_init )+ )
            // nl/cwi/cacoj/creol/Creol.g:329:4: var_decl_no_init ( KOMMA var_decl_no_init )*
            {
            pushFollow(FOLLOW_var_decl_no_init_in_var_decl_no_init_list1237);
            var_decl_no_init151=var_decl_no_init();

            state._fsp--;

            stream_var_decl_no_init.add(var_decl_no_init151.getTree());
            // nl/cwi/cacoj/creol/Creol.g:329:21: ( KOMMA var_decl_no_init )*
            loop51:
            do {
                int alt51=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt51=1;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:329:22: KOMMA var_decl_no_init
            	    {
            	    KOMMA152=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_var_decl_no_init_list1240);  
            	    stream_KOMMA.add(KOMMA152);

            	    pushFollow(FOLLOW_var_decl_no_init_in_var_decl_no_init_list1242);
            	    var_decl_no_init153=var_decl_no_init();

            	    state._fsp--;

            	    stream_var_decl_no_init.add(var_decl_no_init153.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);



            // AST REWRITE
            // elements: var_decl_no_init
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 329:47: -> ( var_decl_no_init )+
            {
                if ( !(stream_var_decl_no_init.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_var_decl_no_init.hasNext() ) {
                    adaptor.addChild(root_0, stream_var_decl_no_init.nextTree());

                }
                stream_var_decl_no_init.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl_no_init_list"

    public static class start_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start_statement"
    // nl/cwi/cacoj/creol/Creol.g:334:1: start_statement : ( statement | attribute ( SEMICOLON decl_statement )? )? ;
    public final CreolParser.start_statement_return start_statement() throws RecognitionException {
        CreolParser.start_statement_return retval = new CreolParser.start_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON156=null;
        CreolParser.statement_return statement154 = null;

        CreolParser.attribute_return attribute155 = null;

        CreolParser.decl_statement_return decl_statement157 = null;


        Object SEMICOLON156_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:334:17: ( ( statement | attribute ( SEMICOLON decl_statement )? )? )
            // nl/cwi/cacoj/creol/Creol.g:334:19: ( statement | attribute ( SEMICOLON decl_statement )? )?
            {
            root_0 = (Object)adaptor.nil();

            // nl/cwi/cacoj/creol/Creol.g:334:19: ( statement | attribute ( SEMICOLON decl_statement )? )?
            int alt53=3;
            switch ( input.LA(1) ) {
                case BEGIN:
                case LPAREN:
                case IDENTIFIER:
                case NOT:
                case MINUS:
                case NUMBER_SIGN:
                case STRING:
                case EXCLENATION_MARK:
                case SCHEMAVAR:
                case WHILE:
                case DO:
                case AWAIT:
                case PROVE:
                case ASSERT:
                case POSIT:
                case SKIP:
                case RELEASE:
                case BLOCK:
                case RETURN:
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
                case LBRACK:
                case LBRACES:
                case IF:
                    {
                    alt53=1;
                    }
                    break;
                case VAR:
                    {
                    alt53=2;
                    }
                    break;
            }

            switch (alt53) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:334:20: statement
                    {
                    pushFollow(FOLLOW_statement_in_start_statement1262);
                    statement154=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement154.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:335:6: attribute ( SEMICOLON decl_statement )?
                    {
                    pushFollow(FOLLOW_attribute_in_start_statement1269);
                    attribute155=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute155.getTree());
                    // nl/cwi/cacoj/creol/Creol.g:335:16: ( SEMICOLON decl_statement )?
                    int alt52=2;
                    switch ( input.LA(1) ) {
                        case SEMICOLON:
                            {
                            alt52=1;
                            }
                            break;
                    }

                    switch (alt52) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:335:18: SEMICOLON decl_statement
                            {
                            SEMICOLON156=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_start_statement1273); 
                            SEMICOLON156_tree = (Object)adaptor.create(SEMICOLON156);
                            root_0 = (Object)adaptor.becomeRoot(SEMICOLON156_tree, root_0);

                            pushFollow(FOLLOW_decl_statement_in_start_statement1276);
                            decl_statement157=decl_statement();

                            state._fsp--;

                            adaptor.addChild(root_0, decl_statement157.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start_statement"

    public static class decl_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_statement"
    // nl/cwi/cacoj/creol/Creol.g:339:1: decl_statement : ( statement | attribute SEMICOLON decl_statement );
    public final CreolParser.decl_statement_return decl_statement() throws RecognitionException {
        CreolParser.decl_statement_return retval = new CreolParser.decl_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON160=null;
        CreolParser.statement_return statement158 = null;

        CreolParser.attribute_return attribute159 = null;

        CreolParser.decl_statement_return decl_statement161 = null;


        Object SEMICOLON160_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:340:2: ( statement | attribute SEMICOLON decl_statement )
            int alt54=2;
            switch ( input.LA(1) ) {
            case BEGIN:
            case LPAREN:
            case IDENTIFIER:
            case NOT:
            case MINUS:
            case NUMBER_SIGN:
            case STRING:
            case EXCLENATION_MARK:
            case SCHEMAVAR:
            case WHILE:
            case DO:
            case AWAIT:
            case PROVE:
            case ASSERT:
            case POSIT:
            case SKIP:
            case RELEASE:
            case BLOCK:
            case RETURN:
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
            case LBRACK:
            case LBRACES:
            case IF:
                {
                alt54=1;
                }
                break;
            case VAR:
                {
                alt54=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:340:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_decl_statement1295);
                    statement158=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement158.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:341:4: attribute SEMICOLON decl_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attribute_in_decl_statement1300);
                    attribute159=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute159.getTree());
                    SEMICOLON160=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_statement1302); 
                    SEMICOLON160_tree = (Object)adaptor.create(SEMICOLON160);
                    root_0 = (Object)adaptor.becomeRoot(SEMICOLON160_tree, root_0);

                    pushFollow(FOLLOW_decl_statement_in_decl_statement1305);
                    decl_statement161=decl_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_statement161.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl_statement"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // nl/cwi/cacoj/creol/Creol.g:344:1: statement : choice_stmt ( INTERLEAVE statement )? ;
    public final CreolParser.statement_return statement() throws RecognitionException {
        CreolParser.statement_return retval = new CreolParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTERLEAVE163=null;
        CreolParser.choice_stmt_return choice_stmt162 = null;

        CreolParser.statement_return statement164 = null;


        Object INTERLEAVE163_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:344:11: ( choice_stmt ( INTERLEAVE statement )? )
            // nl/cwi/cacoj/creol/Creol.g:344:13: choice_stmt ( INTERLEAVE statement )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_choice_stmt_in_statement1316);
            choice_stmt162=choice_stmt();

            state._fsp--;

            adaptor.addChild(root_0, choice_stmt162.getTree());
            // nl/cwi/cacoj/creol/Creol.g:344:25: ( INTERLEAVE statement )?
            int alt55=2;
            switch ( input.LA(1) ) {
                case INTERLEAVE:
                    {
                    alt55=1;
                    }
                    break;
            }

            switch (alt55) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:344:26: INTERLEAVE statement
                    {
                    INTERLEAVE163=(Token)match(input,INTERLEAVE,FOLLOW_INTERLEAVE_in_statement1319); 
                    INTERLEAVE163_tree = (Object)adaptor.create(INTERLEAVE163);
                    root_0 = (Object)adaptor.becomeRoot(INTERLEAVE163_tree, root_0);

                    pushFollow(FOLLOW_statement_in_statement1322);
                    statement164=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement164.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class choice_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "choice_stmt"
    // nl/cwi/cacoj/creol/Creol.g:347:1: choice_stmt : seq_stmt ( BOX choice_stmt )? ;
    public final CreolParser.choice_stmt_return choice_stmt() throws RecognitionException {
        CreolParser.choice_stmt_return retval = new CreolParser.choice_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BOX166=null;
        CreolParser.seq_stmt_return seq_stmt165 = null;

        CreolParser.choice_stmt_return choice_stmt167 = null;


        Object BOX166_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:347:13: ( seq_stmt ( BOX choice_stmt )? )
            // nl/cwi/cacoj/creol/Creol.g:347:15: seq_stmt ( BOX choice_stmt )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_seq_stmt_in_choice_stmt1334);
            seq_stmt165=seq_stmt();

            state._fsp--;

            adaptor.addChild(root_0, seq_stmt165.getTree());
            // nl/cwi/cacoj/creol/Creol.g:347:24: ( BOX choice_stmt )?
            int alt56=2;
            switch ( input.LA(1) ) {
                case BOX:
                    {
                    alt56=1;
                    }
                    break;
            }

            switch (alt56) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:347:25: BOX choice_stmt
                    {
                    BOX166=(Token)match(input,BOX,FOLLOW_BOX_in_choice_stmt1337); 
                    BOX166_tree = (Object)adaptor.create(BOX166);
                    root_0 = (Object)adaptor.becomeRoot(BOX166_tree, root_0);

                    pushFollow(FOLLOW_choice_stmt_in_choice_stmt1340);
                    choice_stmt167=choice_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, choice_stmt167.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "choice_stmt"

    public static class seq_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "seq_stmt"
    // nl/cwi/cacoj/creol/Creol.g:350:1: seq_stmt : basic_stmt ( SEMICOLON seq_stmt )? ;
    public final CreolParser.seq_stmt_return seq_stmt() throws RecognitionException {
        CreolParser.seq_stmt_return retval = new CreolParser.seq_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON169=null;
        CreolParser.basic_stmt_return basic_stmt168 = null;

        CreolParser.seq_stmt_return seq_stmt170 = null;


        Object SEMICOLON169_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:350:10: ( basic_stmt ( SEMICOLON seq_stmt )? )
            // nl/cwi/cacoj/creol/Creol.g:350:12: basic_stmt ( SEMICOLON seq_stmt )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_basic_stmt_in_seq_stmt1352);
            basic_stmt168=basic_stmt();

            state._fsp--;

            adaptor.addChild(root_0, basic_stmt168.getTree());
            // nl/cwi/cacoj/creol/Creol.g:350:23: ( SEMICOLON seq_stmt )?
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
                    // nl/cwi/cacoj/creol/Creol.g:350:24: SEMICOLON seq_stmt
                    {
                    SEMICOLON169=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_seq_stmt1355); 
                    SEMICOLON169_tree = (Object)adaptor.create(SEMICOLON169);
                    root_0 = (Object)adaptor.becomeRoot(SEMICOLON169_tree, root_0);

                    pushFollow(FOLLOW_seq_stmt_in_seq_stmt1358);
                    seq_stmt170=seq_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, seq_stmt170.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "seq_stmt"

    public static class basic_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basic_stmt"
    // nl/cwi/cacoj/creol/Creol.g:353:1: basic_stmt : ( small_stmt | control_flow_stmt | expr_stmt );
    public final CreolParser.basic_stmt_return basic_stmt() throws RecognitionException {
        CreolParser.basic_stmt_return retval = new CreolParser.basic_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.small_stmt_return small_stmt171 = null;

        CreolParser.control_flow_stmt_return control_flow_stmt172 = null;

        CreolParser.expr_stmt_return expr_stmt173 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:353:12: ( small_stmt | control_flow_stmt | expr_stmt )
            int alt58=3;
            switch ( input.LA(1) ) {
            case BEGIN:
            case EXCLENATION_MARK:
            case AWAIT:
            case PROVE:
            case ASSERT:
            case POSIT:
            case SKIP:
            case RELEASE:
            case BLOCK:
            case RETURN:
                {
                alt58=1;
                }
                break;
            case WHILE:
            case DO:
            case IF:
                {
                alt58=2;
                }
                break;
            case LPAREN:
            case IDENTIFIER:
            case NOT:
            case MINUS:
            case NUMBER_SIGN:
            case STRING:
            case SCHEMAVAR:
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
            case LBRACK:
            case LBRACES:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:353:14: small_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_small_stmt_in_basic_stmt1371);
                    small_stmt171=small_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, small_stmt171.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:354:4: control_flow_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_control_flow_stmt_in_basic_stmt1376);
                    control_flow_stmt172=control_flow_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, control_flow_stmt172.getTree());

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:355:4: expr_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_stmt_in_basic_stmt1381);
                    expr_stmt173=expr_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_stmt173.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "basic_stmt"

    public static class expr_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_stmt"
    // nl/cwi/cacoj/creol/Creol.g:358:1: expr_stmt : expr ( ( KOMMA expr )* ASSIGN expr_or_new_list | ( EXCLENATION_MARK expr ) )? ;
    public final CreolParser.expr_stmt_return expr_stmt() throws RecognitionException {
        CreolParser.expr_stmt_return retval = new CreolParser.expr_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA175=null;
        Token ASSIGN177=null;
        Token EXCLENATION_MARK179=null;
        CreolParser.expr_return expr174 = null;

        CreolParser.expr_return expr176 = null;

        CreolParser.expr_or_new_list_return expr_or_new_list178 = null;

        CreolParser.expr_return expr180 = null;


        Object KOMMA175_tree=null;
        Object ASSIGN177_tree=null;
        Object EXCLENATION_MARK179_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:358:11: ( expr ( ( KOMMA expr )* ASSIGN expr_or_new_list | ( EXCLENATION_MARK expr ) )? )
            // nl/cwi/cacoj/creol/Creol.g:358:13: expr ( ( KOMMA expr )* ASSIGN expr_or_new_list | ( EXCLENATION_MARK expr ) )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_expr_stmt1391);
            expr174=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr174.getTree());
            // nl/cwi/cacoj/creol/Creol.g:359:2: ( ( KOMMA expr )* ASSIGN expr_or_new_list | ( EXCLENATION_MARK expr ) )?
            int alt60=3;
            switch ( input.LA(1) ) {
                case KOMMA:
                case ASSIGN:
                    {
                    alt60=1;
                    }
                    break;
                case EXCLENATION_MARK:
                    {
                    alt60=2;
                    }
                    break;
            }

            switch (alt60) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:359:3: ( KOMMA expr )* ASSIGN expr_or_new_list
                    {
                    // nl/cwi/cacoj/creol/Creol.g:359:3: ( KOMMA expr )*
                    loop59:
                    do {
                        int alt59=2;
                        switch ( input.LA(1) ) {
                        case KOMMA:
                            {
                            alt59=1;
                            }
                            break;

                        }

                        switch (alt59) {
                    	case 1 :
                    	    // nl/cwi/cacoj/creol/Creol.g:359:4: KOMMA expr
                    	    {
                    	    KOMMA175=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_expr_stmt1397); 
                    	    KOMMA175_tree = (Object)adaptor.create(KOMMA175);
                    	    root_0 = (Object)adaptor.becomeRoot(KOMMA175_tree, root_0);

                    	    pushFollow(FOLLOW_expr_in_expr_stmt1400);
                    	    expr176=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr176.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    ASSIGN177=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_stmt1404); 
                    ASSIGN177_tree = (Object)adaptor.create(ASSIGN177);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN177_tree, root_0);

                    pushFollow(FOLLOW_expr_or_new_list_in_expr_stmt1407);
                    expr_or_new_list178=expr_or_new_list();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_or_new_list178.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:360:4: ( EXCLENATION_MARK expr )
                    {
                    // nl/cwi/cacoj/creol/Creol.g:360:4: ( EXCLENATION_MARK expr )
                    // nl/cwi/cacoj/creol/Creol.g:360:5: EXCLENATION_MARK expr
                    {
                    EXCLENATION_MARK179=(Token)match(input,EXCLENATION_MARK,FOLLOW_EXCLENATION_MARK_in_expr_stmt1414); 
                    EXCLENATION_MARK179_tree = (Object)adaptor.create(EXCLENATION_MARK179);
                    root_0 = (Object)adaptor.becomeRoot(EXCLENATION_MARK179_tree, root_0);

                    pushFollow(FOLLOW_expr_in_expr_stmt1417);
                    expr180=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr180.getTree());

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_stmt"

    public static class expr_or_new_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or_new"
    // nl/cwi/cacoj/creol/Creol.g:367:1: expr_or_new : ( expr | NEW ( CLASS_IDENTIFIER | SCHEMAVAR ) ( parameter_list )? );
    public final CreolParser.expr_or_new_return expr_or_new() throws RecognitionException {
        CreolParser.expr_or_new_return retval = new CreolParser.expr_or_new_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW182=null;
        Token set183=null;
        CreolParser.expr_return expr181 = null;

        CreolParser.parameter_list_return parameter_list184 = null;


        Object NEW182_tree=null;
        Object set183_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:367:13: ( expr | NEW ( CLASS_IDENTIFIER | SCHEMAVAR ) ( parameter_list )? )
            int alt62=2;
            switch ( input.LA(1) ) {
            case LPAREN:
            case IDENTIFIER:
            case NOT:
            case MINUS:
            case NUMBER_SIGN:
            case STRING:
            case SCHEMAVAR:
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
            case LBRACK:
            case LBRACES:
                {
                alt62=1;
                }
                break;
            case NEW:
                {
                alt62=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:367:15: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_new1433);
                    expr181=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr181.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:368:4: NEW ( CLASS_IDENTIFIER | SCHEMAVAR ) ( parameter_list )?
                    {
                    root_0 = (Object)adaptor.nil();

                    NEW182=(Token)match(input,NEW,FOLLOW_NEW_in_expr_or_new1438); 
                    NEW182_tree = (Object)adaptor.create(NEW182);
                    root_0 = (Object)adaptor.becomeRoot(NEW182_tree, root_0);

                    set183=(Token)input.LT(1);
                    if ( input.LA(1)==CLASS_IDENTIFIER||input.LA(1)==SCHEMAVAR ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set183));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // nl/cwi/cacoj/creol/Creol.g:368:40: ( parameter_list )?
                    int alt61=2;
                    switch ( input.LA(1) ) {
                        case LPAREN:
                            {
                            alt61=1;
                            }
                            break;
                    }

                    switch (alt61) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:368:40: parameter_list
                            {
                            pushFollow(FOLLOW_parameter_list_in_expr_or_new1449);
                            parameter_list184=parameter_list();

                            state._fsp--;

                            adaptor.addChild(root_0, parameter_list184.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_or_new"

    public static class expr_or_new_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or_new_list"
    // nl/cwi/cacoj/creol/Creol.g:371:1: expr_or_new_list : expr_or_new ( KOMMA expr_or_new_list )? ;
    public final CreolParser.expr_or_new_list_return expr_or_new_list() throws RecognitionException {
        CreolParser.expr_or_new_list_return retval = new CreolParser.expr_or_new_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA186=null;
        CreolParser.expr_or_new_return expr_or_new185 = null;

        CreolParser.expr_or_new_list_return expr_or_new_list187 = null;


        Object KOMMA186_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:372:2: ( expr_or_new ( KOMMA expr_or_new_list )? )
            // nl/cwi/cacoj/creol/Creol.g:372:4: expr_or_new ( KOMMA expr_or_new_list )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_or_new_in_expr_or_new_list1461);
            expr_or_new185=expr_or_new();

            state._fsp--;

            adaptor.addChild(root_0, expr_or_new185.getTree());
            // nl/cwi/cacoj/creol/Creol.g:372:16: ( KOMMA expr_or_new_list )?
            int alt63=2;
            switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt63=1;
                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:372:17: KOMMA expr_or_new_list
                    {
                    KOMMA186=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_expr_or_new_list1464); 
                    KOMMA186_tree = (Object)adaptor.create(KOMMA186);
                    root_0 = (Object)adaptor.becomeRoot(KOMMA186_tree, root_0);

                    pushFollow(FOLLOW_expr_or_new_list_in_expr_or_new_list1467);
                    expr_or_new_list187=expr_or_new_list();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_or_new_list187.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_or_new_list"

    public static class control_flow_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_flow_stmt"
    // nl/cwi/cacoj/creol/Creol.g:375:1: control_flow_stmt : ( while_stmt | do_while_stmt | if_stmt );
    public final CreolParser.control_flow_stmt_return control_flow_stmt() throws RecognitionException {
        CreolParser.control_flow_stmt_return retval = new CreolParser.control_flow_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.while_stmt_return while_stmt188 = null;

        CreolParser.do_while_stmt_return do_while_stmt189 = null;

        CreolParser.if_stmt_return if_stmt190 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:376:2: ( while_stmt | do_while_stmt | if_stmt )
            int alt64=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt64=1;
                }
                break;
            case DO:
                {
                alt64=2;
                }
                break;
            case IF:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:376:4: while_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_while_stmt_in_control_flow_stmt1480);
                    while_stmt188=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt188.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:377:4: do_while_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_do_while_stmt_in_control_flow_stmt1485);
                    do_while_stmt189=do_while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, do_while_stmt189.getTree());

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:378:4: if_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_stmt_in_control_flow_stmt1490);
                    if_stmt190=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt190.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "control_flow_stmt"

    public static class while_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_stmt"
    // nl/cwi/cacoj/creol/Creol.g:381:1: while_stmt : WHILE condition ( invariant )? ( measure )? while_body ;
    public final CreolParser.while_stmt_return while_stmt() throws RecognitionException {
        CreolParser.while_stmt_return retval = new CreolParser.while_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE191=null;
        CreolParser.condition_return condition192 = null;

        CreolParser.invariant_return invariant193 = null;

        CreolParser.measure_return measure194 = null;

        CreolParser.while_body_return while_body195 = null;


        Object WHILE191_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:381:12: ( WHILE condition ( invariant )? ( measure )? while_body )
            // nl/cwi/cacoj/creol/Creol.g:381:14: WHILE condition ( invariant )? ( measure )? while_body
            {
            root_0 = (Object)adaptor.nil();

            WHILE191=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1501); 
            WHILE191_tree = (Object)adaptor.create(WHILE191);
            root_0 = (Object)adaptor.becomeRoot(WHILE191_tree, root_0);

            pushFollow(FOLLOW_condition_in_while_stmt1504);
            condition192=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition192.getTree());
            // nl/cwi/cacoj/creol/Creol.g:381:31: ( invariant )?
            int alt65=2;
            switch ( input.LA(1) ) {
                case INV:
                    {
                    alt65=1;
                    }
                    break;
            }

            switch (alt65) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:381:31: invariant
                    {
                    pushFollow(FOLLOW_invariant_in_while_stmt1506);
                    invariant193=invariant();

                    state._fsp--;

                    adaptor.addChild(root_0, invariant193.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:381:42: ( measure )?
            int alt66=2;
            switch ( input.LA(1) ) {
                case MEASURE:
                    {
                    alt66=1;
                    }
                    break;
            }

            switch (alt66) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:381:42: measure
                    {
                    pushFollow(FOLLOW_measure_in_while_stmt1509);
                    measure194=measure();

                    state._fsp--;

                    adaptor.addChild(root_0, measure194.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_while_body_in_while_stmt1512);
            while_body195=while_body();

            state._fsp--;

            adaptor.addChild(root_0, while_body195.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_stmt"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // nl/cwi/cacoj/creol/Creol.g:384:1: condition : expr -> ^( COND expr ) ;
    public final CreolParser.condition_return condition() throws RecognitionException {
        CreolParser.condition_return retval = new CreolParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.expr_return expr196 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // nl/cwi/cacoj/creol/Creol.g:384:11: ( expr -> ^( COND expr ) )
            // nl/cwi/cacoj/creol/Creol.g:384:13: expr
            {
            pushFollow(FOLLOW_expr_in_condition1522);
            expr196=expr();

            state._fsp--;

            stream_expr.add(expr196.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 384:18: -> ^( COND expr )
            {
                // nl/cwi/cacoj/creol/Creol.g:384:21: ^( COND expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class while_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_body"
    // nl/cwi/cacoj/creol/Creol.g:387:1: while_body : DO statement END -> ^( BODY statement ) ;
    public final CreolParser.while_body_return while_body() throws RecognitionException {
        CreolParser.while_body_return retval = new CreolParser.while_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO197=null;
        Token END199=null;
        CreolParser.statement_return statement198 = null;


        Object DO197_tree=null;
        Object END199_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nl/cwi/cacoj/creol/Creol.g:387:12: ( DO statement END -> ^( BODY statement ) )
            // nl/cwi/cacoj/creol/Creol.g:387:14: DO statement END
            {
            DO197=(Token)match(input,DO,FOLLOW_DO_in_while_body1540);  
            stream_DO.add(DO197);

            pushFollow(FOLLOW_statement_in_while_body1542);
            statement198=statement();

            state._fsp--;

            stream_statement.add(statement198.getTree());
            END199=(Token)match(input,END,FOLLOW_END_in_while_body1544);  
            stream_END.add(END199);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 387:31: -> ^( BODY statement )
            {
                // nl/cwi/cacoj/creol/Creol.g:387:34: ^( BODY statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_body"

    public static class measure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "measure"
    // nl/cwi/cacoj/creol/Creol.g:390:1: measure : MEASURE expr measure_by ;
    public final CreolParser.measure_return measure() throws RecognitionException {
        CreolParser.measure_return retval = new CreolParser.measure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MEASURE200=null;
        CreolParser.expr_return expr201 = null;

        CreolParser.measure_by_return measure_by202 = null;


        Object MEASURE200_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:390:9: ( MEASURE expr measure_by )
            // nl/cwi/cacoj/creol/Creol.g:390:11: MEASURE expr measure_by
            {
            root_0 = (Object)adaptor.nil();

            MEASURE200=(Token)match(input,MEASURE,FOLLOW_MEASURE_in_measure1562); 
            MEASURE200_tree = (Object)adaptor.create(MEASURE200);
            root_0 = (Object)adaptor.becomeRoot(MEASURE200_tree, root_0);

            pushFollow(FOLLOW_expr_in_measure1565);
            expr201=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr201.getTree());
            pushFollow(FOLLOW_measure_by_in_measure1567);
            measure_by202=measure_by();

            state._fsp--;

            adaptor.addChild(root_0, measure_by202.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "measure"

    public static class measure_by_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "measure_by"
    // nl/cwi/cacoj/creol/Creol.g:393:1: measure_by : BY id_or_op ;
    public final CreolParser.measure_by_return measure_by() throws RecognitionException {
        CreolParser.measure_by_return retval = new CreolParser.measure_by_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BY203=null;
        CreolParser.id_or_op_return id_or_op204 = null;


        Object BY203_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:393:12: ( BY id_or_op )
            // nl/cwi/cacoj/creol/Creol.g:393:14: BY id_or_op
            {
            root_0 = (Object)adaptor.nil();

            BY203=(Token)match(input,BY,FOLLOW_BY_in_measure_by1577); 
            BY203_tree = (Object)adaptor.create(BY203);
            root_0 = (Object)adaptor.becomeRoot(BY203_tree, root_0);

            pushFollow(FOLLOW_id_or_op_in_measure_by1580);
            id_or_op204=id_or_op();

            state._fsp--;

            adaptor.addChild(root_0, id_or_op204.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "measure_by"

    public static class invariant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invariant"
    // nl/cwi/cacoj/creol/Creol.g:396:1: invariant : INV expr ;
    public final CreolParser.invariant_return invariant() throws RecognitionException {
        CreolParser.invariant_return retval = new CreolParser.invariant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INV205=null;
        CreolParser.expr_return expr206 = null;


        Object INV205_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:396:11: ( INV expr )
            // nl/cwi/cacoj/creol/Creol.g:396:13: INV expr
            {
            root_0 = (Object)adaptor.nil();

            INV205=(Token)match(input,INV,FOLLOW_INV_in_invariant1590); 
            INV205_tree = (Object)adaptor.create(INV205);
            root_0 = (Object)adaptor.becomeRoot(INV205_tree, root_0);

            pushFollow(FOLLOW_expr_in_invariant1593);
            expr206=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr206.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invariant"

    public static class do_while_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "do_while_stmt"
    // nl/cwi/cacoj/creol/Creol.g:399:1: do_while_stmt : DO do_while_body ( invariant )? ( measure )? WHILE condition ;
    public final CreolParser.do_while_stmt_return do_while_stmt() throws RecognitionException {
        CreolParser.do_while_stmt_return retval = new CreolParser.do_while_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO207=null;
        Token WHILE211=null;
        CreolParser.do_while_body_return do_while_body208 = null;

        CreolParser.invariant_return invariant209 = null;

        CreolParser.measure_return measure210 = null;

        CreolParser.condition_return condition212 = null;


        Object DO207_tree=null;
        Object WHILE211_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:399:15: ( DO do_while_body ( invariant )? ( measure )? WHILE condition )
            // nl/cwi/cacoj/creol/Creol.g:399:17: DO do_while_body ( invariant )? ( measure )? WHILE condition
            {
            root_0 = (Object)adaptor.nil();

            DO207=(Token)match(input,DO,FOLLOW_DO_in_do_while_stmt1603); 
            DO207_tree = (Object)adaptor.create(DO207);
            root_0 = (Object)adaptor.becomeRoot(DO207_tree, root_0);

            pushFollow(FOLLOW_do_while_body_in_do_while_stmt1606);
            do_while_body208=do_while_body();

            state._fsp--;

            adaptor.addChild(root_0, do_while_body208.getTree());
            // nl/cwi/cacoj/creol/Creol.g:399:35: ( invariant )?
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
                    // nl/cwi/cacoj/creol/Creol.g:399:35: invariant
                    {
                    pushFollow(FOLLOW_invariant_in_do_while_stmt1608);
                    invariant209=invariant();

                    state._fsp--;

                    adaptor.addChild(root_0, invariant209.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:399:47: ( measure )?
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
                    // nl/cwi/cacoj/creol/Creol.g:399:47: measure
                    {
                    pushFollow(FOLLOW_measure_in_do_while_stmt1612);
                    measure210=measure();

                    state._fsp--;

                    adaptor.addChild(root_0, measure210.getTree());

                    }
                    break;

            }

            WHILE211=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while_stmt1615); 
            pushFollow(FOLLOW_condition_in_do_while_stmt1618);
            condition212=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition212.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "do_while_stmt"

    public static class do_while_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "do_while_body"
    // nl/cwi/cacoj/creol/Creol.g:402:1: do_while_body : statement -> ^( BODY statement ) ;
    public final CreolParser.do_while_body_return do_while_body() throws RecognitionException {
        CreolParser.do_while_body_return retval = new CreolParser.do_while_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.statement_return statement213 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // nl/cwi/cacoj/creol/Creol.g:403:2: ( statement -> ^( BODY statement ) )
            // nl/cwi/cacoj/creol/Creol.g:403:4: statement
            {
            pushFollow(FOLLOW_statement_in_do_while_body1629);
            statement213=statement();

            state._fsp--;

            stream_statement.add(statement213.getTree());


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 403:14: -> ^( BODY statement )
            {
                // nl/cwi/cacoj/creol/Creol.g:403:17: ^( BODY statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "do_while_body"

    public static class small_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "small_stmt"
    // nl/cwi/cacoj/creol/Creol.g:406:1: small_stmt : ( atomic_stmt | block_stmt | posit_stmt | assert_stmt | prove_stmt | await_stmt | asyn_call_stmt );
    public final CreolParser.small_stmt_return small_stmt() throws RecognitionException {
        CreolParser.small_stmt_return retval = new CreolParser.small_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.atomic_stmt_return atomic_stmt214 = null;

        CreolParser.block_stmt_return block_stmt215 = null;

        CreolParser.posit_stmt_return posit_stmt216 = null;

        CreolParser.assert_stmt_return assert_stmt217 = null;

        CreolParser.prove_stmt_return prove_stmt218 = null;

        CreolParser.await_stmt_return await_stmt219 = null;

        CreolParser.asyn_call_stmt_return asyn_call_stmt220 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:406:12: ( atomic_stmt | block_stmt | posit_stmt | assert_stmt | prove_stmt | await_stmt | asyn_call_stmt )
            int alt69=7;
            switch ( input.LA(1) ) {
            case SKIP:
            case RELEASE:
            case BLOCK:
            case RETURN:
                {
                alt69=1;
                }
                break;
            case BEGIN:
                {
                alt69=2;
                }
                break;
            case POSIT:
                {
                alt69=3;
                }
                break;
            case ASSERT:
                {
                alt69=4;
                }
                break;
            case PROVE:
                {
                alt69=5;
                }
                break;
            case AWAIT:
                {
                alt69=6;
                }
                break;
            case EXCLENATION_MARK:
                {
                alt69=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:406:14: atomic_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atomic_stmt_in_small_stmt1648);
                    atomic_stmt214=atomic_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, atomic_stmt214.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:407:4: block_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_stmt_in_small_stmt1653);
                    block_stmt215=block_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, block_stmt215.getTree());

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:408:4: posit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_posit_stmt_in_small_stmt1658);
                    posit_stmt216=posit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, posit_stmt216.getTree());

                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/Creol.g:409:4: assert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assert_stmt_in_small_stmt1663);
                    assert_stmt217=assert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assert_stmt217.getTree());

                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/Creol.g:410:4: prove_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prove_stmt_in_small_stmt1668);
                    prove_stmt218=prove_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, prove_stmt218.getTree());

                    }
                    break;
                case 6 :
                    // nl/cwi/cacoj/creol/Creol.g:411:4: await_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_await_stmt_in_small_stmt1673);
                    await_stmt219=await_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, await_stmt219.getTree());

                    }
                    break;
                case 7 :
                    // nl/cwi/cacoj/creol/Creol.g:412:4: asyn_call_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_asyn_call_stmt_in_small_stmt1678);
                    asyn_call_stmt220=asyn_call_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, asyn_call_stmt220.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "small_stmt"

    public static class asyn_call_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "asyn_call_stmt"
    // nl/cwi/cacoj/creol/Creol.g:415:1: asyn_call_stmt : EXCLENATION_MARK expr ;
    public final CreolParser.asyn_call_stmt_return asyn_call_stmt() throws RecognitionException {
        CreolParser.asyn_call_stmt_return retval = new CreolParser.asyn_call_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXCLENATION_MARK221=null;
        CreolParser.expr_return expr222 = null;


        Object EXCLENATION_MARK221_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:415:15: ( EXCLENATION_MARK expr )
            // nl/cwi/cacoj/creol/Creol.g:415:17: EXCLENATION_MARK expr
            {
            root_0 = (Object)adaptor.nil();

            EXCLENATION_MARK221=(Token)match(input,EXCLENATION_MARK,FOLLOW_EXCLENATION_MARK_in_asyn_call_stmt1687); 
            EXCLENATION_MARK221_tree = (Object)adaptor.create(EXCLENATION_MARK221);
            root_0 = (Object)adaptor.becomeRoot(EXCLENATION_MARK221_tree, root_0);

            pushFollow(FOLLOW_expr_in_asyn_call_stmt1690);
            expr222=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr222.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "asyn_call_stmt"

    public static class await_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "await_stmt"
    // nl/cwi/cacoj/creol/Creol.g:418:1: await_stmt : AWAIT expr ;
    public final CreolParser.await_stmt_return await_stmt() throws RecognitionException {
        CreolParser.await_stmt_return retval = new CreolParser.await_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AWAIT223=null;
        CreolParser.expr_return expr224 = null;


        Object AWAIT223_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:418:12: ( AWAIT expr )
            // nl/cwi/cacoj/creol/Creol.g:418:14: AWAIT expr
            {
            root_0 = (Object)adaptor.nil();

            AWAIT223=(Token)match(input,AWAIT,FOLLOW_AWAIT_in_await_stmt1701); 
            AWAIT223_tree = (Object)adaptor.create(AWAIT223);
            root_0 = (Object)adaptor.becomeRoot(AWAIT223_tree, root_0);

            pushFollow(FOLLOW_expr_in_await_stmt1704);
            expr224=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr224.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "await_stmt"

    public static class prove_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prove_stmt"
    // nl/cwi/cacoj/creol/Creol.g:421:1: prove_stmt : PROVE expr ;
    public final CreolParser.prove_stmt_return prove_stmt() throws RecognitionException {
        CreolParser.prove_stmt_return retval = new CreolParser.prove_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROVE225=null;
        CreolParser.expr_return expr226 = null;


        Object PROVE225_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:421:12: ( PROVE expr )
            // nl/cwi/cacoj/creol/Creol.g:421:14: PROVE expr
            {
            root_0 = (Object)adaptor.nil();

            PROVE225=(Token)match(input,PROVE,FOLLOW_PROVE_in_prove_stmt1714); 
            PROVE225_tree = (Object)adaptor.create(PROVE225);
            root_0 = (Object)adaptor.becomeRoot(PROVE225_tree, root_0);

            pushFollow(FOLLOW_expr_in_prove_stmt1717);
            expr226=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr226.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prove_stmt"

    public static class assert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assert_stmt"
    // nl/cwi/cacoj/creol/Creol.g:424:1: assert_stmt : ASSERT expr ;
    public final CreolParser.assert_stmt_return assert_stmt() throws RecognitionException {
        CreolParser.assert_stmt_return retval = new CreolParser.assert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSERT227=null;
        CreolParser.expr_return expr228 = null;


        Object ASSERT227_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:424:13: ( ASSERT expr )
            // nl/cwi/cacoj/creol/Creol.g:424:15: ASSERT expr
            {
            root_0 = (Object)adaptor.nil();

            ASSERT227=(Token)match(input,ASSERT,FOLLOW_ASSERT_in_assert_stmt1727); 
            ASSERT227_tree = (Object)adaptor.create(ASSERT227);
            root_0 = (Object)adaptor.becomeRoot(ASSERT227_tree, root_0);

            pushFollow(FOLLOW_expr_in_assert_stmt1730);
            expr228=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr228.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assert_stmt"

    public static class posit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "posit_stmt"
    // nl/cwi/cacoj/creol/Creol.g:427:1: posit_stmt : POSIT expr ;
    public final CreolParser.posit_stmt_return posit_stmt() throws RecognitionException {
        CreolParser.posit_stmt_return retval = new CreolParser.posit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POSIT229=null;
        CreolParser.expr_return expr230 = null;


        Object POSIT229_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:427:12: ( POSIT expr )
            // nl/cwi/cacoj/creol/Creol.g:427:14: POSIT expr
            {
            root_0 = (Object)adaptor.nil();

            POSIT229=(Token)match(input,POSIT,FOLLOW_POSIT_in_posit_stmt1740); 
            POSIT229_tree = (Object)adaptor.create(POSIT229);
            root_0 = (Object)adaptor.becomeRoot(POSIT229_tree, root_0);

            pushFollow(FOLLOW_expr_in_posit_stmt1743);
            expr230=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr230.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "posit_stmt"

    public static class block_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block_stmt"
    // nl/cwi/cacoj/creol/Creol.g:430:1: block_stmt : BEGIN statement END ;
    public final CreolParser.block_stmt_return block_stmt() throws RecognitionException {
        CreolParser.block_stmt_return retval = new CreolParser.block_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN231=null;
        Token END233=null;
        CreolParser.statement_return statement232 = null;


        Object BEGIN231_tree=null;
        Object END233_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:430:12: ( BEGIN statement END )
            // nl/cwi/cacoj/creol/Creol.g:430:14: BEGIN statement END
            {
            root_0 = (Object)adaptor.nil();

            BEGIN231=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block_stmt1754); 
            BEGIN231_tree = (Object)adaptor.create(BEGIN231);
            root_0 = (Object)adaptor.becomeRoot(BEGIN231_tree, root_0);

            pushFollow(FOLLOW_statement_in_block_stmt1757);
            statement232=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement232.getTree());
            END233=(Token)match(input,END,FOLLOW_END_in_block_stmt1759); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block_stmt"

    public static class atomic_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomic_stmt"
    // nl/cwi/cacoj/creol/Creol.g:433:1: atomic_stmt : ( SKIP | RELEASE | BLOCK | RETURN );
    public final CreolParser.atomic_stmt_return atomic_stmt() throws RecognitionException {
        CreolParser.atomic_stmt_return retval = new CreolParser.atomic_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set234=null;

        Object set234_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:433:13: ( SKIP | RELEASE | BLOCK | RETURN )
            // nl/cwi/cacoj/creol/Creol.g:
            {
            root_0 = (Object)adaptor.nil();

            set234=(Token)input.LT(1);
            if ( (input.LA(1)>=SKIP && input.LA(1)<=RETURN) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set234));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomic_stmt"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // nl/cwi/cacoj/creol/Creol.g:441:1: expr : equivalence_expr ( IN equivalence_expr )* ;
    public final CreolParser.expr_return expr() throws RecognitionException {
        CreolParser.expr_return retval = new CreolParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN236=null;
        CreolParser.equivalence_expr_return equivalence_expr235 = null;

        CreolParser.equivalence_expr_return equivalence_expr237 = null;


        Object IN236_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:441:6: ( equivalence_expr ( IN equivalence_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:441:9: equivalence_expr ( IN equivalence_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equivalence_expr_in_expr1798);
            equivalence_expr235=equivalence_expr();

            state._fsp--;

            adaptor.addChild(root_0, equivalence_expr235.getTree());
            // nl/cwi/cacoj/creol/Creol.g:441:26: ( IN equivalence_expr )*
            loop70:
            do {
                int alt70=2;
                switch ( input.LA(1) ) {
                case IN:
                    {
                    alt70=1;
                    }
                    break;

                }

                switch (alt70) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:441:27: IN equivalence_expr
            	    {
            	    IN236=(Token)match(input,IN,FOLLOW_IN_in_expr1801); 
            	    IN236_tree = (Object)adaptor.create(IN236);
            	    root_0 = (Object)adaptor.becomeRoot(IN236_tree, root_0);

            	    pushFollow(FOLLOW_equivalence_expr_in_expr1804);
            	    equivalence_expr237=equivalence_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equivalence_expr237.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class equivalence_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equivalence_expr"
    // nl/cwi/cacoj/creol/Creol.g:444:1: equivalence_expr : impl_expr ( EQUIVALENCE impl_expr )* ;
    public final CreolParser.equivalence_expr_return equivalence_expr() throws RecognitionException {
        CreolParser.equivalence_expr_return retval = new CreolParser.equivalence_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUIVALENCE239=null;
        CreolParser.impl_expr_return impl_expr238 = null;

        CreolParser.impl_expr_return impl_expr240 = null;


        Object EQUIVALENCE239_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:445:2: ( impl_expr ( EQUIVALENCE impl_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:445:4: impl_expr ( EQUIVALENCE impl_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_impl_expr_in_equivalence_expr1818);
            impl_expr238=impl_expr();

            state._fsp--;

            adaptor.addChild(root_0, impl_expr238.getTree());
            // nl/cwi/cacoj/creol/Creol.g:445:14: ( EQUIVALENCE impl_expr )*
            loop71:
            do {
                int alt71=2;
                switch ( input.LA(1) ) {
                case EQUIVALENCE:
                    {
                    alt71=1;
                    }
                    break;

                }

                switch (alt71) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:445:15: EQUIVALENCE impl_expr
            	    {
            	    EQUIVALENCE239=(Token)match(input,EQUIVALENCE,FOLLOW_EQUIVALENCE_in_equivalence_expr1821); 
            	    EQUIVALENCE239_tree = (Object)adaptor.create(EQUIVALENCE239);
            	    root_0 = (Object)adaptor.becomeRoot(EQUIVALENCE239_tree, root_0);

            	    pushFollow(FOLLOW_impl_expr_in_equivalence_expr1824);
            	    impl_expr240=impl_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, impl_expr240.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equivalence_expr"

    public static class impl_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "impl_expr"
    // nl/cwi/cacoj/creol/Creol.g:448:1: impl_expr : xor_expr ( IMPLICATION xor_expr )* ;
    public final CreolParser.impl_expr_return impl_expr() throws RecognitionException {
        CreolParser.impl_expr_return retval = new CreolParser.impl_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPLICATION242=null;
        CreolParser.xor_expr_return xor_expr241 = null;

        CreolParser.xor_expr_return xor_expr243 = null;


        Object IMPLICATION242_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:448:11: ( xor_expr ( IMPLICATION xor_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:448:13: xor_expr ( IMPLICATION xor_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_xor_expr_in_impl_expr1836);
            xor_expr241=xor_expr();

            state._fsp--;

            adaptor.addChild(root_0, xor_expr241.getTree());
            // nl/cwi/cacoj/creol/Creol.g:448:22: ( IMPLICATION xor_expr )*
            loop72:
            do {
                int alt72=2;
                switch ( input.LA(1) ) {
                case IMPLICATION:
                    {
                    alt72=1;
                    }
                    break;

                }

                switch (alt72) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:448:23: IMPLICATION xor_expr
            	    {
            	    IMPLICATION242=(Token)match(input,IMPLICATION,FOLLOW_IMPLICATION_in_impl_expr1839); 
            	    IMPLICATION242_tree = (Object)adaptor.create(IMPLICATION242);
            	    root_0 = (Object)adaptor.becomeRoot(IMPLICATION242_tree, root_0);

            	    pushFollow(FOLLOW_xor_expr_in_impl_expr1842);
            	    xor_expr243=xor_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xor_expr243.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "impl_expr"

    public static class xor_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xor_expr"
    // nl/cwi/cacoj/creol/Creol.g:451:1: xor_expr : or_expr ( XOR or_expr )* ;
    public final CreolParser.xor_expr_return xor_expr() throws RecognitionException {
        CreolParser.xor_expr_return retval = new CreolParser.xor_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR245=null;
        CreolParser.or_expr_return or_expr244 = null;

        CreolParser.or_expr_return or_expr246 = null;


        Object XOR245_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:451:10: ( or_expr ( XOR or_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:451:12: or_expr ( XOR or_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expr_in_xor_expr1854);
            or_expr244=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr244.getTree());
            // nl/cwi/cacoj/creol/Creol.g:451:20: ( XOR or_expr )*
            loop73:
            do {
                int alt73=2;
                switch ( input.LA(1) ) {
                case XOR:
                    {
                    alt73=1;
                    }
                    break;

                }

                switch (alt73) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:451:21: XOR or_expr
            	    {
            	    XOR245=(Token)match(input,XOR,FOLLOW_XOR_in_xor_expr1857); 
            	    XOR245_tree = (Object)adaptor.create(XOR245);
            	    root_0 = (Object)adaptor.becomeRoot(XOR245_tree, root_0);

            	    pushFollow(FOLLOW_or_expr_in_xor_expr1860);
            	    or_expr246=or_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_expr246.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "xor_expr"

    public static class or_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expr"
    // nl/cwi/cacoj/creol/Creol.g:454:1: or_expr : and_expr ( OR and_expr )* ;
    public final CreolParser.or_expr_return or_expr() throws RecognitionException {
        CreolParser.or_expr_return retval = new CreolParser.or_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR248=null;
        CreolParser.and_expr_return and_expr247 = null;

        CreolParser.and_expr_return and_expr249 = null;


        Object OR248_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:454:9: ( and_expr ( OR and_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:454:11: and_expr ( OR and_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expr_in_or_expr1872);
            and_expr247=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr247.getTree());
            // nl/cwi/cacoj/creol/Creol.g:454:20: ( OR and_expr )*
            loop74:
            do {
                int alt74=2;
                switch ( input.LA(1) ) {
                case OR:
                    {
                    alt74=1;
                    }
                    break;

                }

                switch (alt74) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:454:21: OR and_expr
            	    {
            	    OR248=(Token)match(input,OR,FOLLOW_OR_in_or_expr1875); 
            	    OR248_tree = (Object)adaptor.create(OR248);
            	    root_0 = (Object)adaptor.becomeRoot(OR248_tree, root_0);

            	    pushFollow(FOLLOW_and_expr_in_or_expr1878);
            	    and_expr249=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr249.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_expr"

    public static class and_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expr"
    // nl/cwi/cacoj/creol/Creol.g:457:1: and_expr : not_expr ( AND and_expr )? ;
    public final CreolParser.and_expr_return and_expr() throws RecognitionException {
        CreolParser.and_expr_return retval = new CreolParser.and_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND251=null;
        CreolParser.not_expr_return not_expr250 = null;

        CreolParser.and_expr_return and_expr252 = null;


        Object AND251_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:457:10: ( not_expr ( AND and_expr )? )
            // nl/cwi/cacoj/creol/Creol.g:457:12: not_expr ( AND and_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_expr_in_and_expr1890);
            not_expr250=not_expr();

            state._fsp--;

            adaptor.addChild(root_0, not_expr250.getTree());
            // nl/cwi/cacoj/creol/Creol.g:457:21: ( AND and_expr )?
            int alt75=2;
            switch ( input.LA(1) ) {
                case AND:
                    {
                    alt75=1;
                    }
                    break;
            }

            switch (alt75) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:457:22: AND and_expr
                    {
                    AND251=(Token)match(input,AND,FOLLOW_AND_in_and_expr1893); 
                    AND251_tree = (Object)adaptor.create(AND251);
                    root_0 = (Object)adaptor.becomeRoot(AND251_tree, root_0);

                    pushFollow(FOLLOW_and_expr_in_and_expr1896);
                    and_expr252=and_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, and_expr252.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_expr"

    public static class not_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_expr"
    // nl/cwi/cacoj/creol/Creol.g:460:1: not_expr : ( ( NOT not_expr ) | equals_expr );
    public final CreolParser.not_expr_return not_expr() throws RecognitionException {
        CreolParser.not_expr_return retval = new CreolParser.not_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT253=null;
        CreolParser.not_expr_return not_expr254 = null;

        CreolParser.equals_expr_return equals_expr255 = null;


        Object NOT253_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:460:10: ( ( NOT not_expr ) | equals_expr )
            int alt76=2;
            switch ( input.LA(1) ) {
            case NOT:
                {
                alt76=1;
                }
                break;
            case LPAREN:
            case IDENTIFIER:
            case MINUS:
            case NUMBER_SIGN:
            case STRING:
            case SCHEMAVAR:
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
            case LBRACK:
            case LBRACES:
                {
                alt76=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:460:12: ( NOT not_expr )
                    {
                    root_0 = (Object)adaptor.nil();

                    // nl/cwi/cacoj/creol/Creol.g:460:12: ( NOT not_expr )
                    // nl/cwi/cacoj/creol/Creol.g:460:13: NOT not_expr
                    {
                    NOT253=(Token)match(input,NOT,FOLLOW_NOT_in_not_expr1909); 
                    NOT253_tree = (Object)adaptor.create(NOT253);
                    root_0 = (Object)adaptor.becomeRoot(NOT253_tree, root_0);

                    pushFollow(FOLLOW_not_expr_in_not_expr1912);
                    not_expr254=not_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, not_expr254.getTree());

                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:461:4: equals_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_equals_expr_in_not_expr1918);
                    equals_expr255=equals_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, equals_expr255.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "not_expr"

    public static class equals_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equals_expr"
    // nl/cwi/cacoj/creol/Creol.g:464:1: equals_expr : comp_expr ( ( EQUALITY | INEQUALITY ) comp_expr )? ;
    public final CreolParser.equals_expr_return equals_expr() throws RecognitionException {
        CreolParser.equals_expr_return retval = new CreolParser.equals_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set257=null;
        CreolParser.comp_expr_return comp_expr256 = null;

        CreolParser.comp_expr_return comp_expr258 = null;


        Object set257_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:464:13: ( comp_expr ( ( EQUALITY | INEQUALITY ) comp_expr )? )
            // nl/cwi/cacoj/creol/Creol.g:464:15: comp_expr ( ( EQUALITY | INEQUALITY ) comp_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_comp_expr_in_equals_expr1928);
            comp_expr256=comp_expr();

            state._fsp--;

            adaptor.addChild(root_0, comp_expr256.getTree());
            // nl/cwi/cacoj/creol/Creol.g:464:25: ( ( EQUALITY | INEQUALITY ) comp_expr )?
            int alt77=2;
            switch ( input.LA(1) ) {
                case EQUALITY:
                case INEQUALITY:
                    {
                    alt77=1;
                    }
                    break;
            }

            switch (alt77) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:464:26: ( EQUALITY | INEQUALITY ) comp_expr
                    {
                    set257=(Token)input.LT(1);
                    set257=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALITY && input.LA(1)<=INEQUALITY) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set257), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_comp_expr_in_equals_expr1938);
                    comp_expr258=comp_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, comp_expr258.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equals_expr"

    public static class comp_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp_expr"
    // nl/cwi/cacoj/creol/Creol.g:467:1: comp_expr : projection_expr ( comp_op projection_expr )? ;
    public final CreolParser.comp_expr_return comp_expr() throws RecognitionException {
        CreolParser.comp_expr_return retval = new CreolParser.comp_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.projection_expr_return projection_expr259 = null;

        CreolParser.comp_op_return comp_op260 = null;

        CreolParser.projection_expr_return projection_expr261 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:467:11: ( projection_expr ( comp_op projection_expr )? )
            // nl/cwi/cacoj/creol/Creol.g:467:13: projection_expr ( comp_op projection_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_projection_expr_in_comp_expr1951);
            projection_expr259=projection_expr();

            state._fsp--;

            adaptor.addChild(root_0, projection_expr259.getTree());
            // nl/cwi/cacoj/creol/Creol.g:467:29: ( comp_op projection_expr )?
            int alt78=2;
            switch ( input.LA(1) ) {
                case LESS_THAN:
                case GREATER_THAN:
                case LESS_OR_EQUAL:
                case GREATER_OR_EQUAL:
                    {
                    alt78=1;
                    }
                    break;
            }

            switch (alt78) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:467:30: comp_op projection_expr
                    {
                    pushFollow(FOLLOW_comp_op_in_comp_expr1954);
                    comp_op260=comp_op();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(comp_op260.getTree(), root_0);
                    pushFollow(FOLLOW_projection_expr_in_comp_expr1957);
                    projection_expr261=projection_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, projection_expr261.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comp_expr"

    public static class comp_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp_op"
    // nl/cwi/cacoj/creol/Creol.g:470:1: comp_op : ( LESS_THAN | GREATER_THAN | LESS_OR_EQUAL | GREATER_OR_EQUAL );
    public final CreolParser.comp_op_return comp_op() throws RecognitionException {
        CreolParser.comp_op_return retval = new CreolParser.comp_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set262=null;

        Object set262_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:470:10: ( LESS_THAN | GREATER_THAN | LESS_OR_EQUAL | GREATER_OR_EQUAL )
            // nl/cwi/cacoj/creol/Creol.g:
            {
            root_0 = (Object)adaptor.nil();

            set262=(Token)input.LT(1);
            if ( (input.LA(1)>=LESS_THAN && input.LA(1)<=GREATER_OR_EQUAL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set262));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comp_op"

    public static class projection_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "projection_expr"
    // nl/cwi/cacoj/creol/Creol.g:476:1: projection_expr : concat_expr ( PROJECTION concat_expr )* ;
    public final CreolParser.projection_expr_return projection_expr() throws RecognitionException {
        CreolParser.projection_expr_return retval = new CreolParser.projection_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROJECTION264=null;
        CreolParser.concat_expr_return concat_expr263 = null;

        CreolParser.concat_expr_return concat_expr265 = null;


        Object PROJECTION264_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:476:17: ( concat_expr ( PROJECTION concat_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:476:19: concat_expr ( PROJECTION concat_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_concat_expr_in_projection_expr1999);
            concat_expr263=concat_expr();

            state._fsp--;

            adaptor.addChild(root_0, concat_expr263.getTree());
            // nl/cwi/cacoj/creol/Creol.g:476:31: ( PROJECTION concat_expr )*
            loop79:
            do {
                int alt79=2;
                switch ( input.LA(1) ) {
                case PROJECTION:
                    {
                    alt79=1;
                    }
                    break;

                }

                switch (alt79) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:476:32: PROJECTION concat_expr
            	    {
            	    PROJECTION264=(Token)match(input,PROJECTION,FOLLOW_PROJECTION_in_projection_expr2002); 
            	    PROJECTION264_tree = (Object)adaptor.create(PROJECTION264);
            	    root_0 = (Object)adaptor.becomeRoot(PROJECTION264_tree, root_0);

            	    pushFollow(FOLLOW_concat_expr_in_projection_expr2005);
            	    concat_expr265=concat_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, concat_expr265.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "projection_expr"

    public static class concat_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concat_expr"
    // nl/cwi/cacoj/creol/Creol.g:479:1: concat_expr : prepend_expr ( CONCAT prepend_expr )* ;
    public final CreolParser.concat_expr_return concat_expr() throws RecognitionException {
        CreolParser.concat_expr_return retval = new CreolParser.concat_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONCAT267=null;
        CreolParser.prepend_expr_return prepend_expr266 = null;

        CreolParser.prepend_expr_return prepend_expr268 = null;


        Object CONCAT267_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:479:13: ( prepend_expr ( CONCAT prepend_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:479:15: prepend_expr ( CONCAT prepend_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_prepend_expr_in_concat_expr2018);
            prepend_expr266=prepend_expr();

            state._fsp--;

            adaptor.addChild(root_0, prepend_expr266.getTree());
            // nl/cwi/cacoj/creol/Creol.g:479:28: ( CONCAT prepend_expr )*
            loop80:
            do {
                int alt80=2;
                switch ( input.LA(1) ) {
                case CONCAT:
                    {
                    alt80=1;
                    }
                    break;

                }

                switch (alt80) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:479:29: CONCAT prepend_expr
            	    {
            	    CONCAT267=(Token)match(input,CONCAT,FOLLOW_CONCAT_in_concat_expr2021); 
            	    CONCAT267_tree = (Object)adaptor.create(CONCAT267);
            	    root_0 = (Object)adaptor.becomeRoot(CONCAT267_tree, root_0);

            	    pushFollow(FOLLOW_prepend_expr_in_concat_expr2024);
            	    prepend_expr268=prepend_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepend_expr268.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "concat_expr"

    public static class prepend_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepend_expr"
    // nl/cwi/cacoj/creol/Creol.g:482:1: prepend_expr : append_expr ( PREPEND prepend_expr )? ;
    public final CreolParser.prepend_expr_return prepend_expr() throws RecognitionException {
        CreolParser.prepend_expr_return retval = new CreolParser.prepend_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREPEND270=null;
        CreolParser.append_expr_return append_expr269 = null;

        CreolParser.prepend_expr_return prepend_expr271 = null;


        Object PREPEND270_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:482:14: ( append_expr ( PREPEND prepend_expr )? )
            // nl/cwi/cacoj/creol/Creol.g:482:16: append_expr ( PREPEND prepend_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_append_expr_in_prepend_expr2036);
            append_expr269=append_expr();

            state._fsp--;

            adaptor.addChild(root_0, append_expr269.getTree());
            // nl/cwi/cacoj/creol/Creol.g:482:28: ( PREPEND prepend_expr )?
            int alt81=2;
            switch ( input.LA(1) ) {
                case PREPEND:
                    {
                    alt81=1;
                    }
                    break;
            }

            switch (alt81) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:482:29: PREPEND prepend_expr
                    {
                    PREPEND270=(Token)match(input,PREPEND,FOLLOW_PREPEND_in_prepend_expr2039); 
                    PREPEND270_tree = (Object)adaptor.create(PREPEND270);
                    root_0 = (Object)adaptor.becomeRoot(PREPEND270_tree, root_0);

                    pushFollow(FOLLOW_prepend_expr_in_prepend_expr2042);
                    prepend_expr271=prepend_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, prepend_expr271.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prepend_expr"

    public static class append_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "append_expr"
    // nl/cwi/cacoj/creol/Creol.g:485:1: append_expr : add_expr ( APPEND add_expr )* ;
    public final CreolParser.append_expr_return append_expr() throws RecognitionException {
        CreolParser.append_expr_return retval = new CreolParser.append_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token APPEND273=null;
        CreolParser.add_expr_return add_expr272 = null;

        CreolParser.add_expr_return add_expr274 = null;


        Object APPEND273_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:485:13: ( add_expr ( APPEND add_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:485:15: add_expr ( APPEND add_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expr_in_append_expr2055);
            add_expr272=add_expr();

            state._fsp--;

            adaptor.addChild(root_0, add_expr272.getTree());
            // nl/cwi/cacoj/creol/Creol.g:485:24: ( APPEND add_expr )*
            loop82:
            do {
                int alt82=2;
                switch ( input.LA(1) ) {
                case APPEND:
                    {
                    alt82=1;
                    }
                    break;

                }

                switch (alt82) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:485:25: APPEND add_expr
            	    {
            	    APPEND273=(Token)match(input,APPEND,FOLLOW_APPEND_in_append_expr2058); 
            	    APPEND273_tree = (Object)adaptor.create(APPEND273);
            	    root_0 = (Object)adaptor.becomeRoot(APPEND273_tree, root_0);

            	    pushFollow(FOLLOW_add_expr_in_append_expr2061);
            	    add_expr274=add_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_expr274.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "append_expr"

    public static class add_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expr"
    // nl/cwi/cacoj/creol/Creol.g:488:1: add_expr : mult_expr ( ( PLUS | MINUS ) mult_expr )* ;
    public final CreolParser.add_expr_return add_expr() throws RecognitionException {
        CreolParser.add_expr_return retval = new CreolParser.add_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set276=null;
        CreolParser.mult_expr_return mult_expr275 = null;

        CreolParser.mult_expr_return mult_expr277 = null;


        Object set276_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:488:10: ( mult_expr ( ( PLUS | MINUS ) mult_expr )* )
            // nl/cwi/cacoj/creol/Creol.g:488:12: mult_expr ( ( PLUS | MINUS ) mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_add_expr2073);
            mult_expr275=mult_expr();

            state._fsp--;

            adaptor.addChild(root_0, mult_expr275.getTree());
            // nl/cwi/cacoj/creol/Creol.g:488:22: ( ( PLUS | MINUS ) mult_expr )*
            loop83:
            do {
                int alt83=2;
                switch ( input.LA(1) ) {
                case PLUS:
                case MINUS:
                    {
                    alt83=1;
                    }
                    break;

                }

                switch (alt83) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:488:23: ( PLUS | MINUS ) mult_expr
            	    {
            	    set276=(Token)input.LT(1);
            	    set276=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set276), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mult_expr_in_add_expr2083);
            	    mult_expr277=mult_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult_expr277.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_expr"

    public static class mult_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expr"
    // nl/cwi/cacoj/creol/Creol.g:491:1: mult_expr : power ( ( MULT | DIV | MOD ) power )* ;
    public final CreolParser.mult_expr_return mult_expr() throws RecognitionException {
        CreolParser.mult_expr_return retval = new CreolParser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set279=null;
        CreolParser.power_return power278 = null;

        CreolParser.power_return power280 = null;


        Object set279_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:491:11: ( power ( ( MULT | DIV | MOD ) power )* )
            // nl/cwi/cacoj/creol/Creol.g:491:13: power ( ( MULT | DIV | MOD ) power )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_power_in_mult_expr2095);
            power278=power();

            state._fsp--;

            adaptor.addChild(root_0, power278.getTree());
            // nl/cwi/cacoj/creol/Creol.g:491:19: ( ( MULT | DIV | MOD ) power )*
            loop84:
            do {
                int alt84=2;
                switch ( input.LA(1) ) {
                case MULT:
                case DIV:
                case MOD:
                    {
                    alt84=1;
                    }
                    break;

                }

                switch (alt84) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:491:20: ( MULT | DIV | MOD ) power
            	    {
            	    set279=(Token)input.LT(1);
            	    set279=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set279), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_power_in_mult_expr2111);
            	    power280=power();

            	    state._fsp--;

            	    adaptor.addChild(root_0, power280.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult_expr"

    public static class power_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "power"
    // nl/cwi/cacoj/creol/Creol.g:494:1: power : factor ( POW factor )* ;
    public final CreolParser.power_return power() throws RecognitionException {
        CreolParser.power_return retval = new CreolParser.power_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POW282=null;
        CreolParser.factor_return factor281 = null;

        CreolParser.factor_return factor283 = null;


        Object POW282_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:494:7: ( factor ( POW factor )* )
            // nl/cwi/cacoj/creol/Creol.g:494:9: factor ( POW factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_power2123);
            factor281=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor281.getTree());
            // nl/cwi/cacoj/creol/Creol.g:494:16: ( POW factor )*
            loop85:
            do {
                int alt85=2;
                switch ( input.LA(1) ) {
                case POW:
                    {
                    alt85=1;
                    }
                    break;

                }

                switch (alt85) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:494:17: POW factor
            	    {
            	    POW282=(Token)match(input,POW,FOLLOW_POW_in_power2126); 
            	    POW282_tree = (Object)adaptor.create(POW282);
            	    root_0 = (Object)adaptor.becomeRoot(POW282_tree, root_0);

            	    pushFollow(FOLLOW_factor_in_power2129);
            	    factor283=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor283.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "power"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // nl/cwi/cacoj/creol/Creol.g:498:1: factor : ( MINUS factor | NUMBER_SIGN factor | atom_with_trailer );
    public final CreolParser.factor_return factor() throws RecognitionException {
        CreolParser.factor_return retval = new CreolParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MINUS284=null;
        Token NUMBER_SIGN286=null;
        CreolParser.factor_return factor285 = null;

        CreolParser.factor_return factor287 = null;

        CreolParser.atom_with_trailer_return atom_with_trailer288 = null;


        Object MINUS284_tree=null;
        Object NUMBER_SIGN286_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:498:8: ( MINUS factor | NUMBER_SIGN factor | atom_with_trailer )
            int alt86=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt86=1;
                }
                break;
            case NUMBER_SIGN:
                {
                alt86=2;
                }
                break;
            case LPAREN:
            case IDENTIFIER:
            case STRING:
            case SCHEMAVAR:
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
            case LBRACK:
            case LBRACES:
                {
                alt86=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:498:10: MINUS factor
                    {
                    root_0 = (Object)adaptor.nil();

                    MINUS284=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2142); 
                    MINUS284_tree = (Object)adaptor.create(MINUS284);
                    root_0 = (Object)adaptor.becomeRoot(MINUS284_tree, root_0);

                    pushFollow(FOLLOW_factor_in_factor2145);
                    factor285=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor285.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:499:4: NUMBER_SIGN factor
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER_SIGN286=(Token)match(input,NUMBER_SIGN,FOLLOW_NUMBER_SIGN_in_factor2151); 
                    NUMBER_SIGN286_tree = (Object)adaptor.create(NUMBER_SIGN286);
                    root_0 = (Object)adaptor.becomeRoot(NUMBER_SIGN286_tree, root_0);

                    pushFollow(FOLLOW_factor_in_factor2154);
                    factor287=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor287.getTree());

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:500:4: atom_with_trailer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_with_trailer_in_factor2160);
                    atom_with_trailer288=atom_with_trailer();

                    state._fsp--;

                    adaptor.addChild(root_0, atom_with_trailer288.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class atom_with_trailer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_with_trailer"
    // nl/cwi/cacoj/creol/Creol.g:503:1: atom_with_trailer : atom ( ( ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) ) ( trailer_rest )? ) | -> ^( atom ) ) ;
    public final CreolParser.atom_with_trailer_return atom_with_trailer() throws RecognitionException {
        CreolParser.atom_with_trailer_return retval = new CreolParser.atom_with_trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT290=null;
        Token DOT292=null;
        Token QUESTION_MARK298=null;
        Token AS300=null;
        CreolParser.atom_return atom289 = null;

        CreolParser.type_return type291 = null;

        CreolParser.method_call_return method_call293 = null;

        CreolParser.as_type_return as_type294 = null;

        CreolParser.bounds_return bounds295 = null;

        CreolParser.arg_list_return arg_list296 = null;

        CreolParser.as_type_return as_type297 = null;

        CreolParser.lhs_list_paren_return lhs_list_paren299 = null;

        CreolParser.type_return type301 = null;

        CreolParser.trailer_rest_return trailer_rest302 = null;


        Object AT290_tree=null;
        Object DOT292_tree=null;
        Object QUESTION_MARK298_tree=null;
        Object AS300_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_bounds=new RewriteRuleSubtreeStream(adaptor,"rule bounds");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");
        RewriteRuleSubtreeStream stream_as_type=new RewriteRuleSubtreeStream(adaptor,"rule as_type");
        RewriteRuleSubtreeStream stream_method_call=new RewriteRuleSubtreeStream(adaptor,"rule method_call");
        RewriteRuleSubtreeStream stream_lhs_list_paren=new RewriteRuleSubtreeStream(adaptor,"rule lhs_list_paren");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_trailer_rest=new RewriteRuleSubtreeStream(adaptor,"rule trailer_rest");
        try {
            // nl/cwi/cacoj/creol/Creol.g:503:18: ( atom ( ( ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) ) ( trailer_rest )? ) | -> ^( atom ) ) )
            // nl/cwi/cacoj/creol/Creol.g:504:3: atom ( ( ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) ) ( trailer_rest )? ) | -> ^( atom ) )
            {
            pushFollow(FOLLOW_atom_in_atom_with_trailer2172);
            atom289=atom();

            state._fsp--;

            stream_atom.add(atom289.getTree());
            // nl/cwi/cacoj/creol/Creol.g:504:8: ( ( ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) ) ( trailer_rest )? ) | -> ^( atom ) )
            int alt93=2;
            switch ( input.LA(1) ) {
            case LPAREN:
            case AT:
            case DOT:
            case QUESTION_MARK:
            case AS:
            case BOUND_L:
            case BOUND_R:
                {
                alt93=1;
                }
                break;
            case EOF:
            case CLASS:
            case END:
            case SEMICOLON:
            case PRAGMA:
            case KOMMA:
            case VAR:
            case WITH:
            case RPAREN:
            case INTERFACE:
            case DATATYPE:
            case FUNCTION:
            case COLON:
            case DOUBLE_EQUAL:
            case IN:
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
            case OP:
            case ENSURES:
            case ASSIGN:
            case INTERLEAVE:
            case BOX:
            case EXCLENATION_MARK:
            case WHILE:
            case DO:
            case MEASURE:
            case BY:
            case INV:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_OR_EQUAL:
            case GREATER_OR_EQUAL:
            case RBRACK:
            case RBRACES:
            case THEN:
            case ELSE:
            case VERTICAL:
            case MAPSTO:
            case IMPORT:
                {
                alt93=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:505:3: ( ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) ) ( trailer_rest )? )
                    {
                    // nl/cwi/cacoj/creol/Creol.g:505:3: ( ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) ) ( trailer_rest )? )
                    // nl/cwi/cacoj/creol/Creol.g:505:4: ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) ) ( trailer_rest )?
                    {
                    // nl/cwi/cacoj/creol/Creol.g:505:4: ( ( AT type ) -> ^( AT atom type ) | ( DOT method_call )+ ( as_type )? -> ^( DOT atom ( method_call )+ ( as_type )? ) | bounds -> ^( bounds ) | arg_list ( as_type )? -> ^( METHOD atom arg_list ( as_type )? ) | ( QUESTION_MARK ( lhs_list_paren )? ) -> ^( QUESTION_MARK atom ( lhs_list_paren )? ) | AS type -> ^( AS atom type ) )
                    int alt91=6;
                    switch ( input.LA(1) ) {
                    case AT:
                        {
                        alt91=1;
                        }
                        break;
                    case DOT:
                        {
                        alt91=2;
                        }
                        break;
                    case BOUND_L:
                    case BOUND_R:
                        {
                        alt91=3;
                        }
                        break;
                    case LPAREN:
                        {
                        alt91=4;
                        }
                        break;
                    case QUESTION_MARK:
                        {
                        alt91=5;
                        }
                        break;
                    case AS:
                        {
                        alt91=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }

                    switch (alt91) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:506:3: ( AT type )
                            {
                            // nl/cwi/cacoj/creol/Creol.g:506:3: ( AT type )
                            // nl/cwi/cacoj/creol/Creol.g:506:4: AT type
                            {
                            AT290=(Token)match(input,AT,FOLLOW_AT_in_atom_with_trailer2184);  
                            stream_AT.add(AT290);

                            pushFollow(FOLLOW_type_in_atom_with_trailer2186);
                            type291=type();

                            state._fsp--;

                            stream_type.add(type291.getTree());

                            }



                            // AST REWRITE
                            // elements: AT, atom, type
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 506:13: -> ^( AT atom type )
                            {
                                // nl/cwi/cacoj/creol/Creol.g:506:16: ^( AT atom type )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(stream_AT.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_atom.nextTree());
                                adaptor.addChild(root_1, stream_type.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // nl/cwi/cacoj/creol/Creol.g:507:5: ( DOT method_call )+ ( as_type )?
                            {
                            // nl/cwi/cacoj/creol/Creol.g:507:5: ( DOT method_call )+
                            int cnt87=0;
                            loop87:
                            do {
                                int alt87=2;
                                alt87 = dfa87.predict(input);
                                switch (alt87) {
                            	case 1 :
                            	    // nl/cwi/cacoj/creol/Creol.g:507:6: DOT method_call
                            	    {
                            	    DOT292=(Token)match(input,DOT,FOLLOW_DOT_in_atom_with_trailer2204);  
                            	    stream_DOT.add(DOT292);

                            	    pushFollow(FOLLOW_method_call_in_atom_with_trailer2206);
                            	    method_call293=method_call();

                            	    state._fsp--;

                            	    stream_method_call.add(method_call293.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt87 >= 1 ) break loop87;
                                        EarlyExitException eee =
                                            new EarlyExitException(87, input);
                                        throw eee;
                                }
                                cnt87++;
                            } while (true);

                            // nl/cwi/cacoj/creol/Creol.g:507:24: ( as_type )?
                            int alt88=2;
                            switch ( input.LA(1) ) {
                                case AS:
                                    {
                                    alt88=1;
                                    }
                                    break;
                            }

                            switch (alt88) {
                                case 1 :
                                    // nl/cwi/cacoj/creol/Creol.g:507:25: as_type
                                    {
                                    pushFollow(FOLLOW_as_type_in_atom_with_trailer2211);
                                    as_type294=as_type();

                                    state._fsp--;

                                    stream_as_type.add(as_type294.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: DOT, atom, as_type, method_call
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 507:35: -> ^( DOT atom ( method_call )+ ( as_type )? )
                            {
                                // nl/cwi/cacoj/creol/Creol.g:507:38: ^( DOT atom ( method_call )+ ( as_type )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_atom.nextTree());
                                if ( !(stream_method_call.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_method_call.hasNext() ) {
                                    adaptor.addChild(root_1, stream_method_call.nextTree());

                                }
                                stream_method_call.reset();
                                // nl/cwi/cacoj/creol/Creol.g:507:62: ( as_type )?
                                if ( stream_as_type.hasNext() ) {
                                    adaptor.addChild(root_1, stream_as_type.nextTree());

                                }
                                stream_as_type.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // nl/cwi/cacoj/creol/Creol.g:508:5: bounds
                            {
                            pushFollow(FOLLOW_bounds_in_atom_with_trailer2233);
                            bounds295=bounds();

                            state._fsp--;

                            stream_bounds.add(bounds295.getTree());


                            // AST REWRITE
                            // elements: bounds
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 508:13: -> ^( bounds )
                            {
                                // nl/cwi/cacoj/creol/Creol.g:508:16: ^( bounds )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(stream_bounds.nextNode(), root_1);

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // nl/cwi/cacoj/creol/Creol.g:509:5: arg_list ( as_type )?
                            {
                            pushFollow(FOLLOW_arg_list_in_atom_with_trailer2246);
                            arg_list296=arg_list();

                            state._fsp--;

                            stream_arg_list.add(arg_list296.getTree());
                            // nl/cwi/cacoj/creol/Creol.g:509:14: ( as_type )?
                            int alt89=2;
                            switch ( input.LA(1) ) {
                                case AS:
                                    {
                                    alt89=1;
                                    }
                                    break;
                            }

                            switch (alt89) {
                                case 1 :
                                    // nl/cwi/cacoj/creol/Creol.g:509:15: as_type
                                    {
                                    pushFollow(FOLLOW_as_type_in_atom_with_trailer2249);
                                    as_type297=as_type();

                                    state._fsp--;

                                    stream_as_type.add(as_type297.getTree());

                                    }
                                    break;

                            }



                            // AST REWRITE
                            // elements: atom, as_type, arg_list
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 509:25: -> ^( METHOD atom arg_list ( as_type )? )
                            {
                                // nl/cwi/cacoj/creol/Creol.g:509:28: ^( METHOD atom arg_list ( as_type )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                                adaptor.addChild(root_1, stream_atom.nextTree());
                                adaptor.addChild(root_1, stream_arg_list.nextTree());
                                // nl/cwi/cacoj/creol/Creol.g:509:51: ( as_type )?
                                if ( stream_as_type.hasNext() ) {
                                    adaptor.addChild(root_1, stream_as_type.nextTree());

                                }
                                stream_as_type.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 5 :
                            // nl/cwi/cacoj/creol/Creol.g:510:5: ( QUESTION_MARK ( lhs_list_paren )? )
                            {
                            // nl/cwi/cacoj/creol/Creol.g:510:5: ( QUESTION_MARK ( lhs_list_paren )? )
                            // nl/cwi/cacoj/creol/Creol.g:510:6: QUESTION_MARK ( lhs_list_paren )?
                            {
                            QUESTION_MARK298=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_atom_with_trailer2271);  
                            stream_QUESTION_MARK.add(QUESTION_MARK298);

                            // nl/cwi/cacoj/creol/Creol.g:510:20: ( lhs_list_paren )?
                            int alt90=2;
                            switch ( input.LA(1) ) {
                                case LPAREN:
                                    {
                                    alt90=1;
                                    }
                                    break;
                            }

                            switch (alt90) {
                                case 1 :
                                    // nl/cwi/cacoj/creol/Creol.g:510:20: lhs_list_paren
                                    {
                                    pushFollow(FOLLOW_lhs_list_paren_in_atom_with_trailer2273);
                                    lhs_list_paren299=lhs_list_paren();

                                    state._fsp--;

                                    stream_lhs_list_paren.add(lhs_list_paren299.getTree());

                                    }
                                    break;

                            }


                            }



                            // AST REWRITE
                            // elements: atom, QUESTION_MARK, lhs_list_paren
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 510:38: -> ^( QUESTION_MARK atom ( lhs_list_paren )? )
                            {
                                // nl/cwi/cacoj/creol/Creol.g:510:41: ^( QUESTION_MARK atom ( lhs_list_paren )? )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_atom.nextTree());
                                // nl/cwi/cacoj/creol/Creol.g:510:62: ( lhs_list_paren )?
                                if ( stream_lhs_list_paren.hasNext() ) {
                                    adaptor.addChild(root_1, stream_lhs_list_paren.nextTree());

                                }
                                stream_lhs_list_paren.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 6 :
                            // nl/cwi/cacoj/creol/Creol.g:511:5: AS type
                            {
                            AS300=(Token)match(input,AS,FOLLOW_AS_in_atom_with_trailer2293);  
                            stream_AS.add(AS300);

                            pushFollow(FOLLOW_type_in_atom_with_trailer2295);
                            type301=type();

                            state._fsp--;

                            stream_type.add(type301.getTree());


                            // AST REWRITE
                            // elements: atom, AS, type
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 511:13: -> ^( AS atom type )
                            {
                                // nl/cwi/cacoj/creol/Creol.g:511:16: ^( AS atom type )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(stream_AS.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_atom.nextTree());
                                adaptor.addChild(root_1, stream_type.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }

                    // nl/cwi/cacoj/creol/Creol.g:512:5: ( trailer_rest )?
                    int alt92=2;
                    switch ( input.LA(1) ) {
                        case DOT:
                        case BOUND_L:
                        case BOUND_R:
                            {
                            alt92=1;
                            }
                            break;
                    }

                    switch (alt92) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:512:5: trailer_rest
                            {
                            pushFollow(FOLLOW_trailer_rest_in_atom_with_trailer2311);
                            trailer_rest302=trailer_rest();

                            state._fsp--;

                            stream_trailer_rest.add(trailer_rest302.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:513:4: 
                    {

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 513:4: -> ^( atom )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:513:7: ^( atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_atom.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom_with_trailer"

    public static class method_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_call"
    // nl/cwi/cacoj/creol/Creol.g:517:1: method_call : ( IDENTIFIER ( arg_list )? -> ^( METHOD IDENTIFIER ( arg_list )? ) | SCHEMAVAR arg_list -> ^( METHOD SCHEMAVAR arg_list ) );
    public final CreolParser.method_call_return method_call() throws RecognitionException {
        CreolParser.method_call_return retval = new CreolParser.method_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER303=null;
        Token SCHEMAVAR305=null;
        CreolParser.arg_list_return arg_list304 = null;

        CreolParser.arg_list_return arg_list306 = null;


        Object IDENTIFIER303_tree=null;
        Object SCHEMAVAR305_tree=null;
        RewriteRuleTokenStream stream_SCHEMAVAR=new RewriteRuleTokenStream(adaptor,"token SCHEMAVAR");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:517:13: ( IDENTIFIER ( arg_list )? -> ^( METHOD IDENTIFIER ( arg_list )? ) | SCHEMAVAR arg_list -> ^( METHOD SCHEMAVAR arg_list ) )
            int alt95=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt95=1;
                }
                break;
            case SCHEMAVAR:
                {
                alt95=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:518:7: IDENTIFIER ( arg_list )?
                    {
                    IDENTIFIER303=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_method_call2342);  
                    stream_IDENTIFIER.add(IDENTIFIER303);

                    // nl/cwi/cacoj/creol/Creol.g:518:18: ( arg_list )?
                    int alt94=2;
                    switch ( input.LA(1) ) {
                        case LPAREN:
                            {
                            alt94=1;
                            }
                            break;
                    }

                    switch (alt94) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:518:18: arg_list
                            {
                            pushFollow(FOLLOW_arg_list_in_method_call2344);
                            arg_list304=arg_list();

                            state._fsp--;

                            stream_arg_list.add(arg_list304.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: arg_list, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 518:28: -> ^( METHOD IDENTIFIER ( arg_list )? )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:518:31: ^( METHOD IDENTIFIER ( arg_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // nl/cwi/cacoj/creol/Creol.g:518:51: ( arg_list )?
                        if ( stream_arg_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_arg_list.nextTree());

                        }
                        stream_arg_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:519:5: SCHEMAVAR arg_list
                    {
                    SCHEMAVAR305=(Token)match(input,SCHEMAVAR,FOLLOW_SCHEMAVAR_in_method_call2362);  
                    stream_SCHEMAVAR.add(SCHEMAVAR305);

                    pushFollow(FOLLOW_arg_list_in_method_call2364);
                    arg_list306=arg_list();

                    state._fsp--;

                    stream_arg_list.add(arg_list306.getTree());


                    // AST REWRITE
                    // elements: arg_list, SCHEMAVAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 519:24: -> ^( METHOD SCHEMAVAR arg_list )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:519:27: ^( METHOD SCHEMAVAR arg_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);

                        adaptor.addChild(root_1, stream_SCHEMAVAR.nextNode());
                        adaptor.addChild(root_1, stream_arg_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_call"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // nl/cwi/cacoj/creol/Creol.g:522:1: atom : ( TRUE | FALSE | INTEGER | FLOAT | STRING | IDENTIFIER | THIS | CALLER | NULL | NIL | NOW | HISTORY | LBRACK ( expr_list )? RBRACK -> ^( LIST ( expr_list )? ) | LBRACES expr_in_braces RBRACES -> ^( SET_OR_BINDING expr_in_braces ) | LPAREN ( expr_in_paren )? RPAREN -> ^( PAREN ( expr_in_paren )? ) | SCHEMAVAR );
    public final CreolParser.atom_return atom() throws RecognitionException {
        CreolParser.atom_return retval = new CreolParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRUE307=null;
        Token FALSE308=null;
        Token INTEGER309=null;
        Token FLOAT310=null;
        Token STRING311=null;
        Token IDENTIFIER312=null;
        Token THIS313=null;
        Token CALLER314=null;
        Token NULL315=null;
        Token NIL316=null;
        Token NOW317=null;
        Token HISTORY318=null;
        Token LBRACK319=null;
        Token RBRACK321=null;
        Token LBRACES322=null;
        Token RBRACES324=null;
        Token LPAREN325=null;
        Token RPAREN327=null;
        Token SCHEMAVAR328=null;
        CreolParser.expr_list_return expr_list320 = null;

        CreolParser.expr_in_braces_return expr_in_braces323 = null;

        CreolParser.expr_in_paren_return expr_in_paren326 = null;


        Object TRUE307_tree=null;
        Object FALSE308_tree=null;
        Object INTEGER309_tree=null;
        Object FLOAT310_tree=null;
        Object STRING311_tree=null;
        Object IDENTIFIER312_tree=null;
        Object THIS313_tree=null;
        Object CALLER314_tree=null;
        Object NULL315_tree=null;
        Object NIL316_tree=null;
        Object NOW317_tree=null;
        Object HISTORY318_tree=null;
        Object LBRACK319_tree=null;
        Object RBRACK321_tree=null;
        Object LBRACES322_tree=null;
        Object RBRACES324_tree=null;
        Object LPAREN325_tree=null;
        Object RPAREN327_tree=null;
        Object SCHEMAVAR328_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_RBRACES=new RewriteRuleTokenStream(adaptor,"token RBRACES");
        RewriteRuleTokenStream stream_LBRACES=new RewriteRuleTokenStream(adaptor,"token LBRACES");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr_in_braces=new RewriteRuleSubtreeStream(adaptor,"rule expr_in_braces");
        RewriteRuleSubtreeStream stream_expr_in_paren=new RewriteRuleSubtreeStream(adaptor,"rule expr_in_paren");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:522:6: ( TRUE | FALSE | INTEGER | FLOAT | STRING | IDENTIFIER | THIS | CALLER | NULL | NIL | NOW | HISTORY | LBRACK ( expr_list )? RBRACK -> ^( LIST ( expr_list )? ) | LBRACES expr_in_braces RBRACES -> ^( SET_OR_BINDING expr_in_braces ) | LPAREN ( expr_in_paren )? RPAREN -> ^( PAREN ( expr_in_paren )? ) | SCHEMAVAR )
            int alt98=16;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:522:8: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE307=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2385); 
                    TRUE307_tree = (Object)adaptor.create(TRUE307);
                    adaptor.addChild(root_0, TRUE307_tree);


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:523:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE308=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2390); 
                    FALSE308_tree = (Object)adaptor.create(FALSE308);
                    adaptor.addChild(root_0, FALSE308_tree);


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:524:4: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    INTEGER309=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom2395); 
                    INTEGER309_tree = (Object)adaptor.create(INTEGER309);
                    adaptor.addChild(root_0, INTEGER309_tree);


                    }
                    break;
                case 4 :
                    // nl/cwi/cacoj/creol/Creol.g:525:4: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT310=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom2400); 
                    FLOAT310_tree = (Object)adaptor.create(FLOAT310);
                    adaptor.addChild(root_0, FLOAT310_tree);


                    }
                    break;
                case 5 :
                    // nl/cwi/cacoj/creol/Creol.g:526:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING311=(Token)match(input,STRING,FOLLOW_STRING_in_atom2405); 
                    STRING311_tree = (Object)adaptor.create(STRING311);
                    adaptor.addChild(root_0, STRING311_tree);


                    }
                    break;
                case 6 :
                    // nl/cwi/cacoj/creol/Creol.g:527:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER312=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom2410); 
                    IDENTIFIER312_tree = (Object)adaptor.create(IDENTIFIER312);
                    adaptor.addChild(root_0, IDENTIFIER312_tree);


                    }
                    break;
                case 7 :
                    // nl/cwi/cacoj/creol/Creol.g:528:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS313=(Token)match(input,THIS,FOLLOW_THIS_in_atom2415); 
                    THIS313_tree = (Object)adaptor.create(THIS313);
                    adaptor.addChild(root_0, THIS313_tree);


                    }
                    break;
                case 8 :
                    // nl/cwi/cacoj/creol/Creol.g:529:4: CALLER
                    {
                    root_0 = (Object)adaptor.nil();

                    CALLER314=(Token)match(input,CALLER,FOLLOW_CALLER_in_atom2420); 
                    CALLER314_tree = (Object)adaptor.create(CALLER314);
                    adaptor.addChild(root_0, CALLER314_tree);


                    }
                    break;
                case 9 :
                    // nl/cwi/cacoj/creol/Creol.g:530:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL315=(Token)match(input,NULL,FOLLOW_NULL_in_atom2425); 
                    NULL315_tree = (Object)adaptor.create(NULL315);
                    adaptor.addChild(root_0, NULL315_tree);


                    }
                    break;
                case 10 :
                    // nl/cwi/cacoj/creol/Creol.g:531:4: NIL
                    {
                    root_0 = (Object)adaptor.nil();

                    NIL316=(Token)match(input,NIL,FOLLOW_NIL_in_atom2430); 
                    NIL316_tree = (Object)adaptor.create(NIL316);
                    adaptor.addChild(root_0, NIL316_tree);


                    }
                    break;
                case 11 :
                    // nl/cwi/cacoj/creol/Creol.g:532:4: NOW
                    {
                    root_0 = (Object)adaptor.nil();

                    NOW317=(Token)match(input,NOW,FOLLOW_NOW_in_atom2435); 
                    NOW317_tree = (Object)adaptor.create(NOW317);
                    adaptor.addChild(root_0, NOW317_tree);


                    }
                    break;
                case 12 :
                    // nl/cwi/cacoj/creol/Creol.g:533:4: HISTORY
                    {
                    root_0 = (Object)adaptor.nil();

                    HISTORY318=(Token)match(input,HISTORY,FOLLOW_HISTORY_in_atom2440); 
                    HISTORY318_tree = (Object)adaptor.create(HISTORY318);
                    adaptor.addChild(root_0, HISTORY318_tree);


                    }
                    break;
                case 13 :
                    // nl/cwi/cacoj/creol/Creol.g:534:4: LBRACK ( expr_list )? RBRACK
                    {
                    LBRACK319=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_atom2445);  
                    stream_LBRACK.add(LBRACK319);

                    // nl/cwi/cacoj/creol/Creol.g:534:11: ( expr_list )?
                    int alt96=2;
                    switch ( input.LA(1) ) {
                        case LPAREN:
                        case IDENTIFIER:
                        case NOT:
                        case MINUS:
                        case NUMBER_SIGN:
                        case STRING:
                        case SCHEMAVAR:
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
                        case LBRACK:
                        case LBRACES:
                            {
                            alt96=1;
                            }
                            break;
                    }

                    switch (alt96) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:534:11: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_atom2447);
                            expr_list320=expr_list();

                            state._fsp--;

                            stream_expr_list.add(expr_list320.getTree());

                            }
                            break;

                    }

                    RBRACK321=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_atom2450);  
                    stream_RBRACK.add(RBRACK321);



                    // AST REWRITE
                    // elements: expr_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 534:29: -> ^( LIST ( expr_list )? )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:534:32: ^( LIST ( expr_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        // nl/cwi/cacoj/creol/Creol.g:534:39: ( expr_list )?
                        if ( stream_expr_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr_list.nextTree());

                        }
                        stream_expr_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // nl/cwi/cacoj/creol/Creol.g:535:4: LBRACES expr_in_braces RBRACES
                    {
                    LBRACES322=(Token)match(input,LBRACES,FOLLOW_LBRACES_in_atom2464);  
                    stream_LBRACES.add(LBRACES322);

                    pushFollow(FOLLOW_expr_in_braces_in_atom2466);
                    expr_in_braces323=expr_in_braces();

                    state._fsp--;

                    stream_expr_in_braces.add(expr_in_braces323.getTree());
                    RBRACES324=(Token)match(input,RBRACES,FOLLOW_RBRACES_in_atom2468);  
                    stream_RBRACES.add(RBRACES324);



                    // AST REWRITE
                    // elements: expr_in_braces
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 535:35: -> ^( SET_OR_BINDING expr_in_braces )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:535:37: ^( SET_OR_BINDING expr_in_braces )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET_OR_BINDING, "SET_OR_BINDING"), root_1);

                        adaptor.addChild(root_1, stream_expr_in_braces.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // nl/cwi/cacoj/creol/Creol.g:536:4: LPAREN ( expr_in_paren )? RPAREN
                    {
                    LPAREN325=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom2480);  
                    stream_LPAREN.add(LPAREN325);

                    // nl/cwi/cacoj/creol/Creol.g:536:11: ( expr_in_paren )?
                    int alt97=2;
                    switch ( input.LA(1) ) {
                        case LPAREN:
                        case IDENTIFIER:
                        case NOT:
                        case MINUS:
                        case NUMBER_SIGN:
                        case STRING:
                        case SCHEMAVAR:
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
                        case LBRACK:
                        case LBRACES:
                        case FORALL:
                        case EXISTS:
                        case SOME:
                            {
                            alt97=1;
                            }
                            break;
                    }

                    switch (alt97) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:536:11: expr_in_paren
                            {
                            pushFollow(FOLLOW_expr_in_paren_in_atom2482);
                            expr_in_paren326=expr_in_paren();

                            state._fsp--;

                            stream_expr_in_paren.add(expr_in_paren326.getTree());

                            }
                            break;

                    }

                    RPAREN327=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom2485);  
                    stream_RPAREN.add(RPAREN327);



                    // AST REWRITE
                    // elements: expr_in_paren
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 536:72: -> ^( PAREN ( expr_in_paren )? )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:536:75: ^( PAREN ( expr_in_paren )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAREN, "PAREN"), root_1);

                        // nl/cwi/cacoj/creol/Creol.g:536:83: ( expr_in_paren )?
                        if ( stream_expr_in_paren.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr_in_paren.nextTree());

                        }
                        stream_expr_in_paren.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // nl/cwi/cacoj/creol/Creol.g:538:4: SCHEMAVAR
                    {
                    root_0 = (Object)adaptor.nil();

                    SCHEMAVAR328=(Token)match(input,SCHEMAVAR,FOLLOW_SCHEMAVAR_in_atom2502); 
                    SCHEMAVAR328_tree = (Object)adaptor.create(SCHEMAVAR328);
                    adaptor.addChild(root_0, SCHEMAVAR328_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class if_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_stmt"
    // nl/cwi/cacoj/creol/Creol.g:541:1: if_stmt : IF condition if_then ( if_else )? END ;
    public final CreolParser.if_stmt_return if_stmt() throws RecognitionException {
        CreolParser.if_stmt_return retval = new CreolParser.if_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF329=null;
        Token END333=null;
        CreolParser.condition_return condition330 = null;

        CreolParser.if_then_return if_then331 = null;

        CreolParser.if_else_return if_else332 = null;


        Object IF329_tree=null;
        Object END333_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:541:8: ( IF condition if_then ( if_else )? END )
            // nl/cwi/cacoj/creol/Creol.g:542:3: IF condition if_then ( if_else )? END
            {
            root_0 = (Object)adaptor.nil();

            IF329=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2514); 
            IF329_tree = (Object)adaptor.create(IF329);
            root_0 = (Object)adaptor.becomeRoot(IF329_tree, root_0);

            pushFollow(FOLLOW_condition_in_if_stmt2517);
            condition330=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition330.getTree());
            pushFollow(FOLLOW_if_then_in_if_stmt2519);
            if_then331=if_then();

            state._fsp--;

            adaptor.addChild(root_0, if_then331.getTree());
            // nl/cwi/cacoj/creol/Creol.g:542:25: ( if_else )?
            int alt99=2;
            switch ( input.LA(1) ) {
                case ELSE:
                    {
                    alt99=1;
                    }
                    break;
            }

            switch (alt99) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:542:25: if_else
                    {
                    pushFollow(FOLLOW_if_else_in_if_stmt2521);
                    if_else332=if_else();

                    state._fsp--;

                    adaptor.addChild(root_0, if_else332.getTree());

                    }
                    break;

            }

            END333=(Token)match(input,END,FOLLOW_END_in_if_stmt2524); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_stmt"

    public static class if_then_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_then"
    // nl/cwi/cacoj/creol/Creol.g:545:1: if_then : THEN statement ;
    public final CreolParser.if_then_return if_then() throws RecognitionException {
        CreolParser.if_then_return retval = new CreolParser.if_then_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THEN334=null;
        CreolParser.statement_return statement335 = null;


        Object THEN334_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:545:9: ( THEN statement )
            // nl/cwi/cacoj/creol/Creol.g:545:11: THEN statement
            {
            root_0 = (Object)adaptor.nil();

            THEN334=(Token)match(input,THEN,FOLLOW_THEN_in_if_then2536); 
            THEN334_tree = (Object)adaptor.create(THEN334);
            root_0 = (Object)adaptor.becomeRoot(THEN334_tree, root_0);

            pushFollow(FOLLOW_statement_in_if_then2539);
            statement335=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement335.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_then"

    public static class if_else_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_else"
    // nl/cwi/cacoj/creol/Creol.g:548:1: if_else : ELSE statement ;
    public final CreolParser.if_else_return if_else() throws RecognitionException {
        CreolParser.if_else_return retval = new CreolParser.if_else_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE336=null;
        CreolParser.statement_return statement337 = null;


        Object ELSE336_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:548:9: ( ELSE statement )
            // nl/cwi/cacoj/creol/Creol.g:548:11: ELSE statement
            {
            root_0 = (Object)adaptor.nil();

            ELSE336=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_else2549); 
            ELSE336_tree = (Object)adaptor.create(ELSE336);
            root_0 = (Object)adaptor.becomeRoot(ELSE336_tree, root_0);

            pushFollow(FOLLOW_statement_in_if_else2552);
            statement337=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement337.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_else"

    public static class trailer_rest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trailer_rest"
    // nl/cwi/cacoj/creol/Creol.g:551:1: trailer_rest : ( ( DOT ( IDENTIFIER | SCHEMAVAR ) arg_list ( as_type )? ) | bounds );
    public final CreolParser.trailer_rest_return trailer_rest() throws RecognitionException {
        CreolParser.trailer_rest_return retval = new CreolParser.trailer_rest_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT338=null;
        Token set339=null;
        CreolParser.arg_list_return arg_list340 = null;

        CreolParser.as_type_return as_type341 = null;

        CreolParser.bounds_return bounds342 = null;


        Object DOT338_tree=null;
        Object set339_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:551:14: ( ( DOT ( IDENTIFIER | SCHEMAVAR ) arg_list ( as_type )? ) | bounds )
            int alt101=2;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt101=1;
                }
                break;
            case BOUND_L:
            case BOUND_R:
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
                    // nl/cwi/cacoj/creol/Creol.g:551:16: ( DOT ( IDENTIFIER | SCHEMAVAR ) arg_list ( as_type )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // nl/cwi/cacoj/creol/Creol.g:551:16: ( DOT ( IDENTIFIER | SCHEMAVAR ) arg_list ( as_type )? )
                    // nl/cwi/cacoj/creol/Creol.g:551:17: DOT ( IDENTIFIER | SCHEMAVAR ) arg_list ( as_type )?
                    {
                    DOT338=(Token)match(input,DOT,FOLLOW_DOT_in_trailer_rest2563); 
                    DOT338_tree = (Object)adaptor.create(DOT338);
                    root_0 = (Object)adaptor.becomeRoot(DOT338_tree, root_0);

                    set339=(Token)input.LT(1);
                    if ( input.LA(1)==IDENTIFIER||input.LA(1)==SCHEMAVAR ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set339));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_arg_list_in_trailer_rest2574);
                    arg_list340=arg_list();

                    state._fsp--;

                    adaptor.addChild(root_0, arg_list340.getTree());
                    // nl/cwi/cacoj/creol/Creol.g:551:56: ( as_type )?
                    int alt100=2;
                    switch ( input.LA(1) ) {
                        case AS:
                            {
                            alt100=1;
                            }
                            break;
                    }

                    switch (alt100) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:551:57: as_type
                            {
                            pushFollow(FOLLOW_as_type_in_trailer_rest2577);
                            as_type341=as_type();

                            state._fsp--;

                            adaptor.addChild(root_0, as_type341.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:552:5: bounds
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bounds_in_trailer_rest2586);
                    bounds342=bounds();

                    state._fsp--;

                    adaptor.addChild(root_0, bounds342.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "trailer_rest"

    public static class arg_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg_list"
    // nl/cwi/cacoj/creol/Creol.g:555:1: arg_list : ( LPAREN ( expr_list )? ( arg_output_list )? RPAREN ) -> ^( PRM ( expr_list )? ( arg_output_list )? ) ;
    public final CreolParser.arg_list_return arg_list() throws RecognitionException {
        CreolParser.arg_list_return retval = new CreolParser.arg_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN343=null;
        Token RPAREN346=null;
        CreolParser.expr_list_return expr_list344 = null;

        CreolParser.arg_output_list_return arg_output_list345 = null;


        Object LPAREN343_tree=null;
        Object RPAREN346_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_arg_output_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_output_list");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:555:10: ( ( LPAREN ( expr_list )? ( arg_output_list )? RPAREN ) -> ^( PRM ( expr_list )? ( arg_output_list )? ) )
            // nl/cwi/cacoj/creol/Creol.g:555:12: ( LPAREN ( expr_list )? ( arg_output_list )? RPAREN )
            {
            // nl/cwi/cacoj/creol/Creol.g:555:12: ( LPAREN ( expr_list )? ( arg_output_list )? RPAREN )
            // nl/cwi/cacoj/creol/Creol.g:555:13: LPAREN ( expr_list )? ( arg_output_list )? RPAREN
            {
            LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arg_list2597);  
            stream_LPAREN.add(LPAREN343);

            // nl/cwi/cacoj/creol/Creol.g:555:20: ( expr_list )?
            int alt102=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                case IDENTIFIER:
                case NOT:
                case MINUS:
                case NUMBER_SIGN:
                case STRING:
                case SCHEMAVAR:
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
                case LBRACK:
                case LBRACES:
                    {
                    alt102=1;
                    }
                    break;
            }

            switch (alt102) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:555:21: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_arg_list2600);
                    expr_list344=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list344.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:555:33: ( arg_output_list )?
            int alt103=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt103=1;
                    }
                    break;
            }

            switch (alt103) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:555:33: arg_output_list
                    {
                    pushFollow(FOLLOW_arg_output_list_in_arg_list2604);
                    arg_output_list345=arg_output_list();

                    state._fsp--;

                    stream_arg_output_list.add(arg_output_list345.getTree());

                    }
                    break;

            }

            RPAREN346=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arg_list2607);  
            stream_RPAREN.add(RPAREN346);


            }



            // AST REWRITE
            // elements: expr_list, arg_output_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 555:58: -> ^( PRM ( expr_list )? ( arg_output_list )? )
            {
                // nl/cwi/cacoj/creol/Creol.g:555:61: ^( PRM ( expr_list )? ( arg_output_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRM, "PRM"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:555:67: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();
                // nl/cwi/cacoj/creol/Creol.g:555:78: ( arg_output_list )?
                if ( stream_arg_output_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_arg_output_list.nextTree());

                }
                stream_arg_output_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg_list"

    public static class arg_output_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg_output_list"
    // nl/cwi/cacoj/creol/Creol.g:558:1: arg_output_list : ( SEMICOLON ( lhs_list )? ) ;
    public final CreolParser.arg_output_list_return arg_output_list() throws RecognitionException {
        CreolParser.arg_output_list_return retval = new CreolParser.arg_output_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON347=null;
        CreolParser.lhs_list_return lhs_list348 = null;


        Object SEMICOLON347_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:559:2: ( ( SEMICOLON ( lhs_list )? ) )
            // nl/cwi/cacoj/creol/Creol.g:559:4: ( SEMICOLON ( lhs_list )? )
            {
            root_0 = (Object)adaptor.nil();

            // nl/cwi/cacoj/creol/Creol.g:559:4: ( SEMICOLON ( lhs_list )? )
            // nl/cwi/cacoj/creol/Creol.g:559:5: SEMICOLON ( lhs_list )?
            {
            SEMICOLON347=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arg_output_list2632); 
            SEMICOLON347_tree = (Object)adaptor.create(SEMICOLON347);
            root_0 = (Object)adaptor.becomeRoot(SEMICOLON347_tree, root_0);

            // nl/cwi/cacoj/creol/Creol.g:559:16: ( lhs_list )?
            int alt104=2;
            switch ( input.LA(1) ) {
                case IDENTIFIER:
                case SCHEMAVAR:
                case UNDERSCORE:
                    {
                    alt104=1;
                    }
                    break;
            }

            switch (alt104) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:559:16: lhs_list
                    {
                    pushFollow(FOLLOW_lhs_list_in_arg_output_list2635);
                    lhs_list348=lhs_list();

                    state._fsp--;

                    adaptor.addChild(root_0, lhs_list348.getTree());

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg_output_list"

    public static class bounds_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds"
    // nl/cwi/cacoj/creol/Creol.g:562:1: bounds : ( BOUND_L CLASS_IDENTIFIER ( BOUND_R CLASS_IDENTIFIER )? arg_list ( as_type )? -> ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? arg_list ( as_type )? ) | BOUND_R CLASS_IDENTIFIER ( BOUND_L CLASS_IDENTIFIER )? arg_list ( as_type )? -> ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? arg_list ( as_type )? ) );
    public final CreolParser.bounds_return bounds() throws RecognitionException {
        CreolParser.bounds_return retval = new CreolParser.bounds_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BOUND_L349=null;
        Token CLASS_IDENTIFIER350=null;
        Token BOUND_R351=null;
        Token CLASS_IDENTIFIER352=null;
        Token BOUND_R355=null;
        Token CLASS_IDENTIFIER356=null;
        Token BOUND_L357=null;
        Token CLASS_IDENTIFIER358=null;
        CreolParser.arg_list_return arg_list353 = null;

        CreolParser.as_type_return as_type354 = null;

        CreolParser.arg_list_return arg_list359 = null;

        CreolParser.as_type_return as_type360 = null;


        Object BOUND_L349_tree=null;
        Object CLASS_IDENTIFIER350_tree=null;
        Object BOUND_R351_tree=null;
        Object CLASS_IDENTIFIER352_tree=null;
        Object BOUND_R355_tree=null;
        Object CLASS_IDENTIFIER356_tree=null;
        Object BOUND_L357_tree=null;
        Object CLASS_IDENTIFIER358_tree=null;
        RewriteRuleTokenStream stream_BOUND_R=new RewriteRuleTokenStream(adaptor,"token BOUND_R");
        RewriteRuleTokenStream stream_CLASS_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token CLASS_IDENTIFIER");
        RewriteRuleTokenStream stream_BOUND_L=new RewriteRuleTokenStream(adaptor,"token BOUND_L");
        RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");
        RewriteRuleSubtreeStream stream_as_type=new RewriteRuleSubtreeStream(adaptor,"rule as_type");
        try {
            // nl/cwi/cacoj/creol/Creol.g:562:8: ( BOUND_L CLASS_IDENTIFIER ( BOUND_R CLASS_IDENTIFIER )? arg_list ( as_type )? -> ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? arg_list ( as_type )? ) | BOUND_R CLASS_IDENTIFIER ( BOUND_L CLASS_IDENTIFIER )? arg_list ( as_type )? -> ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? arg_list ( as_type )? ) )
            int alt109=2;
            switch ( input.LA(1) ) {
            case BOUND_L:
                {
                alt109=1;
                }
                break;
            case BOUND_R:
                {
                alt109=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:562:10: BOUND_L CLASS_IDENTIFIER ( BOUND_R CLASS_IDENTIFIER )? arg_list ( as_type )?
                    {
                    BOUND_L349=(Token)match(input,BOUND_L,FOLLOW_BOUND_L_in_bounds2647);  
                    stream_BOUND_L.add(BOUND_L349);

                    CLASS_IDENTIFIER350=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_bounds2649);  
                    stream_CLASS_IDENTIFIER.add(CLASS_IDENTIFIER350);

                    // nl/cwi/cacoj/creol/Creol.g:562:35: ( BOUND_R CLASS_IDENTIFIER )?
                    int alt105=2;
                    switch ( input.LA(1) ) {
                        case BOUND_R:
                            {
                            alt105=1;
                            }
                            break;
                    }

                    switch (alt105) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:562:36: BOUND_R CLASS_IDENTIFIER
                            {
                            BOUND_R351=(Token)match(input,BOUND_R,FOLLOW_BOUND_R_in_bounds2652);  
                            stream_BOUND_R.add(BOUND_R351);

                            CLASS_IDENTIFIER352=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_bounds2654);  
                            stream_CLASS_IDENTIFIER.add(CLASS_IDENTIFIER352);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arg_list_in_bounds2658);
                    arg_list353=arg_list();

                    state._fsp--;

                    stream_arg_list.add(arg_list353.getTree());
                    // nl/cwi/cacoj/creol/Creol.g:562:72: ( as_type )?
                    int alt106=2;
                    switch ( input.LA(1) ) {
                        case AS:
                            {
                            alt106=1;
                            }
                            break;
                    }

                    switch (alt106) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:562:73: as_type
                            {
                            pushFollow(FOLLOW_as_type_in_bounds2661);
                            as_type354=as_type();

                            state._fsp--;

                            stream_as_type.add(as_type354.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: arg_list, CLASS_IDENTIFIER, BOUND_R, BOUND_L, as_type, CLASS_IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 562:83: -> ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? arg_list ( as_type )? )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:562:86: ^( BOUND_L CLASS_IDENTIFIER ( ^( BOUND_R CLASS_IDENTIFIER ) )? arg_list ( as_type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BOUND_L.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_CLASS_IDENTIFIER.nextNode());
                        // nl/cwi/cacoj/creol/Creol.g:562:113: ( ^( BOUND_R CLASS_IDENTIFIER ) )?
                        if ( stream_CLASS_IDENTIFIER.hasNext()||stream_BOUND_R.hasNext() ) {
                            // nl/cwi/cacoj/creol/Creol.g:562:114: ^( BOUND_R CLASS_IDENTIFIER )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_BOUND_R.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_CLASS_IDENTIFIER.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_CLASS_IDENTIFIER.reset();
                        stream_BOUND_R.reset();
                        adaptor.addChild(root_1, stream_arg_list.nextTree());
                        // nl/cwi/cacoj/creol/Creol.g:562:153: ( as_type )?
                        if ( stream_as_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_as_type.nextTree());

                        }
                        stream_as_type.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:563:4: BOUND_R CLASS_IDENTIFIER ( BOUND_L CLASS_IDENTIFIER )? arg_list ( as_type )?
                    {
                    BOUND_R355=(Token)match(input,BOUND_R,FOLLOW_BOUND_R_in_bounds2691);  
                    stream_BOUND_R.add(BOUND_R355);

                    CLASS_IDENTIFIER356=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_bounds2693);  
                    stream_CLASS_IDENTIFIER.add(CLASS_IDENTIFIER356);

                    // nl/cwi/cacoj/creol/Creol.g:563:29: ( BOUND_L CLASS_IDENTIFIER )?
                    int alt107=2;
                    switch ( input.LA(1) ) {
                        case BOUND_L:
                            {
                            alt107=1;
                            }
                            break;
                    }

                    switch (alt107) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:563:30: BOUND_L CLASS_IDENTIFIER
                            {
                            BOUND_L357=(Token)match(input,BOUND_L,FOLLOW_BOUND_L_in_bounds2696);  
                            stream_BOUND_L.add(BOUND_L357);

                            CLASS_IDENTIFIER358=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_bounds2698);  
                            stream_CLASS_IDENTIFIER.add(CLASS_IDENTIFIER358);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arg_list_in_bounds2702);
                    arg_list359=arg_list();

                    state._fsp--;

                    stream_arg_list.add(arg_list359.getTree());
                    // nl/cwi/cacoj/creol/Creol.g:563:66: ( as_type )?
                    int alt108=2;
                    switch ( input.LA(1) ) {
                        case AS:
                            {
                            alt108=1;
                            }
                            break;
                    }

                    switch (alt108) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:563:67: as_type
                            {
                            pushFollow(FOLLOW_as_type_in_bounds2705);
                            as_type360=as_type();

                            state._fsp--;

                            stream_as_type.add(as_type360.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: as_type, CLASS_IDENTIFIER, BOUND_L, arg_list, CLASS_IDENTIFIER, BOUND_R
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 563:77: -> ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? arg_list ( as_type )? )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:563:80: ^( BOUND_R CLASS_IDENTIFIER ( ^( BOUND_L CLASS_IDENTIFIER ) )? arg_list ( as_type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BOUND_R.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_CLASS_IDENTIFIER.nextNode());
                        // nl/cwi/cacoj/creol/Creol.g:563:107: ( ^( BOUND_L CLASS_IDENTIFIER ) )?
                        if ( stream_BOUND_L.hasNext()||stream_CLASS_IDENTIFIER.hasNext() ) {
                            // nl/cwi/cacoj/creol/Creol.g:563:108: ^( BOUND_L CLASS_IDENTIFIER )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_BOUND_L.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_CLASS_IDENTIFIER.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_BOUND_L.reset();
                        stream_CLASS_IDENTIFIER.reset();
                        adaptor.addChild(root_1, stream_arg_list.nextTree());
                        // nl/cwi/cacoj/creol/Creol.g:563:147: ( as_type )?
                        if ( stream_as_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_as_type.nextTree());

                        }
                        stream_as_type.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bounds"

    public static class lhs_list_paren_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lhs_list_paren"
    // nl/cwi/cacoj/creol/Creol.g:567:1: lhs_list_paren : LPAREN ( lhs_list )? RPAREN -> ^( PRM ( lhs_list )? ) ;
    public final CreolParser.lhs_list_paren_return lhs_list_paren() throws RecognitionException {
        CreolParser.lhs_list_paren_return retval = new CreolParser.lhs_list_paren_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN361=null;
        Token RPAREN363=null;
        CreolParser.lhs_list_return lhs_list362 = null;


        Object LPAREN361_tree=null;
        Object RPAREN363_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_lhs_list=new RewriteRuleSubtreeStream(adaptor,"rule lhs_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:567:16: ( LPAREN ( lhs_list )? RPAREN -> ^( PRM ( lhs_list )? ) )
            // nl/cwi/cacoj/creol/Creol.g:567:18: LPAREN ( lhs_list )? RPAREN
            {
            LPAREN361=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lhs_list_paren2742);  
            stream_LPAREN.add(LPAREN361);

            // nl/cwi/cacoj/creol/Creol.g:567:25: ( lhs_list )?
            int alt110=2;
            switch ( input.LA(1) ) {
                case IDENTIFIER:
                case SCHEMAVAR:
                case UNDERSCORE:
                    {
                    alt110=1;
                    }
                    break;
            }

            switch (alt110) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:567:25: lhs_list
                    {
                    pushFollow(FOLLOW_lhs_list_in_lhs_list_paren2744);
                    lhs_list362=lhs_list();

                    state._fsp--;

                    stream_lhs_list.add(lhs_list362.getTree());

                    }
                    break;

            }

            RPAREN363=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lhs_list_paren2747);  
            stream_RPAREN.add(RPAREN363);



            // AST REWRITE
            // elements: lhs_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 567:42: -> ^( PRM ( lhs_list )? )
            {
                // nl/cwi/cacoj/creol/Creol.g:567:45: ^( PRM ( lhs_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRM, "PRM"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:567:51: ( lhs_list )?
                if ( stream_lhs_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_list.nextTree());

                }
                stream_lhs_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs_list_paren"

    public static class lhs_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lhs_list"
    // nl/cwi/cacoj/creol/Creol.g:570:1: lhs_list : lhs ( KOMMA lhs )* -> ( lhs )+ ;
    public final CreolParser.lhs_list_return lhs_list() throws RecognitionException {
        CreolParser.lhs_list_return retval = new CreolParser.lhs_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA365=null;
        CreolParser.lhs_return lhs364 = null;

        CreolParser.lhs_return lhs366 = null;


        Object KOMMA365_tree=null;
        RewriteRuleTokenStream stream_KOMMA=new RewriteRuleTokenStream(adaptor,"token KOMMA");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // nl/cwi/cacoj/creol/Creol.g:570:9: ( lhs ( KOMMA lhs )* -> ( lhs )+ )
            // nl/cwi/cacoj/creol/Creol.g:570:12: lhs ( KOMMA lhs )*
            {
            pushFollow(FOLLOW_lhs_in_lhs_list2766);
            lhs364=lhs();

            state._fsp--;

            stream_lhs.add(lhs364.getTree());
            // nl/cwi/cacoj/creol/Creol.g:570:16: ( KOMMA lhs )*
            loop111:
            do {
                int alt111=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt111=1;
                    }
                    break;

                }

                switch (alt111) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:570:17: KOMMA lhs
            	    {
            	    KOMMA365=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_lhs_list2769);  
            	    stream_KOMMA.add(KOMMA365);

            	    pushFollow(FOLLOW_lhs_in_lhs_list2771);
            	    lhs366=lhs();

            	    state._fsp--;

            	    stream_lhs.add(lhs366.getTree());

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);



            // AST REWRITE
            // elements: lhs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 570:29: -> ( lhs )+
            {
                if ( !(stream_lhs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_lhs.hasNext() ) {
                    adaptor.addChild(root_0, stream_lhs.nextTree());

                }
                stream_lhs.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs_list"

    public static class lhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lhs"
    // nl/cwi/cacoj/creol/Creol.g:573:1: lhs : ( IDENTIFIER ( AT type )? | UNDERSCORE as_type | SCHEMAVAR );
    public final CreolParser.lhs_return lhs() throws RecognitionException {
        CreolParser.lhs_return retval = new CreolParser.lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER367=null;
        Token AT368=null;
        Token UNDERSCORE370=null;
        Token SCHEMAVAR372=null;
        CreolParser.type_return type369 = null;

        CreolParser.as_type_return as_type371 = null;


        Object IDENTIFIER367_tree=null;
        Object AT368_tree=null;
        Object UNDERSCORE370_tree=null;
        Object SCHEMAVAR372_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:573:5: ( IDENTIFIER ( AT type )? | UNDERSCORE as_type | SCHEMAVAR )
            int alt113=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt113=1;
                }
                break;
            case UNDERSCORE:
                {
                alt113=2;
                }
                break;
            case SCHEMAVAR:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:573:7: IDENTIFIER ( AT type )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER367=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lhs2788); 
                    IDENTIFIER367_tree = (Object)adaptor.create(IDENTIFIER367);
                    adaptor.addChild(root_0, IDENTIFIER367_tree);

                    // nl/cwi/cacoj/creol/Creol.g:573:18: ( AT type )?
                    int alt112=2;
                    switch ( input.LA(1) ) {
                        case AT:
                            {
                            alt112=1;
                            }
                            break;
                    }

                    switch (alt112) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:573:19: AT type
                            {
                            AT368=(Token)match(input,AT,FOLLOW_AT_in_lhs2791); 
                            AT368_tree = (Object)adaptor.create(AT368);
                            root_0 = (Object)adaptor.becomeRoot(AT368_tree, root_0);

                            pushFollow(FOLLOW_type_in_lhs2794);
                            type369=type();

                            state._fsp--;

                            adaptor.addChild(root_0, type369.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:574:4: UNDERSCORE as_type
                    {
                    root_0 = (Object)adaptor.nil();

                    UNDERSCORE370=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_lhs2801); 
                    UNDERSCORE370_tree = (Object)adaptor.create(UNDERSCORE370);
                    root_0 = (Object)adaptor.becomeRoot(UNDERSCORE370_tree, root_0);

                    pushFollow(FOLLOW_as_type_in_lhs2804);
                    as_type371=as_type();

                    state._fsp--;

                    adaptor.addChild(root_0, as_type371.getTree());

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:575:4: SCHEMAVAR
                    {
                    root_0 = (Object)adaptor.nil();

                    SCHEMAVAR372=(Token)match(input,SCHEMAVAR,FOLLOW_SCHEMAVAR_in_lhs2809); 
                    SCHEMAVAR372_tree = (Object)adaptor.create(SCHEMAVAR372);
                    adaptor.addChild(root_0, SCHEMAVAR372_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs"

    public static class as_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "as_type"
    // nl/cwi/cacoj/creol/Creol.g:578:1: as_type : AS type ;
    public final CreolParser.as_type_return as_type() throws RecognitionException {
        CreolParser.as_type_return retval = new CreolParser.as_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AS373=null;
        CreolParser.type_return type374 = null;


        Object AS373_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:578:9: ( AS type )
            // nl/cwi/cacoj/creol/Creol.g:578:11: AS type
            {
            root_0 = (Object)adaptor.nil();

            AS373=(Token)match(input,AS,FOLLOW_AS_in_as_type2819); 
            AS373_tree = (Object)adaptor.create(AS373);
            root_0 = (Object)adaptor.becomeRoot(AS373_tree, root_0);

            pushFollow(FOLLOW_type_in_as_type2822);
            type374=type();

            state._fsp--;

            adaptor.addChild(root_0, type374.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "as_type"

    public static class expr_in_paren_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_in_paren"
    // nl/cwi/cacoj/creol/Creol.g:581:1: expr_in_paren : ( expr_list | ( FORALL | EXISTS | SOME ) var_decl_no_init COLON expr_in_paren_expr );
    public final CreolParser.expr_in_paren_return expr_in_paren() throws RecognitionException {
        CreolParser.expr_in_paren_return retval = new CreolParser.expr_in_paren_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set376=null;
        Token COLON378=null;
        CreolParser.expr_list_return expr_list375 = null;

        CreolParser.var_decl_no_init_return var_decl_no_init377 = null;

        CreolParser.expr_in_paren_expr_return expr_in_paren_expr379 = null;


        Object set376_tree=null;
        Object COLON378_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:581:15: ( expr_list | ( FORALL | EXISTS | SOME ) var_decl_no_init COLON expr_in_paren_expr )
            int alt114=2;
            switch ( input.LA(1) ) {
            case LPAREN:
            case IDENTIFIER:
            case NOT:
            case MINUS:
            case NUMBER_SIGN:
            case STRING:
            case SCHEMAVAR:
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
            case LBRACK:
            case LBRACES:
                {
                alt114=1;
                }
                break;
            case FORALL:
            case EXISTS:
            case SOME:
                {
                alt114=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:581:18: expr_list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_list_in_expr_in_paren2833);
                    expr_list375=expr_list();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_list375.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:582:4: ( FORALL | EXISTS | SOME ) var_decl_no_init COLON expr_in_paren_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    set376=(Token)input.LT(1);
                    set376=(Token)input.LT(1);
                    if ( (input.LA(1)>=FORALL && input.LA(1)<=SOME) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set376), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_var_decl_no_init_in_expr_in_paren2847);
                    var_decl_no_init377=var_decl_no_init();

                    state._fsp--;

                    adaptor.addChild(root_0, var_decl_no_init377.getTree());
                    COLON378=(Token)match(input,COLON,FOLLOW_COLON_in_expr_in_paren2849); 
                    pushFollow(FOLLOW_expr_in_paren_expr_in_expr_in_paren2852);
                    expr_in_paren_expr379=expr_in_paren_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_in_paren_expr379.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_in_paren"

    public static class expr_in_paren_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_in_paren_expr"
    // nl/cwi/cacoj/creol/Creol.g:585:1: expr_in_paren_expr : expr -> ^( EXPR expr ) ;
    public final CreolParser.expr_in_paren_expr_return expr_in_paren_expr() throws RecognitionException {
        CreolParser.expr_in_paren_expr_return retval = new CreolParser.expr_in_paren_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.expr_return expr380 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // nl/cwi/cacoj/creol/Creol.g:586:2: ( expr -> ^( EXPR expr ) )
            // nl/cwi/cacoj/creol/Creol.g:586:4: expr
            {
            pushFollow(FOLLOW_expr_in_expr_in_paren_expr2863);
            expr380=expr();

            state._fsp--;

            stream_expr.add(expr380.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 586:9: -> ^( EXPR expr )
            {
                // nl/cwi/cacoj/creol/Creol.g:586:12: ^( EXPR expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_in_paren_expr"

    public static class expr_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_list"
    // nl/cwi/cacoj/creol/Creol.g:589:1: expr_list : ( expr ( KOMMA expr )* ) ;
    public final CreolParser.expr_list_return expr_list() throws RecognitionException {
        CreolParser.expr_list_return retval = new CreolParser.expr_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA382=null;
        CreolParser.expr_return expr381 = null;

        CreolParser.expr_return expr383 = null;


        Object KOMMA382_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:589:11: ( ( expr ( KOMMA expr )* ) )
            // nl/cwi/cacoj/creol/Creol.g:589:13: ( expr ( KOMMA expr )* )
            {
            root_0 = (Object)adaptor.nil();

            // nl/cwi/cacoj/creol/Creol.g:589:13: ( expr ( KOMMA expr )* )
            // nl/cwi/cacoj/creol/Creol.g:589:14: expr ( KOMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_expr_list2882);
            expr381=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr381.getTree());
            // nl/cwi/cacoj/creol/Creol.g:589:19: ( KOMMA expr )*
            loop115:
            do {
                int alt115=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt115=1;
                    }
                    break;

                }

                switch (alt115) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:589:20: KOMMA expr
            	    {
            	    KOMMA382=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_expr_list2885); 
            	    KOMMA382_tree = (Object)adaptor.create(KOMMA382);
            	    root_0 = (Object)adaptor.becomeRoot(KOMMA382_tree, root_0);

            	    pushFollow(FOLLOW_expr_in_expr_list2888);
            	    expr383=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr383.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    public static class expr_in_braces_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_in_braces"
    // nl/cwi/cacoj/creol/Creol.g:592:1: expr_in_braces : ( -> ^( SET ) | setmaker -> ^( SET setmaker ) | VERTICAL binding_list VERTICAL -> ^( BINDING binding_list ) );
    public final CreolParser.expr_in_braces_return expr_in_braces() throws RecognitionException {
        CreolParser.expr_in_braces_return retval = new CreolParser.expr_in_braces_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VERTICAL385=null;
        Token VERTICAL387=null;
        CreolParser.setmaker_return setmaker384 = null;

        CreolParser.binding_list_return binding_list386 = null;


        Object VERTICAL385_tree=null;
        Object VERTICAL387_tree=null;
        RewriteRuleTokenStream stream_VERTICAL=new RewriteRuleTokenStream(adaptor,"token VERTICAL");
        RewriteRuleSubtreeStream stream_binding_list=new RewriteRuleSubtreeStream(adaptor,"rule binding_list");
        RewriteRuleSubtreeStream stream_setmaker=new RewriteRuleSubtreeStream(adaptor,"rule setmaker");
        try {
            // nl/cwi/cacoj/creol/Creol.g:592:16: ( -> ^( SET ) | setmaker -> ^( SET setmaker ) | VERTICAL binding_list VERTICAL -> ^( BINDING binding_list ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case RBRACES:
                {
                alt116=1;
                }
                break;
            case LPAREN:
            case IDENTIFIER:
            case NOT:
            case MINUS:
            case NUMBER_SIGN:
            case STRING:
            case SCHEMAVAR:
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
            case LBRACK:
            case LBRACES:
                {
                alt116=2;
                }
                break;
            case VERTICAL:
                {
                alt116=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:592:18: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 592:18: -> ^( SET )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:592:21: ^( SET )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:593:4: setmaker
                    {
                    pushFollow(FOLLOW_setmaker_in_expr_in_braces2911);
                    setmaker384=setmaker();

                    state._fsp--;

                    stream_setmaker.add(setmaker384.getTree());


                    // AST REWRITE
                    // elements: setmaker
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 593:13: -> ^( SET setmaker )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:593:16: ^( SET setmaker )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                        adaptor.addChild(root_1, stream_setmaker.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:594:4: VERTICAL binding_list VERTICAL
                    {
                    VERTICAL385=(Token)match(input,VERTICAL,FOLLOW_VERTICAL_in_expr_in_braces2924);  
                    stream_VERTICAL.add(VERTICAL385);

                    pushFollow(FOLLOW_binding_list_in_expr_in_braces2926);
                    binding_list386=binding_list();

                    state._fsp--;

                    stream_binding_list.add(binding_list386.getTree());
                    VERTICAL387=(Token)match(input,VERTICAL,FOLLOW_VERTICAL_in_expr_in_braces2928);  
                    stream_VERTICAL.add(VERTICAL387);



                    // AST REWRITE
                    // elements: binding_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 594:35: -> ^( BINDING binding_list )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:594:38: ^( BINDING binding_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINDING, "BINDING"), root_1);

                        adaptor.addChild(root_1, stream_binding_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_in_braces"

    public static class setmaker_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setmaker"
    // nl/cwi/cacoj/creol/Creol.g:597:1: setmaker : expr ( ( ( KOMMA expr )* ) | ( COLON expr VERTICAL expr ) ) ;
    public final CreolParser.setmaker_return setmaker() throws RecognitionException {
        CreolParser.setmaker_return retval = new CreolParser.setmaker_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA389=null;
        Token COLON391=null;
        Token VERTICAL393=null;
        CreolParser.expr_return expr388 = null;

        CreolParser.expr_return expr390 = null;

        CreolParser.expr_return expr392 = null;

        CreolParser.expr_return expr394 = null;


        Object KOMMA389_tree=null;
        Object COLON391_tree=null;
        Object VERTICAL393_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:597:10: ( expr ( ( ( KOMMA expr )* ) | ( COLON expr VERTICAL expr ) ) )
            // nl/cwi/cacoj/creol/Creol.g:597:12: expr ( ( ( KOMMA expr )* ) | ( COLON expr VERTICAL expr ) )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_setmaker2946);
            expr388=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr388.getTree());
            // nl/cwi/cacoj/creol/Creol.g:597:17: ( ( ( KOMMA expr )* ) | ( COLON expr VERTICAL expr ) )
            int alt118=2;
            switch ( input.LA(1) ) {
            case KOMMA:
            case RBRACES:
                {
                alt118=1;
                }
                break;
            case COLON:
                {
                alt118=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:597:18: ( ( KOMMA expr )* )
                    {
                    // nl/cwi/cacoj/creol/Creol.g:597:18: ( ( KOMMA expr )* )
                    // nl/cwi/cacoj/creol/Creol.g:597:19: ( KOMMA expr )*
                    {
                    // nl/cwi/cacoj/creol/Creol.g:597:19: ( KOMMA expr )*
                    loop117:
                    do {
                        int alt117=2;
                        switch ( input.LA(1) ) {
                        case KOMMA:
                            {
                            alt117=1;
                            }
                            break;

                        }

                        switch (alt117) {
                    	case 1 :
                    	    // nl/cwi/cacoj/creol/Creol.g:597:20: KOMMA expr
                    	    {
                    	    KOMMA389=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_setmaker2951); 
                    	    KOMMA389_tree = (Object)adaptor.create(KOMMA389);
                    	    root_0 = (Object)adaptor.becomeRoot(KOMMA389_tree, root_0);

                    	    pushFollow(FOLLOW_expr_in_setmaker2954);
                    	    expr390=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr390.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:597:35: ( COLON expr VERTICAL expr )
                    {
                    // nl/cwi/cacoj/creol/Creol.g:597:35: ( COLON expr VERTICAL expr )
                    // nl/cwi/cacoj/creol/Creol.g:597:36: COLON expr VERTICAL expr
                    {
                    COLON391=(Token)match(input,COLON,FOLLOW_COLON_in_setmaker2960); 
                    COLON391_tree = (Object)adaptor.create(COLON391);
                    root_0 = (Object)adaptor.becomeRoot(COLON391_tree, root_0);

                    pushFollow(FOLLOW_expr_in_setmaker2963);
                    expr392=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr392.getTree());
                    VERTICAL393=(Token)match(input,VERTICAL,FOLLOW_VERTICAL_in_setmaker2965); 
                    VERTICAL393_tree = (Object)adaptor.create(VERTICAL393);
                    root_0 = (Object)adaptor.becomeRoot(VERTICAL393_tree, root_0);

                    pushFollow(FOLLOW_expr_in_setmaker2968);
                    expr394=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr394.getTree());

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setmaker"

    public static class binding_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding_list"
    // nl/cwi/cacoj/creol/Creol.g:600:1: binding_list : binding ( KOMMA binding )* ;
    public final CreolParser.binding_list_return binding_list() throws RecognitionException {
        CreolParser.binding_list_return retval = new CreolParser.binding_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA396=null;
        CreolParser.binding_return binding395 = null;

        CreolParser.binding_return binding397 = null;


        Object KOMMA396_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:600:14: ( binding ( KOMMA binding )* )
            // nl/cwi/cacoj/creol/Creol.g:600:16: binding ( KOMMA binding )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_binding_in_binding_list2981);
            binding395=binding();

            state._fsp--;

            adaptor.addChild(root_0, binding395.getTree());
            // nl/cwi/cacoj/creol/Creol.g:600:24: ( KOMMA binding )*
            loop119:
            do {
                int alt119=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt119=1;
                    }
                    break;

                }

                switch (alt119) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:600:25: KOMMA binding
            	    {
            	    KOMMA396=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_binding_list2984); 
            	    KOMMA396_tree = (Object)adaptor.create(KOMMA396);
            	    root_0 = (Object)adaptor.becomeRoot(KOMMA396_tree, root_0);

            	    pushFollow(FOLLOW_binding_in_binding_list2987);
            	    binding397=binding();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding397.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding_list"

    public static class binding_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding"
    // nl/cwi/cacoj/creol/Creol.g:603:1: binding : expr MAPSTO expr ;
    public final CreolParser.binding_return binding() throws RecognitionException {
        CreolParser.binding_return retval = new CreolParser.binding_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MAPSTO399=null;
        CreolParser.expr_return expr398 = null;

        CreolParser.expr_return expr400 = null;


        Object MAPSTO399_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:603:9: ( expr MAPSTO expr )
            // nl/cwi/cacoj/creol/Creol.g:603:11: expr MAPSTO expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_binding2999);
            expr398=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr398.getTree());
            MAPSTO399=(Token)match(input,MAPSTO,FOLLOW_MAPSTO_in_binding3001); 
            MAPSTO399_tree = (Object)adaptor.create(MAPSTO399);
            root_0 = (Object)adaptor.becomeRoot(MAPSTO399_tree, root_0);

            pushFollow(FOLLOW_expr_in_binding3004);
            expr400=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr400.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // nl/cwi/cacoj/creol/Creol.g:606:1: type : type_real -> ^( TYPE type_real ) ;
    public final CreolParser.type_return type() throws RecognitionException {
        CreolParser.type_return retval = new CreolParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.type_real_return type_real401 = null;


        RewriteRuleSubtreeStream stream_type_real=new RewriteRuleSubtreeStream(adaptor,"rule type_real");
        try {
            // nl/cwi/cacoj/creol/Creol.g:606:6: ( type_real -> ^( TYPE type_real ) )
            // nl/cwi/cacoj/creol/Creol.g:606:8: type_real
            {
            pushFollow(FOLLOW_type_real_in_type3014);
            type_real401=type_real();

            state._fsp--;

            stream_type_real.add(type_real401.getTree());


            // AST REWRITE
            // elements: type_real
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 607:2: -> ^( TYPE type_real )
            {
                // nl/cwi/cacoj/creol/Creol.g:608:2: ^( TYPE type_real )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                adaptor.addChild(root_1, stream_type_real.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class type_real_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_real"
    // nl/cwi/cacoj/creol/Creol.g:611:1: type_real : ( CLASS_IDENTIFIER ( type_list_brackets )? | type_bracket | APOSTROPHE IDENTIFIER -> ^( TYPEVAR IDENTIFIER ) );
    public final CreolParser.type_real_return type_real() throws RecognitionException {
        CreolParser.type_real_return retval = new CreolParser.type_real_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLASS_IDENTIFIER402=null;
        Token APOSTROPHE405=null;
        Token IDENTIFIER406=null;
        CreolParser.type_list_brackets_return type_list_brackets403 = null;

        CreolParser.type_bracket_return type_bracket404 = null;


        Object CLASS_IDENTIFIER402_tree=null;
        Object APOSTROPHE405_tree=null;
        Object IDENTIFIER406_tree=null;
        RewriteRuleTokenStream stream_APOSTROPHE=new RewriteRuleTokenStream(adaptor,"token APOSTROPHE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // nl/cwi/cacoj/creol/Creol.g:611:11: ( CLASS_IDENTIFIER ( type_list_brackets )? | type_bracket | APOSTROPHE IDENTIFIER -> ^( TYPEVAR IDENTIFIER ) )
            int alt121=3;
            switch ( input.LA(1) ) {
            case CLASS_IDENTIFIER:
                {
                alt121=1;
                }
                break;
            case LBRACK:
                {
                alt121=2;
                }
                break;
            case APOSTROPHE:
                {
                alt121=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:611:13: CLASS_IDENTIFIER ( type_list_brackets )?
                    {
                    root_0 = (Object)adaptor.nil();

                    CLASS_IDENTIFIER402=(Token)match(input,CLASS_IDENTIFIER,FOLLOW_CLASS_IDENTIFIER_in_type_real3034); 
                    CLASS_IDENTIFIER402_tree = (Object)adaptor.create(CLASS_IDENTIFIER402);
                    adaptor.addChild(root_0, CLASS_IDENTIFIER402_tree);

                    // nl/cwi/cacoj/creol/Creol.g:611:30: ( type_list_brackets )?
                    int alt120=2;
                    switch ( input.LA(1) ) {
                        case LBRACK:
                            {
                            alt120=1;
                            }
                            break;
                    }

                    switch (alt120) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:611:30: type_list_brackets
                            {
                            pushFollow(FOLLOW_type_list_brackets_in_type_real3036);
                            type_list_brackets403=type_list_brackets();

                            state._fsp--;

                            adaptor.addChild(root_0, type_list_brackets403.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:612:4: type_bracket
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_bracket_in_type_real3042);
                    type_bracket404=type_bracket();

                    state._fsp--;

                    adaptor.addChild(root_0, type_bracket404.getTree());

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:613:4: APOSTROPHE IDENTIFIER
                    {
                    APOSTROPHE405=(Token)match(input,APOSTROPHE,FOLLOW_APOSTROPHE_in_type_real3047);  
                    stream_APOSTROPHE.add(APOSTROPHE405);

                    IDENTIFIER406=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_real3049);  
                    stream_IDENTIFIER.add(IDENTIFIER406);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 613:26: -> ^( TYPEVAR IDENTIFIER )
                    {
                        // nl/cwi/cacoj/creol/Creol.g:613:29: ^( TYPEVAR IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEVAR, "TYPEVAR"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_real"

    public static class type_bracket_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_bracket"
    // nl/cwi/cacoj/creol/Creol.g:616:1: type_bracket : LBRACK type_list RBRACK -> ^( LIST type_list ) ;
    public final CreolParser.type_bracket_return type_bracket() throws RecognitionException {
        CreolParser.type_bracket_return retval = new CreolParser.type_bracket_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK407=null;
        Token RBRACK409=null;
        CreolParser.type_list_return type_list408 = null;


        Object LBRACK407_tree=null;
        Object RBRACK409_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_type_list=new RewriteRuleSubtreeStream(adaptor,"rule type_list");
        try {
            // nl/cwi/cacoj/creol/Creol.g:616:14: ( LBRACK type_list RBRACK -> ^( LIST type_list ) )
            // nl/cwi/cacoj/creol/Creol.g:616:16: LBRACK type_list RBRACK
            {
            LBRACK407=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_type_bracket3067);  
            stream_LBRACK.add(LBRACK407);

            pushFollow(FOLLOW_type_list_in_type_bracket3069);
            type_list408=type_list();

            state._fsp--;

            stream_type_list.add(type_list408.getTree());
            RBRACK409=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_type_bracket3071);  
            stream_RBRACK.add(RBRACK409);



            // AST REWRITE
            // elements: type_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 616:40: -> ^( LIST type_list )
            {
                // nl/cwi/cacoj/creol/Creol.g:616:43: ^( LIST type_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                adaptor.addChild(root_1, stream_type_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_bracket"

    public static class type_list_brackets_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_list_brackets"
    // nl/cwi/cacoj/creol/Creol.g:619:1: type_list_brackets : LBRACK ( type_list )? RBRACK ;
    public final CreolParser.type_list_brackets_return type_list_brackets() throws RecognitionException {
        CreolParser.type_list_brackets_return retval = new CreolParser.type_list_brackets_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK410=null;
        Token RBRACK412=null;
        CreolParser.type_list_return type_list411 = null;


        Object LBRACK410_tree=null;
        Object RBRACK412_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:620:2: ( LBRACK ( type_list )? RBRACK )
            // nl/cwi/cacoj/creol/Creol.g:620:4: LBRACK ( type_list )? RBRACK
            {
            root_0 = (Object)adaptor.nil();

            LBRACK410=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_type_list_brackets3090); 
            LBRACK410_tree = (Object)adaptor.create(LBRACK410);
            root_0 = (Object)adaptor.becomeRoot(LBRACK410_tree, root_0);

            // nl/cwi/cacoj/creol/Creol.g:620:12: ( type_list )?
            int alt122=2;
            switch ( input.LA(1) ) {
                case CLASS_IDENTIFIER:
                case LBRACK:
                case APOSTROPHE:
                    {
                    alt122=1;
                    }
                    break;
            }

            switch (alt122) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:620:12: type_list
                    {
                    pushFollow(FOLLOW_type_list_in_type_list_brackets3093);
                    type_list411=type_list();

                    state._fsp--;

                    adaptor.addChild(root_0, type_list411.getTree());

                    }
                    break;

            }

            RBRACK412=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_type_list_brackets3096); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_list_brackets"

    public static class type_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_list"
    // nl/cwi/cacoj/creol/Creol.g:623:1: type_list : ( type ( KOMMA type )* ) -> ( type )+ ;
    public final CreolParser.type_list_return type_list() throws RecognitionException {
        CreolParser.type_list_return retval = new CreolParser.type_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA414=null;
        CreolParser.type_return type413 = null;

        CreolParser.type_return type415 = null;


        Object KOMMA414_tree=null;
        RewriteRuleTokenStream stream_KOMMA=new RewriteRuleTokenStream(adaptor,"token KOMMA");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // nl/cwi/cacoj/creol/Creol.g:623:11: ( ( type ( KOMMA type )* ) -> ( type )+ )
            // nl/cwi/cacoj/creol/Creol.g:623:13: ( type ( KOMMA type )* )
            {
            // nl/cwi/cacoj/creol/Creol.g:623:13: ( type ( KOMMA type )* )
            // nl/cwi/cacoj/creol/Creol.g:623:14: type ( KOMMA type )*
            {
            pushFollow(FOLLOW_type_in_type_list3108);
            type413=type();

            state._fsp--;

            stream_type.add(type413.getTree());
            // nl/cwi/cacoj/creol/Creol.g:623:19: ( KOMMA type )*
            loop123:
            do {
                int alt123=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt123=1;
                    }
                    break;

                }

                switch (alt123) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:623:20: KOMMA type
            	    {
            	    KOMMA414=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_type_list3111);  
            	    stream_KOMMA.add(KOMMA414);

            	    pushFollow(FOLLOW_type_in_type_list3113);
            	    type415=type();

            	    state._fsp--;

            	    stream_type.add(type415.getTree());

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 623:34: -> ( type )+
            {
                if ( !(stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type.hasNext() ) {
                    adaptor.addChild(root_0, stream_type.nextTree());

                }
                stream_type.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_list"

    public static class j_import_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_import_decl"
    // nl/cwi/cacoj/creol/Creol.g:1088:1: j_import_decl : ( IMPORT j_import_expr ( SEMICOLON )? ) -> ^( IMP j_import_expr ) ;
    public final CreolParser.j_import_decl_return j_import_decl() throws RecognitionException {
        CreolParser.j_import_decl_return retval = new CreolParser.j_import_decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPORT416=null;
        Token SEMICOLON418=null;
        CreolParser.j_import_expr_return j_import_expr417 = null;


        Object IMPORT416_tree=null;
        Object SEMICOLON418_tree=null;
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_j_import_expr=new RewriteRuleSubtreeStream(adaptor,"rule j_import_expr");
        try {
            // nl/cwi/cacoj/creol/Creol.g:1088:14: ( ( IMPORT j_import_expr ( SEMICOLON )? ) -> ^( IMP j_import_expr ) )
            // nl/cwi/cacoj/creol/Creol.g:1089:3: ( IMPORT j_import_expr ( SEMICOLON )? )
            {
            // nl/cwi/cacoj/creol/Creol.g:1089:3: ( IMPORT j_import_expr ( SEMICOLON )? )
            // nl/cwi/cacoj/creol/Creol.g:1089:4: IMPORT j_import_expr ( SEMICOLON )?
            {
            IMPORT416=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_j_import_decl4834);  
            stream_IMPORT.add(IMPORT416);

            pushFollow(FOLLOW_j_import_expr_in_j_import_decl4836);
            j_import_expr417=j_import_expr();

            state._fsp--;

            stream_j_import_expr.add(j_import_expr417.getTree());
            // nl/cwi/cacoj/creol/Creol.g:1089:25: ( SEMICOLON )?
            int alt124=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt124=1;
                    }
                    break;
            }

            switch (alt124) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1089:25: SEMICOLON
                    {
                    SEMICOLON418=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_j_import_decl4838);  
                    stream_SEMICOLON.add(SEMICOLON418);


                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: j_import_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1089:37: -> ^( IMP j_import_expr )
            {
                // nl/cwi/cacoj/creol/Creol.g:1089:40: ^( IMP j_import_expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMP, "IMP"), root_1);

                adaptor.addChild(root_1, stream_j_import_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_import_decl"

    public static class j_import_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_import_expr"
    // nl/cwi/cacoj/creol/Creol.g:1091:1: j_import_expr : ( j_identifier ( DOT j_identifier )* ( SEMICOLON )? ) -> ^( ID ( j_identifier )* ) ;
    public final CreolParser.j_import_expr_return j_import_expr() throws RecognitionException {
        CreolParser.j_import_expr_return retval = new CreolParser.j_import_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT420=null;
        Token SEMICOLON422=null;
        CreolParser.j_identifier_return j_identifier419 = null;

        CreolParser.j_identifier_return j_identifier421 = null;


        Object DOT420_tree=null;
        Object SEMICOLON422_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_j_identifier=new RewriteRuleSubtreeStream(adaptor,"rule j_identifier");
        try {
            // nl/cwi/cacoj/creol/Creol.g:1091:14: ( ( j_identifier ( DOT j_identifier )* ( SEMICOLON )? ) -> ^( ID ( j_identifier )* ) )
            // nl/cwi/cacoj/creol/Creol.g:1092:3: ( j_identifier ( DOT j_identifier )* ( SEMICOLON )? )
            {
            // nl/cwi/cacoj/creol/Creol.g:1092:3: ( j_identifier ( DOT j_identifier )* ( SEMICOLON )? )
            // nl/cwi/cacoj/creol/Creol.g:1092:4: j_identifier ( DOT j_identifier )* ( SEMICOLON )?
            {
            pushFollow(FOLLOW_j_identifier_in_j_import_expr4860);
            j_identifier419=j_identifier();

            state._fsp--;

            stream_j_identifier.add(j_identifier419.getTree());
            // nl/cwi/cacoj/creol/Creol.g:1092:17: ( DOT j_identifier )*
            loop125:
            do {
                int alt125=2;
                switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt125=1;
                    }
                    break;

                }

                switch (alt125) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:1092:18: DOT j_identifier
            	    {
            	    DOT420=(Token)match(input,DOT,FOLLOW_DOT_in_j_import_expr4863);  
            	    stream_DOT.add(DOT420);

            	    pushFollow(FOLLOW_j_identifier_in_j_import_expr4865);
            	    j_identifier421=j_identifier();

            	    state._fsp--;

            	    stream_j_identifier.add(j_identifier421.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);

            // nl/cwi/cacoj/creol/Creol.g:1092:37: ( SEMICOLON )?
            int alt126=2;
            switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt126=1;
                    }
                    break;
            }

            switch (alt126) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1092:37: SEMICOLON
                    {
                    SEMICOLON422=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_j_import_expr4869);  
                    stream_SEMICOLON.add(SEMICOLON422);


                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: j_identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1092:49: -> ^( ID ( j_identifier )* )
            {
                // nl/cwi/cacoj/creol/Creol.g:1092:52: ^( ID ( j_identifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);

                // nl/cwi/cacoj/creol/Creol.g:1092:57: ( j_identifier )*
                while ( stream_j_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_j_identifier.nextTree());

                }
                stream_j_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_import_expr"

    public static class j_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_identifier"
    // nl/cwi/cacoj/creol/Creol.g:1094:1: j_identifier : ( IDENTIFIER | CLASS_IDENTIFIER );
    public final CreolParser.j_identifier_return j_identifier() throws RecognitionException {
        CreolParser.j_identifier_return retval = new CreolParser.j_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set423=null;

        Object set423_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:1094:13: ( IDENTIFIER | CLASS_IDENTIFIER )
            // nl/cwi/cacoj/creol/Creol.g:
            {
            root_0 = (Object)adaptor.nil();

            set423=(Token)input.LT(1);
            if ( input.LA(1)==CLASS_IDENTIFIER||input.LA(1)==IDENTIFIER ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set423));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_identifier"

    public static class j_parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_parExpression"
    // nl/cwi/cacoj/creol/Creol.g:1096:1: j_parExpression : LPAREN j_expression RPAREN ;
    public final CreolParser.j_parExpression_return j_parExpression() throws RecognitionException {
        CreolParser.j_parExpression_return retval = new CreolParser.j_parExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN424=null;
        Token RPAREN426=null;
        CreolParser.j_expression_return j_expression425 = null;


        Object LPAREN424_tree=null;
        Object RPAREN426_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:1097:5: ( LPAREN j_expression RPAREN )
            // nl/cwi/cacoj/creol/Creol.g:1097:9: LPAREN j_expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN424=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_j_parExpression4908); 
            LPAREN424_tree = (Object)adaptor.create(LPAREN424);
            adaptor.addChild(root_0, LPAREN424_tree);

            pushFollow(FOLLOW_j_expression_in_j_parExpression4910);
            j_expression425=j_expression();

            state._fsp--;

            adaptor.addChild(root_0, j_expression425.getTree());
            RPAREN426=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_j_parExpression4912); 
            RPAREN426_tree = (Object)adaptor.create(RPAREN426);
            adaptor.addChild(root_0, RPAREN426_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_parExpression"

    public static class j_expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_expressionList"
    // nl/cwi/cacoj/creol/Creol.g:1100:1: j_expressionList : ( expr | j_expression ) ( KOMMA ( expr | j_expression ) )* ;
    public final CreolParser.j_expressionList_return j_expressionList() throws RecognitionException {
        CreolParser.j_expressionList_return retval = new CreolParser.j_expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KOMMA429=null;
        CreolParser.expr_return expr427 = null;

        CreolParser.j_expression_return j_expression428 = null;

        CreolParser.expr_return expr430 = null;

        CreolParser.j_expression_return j_expression431 = null;


        Object KOMMA429_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:1101:5: ( ( expr | j_expression ) ( KOMMA ( expr | j_expression ) )* )
            // nl/cwi/cacoj/creol/Creol.g:1101:9: ( expr | j_expression ) ( KOMMA ( expr | j_expression ) )*
            {
            root_0 = (Object)adaptor.nil();

            // nl/cwi/cacoj/creol/Creol.g:1101:9: ( expr | j_expression )
            int alt127=2;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1101:10: expr
                    {
                    pushFollow(FOLLOW_expr_in_j_expressionList4933);
                    expr427=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr427.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:1101:17: j_expression
                    {
                    pushFollow(FOLLOW_j_expression_in_j_expressionList4937);
                    j_expression428=j_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, j_expression428.getTree());

                    }
                    break;

            }

            // nl/cwi/cacoj/creol/Creol.g:1102:9: ( KOMMA ( expr | j_expression ) )*
            loop129:
            do {
                int alt129=2;
                switch ( input.LA(1) ) {
                case KOMMA:
                    {
                    alt129=1;
                    }
                    break;

                }

                switch (alt129) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:1102:10: KOMMA ( expr | j_expression )
            	    {
            	    KOMMA429=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_j_expressionList4949); 
            	    KOMMA429_tree = (Object)adaptor.create(KOMMA429);
            	    adaptor.addChild(root_0, KOMMA429_tree);

            	    // nl/cwi/cacoj/creol/Creol.g:1102:16: ( expr | j_expression )
            	    int alt128=2;
            	    alt128 = dfa128.predict(input);
            	    switch (alt128) {
            	        case 1 :
            	            // nl/cwi/cacoj/creol/Creol.g:1102:17: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_j_expressionList4952);
            	            expr430=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr430.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // nl/cwi/cacoj/creol/Creol.g:1102:24: j_expression
            	            {
            	            pushFollow(FOLLOW_j_expression_in_j_expressionList4956);
            	            j_expression431=j_expression();

            	            state._fsp--;

            	            adaptor.addChild(root_0, j_expression431.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_expressionList"

    public static class j_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_expression"
    // nl/cwi/cacoj/creol/Creol.g:1105:1: j_expression : j_primary ;
    public final CreolParser.j_expression_return j_expression() throws RecognitionException {
        CreolParser.j_expression_return retval = new CreolParser.j_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.j_primary_return j_primary432 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:1106:5: ( j_primary )
            // nl/cwi/cacoj/creol/Creol.g:1106:9: j_primary
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_j_primary_in_j_expression4980);
            j_primary432=j_primary();

            state._fsp--;

            adaptor.addChild(root_0, j_primary432.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_expression"

    public static class j_primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_primary"
    // nl/cwi/cacoj/creol/Creol.g:1110:1: j_primary : ( j_parExpression | j_identifier ( DOT j_identifier )* ( j_identifierSuffix )? );
    public final CreolParser.j_primary_return j_primary() throws RecognitionException {
        CreolParser.j_primary_return retval = new CreolParser.j_primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT435=null;
        CreolParser.j_parExpression_return j_parExpression433 = null;

        CreolParser.j_identifier_return j_identifier434 = null;

        CreolParser.j_identifier_return j_identifier436 = null;

        CreolParser.j_identifierSuffix_return j_identifierSuffix437 = null;


        Object DOT435_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:1111:5: ( j_parExpression | j_identifier ( DOT j_identifier )* ( j_identifierSuffix )? )
            int alt132=2;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt132=1;
                }
                break;
            case CLASS_IDENTIFIER:
            case IDENTIFIER:
                {
                alt132=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1111:9: j_parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_j_parExpression_in_j_primary5002);
                    j_parExpression433=j_parExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, j_parExpression433.getTree());

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:1117:9: j_identifier ( DOT j_identifier )* ( j_identifierSuffix )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_j_identifier_in_j_primary5029);
                    j_identifier434=j_identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, j_identifier434.getTree());
                    // nl/cwi/cacoj/creol/Creol.g:1117:22: ( DOT j_identifier )*
                    loop130:
                    do {
                        int alt130=2;
                        switch ( input.LA(1) ) {
                        case DOT:
                            {
                            alt130=1;
                            }
                            break;

                        }

                        switch (alt130) {
                    	case 1 :
                    	    // nl/cwi/cacoj/creol/Creol.g:1117:23: DOT j_identifier
                    	    {
                    	    DOT435=(Token)match(input,DOT,FOLLOW_DOT_in_j_primary5032); 
                    	    DOT435_tree = (Object)adaptor.create(DOT435);
                    	    adaptor.addChild(root_0, DOT435_tree);

                    	    pushFollow(FOLLOW_j_identifier_in_j_primary5034);
                    	    j_identifier436=j_identifier();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, j_identifier436.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);

                    // nl/cwi/cacoj/creol/Creol.g:1117:42: ( j_identifierSuffix )?
                    int alt131=2;
                    switch ( input.LA(1) ) {
                        case LPAREN:
                            {
                            alt131=1;
                            }
                            break;
                    }

                    switch (alt131) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:1117:43: j_identifierSuffix
                            {
                            pushFollow(FOLLOW_j_identifierSuffix_in_j_primary5039);
                            j_identifierSuffix437=j_identifierSuffix();

                            state._fsp--;

                            adaptor.addChild(root_0, j_identifierSuffix437.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_primary"

    public static class j_identifierSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_identifierSuffix"
    // nl/cwi/cacoj/creol/Creol.g:1130:1: j_identifierSuffix : j_arguments ;
    public final CreolParser.j_identifierSuffix_return j_identifierSuffix() throws RecognitionException {
        CreolParser.j_identifierSuffix_return retval = new CreolParser.j_identifierSuffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CreolParser.j_arguments_return j_arguments438 = null;



        try {
            // nl/cwi/cacoj/creol/Creol.g:1131:5: ( j_arguments )
            // nl/cwi/cacoj/creol/Creol.g:1137:8: j_arguments
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_j_arguments_in_j_identifierSuffix5088);
            j_arguments438=j_arguments();

            state._fsp--;

            adaptor.addChild(root_0, j_arguments438.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_identifierSuffix"

    public static class j_arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "j_arguments"
    // nl/cwi/cacoj/creol/Creol.g:1145:1: j_arguments : LPAREN ( j_expressionList )? RPAREN ;
    public final CreolParser.j_arguments_return j_arguments() throws RecognitionException {
        CreolParser.j_arguments_return retval = new CreolParser.j_arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN439=null;
        Token RPAREN441=null;
        CreolParser.j_expressionList_return j_expressionList440 = null;


        Object LPAREN439_tree=null;
        Object RPAREN441_tree=null;

        try {
            // nl/cwi/cacoj/creol/Creol.g:1146:5: ( LPAREN ( j_expressionList )? RPAREN )
            // nl/cwi/cacoj/creol/Creol.g:1146:9: LPAREN ( j_expressionList )? RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN439=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_j_arguments5113); 
            LPAREN439_tree = (Object)adaptor.create(LPAREN439);
            adaptor.addChild(root_0, LPAREN439_tree);

            // nl/cwi/cacoj/creol/Creol.g:1146:16: ( j_expressionList )?
            int alt133=2;
            switch ( input.LA(1) ) {
                case CLASS_IDENTIFIER:
                case LPAREN:
                case IDENTIFIER:
                case NOT:
                case MINUS:
                case NUMBER_SIGN:
                case STRING:
                case SCHEMAVAR:
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
                case LBRACK:
                case LBRACES:
                    {
                    alt133=1;
                    }
                    break;
            }

            switch (alt133) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1146:17: j_expressionList
                    {
                    pushFollow(FOLLOW_j_expressionList_in_j_arguments5116);
                    j_expressionList440=j_expressionList();

                    state._fsp--;

                    adaptor.addChild(root_0, j_expressionList440.getTree());

                    }
                    break;

            }

            RPAREN441=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_j_arguments5120); 
            RPAREN441_tree = (Object)adaptor.create(RPAREN441);
            adaptor.addChild(root_0, RPAREN441_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "j_arguments"

    // Delegated rules


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA98 dfa98 = new DFA98(this);
    protected DFA127 dfa127 = new DFA127(this);
    protected DFA128 dfa128 = new DFA128(this);
    static final String DFA32_eotS =
        "\26\uffff";
    static final String DFA32_eofS =
        "\26\uffff";
    static final String DFA32_minS =
        "\1\57\25\uffff";
    static final String DFA32_maxS =
        "\1\140\25\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25";
    static final String DFA32_specialS =
        "\26\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\32\uffff\4\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "240:1: operator : ( IN | NOT | EQUIVALENCE | IMPLICATION | XOR | OR | AND | EQUALITY | INEQUALITY | comp_op | PROJECTION | CONCAT | PREPEND | APPEND | PLUS | MINUS | MULT | DIV | MOD | POW | NUMBER_SIGN );";
        }
    }
    static final String DFA87_eotS =
        "\64\uffff";
    static final String DFA87_eofS =
        "\1\1\63\uffff";
    static final String DFA87_minS =
        "\1\32\63\uffff";
    static final String DFA87_maxS =
        "\1\u0085\63\uffff";
    static final String DFA87_acceptS =
        "\1\uffff\1\2\1\1\61\uffff";
    static final String DFA87_specialS =
        "\64\uffff}>";
    static final String[] DFA87_transitionS = {
            "\1\1\1\uffff\2\1\1\uffff\1\1\3\uffff\3\1\1\uffff\3\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\uffff\21\1\1\uffff\1\1\4\uffff\1\1\1\uffff"+
            "\4\1\2\uffff\5\1\10\uffff\4\1\1\uffff\1\2\1\uffff\1\1\13\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\4\uffff\2\1\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "()+ loopback of 507:5: ( DOT method_call )+";
        }
    }
    static final String DFA98_eotS =
        "\21\uffff";
    static final String DFA98_eofS =
        "\21\uffff";
    static final String DFA98_minS =
        "\1\46\20\uffff";
    static final String DFA98_maxS =
        "\1\161\20\uffff";
    static final String DFA98_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20";
    static final String DFA98_specialS =
        "\21\uffff}>";
    static final String[] DFA98_transitionS = {
            "\1\17\7\uffff\1\6\27\uffff\1\5\10\uffff\1\20\25\uffff\1\1\1"+
            "\2\1\3\1\4\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
    static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
    static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
    static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
    static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
    static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
    static final short[][] DFA98_transition;

    static {
        int numStates = DFA98_transitionS.length;
        DFA98_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
        }
    }

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = DFA98_eot;
            this.eof = DFA98_eof;
            this.min = DFA98_min;
            this.max = DFA98_max;
            this.accept = DFA98_accept;
            this.special = DFA98_special;
            this.transition = DFA98_transition;
        }
        public String getDescription() {
            return "522:1: atom : ( TRUE | FALSE | INTEGER | FLOAT | STRING | IDENTIFIER | THIS | CALLER | NULL | NIL | NOW | HISTORY | LBRACK ( expr_list )? RBRACK -> ^( LIST ( expr_list )? ) | LBRACES expr_in_braces RBRACES -> ^( SET_OR_BINDING expr_in_braces ) | LPAREN ( expr_in_paren )? RPAREN -> ^( PAREN ( expr_in_paren )? ) | SCHEMAVAR );";
        }
    }
    static final String DFA127_eotS =
        "\25\uffff";
    static final String DFA127_eofS =
        "\25\uffff";
    static final String DFA127_minS =
        "\1\36\24\uffff";
    static final String DFA127_maxS =
        "\1\161\24\uffff";
    static final String DFA127_acceptS =
        "\1\uffff\1\1\7\uffff\1\1\10\uffff\1\1\1\uffff\1\2";
    static final String DFA127_specialS =
        "\25\uffff}>";
    static final String[] DFA127_transitionS = {
            "\1\24\7\uffff\1\22\7\uffff\1\11\1\uffff\1\1\14\uffff\1\1\4\uffff"+
            "\1\1\3\uffff\1\1\10\uffff\1\11\25\uffff\4\1\7\11\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA127_eot = DFA.unpackEncodedString(DFA127_eotS);
    static final short[] DFA127_eof = DFA.unpackEncodedString(DFA127_eofS);
    static final char[] DFA127_min = DFA.unpackEncodedStringToUnsignedChars(DFA127_minS);
    static final char[] DFA127_max = DFA.unpackEncodedStringToUnsignedChars(DFA127_maxS);
    static final short[] DFA127_accept = DFA.unpackEncodedString(DFA127_acceptS);
    static final short[] DFA127_special = DFA.unpackEncodedString(DFA127_specialS);
    static final short[][] DFA127_transition;

    static {
        int numStates = DFA127_transitionS.length;
        DFA127_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA127_transition[i] = DFA.unpackEncodedString(DFA127_transitionS[i]);
        }
    }

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = DFA127_eot;
            this.eof = DFA127_eof;
            this.min = DFA127_min;
            this.max = DFA127_max;
            this.accept = DFA127_accept;
            this.special = DFA127_special;
            this.transition = DFA127_transition;
        }
        public String getDescription() {
            return "1101:9: ( expr | j_expression )";
        }
    }
    static final String DFA128_eotS =
        "\25\uffff";
    static final String DFA128_eofS =
        "\25\uffff";
    static final String DFA128_minS =
        "\1\36\24\uffff";
    static final String DFA128_maxS =
        "\1\161\24\uffff";
    static final String DFA128_acceptS =
        "\1\uffff\1\1\7\uffff\1\1\10\uffff\1\1\1\uffff\1\2";
    static final String DFA128_specialS =
        "\25\uffff}>";
    static final String[] DFA128_transitionS = {
            "\1\24\7\uffff\1\22\7\uffff\1\11\1\uffff\1\1\14\uffff\1\1\4\uffff"+
            "\1\1\3\uffff\1\1\10\uffff\1\11\25\uffff\4\1\7\11\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA128_eot = DFA.unpackEncodedString(DFA128_eotS);
    static final short[] DFA128_eof = DFA.unpackEncodedString(DFA128_eofS);
    static final char[] DFA128_min = DFA.unpackEncodedStringToUnsignedChars(DFA128_minS);
    static final char[] DFA128_max = DFA.unpackEncodedStringToUnsignedChars(DFA128_maxS);
    static final short[] DFA128_accept = DFA.unpackEncodedString(DFA128_acceptS);
    static final short[] DFA128_special = DFA.unpackEncodedString(DFA128_specialS);
    static final short[][] DFA128_transition;

    static {
        int numStates = DFA128_transitionS.length;
        DFA128_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA128_transition[i] = DFA.unpackEncodedString(DFA128_transitionS[i]);
        }
    }

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = DFA128_eot;
            this.eof = DFA128_eof;
            this.min = DFA128_min;
            this.max = DFA128_max;
            this.accept = DFA128_accept;
            this.special = DFA128_special;
            this.transition = DFA128_transition;
        }
        public String getDescription() {
            return "1102:16: ( expr | j_expression )";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_start169 = new BitSet(new long[]{0x00000B0004000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_j_import_decl_in_declaration191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_decl_in_declaration195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_decl_in_declaration199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_in_declaration203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_decl_in_declaration207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class_decl217 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_class_identifier_in_class_decl220 = new BitSet(new long[]{0x0000004788000000L});
    public static final BitSet FOLLOW_var_decl_no_init_argument_in_class_decl223 = new BitSet(new long[]{0x0000000788000000L});
    public static final BitSet FOLLOW_super_decl_rw_in_class_decl227 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_pragma_rw_in_class_decl230 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BEGIN_in_class_decl233 = new BitSet(new long[]{0x0000003010000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_class_attributes_in_class_decl237 = new BitSet(new long[]{0x0000002010000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_class_methods_in_class_decl240 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_in_class_decl243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_class_attributes257 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_class_attributes259 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_class_identifier283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_pragma_rw301 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma321 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_pragma324 = new BitSet(new long[]{0x0000004020000002L});
    public static final BitSet FOLLOW_parameter_list_in_pragma326 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_pragma329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_super_decl_in_super_decl_rw342 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_set_in_super_decl362 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_class_list_in_super_decl378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_element_in_class_list389 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_class_list392 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_class_element_in_class_list394 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_class_element411 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_parameter_list_in_class_element414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_attribute425 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_var_decl_list_in_attribute428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_with_def_in_class_methods440 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_with_def_in_class_methods444 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_method_with_body_in_anon_with_def469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100008L});
    public static final BitSet FOLLOW_invariant_in_anon_with_def472 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_WITH_in_with_def483 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_with_def486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_method_with_body_in_with_def488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100008L});
    public static final BitSet FOLLOW_invariant_in_with_def491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_var_decl_no_init_argument503 = new BitSet(new long[]{0x200140C000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_var_decl_no_init_argument505 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_var_decl_no_init_argument508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameter_list527 = new BitSet(new long[]{0x200140C000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_list_in_parameter_list529 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parameter_list532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interface_decl551 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_class_identifier_in_interface_decl554 = new BitSet(new long[]{0x0000004488000000L});
    public static final BitSet FOLLOW_var_decl_no_init_argument_in_interface_decl558 = new BitSet(new long[]{0x0000000488000000L});
    public static final BitSet FOLLOW_interface_super_in_interface_decl562 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_pragma_rw_in_interface_decl565 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BEGIN_in_interface_decl568 = new BitSet(new long[]{0x0000002010000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_invariant_in_interface_decl572 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_interface_methods_in_interface_decl576 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_in_interface_decl579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_decl_in_interface_methods591 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_interface_inherits_in_interface_super612 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_INHERITS_in_interface_inherits634 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_class_list_in_interface_inherits637 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_DATATYPE_in_datatype_decl648 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_datatype_decl651 = new BitSet(new long[]{0x0000040080000002L});
    public static final BitSet FOLLOW_from_in_datatype_decl653 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_pragma_in_datatype_decl656 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_FROM_in_from667 = new BitSet(new long[]{0x0000000040000002L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_list_in_from670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_function_decl681 = new BitSet(new long[]{0xFFFFC00000000000L,0x00000001E0000007L});
    public static final BitSet FOLLOW_id_or_op_in_function_decl684 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_var_decl_no_init_argument_in_function_decl686 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_COLON_in_function_decl689 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_function_decl692 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_pragma_in_function_decl694 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_function_body_in_function_decl697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_EQUAL_in_function_body707 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008064L});
    public static final BitSet FOLLOW_expr_in_function_body712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_in_function_body726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id_or_op744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_in_id_or_op757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_operator778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_operator783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUIVALENCE_in_operator788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLICATION_in_operator793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_operator798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operator803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_operator808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALITY_in_operator813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INEQUALITY_in_operator818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_operator823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROJECTION_in_operator828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCAT_in_operator833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREPEND_in_operator838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPEND_in_operator843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_operator848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_operator853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_in_operator858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_operator863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_operator868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POW_in_operator873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_SIGN_in_operator878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_decl888 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_with_decl891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_method_decl_in_with_decl893 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100008L});
    public static final BitSet FOLLOW_invariant_in_with_decl896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_in_method_with_body906 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_method_identifier_in_method_with_body909 = new BitSet(new long[]{0x0000204080000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_method_param_in_method_with_body912 = new BitSet(new long[]{0x0000204080000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_requires_in_method_with_body916 = new BitSet(new long[]{0x0000204080000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ensures_in_method_with_body920 = new BitSet(new long[]{0x0000204080000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_pragma_in_method_with_body924 = new BitSet(new long[]{0x0000204080000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_method_body_in_method_with_body928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_method_identifier939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_EQUAL_in_method_body957 = new BitSet(new long[]{0x2001405008000000L,0x000AFFE01FE3A074L});
    public static final BitSet FOLLOW_priority_decl_in_method_body962 = new BitSet(new long[]{0x2001405008000000L,0x000AFFE01FE3A054L});
    public static final BitSet FOLLOW_decl_statement_in_method_body965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_in_method_body982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIORITY_in_priority_decl1000 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LPAREN_in_priority_decl1002 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_priority_decl1004 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_priority_decl1006 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_priority_decl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_extern1024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_extern1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_in_method_decl1038 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_method_identifier_in_method_decl1041 = new BitSet(new long[]{0x0000004080000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_method_param_in_method_decl1044 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_requires_in_method_decl1048 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ensures_in_method_decl1052 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_pragma_in_method_decl1056 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_REQUIRES_in_requires1068 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_requires1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENSURES_in_ensures1081 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_ensures1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_method_param1094 = new BitSet(new long[]{0x2001C0C020000000L,0x0002FFE000008244L});
    public static final BitSet FOLLOW_method_param_in_in_method_param1097 = new BitSet(new long[]{0x0000008020000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_method_param_out_in_method_param1101 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_method_param1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_method_param_in1131 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_method_param_in1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_method_param_out1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_OUT_in_method_param_out1159 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_var_decl_no_init_list_in_method_param_out1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_var_decl_list1173 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_var_decl_list1176 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_var_decl_in_var_decl_list1178 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_var_decl_no_init_in_var_decl1195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ASSIGN_in_var_decl1198 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE00000C044L});
    public static final BitSet FOLLOW_expr_or_new_in_var_decl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_var_decl_no_init1212 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_COLON_in_var_decl_no_init1214 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_var_decl_no_init1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_no_init_in_var_decl_no_init_list1237 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_var_decl_no_init_list1240 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_var_decl_no_init_in_var_decl_no_init_list1242 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_statement_in_start_statement1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_start_statement1269 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_start_statement1273 = new BitSet(new long[]{0x2001405008000000L,0x000AFFE01FE3A054L});
    public static final BitSet FOLLOW_decl_statement_in_start_statement1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_decl_statement1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_decl_statement1300 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_decl_statement1302 = new BitSet(new long[]{0x2001405008000000L,0x000AFFE01FE3A054L});
    public static final BitSet FOLLOW_decl_statement_in_decl_statement1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choice_stmt_in_statement1316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_INTERLEAVE_in_statement1319 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_statement_in_statement1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_seq_stmt_in_choice_stmt1334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_BOX_in_choice_stmt1337 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_choice_stmt_in_choice_stmt1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_stmt_in_seq_stmt1352 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_seq_stmt1355 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_seq_stmt_in_seq_stmt1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_small_stmt_in_basic_stmt1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_flow_stmt_in_basic_stmt1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_stmt_in_basic_stmt1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_stmt1391 = new BitSet(new long[]{0x0000000800000002L,0x0000000000002400L});
    public static final BitSet FOLLOW_KOMMA_in_expr_stmt1397 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_expr_stmt1400 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_stmt1404 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE00000C044L});
    public static final BitSet FOLLOW_expr_or_new_list_in_expr_stmt1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLENATION_MARK_in_expr_stmt1414 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_expr_stmt1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_new1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_expr_or_new1438 = new BitSet(new long[]{0x0000000040000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_expr_or_new1441 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_parameter_list_in_expr_or_new1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_new_in_expr_or_new_list1461 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_expr_or_new_list1464 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE00000C044L});
    public static final BitSet FOLLOW_expr_or_new_list_in_expr_or_new_list1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_control_flow_stmt1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_stmt_in_control_flow_stmt1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_control_flow_stmt1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1501 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_condition_in_while_stmt1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000160000L});
    public static final BitSet FOLLOW_invariant_in_while_stmt1506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000160000L});
    public static final BitSet FOLLOW_measure_in_while_stmt1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000160000L});
    public static final BitSet FOLLOW_while_body_in_while_stmt1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_condition1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_while_body1540 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_statement_in_while_body1542 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_in_while_body1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEASURE_in_measure1562 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_measure1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_measure_by_in_measure1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BY_in_measure_by1577 = new BitSet(new long[]{0xFFFFC00000000000L,0x00000001E0000007L});
    public static final BitSet FOLLOW_id_or_op_in_measure_by1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_invariant1590 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_invariant1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_do_while_stmt1603 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_do_while_body_in_do_while_stmt1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000150000L});
    public static final BitSet FOLLOW_invariant_in_do_while_stmt1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_measure_in_do_while_stmt1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_WHILE_in_do_while_stmt1615 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_condition_in_do_while_stmt1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_do_while_body1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_stmt_in_small_stmt1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_stmt_in_small_stmt1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_posit_stmt_in_small_stmt1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assert_stmt_in_small_stmt1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prove_stmt_in_small_stmt1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_await_stmt_in_small_stmt1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asyn_call_stmt_in_small_stmt1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLENATION_MARK_in_asyn_call_stmt1687 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_asyn_call_stmt1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AWAIT_in_await_stmt1701 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_await_stmt1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROVE_in_prove_stmt1714 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_prove_stmt1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_assert_stmt1727 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_assert_stmt1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSIT_in_posit_stmt1740 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_posit_stmt1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_block_stmt1754 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_statement_in_block_stmt1757 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_in_block_stmt1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atomic_stmt0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equivalence_expr_in_expr1798 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_IN_in_expr1801 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_equivalence_expr_in_expr1804 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_impl_expr_in_equivalence_expr1818 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_EQUIVALENCE_in_equivalence_expr1821 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_impl_expr_in_equivalence_expr1824 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_xor_expr_in_impl_expr1836 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_IMPLICATION_in_impl_expr1839 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_xor_expr_in_impl_expr1842 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_or_expr_in_xor_expr1854 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_XOR_in_xor_expr1857 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_or_expr_in_xor_expr1860 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_and_expr_in_or_expr1872 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expr1875 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_and_expr_in_or_expr1878 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_not_expr_in_and_expr1890 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expr1893 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_and_expr_in_and_expr1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_not_expr1909 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_not_expr_in_not_expr1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equals_expr_in_not_expr1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_expr_in_equals_expr1928 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_set_in_equals_expr1931 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_comp_expr_in_equals_expr1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_projection_expr_in_comp_expr1951 = new BitSet(new long[]{0x0000000000000002L,0x00000001E0000000L});
    public static final BitSet FOLLOW_comp_op_in_comp_expr1954 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_projection_expr_in_comp_expr1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comp_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concat_expr_in_projection_expr1999 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_PROJECTION_in_projection_expr2002 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_concat_expr_in_projection_expr2005 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_prepend_expr_in_concat_expr2018 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_CONCAT_in_concat_expr2021 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_prepend_expr_in_concat_expr2024 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_append_expr_in_prepend_expr2036 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_PREPEND_in_prepend_expr2039 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_prepend_expr_in_prepend_expr2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expr_in_append_expr2055 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_APPEND_in_append_expr2058 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_add_expr_in_append_expr2061 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2073 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_set_in_add_expr2076 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr2083 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_power_in_mult_expr2095 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_mult_expr2098 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_power_in_mult_expr2111 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_factor_in_power2123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_POW_in_power2126 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_factor_in_power2129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor2142 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_factor_in_factor2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_SIGN_in_factor2151 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_factor_in_factor2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_with_trailer_in_factor2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atom_with_trailer2172 = new BitSet(new long[]{0x0000004000000002L,0x00C0001E00000000L});
    public static final BitSet FOLLOW_AT_in_atom_with_trailer2184 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_atom_with_trailer2186 = new BitSet(new long[]{0x0000000000000002L,0x00C0000400000000L});
    public static final BitSet FOLLOW_DOT_in_atom_with_trailer2204 = new BitSet(new long[]{0x0000400000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_method_call_in_atom_with_trailer2206 = new BitSet(new long[]{0x0000000000000002L,0x00C0001400000000L});
    public static final BitSet FOLLOW_as_type_in_atom_with_trailer2211 = new BitSet(new long[]{0x0000000000000002L,0x00C0000400000000L});
    public static final BitSet FOLLOW_bounds_in_atom_with_trailer2233 = new BitSet(new long[]{0x0000000000000002L,0x00C0000400000000L});
    public static final BitSet FOLLOW_arg_list_in_atom_with_trailer2246 = new BitSet(new long[]{0x0000000000000002L,0x00C0001400000000L});
    public static final BitSet FOLLOW_as_type_in_atom_with_trailer2249 = new BitSet(new long[]{0x0000000000000002L,0x00C0000400000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_atom_with_trailer2271 = new BitSet(new long[]{0x0000004000000002L,0x00C0000400000000L});
    public static final BitSet FOLLOW_lhs_list_paren_in_atom_with_trailer2273 = new BitSet(new long[]{0x0000000000000002L,0x00C0000400000000L});
    public static final BitSet FOLLOW_AS_in_atom_with_trailer2293 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_atom_with_trailer2295 = new BitSet(new long[]{0x0000000000000002L,0x00C0000400000000L});
    public static final BitSet FOLLOW_trailer_rest_in_atom_with_trailer2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_method_call2342 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_arg_list_in_method_call2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAVAR_in_method_call2362 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_arg_list_in_method_call2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_atom2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALLER_in_atom2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_atom2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOW_in_atom2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HISTORY_in_atom2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_atom2445 = new BitSet(new long[]{0x2001404000000000L,0x0003FFE000008044L});
    public static final BitSet FOLLOW_expr_list_in_atom2447 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_atom2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACES_in_atom2464 = new BitSet(new long[]{0x2001404000000000L,0x1006FFE000008044L});
    public static final BitSet FOLLOW_expr_in_braces_in_atom2466 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RBRACES_in_atom2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom2480 = new BitSet(new long[]{0x200140C000000000L,0x0E02FFE000008044L});
    public static final BitSet FOLLOW_expr_in_paren_in_atom2482 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAVAR_in_atom2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt2514 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_condition_in_if_stmt2517 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_if_then_in_if_stmt2519 = new BitSet(new long[]{0x0000000010000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_if_else_in_if_stmt2521 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_in_if_stmt2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_if_then2536 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_statement_in_if_then2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_if_else2549 = new BitSet(new long[]{0x2001404008000000L,0x000AFFE01FE3A044L});
    public static final BitSet FOLLOW_statement_in_if_else2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_trailer_rest2563 = new BitSet(new long[]{0x0000400000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_trailer_rest2566 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_arg_list_in_trailer_rest2574 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_as_type_in_trailer_rest2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bounds_in_trailer_rest2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arg_list2597 = new BitSet(new long[]{0x200140C020000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_list_in_arg_list2600 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_arg_output_list_in_arg_list2604 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_arg_list2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_arg_output_list2632 = new BitSet(new long[]{0x0000400000000002L,0x0100000000008000L});
    public static final BitSet FOLLOW_lhs_list_in_arg_output_list2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUND_L_in_bounds2647 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_bounds2649 = new BitSet(new long[]{0x0000004000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_BOUND_R_in_bounds2652 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_bounds2654 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_arg_list_in_bounds2658 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_as_type_in_bounds2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUND_R_in_bounds2691 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_bounds2693 = new BitSet(new long[]{0x0000004000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_BOUND_L_in_bounds2696 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_bounds2698 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_arg_list_in_bounds2702 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_as_type_in_bounds2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_lhs_list_paren2742 = new BitSet(new long[]{0x0000408000000000L,0x0100000000008000L});
    public static final BitSet FOLLOW_lhs_list_in_lhs_list_paren2744 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lhs_list_paren2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_lhs_list2766 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_lhs_list2769 = new BitSet(new long[]{0x0000400000000000L,0x0100000000008000L});
    public static final BitSet FOLLOW_lhs_in_lhs_list2771 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lhs2788 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_AT_in_lhs2791 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_lhs2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_lhs2801 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_as_type_in_lhs2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAVAR_in_lhs2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_as_type2819 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_as_type2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_list_in_expr_in_paren2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_in_paren2838 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_var_decl_no_init_in_expr_in_paren2847 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_COLON_in_expr_in_paren2849 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_paren_expr_in_expr_in_paren2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_in_paren_expr2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2882 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_expr_list2885 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_expr_list2888 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_setmaker_in_expr_in_braces2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTICAL_in_expr_in_braces2924 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_binding_list_in_expr_in_braces2926 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_VERTICAL_in_expr_in_braces2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_setmaker2946 = new BitSet(new long[]{0x0000100800000002L});
    public static final BitSet FOLLOW_KOMMA_in_setmaker2951 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_setmaker2954 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_COLON_in_setmaker2960 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_setmaker2963 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_VERTICAL_in_setmaker2965 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_setmaker2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_binding_list2981 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_binding_list2984 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_binding_in_binding_list2987 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_expr_in_binding2999 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_MAPSTO_in_binding3001 = new BitSet(new long[]{0x2001404000000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_binding3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_real_in_type3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_IDENTIFIER_in_type_real3034 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_list_brackets_in_type_real3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_bracket_in_type_real3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSTROPHE_in_type_real3047 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_real3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_type_bracket3067 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_list_in_type_bracket3069 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type_bracket3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_type_list_brackets3090 = new BitSet(new long[]{0x0000000040000000L,0x4001800000000000L});
    public static final BitSet FOLLOW_type_list_in_type_list_brackets3093 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type_list_brackets3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_list3108 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_type_list3111 = new BitSet(new long[]{0x0000000040000000L,0x4000800000000000L});
    public static final BitSet FOLLOW_type_in_type_list3113 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IMPORT_in_j_import_decl4834 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_j_import_expr_in_j_import_decl4836 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_j_import_decl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_j_identifier_in_j_import_expr4860 = new BitSet(new long[]{0x0000000020000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_j_import_expr4863 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_j_identifier_in_j_import_expr4865 = new BitSet(new long[]{0x0000000020000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_j_import_expr4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_j_identifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_j_parExpression4908 = new BitSet(new long[]{0x0000404040000000L});
    public static final BitSet FOLLOW_j_expression_in_j_parExpression4910 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_j_parExpression4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_j_expressionList4933 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_j_expression_in_j_expressionList4937 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_KOMMA_in_j_expressionList4949 = new BitSet(new long[]{0x2001404040000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_expr_in_j_expressionList4952 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_j_expression_in_j_expressionList4956 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_j_primary_in_j_expression4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_j_parExpression_in_j_primary5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_j_identifier_in_j_primary5029 = new BitSet(new long[]{0x0000004000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_DOT_in_j_primary5032 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_j_identifier_in_j_primary5034 = new BitSet(new long[]{0x0000004000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_j_identifierSuffix_in_j_primary5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_j_arguments_in_j_identifierSuffix5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_j_arguments5113 = new BitSet(new long[]{0x200140C040000000L,0x0002FFE000008044L});
    public static final BitSet FOLLOW_j_expressionList_in_j_arguments5116 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_j_arguments5120 = new BitSet(new long[]{0x0000000000000002L});

}