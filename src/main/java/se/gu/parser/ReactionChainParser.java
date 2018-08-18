// Generated from ReactionChain.g4 by ANTLR 4.4

 	
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
public class ReactionChainParser extends Parser {
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
		RULE_reactionChain = 0, RULE_react = 1, RULE_booleanexp = 2, RULE_unop = 3, 
		RULE_lop = 4, RULE_atom = 5, RULE_posassignement = 6, RULE_posnumAss = 7, 
		RULE_expression = 8, RULE_function = 9, RULE_operator = 10, RULE_positiveoperator = 11;
	public static final String[] ruleNames = {
		"reactionChain", "react", "booleanexp", "unop", "lop", "atom", "posassignement", 
		"posnumAss", "expression", "function", "operator", "positiveoperator"
	};

	@Override
	public String getGrammarFileName() { return "ReactionChain.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  boolean matchedEOF=false;
	 	
	 	
	 
	public ReactionChainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReactionChainContext extends ParserRuleContext {
		public ReactContext react() {
			return getRuleContext(ReactContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ReactionChainParser.EOF, 0); }
		public TerminalNode GLOBALLY() { return getToken(ReactionChainParser.GLOBALLY, 0); }
		public ReactionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterReactionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitReactionChain(this);
		}
	}

	public final ReactionChainContext reactionChain() throws RecognitionException {
		ReactionChainContext _localctx = new ReactionChainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reactionChain);
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); match(GLOBALLY);
				setState(25); react(0);
				setState(26); match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); match(GLOBALLY);
				setState(29); match(LPAR);
				setState(30); react(0);
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
		public List<ReactContext> react() {
			return getRuleContexts(ReactContext.class);
		}
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public ReactContext react(int i) {
			return getRuleContext(ReactContext.class,i);
		}
		public ReactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_react; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterReact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitReact(this);
		}
	}

	public final ReactContext react() throws RecognitionException {
		return react(0);
	}

	private ReactContext react(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReactContext _localctx = new ReactContext(_ctx, _parentState);
		ReactContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_react, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37); match(LPAR);
				setState(38); react(0);
				setState(39); match(RPAR);
				{
				setState(40); match(T__9);
				setState(41); match(LPAR);
				setState(42); react(0);
				setState(43); match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(45); match(LPAR);
				setState(46); react(0);
				setState(47); match(RPAR);
				{
				setState(48); match(T__9);
				setState(49); react(0);
				}
				}
				break;
			case 3:
				{
				setState(51); booleanexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ReactContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_react);
						setState(54);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(55); match(T__9);
						setState(56); react(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new ReactContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_react);
						setState(57);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(58); match(T__9);
						setState(59); match(LPAR);
						setState(60); react(0);
						setState(61); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(67);
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
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitBooleanexp(this);
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
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69); unop();
				setState(70); booleanexp(7);
				}
				break;
			case 2:
				{
				setState(72); match(LPAR);
				setState(73); booleanexp(0);
				setState(74); match(RPAR);
				}
				break;
			case 3:
				{
				setState(76); match(LPAR);
				setState(77); booleanexp(0);
				setState(78); match(RPAR);
				setState(79); lop();
				setState(80); booleanexp(0);
				}
				break;
			case 4:
				{
				setState(82); match(LPAR);
				setState(83); booleanexp(0);
				setState(84); match(RPAR);
				{
				setState(85); lop();
				setState(86); match(LPAR);
				setState(87); booleanexp(0);
				setState(88); match(RPAR);
				}
				}
				break;
			case 5:
				{
				setState(90); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94); lop();
						setState(95); booleanexp(6);
						}
						break;
					case 2:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98); lop();
						{
						setState(99); match(LPAR);
						setState(100); booleanexp(0);
						setState(101); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(107);
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
		public TerminalNode NEG() { return getToken(ReactionChainParser.NEG, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(NEG);
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
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		public TerminalNode ID() { return getToken(ReactionChainParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(ReactionChainParser.MINUS, 0); }
		public TerminalNode CONSTANT() { return getToken(ReactionChainParser.CONSTANT, 0); }
		public TerminalNode NAT() { return getToken(ReactionChainParser.NAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(ID);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); match(NAT);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(114); match(CONSTANT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(MINUS);
				setState(116); match(NAT);
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
		public List<TerminalNode> ID() { return getTokens(ReactionChainParser.ID); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(ReactionChainParser.ID, i);
		}
		public PosassignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posassignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterPosassignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitPosassignement(this);
		}
	}

	public final PosassignementContext posassignement() throws RecognitionException {
		PosassignementContext _localctx = new PosassignementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_posassignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(ID);
			setState(120); operator();
			setState(121); match(ID);
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
		public TerminalNode ID() { return getToken(ReactionChainParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NAT() { return getToken(ReactionChainParser.NAT, 0); }
		public PosnumAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posnumAss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterPosnumAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitPosnumAss(this);
		}
	}

	public final PosnumAssContext posnumAss() throws RecognitionException {
		PosnumAssContext _localctx = new PosnumAssContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_posnumAss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(ID);
			setState(124); operator();
			setState(125); match(NAT);
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
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitExpression(this);
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
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(128); unop();
				setState(129); expression(8);
				}
				break;
			case 2:
				{
				setState(131); match(LPAR);
				setState(132); expression(0);
				setState(133); match(RPAR);
				}
				break;
			case 3:
				{
				setState(135); unop();
				setState(136); match(LPAR);
				setState(137); expression(0);
				setState(138); match(RPAR);
				}
				break;
			case 4:
				{
				setState(140); function();
				}
				break;
			case 5:
				{
				setState(141); atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(145); operator();
						setState(146); expression(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(149); lop();
						setState(150); expression(0);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(153); operator();
						setState(154); match(LPAR);
						setState(155); expression(0);
						setState(156); match(RPAR);
						}
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(159); lop();
						setState(160); match(LPAR);
						setState(161); expression(0);
						setState(162); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(168);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactionChainParser.ID, 0); }
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
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(ID);
			{
			setState(170); match(LPAR);
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(171); expression(0);
				}
				break;
			case 2:
				{
				setState(172); match(LPAR);
				setState(173); expression(0);
				setState(174); match(RPAR);
				}
				break;
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << EQUAL) | (1L << MINUS) | (1L << COMMA))) != 0)) {
				{
				{
				setState(181);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(178); match(COMMA);
					}
					break;
				case 2:
					{
					setState(179); lop();
					}
					break;
				case 3:
					{
					setState(180); operator();
					}
					break;
				}
				setState(188);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(183); expression(0);
					}
					break;
				case 2:
					{
					setState(184); match(LPAR);
					setState(185); expression(0);
					setState(186); match(RPAR);
					}
					break;
				}
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195); match(RPAR);
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
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).enterPositiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactionChainListener ) ((ReactionChainListener)listener).exitPositiveoperator(this);
		}
	}

	public final PositiveoperatorContext positiveoperator() throws RecognitionException {
		PositiveoperatorContext _localctx = new PositiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_positiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		case 1: return react_sempred((ReactContext)_localctx, predIndex);
		case 2: return booleanexp_sempred((BooleanexpContext)_localctx, predIndex);
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean react_sempred(ReactContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\67"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"j\n\4\f\4\16\4m\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7x\n\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\13\3\13\3\13"+
		"\5\13\u00b8\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bf\n\13\7\13\u00c1\n"+
		"\13\f\13\16\13\u00c4\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\5\4\6\22\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\5\5\2\b\b\13\13\27\27\6\2\4\7\t\n\f\f"+
		"\27\30\6\2\5\5\7\7\n\n\27\27\u00da\2$\3\2\2\2\4\66\3\2\2\2\6]\3\2\2\2"+
		"\bn\3\2\2\2\np\3\2\2\2\fw\3\2\2\2\16y\3\2\2\2\20}\3\2\2\2\22\u0090\3\2"+
		"\2\2\24\u00ab\3\2\2\2\26\u00c7\3\2\2\2\30\u00c9\3\2\2\2\32\33\7\r\2\2"+
		"\33\34\5\4\3\2\34\35\7\2\2\3\35%\3\2\2\2\36\37\7\r\2\2\37 \7\25\2\2 !"+
		"\5\4\3\2!\"\7\26\2\2\"#\7\2\2\3#%\3\2\2\2$\32\3\2\2\2$\36\3\2\2\2%\3\3"+
		"\2\2\2&\'\b\3\1\2\'(\7\25\2\2()\5\4\3\2)*\7\26\2\2*+\7\3\2\2+,\7\25\2"+
		"\2,-\5\4\3\2-.\7\26\2\2.\67\3\2\2\2/\60\7\25\2\2\60\61\5\4\3\2\61\62\7"+
		"\26\2\2\62\63\7\3\2\2\63\64\5\4\3\2\64\67\3\2\2\2\65\67\5\6\4\2\66&\3"+
		"\2\2\2\66/\3\2\2\2\66\65\3\2\2\2\67C\3\2\2\289\f\7\2\29:\7\3\2\2:B\5\4"+
		"\3\2;<\f\6\2\2<=\7\3\2\2=>\7\25\2\2>?\5\4\3\2?@\7\26\2\2@B\3\2\2\2A8\3"+
		"\2\2\2A;\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EC\3\2\2\2FG"+
		"\b\4\1\2GH\5\b\5\2HI\5\6\4\tI^\3\2\2\2JK\7\25\2\2KL\5\6\4\2LM\7\26\2\2"+
		"M^\3\2\2\2NO\7\25\2\2OP\5\6\4\2PQ\7\26\2\2QR\5\n\6\2RS\5\6\4\2S^\3\2\2"+
		"\2TU\7\25\2\2UV\5\6\4\2VW\7\26\2\2WX\5\n\6\2XY\7\25\2\2YZ\5\6\4\2Z[\7"+
		"\26\2\2[^\3\2\2\2\\^\5\22\n\2]F\3\2\2\2]J\3\2\2\2]N\3\2\2\2]T\3\2\2\2"+
		"]\\\3\2\2\2^k\3\2\2\2_`\f\7\2\2`a\5\n\6\2ab\5\6\4\bbj\3\2\2\2cd\f\6\2"+
		"\2de\5\n\6\2ef\7\25\2\2fg\5\6\4\2gh\7\26\2\2hj\3\2\2\2i_\3\2\2\2ic\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\7\3\2\2\2mk\3\2\2\2no\7\24\2\2o\t"+
		"\3\2\2\2pq\t\2\2\2q\13\3\2\2\2rx\7\32\2\2sx\7\34\2\2tx\7\33\2\2uv\7\30"+
		"\2\2vx\7\34\2\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2x\r\3\2\2\2yz\7"+
		"\32\2\2z{\5\26\f\2{|\7\32\2\2|\17\3\2\2\2}~\7\32\2\2~\177\5\26\f\2\177"+
		"\u0080\7\34\2\2\u0080\21\3\2\2\2\u0081\u0082\b\n\1\2\u0082\u0083\5\b\5"+
		"\2\u0083\u0084\5\22\n\n\u0084\u0091\3\2\2\2\u0085\u0086\7\25\2\2\u0086"+
		"\u0087\5\22\n\2\u0087\u0088\7\26\2\2\u0088\u0091\3\2\2\2\u0089\u008a\5"+
		"\b\5\2\u008a\u008b\7\25\2\2\u008b\u008c\5\22\n\2\u008c\u008d\7\26\2\2"+
		"\u008d\u0091\3\2\2\2\u008e\u0091\5\24\13\2\u008f\u0091\5\f\7\2\u0090\u0081"+
		"\3\2\2\2\u0090\u0085\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u00a8\3\2\2\2\u0092\u0093\f\7\2\2\u0093\u0094\5\26"+
		"\f\2\u0094\u0095\5\22\n\2\u0095\u00a7\3\2\2\2\u0096\u0097\f\6\2\2\u0097"+
		"\u0098\5\n\6\2\u0098\u0099\5\22\n\2\u0099\u00a7\3\2\2\2\u009a\u009b\f"+
		"\5\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\25\2\2\u009d\u009e\5\22\n\2"+
		"\u009e\u009f\7\26\2\2\u009f\u00a7\3\2\2\2\u00a0\u00a1\f\4\2\2\u00a1\u00a2"+
		"\5\n\6\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\7\26\2"+
		"\2\u00a5\u00a7\3\2\2\2\u00a6\u0092\3\2\2\2\u00a6\u0096\3\2\2\2\u00a6\u009a"+
		"\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\32\2"+
		"\2\u00ac\u00b2\7\25\2\2\u00ad\u00b3\5\22\n\2\u00ae\u00af\7\25\2\2\u00af"+
		"\u00b0\5\22\n\2\u00b0\u00b1\7\26\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3"+
		"\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00c2\3\2\2\2\u00b4\u00b8\7#\2\2\u00b5"+
		"\u00b8\5\n\6\2\u00b6\u00b8\5\26\f\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00be\3\2\2\2\u00b9\u00bf\5\22\n\2\u00ba"+
		"\u00bb\7\25\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\7\26\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00b7\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6"+
		"\25\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\27\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca"+
		"\31\3\2\2\2\21$\66AC]ikw\u0090\u00a6\u00a8\u00b2\u00b7\u00be\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}