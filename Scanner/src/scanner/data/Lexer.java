/* The following code was generated by JFlex 1.6.1 */

package scanner.data;
import static scanner.data.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/scanner/data/lexer.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\7\1\13\1\10\1\6\22\0\1\10\1\56\1\11"+
    "\1\17\1\0\1\56\1\51\1\14\1\47\1\47\1\54\1\52\1\47"+
    "\1\53\1\15\1\55\1\2\10\4\1\3\1\47\1\47\1\60\1\57"+
    "\1\61\1\47\1\0\6\5\24\1\1\47\1\12\1\47\1\56\1\1"+
    "\1\0\1\30\1\37\1\33\1\20\1\21\1\22\1\31\1\41\1\23"+
    "\1\1\1\40\1\25\1\26\1\24\1\35\1\45\1\1\1\34\1\27"+
    "\1\36\1\32\1\46\1\43\1\16\1\44\1\42\1\47\1\50\1\47"+
    "\1\47\6\0\1\13\u1fa2\0\1\13\1\13\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\2\5\2\2\2\1\17\3"+
    "\10\1\1\6\1\2\2\0\1\2\1\4\1\0\1\7"+
    "\7\0\1\3\1\10\5\3\1\10\17\3\1\0\1\5"+
    "\1\11\1\12\1\7\1\13\4\0\1\14\3\0\30\3"+
    "\12\0\16\3\1\0\1\5\1\0\1\14\3\0\7\3"+
    "\2\0\2\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\62\0\u012c"+
    "\0\u015e\0\62\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a"+
    "\0\u02bc\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa"+
    "\0\u05dc\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u012c\0\62\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866"+
    "\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6"+
    "\0\144\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54"+
    "\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4"+
    "\0\u0d16\0\u0d48\0\u06a4\0\u06d6\0\u012c\0\62\0\u0d7a\0\u0dac"+
    "\0\u0dde\0\u0e10\0\u0e42\0\u0e74\0\u0ea6\0\u0e42\0\u0ed8\0\u0f0a"+
    "\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036\0\u1068\0\u109a"+
    "\0\u10cc\0\u10fe\0\u1130\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a"+
    "\0\u125c\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356\0\u1388\0\u13ba"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u154a"+
    "\0\u157c\0\u15ae\0\u15e0\0\u1612\0\u1644\0\u1676\0\u16a8\0\u16da"+
    "\0\u170c\0\u173e\0\u1770\0\u17a2\0\u17d4\0\u1806\0\u1838\0\u1388"+
    "\0\u186a\0\62\0\u189c\0\u18ce\0\u1900\0\u1932\0\u1964\0\u1996"+
    "\0\u19c8\0\u19fa\0\u1a2c\0\u1a5e\0\u1a90\0\u1ac2\0\u1af4\0\u1b26";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\5\1\3\1\6\2\7\1\10"+
    "\1\2\1\0\1\11\1\12\1\3\1\13\1\14\1\15"+
    "\1\16\1\17\1\3\1\20\1\3\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\3\1\27\1\30\3\3\1\31"+
    "\2\3\1\32\1\12\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\2\37\1\41\1\42\63\0\1\3\1\0\3\3"+
    "\10\0\1\3\1\0\27\3\15\0\1\43\1\44\1\43"+
    "\10\0\1\45\1\46\44\0\1\47\1\50\2\5\1\47"+
    "\7\0\1\45\1\47\1\0\27\47\22\0\1\7\52\0"+
    "\11\51\1\52\1\53\47\51\6\54\2\0\52\54\20\0"+
    "\1\55\1\56\1\0\1\57\2\0\1\60\3\0\1\61"+
    "\30\0\1\3\1\0\3\3\10\0\1\3\1\0\1\3"+
    "\1\62\13\3\1\63\11\3\14\0\1\3\1\0\3\3"+
    "\10\0\1\64\1\0\4\3\1\65\1\66\21\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\5\3\1\67"+
    "\7\3\1\70\11\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\2\3\1\71\1\3\1\72\22\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\15\3\1\73"+
    "\11\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\3\3\1\74\12\3\1\75\2\3\1\76\1\3\1\77"+
    "\3\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\12\3\1\100\14\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\15\3\1\100\11\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\4\3\1\101\22\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\10\3\1\66"+
    "\4\3\1\102\3\3\1\103\5\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\1\3\1\104\25\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\24\3\1\105"+
    "\2\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\14\3\1\106\12\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\21\3\1\107\5\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\15\3\1\110\11\3\63\0"+
    "\1\12\6\0\1\12\53\0\1\12\5\0\1\12\54\0"+
    "\1\12\4\0\1\12\55\0\1\12\3\0\1\12\61\0"+
    "\1\12\56\0\1\111\1\112\1\0\1\12\61\0\1\12"+
    "\1\37\60\0\1\12\1\0\1\37\2\0\1\43\1\44"+
    "\1\43\57\0\3\44\57\0\3\113\57\0\4\114\12\0"+
    "\3\114\5\0\1\114\2\0\1\114\3\0\1\114\23\0"+
    "\1\47\1\0\3\47\10\0\1\47\1\0\27\47\15\0"+
    "\3\50\10\0\1\45\44\0\11\51\1\115\1\53\47\51"+
    "\14\0\1\116\66\0\1\117\64\0\1\120\1\121\6\0"+
    "\1\122\47\0\1\123\1\0\1\124\56\0\1\125\64\0"+
    "\1\126\36\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\2\3\1\127\24\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\12\3\1\130\14\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\16\3\1\131\10\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\12\3\1\132"+
    "\14\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\7\3\1\133\17\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\15\3\1\134\11\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\14\3\1\71\12\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\16\3\1\71"+
    "\10\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\4\3\1\135\22\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\11\3\1\136\10\3\1\137\4\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\10\3\1\140"+
    "\3\3\1\141\12\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\15\3\1\142\11\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\3\3\1\143\23\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\16\3\1\144"+
    "\10\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\3\3\1\145\3\3\1\146\17\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\4\3\1\147\22\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\10\3\1\70"+
    "\16\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\11\3\1\150\4\3\1\151\10\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\25\3\1\152\1\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\1\3\1\153"+
    "\25\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\3\3\1\154\23\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\3\3\1\155\1\3\1\156\21\3\13\0"+
    "\54\157\1\160\5\157\6\112\1\6\1\7\52\112\22\0"+
    "\1\161\57\0\1\162\64\0\1\163\3\0\1\164\66\0"+
    "\1\165\45\0\1\166\74\0\1\167\55\0\1\170\33\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\10\3\1\171"+
    "\16\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\17\3\1\154\7\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\1\3\1\172\25\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\6\3\1\71\20\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\1\3\1\71"+
    "\25\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\10\3\1\72\16\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\11\3\1\71\15\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\4\3\1\173\22\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\1\3\1\174"+
    "\25\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\16\3\1\175\10\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\12\3\1\176\14\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\14\3\1\72\12\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\16\3\1\177"+
    "\10\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\15\3\1\71\11\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\15\3\1\200\11\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\3\3\1\201\23\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\7\3\1\72"+
    "\6\3\1\202\10\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\3\3\1\203\23\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\12\3\1\172\14\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\1\3\1\204"+
    "\25\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\10\3\1\205\16\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\5\3\1\133\21\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\1\71\26\3\14\0\1\3"+
    "\1\0\3\3\10\0\1\3\1\0\10\3\1\206\16\3"+
    "\13\0\54\157\1\207\61\157\1\207\1\210\4\157\23\0"+
    "\1\211\61\0\1\163\60\0\1\212\60\0\1\212\75\0"+
    "\1\213\45\0\1\163\65\0\1\214\63\0\1\215\33\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\12\3\1\216"+
    "\14\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\14\3\1\200\12\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\1\3\1\155\25\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\15\3\1\217\11\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\3\3\1\220"+
    "\23\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\13\3\1\72\13\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\13\3\1\221\13\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\4\3\1\71\22\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\11\3\1\136"+
    "\15\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\3\3\1\222\23\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\7\3\1\223\17\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\1\224\26\3\14\0\1\3"+
    "\1\0\3\3\10\0\1\3\1\0\20\3\1\71\6\3"+
    "\14\0\1\3\1\0\3\3\10\0\1\3\1\0\16\3"+
    "\1\107\10\3\13\0\54\157\1\207\1\7\4\157\24\0"+
    "\1\164\71\0\1\212\57\0\1\225\57\0\1\226\32\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\5\3\1\72"+
    "\21\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\2\3\1\71\24\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\13\3\1\71\13\3\14\0\1\3\1\0"+
    "\3\3\10\0\1\3\1\0\21\3\1\71\5\3\14\0"+
    "\1\3\1\0\3\3\10\0\1\3\1\0\4\3\1\227"+
    "\22\3\14\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\16\3\1\230\10\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\1\3\1\217\25\3\33\0\1\164\72\0"+
    "\1\164\31\0\1\3\1\0\3\3\10\0\1\3\1\0"+
    "\12\3\1\133\14\3\14\0\1\3\1\0\3\3\10\0"+
    "\1\3\1\0\1\3\1\70\25\3\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7000];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\4\1\1\11\2\1\1\11\32\1\2\0"+
    "\2\1\1\0\1\11\7\0\27\1\1\0\4\1\1\11"+
    "\4\0\1\1\3\0\30\1\12\0\16\1\1\0\1\1"+
    "\1\0\1\11\3\0\7\1\2\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private Lexema lexema(Token type) {
        return new Lexema(type, yyline, yycolumn);
    }
    private Lexema lexema(Token type, Object value) {
        return new Lexema(type, value, yyline, yycolumn);
    }
    public String token;
    public Lexema lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 186) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme= lexema(OPERADOR,yytext()); return OPERADOR;
            }
          case 13: break;
          case 2: 
            { lexeme = lexema(ERROR); return ERROR;
            }
          case 14: break;
          case 3: 
            { lexeme = lexema(IDENTIFICADOR,yytext()); return IDENTIFICADOR;
            }
          case 15: break;
          case 4: 
            { lexeme= lexema(LITERAL_ENTERO,yytext()); return LITERAL_ENTERO;
            }
          case 16: break;
          case 5: 
            { /*Ignorar*/
            }
          case 17: break;
          case 6: 
            { lexeme= lexema(LITERAL_OCTAL,yytext()); return LITERAL_OCTAL;
            }
          case 18: break;
          case 7: 
            { lexeme= lexema(LITERAL_STRING,yytext()); return LITERAL_STRING;
            }
          case 19: break;
          case 8: 
            { lexeme= lexema(PALABRA_RESERVADA,yytext()); return PALABRA_RESERVADA;
            }
          case 20: break;
          case 9: 
            { lexeme= lexema(LITERAL_FLOAT,yytext()); return LITERAL_FLOAT;
            }
          case 21: break;
          case 10: 
            { lexeme= lexema(LITERAL_HEXADECIMAL,yytext()); return LITERAL_HEXADECIMAL;
            }
          case 22: break;
          case 11: 
            { lexeme= lexema(LITERAL_CARACTER,yytext()); return LITERAL_CARACTER;
            }
          case 23: break;
          case 12: 
            { lexeme= lexema(DIRECTIVA,yytext()); return DIRECTIVA;
            }
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
