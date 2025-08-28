// Generated from grammar/Juan.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JuanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, SINO=2, IMPRIMIR=3, MIENTRAS=4, FIN=5, ENTERO=6, CADENA=7, SUMAR=8, 
		RESTAR=9, MULTIPLICAR=10, DIVIDIR=11, MENOR=12, MAYOR=13, MENOR_IGUAL=14, 
		MAYOR_IGUAL=15, IGUALDAD=16, DIFERENTE=17, IGUAL=18, PAREN_IZQ=19, PAREN_DER=20, 
		PUNTOYCOMA=21, ID=22, INT=23, STRING=24, WS=25, COMMENT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SI", "SINO", "IMPRIMIR", "MIENTRAS", "FIN", "ENTERO", "CADENA", "SUMAR", 
			"RESTAR", "MULTIPLICAR", "DIVIDIR", "MENOR", "MAYOR", "MENOR_IGUAL", 
			"MAYOR_IGUAL", "IGUALDAD", "DIFERENTE", "IGUAL", "PAREN_IZQ", "PAREN_DER", 
			"PUNTOYCOMA", "ID", "INT", "STRING", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'si'", "'sino'", "'imprimir'", "'mientras'", "'fin'", "'entero'", 
			"'cadena'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'='", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "SINO", "IMPRIMIR", "MIENTRAS", "FIN", "ENTERO", "CADENA", 
			"SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", "MENOR", "MAYOR", "MENOR_IGUAL", 
			"MAYOR_IGUAL", "IGUALDAD", "DIFERENTE", "IGUAL", "PAREN_IZQ", "PAREN_DER", 
			"PUNTOYCOMA", "ID", "INT", "STRING", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JuanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Juan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00a8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u0084\b\u0015\n\u0015\f\u0015\u0087\t\u0015\u0001\u0016"+
		"\u0004\u0016\u008a\b\u0016\u000b\u0016\f\u0016\u008b\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0092\b\u0017\n\u0017\f\u0017"+
		"\u0095\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u009a\b"+
		"\u0018\u000b\u0018\f\u0018\u009b\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u00a2\b\u0019\n\u0019\f\u0019\u00a5\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0006\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\""+
		"\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00ad\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001"+
		"\u0000\u0000\u0000\u00038\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000"+
		"\u0000\u0007F\u0001\u0000\u0000\u0000\tO\u0001\u0000\u0000\u0000\u000b"+
		"S\u0001\u0000\u0000\u0000\rZ\u0001\u0000\u0000\u0000\u000fa\u0001\u0000"+
		"\u0000\u0000\u0011c\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000"+
		"\u0015g\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019k"+
		"\u0001\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000\u001dp\u0001\u0000"+
		"\u0000\u0000\u001fs\u0001\u0000\u0000\u0000!v\u0001\u0000\u0000\u0000"+
		"#y\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000\u0000\'}\u0001\u0000\u0000"+
		"\u0000)\u007f\u0001\u0000\u0000\u0000+\u0081\u0001\u0000\u0000\u0000-"+
		"\u0089\u0001\u0000\u0000\u0000/\u008d\u0001\u0000\u0000\u00001\u0099\u0001"+
		"\u0000\u0000\u00003\u009f\u0001\u0000\u0000\u000056\u0005s\u0000\u0000"+
		"67\u0005i\u0000\u00007\u0002\u0001\u0000\u0000\u000089\u0005s\u0000\u0000"+
		"9:\u0005i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005o\u0000\u0000<\u0004"+
		"\u0001\u0000\u0000\u0000=>\u0005i\u0000\u0000>?\u0005m\u0000\u0000?@\u0005"+
		"p\u0000\u0000@A\u0005r\u0000\u0000AB\u0005i\u0000\u0000BC\u0005m\u0000"+
		"\u0000CD\u0005i\u0000\u0000DE\u0005r\u0000\u0000E\u0006\u0001\u0000\u0000"+
		"\u0000FG\u0005m\u0000\u0000GH\u0005i\u0000\u0000HI\u0005e\u0000\u0000"+
		"IJ\u0005n\u0000\u0000JK\u0005t\u0000\u0000KL\u0005r\u0000\u0000LM\u0005"+
		"a\u0000\u0000MN\u0005s\u0000\u0000N\b\u0001\u0000\u0000\u0000OP\u0005"+
		"f\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005n\u0000\u0000R\n\u0001\u0000"+
		"\u0000\u0000ST\u0005e\u0000\u0000TU\u0005n\u0000\u0000UV\u0005t\u0000"+
		"\u0000VW\u0005e\u0000\u0000WX\u0005r\u0000\u0000XY\u0005o\u0000\u0000"+
		"Y\f\u0001\u0000\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005a\u0000\u0000"+
		"\\]\u0005d\u0000\u0000]^\u0005e\u0000\u0000^_\u0005n\u0000\u0000_`\u0005"+
		"a\u0000\u0000`\u000e\u0001\u0000\u0000\u0000ab\u0005+\u0000\u0000b\u0010"+
		"\u0001\u0000\u0000\u0000cd\u0005-\u0000\u0000d\u0012\u0001\u0000\u0000"+
		"\u0000ef\u0005*\u0000\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005/\u0000"+
		"\u0000h\u0016\u0001\u0000\u0000\u0000ij\u0005<\u0000\u0000j\u0018\u0001"+
		"\u0000\u0000\u0000kl\u0005>\u0000\u0000l\u001a\u0001\u0000\u0000\u0000"+
		"mn\u0005<\u0000\u0000no\u0005=\u0000\u0000o\u001c\u0001\u0000\u0000\u0000"+
		"pq\u0005>\u0000\u0000qr\u0005=\u0000\u0000r\u001e\u0001\u0000\u0000\u0000"+
		"st\u0005=\u0000\u0000tu\u0005=\u0000\u0000u \u0001\u0000\u0000\u0000v"+
		"w\u0005!\u0000\u0000wx\u0005=\u0000\u0000x\"\u0001\u0000\u0000\u0000y"+
		"z\u0005=\u0000\u0000z$\u0001\u0000\u0000\u0000{|\u0005(\u0000\u0000|&"+
		"\u0001\u0000\u0000\u0000}~\u0005)\u0000\u0000~(\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005;\u0000\u0000\u0080*\u0001\u0000\u0000\u0000\u0081\u0085"+
		"\u0007\u0000\u0000\u0000\u0082\u0084\u0007\u0001\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086,\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0007"+
		"\u0002\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c.\u0001\u0000\u0000\u0000\u008d\u0093\u0005\""+
		"\u0000\u0000\u008e\u008f\u0005\\\u0000\u0000\u008f\u0092\u0005\"\u0000"+
		"\u0000\u0090\u0092\b\u0003\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\"\u0000\u0000\u00970\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0007\u0004\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0006\u0018\u0000\u0000\u009e2\u0001\u0000\u0000\u0000\u009f\u00a3"+
		"\u0005#\u0000\u0000\u00a0\u00a2\b\u0005\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0006"+
		"\u0019\u0000\u0000\u00a74\u0001\u0000\u0000\u0000\u0007\u0000\u0085\u008b"+
		"\u0091\u0093\u009b\u00a3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}