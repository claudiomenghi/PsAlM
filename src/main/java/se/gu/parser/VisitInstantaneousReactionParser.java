// Generated from VisitInstantaneousReaction.g4 by ANTLR 4.4

 	
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
public class VisitInstantaneousReactionParser extends Parser {
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
		RULE_visitInstReaction = 0, RULE_react = 1, RULE_booleanexp = 2, RULE_unop = 3, 
		RULE_lop = 4, RULE_atom = 5, RULE_posassignement = 6, RULE_posnumAss = 7, 
		RULE_expression = 8, RULE_function = 9, RULE_operator = 10, RULE_positiveoperator = 11;
	public static final String[] ruleNames = {
		"visitInstReaction", "react", "booleanexp", "unop", "lop", "atom", "posassignement", 
		"posnumAss", "expression", "function", "operator", "positiveoperator"
	};

	@Override
	public String getGrammarFileName() { return "VisitInstantaneousReaction.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  boolean matchedEOF=false;
	 	
	 	
	 
	public VisitInstantaneousReactionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VisitInstReactionContext extends ParserRuleContext {
		public ReactContext react() {
			return getRuleContext(ReactContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VisitInstantaneousReactionParser.EOF, 0); }
		public TerminalNode GLOBALLYFINALLY() { return getToken(VisitInstantaneousReactionParser.GLOBALLYFINALLY, 0); }
		public VisitInstReactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visitInstReaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterVisitInstReaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitVisitInstReaction(this);
		}
	}

	public final VisitInstReactionContext visitInstReaction() throws RecognitionException {
		VisitInstReactionContext _localctx = new VisitInstReactionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_visitInstReaction);
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); match(GLOBALLYFINALLY);
				setState(25); react();
				setState(26); match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); match(GLOBALLYFINALLY);
				setState(29); match(LPAR);
				setState(30); react();
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
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterReact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitReact(this);
		}
	}

	public final ReactContext react() throws RecognitionException {
		ReactContext _localctx = new ReactContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_react);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); booleanexp(0);
			setState(37); match(T__9);
			setState(38); booleanexp(0);
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
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitBooleanexp(this);
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
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(41); unop();
				setState(42); booleanexp(7);
				}
				break;
			case 2:
				{
				setState(44); match(LPAR);
				setState(45); booleanexp(0);
				setState(46); match(RPAR);
				}
				break;
			case 3:
				{
				setState(48); match(LPAR);
				setState(49); booleanexp(0);
				setState(50); match(RPAR);
				setState(51); lop();
				setState(52); booleanexp(0);
				}
				break;
			case 4:
				{
				setState(54); match(LPAR);
				setState(55); booleanexp(0);
				setState(56); match(RPAR);
				{
				setState(57); lop();
				setState(58); match(LPAR);
				setState(59); booleanexp(0);
				setState(60); match(RPAR);
				}
				}
				break;
			case 5:
				{
				setState(62); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(65);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(66); lop();
						setState(67); booleanexp(6);
						}
						break;
					case 2:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(69);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70); lop();
						{
						setState(71); match(LPAR);
						setState(72); booleanexp(0);
						setState(73); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(79);
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
		public TerminalNode NEG() { return getToken(VisitInstantaneousReactionParser.NEG, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(NEG);
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

	public static class LopContext extends ParserRuleContext {
		public LopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VisitInstantaneousReactionParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(VisitInstantaneousReactionParser.MINUS, 0); }
		public TerminalNode CONSTANT() { return getToken(VisitInstantaneousReactionParser.CONSTANT, 0); }
		public TerminalNode NAT() { return getToken(VisitInstantaneousReactionParser.NAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(ID);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(NAT);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(86); match(CONSTANT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(87); match(MINUS);
				setState(88); match(NAT);
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
		public List<TerminalNode> ID() { return getTokens(VisitInstantaneousReactionParser.ID); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(VisitInstantaneousReactionParser.ID, i);
		}
		public PosassignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posassignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterPosassignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitPosassignement(this);
		}
	}

	public final PosassignementContext posassignement() throws RecognitionException {
		PosassignementContext _localctx = new PosassignementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_posassignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(ID);
			setState(92); operator();
			setState(93); match(ID);
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
		public TerminalNode ID() { return getToken(VisitInstantaneousReactionParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NAT() { return getToken(VisitInstantaneousReactionParser.NAT, 0); }
		public PosnumAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posnumAss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterPosnumAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitPosnumAss(this);
		}
	}

	public final PosnumAssContext posnumAss() throws RecognitionException {
		PosnumAssContext _localctx = new PosnumAssContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_posnumAss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(ID);
			setState(96); operator();
			setState(97); match(NAT);
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
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitExpression(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(100); unop();
				setState(101); expression(8);
				}
				break;
			case 2:
				{
				setState(103); match(LPAR);
				setState(104); expression(0);
				setState(105); match(RPAR);
				}
				break;
			case 3:
				{
				setState(107); unop();
				setState(108); match(LPAR);
				setState(109); expression(0);
				setState(110); match(RPAR);
				}
				break;
			case 4:
				{
				setState(112); function();
				}
				break;
			case 5:
				{
				setState(113); atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(117); operator();
						setState(118); expression(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(121); lop();
						setState(122); expression(0);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(125); operator();
						setState(126); match(LPAR);
						setState(127); expression(0);
						setState(128); match(RPAR);
						}
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(131); lop();
						setState(132); match(LPAR);
						setState(133); expression(0);
						setState(134); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(140);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VisitInstantaneousReactionParser.ID, 0); }
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
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(ID);
			{
			setState(142); match(LPAR);
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(143); expression(0);
				}
				break;
			case 2:
				{
				setState(144); match(LPAR);
				setState(145); expression(0);
				setState(146); match(RPAR);
				}
				break;
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << EQUAL) | (1L << MINUS) | (1L << COMMA))) != 0)) {
				{
				{
				setState(153);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(150); match(COMMA);
					}
					break;
				case 2:
					{
					setState(151); lop();
					}
					break;
				case 3:
					{
					setState(152); operator();
					}
					break;
				}
				setState(160);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(155); expression(0);
					}
					break;
				case 2:
					{
					setState(156); match(LPAR);
					setState(157); expression(0);
					setState(158); match(RPAR);
					}
					break;
				}
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167); match(RPAR);
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
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).enterPositiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitInstantaneousReactionListener ) ((VisitInstantaneousReactionListener)listener).exitPositiveoperator(this);
		}
	}

	public final PositiveoperatorContext positiveoperator() throws RecognitionException {
		PositiveoperatorContext _localctx = new PositiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_positiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
	private boolean booleanexp_sempred(BooleanexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008b\n"+
		"\n\f\n\16\n\u008e\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n"+
		"\13\3\13\3\13\3\13\5\13\u009c\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a3"+
		"\n\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\2\4\6\22\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\5\2\b\b\13\13\27\27"+
		"\6\2\4\7\t\n\f\f\27\30\6\2\5\5\7\7\n\n\27\27\u00ba\2$\3\2\2\2\4&\3\2\2"+
		"\2\6A\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f[\3\2\2\2\16]\3\2\2\2\20a\3\2\2\2"+
		"\22t\3\2\2\2\24\u008f\3\2\2\2\26\u00ab\3\2\2\2\30\u00ad\3\2\2\2\32\33"+
		"\7\20\2\2\33\34\5\4\3\2\34\35\7\2\2\3\35%\3\2\2\2\36\37\7\20\2\2\37 \7"+
		"\25\2\2 !\5\4\3\2!\"\7\26\2\2\"#\7\2\2\3#%\3\2\2\2$\32\3\2\2\2$\36\3\2"+
		"\2\2%\3\3\2\2\2&\'\5\6\4\2\'(\7\3\2\2()\5\6\4\2)\5\3\2\2\2*+\b\4\1\2+"+
		",\5\b\5\2,-\5\6\4\t-B\3\2\2\2./\7\25\2\2/\60\5\6\4\2\60\61\7\26\2\2\61"+
		"B\3\2\2\2\62\63\7\25\2\2\63\64\5\6\4\2\64\65\7\26\2\2\65\66\5\n\6\2\66"+
		"\67\5\6\4\2\67B\3\2\2\289\7\25\2\29:\5\6\4\2:;\7\26\2\2;<\5\n\6\2<=\7"+
		"\25\2\2=>\5\6\4\2>?\7\26\2\2?B\3\2\2\2@B\5\22\n\2A*\3\2\2\2A.\3\2\2\2"+
		"A\62\3\2\2\2A8\3\2\2\2A@\3\2\2\2BO\3\2\2\2CD\f\7\2\2DE\5\n\6\2EF\5\6\4"+
		"\bFN\3\2\2\2GH\f\6\2\2HI\5\n\6\2IJ\7\25\2\2JK\5\6\4\2KL\7\26\2\2LN\3\2"+
		"\2\2MC\3\2\2\2MG\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3"+
		"\2\2\2RS\7\24\2\2S\t\3\2\2\2TU\t\2\2\2U\13\3\2\2\2V\\\7\32\2\2W\\\7\34"+
		"\2\2X\\\7\33\2\2YZ\7\30\2\2Z\\\7\34\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2"+
		"[Y\3\2\2\2\\\r\3\2\2\2]^\7\32\2\2^_\5\26\f\2_`\7\32\2\2`\17\3\2\2\2ab"+
		"\7\32\2\2bc\5\26\f\2cd\7\34\2\2d\21\3\2\2\2ef\b\n\1\2fg\5\b\5\2gh\5\22"+
		"\n\nhu\3\2\2\2ij\7\25\2\2jk\5\22\n\2kl\7\26\2\2lu\3\2\2\2mn\5\b\5\2no"+
		"\7\25\2\2op\5\22\n\2pq\7\26\2\2qu\3\2\2\2ru\5\24\13\2su\5\f\7\2te\3\2"+
		"\2\2ti\3\2\2\2tm\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\u008c\3\2\2\2vw\f\7\2\2"+
		"wx\5\26\f\2xy\5\22\n\2y\u008b\3\2\2\2z{\f\6\2\2{|\5\n\6\2|}\5\22\n\2}"+
		"\u008b\3\2\2\2~\177\f\5\2\2\177\u0080\5\26\f\2\u0080\u0081\7\25\2\2\u0081"+
		"\u0082\5\22\n\2\u0082\u0083\7\26\2\2\u0083\u008b\3\2\2\2\u0084\u0085\f"+
		"\4\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7\25\2\2\u0087\u0088\5\22\n\2\u0088"+
		"\u0089\7\26\2\2\u0089\u008b\3\2\2\2\u008av\3\2\2\2\u008az\3\2\2\2\u008a"+
		"~\3\2\2\2\u008a\u0084\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\7\32\2\2\u0090\u0096\7\25\2\2\u0091\u0097\5\22\n\2\u0092\u0093\7\25\2"+
		"\2\u0093\u0094\5\22\n\2\u0094\u0095\7\26\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u00a6\3\2\2\2\u0098\u009c\7#"+
		"\2\2\u0099\u009c\5\n\6\2\u009a\u009c\5\26\f\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a2\3\2\2\2\u009d\u00a3\5\22"+
		"\n\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\7\26\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u009b\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\26"+
		"\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac\27\3\2\2\2\u00ad\u00ae"+
		"\t\4\2\2\u00ae\31\3\2\2\2\16$AMO[t\u008a\u008c\u0096\u009b\u00a2\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}