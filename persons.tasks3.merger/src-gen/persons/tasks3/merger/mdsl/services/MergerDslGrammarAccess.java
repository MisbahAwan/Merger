/*
 * generated by Xtext 2.25.0
 */
package persons.tasks3.merger.mdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MergerDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class PlanningElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.Planning");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPlanningKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cPersonsAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cPersonsPersonParserRuleCall_2_0_0 = (RuleCall)cPersonsAssignment_2_0.eContents().get(0);
		private final Assignment cTasksAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cTasksTaskParserRuleCall_2_1_0 = (RuleCall)cTasksAssignment_2_1.eContents().get(0);
		
		//Planning: 'Planning' name = ID
		// (persons += Person | tasks += Task)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Planning' name = ID
		//(persons += Person | tasks += Task)*
		public Group getGroup() { return cGroup; }
		
		//'Planning'
		public Keyword getPlanningKeyword_0() { return cPlanningKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(persons += Person | tasks += Task)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//persons += Person
		public Assignment getPersonsAssignment_2_0() { return cPersonsAssignment_2_0; }
		
		//Person
		public RuleCall getPersonsPersonParserRuleCall_2_0_0() { return cPersonsPersonParserRuleCall_2_0_0; }
		
		//tasks += Task
		public Assignment getTasksAssignment_2_1() { return cTasksAssignment_2_1; }
		
		//Task
		public RuleCall getTasksTaskParserRuleCall_2_1_0() { return cTasksTaskParserRuleCall_2_1_0; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.Person");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Person: 'Person:' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Person:' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Person:'
		public Keyword getPersonKeyword_0() { return cPersonKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.Task");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cActionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActionActionParserRuleCall_1_0 = (RuleCall)cActionAssignment_1.eContents().get(0);
		private final Keyword cPersonsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPersonsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPersonsPersonCrossReference_3_0 = (CrossReference)cPersonsAssignment_3.eContents().get(0);
		private final RuleCall cPersonsPersonIDTerminalRuleCall_3_0_1 = (RuleCall)cPersonsPersonCrossReference_3_0.eContents().get(1);
		private final Keyword cPriorityKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPrioAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPrioINTTerminalRuleCall_5_0 = (RuleCall)cPrioAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cDurationKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDlAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDlINTTerminalRuleCall_6_1_0 = (RuleCall)cDlAssignment_6_1.eContents().get(0);
		private final Assignment cUnitAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cUnitTimeUnitEnumRuleCall_6_2_0 = (RuleCall)cUnitAssignment_6_2.eContents().get(0);
		
		//Task: 'Task:' action = Action
		// 'persons:' persons += [Person]+
		// 'priority:' prio = INT
		// ('duration:' dl = INT unit = TimeUnit)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Task:' action = Action
		//'persons:' persons += [Person]+
		//'priority:' prio = INT
		//('duration:' dl = INT unit = TimeUnit)?
		public Group getGroup() { return cGroup; }
		
		//'Task:'
		public Keyword getTaskKeyword_0() { return cTaskKeyword_0; }
		
		//action = Action
		public Assignment getActionAssignment_1() { return cActionAssignment_1; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_1_0() { return cActionActionParserRuleCall_1_0; }
		
		//'persons:'
		public Keyword getPersonsKeyword_2() { return cPersonsKeyword_2; }
		
		//persons += [Person]+
		public Assignment getPersonsAssignment_3() { return cPersonsAssignment_3; }
		
		//[Person]
		public CrossReference getPersonsPersonCrossReference_3_0() { return cPersonsPersonCrossReference_3_0; }
		
		//ID
		public RuleCall getPersonsPersonIDTerminalRuleCall_3_0_1() { return cPersonsPersonIDTerminalRuleCall_3_0_1; }
		
		//'priority:'
		public Keyword getPriorityKeyword_4() { return cPriorityKeyword_4; }
		
		//prio = INT
		public Assignment getPrioAssignment_5() { return cPrioAssignment_5; }
		
		//INT
		public RuleCall getPrioINTTerminalRuleCall_5_0() { return cPrioINTTerminalRuleCall_5_0; }
		
		//('duration:' dl = INT unit = TimeUnit)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'duration:'
		public Keyword getDurationKeyword_6_0() { return cDurationKeyword_6_0; }
		
		//dl = INT
		public Assignment getDlAssignment_6_1() { return cDlAssignment_6_1; }
		
		//INT
		public RuleCall getDlINTTerminalRuleCall_6_1_0() { return cDlINTTerminalRuleCall_6_1_0; }
		
		//unit = TimeUnit
		public Assignment getUnitAssignment_6_2() { return cUnitAssignment_6_2; }
		
		//TimeUnit
		public RuleCall getUnitTimeUnitEnumRuleCall_6_2_0() { return cUnitTimeUnitEnumRuleCall_6_2_0; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLunchActionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMeetingActionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPaperActionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPaymentActionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		////BELLOW IS SPEC2 IN INSTANCE WORKSPACE
		///*Planning: 'Persons:' persons += Person+
		// tasks += Task*
		//;
		//Person: name=ID
		//;
		//Task: 'Task' action = Action
		// 'person' person = [Person]
		// 'priority:' prio = INT
		// ('duration:' dl = INT unit = TimeUnit)?
		//;
		//*/
		//Action: LunchAction | MeetingAction | PaperAction | PaymentAction
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//LunchAction | MeetingAction | PaperAction | PaymentAction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LunchAction
		public RuleCall getLunchActionParserRuleCall_0() { return cLunchActionParserRuleCall_0; }
		
		//MeetingAction
		public RuleCall getMeetingActionParserRuleCall_1() { return cMeetingActionParserRuleCall_1; }
		
		//PaperAction
		public RuleCall getPaperActionParserRuleCall_2() { return cPaperActionParserRuleCall_2; }
		
		//PaymentAction
		public RuleCall getPaymentActionParserRuleCall_3() { return cPaymentActionParserRuleCall_3; }
	}
	public class LunchActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.LunchAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLunchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLocationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLocationIDTerminalRuleCall_1_0 = (RuleCall)cLocationAssignment_1.eContents().get(0);
		
		//LunchAction: 'Lunch' location = ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Lunch' location = ID
		public Group getGroup() { return cGroup; }
		
		//'Lunch'
		public Keyword getLunchKeyword_0() { return cLunchKeyword_0; }
		
		//location = ID
		public Assignment getLocationAssignment_1() { return cLocationAssignment_1; }
		
		//ID
		public RuleCall getLocationIDTerminalRuleCall_1_0() { return cLocationIDTerminalRuleCall_1_0; }
	}
	public class MeetingActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.MeetingAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMeetingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTopicAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTopicSTRINGTerminalRuleCall_1_0 = (RuleCall)cTopicAssignment_1.eContents().get(0);
		
		//MeetingAction: 'Meeting' topic = STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Meeting' topic = STRING
		public Group getGroup() { return cGroup; }
		
		//'Meeting'
		public Keyword getMeetingKeyword_0() { return cMeetingKeyword_0; }
		
		//topic = STRING
		public Assignment getTopicAssignment_1() { return cTopicAssignment_1; }
		
		//STRING
		public RuleCall getTopicSTRINGTerminalRuleCall_1_0() { return cTopicSTRINGTerminalRuleCall_1_0; }
	}
	public class PaperActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.PaperAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cReportAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cReportIDTerminalRuleCall_1_0 = (RuleCall)cReportAssignment_1.eContents().get(0);
		
		//PaperAction: 'Report' report = ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Report' report = ID
		public Group getGroup() { return cGroup; }
		
		//'Report'
		public Keyword getReportKeyword_0() { return cReportKeyword_0; }
		
		//report = ID
		public Assignment getReportAssignment_1() { return cReportAssignment_1; }
		
		//ID
		public RuleCall getReportIDTerminalRuleCall_1_0() { return cReportIDTerminalRuleCall_1_0; }
	}
	public class PaymentActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.PaymentAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPayKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAmountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAmountINTTerminalRuleCall_1_0 = (RuleCall)cAmountAssignment_1.eContents().get(0);
		private final Keyword cEuroKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PaymentAction: 'Pay' amount = INT 'euro'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Pay' amount = INT 'euro'
		public Group getGroup() { return cGroup; }
		
		//'Pay'
		public Keyword getPayKeyword_0() { return cPayKeyword_0; }
		
		//amount = INT
		public Assignment getAmountAssignment_1() { return cAmountAssignment_1; }
		
		//INT
		public RuleCall getAmountINTTerminalRuleCall_1_0() { return cAmountINTTerminalRuleCall_1_0; }
		
		//'euro'
		public Keyword getEuroKeyword_2() { return cEuroKeyword_2; }
	}
	
	public class TimeUnitElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "persons.tasks3.merger.mdsl.MergerDsl.TimeUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMINUTEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMINUTEMinKeyword_0_0 = (Keyword)cMINUTEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cHOUREnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cHOURHourKeyword_1_0 = (Keyword)cHOUREnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cDAYEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cDAYDayKeyword_2_0 = (Keyword)cDAYEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cWEEKEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cWEEKWeekKeyword_3_0 = (Keyword)cWEEKEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum TimeUnit:
		// MINUTE = 'min' |
		// HOUR = 'hour' |
		// DAY = 'day' |
		// WEEK = 'week'
		//;
		public EnumRule getRule() { return rule; }
		
		//MINUTE = 'min' |
		//HOUR = 'hour' |
		//DAY = 'day' |
		//WEEK = 'week'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MINUTE = 'min'
		public EnumLiteralDeclaration getMINUTEEnumLiteralDeclaration_0() { return cMINUTEEnumLiteralDeclaration_0; }
		
		//'min'
		public Keyword getMINUTEMinKeyword_0_0() { return cMINUTEMinKeyword_0_0; }
		
		//HOUR = 'hour'
		public EnumLiteralDeclaration getHOUREnumLiteralDeclaration_1() { return cHOUREnumLiteralDeclaration_1; }
		
		//'hour'
		public Keyword getHOURHourKeyword_1_0() { return cHOURHourKeyword_1_0; }
		
		//DAY = 'day'
		public EnumLiteralDeclaration getDAYEnumLiteralDeclaration_2() { return cDAYEnumLiteralDeclaration_2; }
		
		//'day'
		public Keyword getDAYDayKeyword_2_0() { return cDAYDayKeyword_2_0; }
		
		//WEEK = 'week'
		public EnumLiteralDeclaration getWEEKEnumLiteralDeclaration_3() { return cWEEKEnumLiteralDeclaration_3; }
		
		//'week'
		public Keyword getWEEKWeekKeyword_3_0() { return cWEEKWeekKeyword_3_0; }
	}
	
	private final PlanningElements pPlanning;
	private final PersonElements pPerson;
	private final TaskElements pTask;
	private final ActionElements pAction;
	private final LunchActionElements pLunchAction;
	private final MeetingActionElements pMeetingAction;
	private final PaperActionElements pPaperAction;
	private final PaymentActionElements pPaymentAction;
	private final TimeUnitElements eTimeUnit;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MergerDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPlanning = new PlanningElements();
		this.pPerson = new PersonElements();
		this.pTask = new TaskElements();
		this.pAction = new ActionElements();
		this.pLunchAction = new LunchActionElements();
		this.pMeetingAction = new MeetingActionElements();
		this.pPaperAction = new PaperActionElements();
		this.pPaymentAction = new PaymentActionElements();
		this.eTimeUnit = new TimeUnitElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("persons.tasks3.merger.mdsl.MergerDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Planning: 'Planning' name = ID
	// (persons += Person | tasks += Task)*
	//;
	public PlanningElements getPlanningAccess() {
		return pPlanning;
	}
	
	public ParserRule getPlanningRule() {
		return getPlanningAccess().getRule();
	}
	
	//Person: 'Person:' name=ID
	//;
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	//Task: 'Task:' action = Action
	// 'persons:' persons += [Person]+
	// 'priority:' prio = INT
	// ('duration:' dl = INT unit = TimeUnit)?
	//;
	public TaskElements getTaskAccess() {
		return pTask;
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}
	
	////BELLOW IS SPEC2 IN INSTANCE WORKSPACE
	///*Planning: 'Persons:' persons += Person+
	// tasks += Task*
	//;
	//Person: name=ID
	//;
	//Task: 'Task' action = Action
	// 'person' person = [Person]
	// 'priority:' prio = INT
	// ('duration:' dl = INT unit = TimeUnit)?
	//;
	//*/
	//Action: LunchAction | MeetingAction | PaperAction | PaymentAction
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//LunchAction: 'Lunch' location = ID
	//;
	public LunchActionElements getLunchActionAccess() {
		return pLunchAction;
	}
	
	public ParserRule getLunchActionRule() {
		return getLunchActionAccess().getRule();
	}
	
	//MeetingAction: 'Meeting' topic = STRING
	//;
	public MeetingActionElements getMeetingActionAccess() {
		return pMeetingAction;
	}
	
	public ParserRule getMeetingActionRule() {
		return getMeetingActionAccess().getRule();
	}
	
	//PaperAction: 'Report' report = ID
	//;
	public PaperActionElements getPaperActionAccess() {
		return pPaperAction;
	}
	
	public ParserRule getPaperActionRule() {
		return getPaperActionAccess().getRule();
	}
	
	//PaymentAction: 'Pay' amount = INT 'euro'
	//;
	public PaymentActionElements getPaymentActionAccess() {
		return pPaymentAction;
	}
	
	public ParserRule getPaymentActionRule() {
		return getPaymentActionAccess().getRule();
	}
	
	//enum TimeUnit:
	// MINUTE = 'min' |
	// HOUR = 'hour' |
	// DAY = 'day' |
	// WEEK = 'week'
	//;
	public TimeUnitElements getTimeUnitAccess() {
		return eTimeUnit;
	}
	
	public EnumRule getTimeUnitRule() {
		return getTimeUnitAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
