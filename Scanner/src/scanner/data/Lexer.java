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
    "\11\0\1\10\1\7\1\13\1\10\1\6\22\0\1\10\1\61\1\11"+
    "\1\26\1\0\1\61\1\55\1\14\1\53\1\53\1\57\1\56\1\53"+
    "\1\24\1\21\1\60\1\2\10\4\1\3\1\53\1\53\1\63\1\62"+
    "\1\64\1\53\1\0\4\5\1\23\1\5\5\1\1\20\10\1\1\16"+
    "\5\1\1\53\1\12\1\53\1\61\1\1\1\0\1\35\1\43\1\37"+
    "\1\27\1\22\1\30\1\36\1\45\1\31\1\1\1\44\1\17\1\33"+
    "\1\32\1\41\1\51\1\1\1\40\1\34\1\42\1\15\1\52\1\47"+
    "\1\25\1\50\1\46\1\53\1\54\1\53\1\53\6\0\1\13\u1fa2\0"+
    "\1\13\1\13\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\2\5\2\2\2\3\1\1"+
    "\1\3\2\1\14\3\10\1\1\6\1\2\2\0\1\2"+
    "\3\4\1\2\1\0\1\7\2\0\2\3\1\10\3\3"+
    "\5\0\1\3\1\11\2\3\1\11\15\3\1\0\1\5"+
    "\2\6\1\12\2\4\1\0\1\10\1\0\1\7\1\13"+
    "\3\3\2\10\3\3\5\0\1\14\2\0\22\3\2\0"+
    "\2\12\2\10\3\3\10\0\13\3\1\0\1\5\1\14"+
    "\4\0\7\3\2\0\2\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[169];
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
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\65\0\u013e"+
    "\0\u0173\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6"+
    "\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e"+
    "\0\u04c3\0\u04f8\0\u052d\0\65\0\u0562\0\u0597\0\u05cc\0\u0601"+
    "\0\u0636\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u0212\0\u073f\0\u0774"+
    "\0\u07a9\0\u07de\0\u0774\0\u0813\0\u013e\0\65\0\u0848\0\u087d"+
    "\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb\0\u09f0\0\u0a25"+
    "\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63\0\u0b98\0\152"+
    "\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40"+
    "\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8"+
    "\0\65\0\u0f1d\0\u0f52\0\65\0\u0f87\0\u0fbc\0\u0ff1\0\u013e"+
    "\0\65\0\u1026\0\u105b\0\u1090\0\u10c5\0\65\0\u10fa\0\u112f"+
    "\0\u1164\0\u1199\0\u11ce\0\u1203\0\u1238\0\u126d\0\u1199\0\u12a2"+
    "\0\u12d7\0\u130c\0\u1341\0\u1376\0\u13ab\0\u13e0\0\u1415\0\u144a"+
    "\0\u147f\0\u14b4\0\u14e9\0\u151e\0\u1553\0\u1588\0\u15bd\0\u15f2"+
    "\0\u1627\0\u165c\0\u1691\0\u16c6\0\u16fb\0\u1730\0\65\0\u1765"+
    "\0\u0774\0\u179a\0\u17cf\0\u1804\0\u1839\0\u186e\0\u18a3\0\u18d8"+
    "\0\u190d\0\u1942\0\u1977\0\u19ac\0\u19e1\0\u1a16\0\u1a4b\0\u1a80"+
    "\0\u1ab5\0\u1aea\0\u1b1f\0\u1b54\0\u1b89\0\u1bbe\0\u1bf3\0\u1c28"+
    "\0\u16c6\0\65\0\u1c5d\0\u1c92\0\u1cc7\0\u1cfc\0\u1d31\0\u1d66"+
    "\0\u1d9b\0\u1dd0\0\u1e05\0\u1e3a\0\u1e6f\0\u1ea4\0\u1ed9\0\u1f0e"+
    "\0\u1f43";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[169];
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
    "\1\2\1\0\1\11\1\12\1\3\1\13\1\3\1\14"+
    "\1\15\1\3\1\16\1\3\1\17\1\20\1\21\1\22"+
    "\2\3\1\23\1\24\1\25\1\26\1\27\1\3\1\30"+
    "\1\31\3\3\1\32\2\3\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\2\40\1\42\1\43\66\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\24\3\14\0\1\44\1\45\1\44\14\0\1\46"+
    "\3\0\1\47\40\0\1\50\1\51\2\5\1\50\7\0"+
    "\2\52\2\53\1\46\2\54\1\0\1\50\1\0\24\50"+
    "\21\0\1\7\55\0\11\55\1\56\1\57\52\55\6\60"+
    "\2\0\55\60\1\0\1\3\1\0\3\3\7\0\4\3"+
    "\1\0\2\3\1\0\1\3\1\0\3\3\1\61\20\3"+
    "\13\0\1\3\1\0\3\3\7\0\4\3\1\0\2\3"+
    "\1\0\1\3\1\0\12\3\1\62\11\3\14\0\3\63"+
    "\61\0\1\3\1\0\3\3\7\0\2\3\1\64\1\3"+
    "\1\0\2\3\1\0\1\65\1\0\3\3\1\66\20\3"+
    "\36\0\1\34\35\0\1\34\17\0\1\67\4\0\1\70"+
    "\4\0\1\71\1\0\1\72\1\0\1\73\32\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\1\74\1\3\1\0"+
    "\1\3\1\0\12\3\1\75\11\3\13\0\1\3\1\0"+
    "\3\3\7\0\2\3\1\76\1\3\1\0\2\3\1\0"+
    "\1\3\1\0\12\3\1\77\11\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\1\3\1\100\1\3\1\101\20\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\2\3\1\102\10\3\1\103\2\3\1\104\1\3\1\105"+
    "\3\3\13\0\1\3\1\0\3\3\7\0\1\106\3\3"+
    "\1\0\2\3\1\0\1\3\1\0\24\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\12\3\1\106\11\3\13\0\1\3\1\0\3\3"+
    "\7\0\4\3\1\0\2\3\1\0\1\3\1\0\6\3"+
    "\1\64\3\3\1\107\3\3\1\110\5\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\1\111\1\3\1\0"+
    "\1\3\1\0\24\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\21\3\1\112"+
    "\2\3\13\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\2\3\1\0\1\3\1\0\11\3\1\113\12\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\16\3\1\114\5\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\12\3\1\115\11\3\66\0\1\34\5\0\1\34\57\0"+
    "\1\34\4\0\1\34\60\0\1\34\3\0\1\34\64\0"+
    "\1\34\61\0\1\116\1\117\1\0\1\34\64\0\1\34"+
    "\1\40\63\0\1\34\1\0\1\40\2\0\1\44\1\45"+
    "\1\44\10\0\2\120\2\121\46\0\3\45\62\0\4\122"+
    "\14\0\2\122\3\0\2\122\4\0\1\122\1\0\1\122"+
    "\3\0\1\122\22\0\1\50\1\0\3\50\7\0\4\50"+
    "\1\0\2\50\1\0\1\50\1\0\24\50\14\0\3\51"+
    "\10\0\2\123\2\124\1\46\2\125\42\0\1\50\1\0"+
    "\3\50\7\0\2\50\2\53\1\0\2\50\1\0\1\50"+
    "\1\0\24\50\13\0\1\50\1\0\2\126\1\50\7\0"+
    "\4\50\1\0\2\50\1\127\1\50\1\0\24\50\12\0"+
    "\11\55\1\130\1\57\52\55\14\0\1\131\51\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\2\3\1\132\2\3\1\133\16\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\3\3\1\134\20\3\14\0\3\63\10\0\2\135"+
    "\2\136\45\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\2\3\1\0\1\3\1\0\5\3\1\137\16\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\13\3\1\140\10\3\13\0\1\3\1\0"+
    "\3\3\7\0\1\141\3\3\1\0\2\3\1\0\1\3"+
    "\1\0\24\3\44\0\1\142\51\0\1\143\12\0\1\144"+
    "\5\0\1\145\46\0\1\146\72\0\1\147\1\0\1\150"+
    "\54\0\1\151\43\0\1\3\1\0\3\3\7\0\4\3"+
    "\1\0\2\3\1\0\1\3\1\0\1\3\1\152\22\3"+
    "\13\0\1\3\1\0\3\3\7\0\1\153\3\3\1\0"+
    "\2\3\1\0\1\3\1\0\24\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\12\3\1\154\11\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\11\3\1\100"+
    "\12\3\13\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\2\3\1\0\1\3\1\0\13\3\1\100\10\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\7\3\1\155\7\3\1\156\4\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\6\3\1\157\2\3\1\160\12\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\12\3\1\161\11\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\2\3\1\162\21\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\13\3\1\163"+
    "\10\3\13\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\2\3\1\0\1\3\1\0\3\3\1\164\20\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\6\3\1\77\15\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\7\3\1\165\3\3\1\166\10\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\22\3\1\167\1\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\1\170\1\3\1\0\1\3\1\0\24\3"+
    "\13\0\1\3\1\0\3\3\7\0\4\3\1\0\2\3"+
    "\1\0\1\3\1\0\2\3\1\171\21\3\13\0\1\3"+
    "\1\0\3\3\7\0\2\3\1\172\1\3\1\0\2\3"+
    "\1\0\1\3\1\0\2\3\1\173\21\3\12\0\57\174"+
    "\1\175\5\174\6\117\1\6\1\7\55\117\17\0\2\121"+
    "\46\0\4\122\7\0\2\176\2\177\1\0\2\122\3\0"+
    "\2\122\4\0\1\122\1\0\1\122\3\0\1\122\40\0"+
    "\2\124\47\0\2\63\17\0\1\127\41\0\1\50\1\63"+
    "\2\126\1\50\7\0\2\200\2\201\1\0\2\50\1\0"+
    "\1\50\1\0\24\50\15\0\2\63\61\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\12\3\1\202\11\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\2\3\1\203"+
    "\21\3\13\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\2\3\1\0\1\3\1\0\7\3\1\100\14\3\31\0"+
    "\2\136\45\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\1\100\1\3\1\0\1\3\1\0\24\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\1\204\1\3\1\0"+
    "\1\3\1\0\24\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\4\3\1\100"+
    "\17\3\41\0\1\205\66\0\1\206\2\0\1\207\57\0"+
    "\1\210\75\0\1\211\54\0\1\212\73\0\1\213\61\0"+
    "\1\214\31\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\2\3\1\0\1\3\1\0\6\3\1\215\15\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\14\3\1\171\7\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\6\3\1\101\15\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\3\3\1\216"+
    "\20\3\13\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\1\217\1\3\1\0\1\3\1\0\24\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\13\3\1\220\10\3\13\0\1\3\1\0\3\3"+
    "\7\0\1\221\3\3\1\0\2\3\1\0\1\3\1\0"+
    "\24\3\13\0\1\3\1\0\3\3\7\0\4\3\1\0"+
    "\2\3\1\0\1\3\1\0\11\3\1\101\12\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\13\3\1\222\10\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\12\3\1\100\11\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\5\3\1\101"+
    "\5\3\1\223\10\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\2\3\1\224"+
    "\21\3\13\0\1\3\1\0\3\3\7\0\1\204\3\3"+
    "\1\0\2\3\1\0\1\3\1\0\24\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\1\225\1\3\1\0"+
    "\1\3\1\0\24\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\6\3\1\226"+
    "\15\3\13\0\1\3\1\0\3\3\7\0\2\3\1\137"+
    "\1\3\1\0\2\3\1\0\1\3\1\0\24\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\2\3\1\0"+
    "\1\3\1\0\6\3\1\227\15\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\1\100\23\3\12\0\57\174\1\230\64\174\1\230\1\231"+
    "\4\174\17\0\2\177\45\0\1\50\1\0\3\50\7\0"+
    "\2\50\2\201\1\0\2\50\1\0\1\50\1\0\24\50"+
    "\13\0\1\3\1\0\3\3\7\0\4\3\1\0\2\3"+
    "\1\0\1\3\1\0\3\3\1\100\20\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\7\3\1\155\14\3\13\0\1\3\1\0\3\3"+
    "\7\0\4\3\1\0\2\3\1\0\1\3\1\0\11\3"+
    "\1\202\12\3\34\0\1\206\72\0\1\232\56\0\1\232"+
    "\73\0\1\206\74\0\1\233\54\0\1\234\52\0\1\235"+
    "\101\0\1\236\31\0\1\3\1\0\3\3\7\0\1\237"+
    "\3\3\1\0\2\3\1\0\1\3\1\0\24\3\13\0"+
    "\1\3\1\0\3\3\7\0\4\3\1\0\1\173\1\3"+
    "\1\0\1\3\1\0\24\3\13\0\1\3\1\0\3\3"+
    "\7\0\4\3\1\0\2\3\1\0\1\3\1\0\12\3"+
    "\1\240\11\3\13\0\1\3\1\0\3\3\7\0\4\3"+
    "\1\0\2\3\1\0\1\3\1\0\2\3\1\241\21\3"+
    "\13\0\1\3\1\0\3\3\7\0\4\3\1\0\2\3"+
    "\1\0\1\3\1\0\10\3\1\101\13\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\10\3\1\242\13\3\13\0\1\3\1\0\3\3"+
    "\7\0\4\3\1\0\2\3\1\0\1\3\1\0\2\3"+
    "\1\243\21\3\13\0\1\3\1\0\3\3\7\0\4\3"+
    "\1\0\2\3\1\0\1\3\1\0\5\3\1\244\16\3"+
    "\13\0\1\3\1\0\3\3\7\0\4\3\1\0\2\3"+
    "\1\0\1\3\1\0\1\245\23\3\13\0\1\3\1\0"+
    "\3\3\7\0\4\3\1\0\2\3\1\0\1\3\1\0"+
    "\15\3\1\100\6\3\13\0\1\3\1\0\3\3\7\0"+
    "\4\3\1\0\2\3\1\0\1\3\1\0\13\3\1\114"+
    "\10\3\12\0\57\174\1\230\1\7\4\174\40\0\1\232"+
    "\56\0\1\207\47\0\1\246\104\0\1\247\30\0\1\3"+
    "\1\0\3\3\7\0\2\3\1\101\1\3\1\0\2\3"+
    "\1\0\1\3\1\0\24\3\13\0\1\3\1\0\3\3"+
    "\7\0\4\3\1\0\2\3\1\0\1\3\1\0\1\3"+
    "\1\100\22\3\13\0\1\3\1\0\3\3\7\0\4\3"+
    "\1\0\2\3\1\0\1\3\1\0\10\3\1\100\13\3"+
    "\13\0\1\3\1\0\3\3\7\0\4\3\1\0\2\3"+
    "\1\0\1\3\1\0\16\3\1\100\5\3\13\0\1\3"+
    "\1\0\3\3\7\0\4\3\1\0\2\3\1\0\1\3"+
    "\1\0\3\3\1\250\20\3\13\0\1\3\1\0\3\3"+
    "\7\0\4\3\1\0\2\3\1\0\1\3\1\0\13\3"+
    "\1\251\10\3\13\0\1\3\1\0\3\3\7\0\4\3"+
    "\1\0\1\240\1\3\1\0\1\3\1\0\24\3\41\0"+
    "\1\207\73\0\1\207\27\0\1\3\1\0\3\3\7\0"+
    "\1\137\3\3\1\0\2\3\1\0\1\3\1\0\24\3"+
    "\13\0\1\3\1\0\3\3\7\0\4\3\1\0\1\77"+
    "\1\3\1\0\1\3\1\0\24\3\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8056];
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
    "\1\1\1\11\4\1\1\11\24\1\1\11\11\1\2\0"+
    "\5\1\1\0\1\11\2\0\6\1\5\0\22\1\1\0"+
    "\2\1\1\11\2\1\1\11\1\0\1\1\1\0\1\1"+
    "\1\11\4\1\1\11\3\1\5\0\1\1\2\0\22\1"+
    "\2\0\1\1\1\11\5\1\10\0\13\1\1\0\1\1"+
    "\1\11\4\0\7\1\2\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[169];
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
    while (i < 198) {
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
            { lexeme= lexema(LITERAL_FLOAT,yytext()); return LITERAL_FLOAT;
            }
          case 20: break;
          case 9: 
            { lexeme= lexema(PALABRA_RESERVADA,yytext()); return PALABRA_RESERVADA;
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
