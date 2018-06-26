// Generated from MISSION.g4 by ANTLR 4.4

 	
 	package se.got.parser;
 	import se.got.ltl.atoms.LTLAtom;
 	
 	import se.got.ltl.atoms.LTLPAAtom;
 	import se.got.ltl.atoms.LTLPEAtom;
 	import se.got.ltl.atoms.LTLPLAtom;
 	import java.util.HashSet;
 	import se.got.patterns.Pattern;
 	import java.util.Set;
 	import se.got.patterns.coremovement.coverage.*;
 	import se.got.patterns.coremovement.surveillance.*;
 	import se.got.patterns.avoidance.conditional.*;
 	import se.got.patterns.avoidance.restricted.*;
 	import se.got.patterns.triggers.*;
 	import se.got.mission.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MISSIONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		WS=40, ID=41, NAT=42, TRUE=43, FALSE=44, NEWLINE=45, COMMA=46, COMMENT=47, 
		LINE_COMMENT=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'robot '", "') then '", "' must not visit location '", "'exec'", 
		"' times'", "'ordered_patrolling('", "'fair_visit('", "' less than '", 
		"') then finally ('", "' exactly   '", "' holds'", "' must  visit location '", 
		"'strict_ordered_visit('", "' must avoid location '", "'strict_ordered_patrolling('", 
		"'after condition '", "'('", "'conditions:  {'", "'ordered_visit('", "'visit('", 
		"'mission: '", "'sequenced_patrolling('", "'sequenced_visit('", "') AND ('", 
		"'actions: {'", "') OR ('", "'if ('", "'until '", "'};'", "'fair_patrolling('", 
		"'wait'", "' more than '", "'patrolling('", "'in'", "' until condition '", 
		"' holds, robot '", "')'", "'robots: {'", "'locations:  {'", "WS", "ID", 
		"NAT", "'true'", "'false'", "NEWLINE", "','", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_mission = 0, RULE_robotsDecl = 1, RULE_actionDecl = 2, RULE_locationDecl = 3, 
		RULE_conditionsDecl = 4, RULE_pl = 5, RULE_pa = 6, RULE_pe = 7, RULE_goal = 8, 
		RULE_pattern = 9, RULE_avoidance = 10, RULE_conditional = 11, RULE_restricted = 12, 
		RULE_future_avoidance = 13, RULE_global_avoidance = 14, RULE_past_avoidance = 15, 
		RULE_lower_restricted_avoidance = 16, RULE_exact_restricted_avoidance = 17, 
		RULE_upper_restricted_avoidance = 18, RULE_core_movement_pattern = 19, 
		RULE_coverage = 20, RULE_surveillance = 21, RULE_visit = 22, RULE_sequenced_visit = 23, 
		RULE_ordered_visit = 24, RULE_strict_ordered_visit = 25, RULE_fair_visit = 26, 
		RULE_patrolling = 27, RULE_sequenced_patrolling = 28, RULE_ordered_patrolling = 29, 
		RULE_strict_ordered_patrolling = 30, RULE_fair_patrolling = 31, RULE_robot = 32, 
		RULE_action = 33, RULE_location = 34, RULE_condition = 35;
	public static final String[] ruleNames = {
		"mission", "robotsDecl", "actionDecl", "locationDecl", "conditionsDecl", 
		"pl", "pa", "pe", "goal", "pattern", "avoidance", "conditional", "restricted", 
		"future_avoidance", "global_avoidance", "past_avoidance", "lower_restricted_avoidance", 
		"exact_restricted_avoidance", "upper_restricted_avoidance", "core_movement_pattern", 
		"coverage", "surveillance", "visit", "sequenced_visit", "ordered_visit", 
		"strict_ordered_visit", "fair_visit", "patrolling", "sequenced_patrolling", 
		"ordered_patrolling", "strict_ordered_patrolling", "fair_patrolling", 
		"robot", "action", "location", "condition"
	};

	@Override
	public String getGrammarFileName() { return "MISSION.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  boolean matchedEOF=false;
	 	
	 	
	 
	public MISSIONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MissionContext extends ParserRuleContext {
		public Mission robotsmission;
		public RobotsDeclContext robotsDecl;
		public ActionDeclContext actionDecl;
		public LocationDeclContext locationDecl;
		public ConditionsDeclContext conditionsDecl;
		public GoalContext goal;
		public GoalContext goal() {
			return getRuleContext(GoalContext.class,0);
		}
		public LocationDeclContext locationDecl() {
			return getRuleContext(LocationDeclContext.class,0);
		}
		public ConditionsDeclContext conditionsDecl() {
			return getRuleContext(ConditionsDeclContext.class,0);
		}
		public ActionDeclContext actionDecl() {
			return getRuleContext(ActionDeclContext.class,0);
		}
		public RobotsDeclContext robotsDecl() {
			return getRuleContext(RobotsDeclContext.class,0);
		}
		public MissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterMission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitMission(this);
		}
	}

	public final MissionContext mission() throws RecognitionException {
		MissionContext _localctx = new MissionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(72); ((MissionContext)_localctx).robotsDecl = robotsDecl();
			setState(73); ((MissionContext)_localctx).actionDecl = actionDecl();
			setState(74); ((MissionContext)_localctx).locationDecl = locationDecl();
			setState(75); ((MissionContext)_localctx).conditionsDecl = conditionsDecl();
			setState(76); match(T__18);
			setState(77); ((MissionContext)_localctx).goal = goal();

						((MissionContext)_localctx).robotsmission = new Mission(((MissionContext)_localctx).goal.value, ((MissionContext)_localctx).robotsDecl.value, ((MissionContext)_localctx).actionDecl.value, ((MissionContext)_localctx).conditionsDecl.value, ((MissionContext)_localctx).locationDecl.value);
					
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

	public static class RobotsDeclContext extends ParserRuleContext {
		public Set<String> value;
		public RobotContext robot;
		public List<RobotContext> robot() {
			return getRuleContexts(RobotContext.class);
		}
		public RobotContext robot(int i) {
			return getRuleContext(RobotContext.class,i);
		}
		public RobotsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robotsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterRobotsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitRobotsDecl(this);
		}
	}

	public final RobotsDeclContext robotsDecl() throws RecognitionException {
		RobotsDeclContext _localctx = new RobotsDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_robotsDecl);

			((RobotsDeclContext)_localctx).value = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(T__1);
			setState(81); ((RobotsDeclContext)_localctx).robot = robot();

					_localctx.value.add(((RobotsDeclContext)_localctx).robot.value);
				
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83); match(COMMA);
				setState(84); ((RobotsDeclContext)_localctx).robot = robot();

						_localctx.value.add(((RobotsDeclContext)_localctx).robot.value);
					
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); match(T__10);
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

	public static class ActionDeclContext extends ParserRuleContext {
		public Set<String> value;
		public ActionContext action;
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ActionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterActionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitActionDecl(this);
		}
	}

	public final ActionDeclContext actionDecl() throws RecognitionException {
		ActionDeclContext _localctx = new ActionDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actionDecl);

			((ActionDeclContext)_localctx).value = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(T__14);
			setState(95); ((ActionDeclContext)_localctx).action = action();

					_localctx.value.add(((ActionDeclContext)_localctx).action.value);
				
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97); match(COMMA);
				setState(98); ((ActionDeclContext)_localctx).action = action();

						_localctx.value.add(((ActionDeclContext)_localctx).action.value);
					
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); match(T__10);
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

	public static class LocationDeclContext extends ParserRuleContext {
		public Set<String> value;
		public LocationContext location;
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public LocationDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterLocationDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitLocationDecl(this);
		}
	}

	public final LocationDeclContext locationDecl() throws RecognitionException {
		LocationDeclContext _localctx = new LocationDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_locationDecl);

			((LocationDeclContext)_localctx).value = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(T__0);
			setState(109); ((LocationDeclContext)_localctx).location = location();

					_localctx.value.add(((LocationDeclContext)_localctx).location.value);
				
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111); match(COMMA);
				setState(112); ((LocationDeclContext)_localctx).location = location();

						_localctx.value.add(((LocationDeclContext)_localctx).location.value);
					
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(T__10);
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

	public static class ConditionsDeclContext extends ParserRuleContext {
		public Set<String> value;
		public ConditionContext condition;
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterConditionsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitConditionsDecl(this);
		}
	}

	public final ConditionsDeclContext conditionsDecl() throws RecognitionException {
		ConditionsDeclContext _localctx = new ConditionsDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditionsDecl);

			((ConditionsDeclContext)_localctx).value = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(T__21);
			setState(123); ((ConditionsDeclContext)_localctx).condition = condition();

					_localctx.value.add(((ConditionsDeclContext)_localctx).condition.value);
				
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125); match(COMMA);
				setState(126); ((ConditionsDeclContext)_localctx).condition = condition();

						_localctx.value.add(((ConditionsDeclContext)_localctx).condition.value);
					
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134); match(T__10);
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

	public static class PlContext extends ParserRuleContext {
		public LTLPLAtom atom;
		public RobotContext robot;
		public LocationContext location;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public PlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterPl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitPl(this);
		}
	}

	public final PlContext pl() throws RecognitionException {
		PlContext _localctx = new PlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); ((PlContext)_localctx).robot = robot();
			setState(137); match(T__5);
			setState(138); ((PlContext)_localctx).location = location();

				((PlContext)_localctx).atom = new LTLPLAtom(((PlContext)_localctx).robot.value, ((PlContext)_localctx).location.value);
				

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

	public static class PaContext extends ParserRuleContext {
		public LTLPAAtom atom;
		public RobotContext robot;
		public ActionContext action;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public PaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterPa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitPa(this);
		}
	}

	public final PaContext pa() throws RecognitionException {
		PaContext _localctx = new PaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ((PaContext)_localctx).robot = robot();
			setState(142); match(T__35);
			setState(143); ((PaContext)_localctx).action = action();

				((PaContext)_localctx).atom = new LTLPAAtom(((PaContext)_localctx).robot.value, ((PaContext)_localctx).action.value);

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

	public static class PeContext extends ParserRuleContext {
		public LTLPEAtom atom;
		public ConditionContext condition;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public PeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterPe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitPe(this);
		}
	}

	public final PeContext pe() throws RecognitionException {
		PeContext _localctx = new PeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); ((PeContext)_localctx).condition = condition();

				((PeContext)_localctx).atom = new LTLPEAtom(((PeContext)_localctx).condition.value);

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

	public static class GoalContext extends ParserRuleContext {
		public Goal value;
		public PatternContext pattern;
		public GoalContext g1;
		public GoalContext g2;
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<GoalContext> goal() {
			return getRuleContexts(GoalContext.class);
		}
		public GoalContext goal(int i) {
			return getRuleContext(GoalContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_goal);
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); ((GoalContext)_localctx).pattern = pattern();

						((GoalContext)_localctx).value = new BasicGoal(((GoalContext)_localctx).pattern.value);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(T__22);
				setState(153); ((GoalContext)_localctx).g1 = goal();
				setState(154); match(T__15);
				setState(155); ((GoalContext)_localctx).g2 = goal();
				setState(156); match(T__2);

						((GoalContext)_localctx).value = new AndGoal(((GoalContext)_localctx).g1.value, ((GoalContext)_localctx).g2.value);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); match(T__22);
				setState(160); ((GoalContext)_localctx).g1 = goal();
				setState(161); match(T__13);
				setState(162); ((GoalContext)_localctx).g2 = goal();
				setState(163); match(T__2);

						((GoalContext)_localctx).value = new OrGoal(((GoalContext)_localctx).g1.value, ((GoalContext)_localctx).g2.value);
					
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

	public static class PatternContext extends ParserRuleContext {
		public Pattern value;
		public Core_movement_patternContext core_movement_pattern;
		public AvoidanceContext avoidance;
		public PeContext pe;
		public PlContext pl;
		public PatternContext pattern;
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public AvoidanceContext avoidance() {
			return getRuleContext(AvoidanceContext.class,0);
		}
		public PeContext pe() {
			return getRuleContext(PeContext.class,0);
		}
		public PlContext pl() {
			return getRuleContext(PlContext.class,0);
		}
		public Core_movement_patternContext core_movement_pattern() {
			return getRuleContext(Core_movement_patternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pattern);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); ((PatternContext)_localctx).core_movement_pattern = core_movement_pattern();

					((PatternContext)_localctx).value = ((PatternContext)_localctx).core_movement_pattern.value;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); ((PatternContext)_localctx).avoidance = avoidance();

					((PatternContext)_localctx).value = ((PatternContext)_localctx).avoidance.value;

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174); match(T__12);
				setState(175); ((PatternContext)_localctx).pe = pe();
				setState(176); match(T__37);
				setState(179);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(177); ((PatternContext)_localctx).pl = pl();
					}
					break;
				case T__38:
				case T__33:
				case T__32:
				case T__26:
				case T__24:
				case T__23:
				case T__20:
				case T__19:
				case T__17:
				case T__16:
				case T__12:
				case T__9:
				case T__8:
				case T__6:
					{
					setState(178); ((PatternContext)_localctx).pattern = pattern();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

					((PatternContext)_localctx).value = new InstantaneousReaction(((PatternContext)_localctx).pe.atom, ((PatternContext)_localctx).pl.atom, _localctx.value);

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183); match(T__12);
				setState(184); ((PatternContext)_localctx).pe = pe();
				setState(185); match(T__30);
				setState(188);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(186); ((PatternContext)_localctx).pl = pl();
					}
					break;
				case T__38:
				case T__33:
				case T__32:
				case T__26:
				case T__24:
				case T__23:
				case T__20:
				case T__19:
				case T__17:
				case T__16:
				case T__12:
				case T__9:
				case T__8:
				case T__6:
					{
					setState(187); ((PatternContext)_localctx).pattern = pattern();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); match(T__2);

					((PatternContext)_localctx).value = new DelayedReaction(((PatternContext)_localctx).pe.atom, ((PatternContext)_localctx).pl.atom, _localctx.value);

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193); match(T__8);
				setState(194); ((PatternContext)_localctx).pl = pl();
				setState(195); match(T__11);
				setState(196); ((PatternContext)_localctx).pe = pe();

					((PatternContext)_localctx).value = new Wait(((PatternContext)_localctx).pe.atom, ((PatternContext)_localctx).pl.atom);

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

	public static class AvoidanceContext extends ParserRuleContext {
		public Pattern value;
		public ConditionalContext conditional;
		public RestrictedContext restricted;
		public RestrictedContext restricted() {
			return getRuleContext(RestrictedContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public AvoidanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avoidance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterAvoidance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitAvoidance(this);
		}
	}

	public final AvoidanceContext avoidance() throws RecognitionException {
		AvoidanceContext _localctx = new AvoidanceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_avoidance);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); ((AvoidanceContext)_localctx).conditional = conditional();

					((AvoidanceContext)_localctx).value = ((AvoidanceContext)_localctx).conditional.value;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); ((AvoidanceContext)_localctx).restricted = restricted();

					((AvoidanceContext)_localctx).value = ((AvoidanceContext)_localctx).restricted.value;

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

	public static class ConditionalContext extends ParserRuleContext {
		public Pattern value;
		public Future_avoidanceContext future_avoidance;
		public Global_avoidanceContext global_avoidance;
		public Past_avoidanceContext past_avoidance;
		public Global_avoidanceContext global_avoidance() {
			return getRuleContext(Global_avoidanceContext.class,0);
		}
		public Future_avoidanceContext future_avoidance() {
			return getRuleContext(Future_avoidanceContext.class,0);
		}
		public Past_avoidanceContext past_avoidance() {
			return getRuleContext(Past_avoidanceContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditional);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); ((ConditionalContext)_localctx).future_avoidance = future_avoidance();

					((ConditionalContext)_localctx).value = ((ConditionalContext)_localctx).future_avoidance.value	;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); ((ConditionalContext)_localctx).global_avoidance = global_avoidance();

					((ConditionalContext)_localctx).value = ((ConditionalContext)_localctx).global_avoidance.value	;

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); ((ConditionalContext)_localctx).past_avoidance = past_avoidance();

					((ConditionalContext)_localctx).value = ((ConditionalContext)_localctx).past_avoidance.value	;

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

	public static class RestrictedContext extends ParserRuleContext {
		public Pattern value;
		public Lower_restricted_avoidanceContext lower_restricted_avoidance;
		public Exact_restricted_avoidanceContext exact_restricted_avoidance;
		public Upper_restricted_avoidanceContext upper_restricted_avoidance;
		public Lower_restricted_avoidanceContext lower_restricted_avoidance() {
			return getRuleContext(Lower_restricted_avoidanceContext.class,0);
		}
		public Exact_restricted_avoidanceContext exact_restricted_avoidance() {
			return getRuleContext(Exact_restricted_avoidanceContext.class,0);
		}
		public Upper_restricted_avoidanceContext upper_restricted_avoidance() {
			return getRuleContext(Upper_restricted_avoidanceContext.class,0);
		}
		public RestrictedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterRestricted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitRestricted(this);
		}
	}

	public final RestrictedContext restricted() throws RecognitionException {
		RestrictedContext _localctx = new RestrictedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_restricted);
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); ((RestrictedContext)_localctx).lower_restricted_avoidance = lower_restricted_avoidance();

					((RestrictedContext)_localctx).value = ((RestrictedContext)_localctx).lower_restricted_avoidance.value;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); ((RestrictedContext)_localctx).exact_restricted_avoidance = exact_restricted_avoidance();

					((RestrictedContext)_localctx).value = ((RestrictedContext)_localctx).exact_restricted_avoidance.value;

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); ((RestrictedContext)_localctx).upper_restricted_avoidance = upper_restricted_avoidance();

					((RestrictedContext)_localctx).value = ((RestrictedContext)_localctx).upper_restricted_avoidance.value	;

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

	public static class Future_avoidanceContext extends ParserRuleContext {
		public Pattern value;
		public PeContext pe;
		public RobotContext robot;
		public LocationContext location;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public PeContext pe() {
			return getRuleContext(PeContext.class,0);
		}
		public Future_avoidanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_future_avoidance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterFuture_avoidance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitFuture_avoidance(this);
		}
	}

	public final Future_avoidanceContext future_avoidance() throws RecognitionException {
		Future_avoidanceContext _localctx = new Future_avoidanceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_future_avoidance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(T__23);
			setState(232); ((Future_avoidanceContext)_localctx).pe = pe();
			setState(233); match(T__3);
			setState(234); ((Future_avoidanceContext)_localctx).robot = robot();
			setState(235); match(T__25);
			setState(236); ((Future_avoidanceContext)_localctx).location = location();

				((Future_avoidanceContext)_localctx).value = new FutureAvoidance(((Future_avoidanceContext)_localctx).pe.atom,  new LTLPLAtom(((Future_avoidanceContext)_localctx).robot.value, ((Future_avoidanceContext)_localctx).location.value));

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

	public static class Global_avoidanceContext extends ParserRuleContext {
		public Pattern value;
		public RobotContext robot;
		public LocationContext location;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Global_avoidanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_avoidance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterGlobal_avoidance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitGlobal_avoidance(this);
		}
	}

	public final Global_avoidanceContext global_avoidance() throws RecognitionException {
		Global_avoidanceContext _localctx = new Global_avoidanceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_global_avoidance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(T__38);
			setState(240); ((Global_avoidanceContext)_localctx).robot = robot();
			setState(241); match(T__25);
			setState(242); ((Global_avoidanceContext)_localctx).location = location();

				((Global_avoidanceContext)_localctx).value = new GlobalAvoidance(new LTLPLAtom(((Global_avoidanceContext)_localctx).robot.value, ((Global_avoidanceContext)_localctx).location.value));

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

	public static class Past_avoidanceContext extends ParserRuleContext {
		public Pattern value;
		public RobotContext robot;
		public LocationContext location;
		public PeContext pe;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public PeContext pe() {
			return getRuleContext(PeContext.class,0);
		}
		public Past_avoidanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_past_avoidance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterPast_avoidance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitPast_avoidance(this);
		}
	}

	public final Past_avoidanceContext past_avoidance() throws RecognitionException {
		Past_avoidanceContext _localctx = new Past_avoidanceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_past_avoidance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(T__38);
			setState(246); ((Past_avoidanceContext)_localctx).robot = robot();
			setState(247); match(T__25);
			setState(248); ((Past_avoidanceContext)_localctx).location = location();
			setState(249); match(T__4);
			setState(250); ((Past_avoidanceContext)_localctx).pe = pe();
			setState(251); match(T__28);

				((Past_avoidanceContext)_localctx).value = new PastAvoidance(((Past_avoidanceContext)_localctx).pe.atom,  new LTLPLAtom(((Past_avoidanceContext)_localctx).robot.value, ((Past_avoidanceContext)_localctx).location.value));

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

	public static class Lower_restricted_avoidanceContext extends ParserRuleContext {
		public Pattern value;
		public RobotContext robot;
		public LocationContext location;
		public Token NAT;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode NAT() { return getToken(MISSIONParser.NAT, 0); }
		public Lower_restricted_avoidanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower_restricted_avoidance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterLower_restricted_avoidance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitLower_restricted_avoidance(this);
		}
	}

	public final Lower_restricted_avoidanceContext lower_restricted_avoidance() throws RecognitionException {
		Lower_restricted_avoidanceContext _localctx = new Lower_restricted_avoidanceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lower_restricted_avoidance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(T__38);
			setState(255); ((Lower_restricted_avoidanceContext)_localctx).robot = robot();
			setState(256); match(T__36);
			setState(257); ((Lower_restricted_avoidanceContext)_localctx).location = location();
			setState(258); match(T__31);
			setState(259); ((Lower_restricted_avoidanceContext)_localctx).NAT = match(NAT);
			setState(260); match(T__34);

				((Lower_restricted_avoidanceContext)_localctx).value = new LowerRestrictedAvoidance(new LTLPLAtom(((Lower_restricted_avoidanceContext)_localctx).robot.value, ((Lower_restricted_avoidanceContext)_localctx).location.value), Integer.parseInt((((Lower_restricted_avoidanceContext)_localctx).NAT!=null?((Lower_restricted_avoidanceContext)_localctx).NAT.getText():null)));

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

	public static class Exact_restricted_avoidanceContext extends ParserRuleContext {
		public Pattern value;
		public RobotContext robot;
		public LocationContext location;
		public Token NAT;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode NAT() { return getToken(MISSIONParser.NAT, 0); }
		public Exact_restricted_avoidanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exact_restricted_avoidance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterExact_restricted_avoidance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitExact_restricted_avoidance(this);
		}
	}

	public final Exact_restricted_avoidanceContext exact_restricted_avoidance() throws RecognitionException {
		Exact_restricted_avoidanceContext _localctx = new Exact_restricted_avoidanceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exact_restricted_avoidance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(T__38);
			setState(264); ((Exact_restricted_avoidanceContext)_localctx).robot = robot();
			setState(265); match(T__27);
			setState(266); ((Exact_restricted_avoidanceContext)_localctx).location = location();
			setState(267); match(T__29);
			setState(268); ((Exact_restricted_avoidanceContext)_localctx).NAT = match(NAT);
			setState(269); match(T__34);

				((Exact_restricted_avoidanceContext)_localctx).value = new ExactRestrictedAvoidance(new LTLPLAtom(((Exact_restricted_avoidanceContext)_localctx).robot.value, ((Exact_restricted_avoidanceContext)_localctx).location.value), Integer.parseInt((((Exact_restricted_avoidanceContext)_localctx).NAT!=null?((Exact_restricted_avoidanceContext)_localctx).NAT.getText():null)));

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

	public static class Upper_restricted_avoidanceContext extends ParserRuleContext {
		public Pattern value;
		public RobotContext robot;
		public LocationContext location;
		public Token NAT;
		public RobotContext robot() {
			return getRuleContext(RobotContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode NAT() { return getToken(MISSIONParser.NAT, 0); }
		public Upper_restricted_avoidanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_restricted_avoidance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterUpper_restricted_avoidance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitUpper_restricted_avoidance(this);
		}
	}

	public final Upper_restricted_avoidanceContext upper_restricted_avoidance() throws RecognitionException {
		Upper_restricted_avoidanceContext _localctx = new Upper_restricted_avoidanceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_upper_restricted_avoidance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(T__38);
			setState(273); ((Upper_restricted_avoidanceContext)_localctx).robot = robot();
			setState(274); match(T__36);
			setState(275); ((Upper_restricted_avoidanceContext)_localctx).location = location();
			setState(276); match(T__7);
			setState(277); ((Upper_restricted_avoidanceContext)_localctx).NAT = match(NAT);
			setState(278); match(T__34);

				((Upper_restricted_avoidanceContext)_localctx).value = new UpperRestrictedAvoidance(new LTLPLAtom(((Upper_restricted_avoidanceContext)_localctx).robot.value, ((Upper_restricted_avoidanceContext)_localctx).location.value), Integer.parseInt((((Upper_restricted_avoidanceContext)_localctx).NAT!=null?((Upper_restricted_avoidanceContext)_localctx).NAT.getText():null)));

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

	public static class Core_movement_patternContext extends ParserRuleContext {
		public Pattern value;
		public CoverageContext coverage;
		public SurveillanceContext surveillance;
		public CoverageContext coverage() {
			return getRuleContext(CoverageContext.class,0);
		}
		public SurveillanceContext surveillance() {
			return getRuleContext(SurveillanceContext.class,0);
		}
		public Core_movement_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_core_movement_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterCore_movement_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitCore_movement_pattern(this);
		}
	}

	public final Core_movement_patternContext core_movement_pattern() throws RecognitionException {
		Core_movement_patternContext _localctx = new Core_movement_patternContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_core_movement_pattern);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case T__32:
			case T__26:
			case T__20:
			case T__19:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); ((Core_movement_patternContext)_localctx).coverage = coverage();

					((Core_movement_patternContext)_localctx).value = ((Core_movement_patternContext)_localctx).coverage.value;

				}
				break;
			case T__33:
			case T__24:
			case T__17:
			case T__9:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); ((Core_movement_patternContext)_localctx).surveillance = surveillance();

					((Core_movement_patternContext)_localctx).value = ((Core_movement_patternContext)_localctx).surveillance.value;

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

	public static class CoverageContext extends ParserRuleContext {
		public Pattern value;
		public VisitContext visit;
		public Sequenced_visitContext sequenced_visit;
		public Ordered_visitContext ordered_visit;
		public Strict_ordered_visitContext strict_ordered_visit;
		public Fair_visitContext fair_visit;
		public Strict_ordered_visitContext strict_ordered_visit() {
			return getRuleContext(Strict_ordered_visitContext.class,0);
		}
		public VisitContext visit() {
			return getRuleContext(VisitContext.class,0);
		}
		public Sequenced_visitContext sequenced_visit() {
			return getRuleContext(Sequenced_visitContext.class,0);
		}
		public Fair_visitContext fair_visit() {
			return getRuleContext(Fair_visitContext.class,0);
		}
		public Ordered_visitContext ordered_visit() {
			return getRuleContext(Ordered_visitContext.class,0);
		}
		public CoverageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterCoverage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitCoverage(this);
		}
	}

	public final CoverageContext coverage() throws RecognitionException {
		CoverageContext _localctx = new CoverageContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_coverage);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); ((CoverageContext)_localctx).visit = visit();

					((CoverageContext)_localctx).value = ((CoverageContext)_localctx).visit.p;

				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); ((CoverageContext)_localctx).sequenced_visit = sequenced_visit();

					((CoverageContext)_localctx).value = ((CoverageContext)_localctx).sequenced_visit.p	;

				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); ((CoverageContext)_localctx).ordered_visit = ordered_visit();

					((CoverageContext)_localctx).value = ((CoverageContext)_localctx).ordered_visit.p;

				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(298); ((CoverageContext)_localctx).strict_ordered_visit = strict_ordered_visit();

					((CoverageContext)_localctx).value = ((CoverageContext)_localctx).strict_ordered_visit.p;

				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(301); ((CoverageContext)_localctx).fair_visit = fair_visit();

					((CoverageContext)_localctx).value = ((CoverageContext)_localctx).fair_visit.p;

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

	public static class SurveillanceContext extends ParserRuleContext {
		public Pattern value;
		public PatrollingContext patrolling;
		public Sequenced_patrollingContext sequenced_patrolling;
		public Ordered_patrollingContext ordered_patrolling;
		public Strict_ordered_patrollingContext strict_ordered_patrolling;
		public Fair_patrollingContext fair_patrolling;
		public Fair_patrollingContext fair_patrolling() {
			return getRuleContext(Fair_patrollingContext.class,0);
		}
		public Sequenced_patrollingContext sequenced_patrolling() {
			return getRuleContext(Sequenced_patrollingContext.class,0);
		}
		public Strict_ordered_patrollingContext strict_ordered_patrolling() {
			return getRuleContext(Strict_ordered_patrollingContext.class,0);
		}
		public PatrollingContext patrolling() {
			return getRuleContext(PatrollingContext.class,0);
		}
		public Ordered_patrollingContext ordered_patrolling() {
			return getRuleContext(Ordered_patrollingContext.class,0);
		}
		public SurveillanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surveillance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterSurveillance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitSurveillance(this);
		}
	}

	public final SurveillanceContext surveillance() throws RecognitionException {
		SurveillanceContext _localctx = new SurveillanceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_surveillance);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); ((SurveillanceContext)_localctx).patrolling = patrolling();

					((SurveillanceContext)_localctx).value = ((SurveillanceContext)_localctx).patrolling.p;

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); ((SurveillanceContext)_localctx).sequenced_patrolling = sequenced_patrolling();

					((SurveillanceContext)_localctx).value = ((SurveillanceContext)_localctx).sequenced_patrolling.p;

				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(312); ((SurveillanceContext)_localctx).ordered_patrolling = ordered_patrolling();

					((SurveillanceContext)_localctx).value = ((SurveillanceContext)_localctx).ordered_patrolling.p;

				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(315); ((SurveillanceContext)_localctx).strict_ordered_patrolling = strict_ordered_patrolling();

					((SurveillanceContext)_localctx).value = ((SurveillanceContext)_localctx).strict_ordered_patrolling.p;

				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(318); ((SurveillanceContext)_localctx).fair_patrolling = fair_patrolling();

					((SurveillanceContext)_localctx).value = ((SurveillanceContext)_localctx).fair_patrolling.p;

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

	public static class VisitContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public VisitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterVisit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitVisit(this);
		}
	}

	public final VisitContext visit() throws RecognitionException {
		VisitContext _localctx = new VisitContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_visit);

			((VisitContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(T__19);
			setState(324); ((VisitContext)_localctx).pl = pl();

				_localctx.atoms.add(((VisitContext)_localctx).pl.atom);

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(326); match(COMMA);
				setState(327); ((VisitContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((VisitContext)_localctx).pl.atom);
				 
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335); match(T__2);
			((VisitContext)_localctx).p = new Visit(_localctx.atoms); 
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

	public static class Sequenced_visitContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Sequenced_visitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenced_visit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterSequenced_visit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitSequenced_visit(this);
		}
	}

	public final Sequenced_visitContext sequenced_visit() throws RecognitionException {
		Sequenced_visitContext _localctx = new Sequenced_visitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sequenced_visit);

			((Sequenced_visitContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(T__16);
			setState(339); ((Sequenced_visitContext)_localctx).pl = pl();

				_localctx.atoms.add(((Sequenced_visitContext)_localctx).pl.atom);

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341); match(COMMA);
				setState(342); ((Sequenced_visitContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Sequenced_visitContext)_localctx).pl.atom);
				 
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350); match(T__2);
			((Sequenced_visitContext)_localctx).p = new SequencedVisit(_localctx.atoms); 
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

	public static class Ordered_visitContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Ordered_visitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordered_visit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterOrdered_visit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitOrdered_visit(this);
		}
	}

	public final Ordered_visitContext ordered_visit() throws RecognitionException {
		Ordered_visitContext _localctx = new Ordered_visitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ordered_visit);

			((Ordered_visitContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(T__20);
			setState(354); ((Ordered_visitContext)_localctx).pl = pl();

				_localctx.atoms.add(((Ordered_visitContext)_localctx).pl.atom);

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356); match(COMMA);
				setState(357); ((Ordered_visitContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Ordered_visitContext)_localctx).pl.atom);
				 
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365); match(T__2);
			((Ordered_visitContext)_localctx).p = new OrderedVisit(_localctx.atoms); 
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

	public static class Strict_ordered_visitContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Strict_ordered_visitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strict_ordered_visit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterStrict_ordered_visit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitStrict_ordered_visit(this);
		}
	}

	public final Strict_ordered_visitContext strict_ordered_visit() throws RecognitionException {
		Strict_ordered_visitContext _localctx = new Strict_ordered_visitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_strict_ordered_visit);

			((Strict_ordered_visitContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(T__26);
			setState(369); ((Strict_ordered_visitContext)_localctx).pl = pl();

				_localctx.atoms.add(((Strict_ordered_visitContext)_localctx).pl.atom);

			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371); match(COMMA);
				setState(372); ((Strict_ordered_visitContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Strict_ordered_visitContext)_localctx).pl.atom);
				 
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380); match(T__2);
			((Strict_ordered_visitContext)_localctx).p = new StrictOrderedVisit(_localctx.atoms); 
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

	public static class Fair_visitContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Fair_visitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fair_visit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterFair_visit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitFair_visit(this);
		}
	}

	public final Fair_visitContext fair_visit() throws RecognitionException {
		Fair_visitContext _localctx = new Fair_visitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fair_visit);

			((Fair_visitContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(T__32);
			setState(384); ((Fair_visitContext)_localctx).pl = pl();

				
				_localctx.atoms.add(((Fair_visitContext)_localctx).pl.atom);

			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(386); match(COMMA);
				setState(387); ((Fair_visitContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Fair_visitContext)_localctx).pl.atom);
				 
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395); match(T__2);
			((Fair_visitContext)_localctx).p = new FairVisit(_localctx.atoms); 
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

	public static class PatrollingContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public PatrollingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patrolling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterPatrolling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitPatrolling(this);
		}
	}

	public final PatrollingContext patrolling() throws RecognitionException {
		PatrollingContext _localctx = new PatrollingContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_patrolling);

			((PatrollingContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(T__6);
			setState(399); ((PatrollingContext)_localctx).pl = pl();

			 	_localctx.atoms.add(((PatrollingContext)_localctx).pl.atom);
			 
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401); match(COMMA);
				setState(402); ((PatrollingContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((PatrollingContext)_localctx).pl.atom);
				 
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410); match(T__2);
			((PatrollingContext)_localctx).p = new Patrolling(_localctx.atoms); 
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

	public static class Sequenced_patrollingContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Sequenced_patrollingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenced_patrolling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterSequenced_patrolling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitSequenced_patrolling(this);
		}
	}

	public final Sequenced_patrollingContext sequenced_patrolling() throws RecognitionException {
		Sequenced_patrollingContext _localctx = new Sequenced_patrollingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sequenced_patrolling);

			((Sequenced_patrollingContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(T__17);
			setState(414); ((Sequenced_patrollingContext)_localctx).pl = pl();

			 	_localctx.atoms.add(((Sequenced_patrollingContext)_localctx).pl.atom);
			 
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416); match(COMMA);
				setState(417); ((Sequenced_patrollingContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Sequenced_patrollingContext)_localctx).pl.atom);
				 
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425); match(T__2);
			((Sequenced_patrollingContext)_localctx).p = new SequencedPatrolling(_localctx.atoms); 
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

	public static class Ordered_patrollingContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Ordered_patrollingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordered_patrolling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterOrdered_patrolling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitOrdered_patrolling(this);
		}
	}

	public final Ordered_patrollingContext ordered_patrolling() throws RecognitionException {
		Ordered_patrollingContext _localctx = new Ordered_patrollingContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ordered_patrolling);

			((Ordered_patrollingContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(T__33);
			setState(429); ((Ordered_patrollingContext)_localctx).pl = pl();

			 	_localctx.atoms.add(((Ordered_patrollingContext)_localctx).pl.atom);
			 
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431); match(COMMA);
				setState(432); ((Ordered_patrollingContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Ordered_patrollingContext)_localctx).pl.atom);
				 
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440); match(T__2);
			((Ordered_patrollingContext)_localctx).p = new OrderedPatrolling(_localctx.atoms); 
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

	public static class Strict_ordered_patrollingContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Strict_ordered_patrollingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strict_ordered_patrolling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterStrict_ordered_patrolling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitStrict_ordered_patrolling(this);
		}
	}

	public final Strict_ordered_patrollingContext strict_ordered_patrolling() throws RecognitionException {
		Strict_ordered_patrollingContext _localctx = new Strict_ordered_patrollingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_strict_ordered_patrolling);

			((Strict_ordered_patrollingContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(T__24);
			setState(444); ((Strict_ordered_patrollingContext)_localctx).pl = pl();

			 	_localctx.atoms.add(((Strict_ordered_patrollingContext)_localctx).pl.atom);
			 
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(446); match(COMMA);
				setState(447); ((Strict_ordered_patrollingContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Strict_ordered_patrollingContext)_localctx).pl.atom);
				 
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455); match(T__2);
			((Strict_ordered_patrollingContext)_localctx).p = new StrictOrderedPatrolling(_localctx.atoms); 
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

	public static class Fair_patrollingContext extends ParserRuleContext {
		public Pattern p;
		public Set<LTLPLAtom> atoms;
		public PlContext pl;
		public PlContext pl(int i) {
			return getRuleContext(PlContext.class,i);
		}
		public List<PlContext> pl() {
			return getRuleContexts(PlContext.class);
		}
		public Fair_patrollingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fair_patrolling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterFair_patrolling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitFair_patrolling(this);
		}
	}

	public final Fair_patrollingContext fair_patrolling() throws RecognitionException {
		Fair_patrollingContext _localctx = new Fair_patrollingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fair_patrolling);

			((Fair_patrollingContext)_localctx).atoms = new HashSet<>();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(T__9);
			setState(459); ((Fair_patrollingContext)_localctx).pl = pl();

			 	_localctx.atoms.add(((Fair_patrollingContext)_localctx).pl.atom);
			 
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(461); match(COMMA);
				setState(462); ((Fair_patrollingContext)_localctx).pl = pl();

				 	_localctx.atoms.add(((Fair_patrollingContext)_localctx).pl.atom);
				 
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470); match(T__2);
			((Fair_patrollingContext)_localctx).p = new FairPatrolling(_localctx.atoms); 
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

	public static class RobotContext extends ParserRuleContext {
		public String value;
		public Token ID;
		public TerminalNode ID() { return getToken(MISSIONParser.ID, 0); }
		public RobotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterRobot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitRobot(this);
		}
	}

	public final RobotContext robot() throws RecognitionException {
		RobotContext _localctx = new RobotContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_robot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); ((RobotContext)_localctx).ID = match(ID);

				((RobotContext)_localctx).value = (((RobotContext)_localctx).ID!=null?((RobotContext)_localctx).ID.getText():null);

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

	public static class ActionContext extends ParserRuleContext {
		public String value;
		public Token ID;
		public TerminalNode ID() { return getToken(MISSIONParser.ID, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); ((ActionContext)_localctx).ID = match(ID);

				((ActionContext)_localctx).value = (((ActionContext)_localctx).ID!=null?((ActionContext)_localctx).ID.getText():null);

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

	public static class LocationContext extends ParserRuleContext {
		public String value;
		public Token ID;
		public TerminalNode ID() { return getToken(MISSIONParser.ID, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); ((LocationContext)_localctx).ID = match(ID);

				((LocationContext)_localctx).value = (((LocationContext)_localctx).ID!=null?((LocationContext)_localctx).ID.getText():null);

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

	public static class ConditionContext extends ParserRuleContext {
		public String value;
		public Token ID;
		public TerminalNode ID() { return getToken(MISSIONParser.ID, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MISSIONListener ) ((MISSIONListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); ((ConditionContext)_localctx).ID = match(ID);

				((ConditionContext)_localctx).value = (((ConditionContext)_localctx).ID!=null?((ConditionContext)_localctx).ID.getText():null);

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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u01e8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0084"+
		"\n\6\f\6\16\6\u0087\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00b6\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bf"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ca\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00d2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00dd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e8"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0122\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0133\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0144\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u014d\n\30\f\30\16\30\u0150\13\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u015c\n\31\f\31\16"+
		"\31\u015f\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u016b\n\32\f\32\16\32\u016e\13\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u017a\n\33\f\33\16\33\u017d\13\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0189\n\34\f\34\16\34\u018c\13"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0198\n\35"+
		"\f\35\16\35\u019b\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u01a7\n\36\f\36\16\36\u01aa\13\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u01b6\n\37\f\37\16\37\u01b9\13\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \7 \u01c5\n \f \16 \u01c8\13 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\7!\u01d4\n!\f!\16!\u01d7\13!\3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\2\u01e7\2J\3\2\2\2\4R\3\2\2\2\6`\3"+
		"\2\2\2\bn\3\2\2\2\n|\3\2\2\2\f\u008a\3\2\2\2\16\u008f\3\2\2\2\20\u0094"+
		"\3\2\2\2\22\u00a8\3\2\2\2\24\u00c9\3\2\2\2\26\u00d1\3\2\2\2\30\u00dc\3"+
		"\2\2\2\32\u00e7\3\2\2\2\34\u00e9\3\2\2\2\36\u00f1\3\2\2\2 \u00f7\3\2\2"+
		"\2\"\u0100\3\2\2\2$\u0109\3\2\2\2&\u0112\3\2\2\2(\u0121\3\2\2\2*\u0132"+
		"\3\2\2\2,\u0143\3\2\2\2.\u0145\3\2\2\2\60\u0154\3\2\2\2\62\u0163\3\2\2"+
		"\2\64\u0172\3\2\2\2\66\u0181\3\2\2\28\u0190\3\2\2\2:\u019f\3\2\2\2<\u01ae"+
		"\3\2\2\2>\u01bd\3\2\2\2@\u01cc\3\2\2\2B\u01db\3\2\2\2D\u01de\3\2\2\2F"+
		"\u01e1\3\2\2\2H\u01e4\3\2\2\2JK\5\4\3\2KL\5\6\4\2LM\5\b\5\2MN\5\n\6\2"+
		"NO\7\27\2\2OP\5\22\n\2PQ\b\2\1\2Q\3\3\2\2\2RS\7(\2\2ST\5B\"\2T[\b\3\1"+
		"\2UV\7\60\2\2VW\5B\"\2WX\b\3\1\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\37\2\2_\5\3\2\2\2`a\7\33\2\2ab"+
		"\5D#\2bi\b\4\1\2cd\7\60\2\2de\5D#\2ef\b\4\1\2fh\3\2\2\2gc\3\2\2\2hk\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\37\2\2m\7\3\2\2\2n"+
		"o\7)\2\2op\5F$\2pw\b\5\1\2qr\7\60\2\2rs\5F$\2st\b\5\1\2tv\3\2\2\2uq\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\37\2\2{\t"+
		"\3\2\2\2|}\7\24\2\2}~\5H%\2~\u0085\b\6\1\2\177\u0080\7\60\2\2\u0080\u0081"+
		"\5H%\2\u0081\u0082\b\6\1\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\37\2\2\u0089\13\3\2\2\2\u008a\u008b"+
		"\5B\"\2\u008b\u008c\7$\2\2\u008c\u008d\5F$\2\u008d\u008e\b\7\1\2\u008e"+
		"\r\3\2\2\2\u008f\u0090\5B\"\2\u0090\u0091\7\6\2\2\u0091\u0092\5D#\2\u0092"+
		"\u0093\b\b\1\2\u0093\17\3\2\2\2\u0094\u0095\5H%\2\u0095\u0096\b\t\1\2"+
		"\u0096\21\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\b\n\1\2\u0099\u00a9"+
		"\3\2\2\2\u009a\u009b\7\23\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7\32\2"+
		"\2\u009d\u009e\5\22\n\2\u009e\u009f\7\'\2\2\u009f\u00a0\b\n\1\2\u00a0"+
		"\u00a9\3\2\2\2\u00a1\u00a2\7\23\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7"+
		"\34\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7\b\n\1\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u0097\3\2\2\2\u00a8\u009a\3\2\2\2\u00a8\u00a1\3\2"+
		"\2\2\u00a9\23\3\2\2\2\u00aa\u00ab\5(\25\2\u00ab\u00ac\b\13\1\2\u00ac\u00ca"+
		"\3\2\2\2\u00ad\u00ae\5\26\f\2\u00ae\u00af\b\13\1\2\u00af\u00ca\3\2\2\2"+
		"\u00b0\u00b1\7\35\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b5\7\4\2\2\u00b3\u00b6"+
		"\5\f\7\2\u00b4\u00b6\5\24\13\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\13\1\2\u00b8\u00ca\3\2\2\2\u00b9\u00ba"+
		"\7\35\2\2\u00ba\u00bb\5\20\t\2\u00bb\u00be\7\13\2\2\u00bc\u00bf\5\f\7"+
		"\2\u00bd\u00bf\5\24\13\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\b\13\1\2\u00c2\u00ca\3"+
		"\2\2\2\u00c3\u00c4\7!\2\2\u00c4\u00c5\5\f\7\2\u00c5\u00c6\7\36\2\2\u00c6"+
		"\u00c7\5\20\t\2\u00c7\u00c8\b\13\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00aa\3"+
		"\2\2\2\u00c9\u00ad\3\2\2\2\u00c9\u00b0\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9"+
		"\u00c3\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\b\f\1"+
		"\2\u00cd\u00d2\3\2\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\b\f\1\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\27\3\2\2"+
		"\2\u00d3\u00d4\5\34\17\2\u00d4\u00d5\b\r\1\2\u00d5\u00dd\3\2\2\2\u00d6"+
		"\u00d7\5\36\20\2\u00d7\u00d8\b\r\1\2\u00d8\u00dd\3\2\2\2\u00d9\u00da\5"+
		" \21\2\u00da\u00db\b\r\1\2\u00db\u00dd\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc"+
		"\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\31\3\2\2\2\u00de\u00df\5\"\22"+
		"\2\u00df\u00e0\b\16\1\2\u00e0\u00e8\3\2\2\2\u00e1\u00e2\5$\23\2\u00e2"+
		"\u00e3\b\16\1\2\u00e3\u00e8\3\2\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\b"+
		"\16\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e8\33\3\2\2\2\u00e9\u00ea\7\22\2\2\u00ea\u00eb\5\20"+
		"\t\2\u00eb\u00ec\7&\2\2\u00ec\u00ed\5B\"\2\u00ed\u00ee\7\20\2\2\u00ee"+
		"\u00ef\5F$\2\u00ef\u00f0\b\17\1\2\u00f0\35\3\2\2\2\u00f1\u00f2\7\3\2\2"+
		"\u00f2\u00f3\5B\"\2\u00f3\u00f4\7\20\2\2\u00f4\u00f5\5F$\2\u00f5\u00f6"+
		"\b\20\1\2\u00f6\37\3\2\2\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\5B\"\2\u00f9"+
		"\u00fa\7\20\2\2\u00fa\u00fb\5F$\2\u00fb\u00fc\7%\2\2\u00fc\u00fd\5\20"+
		"\t\2\u00fd\u00fe\7\r\2\2\u00fe\u00ff\b\21\1\2\u00ff!\3\2\2\2\u0100\u0101"+
		"\7\3\2\2\u0101\u0102\5B\"\2\u0102\u0103\7\5\2\2\u0103\u0104\5F$\2\u0104"+
		"\u0105\7\n\2\2\u0105\u0106\7,\2\2\u0106\u0107\7\7\2\2\u0107\u0108\b\22"+
		"\1\2\u0108#\3\2\2\2\u0109\u010a\7\3\2\2\u010a\u010b\5B\"\2\u010b\u010c"+
		"\7\16\2\2\u010c\u010d\5F$\2\u010d\u010e\7\f\2\2\u010e\u010f\7,\2\2\u010f"+
		"\u0110\7\7\2\2\u0110\u0111\b\23\1\2\u0111%\3\2\2\2\u0112\u0113\7\3\2\2"+
		"\u0113\u0114\5B\"\2\u0114\u0115\7\5\2\2\u0115\u0116\5F$\2\u0116\u0117"+
		"\7\"\2\2\u0117\u0118\7,\2\2\u0118\u0119\7\7\2\2\u0119\u011a\b\24\1\2\u011a"+
		"\'\3\2\2\2\u011b\u011c\5*\26\2\u011c\u011d\b\25\1\2\u011d\u0122\3\2\2"+
		"\2\u011e\u011f\5,\27\2\u011f\u0120\b\25\1\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122)\3\2\2\2\u0123\u0124\5.\30\2"+
		"\u0124\u0125\b\26\1\2\u0125\u0133\3\2\2\2\u0126\u0127\5\60\31\2\u0127"+
		"\u0128\b\26\1\2\u0128\u0133\3\2\2\2\u0129\u012a\5\62\32\2\u012a\u012b"+
		"\b\26\1\2\u012b\u0133\3\2\2\2\u012c\u012d\5\64\33\2\u012d\u012e\b\26\1"+
		"\2\u012e\u0133\3\2\2\2\u012f\u0130\5\66\34\2\u0130\u0131\b\26\1\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0123\3\2\2\2\u0132\u0126\3\2\2\2\u0132\u0129\3\2"+
		"\2\2\u0132\u012c\3\2\2\2\u0132\u012f\3\2\2\2\u0133+\3\2\2\2\u0134\u0135"+
		"\58\35\2\u0135\u0136\b\27\1\2\u0136\u0144\3\2\2\2\u0137\u0138\5:\36\2"+
		"\u0138\u0139\b\27\1\2\u0139\u0144\3\2\2\2\u013a\u013b\5<\37\2\u013b\u013c"+
		"\b\27\1\2\u013c\u0144\3\2\2\2\u013d\u013e\5> \2\u013e\u013f\b\27\1\2\u013f"+
		"\u0144\3\2\2\2\u0140\u0141\5@!\2\u0141\u0142\b\27\1\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0134\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u013a\3\2\2\2\u0143"+
		"\u013d\3\2\2\2\u0143\u0140\3\2\2\2\u0144-\3\2\2\2\u0145\u0146\7\26\2\2"+
		"\u0146\u0147\5\f\7\2\u0147\u014e\b\30\1\2\u0148\u0149\7\60\2\2\u0149\u014a"+
		"\5\f\7\2\u014a\u014b\b\30\1\2\u014b\u014d\3\2\2\2\u014c\u0148\3\2\2\2"+
		"\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\'\2\2\u0152\u0153\b\30\1\2"+
		"\u0153/\3\2\2\2\u0154\u0155\7\31\2\2\u0155\u0156\5\f\7\2\u0156\u015d\b"+
		"\31\1\2\u0157\u0158\7\60\2\2\u0158\u0159\5\f\7\2\u0159\u015a\b\31\1\2"+
		"\u015a\u015c\3\2\2\2\u015b\u0157\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0161\7\'\2\2\u0161\u0162\b\31\1\2\u0162\61\3\2\2\2\u0163\u0164\7\25"+
		"\2\2\u0164\u0165\5\f\7\2\u0165\u016c\b\32\1\2\u0166\u0167\7\60\2\2\u0167"+
		"\u0168\5\f\7\2\u0168\u0169\b\32\1\2\u0169\u016b\3\2\2\2\u016a\u0166\3"+
		"\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\'\2\2\u0170\u0171\b\32"+
		"\1\2\u0171\63\3\2\2\2\u0172\u0173\7\17\2\2\u0173\u0174\5\f\7\2\u0174\u017b"+
		"\b\33\1\2\u0175\u0176\7\60\2\2\u0176\u0177\5\f\7\2\u0177\u0178\b\33\1"+
		"\2\u0178\u017a\3\2\2\2\u0179\u0175\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\7\'\2\2\u017f\u0180\b\33\1\2\u0180\65\3\2\2\2\u0181\u0182\7\t\2"+
		"\2\u0182\u0183\5\f\7\2\u0183\u018a\b\34\1\2\u0184\u0185\7\60\2\2\u0185"+
		"\u0186\5\f\7\2\u0186\u0187\b\34\1\2\u0187\u0189\3\2\2\2\u0188\u0184\3"+
		"\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\'\2\2\u018e\u018f\b\34"+
		"\1\2\u018f\67\3\2\2\2\u0190\u0191\7#\2\2\u0191\u0192\5\f\7\2\u0192\u0199"+
		"\b\35\1\2\u0193\u0194\7\60\2\2\u0194\u0195\5\f\7\2\u0195\u0196\b\35\1"+
		"\2\u0196\u0198\3\2\2\2\u0197\u0193\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019d\7\'\2\2\u019d\u019e\b\35\1\2\u019e9\3\2\2\2\u019f\u01a0\7\30\2"+
		"\2\u01a0\u01a1\5\f\7\2\u01a1\u01a8\b\36\1\2\u01a2\u01a3\7\60\2\2\u01a3"+
		"\u01a4\5\f\7\2\u01a4\u01a5\b\36\1\2\u01a5\u01a7\3\2\2\2\u01a6\u01a2\3"+
		"\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\'\2\2\u01ac\u01ad\b\36"+
		"\1\2\u01ad;\3\2\2\2\u01ae\u01af\7\b\2\2\u01af\u01b0\5\f\7\2\u01b0\u01b7"+
		"\b\37\1\2\u01b1\u01b2\7\60\2\2\u01b2\u01b3\5\f\7\2\u01b3\u01b4\b\37\1"+
		"\2\u01b4\u01b6\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bb\7\'\2\2\u01bb\u01bc\b\37\1\2\u01bc=\3\2\2\2\u01bd\u01be\7\21\2"+
		"\2\u01be\u01bf\5\f\7\2\u01bf\u01c6\b \1\2\u01c0\u01c1\7\60\2\2\u01c1\u01c2"+
		"\5\f\7\2\u01c2\u01c3\b \1\2\u01c3\u01c5\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7\'\2\2\u01ca\u01cb\b \1\2\u01cb"+
		"?\3\2\2\2\u01cc\u01cd\7 \2\2\u01cd\u01ce\5\f\7\2\u01ce\u01d5\b!\1\2\u01cf"+
		"\u01d0\7\60\2\2\u01d0\u01d1\5\f\7\2\u01d1\u01d2\b!\1\2\u01d2\u01d4\3\2"+
		"\2\2\u01d3\u01cf\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\'"+
		"\2\2\u01d9\u01da\b!\1\2\u01daA\3\2\2\2\u01db\u01dc\7+\2\2\u01dc\u01dd"+
		"\b\"\1\2\u01ddC\3\2\2\2\u01de\u01df\7+\2\2\u01df\u01e0\b#\1\2\u01e0E\3"+
		"\2\2\2\u01e1\u01e2\7+\2\2\u01e2\u01e3\b$\1\2\u01e3G\3\2\2\2\u01e4\u01e5"+
		"\7+\2\2\u01e5\u01e6\b%\1\2\u01e6I\3\2\2\2\32[iw\u0085\u00a8\u00b5\u00be"+
		"\u00c9\u00d1\u00dc\u00e7\u0121\u0132\u0143\u014e\u015d\u016c\u017b\u018a"+
		"\u0199\u01a8\u01b7\u01c6\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}