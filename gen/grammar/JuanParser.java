// Generated from grammar/Juan.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JuanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, SINO=2, IMPRIMIR=3, MIENTRAS=4, FIN=5, ENTERO=6, CADENA=7, SUMAR=8, 
		RESTAR=9, MULTIPLICAR=10, DIVIDIR=11, MENOR=12, MAYOR=13, MENOR_IGUAL=14, 
		MAYOR_IGUAL=15, IGUALDAD=16, DIFERENTE=17, IGUAL=18, PAREN_IZQ=19, PAREN_DER=20, 
		PUNTOYCOMA=21, ID=22, INT=23, STRING=24, WS=25, COMMENT=26;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_declararVariable = 2, RULE_asignarValor = 3, 
		RULE_imprimirValor = 4, RULE_condicional = 5, RULE_bucle = 6, RULE_bloque = 7, 
		RULE_expresion = 8, RULE_literal = 9, RULE_tipoVariable = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "declararVariable", "asignarValor", "imprimirValor", 
			"condicional", "bucle", "bloque", "expresion", "literal", "tipoVariable"
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

	@Override
	public String getGrammarFileName() { return "Juan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JuanParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				sentencia();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4194522L) != 0) );
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public DeclararVariableContext declararVariable() {
			return getRuleContext(DeclararVariableContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(JuanParser.PUNTOYCOMA, 0); }
		public AsignarValorContext asignarValor() {
			return getRuleContext(AsignarValorContext.class,0);
		}
		public ImprimirValorContext imprimirValor() {
			return getRuleContext(ImprimirValorContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				declararVariable();
				setState(30);
				match(PUNTOYCOMA);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				asignarValor();
				setState(33);
				match(PUNTOYCOMA);
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				imprimirValor();
				setState(36);
				match(PUNTOYCOMA);
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				condicional();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				bucle();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararVariableContext extends ParserRuleContext {
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode ID() { return getToken(JuanParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(JuanParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclararVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterDeclararVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitDeclararVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitDeclararVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararVariableContext declararVariable() throws RecognitionException {
		DeclararVariableContext _localctx = new DeclararVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declararVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			tipoVariable();
			setState(43);
			match(ID);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(44);
				match(IGUAL);
				setState(45);
				expresion(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarValorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuanParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(JuanParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignarValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterAsignarValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitAsignarValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitAsignarValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarValorContext asignarValor() throws RecognitionException {
		AsignarValorContext _localctx = new AsignarValorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignarValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(49);
			match(IGUAL);
			setState(50);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirValorContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(JuanParser.IMPRIMIR, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(JuanParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(JuanParser.PAREN_DER, 0); }
		public ImprimirValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterImprimirValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitImprimirValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitImprimirValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirValorContext imprimirValor() throws RecognitionException {
		ImprimirValorContext _localctx = new ImprimirValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imprimirValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IMPRIMIR);
			setState(53);
			match(PAREN_IZQ);
			setState(54);
			expresion(0);
			setState(55);
			match(PAREN_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(JuanParser.SI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode FIN() { return getToken(JuanParser.FIN, 0); }
		public TerminalNode SINO() { return getToken(JuanParser.SINO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(SI);
			setState(58);
			expresion(0);
			setState(59);
			bloque();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(60);
				match(SINO);
				setState(61);
				bloque();
				}
			}

			setState(64);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(JuanParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(JuanParser.FIN, 0); }
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(MIENTRAS);
			setState(67);
			expresion(0);
			setState(68);
			bloque();
			setState(69);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194522L) != 0)) {
				{
				{
				setState(71);
				sentencia();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionLiteralContext extends ExpresionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpresionLiteralContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterExpresionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitExpresionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitExpresionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaOpContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SUMAR() { return getToken(JuanParser.SUMAR, 0); }
		public TerminalNode RESTAR() { return getToken(JuanParser.RESTAR, 0); }
		public SumaOpContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterSumaOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitSumaOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitSumaOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionParentesisContext extends ExpresionContext {
		public TerminalNode PAREN_IZQ() { return getToken(JuanParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(JuanParser.PAREN_DER, 0); }
		public ExpresionParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterExpresionParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitExpresionParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitExpresionParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionOpContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(JuanParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(JuanParser.MAYOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(JuanParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(JuanParser.MAYOR_IGUAL, 0); }
		public TerminalNode IGUALDAD() { return getToken(JuanParser.IGUALDAD, 0); }
		public TerminalNode DIFERENTE() { return getToken(JuanParser.DIFERENTE, 0); }
		public ComparacionOpContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterComparacionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitComparacionOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitComparacionOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpresionContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(JuanParser.ID, 0); }
		public IdExpresionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterIdExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitIdExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitIdExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionOpContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MULTIPLICAR() { return getToken(JuanParser.MULTIPLICAR, 0); }
		public TerminalNode DIVIDIR() { return getToken(JuanParser.DIVIDIR, 0); }
		public MultiplicacionOpContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterMultiplicacionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitMultiplicacionOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitMultiplicacionOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_IZQ:
				{
				_localctx = new ExpresionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				match(PAREN_IZQ);
				setState(79);
				expresion(0);
				setState(80);
				match(PAREN_DER);
				}
				break;
			case INT:
			case STRING:
				{
				_localctx = new ExpresionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				literal();
				}
				break;
			case ID:
				{
				_localctx = new IdExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ComparacionOpContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87);
						((ComparacionOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
							((ComparacionOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expresion(7);
						}
						break;
					case 2:
						{
						_localctx = new SumaOpContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						((SumaOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUMAR || _la==RESTAR) ) {
							((SumaOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expresion(6);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicacionOpContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						((MultiplicacionOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICAR || _la==DIVIDIR) ) {
							((MultiplicacionOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						expresion(5);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JuanParser.INT, 0); }
		public TerminalNode STRING() { return getToken(JuanParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(JuanParser.ENTERO, 0); }
		public TerminalNode CADENA() { return getToken(JuanParser.CADENA, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuanListener ) ((JuanListener)listener).exitTipoVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuanVisitor ) return ((JuanVisitor<? extends T>)visitor).visitTipoVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001ai\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005?\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0005\u0007I\b\u0007\n\u0007\f\u0007L\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bU\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b`\b\b\n\b\f\b"+
		"c\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0001\u0010\u000b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005\u0001"+
		"\u0000\f\u0011\u0001\u0000\b\t\u0001\u0000\n\u000b\u0001\u0000\u0017\u0018"+
		"\u0001\u0000\u0006\u0007j\u0000\u0017\u0001\u0000\u0000\u0000\u0002(\u0001"+
		"\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000"+
		"\u0000\b4\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\fB\u0001"+
		"\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000"+
		"\u0000\u0012d\u0001\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0003\u0004\u0002\u0000\u001e\u001f\u0005\u0015\u0000\u0000\u001f"+
		")\u0001\u0000\u0000\u0000 !\u0003\u0006\u0003\u0000!\"\u0005\u0015\u0000"+
		"\u0000\")\u0001\u0000\u0000\u0000#$\u0003\b\u0004\u0000$%\u0005\u0015"+
		"\u0000\u0000%)\u0001\u0000\u0000\u0000&)\u0003\n\u0005\u0000\')\u0003"+
		"\f\u0006\u0000(\u001d\u0001\u0000\u0000\u0000( \u0001\u0000\u0000\u0000"+
		"(#\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0003\u0014\n\u0000+.\u0005\u0016"+
		"\u0000\u0000,-\u0005\u0012\u0000\u0000-/\u0003\u0010\b\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"01\u0005\u0016\u0000\u000012\u0005\u0012\u0000\u000023\u0003\u0010\b\u0000"+
		"3\u0007\u0001\u0000\u0000\u000045\u0005\u0003\u0000\u000056\u0005\u0013"+
		"\u0000\u000067\u0003\u0010\b\u000078\u0005\u0014\u0000\u00008\t\u0001"+
		"\u0000\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0003\u0010\b\u0000;>\u0003"+
		"\u000e\u0007\u0000<=\u0005\u0002\u0000\u0000=?\u0003\u000e\u0007\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0005\u0000\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0004\u0000\u0000CD\u0003\u0010\b\u0000DE\u0003\u000e\u0007\u0000EF\u0005"+
		"\u0005\u0000\u0000F\r\u0001\u0000\u0000\u0000GI\u0003\u0002\u0001\u0000"+
		"HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\u000f\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MN\u0006\b\uffff\uffff\u0000NO\u0005\u0013\u0000\u0000"+
		"OP\u0003\u0010\b\u0000PQ\u0005\u0014\u0000\u0000QU\u0001\u0000\u0000\u0000"+
		"RU\u0003\u0012\t\u0000SU\u0005\u0016\u0000\u0000TM\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000Ua\u0001\u0000\u0000"+
		"\u0000VW\n\u0006\u0000\u0000WX\u0007\u0000\u0000\u0000X`\u0003\u0010\b"+
		"\u0007YZ\n\u0005\u0000\u0000Z[\u0007\u0001\u0000\u0000[`\u0003\u0010\b"+
		"\u0006\\]\n\u0004\u0000\u0000]^\u0007\u0002\u0000\u0000^`\u0003\u0010"+
		"\b\u0005_V\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_\\\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000de\u0007\u0003\u0000\u0000e\u0013\u0001\u0000\u0000\u0000"+
		"fg\u0007\u0004\u0000\u0000g\u0015\u0001\u0000\u0000\u0000\b\u0019(.>J"+
		"T_a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}