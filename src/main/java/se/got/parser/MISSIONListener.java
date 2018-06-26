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

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MISSIONParser}.
 */
public interface MISSIONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#locationDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocationDecl(@NotNull MISSIONParser.LocationDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#locationDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocationDecl(@NotNull MISSIONParser.LocationDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#ordered_patrolling}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_patrolling(@NotNull MISSIONParser.Ordered_patrollingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#ordered_patrolling}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_patrolling(@NotNull MISSIONParser.Ordered_patrollingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull MISSIONParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull MISSIONParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull MISSIONParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull MISSIONParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#future_avoidance}.
	 * @param ctx the parse tree
	 */
	void enterFuture_avoidance(@NotNull MISSIONParser.Future_avoidanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#future_avoidance}.
	 * @param ctx the parse tree
	 */
	void exitFuture_avoidance(@NotNull MISSIONParser.Future_avoidanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#robot}.
	 * @param ctx the parse tree
	 */
	void enterRobot(@NotNull MISSIONParser.RobotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#robot}.
	 * @param ctx the parse tree
	 */
	void exitRobot(@NotNull MISSIONParser.RobotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#past_avoidance}.
	 * @param ctx the parse tree
	 */
	void enterPast_avoidance(@NotNull MISSIONParser.Past_avoidanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#past_avoidance}.
	 * @param ctx the parse tree
	 */
	void exitPast_avoidance(@NotNull MISSIONParser.Past_avoidanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#sequenced_patrolling}.
	 * @param ctx the parse tree
	 */
	void enterSequenced_patrolling(@NotNull MISSIONParser.Sequenced_patrollingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#sequenced_patrolling}.
	 * @param ctx the parse tree
	 */
	void exitSequenced_patrolling(@NotNull MISSIONParser.Sequenced_patrollingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#actionDecl}.
	 * @param ctx the parse tree
	 */
	void enterActionDecl(@NotNull MISSIONParser.ActionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#actionDecl}.
	 * @param ctx the parse tree
	 */
	void exitActionDecl(@NotNull MISSIONParser.ActionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull MISSIONParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull MISSIONParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#exact_restricted_avoidance}.
	 * @param ctx the parse tree
	 */
	void enterExact_restricted_avoidance(@NotNull MISSIONParser.Exact_restricted_avoidanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#exact_restricted_avoidance}.
	 * @param ctx the parse tree
	 */
	void exitExact_restricted_avoidance(@NotNull MISSIONParser.Exact_restricted_avoidanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#surveillance}.
	 * @param ctx the parse tree
	 */
	void enterSurveillance(@NotNull MISSIONParser.SurveillanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#surveillance}.
	 * @param ctx the parse tree
	 */
	void exitSurveillance(@NotNull MISSIONParser.SurveillanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#robotsDecl}.
	 * @param ctx the parse tree
	 */
	void enterRobotsDecl(@NotNull MISSIONParser.RobotsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#robotsDecl}.
	 * @param ctx the parse tree
	 */
	void exitRobotsDecl(@NotNull MISSIONParser.RobotsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#global_avoidance}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_avoidance(@NotNull MISSIONParser.Global_avoidanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#global_avoidance}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_avoidance(@NotNull MISSIONParser.Global_avoidanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#coverage}.
	 * @param ctx the parse tree
	 */
	void enterCoverage(@NotNull MISSIONParser.CoverageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#coverage}.
	 * @param ctx the parse tree
	 */
	void exitCoverage(@NotNull MISSIONParser.CoverageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#upper_restricted_avoidance}.
	 * @param ctx the parse tree
	 */
	void enterUpper_restricted_avoidance(@NotNull MISSIONParser.Upper_restricted_avoidanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#upper_restricted_avoidance}.
	 * @param ctx the parse tree
	 */
	void exitUpper_restricted_avoidance(@NotNull MISSIONParser.Upper_restricted_avoidanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull MISSIONParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull MISSIONParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#sequenced_visit}.
	 * @param ctx the parse tree
	 */
	void enterSequenced_visit(@NotNull MISSIONParser.Sequenced_visitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#sequenced_visit}.
	 * @param ctx the parse tree
	 */
	void exitSequenced_visit(@NotNull MISSIONParser.Sequenced_visitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#fair_patrolling}.
	 * @param ctx the parse tree
	 */
	void enterFair_patrolling(@NotNull MISSIONParser.Fair_patrollingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#fair_patrolling}.
	 * @param ctx the parse tree
	 */
	void exitFair_patrolling(@NotNull MISSIONParser.Fair_patrollingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#avoidance}.
	 * @param ctx the parse tree
	 */
	void enterAvoidance(@NotNull MISSIONParser.AvoidanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#avoidance}.
	 * @param ctx the parse tree
	 */
	void exitAvoidance(@NotNull MISSIONParser.AvoidanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#core_movement_pattern}.
	 * @param ctx the parse tree
	 */
	void enterCore_movement_pattern(@NotNull MISSIONParser.Core_movement_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#core_movement_pattern}.
	 * @param ctx the parse tree
	 */
	void exitCore_movement_pattern(@NotNull MISSIONParser.Core_movement_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#lower_restricted_avoidance}.
	 * @param ctx the parse tree
	 */
	void enterLower_restricted_avoidance(@NotNull MISSIONParser.Lower_restricted_avoidanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#lower_restricted_avoidance}.
	 * @param ctx the parse tree
	 */
	void exitLower_restricted_avoidance(@NotNull MISSIONParser.Lower_restricted_avoidanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#patrolling}.
	 * @param ctx the parse tree
	 */
	void enterPatrolling(@NotNull MISSIONParser.PatrollingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#patrolling}.
	 * @param ctx the parse tree
	 */
	void exitPatrolling(@NotNull MISSIONParser.PatrollingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#strict_ordered_patrolling}.
	 * @param ctx the parse tree
	 */
	void enterStrict_ordered_patrolling(@NotNull MISSIONParser.Strict_ordered_patrollingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#strict_ordered_patrolling}.
	 * @param ctx the parse tree
	 */
	void exitStrict_ordered_patrolling(@NotNull MISSIONParser.Strict_ordered_patrollingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#fair_visit}.
	 * @param ctx the parse tree
	 */
	void enterFair_visit(@NotNull MISSIONParser.Fair_visitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#fair_visit}.
	 * @param ctx the parse tree
	 */
	void exitFair_visit(@NotNull MISSIONParser.Fair_visitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#pa}.
	 * @param ctx the parse tree
	 */
	void enterPa(@NotNull MISSIONParser.PaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#pa}.
	 * @param ctx the parse tree
	 */
	void exitPa(@NotNull MISSIONParser.PaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#mission}.
	 * @param ctx the parse tree
	 */
	void enterMission(@NotNull MISSIONParser.MissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#mission}.
	 * @param ctx the parse tree
	 */
	void exitMission(@NotNull MISSIONParser.MissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull MISSIONParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull MISSIONParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#pe}.
	 * @param ctx the parse tree
	 */
	void enterPe(@NotNull MISSIONParser.PeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#pe}.
	 * @param ctx the parse tree
	 */
	void exitPe(@NotNull MISSIONParser.PeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#restricted}.
	 * @param ctx the parse tree
	 */
	void enterRestricted(@NotNull MISSIONParser.RestrictedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#restricted}.
	 * @param ctx the parse tree
	 */
	void exitRestricted(@NotNull MISSIONParser.RestrictedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#strict_ordered_visit}.
	 * @param ctx the parse tree
	 */
	void enterStrict_ordered_visit(@NotNull MISSIONParser.Strict_ordered_visitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#strict_ordered_visit}.
	 * @param ctx the parse tree
	 */
	void exitStrict_ordered_visit(@NotNull MISSIONParser.Strict_ordered_visitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#conditionsDecl}.
	 * @param ctx the parse tree
	 */
	void enterConditionsDecl(@NotNull MISSIONParser.ConditionsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#conditionsDecl}.
	 * @param ctx the parse tree
	 */
	void exitConditionsDecl(@NotNull MISSIONParser.ConditionsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull MISSIONParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull MISSIONParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#visit}.
	 * @param ctx the parse tree
	 */
	void enterVisit(@NotNull MISSIONParser.VisitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#visit}.
	 * @param ctx the parse tree
	 */
	void exitVisit(@NotNull MISSIONParser.VisitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#pl}.
	 * @param ctx the parse tree
	 */
	void enterPl(@NotNull MISSIONParser.PlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#pl}.
	 * @param ctx the parse tree
	 */
	void exitPl(@NotNull MISSIONParser.PlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MISSIONParser#ordered_visit}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_visit(@NotNull MISSIONParser.Ordered_visitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MISSIONParser#ordered_visit}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_visit(@NotNull MISSIONParser.Ordered_visitContext ctx);
}