// Generated from Invariant.g4 by ANTLR 4.4

 	
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
public class InvariantParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		GLOBALLY=10, PREV=11, YESTERDAY=12, GLOBALLYFINALLY=13, FINALLY=14, NEXT=15, 
		TEXTUALNEXT=16, NEG=17, LPAR=18, RPAR=19, EQUAL=20, MINUS=21, WS=22, ID=23, 
		CONSTANT=24, NAT=25, STAR=26, LBRACK=27, RBRACK=28, TRUE=29, FALSE=30, 
		NEWLINE=31, COMMA=32, COMMENT=33, LINE_COMMENT=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'!='", "'>='", "'<'", "'=='", "'|'", "'>'", "'<='", "'&'", 
		"'+'", "'G'", "'PREV'", "'Y'", "'GF'", "'F'", "'x'", "'next'", "'!'", 
		"'('", "')'", "'='", "'-'", "WS", "ID", "CONSTANT", "NAT", "'*'", "'['", 
		"']'", "'true'", "'false'", "NEWLINE", "','", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_invariant = 0, RULE_booleanexp = 1, RULE_f = 2, RULE_unop = 3, RULE_atom = 4, 
		RULE_posassignement = 5, RULE_posnumAss = 6, RULE_expression = 7, RULE_lop = 8, 
		RULE_function = 9, RULE_operator = 10, RULE_positiveoperator = 11;
	public static final String[] ruleNames = {
		"invariant", "booleanexp", "f", "unop", "atom", "posassignement", "posnumAss", 
		"expression", "lop", "function", "operator", "positiveoperator"
	};

	@Override
	public String getGrammarFileName() { return "Invariant.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  boolean matchedEOF=false;
	 	
	 	
	 
	public InvariantParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InvariantContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InvariantParser.EOF, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitInvariant(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_invariant);
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); match(GLOBALLY);
				setState(25); booleanexp(0);
				setState(26); match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); match(GLOBALLY);
				setState(29); match(LPAR);
				setState(30); booleanexp(0);
				setState(31); match(RPAR);
				setState(32); match(EOF);
				}
				break;
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

	public static class BooleanexpContext extends ParserRuleContext {
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
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
		public BooleanexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitBooleanexp(this);
		}
	}

	public final BooleanexpContext booleanexp() throws RecognitionException {
		return booleanexp(0);
	}

	private BooleanexpContext booleanexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanexpContext _localctx = new BooleanexpContext(_ctx, _parentState);
		BooleanexpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_booleanexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37); unop();
				setState(38); booleanexp(7);
				}
				break;
			case 2:
				{
				setState(40); match(LPAR);
				setState(41); booleanexp(0);
				setState(42); match(RPAR);
				}
				break;
			case 3:
				{
				setState(44); match(LPAR);
				setState(45); booleanexp(0);
				setState(46); match(RPAR);
				setState(47); lop();
				setState(48); booleanexp(0);
				}
				break;
			case 4:
				{
				setState(50); match(LPAR);
				setState(51); booleanexp(0);
				setState(52); match(RPAR);
				{
				setState(53); lop();
				setState(54); match(LPAR);
				setState(55); booleanexp(0);
				setState(56); match(RPAR);
				}
				}
				break;
			case 5:
				{
				setState(58); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(61);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(62); lop();
						setState(63); booleanexp(6);
						}
						break;
					case 2:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66); lop();
						{
						setState(67); match(LPAR);
						setState(68); booleanexp(0);
						setState(69); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitF(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77); unop();
				setState(78); f(7);
				}
				break;
			case 2:
				{
				setState(80); match(LPAR);
				setState(81); f(0);
				setState(82); match(RPAR);
				}
				break;
			case 3:
				{
				setState(84); unop();
				setState(85); match(LPAR);
				setState(86); f(0);
				setState(87); match(RPAR);
				}
				break;
			case 4:
				{
				setState(89); match(LPAR);
				setState(90); f(0);
				setState(91); match(RPAR);
				setState(92); lop();
				setState(93); f(0);
				}
				break;
			case 5:
				{
				setState(95); match(LPAR);
				setState(96); f(0);
				setState(97); match(RPAR);
				{
				setState(98); lop();
				setState(99); match(LPAR);
				setState(100); f(0);
				setState(101); match(RPAR);
				}
				}
				break;
			case 6:
				{
				setState(103); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(107); lop();
						setState(108); f(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111); lop();
						{
						setState(112); match(LPAR);
						setState(113); f(0);
						setState(114); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(120);
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

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(InvariantParser.NEG, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(NEG);
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
		public TerminalNode ID() { return getToken(InvariantParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(InvariantParser.MINUS, 0); }
		public TerminalNode CONSTANT() { return getToken(InvariantParser.CONSTANT, 0); }
		public TerminalNode NAT() { return getToken(InvariantParser.NAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(128);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); match(ID);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(NAT);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(CONSTANT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); match(MINUS);
				setState(127); match(NAT);
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
		public List<TerminalNode> ID() { return getTokens(InvariantParser.ID); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(InvariantParser.ID, i);
		}
		public PosassignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posassignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterPosassignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitPosassignement(this);
		}
	}

	public final PosassignementContext posassignement() throws RecognitionException {
		PosassignementContext _localctx = new PosassignementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_posassignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(ID);
			setState(131); operator();
			setState(132); match(ID);
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
		public TerminalNode ID() { return getToken(InvariantParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NAT() { return getToken(InvariantParser.NAT, 0); }
		public PosnumAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posnumAss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterPosnumAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitPosnumAss(this);
		}
	}

	public final PosnumAssContext posnumAss() throws RecognitionException {
		PosnumAssContext _localctx = new PosnumAssContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_posnumAss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(ID);
			setState(135); operator();
			setState(136); match(NAT);
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
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitExpression(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(139); unop();
				setState(140); expression(8);
				}
				break;
			case 2:
				{
				setState(142); match(LPAR);
				setState(143); expression(0);
				setState(144); match(RPAR);
				}
				break;
			case 3:
				{
				setState(146); unop();
				setState(147); match(LPAR);
				setState(148); expression(0);
				setState(149); match(RPAR);
				}
				break;
			case 4:
				{
				setState(151); function();
				}
				break;
			case 5:
				{
				setState(152); atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(156); operator();
						setState(157); expression(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(160); lop();
						setState(161); expression(0);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(164); operator();
						setState(165); match(LPAR);
						setState(166); expression(0);
						setState(167); match(RPAR);
						}
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(170); lop();
						setState(171); match(LPAR);
						setState(172); expression(0);
						setState(173); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__1) | (1L << EQUAL))) != 0)) ) {
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
		public TerminalNode ID() { return getToken(InvariantParser.ID, 0); }
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
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(ID);
			{
			setState(183); match(LPAR);
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(184); expression(0);
				}
				break;
			case 2:
				{
				setState(185); match(LPAR);
				setState(186); expression(0);
				setState(187); match(RPAR);
				}
				break;
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << EQUAL) | (1L << MINUS) | (1L << COMMA))) != 0)) {
				{
				{
				setState(194);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(191); match(COMMA);
					}
					break;
				case 2:
					{
					setState(192); lop();
					}
					break;
				case 3:
					{
					setState(193); operator();
					}
					break;
				}
				setState(201);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(196); expression(0);
					}
					break;
				case 2:
					{
					setState(197); match(LPAR);
					setState(198); expression(0);
					setState(199); match(RPAR);
					}
					break;
				}
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208); match(RPAR);
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
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__3) | (1L << T__2) | (1L << T__0) | (1L << EQUAL) | (1L << MINUS))) != 0)) ) {
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
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).enterPositiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InvariantListener ) ((InvariantListener)listener).exitPositiveoperator(this);
		}
	}

	public final PositiveoperatorContext positiveoperator() throws RecognitionException {
		PositiveoperatorContext _localctx = new PositiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_positiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__5) | (1L << T__2) | (1L << EQUAL))) != 0)) ) {
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
		case 1: return booleanexp_sempred((BooleanexpContext)_localctx, predIndex);
		case 2: return f_sempred((FContext)_localctx, predIndex);
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanexp_sempred(BooleanexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"k\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4w\n\4\f\4\16\4z\13\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009c"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\13\3\13\3\13\5\13\u00c5\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00cc\n\13\7\13\u00ce\n\13\f\13\16\13\u00d1"+
		"\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\5\4\6\20\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\5\5\2\7\7\n\n\26\26\6\2\3\6\b\t\13\13\26\27\6\2\4\4\6\6\t"+
		"\t\26\26\u00ea\2$\3\2\2\2\4=\3\2\2\2\6j\3\2\2\2\b{\3\2\2\2\n\u0082\3\2"+
		"\2\2\f\u0084\3\2\2\2\16\u0088\3\2\2\2\20\u009b\3\2\2\2\22\u00b6\3\2\2"+
		"\2\24\u00b8\3\2\2\2\26\u00d4\3\2\2\2\30\u00d6\3\2\2\2\32\33\7\f\2\2\33"+
		"\34\5\4\3\2\34\35\7\2\2\3\35%\3\2\2\2\36\37\7\f\2\2\37 \7\24\2\2 !\5\4"+
		"\3\2!\"\7\25\2\2\"#\7\2\2\3#%\3\2\2\2$\32\3\2\2\2$\36\3\2\2\2%\3\3\2\2"+
		"\2&\'\b\3\1\2\'(\5\b\5\2()\5\4\3\t)>\3\2\2\2*+\7\24\2\2+,\5\4\3\2,-\7"+
		"\25\2\2->\3\2\2\2./\7\24\2\2/\60\5\4\3\2\60\61\7\25\2\2\61\62\5\22\n\2"+
		"\62\63\5\4\3\2\63>\3\2\2\2\64\65\7\24\2\2\65\66\5\4\3\2\66\67\7\25\2\2"+
		"\678\5\22\n\289\7\24\2\29:\5\4\3\2:;\7\25\2\2;>\3\2\2\2<>\5\20\t\2=&\3"+
		"\2\2\2=*\3\2\2\2=.\3\2\2\2=\64\3\2\2\2=<\3\2\2\2>K\3\2\2\2?@\f\7\2\2@"+
		"A\5\22\n\2AB\5\4\3\bBJ\3\2\2\2CD\f\6\2\2DE\5\22\n\2EF\7\24\2\2FG\5\4\3"+
		"\2GH\7\25\2\2HJ\3\2\2\2I?\3\2\2\2IC\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2L\5\3\2\2\2MK\3\2\2\2NO\b\4\1\2OP\5\b\5\2PQ\5\6\4\tQk\3\2\2\2RS\7"+
		"\24\2\2ST\5\6\4\2TU\7\25\2\2Uk\3\2\2\2VW\5\b\5\2WX\7\24\2\2XY\5\6\4\2"+
		"YZ\7\25\2\2Zk\3\2\2\2[\\\7\24\2\2\\]\5\6\4\2]^\7\25\2\2^_\5\22\n\2_`\5"+
		"\6\4\2`k\3\2\2\2ab\7\24\2\2bc\5\6\4\2cd\7\25\2\2de\5\22\n\2ef\7\24\2\2"+
		"fg\5\6\4\2gh\7\25\2\2hk\3\2\2\2ik\5\20\t\2jN\3\2\2\2jR\3\2\2\2jV\3\2\2"+
		"\2j[\3\2\2\2ja\3\2\2\2ji\3\2\2\2kx\3\2\2\2lm\f\7\2\2mn\5\22\n\2no\5\6"+
		"\4\2ow\3\2\2\2pq\f\6\2\2qr\5\22\n\2rs\7\24\2\2st\5\6\4\2tu\7\25\2\2uw"+
		"\3\2\2\2vl\3\2\2\2vp\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2\2"+
		"zx\3\2\2\2{|\7\23\2\2|\t\3\2\2\2}\u0083\7\31\2\2~\u0083\7\33\2\2\177\u0083"+
		"\7\32\2\2\u0080\u0081\7\27\2\2\u0081\u0083\7\33\2\2\u0082}\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0083\13\3\2\2\2\u0084"+
		"\u0085\7\31\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\31\2\2\u0087\r\3\2"+
		"\2\2\u0088\u0089\7\31\2\2\u0089\u008a\5\26\f\2\u008a\u008b\7\33\2\2\u008b"+
		"\17\3\2\2\2\u008c\u008d\b\t\1\2\u008d\u008e\5\b\5\2\u008e\u008f\5\20\t"+
		"\n\u008f\u009c\3\2\2\2\u0090\u0091\7\24\2\2\u0091\u0092\5\20\t\2\u0092"+
		"\u0093\7\25\2\2\u0093\u009c\3\2\2\2\u0094\u0095\5\b\5\2\u0095\u0096\7"+
		"\24\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\25\2\2\u0098\u009c\3\2\2\2"+
		"\u0099\u009c\5\24\13\2\u009a\u009c\5\n\6\2\u009b\u008c\3\2\2\2\u009b\u0090"+
		"\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u00b3\3\2\2\2\u009d\u009e\f\7\2\2\u009e\u009f\5\26\f\2\u009f\u00a0\5"+
		"\20\t\2\u00a0\u00b2\3\2\2\2\u00a1\u00a2\f\6\2\2\u00a2\u00a3\5\22\n\2\u00a3"+
		"\u00a4\5\20\t\2\u00a4\u00b2\3\2\2\2\u00a5\u00a6\f\5\2\2\u00a6\u00a7\5"+
		"\26\f\2\u00a7\u00a8\7\24\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\25\2\2"+
		"\u00aa\u00b2\3\2\2\2\u00ab\u00ac\f\4\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae"+
		"\7\24\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\7\25\2\2\u00b0\u00b2\3\2\2"+
		"\2\u00b1\u009d\3\2\2\2\u00b1\u00a1\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00ab"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\23\3\2\2\2\u00b8"+
		"\u00b9\7\31\2\2\u00b9\u00bf\7\24\2\2\u00ba\u00c0\5\20\t\2\u00bb\u00bc"+
		"\7\24\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7\25\2\2\u00be\u00c0\3\2\2"+
		"\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\u00cf\3\2\2\2\u00c1\u00c5"+
		"\7\"\2\2\u00c2\u00c5\5\22\n\2\u00c3\u00c5\5\26\f\2\u00c4\u00c1\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00cb\3\2\2\2\u00c6\u00cc"+
		"\5\20\t\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7\25\2"+
		"\2\u00ca\u00cc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00c4\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\25"+
		"\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5\27\3\2\2\2\u00d6\u00d7"+
		"\t\4\2\2\u00d7\31\3\2\2\2\21$=IKjvx\u0082\u009b\u00b1\u00b3\u00bf\u00c4"+
		"\u00cb\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}