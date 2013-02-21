// $ANTLR 3.2 Sep 23, 2009 14:05:07 nl/cwi/cacoj/creol/Creol.g 2011-08-10 11:08:19

package nl.cwi.cacoj.creol;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CreolLexer extends Lexer {
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

    public void displayRecognitionError(String[] tokenNames,
    	RecognitionException e) {
    	String hdr = getErrorHeader(e);
    	String msg = getErrorMessage(e, tokenNames);
    	// Now do something with hdr and msg...
    	throw new RuntimeException(hdr+" "+msg);
      }


    // delegates
    // delegators

    public CreolLexer() {;} 
    public CreolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CreolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "nl/cwi/cacoj/creol/Creol.g"; }

    // $ANTLR start "APOSTROPHE"
    public final void mAPOSTROPHE() throws RecognitionException {
        try {
            int _type = APOSTROPHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:638:2: ( '`' )
            // nl/cwi/cacoj/creol/Creol.g:638:4: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APOSTROPHE"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:641:5: ( '/' )
            // nl/cwi/cacoj/creol/Creol.g:641:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:644:6: ( '*' )
            // nl/cwi/cacoj/creol/Creol.g:644:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:648:5: ( '~' )
            // nl/cwi/cacoj/creol/Creol.g:648:7: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EQUALITY"
    public final void mEQUALITY() throws RecognitionException {
        try {
            int _type = EQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:651:9: ( '=' )
            // nl/cwi/cacoj/creol/Creol.g:651:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALITY"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:654:4: ( '@' )
            // nl/cwi/cacoj/creol/Creol.g:654:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:657:5: ( '^' )
            // nl/cwi/cacoj/creol/Creol.g:657:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:661:7: ( '-' )
            // nl/cwi/cacoj/creol/Creol.g:661:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "LBRACES"
    public final void mLBRACES() throws RecognitionException {
        try {
            int _type = LBRACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:665:9: ( '{' )
            // nl/cwi/cacoj/creol/Creol.g:665:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACES"

    // $ANTLR start "RBRACES"
    public final void mRBRACES() throws RecognitionException {
        try {
            int _type = RBRACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:668:9: ( '}' )
            // nl/cwi/cacoj/creol/Creol.g:668:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACES"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:671:8: ( '[' )
            // nl/cwi/cacoj/creol/Creol.g:671:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:674:8: ( ']' )
            // nl/cwi/cacoj/creol/Creol.g:674:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:678:8: ( '(' )
            // nl/cwi/cacoj/creol/Creol.g:678:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "PRIORITY"
    public final void mPRIORITY() throws RecognitionException {
        try {
            int _type = PRIORITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:681:9: ( 'priority by' )
            // nl/cwi/cacoj/creol/Creol.g:681:10: 'priority by'
            {
            match("priority by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIORITY"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:683:8: ( ')' )
            // nl/cwi/cacoj/creol/Creol.g:683:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "PROJECTION"
    public final void mPROJECTION() throws RecognitionException {
        try {
            int _type = PROJECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:686:12: ( '\\\\' )
            // nl/cwi/cacoj/creol/Creol.g:686:14: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROJECTION"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:689:7: ( ':' )
            // nl/cwi/cacoj/creol/Creol.g:689:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:692:5: ( '.' )
            // nl/cwi/cacoj/creol/Creol.g:692:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "EXCLENATION_MARK"
    public final void mEXCLENATION_MARK() throws RecognitionException {
        try {
            int _type = EXCLENATION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:696:2: ( '!' )
            // nl/cwi/cacoj/creol/Creol.g:696:4: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCLENATION_MARK"

    // $ANTLR start "GREATER_THAN"
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:700:2: ( '>' )
            // nl/cwi/cacoj/creol/Creol.g:700:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_THAN"

    // $ANTLR start "KOMMA"
    public final void mKOMMA() throws RecognitionException {
        try {
            int _type = KOMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:703:7: ( ',' )
            // nl/cwi/cacoj/creol/Creol.g:703:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KOMMA"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:707:2: ( '<' )
            // nl/cwi/cacoj/creol/Creol.g:707:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "NUMBER_SIGN"
    public final void mNUMBER_SIGN() throws RecognitionException {
        try {
            int _type = NUMBER_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:711:2: ( '#' )
            // nl/cwi/cacoj/creol/Creol.g:711:4: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER_SIGN"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:714:5: ( '%' )
            // nl/cwi/cacoj/creol/Creol.g:714:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:717:6: ( '+' )
            // nl/cwi/cacoj/creol/Creol.g:717:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:721:2: ( ';' )
            // nl/cwi/cacoj/creol/Creol.g:721:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:725:2: ( '_' )
            // nl/cwi/cacoj/creol/Creol.g:725:4: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "VERTICAL"
    public final void mVERTICAL() throws RecognitionException {
        try {
            int _type = VERTICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:729:2: ( '|' )
            // nl/cwi/cacoj/creol/Creol.g:729:4: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERTICAL"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:733:2: ( '?' )
            // nl/cwi/cacoj/creol/Creol.g:733:4: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:738:8: ( ':=' )
            // nl/cwi/cacoj/creol/Creol.g:738:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BOX"
    public final void mBOX() throws RecognitionException {
        try {
            int _type = BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:741:5: ( '[]' )
            // nl/cwi/cacoj/creol/Creol.g:741:7: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOX"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:744:5: ( '**' )
            // nl/cwi/cacoj/creol/Creol.g:744:7: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:747:4: ( '||' | '\\\\/' )
            int alt1=2;
            switch ( input.LA(1) ) {
            case '|':
                {
                alt1=1;
                }
                break;
            case '\\':
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:747:6: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:747:13: '\\\\/'
                    {
                    match("\\/"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:750:5: ( '&&' | '/\\\\' )
            int alt2=2;
            switch ( input.LA(1) ) {
            case '&':
                {
                alt2=1;
                }
                break;
            case '/':
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:750:7: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:750:14: '/\\\\'
                    {
                    match("/\\"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "DOUBLE_EQUAL"
    public final void mDOUBLE_EQUAL() throws RecognitionException {
        try {
            int _type = DOUBLE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:754:2: ( '==' )
            // nl/cwi/cacoj/creol/Creol.g:754:4: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_EQUAL"

    // $ANTLR start "INEQUALITY"
    public final void mINEQUALITY() throws RecognitionException {
        try {
            int _type = INEQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:758:2: ( '/=' )
            // nl/cwi/cacoj/creol/Creol.g:758:4: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INEQUALITY"

    // $ANTLR start "IMPLICATION"
    public final void mIMPLICATION() throws RecognitionException {
        try {
            int _type = IMPLICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:762:2: ( '=>' )
            // nl/cwi/cacoj/creol/Creol.g:762:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLICATION"

    // $ANTLR start "LESS_OR_EQUAL"
    public final void mLESS_OR_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:766:2: ( '<=' )
            // nl/cwi/cacoj/creol/Creol.g:766:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_OR_EQUAL"

    // $ANTLR start "GREATER_OR_EQUAL"
    public final void mGREATER_OR_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:770:2: ( '>=' )
            // nl/cwi/cacoj/creol/Creol.g:770:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_OR_EQUAL"

    // $ANTLR start "PREPEND"
    public final void mPREPEND() throws RecognitionException {
        try {
            int _type = PREPEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:773:9: ( '-|' )
            // nl/cwi/cacoj/creol/Creol.g:773:11: '-|'
            {
            match("-|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREPEND"

    // $ANTLR start "APPEND"
    public final void mAPPEND() throws RecognitionException {
        try {
            int _type = APPEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:776:9: ( '|-' )
            // nl/cwi/cacoj/creol/Creol.g:776:11: '|-'
            {
            match("|-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APPEND"

    // $ANTLR start "BOUND_R"
    public final void mBOUND_R() throws RecognitionException {
        try {
            int _type = BOUND_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:779:9: ( ':>' )
            // nl/cwi/cacoj/creol/Creol.g:779:11: ':>'
            {
            match(":>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOUND_R"

    // $ANTLR start "BOUND_L"
    public final void mBOUND_L() throws RecognitionException {
        try {
            int _type = BOUND_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:782:9: ( '<:' )
            // nl/cwi/cacoj/creol/Creol.g:782:11: '<:'
            {
            match("<:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOUND_L"

    // $ANTLR start "MAPSTO"
    public final void mMAPSTO() throws RecognitionException {
        try {
            int _type = MAPSTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:785:8: ( '|->' )
            // nl/cwi/cacoj/creol/Creol.g:785:10: '|->'
            {
            match("|->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAPSTO"

    // $ANTLR start "EQUIVALENCE"
    public final void mEQUIVALENCE() throws RecognitionException {
        try {
            int _type = EQUIVALENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:791:2: ( '<=>' )
            // nl/cwi/cacoj/creol/Creol.g:791:4: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUIVALENCE"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:794:8: ( '|-|' )
            // nl/cwi/cacoj/creol/Creol.g:794:10: '|-|'
            {
            match("|-|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "INTERLEAVE"
    public final void mINTERLEAVE() throws RecognitionException {
        try {
            int _type = INTERLEAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:798:2: ( '|||' )
            // nl/cwi/cacoj/creol/Creol.g:798:4: '|||'
            {
            match("|||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERLEAVE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:804:4: ( 'as' )
            // nl/cwi/cacoj/creol/Creol.g:804:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASSERT"
    public final void mASSERT() throws RecognitionException {
        try {
            int _type = ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:807:8: ( 'assert' )
            // nl/cwi/cacoj/creol/Creol.g:807:10: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSERT"

    // $ANTLR start "AWAIT"
    public final void mAWAIT() throws RecognitionException {
        try {
            int _type = AWAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:810:7: ( 'await' )
            // nl/cwi/cacoj/creol/Creol.g:810:9: 'await'
            {
            match("await"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AWAIT"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:813:7: ( 'begin' )
            // nl/cwi/cacoj/creol/Creol.g:813:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:816:4: ( 'by' )
            // nl/cwi/cacoj/creol/Creol.g:816:6: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:819:7: ( 'block' )
            // nl/cwi/cacoj/creol/Creol.g:819:9: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "CALLER"
    public final void mCALLER() throws RecognitionException {
        try {
            int _type = CALLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:822:8: ( 'caller' )
            // nl/cwi/cacoj/creol/Creol.g:822:10: 'caller'
            {
            match("caller"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALLER"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:825:6: ( 'case' )
            // nl/cwi/cacoj/creol/Creol.g:825:8: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:828:7: ( 'class' )
            // nl/cwi/cacoj/creol/Creol.g:828:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "COMPONENT"
    public final void mCOMPONENT() throws RecognitionException {
        try {
            int _type = COMPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:832:2: ( 'component' )
            // nl/cwi/cacoj/creol/Creol.g:832:4: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPONENT"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:835:10: ( 'constant' )
            // nl/cwi/cacoj/creol/Creol.g:835:12: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "CONTRACTS"
    public final void mCONTRACTS() throws RecognitionException {
        try {
            int _type = CONTRACTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:838:11: ( 'contracts' )
            // nl/cwi/cacoj/creol/Creol.g:838:13: 'contracts'
            {
            match("contracts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTRACTS"

    // $ANTLR start "DATATYPE"
    public final void mDATATYPE() throws RecognitionException {
        try {
            int _type = DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:841:10: ( 'datatype' )
            // nl/cwi/cacoj/creol/Creol.g:841:12: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATATYPE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:844:4: ( 'do' )
            // nl/cwi/cacoj/creol/Creol.g:844:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:847:6: ( 'else' )
            // nl/cwi/cacoj/creol/Creol.g:847:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:850:5: ( 'end' )
            // nl/cwi/cacoj/creol/Creol.g:850:7: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ENSURES"
    public final void mENSURES() throws RecognitionException {
        try {
            int _type = ENSURES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:853:9: ( 'ensures' )
            // nl/cwi/cacoj/creol/Creol.g:853:11: 'ensures'
            {
            match("ensures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENSURES"

    // $ANTLR start "EXCEPTION"
    public final void mEXCEPTION() throws RecognitionException {
        try {
            int _type = EXCEPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:856:11: ( 'exception' )
            // nl/cwi/cacoj/creol/Creol.g:856:13: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTION"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:859:8: ( 'exists' )
            // nl/cwi/cacoj/creol/Creol.g:859:10: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "EXPORTS"
    public final void mEXPORTS() throws RecognitionException {
        try {
            int _type = EXPORTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:862:9: ( 'exports' )
            // nl/cwi/cacoj/creol/Creol.g:862:11: 'exports'
            {
            match("exports"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPORTS"

    // $ANTLR start "EXTERNAL"
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:865:10: ( 'external' )
            // nl/cwi/cacoj/creol/Creol.g:865:12: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERNAL"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:868:7: ( 'false' )
            // nl/cwi/cacoj/creol/Creol.g:868:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:871:5: ( 'for' )
            // nl/cwi/cacoj/creol/Creol.g:871:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FORALL"
    public final void mFORALL() throws RecognitionException {
        try {
            int _type = FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:874:8: ( 'forall' )
            // nl/cwi/cacoj/creol/Creol.g:874:10: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORALL"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:877:6: ( 'from' )
            // nl/cwi/cacoj/creol/Creol.g:877:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:880:10: ( 'function' )
            // nl/cwi/cacoj/creol/Creol.g:880:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "HISTORY"
    public final void mHISTORY() throws RecognitionException {
        try {
            int _type = HISTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:883:9: ( 'history' )
            // nl/cwi/cacoj/creol/Creol.g:883:11: 'history'
            {
            match("history"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HISTORY"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:886:4: ( 'if' )
            // nl/cwi/cacoj/creol/Creol.g:886:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:890:2: ( 'implements' )
            // nl/cwi/cacoj/creol/Creol.g:890:4: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:893:7: ( 'java_import' )
            // nl/cwi/cacoj/creol/Creol.g:894:3: 'java_import'
            {
            match("java_import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:897:4: ( 'in' )
            // nl/cwi/cacoj/creol/Creol.g:897:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INHERITS"
    public final void mINHERITS() throws RecognitionException {
        try {
            int _type = INHERITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:900:9: ( 'inherits' )
            // nl/cwi/cacoj/creol/Creol.g:900:11: 'inherits'
            {
            match("inherits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INHERITS"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:904:2: ( 'interface' )
            // nl/cwi/cacoj/creol/Creol.g:904:4: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "INV"
    public final void mINV() throws RecognitionException {
        try {
            int _type = INV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:907:5: ( 'inv' )
            // nl/cwi/cacoj/creol/Creol.g:907:7: 'inv'
            {
            match("inv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INV"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:910:4: ( 'is' )
            // nl/cwi/cacoj/creol/Creol.g:910:6: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "MEASURE"
    public final void mMEASURE() throws RecognitionException {
        try {
            int _type = MEASURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:913:9: ( 'measure' )
            // nl/cwi/cacoj/creol/Creol.g:913:11: 'measure'
            {
            match("measure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEASURE"

    // $ANTLR start "METHOD"
    public final void mMETHOD() throws RecognitionException {
        try {
            int _type = METHOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:916:8: ( 'method' )
            // nl/cwi/cacoj/creol/Creol.g:916:10: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "METHOD"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:919:5: ( 'new' )
            // nl/cwi/cacoj/creol/Creol.g:919:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "NIL"
    public final void mNIL() throws RecognitionException {
        try {
            int _type = NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:922:5: ( 'nil' )
            // nl/cwi/cacoj/creol/Creol.g:922:7: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIL"

    // $ANTLR start "NOW"
    public final void mNOW() throws RecognitionException {
        try {
            int _type = NOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:925:5: ( 'now' )
            // nl/cwi/cacoj/creol/Creol.g:925:7: 'now'
            {
            match("now"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOW"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:928:6: ( 'null' )
            // nl/cwi/cacoj/creol/Creol.g:928:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:931:8: ( 'object' )
            // nl/cwi/cacoj/creol/Creol.g:931:10: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:934:4: ( 'of' )
            // nl/cwi/cacoj/creol/Creol.g:934:6: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:937:4: ( 'op' )
            // nl/cwi/cacoj/creol/Creol.g:937:6: 'op'
            {
            match("op"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP"

    // $ANTLR start "OUT"
    public final void mOUT() throws RecognitionException {
        try {
            int _type = OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:940:5: ( 'out' )
            // nl/cwi/cacoj/creol/Creol.g:940:7: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUT"

    // $ANTLR start "POSIT"
    public final void mPOSIT() throws RecognitionException {
        try {
            int _type = POSIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:943:7: ( 'posit' )
            // nl/cwi/cacoj/creol/Creol.g:943:9: 'posit'
            {
            match("posit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSIT"

    // $ANTLR start "PRAGMA"
    public final void mPRAGMA() throws RecognitionException {
        try {
            int _type = PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:946:8: ( 'pragma' )
            // nl/cwi/cacoj/creol/Creol.g:946:10: 'pragma'
            {
            match("pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA"

    // $ANTLR start "PROVE"
    public final void mPROVE() throws RecognitionException {
        try {
            int _type = PROVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:949:7: ( 'prove' )
            // nl/cwi/cacoj/creol/Creol.g:949:9: 'prove'
            {
            match("prove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROVE"

    // $ANTLR start "PROVIDES"
    public final void mPROVIDES() throws RecognitionException {
        try {
            int _type = PROVIDES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:952:9: ( 'provides' )
            // nl/cwi/cacoj/creol/Creol.g:952:11: 'provides'
            {
            match("provides"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROVIDES"

    // $ANTLR start "RELEASE"
    public final void mRELEASE() throws RecognitionException {
        try {
            int _type = RELEASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:955:9: ( 'release' )
            // nl/cwi/cacoj/creol/Creol.g:955:11: 'release'
            {
            match("release"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELEASE"

    // $ANTLR start "REQUIRES"
    public final void mREQUIRES() throws RecognitionException {
        try {
            int _type = REQUIRES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:958:9: ( 'requires' )
            // nl/cwi/cacoj/creol/Creol.g:958:11: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REQUIRES"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:961:7: ( 'return' )
            // nl/cwi/cacoj/creol/Creol.g:961:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SIGNAL"
    public final void mSIGNAL() throws RecognitionException {
        try {
            int _type = SIGNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:964:8: ( 'signal' )
            // nl/cwi/cacoj/creol/Creol.g:964:10: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIGNAL"

    // $ANTLR start "SKIP"
    public final void mSKIP() throws RecognitionException {
        try {
            int _type = SKIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:967:6: ( 'skip' )
            // nl/cwi/cacoj/creol/Creol.g:967:8: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SKIP"

    // $ANTLR start "SOME"
    public final void mSOME() throws RecognitionException {
        try {
            int _type = SOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:970:6: ( 'some' )
            // nl/cwi/cacoj/creol/Creol.g:970:8: 'some'
            {
            match("some"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOME"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:973:6: ( 'then' )
            // nl/cwi/cacoj/creol/Creol.g:973:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:976:6: ( 'this' )
            // nl/cwi/cacoj/creol/Creol.g:976:8: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:979:7: ( 'throw' )
            // nl/cwi/cacoj/creol/Creol.g:979:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "THROWS"
    public final void mTHROWS() throws RecognitionException {
        try {
            int _type = THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:982:8: ( 'throws' )
            // nl/cwi/cacoj/creol/Creol.g:982:10: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROWS"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:985:6: ( 'true' )
            // nl/cwi/cacoj/creol/Creol.g:985:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:988:5: ( 'try' )
            // nl/cwi/cacoj/creol/Creol.g:988:7: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:991:5: ( 'var' )
            // nl/cwi/cacoj/creol/Creol.g:991:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "VOLATILE"
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:994:9: ( 'volatile' )
            // nl/cwi/cacoj/creol/Creol.g:994:11: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOLATILE"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:997:6: ( 'when' )
            // nl/cwi/cacoj/creol/Creol.g:997:8: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1000:7: ( 'where' )
            // nl/cwi/cacoj/creol/Creol.g:1000:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1003:7: ( 'while' )
            // nl/cwi/cacoj/creol/Creol.g:1003:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1006:6: ( 'with' )
            // nl/cwi/cacoj/creol/Creol.g:1006:8: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "LOWER_CASE"
    public final void mLOWER_CASE() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1013:2: ( 'a' .. 'z' )
            // nl/cwi/cacoj/creol/Creol.g:1013:4: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER_CASE"

    // $ANTLR start "UPPER_CASE"
    public final void mUPPER_CASE() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1018:2: ( 'A' .. 'Z' )
            // nl/cwi/cacoj/creol/Creol.g:1018:4: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER_CASE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1023:2: ( LOWER_CASE | UPPER_CASE )
            // nl/cwi/cacoj/creol/Creol.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1027:7: ( '0' .. '9' )
            // nl/cwi/cacoj/creol/Creol.g:1027:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1030:8: ( '\"' ( ESCAPE_SEQUENCE | ~ ( '\\\\' | '\"' ) )* '\"' )
            // nl/cwi/cacoj/creol/Creol.g:1030:11: '\"' ( ESCAPE_SEQUENCE | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // nl/cwi/cacoj/creol/Creol.g:1030:15: ( ESCAPE_SEQUENCE | ~ ( '\\\\' | '\"' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:1030:17: ESCAPE_SEQUENCE
            	    {
            	    mESCAPE_SEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // nl/cwi/cacoj/creol/Creol.g:1030:35: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESCAPE_SEQUENCE"
    public final void mESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1035:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESCAPE | OCTAL_ESCAPE )
            int alt4=3;
            switch ( input.LA(1) ) {
            case '\\':
                {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt4=1;
                    }
                    break;
                case 'u':
                    {
                    alt4=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1035:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:1036:6: UNICODE_ESCAPE
                    {
                    mUNICODE_ESCAPE(); 

                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:1037:6: OCTAL_ESCAPE
                    {
                    mOCTAL_ESCAPE(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE_SEQUENCE"

    // $ANTLR start "OCTAL_ESCAPE"
    public final void mOCTAL_ESCAPE() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1042:6: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case '\\':
                {
                switch ( input.LA(2) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                    {
                    switch ( input.LA(3) ) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        switch ( input.LA(4) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                            {
                            alt5=1;
                            }
                            break;
                        default:
                            alt5=2;}

                        }
                        break;
                    default:
                        alt5=3;}

                    }
                    break;
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    switch ( input.LA(3) ) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        alt5=3;}

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1042:10: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // nl/cwi/cacoj/creol/Creol.g:1042:15: ( '0' .. '3' )
                    // nl/cwi/cacoj/creol/Creol.g:1042:16: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // nl/cwi/cacoj/creol/Creol.g:1042:26: ( '0' .. '7' )
                    // nl/cwi/cacoj/creol/Creol.g:1042:27: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // nl/cwi/cacoj/creol/Creol.g:1042:37: ( '0' .. '7' )
                    // nl/cwi/cacoj/creol/Creol.g:1042:38: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:1043:10: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // nl/cwi/cacoj/creol/Creol.g:1043:15: ( '0' .. '7' )
                    // nl/cwi/cacoj/creol/Creol.g:1043:16: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // nl/cwi/cacoj/creol/Creol.g:1043:26: ( '0' .. '7' )
                    // nl/cwi/cacoj/creol/Creol.g:1043:27: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // nl/cwi/cacoj/creol/Creol.g:1044:10: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // nl/cwi/cacoj/creol/Creol.g:1044:15: ( '0' .. '7' )
                    // nl/cwi/cacoj/creol/Creol.g:1044:16: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESCAPE"

    // $ANTLR start "UNICODE_ESCAPE"
    public final void mUNICODE_ESCAPE() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1049:6: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // nl/cwi/cacoj/creol/Creol.g:1049:10: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESCAPE"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // nl/cwi/cacoj/creol/Creol.g:1053:12: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // nl/cwi/cacoj/creol/Creol.g:1053:14: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1057:2: ( ( UNDERSCORE | LOWER_CASE ) ( UNDERSCORE | DIGIT | LETTER | APOSTROPHE )* )
            // nl/cwi/cacoj/creol/Creol.g:1057:4: ( UNDERSCORE | LOWER_CASE ) ( UNDERSCORE | DIGIT | LETTER | APOSTROPHE )*
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // nl/cwi/cacoj/creol/Creol.g:1057:30: ( UNDERSCORE | DIGIT | LETTER | APOSTROPHE )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case '`':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='_' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "CLASS_IDENTIFIER"
    public final void mCLASS_IDENTIFIER() throws RecognitionException {
        try {
            int _type = CLASS_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1061:2: ( UPPER_CASE ( UNDERSCORE | DIGIT | LETTER )* )
            // nl/cwi/cacoj/creol/Creol.g:1061:4: UPPER_CASE ( UNDERSCORE | DIGIT | LETTER )*
            {
            mUPPER_CASE(); 
            // nl/cwi/cacoj/creol/Creol.g:1061:15: ( UNDERSCORE | DIGIT | LETTER )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS_IDENTIFIER"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1064:9: ( ( DIGIT )+ )
            // nl/cwi/cacoj/creol/Creol.g:1064:11: ( DIGIT )+
            {
            // nl/cwi/cacoj/creol/Creol.g:1064:11: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:1064:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1067:7: ( ( '0' | ( '1' .. '9' ( DIGIT )* ) ) DOT ( DIGIT )* ( ( 'e' | 'E' ) ( MINUS )? '1' .. '9' ( DIGIT )* )? )
            // nl/cwi/cacoj/creol/Creol.g:1067:9: ( '0' | ( '1' .. '9' ( DIGIT )* ) ) DOT ( DIGIT )* ( ( 'e' | 'E' ) ( MINUS )? '1' .. '9' ( DIGIT )* )?
            {
            // nl/cwi/cacoj/creol/Creol.g:1067:9: ( '0' | ( '1' .. '9' ( DIGIT )* ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt10=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1067:10: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // nl/cwi/cacoj/creol/Creol.g:1067:16: ( '1' .. '9' ( DIGIT )* )
                    {
                    // nl/cwi/cacoj/creol/Creol.g:1067:16: ( '1' .. '9' ( DIGIT )* )
                    // nl/cwi/cacoj/creol/Creol.g:1067:17: '1' .. '9' ( DIGIT )*
                    {
                    matchRange('1','9'); 
                    // nl/cwi/cacoj/creol/Creol.g:1067:26: ( DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // nl/cwi/cacoj/creol/Creol.g:1067:26: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            mDOT(); 
            // nl/cwi/cacoj/creol/Creol.g:1067:39: ( DIGIT )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:1067:39: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // nl/cwi/cacoj/creol/Creol.g:1067:46: ( ( 'e' | 'E' ) ( MINUS )? '1' .. '9' ( DIGIT )* )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case 'E':
                case 'e':
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1067:47: ( 'e' | 'E' ) ( MINUS )? '1' .. '9' ( DIGIT )*
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // nl/cwi/cacoj/creol/Creol.g:1067:57: ( MINUS )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case '-':
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // nl/cwi/cacoj/creol/Creol.g:1067:57: MINUS
                            {
                            mMINUS(); 

                            }
                            break;

                    }

                    matchRange('1','9'); 
                    // nl/cwi/cacoj/creol/Creol.g:1067:73: ( DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt13=1;
                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // nl/cwi/cacoj/creol/Creol.g:1067:73: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "SCHEMAVAR"
    public final void mSCHEMAVAR() throws RecognitionException {
        try {
            int _type = SCHEMAVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1070:11: ( '$' IDENTIFIER )
            // nl/cwi/cacoj/creol/Creol.g:1070:13: '$' IDENTIFIER
            {
            match('$'); 
            mIDENTIFIER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCHEMAVAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1075:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // nl/cwi/cacoj/creol/Creol.g:1075:7: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1079:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // nl/cwi/cacoj/creol/Creol.g:1079:6: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // nl/cwi/cacoj/creol/Creol.g:1079:11: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:1079:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // nl/cwi/cacoj/creol/Creol.g:1083:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // nl/cwi/cacoj/creol/Creol.g:1083:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // nl/cwi/cacoj/creol/Creol.g:1083:9: (~ ( '\\n' | '\\r' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // nl/cwi/cacoj/creol/Creol.g:1083:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // nl/cwi/cacoj/creol/Creol.g:1083:23: ( '\\r' )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case '\r':
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // nl/cwi/cacoj/creol/Creol.g:1083:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // nl/cwi/cacoj/creol/Creol.g:1:8: ( APOSTROPHE | DIV | MULT | NOT | EQUALITY | AT | XOR | MINUS | LBRACES | RBRACES | LBRACK | RBRACK | LPAREN | PRIORITY | RPAREN | PROJECTION | COLON | DOT | EXCLENATION_MARK | GREATER_THAN | KOMMA | LESS_THAN | NUMBER_SIGN | MOD | PLUS | SEMICOLON | UNDERSCORE | VERTICAL | QUESTION_MARK | ASSIGN | BOX | POW | OR | AND | DOUBLE_EQUAL | INEQUALITY | IMPLICATION | LESS_OR_EQUAL | GREATER_OR_EQUAL | PREPEND | APPEND | BOUND_R | BOUND_L | MAPSTO | EQUIVALENCE | CONCAT | INTERLEAVE | AS | ASSERT | AWAIT | BEGIN | BY | BLOCK | CALLER | CASE | CLASS | COMPONENT | CONSTANT | CONTRACTS | DATATYPE | DO | ELSE | END | ENSURES | EXCEPTION | EXISTS | EXPORTS | EXTERNAL | FALSE | FOR | FORALL | FROM | FUNCTION | HISTORY | IF | IMPLEMENTS | IMPORT | IN | INHERITS | INTERFACE | INV | IS | MEASURE | METHOD | NEW | NIL | NOW | NULL | OBJECT | OF | OP | OUT | POSIT | PRAGMA | PROVE | PROVIDES | RELEASE | REQUIRES | RETURN | SIGNAL | SKIP | SOME | THEN | THIS | THROW | THROWS | TRUE | TRY | VAR | VOLATILE | WHEN | WHERE | WHILE | WITH | STRING | IDENTIFIER | CLASS_IDENTIFIER | INTEGER | FLOAT | SCHEMAVAR | WS | COMMENT | LINE_COMMENT )
        int alt18=123;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // nl/cwi/cacoj/creol/Creol.g:1:10: APOSTROPHE
                {
                mAPOSTROPHE(); 

                }
                break;
            case 2 :
                // nl/cwi/cacoj/creol/Creol.g:1:21: DIV
                {
                mDIV(); 

                }
                break;
            case 3 :
                // nl/cwi/cacoj/creol/Creol.g:1:25: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // nl/cwi/cacoj/creol/Creol.g:1:30: NOT
                {
                mNOT(); 

                }
                break;
            case 5 :
                // nl/cwi/cacoj/creol/Creol.g:1:34: EQUALITY
                {
                mEQUALITY(); 

                }
                break;
            case 6 :
                // nl/cwi/cacoj/creol/Creol.g:1:43: AT
                {
                mAT(); 

                }
                break;
            case 7 :
                // nl/cwi/cacoj/creol/Creol.g:1:46: XOR
                {
                mXOR(); 

                }
                break;
            case 8 :
                // nl/cwi/cacoj/creol/Creol.g:1:50: MINUS
                {
                mMINUS(); 

                }
                break;
            case 9 :
                // nl/cwi/cacoj/creol/Creol.g:1:56: LBRACES
                {
                mLBRACES(); 

                }
                break;
            case 10 :
                // nl/cwi/cacoj/creol/Creol.g:1:64: RBRACES
                {
                mRBRACES(); 

                }
                break;
            case 11 :
                // nl/cwi/cacoj/creol/Creol.g:1:72: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 12 :
                // nl/cwi/cacoj/creol/Creol.g:1:79: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 13 :
                // nl/cwi/cacoj/creol/Creol.g:1:86: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 14 :
                // nl/cwi/cacoj/creol/Creol.g:1:93: PRIORITY
                {
                mPRIORITY(); 

                }
                break;
            case 15 :
                // nl/cwi/cacoj/creol/Creol.g:1:102: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 16 :
                // nl/cwi/cacoj/creol/Creol.g:1:109: PROJECTION
                {
                mPROJECTION(); 

                }
                break;
            case 17 :
                // nl/cwi/cacoj/creol/Creol.g:1:120: COLON
                {
                mCOLON(); 

                }
                break;
            case 18 :
                // nl/cwi/cacoj/creol/Creol.g:1:126: DOT
                {
                mDOT(); 

                }
                break;
            case 19 :
                // nl/cwi/cacoj/creol/Creol.g:1:130: EXCLENATION_MARK
                {
                mEXCLENATION_MARK(); 

                }
                break;
            case 20 :
                // nl/cwi/cacoj/creol/Creol.g:1:147: GREATER_THAN
                {
                mGREATER_THAN(); 

                }
                break;
            case 21 :
                // nl/cwi/cacoj/creol/Creol.g:1:160: KOMMA
                {
                mKOMMA(); 

                }
                break;
            case 22 :
                // nl/cwi/cacoj/creol/Creol.g:1:166: LESS_THAN
                {
                mLESS_THAN(); 

                }
                break;
            case 23 :
                // nl/cwi/cacoj/creol/Creol.g:1:176: NUMBER_SIGN
                {
                mNUMBER_SIGN(); 

                }
                break;
            case 24 :
                // nl/cwi/cacoj/creol/Creol.g:1:188: MOD
                {
                mMOD(); 

                }
                break;
            case 25 :
                // nl/cwi/cacoj/creol/Creol.g:1:192: PLUS
                {
                mPLUS(); 

                }
                break;
            case 26 :
                // nl/cwi/cacoj/creol/Creol.g:1:197: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 27 :
                // nl/cwi/cacoj/creol/Creol.g:1:207: UNDERSCORE
                {
                mUNDERSCORE(); 

                }
                break;
            case 28 :
                // nl/cwi/cacoj/creol/Creol.g:1:218: VERTICAL
                {
                mVERTICAL(); 

                }
                break;
            case 29 :
                // nl/cwi/cacoj/creol/Creol.g:1:227: QUESTION_MARK
                {
                mQUESTION_MARK(); 

                }
                break;
            case 30 :
                // nl/cwi/cacoj/creol/Creol.g:1:241: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 31 :
                // nl/cwi/cacoj/creol/Creol.g:1:248: BOX
                {
                mBOX(); 

                }
                break;
            case 32 :
                // nl/cwi/cacoj/creol/Creol.g:1:252: POW
                {
                mPOW(); 

                }
                break;
            case 33 :
                // nl/cwi/cacoj/creol/Creol.g:1:256: OR
                {
                mOR(); 

                }
                break;
            case 34 :
                // nl/cwi/cacoj/creol/Creol.g:1:259: AND
                {
                mAND(); 

                }
                break;
            case 35 :
                // nl/cwi/cacoj/creol/Creol.g:1:263: DOUBLE_EQUAL
                {
                mDOUBLE_EQUAL(); 

                }
                break;
            case 36 :
                // nl/cwi/cacoj/creol/Creol.g:1:276: INEQUALITY
                {
                mINEQUALITY(); 

                }
                break;
            case 37 :
                // nl/cwi/cacoj/creol/Creol.g:1:287: IMPLICATION
                {
                mIMPLICATION(); 

                }
                break;
            case 38 :
                // nl/cwi/cacoj/creol/Creol.g:1:299: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 

                }
                break;
            case 39 :
                // nl/cwi/cacoj/creol/Creol.g:1:313: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 

                }
                break;
            case 40 :
                // nl/cwi/cacoj/creol/Creol.g:1:330: PREPEND
                {
                mPREPEND(); 

                }
                break;
            case 41 :
                // nl/cwi/cacoj/creol/Creol.g:1:338: APPEND
                {
                mAPPEND(); 

                }
                break;
            case 42 :
                // nl/cwi/cacoj/creol/Creol.g:1:345: BOUND_R
                {
                mBOUND_R(); 

                }
                break;
            case 43 :
                // nl/cwi/cacoj/creol/Creol.g:1:353: BOUND_L
                {
                mBOUND_L(); 

                }
                break;
            case 44 :
                // nl/cwi/cacoj/creol/Creol.g:1:361: MAPSTO
                {
                mMAPSTO(); 

                }
                break;
            case 45 :
                // nl/cwi/cacoj/creol/Creol.g:1:368: EQUIVALENCE
                {
                mEQUIVALENCE(); 

                }
                break;
            case 46 :
                // nl/cwi/cacoj/creol/Creol.g:1:380: CONCAT
                {
                mCONCAT(); 

                }
                break;
            case 47 :
                // nl/cwi/cacoj/creol/Creol.g:1:387: INTERLEAVE
                {
                mINTERLEAVE(); 

                }
                break;
            case 48 :
                // nl/cwi/cacoj/creol/Creol.g:1:398: AS
                {
                mAS(); 

                }
                break;
            case 49 :
                // nl/cwi/cacoj/creol/Creol.g:1:401: ASSERT
                {
                mASSERT(); 

                }
                break;
            case 50 :
                // nl/cwi/cacoj/creol/Creol.g:1:408: AWAIT
                {
                mAWAIT(); 

                }
                break;
            case 51 :
                // nl/cwi/cacoj/creol/Creol.g:1:414: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 52 :
                // nl/cwi/cacoj/creol/Creol.g:1:420: BY
                {
                mBY(); 

                }
                break;
            case 53 :
                // nl/cwi/cacoj/creol/Creol.g:1:423: BLOCK
                {
                mBLOCK(); 

                }
                break;
            case 54 :
                // nl/cwi/cacoj/creol/Creol.g:1:429: CALLER
                {
                mCALLER(); 

                }
                break;
            case 55 :
                // nl/cwi/cacoj/creol/Creol.g:1:436: CASE
                {
                mCASE(); 

                }
                break;
            case 56 :
                // nl/cwi/cacoj/creol/Creol.g:1:441: CLASS
                {
                mCLASS(); 

                }
                break;
            case 57 :
                // nl/cwi/cacoj/creol/Creol.g:1:447: COMPONENT
                {
                mCOMPONENT(); 

                }
                break;
            case 58 :
                // nl/cwi/cacoj/creol/Creol.g:1:457: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 59 :
                // nl/cwi/cacoj/creol/Creol.g:1:466: CONTRACTS
                {
                mCONTRACTS(); 

                }
                break;
            case 60 :
                // nl/cwi/cacoj/creol/Creol.g:1:476: DATATYPE
                {
                mDATATYPE(); 

                }
                break;
            case 61 :
                // nl/cwi/cacoj/creol/Creol.g:1:485: DO
                {
                mDO(); 

                }
                break;
            case 62 :
                // nl/cwi/cacoj/creol/Creol.g:1:488: ELSE
                {
                mELSE(); 

                }
                break;
            case 63 :
                // nl/cwi/cacoj/creol/Creol.g:1:493: END
                {
                mEND(); 

                }
                break;
            case 64 :
                // nl/cwi/cacoj/creol/Creol.g:1:497: ENSURES
                {
                mENSURES(); 

                }
                break;
            case 65 :
                // nl/cwi/cacoj/creol/Creol.g:1:505: EXCEPTION
                {
                mEXCEPTION(); 

                }
                break;
            case 66 :
                // nl/cwi/cacoj/creol/Creol.g:1:515: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 67 :
                // nl/cwi/cacoj/creol/Creol.g:1:522: EXPORTS
                {
                mEXPORTS(); 

                }
                break;
            case 68 :
                // nl/cwi/cacoj/creol/Creol.g:1:530: EXTERNAL
                {
                mEXTERNAL(); 

                }
                break;
            case 69 :
                // nl/cwi/cacoj/creol/Creol.g:1:539: FALSE
                {
                mFALSE(); 

                }
                break;
            case 70 :
                // nl/cwi/cacoj/creol/Creol.g:1:545: FOR
                {
                mFOR(); 

                }
                break;
            case 71 :
                // nl/cwi/cacoj/creol/Creol.g:1:549: FORALL
                {
                mFORALL(); 

                }
                break;
            case 72 :
                // nl/cwi/cacoj/creol/Creol.g:1:556: FROM
                {
                mFROM(); 

                }
                break;
            case 73 :
                // nl/cwi/cacoj/creol/Creol.g:1:561: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 74 :
                // nl/cwi/cacoj/creol/Creol.g:1:570: HISTORY
                {
                mHISTORY(); 

                }
                break;
            case 75 :
                // nl/cwi/cacoj/creol/Creol.g:1:578: IF
                {
                mIF(); 

                }
                break;
            case 76 :
                // nl/cwi/cacoj/creol/Creol.g:1:581: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 77 :
                // nl/cwi/cacoj/creol/Creol.g:1:592: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 78 :
                // nl/cwi/cacoj/creol/Creol.g:1:599: IN
                {
                mIN(); 

                }
                break;
            case 79 :
                // nl/cwi/cacoj/creol/Creol.g:1:602: INHERITS
                {
                mINHERITS(); 

                }
                break;
            case 80 :
                // nl/cwi/cacoj/creol/Creol.g:1:611: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 81 :
                // nl/cwi/cacoj/creol/Creol.g:1:621: INV
                {
                mINV(); 

                }
                break;
            case 82 :
                // nl/cwi/cacoj/creol/Creol.g:1:625: IS
                {
                mIS(); 

                }
                break;
            case 83 :
                // nl/cwi/cacoj/creol/Creol.g:1:628: MEASURE
                {
                mMEASURE(); 

                }
                break;
            case 84 :
                // nl/cwi/cacoj/creol/Creol.g:1:636: METHOD
                {
                mMETHOD(); 

                }
                break;
            case 85 :
                // nl/cwi/cacoj/creol/Creol.g:1:643: NEW
                {
                mNEW(); 

                }
                break;
            case 86 :
                // nl/cwi/cacoj/creol/Creol.g:1:647: NIL
                {
                mNIL(); 

                }
                break;
            case 87 :
                // nl/cwi/cacoj/creol/Creol.g:1:651: NOW
                {
                mNOW(); 

                }
                break;
            case 88 :
                // nl/cwi/cacoj/creol/Creol.g:1:655: NULL
                {
                mNULL(); 

                }
                break;
            case 89 :
                // nl/cwi/cacoj/creol/Creol.g:1:660: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 90 :
                // nl/cwi/cacoj/creol/Creol.g:1:667: OF
                {
                mOF(); 

                }
                break;
            case 91 :
                // nl/cwi/cacoj/creol/Creol.g:1:670: OP
                {
                mOP(); 

                }
                break;
            case 92 :
                // nl/cwi/cacoj/creol/Creol.g:1:673: OUT
                {
                mOUT(); 

                }
                break;
            case 93 :
                // nl/cwi/cacoj/creol/Creol.g:1:677: POSIT
                {
                mPOSIT(); 

                }
                break;
            case 94 :
                // nl/cwi/cacoj/creol/Creol.g:1:683: PRAGMA
                {
                mPRAGMA(); 

                }
                break;
            case 95 :
                // nl/cwi/cacoj/creol/Creol.g:1:690: PROVE
                {
                mPROVE(); 

                }
                break;
            case 96 :
                // nl/cwi/cacoj/creol/Creol.g:1:696: PROVIDES
                {
                mPROVIDES(); 

                }
                break;
            case 97 :
                // nl/cwi/cacoj/creol/Creol.g:1:705: RELEASE
                {
                mRELEASE(); 

                }
                break;
            case 98 :
                // nl/cwi/cacoj/creol/Creol.g:1:713: REQUIRES
                {
                mREQUIRES(); 

                }
                break;
            case 99 :
                // nl/cwi/cacoj/creol/Creol.g:1:722: RETURN
                {
                mRETURN(); 

                }
                break;
            case 100 :
                // nl/cwi/cacoj/creol/Creol.g:1:729: SIGNAL
                {
                mSIGNAL(); 

                }
                break;
            case 101 :
                // nl/cwi/cacoj/creol/Creol.g:1:736: SKIP
                {
                mSKIP(); 

                }
                break;
            case 102 :
                // nl/cwi/cacoj/creol/Creol.g:1:741: SOME
                {
                mSOME(); 

                }
                break;
            case 103 :
                // nl/cwi/cacoj/creol/Creol.g:1:746: THEN
                {
                mTHEN(); 

                }
                break;
            case 104 :
                // nl/cwi/cacoj/creol/Creol.g:1:751: THIS
                {
                mTHIS(); 

                }
                break;
            case 105 :
                // nl/cwi/cacoj/creol/Creol.g:1:756: THROW
                {
                mTHROW(); 

                }
                break;
            case 106 :
                // nl/cwi/cacoj/creol/Creol.g:1:762: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 107 :
                // nl/cwi/cacoj/creol/Creol.g:1:769: TRUE
                {
                mTRUE(); 

                }
                break;
            case 108 :
                // nl/cwi/cacoj/creol/Creol.g:1:774: TRY
                {
                mTRY(); 

                }
                break;
            case 109 :
                // nl/cwi/cacoj/creol/Creol.g:1:778: VAR
                {
                mVAR(); 

                }
                break;
            case 110 :
                // nl/cwi/cacoj/creol/Creol.g:1:782: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 111 :
                // nl/cwi/cacoj/creol/Creol.g:1:791: WHEN
                {
                mWHEN(); 

                }
                break;
            case 112 :
                // nl/cwi/cacoj/creol/Creol.g:1:796: WHERE
                {
                mWHERE(); 

                }
                break;
            case 113 :
                // nl/cwi/cacoj/creol/Creol.g:1:802: WHILE
                {
                mWHILE(); 

                }
                break;
            case 114 :
                // nl/cwi/cacoj/creol/Creol.g:1:808: WITH
                {
                mWITH(); 

                }
                break;
            case 115 :
                // nl/cwi/cacoj/creol/Creol.g:1:813: STRING
                {
                mSTRING(); 

                }
                break;
            case 116 :
                // nl/cwi/cacoj/creol/Creol.g:1:820: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 117 :
                // nl/cwi/cacoj/creol/Creol.g:1:831: CLASS_IDENTIFIER
                {
                mCLASS_IDENTIFIER(); 

                }
                break;
            case 118 :
                // nl/cwi/cacoj/creol/Creol.g:1:848: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 119 :
                // nl/cwi/cacoj/creol/Creol.g:1:856: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 120 :
                // nl/cwi/cacoj/creol/Creol.g:1:862: SCHEMAVAR
                {
                mSCHEMAVAR(); 

                }
                break;
            case 121 :
                // nl/cwi/cacoj/creol/Creol.g:1:872: WS
                {
                mWS(); 

                }
                break;
            case 122 :
                // nl/cwi/cacoj/creol/Creol.g:1:875: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 123 :
                // nl/cwi/cacoj/creol/Creol.g:1:883: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\2\uffff\1\72\1\74\1\uffff\1\77\2\uffff\1\101\2\uffff\1\103\2\uffff"+
        "\1\61\1\uffff\1\107\1\112\2\uffff\1\114\1\uffff\1\117\4\uffff\1"+
        "\120\1\123\2\uffff\21\61\3\uffff\2\176\17\uffff\2\61\7\uffff\1\u0086"+
        "\3\uffff\1\106\1\u008a\1\uffff\1\u008c\2\61\1\u008f\5\61\1\u0097"+
        "\10\61\1\u00a4\1\61\1\u00a9\1\u00aa\7\61\1\u00b3\1\u00b4\13\61\2"+
        "\uffff\1\176\4\61\6\uffff\1\61\1\uffff\2\61\1\uffff\7\61\1\uffff"+
        "\1\61\1\u00d6\6\61\1\u00de\3\61\1\uffff\3\61\1\u00e5\2\uffff\3\61"+
        "\1\u00e9\1\u00ea\1\u00eb\2\61\2\uffff\1\u00ee\12\61\1\u00f9\1\u00fa"+
        "\15\61\1\u010a\5\61\1\u0110\1\uffff\7\61\1\uffff\1\u0118\5\61\1"+
        "\uffff\3\61\3\uffff\1\u0121\1\61\1\uffff\4\61\1\u0127\1\u0128\1"+
        "\u0129\1\u012a\1\61\1\u012c\2\uffff\1\61\1\u012e\2\61\1\u0131\2"+
        "\61\1\u0134\1\61\1\u0136\1\61\1\u0138\1\u0139\1\u013a\1\61\1\uffff"+
        "\1\u013c\4\61\1\uffff\5\61\1\u0146\1\61\1\uffff\10\61\1\uffff\5"+
        "\61\4\uffff\1\u0156\1\uffff\1\61\1\uffff\1\u0158\1\u0159\1\uffff"+
        "\1\61\1\u015b\1\uffff\1\61\1\uffff\1\u015d\3\uffff\1\u015e\1\uffff"+
        "\6\61\1\u0165\2\61\1\uffff\1\u0168\7\61\1\u0170\1\u0171\2\61\1\u0174"+
        "\1\u0175\1\u0176\1\uffff\1\61\2\uffff\1\61\1\uffff\1\61\2\uffff"+
        "\4\61\1\u017e\1\61\1\uffff\1\u0180\1\61\1\uffff\1\61\1\u0183\4\61"+
        "\1\u0188\2\uffff\1\u0189\1\61\3\uffff\2\61\1\u018d\1\61\1\u018f"+
        "\1\61\1\u0191\1\uffff\1\61\1\uffff\1\u0193\1\u0194\1\uffff\1\61"+
        "\1\u0196\2\61\2\uffff\1\u0199\1\u019a\2\uffff\1\u019b\1\uffff\1"+
        "\u019c\1\uffff\1\u019d\2\uffff\1\61\1\uffff\1\u019f\1\61\5\uffff"+
        "\1\u01a1\1\uffff\1\61\1\uffff\1\u01a3\1\uffff";
    static final String DFA18_eofS =
        "\u01a4\uffff";
    static final String DFA18_minS =
        "\1\11\1\uffff\2\52\1\uffff\1\75\2\uffff\1\174\2\uffff\1\135\2\uffff"+
        "\1\157\1\uffff\1\57\1\75\2\uffff\1\75\1\uffff\1\72\4\uffff\1\60"+
        "\1\55\2\uffff\1\163\1\145\2\141\1\154\1\141\1\151\1\146\1\141\2"+
        "\145\1\142\1\145\1\151\1\150\1\141\1\150\3\uffff\2\56\17\uffff\1"+
        "\141\1\163\7\uffff\1\76\3\uffff\1\174\1\76\1\uffff\1\60\1\141\1"+
        "\147\1\60\1\157\1\154\1\141\1\155\1\164\1\60\1\163\1\144\1\143\1"+
        "\154\1\162\1\157\1\156\1\163\1\60\1\160\2\60\1\166\1\141\1\167\1"+
        "\154\1\167\1\154\1\152\2\60\1\164\1\154\1\147\1\151\1\155\1\145"+
        "\1\165\1\162\1\154\1\145\1\164\2\uffff\1\56\1\157\1\147\1\166\1"+
        "\151\6\uffff\1\145\1\uffff\2\151\1\uffff\1\143\1\154\1\145\1\163"+
        "\1\160\1\163\1\141\1\uffff\1\145\1\60\1\165\1\145\1\163\1\157\1"+
        "\145\1\163\1\60\1\155\1\143\1\164\1\uffff\1\154\2\145\1\60\2\uffff"+
        "\1\141\1\163\1\150\3\60\1\154\1\145\2\uffff\1\60\1\145\2\165\1\156"+
        "\1\160\1\145\1\156\1\163\1\157\1\145\2\60\1\141\1\156\1\154\1\150"+
        "\1\162\1\155\1\145\1\164\1\162\1\164\1\156\1\153\1\145\1\60\1\163"+
        "\1\157\1\164\1\162\1\164\1\60\1\uffff\1\162\1\160\1\164\2\162\1"+
        "\145\1\154\1\uffff\1\60\1\164\1\157\1\145\2\162\1\uffff\1\137\1"+
        "\165\1\157\3\uffff\1\60\1\143\1\uffff\1\141\1\151\1\162\1\141\4"+
        "\60\1\167\1\60\2\uffff\1\164\1\60\2\145\1\60\1\151\1\141\1\60\1"+
        "\144\1\60\1\164\3\60\1\162\1\uffff\1\60\1\156\2\141\1\171\1\uffff"+
        "\1\145\1\164\1\163\1\164\1\156\1\60\1\154\1\uffff\1\151\1\162\1"+
        "\155\1\151\1\146\1\151\1\162\1\144\1\uffff\1\164\1\163\1\162\1\156"+
        "\1\154\4\uffff\1\60\1\uffff\1\151\1\uffff\2\60\1\uffff\1\164\1\60"+
        "\1\uffff\1\145\1\uffff\1\60\3\uffff\1\60\1\uffff\1\145\1\156\1\143"+
        "\1\160\1\163\1\151\1\60\1\163\1\141\1\uffff\1\60\1\157\1\171\1\145"+
        "\1\164\1\141\1\155\1\145\2\60\2\145\3\60\1\uffff\1\154\2\uffff\1"+
        "\171\1\uffff\1\163\2\uffff\1\156\2\164\1\145\1\60\1\157\1\uffff"+
        "\1\60\1\154\1\uffff\1\156\1\60\1\156\1\163\1\143\1\160\1\60\2\uffff"+
        "\1\60\1\163\3\uffff\1\145\1\40\1\60\1\164\1\60\1\163\1\60\1\uffff"+
        "\1\156\1\uffff\2\60\1\uffff\1\164\1\60\1\145\1\157\2\uffff\2\60"+
        "\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\2\uffff\1\163\1\uffff\1"+
        "\60\1\162\5\uffff\1\60\1\uffff\1\164\1\uffff\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\176\1\uffff\1\134\1\52\1\uffff\1\76\2\uffff\1\174\2\uffff\1\135"+
        "\2\uffff\1\162\1\uffff\1\57\1\76\2\uffff\1\75\1\uffff\1\75\4\uffff"+
        "\1\172\1\174\2\uffff\1\167\1\171\2\157\1\170\1\165\1\151\1\163\1"+
        "\141\1\145\2\165\1\145\1\157\1\162\1\157\1\151\3\uffff\1\56\1\71"+
        "\17\uffff\1\157\1\163\7\uffff\1\76\3\uffff\2\174\1\uffff\1\172\1"+
        "\141\1\147\1\172\1\157\1\163\1\141\1\156\1\164\1\172\2\163\1\164"+
        "\1\154\1\162\1\157\1\156\1\163\1\172\1\160\2\172\1\166\1\164\1\167"+
        "\1\154\1\167\1\154\1\152\2\172\2\164\1\147\1\151\1\155\1\162\1\171"+
        "\1\162\1\154\1\151\1\164\2\uffff\1\71\1\157\1\147\1\166\1\151\6"+
        "\uffff\1\145\1\uffff\2\151\1\uffff\1\143\1\154\1\145\1\163\1\160"+
        "\1\164\1\141\1\uffff\1\145\1\172\1\165\1\145\1\163\1\157\1\145\1"+
        "\163\1\172\1\155\1\143\1\164\1\uffff\1\154\2\145\1\172\2\uffff\1"+
        "\141\1\163\1\150\3\172\1\154\1\145\2\uffff\1\172\1\145\2\165\1\156"+
        "\1\160\1\145\1\156\1\163\1\157\1\145\2\172\1\141\1\162\1\154\1\150"+
        "\1\162\1\155\1\151\1\164\1\162\1\164\1\156\1\153\1\145\1\172\1\163"+
        "\1\157\1\164\1\162\1\164\1\172\1\uffff\1\162\1\160\1\164\2\162\1"+
        "\145\1\154\1\uffff\1\172\1\164\1\157\1\145\2\162\1\uffff\1\137\1"+
        "\165\1\157\3\uffff\1\172\1\143\1\uffff\1\141\1\151\1\162\1\141\4"+
        "\172\1\167\1\172\2\uffff\1\164\1\172\2\145\1\172\1\151\1\141\1\172"+
        "\1\144\1\172\1\164\3\172\1\162\1\uffff\1\172\1\156\2\141\1\171\1"+
        "\uffff\1\145\1\164\1\163\1\164\1\156\1\172\1\154\1\uffff\1\151\1"+
        "\162\1\155\1\151\1\146\1\151\1\162\1\144\1\uffff\1\164\1\163\1\162"+
        "\1\156\1\154\4\uffff\1\172\1\uffff\1\151\1\uffff\2\172\1\uffff\1"+
        "\164\1\172\1\uffff\1\145\1\uffff\1\172\3\uffff\1\172\1\uffff\1\145"+
        "\1\156\1\143\1\160\1\163\1\151\1\172\1\163\1\141\1\uffff\1\172\1"+
        "\157\1\171\1\145\1\164\1\141\1\155\1\145\2\172\2\145\3\172\1\uffff"+
        "\1\154\2\uffff\1\171\1\uffff\1\163\2\uffff\1\156\2\164\1\145\1\172"+
        "\1\157\1\uffff\1\172\1\154\1\uffff\1\156\1\172\1\156\1\163\1\143"+
        "\1\160\1\172\2\uffff\1\172\1\163\3\uffff\1\145\1\40\1\172\1\164"+
        "\1\172\1\163\1\172\1\uffff\1\156\1\uffff\2\172\1\uffff\1\164\1\172"+
        "\1\145\1\157\2\uffff\2\172\2\uffff\1\172\1\uffff\1\172\1\uffff\1"+
        "\172\2\uffff\1\163\1\uffff\1\172\1\162\5\uffff\1\172\1\uffff\1\164"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\uffff\1\6\1\7\1\uffff\1\11\1\12\1\uffff"+
        "\1\14\1\15\1\uffff\1\17\2\uffff\1\22\1\23\1\uffff\1\25\1\uffff\1"+
        "\27\1\30\1\31\1\32\2\uffff\1\35\1\42\21\uffff\1\163\1\164\1\165"+
        "\2\uffff\1\170\1\171\1\44\1\172\1\173\1\2\1\40\1\3\1\43\1\45\1\5"+
        "\1\50\1\10\1\37\1\13\2\uffff\1\41\1\20\1\36\1\52\1\21\1\47\1\24"+
        "\1\uffff\1\53\1\26\1\33\2\uffff\1\34\52\uffff\1\166\1\167\5\uffff"+
        "\1\55\1\46\1\57\1\54\1\56\1\51\1\uffff\1\60\2\uffff\1\64\7\uffff"+
        "\1\75\14\uffff\1\113\4\uffff\1\116\1\122\10\uffff\1\132\1\133\41"+
        "\uffff\1\77\7\uffff\1\106\6\uffff\1\121\3\uffff\1\125\1\126\1\127"+
        "\2\uffff\1\134\12\uffff\1\154\1\155\17\uffff\1\67\5\uffff\1\76\7"+
        "\uffff\1\110\10\uffff\1\130\5\uffff\1\145\1\146\1\147\1\150\1\uffff"+
        "\1\153\1\uffff\1\157\2\uffff\1\162\2\uffff\1\137\1\uffff\1\135\1"+
        "\uffff\1\62\1\63\1\65\1\uffff\1\70\11\uffff\1\105\17\uffff\1\151"+
        "\1\uffff\1\160\1\161\1\uffff\1\136\1\uffff\1\61\1\66\6\uffff\1\102"+
        "\2\uffff\1\107\7\uffff\1\124\1\131\2\uffff\1\143\1\144\1\152\7\uffff"+
        "\1\100\1\uffff\1\103\2\uffff\1\112\4\uffff\1\123\1\141\2\uffff\1"+
        "\16\1\140\1\uffff\1\72\1\uffff\1\74\1\uffff\1\104\1\111\1\uffff"+
        "\1\117\2\uffff\1\142\1\156\1\71\1\73\1\101\1\uffff\1\120\1\uffff"+
        "\1\114\1\uffff\1\115";
    static final String DFA18_specialS =
        "\u01a4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\66\1\uffff\2\66\22\uffff\1\66\1\23\1\60\1\27\1\65\1\30\1"+
            "\36\1\uffff\1\15\1\17\1\3\1\31\1\25\1\10\1\22\1\2\1\63\11\64"+
            "\1\21\1\32\1\26\1\5\1\24\1\35\1\6\32\62\1\13\1\20\1\14\1\7\1"+
            "\33\1\1\1\37\1\40\1\41\1\42\1\43\1\44\1\61\1\45\1\46\1\47\2"+
            "\61\1\50\1\51\1\52\1\16\1\61\1\53\1\54\1\55\1\61\1\56\1\57\3"+
            "\61\1\11\1\34\1\12\1\4",
            "",
            "\1\70\4\uffff\1\71\15\uffff\1\67\36\uffff\1\36",
            "\1\73",
            "",
            "\1\75\1\76",
            "",
            "",
            "\1\100",
            "",
            "",
            "\1\102",
            "",
            "",
            "\1\105\2\uffff\1\104",
            "",
            "\1\106",
            "\1\110\1\111",
            "",
            "",
            "\1\113",
            "",
            "\1\116\2\uffff\1\115",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\122\116\uffff\1\121",
            "",
            "",
            "\1\124\3\uffff\1\125",
            "\1\126\6\uffff\1\130\14\uffff\1\127",
            "\1\131\12\uffff\1\132\2\uffff\1\133",
            "\1\134\15\uffff\1\135",
            "\1\136\1\uffff\1\137\11\uffff\1\140",
            "\1\141\15\uffff\1\142\2\uffff\1\143\2\uffff\1\144",
            "\1\145",
            "\1\146\6\uffff\1\147\1\150\4\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154\3\uffff\1\155\5\uffff\1\156\5\uffff\1\157",
            "\1\160\3\uffff\1\161\11\uffff\1\162\4\uffff\1\163",
            "\1\164",
            "\1\165\1\uffff\1\166\3\uffff\1\167",
            "\1\170\11\uffff\1\171",
            "\1\172\15\uffff\1\173",
            "\1\174\1\175",
            "",
            "",
            "",
            "\1\177",
            "\1\177\1\uffff\12\u0080",
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
            "\1\u0082\7\uffff\1\u0081\5\uffff\1\u0083",
            "\1\u0084",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0085",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088\75\uffff\1\u0089",
            "",
            "\12\61\7\uffff\32\61\4\uffff\24\61\1\u008b\7\61",
            "\1\u008d",
            "\1\u008e",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0090",
            "\1\u0091\6\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094\1\u0095",
            "\1\u0096",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0098",
            "\1\u0099\16\uffff\1\u009a",
            "\1\u009b\5\uffff\1\u009c\6\uffff\1\u009d\3\uffff\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u00a5",
            "\12\61\7\uffff\32\61\4\uffff\11\61\1\u00a6\13\61\1\u00a7\1"+
            "\61\1\u00a8\4\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u00ab",
            "\1\u00ac\22\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u00b5",
            "\1\u00b6\4\uffff\1\u00b7\2\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\3\uffff\1\u00bd\10\uffff\1\u00be",
            "\1\u00bf\3\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\3\uffff\1\u00c4",
            "\1\u00c5",
            "",
            "",
            "\1\177\1\uffff\12\u0080",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\61\7\uffff\32\61\4\uffff\2\61\1\u00dd\31\61",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u00fb",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102\3\uffff\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u012b",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "",
            "\1\u012d",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u012f",
            "\1\u0130",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0132",
            "\1\u0133",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0135",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0137",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u013b",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\24\61\1\u0155\7\61",
            "",
            "\1\u0157",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u015a",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u015c",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0166",
            "\1\u0167",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0172",
            "\1\u0173",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u0177",
            "",
            "",
            "\1\u0178",
            "",
            "\1\u0179",
            "",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u017f",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0181",
            "",
            "\1\u0182",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u018a",
            "",
            "",
            "",
            "\1\u018b",
            "\1\u018c",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u018e",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0190",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u0192",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u0195",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u0197",
            "\1\u0198",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "",
            "\1\u019e",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "\1\u01a0",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            "",
            "\1\u01a2",
            "",
            "\12\61\7\uffff\32\61\4\uffff\34\61",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( APOSTROPHE | DIV | MULT | NOT | EQUALITY | AT | XOR | MINUS | LBRACES | RBRACES | LBRACK | RBRACK | LPAREN | PRIORITY | RPAREN | PROJECTION | COLON | DOT | EXCLENATION_MARK | GREATER_THAN | KOMMA | LESS_THAN | NUMBER_SIGN | MOD | PLUS | SEMICOLON | UNDERSCORE | VERTICAL | QUESTION_MARK | ASSIGN | BOX | POW | OR | AND | DOUBLE_EQUAL | INEQUALITY | IMPLICATION | LESS_OR_EQUAL | GREATER_OR_EQUAL | PREPEND | APPEND | BOUND_R | BOUND_L | MAPSTO | EQUIVALENCE | CONCAT | INTERLEAVE | AS | ASSERT | AWAIT | BEGIN | BY | BLOCK | CALLER | CASE | CLASS | COMPONENT | CONSTANT | CONTRACTS | DATATYPE | DO | ELSE | END | ENSURES | EXCEPTION | EXISTS | EXPORTS | EXTERNAL | FALSE | FOR | FORALL | FROM | FUNCTION | HISTORY | IF | IMPLEMENTS | IMPORT | IN | INHERITS | INTERFACE | INV | IS | MEASURE | METHOD | NEW | NIL | NOW | NULL | OBJECT | OF | OP | OUT | POSIT | PRAGMA | PROVE | PROVIDES | RELEASE | REQUIRES | RETURN | SIGNAL | SKIP | SOME | THEN | THIS | THROW | THROWS | TRUE | TRY | VAR | VOLATILE | WHEN | WHERE | WHILE | WITH | STRING | IDENTIFIER | CLASS_IDENTIFIER | INTEGER | FLOAT | SCHEMAVAR | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}