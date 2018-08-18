// Generated from LTL.g4 by ANTLR 4.4

 	
 	package se.gu.parser;
 

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, GLOBALLY=14, PREV=15, YESTERDAY=16, 
		GLOBALLYFINALLY=17, FINALLY=18, NEXT=19, TEXTUALNEXT=20, NEG=21, LPAR=22, 
		RPAR=23, EQUAL=24, MINUS=25, WS=26, ID=27, CONSTANT=28, NAT=29, STAR=30, 
		LBRACK=31, RBRACK=32, TRUE=33, FALSE=34, NEWLINE=35, COMMA=36, COMMENT=37, 
		LINE_COMMENT=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'<-'", "'->'", "'!='", "'>='", "'<'", "'=='", "'|'", "'>'", 
		"'<=>'", "'<='", "'&'", "'+'", "'<->'", "'G'", "'PREV'", "'Y'", "'GF'", 
		"'F'", "'x'", "'next'", "'!'", "'('", "')'", "'='", "'-'", "WS", "ID", 
		"CONSTANT", "NAT", "'*'", "'['", "']'", "'true'", "'false'", "NEWLINE", 
		"','", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_ltl = 0, RULE_f = 1, RULE_unop = 2, RULE_atom = 3, RULE_posassignement = 4, 
		RULE_posnumAss = 5, RULE_expression = 6, RULE_lop = 7, RULE_function = 8, 
		RULE_operator = 9, RULE_positiveoperator = 10;
	public static final String[] ruleNames = {
		"ltl", "f", "unop", "atom", "posassignement", "posnumAss", "expression", 
		"lop", "function", "operator", "positiveoperator"
	};

	@Override
	public String getGrammarFileName() { return "LTL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  boolean matchedEOF=false;
	 	
	 	
	 
	public LTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LtlContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LTLParser.EOF, 0); }
		public LtlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterLtl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitLtl(this);
		}
	}

	public final LtlContext ltl() throws RecognitionException {
		LtlContext _localctx = new LtlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ltl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); f(0);
			setState(23); match(EOF);
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

	public static class FContext extends ParserRuleContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public LopContext lop() {
			return getRuleContext(LopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(26); unop();
				setState(27); f(7);
				}
				break;
			case 2:
				{
				setState(29); match(LPAR);
				setState(30); f(0);
				setState(31); match(RPAR);
				}
				break;
			case 3:
				{
				setState(33); unop();
				setState(34); match(LPAR);
				setState(35); f(0);
				setState(36); match(RPAR);
				}
				break;
			case 4:
				{
				setState(38); match(LPAR);
				setState(39); f(0);
				setState(40); match(RPAR);
				setState(41); lop();
				setState(42); f(0);
				}
				break;
			case 5:
				{
				setState(44); match(LPAR);
				setState(45); f(0);
				setState(46); match(RPAR);
				{
				setState(47); lop();
				setState(48); match(LPAR);
				setState(49); f(0);
				setState(50); match(RPAR);
				}
				}
				break;
			case 6:
				{
				setState(52); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(55);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(56); lop();
						setState(57); f(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60); lop();
						{
						setState(61); match(LPAR);
						setState(62); f(0);
						setState(63); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(LTLParser.NEG, 0); }
		public TerminalNode NEXT() { return getToken(LTLParser.NEXT, 0); }
		public TerminalNode PREV() { return getToken(LTLParser.PREV, 0); }
		public TerminalNode TEXTUALNEXT() { return getToken(LTLParser.TEXTUALNEXT, 0); }
		public TerminalNode GLOBALLYFINALLY(int i) {
			return getToken(LTLParser.GLOBALLYFINALLY, i);
		}
		public TerminalNode GLOBALLY() { return getToken(LTLParser.GLOBALLY, 0); }
		public List<TerminalNode> GLOBALLYFINALLY() { return getTokens(LTLParser.GLOBALLYFINALLY); }
		public TerminalNode YESTERDAY() { return getToken(LTLParser.YESTERDAY, 0); }
		public TerminalNode FINALLY() { return getToken(LTLParser.FINALLY, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLOBALLY) | (1L << PREV) | (1L << YESTERDAY) | (1L << GLOBALLYFINALLY) | (1L << FINALLY) | (1L << NEXT) | (1L << TEXTUALNEXT) | (1L << NEG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LTLParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(LTLParser.MINUS, 0); }
		public TerminalNode CONSTANT() { return getToken(LTLParser.CONSTANT, 0); }
		public TerminalNode NAT() { return getToken(LTLParser.NAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(ID);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(NAT);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); match(CONSTANT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); match(MINUS);
				setState(76); match(NAT);
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

	public static class PosassignementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LTLParser.ID); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(LTLParser.ID, i);
		}
		public PosassignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posassignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterPosassignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitPosassignement(this);
		}
	}

	public final PosassignementContext posassignement() throws RecognitionException {
		PosassignementContext _localctx = new PosassignementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_posassignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(ID);
			setState(80); operator();
			setState(81); match(ID);
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

	public static class PosnumAssContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LTLParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NAT() { return getToken(LTLParser.NAT, 0); }
		public PosnumAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posnumAss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterPosnumAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitPosnumAss(this);
		}
	}

	public final PosnumAssContext posnumAss() throws RecognitionException {
		PosnumAssContext _localctx = new PosnumAssContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_posnumAss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(ID);
			setState(84); operator();
			setState(85); match(NAT);
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

	public static class ExpressionContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LopContext lop() {
			return getRuleContext(LopContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(88); unop();
				setState(89); expression(8);
				}
				break;
			case 2:
				{
				setState(91); match(LPAR);
				setState(92); expression(0);
				setState(93); match(RPAR);
				}
				break;
			case 3:
				{
				setState(95); unop();
				setState(96); match(LPAR);
				setState(97); expression(0);
				setState(98); match(RPAR);
				}
				break;
			case 4:
				{
				setState(100); function();
				}
				break;
			case 5:
				{
				setState(101); atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(105); operator();
						setState(106); expression(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(109); lop();
						setState(110); expression(0);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(113); operator();
						setState(114); match(LPAR);
						setState(115); expression(0);
						setState(116); match(RPAR);
						}
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(119); lop();
						setState(120); match(LPAR);
						setState(121); expression(0);
						setState(122); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class LopContext extends ParserRuleContext {
		public LopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__6) | (1L << T__4) | (1L << T__2) | (1L << T__0) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LTLParser.ID, 0); }
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public LopContext lop(int i) {
			return getRuleContext(LopContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LopContext> lop() {
			return getRuleContexts(LopContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(ID);
			{
			setState(132); match(LPAR);
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(133); expression(0);
				}
				break;
			case 2:
				{
				setState(134); match(LPAR);
				setState(135); expression(0);
				setState(136); match(RPAR);
				}
				break;
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << EQUAL) | (1L << MINUS) | (1L << COMMA))) != 0)) {
				{
				{
				setState(143);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(140); match(COMMA);
					}
					break;
				case 2:
					{
					setState(141); lop();
					}
					break;
				case 3:
					{
					setState(142); operator();
					}
					break;
				}
				setState(150);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(145); expression(0);
					}
					break;
				case 2:
					{
					setState(146); match(LPAR);
					setState(147); expression(0);
					setState(148); match(RPAR);
					}
					break;
				}
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157); match(RPAR);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__3) | (1L << T__1) | (1L << EQUAL) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PositiveoperatorContext extends ParserRuleContext {
		public PositiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterPositiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitPositiveoperator(this);
		}
	}

	public final PositiveoperatorContext positiveoperator() throws RecognitionException {
		PositiveoperatorContext _localctx = new PositiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_positiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__7) | (1L << T__3) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 1: return f_sempred((FContext)_localctx, predIndex);
		case 6: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"8\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bi\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u008d\n\n\3\n\3\n\3\n\5\n\u0092\n\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0099\n\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\2\4\4\16\r\2\4\6\b\n\f\16\20\22\24\26\2\6\3\2\20\27\b\2\3\4\t\t"+
		"\13\13\r\r\17\17\32\32\7\2\5\b\n\n\f\f\16\16\32\33\6\2\6\6\b\b\f\f\32"+
		"\32\u00b1\2\30\3\2\2\2\4\67\3\2\2\2\6H\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\f"+
		"U\3\2\2\2\16h\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u00a1\3\2\2"+
		"\2\26\u00a3\3\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\b\3"+
		"\1\2\34\35\5\6\4\2\35\36\5\4\3\t\368\3\2\2\2\37 \7\30\2\2 !\5\4\3\2!\""+
		"\7\31\2\2\"8\3\2\2\2#$\5\6\4\2$%\7\30\2\2%&\5\4\3\2&\'\7\31\2\2\'8\3\2"+
		"\2\2()\7\30\2\2)*\5\4\3\2*+\7\31\2\2+,\5\20\t\2,-\5\4\3\2-8\3\2\2\2./"+
		"\7\30\2\2/\60\5\4\3\2\60\61\7\31\2\2\61\62\5\20\t\2\62\63\7\30\2\2\63"+
		"\64\5\4\3\2\64\65\7\31\2\2\658\3\2\2\2\668\5\16\b\2\67\33\3\2\2\2\67\37"+
		"\3\2\2\2\67#\3\2\2\2\67(\3\2\2\2\67.\3\2\2\2\67\66\3\2\2\28E\3\2\2\29"+
		":\f\7\2\2:;\5\20\t\2;<\5\4\3\2<D\3\2\2\2=>\f\6\2\2>?\5\20\t\2?@\7\30\2"+
		"\2@A\5\4\3\2AB\7\31\2\2BD\3\2\2\2C9\3\2\2\2C=\3\2\2\2DG\3\2\2\2EC\3\2"+
		"\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HI\t\2\2\2I\7\3\2\2\2JP\7\35\2\2KP"+
		"\7\37\2\2LP\7\36\2\2MN\7\33\2\2NP\7\37\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2"+
		"\2OM\3\2\2\2P\t\3\2\2\2QR\7\35\2\2RS\5\24\13\2ST\7\35\2\2T\13\3\2\2\2"+
		"UV\7\35\2\2VW\5\24\13\2WX\7\37\2\2X\r\3\2\2\2YZ\b\b\1\2Z[\5\6\4\2[\\\5"+
		"\16\b\n\\i\3\2\2\2]^\7\30\2\2^_\5\16\b\2_`\7\31\2\2`i\3\2\2\2ab\5\6\4"+
		"\2bc\7\30\2\2cd\5\16\b\2de\7\31\2\2ei\3\2\2\2fi\5\22\n\2gi\5\b\5\2hY\3"+
		"\2\2\2h]\3\2\2\2ha\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\u0080\3\2\2\2jk\f\7\2"+
		"\2kl\5\24\13\2lm\5\16\b\2m\177\3\2\2\2no\f\6\2\2op\5\20\t\2pq\5\16\b\2"+
		"q\177\3\2\2\2rs\f\5\2\2st\5\24\13\2tu\7\30\2\2uv\5\16\b\2vw\7\31\2\2w"+
		"\177\3\2\2\2xy\f\4\2\2yz\5\20\t\2z{\7\30\2\2{|\5\16\b\2|}\7\31\2\2}\177"+
		"\3\2\2\2~j\3\2\2\2~n\3\2\2\2~r\3\2\2\2~x\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\17\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\t\3\2\2\u0084\21\3\2\2\2\u0085\u0086\7\35\2\2\u0086\u008c\7\30"+
		"\2\2\u0087\u008d\5\16\b\2\u0088\u0089\7\30\2\2\u0089\u008a\5\16\b\2\u008a"+
		"\u008b\7\31\2\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3"+
		"\2\2\2\u008d\u009c\3\2\2\2\u008e\u0092\7&\2\2\u008f\u0092\5\20\t\2\u0090"+
		"\u0092\5\24\13\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3"+
		"\2\2\2\u0092\u0098\3\2\2\2\u0093\u0099\5\16\b\2\u0094\u0095\7\30\2\2\u0095"+
		"\u0096\5\16\b\2\u0096\u0097\7\31\2\2\u0097\u0099\3\2\2\2\u0098\u0093\3"+
		"\2\2\2\u0098\u0094\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0091\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\31\2\2\u00a0\23\3\2\2\2\u00a1\u00a2"+
		"\t\4\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4\27\3\2\2\2\r\67CE"+
		"Oh~\u0080\u008c\u0091\u0098\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}