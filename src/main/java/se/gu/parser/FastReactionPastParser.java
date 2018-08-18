// Generated from FastReactionPast.g4 by ANTLR 4.4

 	
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
public class FastReactionPastParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, GLOBALLY=11, PREV=12, YESTERDAY=13, GLOBALLYFINALLY=14, FINALLY=15, 
		NEXT=16, TEXTUALNEXT=17, NEG=18, LPAR=19, RPAR=20, EQUAL=21, MINUS=22, 
		WS=23, ID=24, CONSTANT=25, NAT=26, STAR=27, LBRACK=28, RBRACK=29, TRUE=30, 
		FALSE=31, NEWLINE=32, COMMA=33, COMMENT=34, LINE_COMMENT=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "'!='", "'>='", "'<'", "'=='", "'|'", "'>'", "'<='", 
		"'&'", "'+'", "'G'", "'PREV'", "'Y'", "'GF'", "'F'", "'x'", "'next'", 
		"'!'", "'('", "')'", "'='", "'-'", "WS", "ID", "CONSTANT", "NAT", "'*'", 
		"'['", "']'", "'true'", "'false'", "NEWLINE", "','", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_fastReactionPast = 0, RULE_react = 1, RULE_booleanexp = 2, RULE_unop = 3, 
		RULE_ltl = 4, RULE_f = 5, RULE_atom = 6, RULE_posassignement = 7, RULE_posnumAss = 8, 
		RULE_expression = 9, RULE_lop = 10, RULE_function = 11, RULE_operator = 12, 
		RULE_positiveoperator = 13;
	public static final String[] ruleNames = {
		"fastReactionPast", "react", "booleanexp", "unop", "ltl", "f", "atom", 
		"posassignement", "posnumAss", "expression", "lop", "function", "operator", 
		"positiveoperator"
	};

	@Override
	public String getGrammarFileName() { return "FastReactionPast.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  boolean matchedEOF=false;
	 	
	 	
	 
	public FastReactionPastParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FastReactionPastContext extends ParserRuleContext {
		public ReactContext react() {
			return getRuleContext(ReactContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FastReactionPastParser.EOF, 0); }
		public TerminalNode GLOBALLY() { return getToken(FastReactionPastParser.GLOBALLY, 0); }
		public FastReactionPastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fastReactionPast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterFastReactionPast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitFastReactionPast(this);
		}
	}

	public final FastReactionPastContext fastReactionPast() throws RecognitionException {
		FastReactionPastContext _localctx = new FastReactionPastContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fastReactionPast);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); match(GLOBALLY);
				setState(29); react();
				setState(30); match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); match(GLOBALLY);
				setState(33); match(LPAR);
				setState(34); react();
				setState(35); match(RPAR);
				setState(36); match(EOF);
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

	public static class ReactContext extends ParserRuleContext {
		public BooleanexpContext booleanexp(int i) {
			return getRuleContext(BooleanexpContext.class,i);
		}
		public List<BooleanexpContext> booleanexp() {
			return getRuleContexts(BooleanexpContext.class);
		}
		public ReactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_react; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterReact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitReact(this);
		}
	}

	public final ReactContext react() throws RecognitionException {
		ReactContext _localctx = new ReactContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_react);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); booleanexp(0);
			setState(41); match(T__9);
			setState(42); booleanexp(0);
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
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitBooleanexp(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_booleanexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(45); unop();
				setState(46); booleanexp(7);
				}
				break;
			case 2:
				{
				setState(48); match(LPAR);
				setState(49); booleanexp(0);
				setState(50); match(RPAR);
				}
				break;
			case 3:
				{
				setState(52); match(LPAR);
				setState(53); booleanexp(0);
				setState(54); match(RPAR);
				setState(55); lop();
				setState(56); booleanexp(0);
				}
				break;
			case 4:
				{
				setState(58); match(LPAR);
				setState(59); booleanexp(0);
				setState(60); match(RPAR);
				{
				setState(61); lop();
				setState(62); match(LPAR);
				setState(63); booleanexp(0);
				setState(64); match(RPAR);
				}
				}
				break;
			case 5:
				{
				setState(66); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(69);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(70); lop();
						setState(71); booleanexp(6);
						}
						break;
					case 2:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(73);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(74); lop();
						{
						setState(75); match(LPAR);
						setState(76); booleanexp(0);
						setState(77); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(83);
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

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(FastReactionPastParser.NEG, 0); }
		public TerminalNode PREV() { return getToken(FastReactionPastParser.PREV, 0); }
		public TerminalNode YESTERDAY() { return getToken(FastReactionPastParser.YESTERDAY, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PREV) | (1L << YESTERDAY) | (1L << NEG))) != 0)) ) {
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

	public static class LtlContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public LtlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterLtl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitLtl(this);
		}
	}

	public final LtlContext ltl() throws RecognitionException {
		LtlContext _localctx = new LtlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ltl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); f(0);
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
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitF(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(89); unop();
				setState(90); f(7);
				}
				break;
			case 2:
				{
				setState(92); match(LPAR);
				setState(93); f(0);
				setState(94); match(RPAR);
				}
				break;
			case 3:
				{
				setState(96); unop();
				setState(97); match(LPAR);
				setState(98); f(0);
				setState(99); match(RPAR);
				}
				break;
			case 4:
				{
				setState(101); match(LPAR);
				setState(102); f(0);
				setState(103); match(RPAR);
				setState(104); lop();
				setState(105); f(0);
				}
				break;
			case 5:
				{
				setState(107); match(LPAR);
				setState(108); f(0);
				setState(109); match(RPAR);
				{
				setState(110); lop();
				setState(111); match(LPAR);
				setState(112); f(0);
				setState(113); match(RPAR);
				}
				}
				break;
			case 6:
				{
				setState(115); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(118);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(119); lop();
						setState(120); f(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123); lop();
						{
						setState(124); match(LPAR);
						setState(125); f(0);
						setState(126); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(132);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FastReactionPastParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(FastReactionPastParser.MINUS, 0); }
		public TerminalNode CONSTANT() { return getToken(FastReactionPastParser.CONSTANT, 0); }
		public TerminalNode NAT() { return getToken(FastReactionPastParser.NAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(ID);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); match(NAT);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); match(CONSTANT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(136); match(MINUS);
				setState(137); match(NAT);
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
		public List<TerminalNode> ID() { return getTokens(FastReactionPastParser.ID); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(FastReactionPastParser.ID, i);
		}
		public PosassignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posassignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterPosassignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitPosassignement(this);
		}
	}

	public final PosassignementContext posassignement() throws RecognitionException {
		PosassignementContext _localctx = new PosassignementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_posassignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(ID);
			setState(141); operator();
			setState(142); match(ID);
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
		public TerminalNode ID() { return getToken(FastReactionPastParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NAT() { return getToken(FastReactionPastParser.NAT, 0); }
		public PosnumAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posnumAss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterPosnumAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitPosnumAss(this);
		}
	}

	public final PosnumAssContext posnumAss() throws RecognitionException {
		PosnumAssContext _localctx = new PosnumAssContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_posnumAss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(ID);
			setState(145); operator();
			setState(146); match(NAT);
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
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitExpression(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(149); unop();
				setState(150); expression(8);
				}
				break;
			case 2:
				{
				setState(152); match(LPAR);
				setState(153); expression(0);
				setState(154); match(RPAR);
				}
				break;
			case 3:
				{
				setState(156); unop();
				setState(157); match(LPAR);
				setState(158); expression(0);
				setState(159); match(RPAR);
				}
				break;
			case 4:
				{
				setState(161); function();
				}
				break;
			case 5:
				{
				setState(162); atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(166); operator();
						setState(167); expression(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(170); lop();
						setState(171); expression(0);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(174); operator();
						setState(175); match(LPAR);
						setState(176); expression(0);
						setState(177); match(RPAR);
						}
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(180); lop();
						setState(181); match(LPAR);
						setState(182); expression(0);
						setState(183); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(189);
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
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		public TerminalNode ID() { return getToken(FastReactionPastParser.ID, 0); }
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
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(ID);
			{
			setState(193); match(LPAR);
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(194); expression(0);
				}
				break;
			case 2:
				{
				setState(195); match(LPAR);
				setState(196); expression(0);
				setState(197); match(RPAR);
				}
				break;
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << EQUAL) | (1L << MINUS) | (1L << COMMA))) != 0)) {
				{
				{
				setState(204);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(201); match(COMMA);
					}
					break;
				case 2:
					{
					setState(202); lop();
					}
					break;
				case 3:
					{
					setState(203); operator();
					}
					break;
				}
				setState(211);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(206); expression(0);
					}
					break;
				case 2:
					{
					setState(207); match(LPAR);
					setState(208); expression(0);
					setState(209); match(RPAR);
					}
					break;
				}
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218); match(RPAR);
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
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).enterPositiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastReactionPastListener ) ((FastReactionPastListener)listener).exitPositiveoperator(this);
		}
	}

	public final PositiveoperatorContext positiveoperator() throws RecognitionException {
		PositiveoperatorContext _localctx = new PositiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_positiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		case 2: return booleanexp_sempred((BooleanexpContext)_localctx, predIndex);
		case 5: return f_sempred((FContext)_localctx, predIndex);
		case 9: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4R\n\4\f\4\16\4U\13\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7w\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16\7\u0086\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00a6\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bc\n\13\f\13\16\13\u00bf"+
		"\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\r\3\r\3\r\5"+
		"\r\u00cf\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\7\r\u00d8\n\r\f\r\16\r"+
		"\u00db\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\5\6\f\24\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\6\4\2\16\17\24\24\5\2\b\b\13\13\27\27\6\2\4"+
		"\7\t\n\f\f\27\30\6\2\5\5\7\7\n\n\27\27\u00f2\2(\3\2\2\2\4*\3\2\2\2\6E"+
		"\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\fv\3\2\2\2\16\u008c\3\2\2\2\20\u008e\3"+
		"\2\2\2\22\u0092\3\2\2\2\24\u00a5\3\2\2\2\26\u00c0\3\2\2\2\30\u00c2\3\2"+
		"\2\2\32\u00de\3\2\2\2\34\u00e0\3\2\2\2\36\37\7\r\2\2\37 \5\4\3\2 !\7\2"+
		"\2\3!)\3\2\2\2\"#\7\r\2\2#$\7\25\2\2$%\5\4\3\2%&\7\26\2\2&\'\7\2\2\3\'"+
		")\3\2\2\2(\36\3\2\2\2(\"\3\2\2\2)\3\3\2\2\2*+\5\6\4\2+,\7\3\2\2,-\5\6"+
		"\4\2-\5\3\2\2\2./\b\4\1\2/\60\5\b\5\2\60\61\5\6\4\t\61F\3\2\2\2\62\63"+
		"\7\25\2\2\63\64\5\6\4\2\64\65\7\26\2\2\65F\3\2\2\2\66\67\7\25\2\2\678"+
		"\5\6\4\289\7\26\2\29:\5\26\f\2:;\5\6\4\2;F\3\2\2\2<=\7\25\2\2=>\5\6\4"+
		"\2>?\7\26\2\2?@\5\26\f\2@A\7\25\2\2AB\5\6\4\2BC\7\26\2\2CF\3\2\2\2DF\5"+
		"\24\13\2E.\3\2\2\2E\62\3\2\2\2E\66\3\2\2\2E<\3\2\2\2ED\3\2\2\2FS\3\2\2"+
		"\2GH\f\7\2\2HI\5\26\f\2IJ\5\6\4\bJR\3\2\2\2KL\f\6\2\2LM\5\26\f\2MN\7\25"+
		"\2\2NO\5\6\4\2OP\7\26\2\2PR\3\2\2\2QG\3\2\2\2QK\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2T\7\3\2\2\2US\3\2\2\2VW\t\2\2\2W\t\3\2\2\2XY\5\f\7\2Y"+
		"\13\3\2\2\2Z[\b\7\1\2[\\\5\b\5\2\\]\5\f\7\t]w\3\2\2\2^_\7\25\2\2_`\5\f"+
		"\7\2`a\7\26\2\2aw\3\2\2\2bc\5\b\5\2cd\7\25\2\2de\5\f\7\2ef\7\26\2\2fw"+
		"\3\2\2\2gh\7\25\2\2hi\5\f\7\2ij\7\26\2\2jk\5\26\f\2kl\5\f\7\2lw\3\2\2"+
		"\2mn\7\25\2\2no\5\f\7\2op\7\26\2\2pq\5\26\f\2qr\7\25\2\2rs\5\f\7\2st\7"+
		"\26\2\2tw\3\2\2\2uw\5\24\13\2vZ\3\2\2\2v^\3\2\2\2vb\3\2\2\2vg\3\2\2\2"+
		"vm\3\2\2\2vu\3\2\2\2w\u0084\3\2\2\2xy\f\7\2\2yz\5\26\f\2z{\5\f\7\2{\u0083"+
		"\3\2\2\2|}\f\6\2\2}~\5\26\f\2~\177\7\25\2\2\177\u0080\5\f\7\2\u0080\u0081"+
		"\7\26\2\2\u0081\u0083\3\2\2\2\u0082x\3\2\2\2\u0082|\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008d\7\32\2\2\u0088\u008d\7\34\2\2\u0089\u008d\7"+
		"\33\2\2\u008a\u008b\7\30\2\2\u008b\u008d\7\34\2\2\u008c\u0087\3\2\2\2"+
		"\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008d\17"+
		"\3\2\2\2\u008e\u008f\7\32\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7\32\2"+
		"\2\u0091\21\3\2\2\2\u0092\u0093\7\32\2\2\u0093\u0094\5\32\16\2\u0094\u0095"+
		"\7\34\2\2\u0095\23\3\2\2\2\u0096\u0097\b\13\1\2\u0097\u0098\5\b\5\2\u0098"+
		"\u0099\5\24\13\n\u0099\u00a6\3\2\2\2\u009a\u009b\7\25\2\2\u009b\u009c"+
		"\5\24\13\2\u009c\u009d\7\26\2\2\u009d\u00a6\3\2\2\2\u009e\u009f\5\b\5"+
		"\2\u009f\u00a0\7\25\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7\26\2\2\u00a2"+
		"\u00a6\3\2\2\2\u00a3\u00a6\5\30\r\2\u00a4\u00a6\5\16\b\2\u00a5\u0096\3"+
		"\2\2\2\u00a5\u009a\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00bd\3\2\2\2\u00a7\u00a8\f\7\2\2\u00a8\u00a9\5\32"+
		"\16\2\u00a9\u00aa\5\24\13\2\u00aa\u00bc\3\2\2\2\u00ab\u00ac\f\6\2\2\u00ac"+
		"\u00ad\5\26\f\2\u00ad\u00ae\5\24\13\2\u00ae\u00bc\3\2\2\2\u00af\u00b0"+
		"\f\5\2\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\5\24\13"+
		"\2\u00b3\u00b4\7\26\2\2\u00b4\u00bc\3\2\2\2\u00b5\u00b6\f\4\2\2\u00b6"+
		"\u00b7\5\26\f\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba"+
		"\7\26\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00a7\3\2\2\2\u00bb\u00ab\3\2\2\2"+
		"\u00bb\u00af\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c1\t\3\2\2\u00c1\27\3\2\2\2\u00c2\u00c3\7\32\2\2\u00c3\u00c9\7\25"+
		"\2\2\u00c4\u00ca\5\24\13\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7\5\24\13\2"+
		"\u00c7\u00c8\7\26\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00ca\u00d9\3\2\2\2\u00cb\u00cf\7#\2\2\u00cc\u00cf\5\26\f\2\u00cd"+
		"\u00cf\5\32\16\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3"+
		"\2\2\2\u00cf\u00d5\3\2\2\2\u00d0\u00d6\5\24\13\2\u00d1\u00d2\7\25\2\2"+
		"\u00d2\u00d3\5\24\13\2\u00d3\u00d4\7\26\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00ce\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\26\2\2\u00dd\31\3\2\2"+
		"\2\u00de\u00df\t\4\2\2\u00df\33\3\2\2\2\u00e0\u00e1\t\5\2\2\u00e1\35\3"+
		"\2\2\2\21(EQSv\u0082\u0084\u008c\u00a5\u00bb\u00bd\u00c9\u00ce\u00d5\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}