// Generated from Visit.g4 by ANTLR 4.4

 	
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
public class VisitParser extends Parser {
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
		RULE_visit = 0, RULE_booleanexp = 1, RULE_lop = 2, RULE_unop = 3, RULE_atom = 4, 
		RULE_posassignement = 5, RULE_posnumAss = 6, RULE_expression = 7, RULE_function = 8, 
		RULE_operator = 9, RULE_positiveoperator = 10;
	public static final String[] ruleNames = {
		"visit", "booleanexp", "lop", "unop", "atom", "posassignement", "posnumAss", 
		"expression", "function", "operator", "positiveoperator"
	};

	@Override
	public String getGrammarFileName() { return "Visit.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  boolean matchedEOF=false;
	 	
	 	
	 
	public VisitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VisitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VisitParser.EOF, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public VisitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterVisit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitVisit(this);
		}
	}

	public final VisitContext visit() throws RecognitionException {
		VisitContext _localctx = new VisitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_visit);
		try {
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); match(GLOBALLYFINALLY);
				setState(23); booleanexp(0);
				setState(24); match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(GLOBALLYFINALLY);
				setState(27); match(LPAR);
				setState(28); booleanexp(0);
				setState(29); match(RPAR);
				setState(30); match(EOF);
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
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitBooleanexp(this);
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
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(35); unop();
				setState(36); booleanexp(7);
				}
				break;
			case 2:
				{
				setState(38); match(LPAR);
				setState(39); booleanexp(0);
				setState(40); match(RPAR);
				}
				break;
			case 3:
				{
				setState(42); match(LPAR);
				setState(43); booleanexp(0);
				setState(44); match(RPAR);
				setState(45); lop();
				setState(46); booleanexp(0);
				}
				break;
			case 4:
				{
				setState(48); match(LPAR);
				setState(49); booleanexp(0);
				setState(50); match(RPAR);
				{
				setState(51); lop();
				setState(52); match(LPAR);
				setState(53); booleanexp(0);
				setState(54); match(RPAR);
				}
				}
				break;
			case 5:
				{
				setState(56); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(59);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(60); lop();
						setState(61); booleanexp(6);
						}
						break;
					case 2:
						{
						_localctx = new BooleanexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexp);
						setState(63);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(64); lop();
						{
						setState(65); match(LPAR);
						setState(66); booleanexp(0);
						setState(67); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(73);
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

	public static class LopContext extends ParserRuleContext {
		public LopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(VisitParser.NEG, 0); }
		public TerminalNode NEXT() { return getToken(VisitParser.NEXT, 0); }
		public TerminalNode PREV() { return getToken(VisitParser.PREV, 0); }
		public TerminalNode TEXTUALNEXT() { return getToken(VisitParser.TEXTUALNEXT, 0); }
		public TerminalNode GLOBALLYFINALLY(int i) {
			return getToken(VisitParser.GLOBALLYFINALLY, i);
		}
		public TerminalNode GLOBALLY() { return getToken(VisitParser.GLOBALLY, 0); }
		public List<TerminalNode> GLOBALLYFINALLY() { return getTokens(VisitParser.GLOBALLYFINALLY); }
		public TerminalNode YESTERDAY() { return getToken(VisitParser.YESTERDAY, 0); }
		public TerminalNode FINALLY() { return getToken(VisitParser.FINALLY, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		public TerminalNode ID() { return getToken(VisitParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(VisitParser.MINUS, 0); }
		public TerminalNode CONSTANT() { return getToken(VisitParser.CONSTANT, 0); }
		public TerminalNode NAT() { return getToken(VisitParser.NAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); match(ID);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(NAT);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); match(CONSTANT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); match(MINUS);
				setState(82); match(NAT);
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
		public List<TerminalNode> ID() { return getTokens(VisitParser.ID); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(VisitParser.ID, i);
		}
		public PosassignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posassignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterPosassignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitPosassignement(this);
		}
	}

	public final PosassignementContext posassignement() throws RecognitionException {
		PosassignementContext _localctx = new PosassignementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_posassignement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(ID);
			setState(86); operator();
			setState(87); match(ID);
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
		public TerminalNode ID() { return getToken(VisitParser.ID, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NAT() { return getToken(VisitParser.NAT, 0); }
		public PosnumAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posnumAss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterPosnumAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitPosnumAss(this);
		}
	}

	public final PosnumAssContext posnumAss() throws RecognitionException {
		PosnumAssContext _localctx = new PosnumAssContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_posnumAss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(ID);
			setState(90); operator();
			setState(91); match(NAT);
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
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitExpression(this);
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
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(94); unop();
				setState(95); expression(8);
				}
				break;
			case 2:
				{
				setState(97); match(LPAR);
				setState(98); expression(0);
				setState(99); match(RPAR);
				}
				break;
			case 3:
				{
				setState(101); unop();
				setState(102); match(LPAR);
				setState(103); expression(0);
				setState(104); match(RPAR);
				}
				break;
			case 4:
				{
				setState(106); function();
				}
				break;
			case 5:
				{
				setState(107); atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(111); operator();
						setState(112); expression(0);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(115); lop();
						setState(116); expression(0);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(119); operator();
						setState(120); match(LPAR);
						setState(121); expression(0);
						setState(122); match(RPAR);
						}
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(125); lop();
						setState(126); match(LPAR);
						setState(127); expression(0);
						setState(128); match(RPAR);
						}
						}
						break;
					}
					} 
				}
				setState(134);
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
		public TerminalNode ID() { return getToken(VisitParser.ID, 0); }
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
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(ID);
			{
			setState(136); match(LPAR);
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(137); expression(0);
				}
				break;
			case 2:
				{
				setState(138); match(LPAR);
				setState(139); expression(0);
				setState(140); match(RPAR);
				}
				break;
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << EQUAL) | (1L << MINUS) | (1L << COMMA))) != 0)) {
				{
				{
				setState(147);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(144); match(COMMA);
					}
					break;
				case 2:
					{
					setState(145); lop();
					}
					break;
				case 3:
					{
					setState(146); operator();
					}
					break;
				}
				setState(154);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(149); expression(0);
					}
					break;
				case 2:
					{
					setState(150); match(LPAR);
					setState(151); expression(0);
					setState(152); match(RPAR);
					}
					break;
				}
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(RPAR);
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
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
			if ( listener instanceof VisitListener ) ((VisitListener)listener).enterPositiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisitListener ) ((VisitListener)listener).exitPositiveoperator(this);
		}
	}

	public final PositiveoperatorContext positiveoperator() throws RecognitionException {
		PositiveoperatorContext _localctx = new PositiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_positiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3H\n\3"+
		"\f\3\16\3K\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\to\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\n\3\n\3\n\5\n\u0096\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u009d\n\n\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\2\4\4\20\r\2\4\6\b\n\f\16\20\22\24\26\2\6\5\2\7"+
		"\7\n\n\26\26\3\2\f\23\6\2\3\6\b\t\13\13\26\27\6\2\4\4\6\6\t\t\26\26\u00b5"+
		"\2\"\3\2\2\2\4;\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16"+
		"[\3\2\2\2\20n\3\2\2\2\22\u0089\3\2\2\2\24\u00a5\3\2\2\2\26\u00a7\3\2\2"+
		"\2\30\31\7\17\2\2\31\32\5\4\3\2\32\33\7\2\2\3\33#\3\2\2\2\34\35\7\17\2"+
		"\2\35\36\7\24\2\2\36\37\5\4\3\2\37 \7\25\2\2 !\7\2\2\3!#\3\2\2\2\"\30"+
		"\3\2\2\2\"\34\3\2\2\2#\3\3\2\2\2$%\b\3\1\2%&\5\b\5\2&\'\5\4\3\t\'<\3\2"+
		"\2\2()\7\24\2\2)*\5\4\3\2*+\7\25\2\2+<\3\2\2\2,-\7\24\2\2-.\5\4\3\2./"+
		"\7\25\2\2/\60\5\6\4\2\60\61\5\4\3\2\61<\3\2\2\2\62\63\7\24\2\2\63\64\5"+
		"\4\3\2\64\65\7\25\2\2\65\66\5\6\4\2\66\67\7\24\2\2\678\5\4\3\289\7\25"+
		"\2\29<\3\2\2\2:<\5\20\t\2;$\3\2\2\2;(\3\2\2\2;,\3\2\2\2;\62\3\2\2\2;:"+
		"\3\2\2\2<I\3\2\2\2=>\f\7\2\2>?\5\6\4\2?@\5\4\3\b@H\3\2\2\2AB\f\6\2\2B"+
		"C\5\6\4\2CD\7\24\2\2DE\5\4\3\2EF\7\25\2\2FH\3\2\2\2G=\3\2\2\2GA\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KI\3\2\2\2LM\t\2\2\2M\7\3\2"+
		"\2\2NO\t\3\2\2O\t\3\2\2\2PV\7\31\2\2QV\7\33\2\2RV\7\32\2\2ST\7\27\2\2"+
		"TV\7\33\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2V\13\3\2\2\2WX\7\31"+
		"\2\2XY\5\24\13\2YZ\7\31\2\2Z\r\3\2\2\2[\\\7\31\2\2\\]\5\24\13\2]^\7\33"+
		"\2\2^\17\3\2\2\2_`\b\t\1\2`a\5\b\5\2ab\5\20\t\nbo\3\2\2\2cd\7\24\2\2d"+
		"e\5\20\t\2ef\7\25\2\2fo\3\2\2\2gh\5\b\5\2hi\7\24\2\2ij\5\20\t\2jk\7\25"+
		"\2\2ko\3\2\2\2lo\5\22\n\2mo\5\n\6\2n_\3\2\2\2nc\3\2\2\2ng\3\2\2\2nl\3"+
		"\2\2\2nm\3\2\2\2o\u0086\3\2\2\2pq\f\7\2\2qr\5\24\13\2rs\5\20\t\2s\u0085"+
		"\3\2\2\2tu\f\6\2\2uv\5\6\4\2vw\5\20\t\2w\u0085\3\2\2\2xy\f\5\2\2yz\5\24"+
		"\13\2z{\7\24\2\2{|\5\20\t\2|}\7\25\2\2}\u0085\3\2\2\2~\177\f\4\2\2\177"+
		"\u0080\5\6\4\2\u0080\u0081\7\24\2\2\u0081\u0082\5\20\t\2\u0082\u0083\7"+
		"\25\2\2\u0083\u0085\3\2\2\2\u0084p\3\2\2\2\u0084t\3\2\2\2\u0084x\3\2\2"+
		"\2\u0084~\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\21\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\31\2\2\u008a"+
		"\u0090\7\24\2\2\u008b\u0091\5\20\t\2\u008c\u008d\7\24\2\2\u008d\u008e"+
		"\5\20\t\2\u008e\u008f\7\25\2\2\u008f\u0091\3\2\2\2\u0090\u008b\3\2\2\2"+
		"\u0090\u008c\3\2\2\2\u0091\u00a0\3\2\2\2\u0092\u0096\7\"\2\2\u0093\u0096"+
		"\5\6\4\2\u0094\u0096\5\24\13\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\u009c\3\2\2\2\u0097\u009d\5\20\t\2\u0098\u0099"+
		"\7\24\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7\25\2\2\u009b\u009d\3\2\2"+
		"\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0095"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\25\2\2\u00a4\23\3\2\2"+
		"\2\u00a5\u00a6\t\4\2\2\u00a6\25\3\2\2\2\u00a7\u00a8\t\5\2\2\u00a8\27\3"+
		"\2\2\2\16\";GIUn\u0084\u0086\u0090\u0095\u009c\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}