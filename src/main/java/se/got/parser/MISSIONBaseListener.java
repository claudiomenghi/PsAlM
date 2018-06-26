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


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link MISSIONListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MISSIONBaseListener implements MISSIONListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLocationDecl(@NotNull MISSIONParser.LocationDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLocationDecl(@NotNull MISSIONParser.LocationDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOrdered_patrolling(@NotNull MISSIONParser.Ordered_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOrdered_patrolling(@NotNull MISSIONParser.Ordered_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditional(@NotNull MISSIONParser.ConditionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditional(@NotNull MISSIONParser.ConditionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPattern(@NotNull MISSIONParser.PatternContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPattern(@NotNull MISSIONParser.PatternContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFuture_avoidance(@NotNull MISSIONParser.Future_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFuture_avoidance(@NotNull MISSIONParser.Future_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRobot(@NotNull MISSIONParser.RobotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRobot(@NotNull MISSIONParser.RobotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPast_avoidance(@NotNull MISSIONParser.Past_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPast_avoidance(@NotNull MISSIONParser.Past_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSequenced_patrolling(@NotNull MISSIONParser.Sequenced_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSequenced_patrolling(@NotNull MISSIONParser.Sequenced_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActionDecl(@NotNull MISSIONParser.ActionDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActionDecl(@NotNull MISSIONParser.ActionDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAction(@NotNull MISSIONParser.ActionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAction(@NotNull MISSIONParser.ActionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExact_restricted_avoidance(@NotNull MISSIONParser.Exact_restricted_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExact_restricted_avoidance(@NotNull MISSIONParser.Exact_restricted_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSurveillance(@NotNull MISSIONParser.SurveillanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSurveillance(@NotNull MISSIONParser.SurveillanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRobotsDecl(@NotNull MISSIONParser.RobotsDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRobotsDecl(@NotNull MISSIONParser.RobotsDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGlobal_avoidance(@NotNull MISSIONParser.Global_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGlobal_avoidance(@NotNull MISSIONParser.Global_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCoverage(@NotNull MISSIONParser.CoverageContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCoverage(@NotNull MISSIONParser.CoverageContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUpper_restricted_avoidance(@NotNull MISSIONParser.Upper_restricted_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUpper_restricted_avoidance(@NotNull MISSIONParser.Upper_restricted_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGoal(@NotNull MISSIONParser.GoalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGoal(@NotNull MISSIONParser.GoalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSequenced_visit(@NotNull MISSIONParser.Sequenced_visitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSequenced_visit(@NotNull MISSIONParser.Sequenced_visitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFair_patrolling(@NotNull MISSIONParser.Fair_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFair_patrolling(@NotNull MISSIONParser.Fair_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAvoidance(@NotNull MISSIONParser.AvoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAvoidance(@NotNull MISSIONParser.AvoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCore_movement_pattern(@NotNull MISSIONParser.Core_movement_patternContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCore_movement_pattern(@NotNull MISSIONParser.Core_movement_patternContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLower_restricted_avoidance(@NotNull MISSIONParser.Lower_restricted_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLower_restricted_avoidance(@NotNull MISSIONParser.Lower_restricted_avoidanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPatrolling(@NotNull MISSIONParser.PatrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPatrolling(@NotNull MISSIONParser.PatrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStrict_ordered_patrolling(@NotNull MISSIONParser.Strict_ordered_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStrict_ordered_patrolling(@NotNull MISSIONParser.Strict_ordered_patrollingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFair_visit(@NotNull MISSIONParser.Fair_visitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFair_visit(@NotNull MISSIONParser.Fair_visitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPa(@NotNull MISSIONParser.PaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPa(@NotNull MISSIONParser.PaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMission(@NotNull MISSIONParser.MissionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMission(@NotNull MISSIONParser.MissionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondition(@NotNull MISSIONParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondition(@NotNull MISSIONParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPe(@NotNull MISSIONParser.PeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPe(@NotNull MISSIONParser.PeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRestricted(@NotNull MISSIONParser.RestrictedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRestricted(@NotNull MISSIONParser.RestrictedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStrict_ordered_visit(@NotNull MISSIONParser.Strict_ordered_visitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStrict_ordered_visit(@NotNull MISSIONParser.Strict_ordered_visitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditionsDecl(@NotNull MISSIONParser.ConditionsDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditionsDecl(@NotNull MISSIONParser.ConditionsDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLocation(@NotNull MISSIONParser.LocationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLocation(@NotNull MISSIONParser.LocationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVisit(@NotNull MISSIONParser.VisitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVisit(@NotNull MISSIONParser.VisitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPl(@NotNull MISSIONParser.PlContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPl(@NotNull MISSIONParser.PlContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOrdered_visit(@NotNull MISSIONParser.Ordered_visitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOrdered_visit(@NotNull MISSIONParser.Ordered_visitContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}