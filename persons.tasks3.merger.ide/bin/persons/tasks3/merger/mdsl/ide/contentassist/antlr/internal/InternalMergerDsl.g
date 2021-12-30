/*
 * generated by Xtext 2.25.0
 */
grammar InternalMergerDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package persons.tasks3.merger.mdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package persons.tasks3.merger.mdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import persons.tasks3.merger.mdsl.services.MergerDslGrammarAccess;

}
@parser::members {
	private MergerDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MergerDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRulePlanning
entryRulePlanning
:
{ before(grammarAccess.getPlanningRule()); }
	 rulePlanning
{ after(grammarAccess.getPlanningRule()); } 
	 EOF 
;

// Rule Planning
rulePlanning 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlanningAccess().getGroup()); }
		(rule__Planning__Group__0)
		{ after(grammarAccess.getPlanningAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePerson
entryRulePerson
:
{ before(grammarAccess.getPersonRule()); }
	 rulePerson
{ after(grammarAccess.getPersonRule()); } 
	 EOF 
;

// Rule Person
rulePerson 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPersonAccess().getGroup()); }
		(rule__Person__Group__0)
		{ after(grammarAccess.getPersonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTask
entryRuleTask
:
{ before(grammarAccess.getTaskRule()); }
	 ruleTask
{ after(grammarAccess.getTaskRule()); } 
	 EOF 
;

// Rule Task
ruleTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskAccess().getGroup()); }
		(rule__Task__Group__0)
		{ after(grammarAccess.getTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getAlternatives()); }
		(rule__Action__Alternatives)
		{ after(grammarAccess.getActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLunchAction
entryRuleLunchAction
:
{ before(grammarAccess.getLunchActionRule()); }
	 ruleLunchAction
{ after(grammarAccess.getLunchActionRule()); } 
	 EOF 
;

// Rule LunchAction
ruleLunchAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLunchActionAccess().getGroup()); }
		(rule__LunchAction__Group__0)
		{ after(grammarAccess.getLunchActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMeetingAction
entryRuleMeetingAction
:
{ before(grammarAccess.getMeetingActionRule()); }
	 ruleMeetingAction
{ after(grammarAccess.getMeetingActionRule()); } 
	 EOF 
;

// Rule MeetingAction
ruleMeetingAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMeetingActionAccess().getGroup()); }
		(rule__MeetingAction__Group__0)
		{ after(grammarAccess.getMeetingActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePaperAction
entryRulePaperAction
:
{ before(grammarAccess.getPaperActionRule()); }
	 rulePaperAction
{ after(grammarAccess.getPaperActionRule()); } 
	 EOF 
;

// Rule PaperAction
rulePaperAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPaperActionAccess().getGroup()); }
		(rule__PaperAction__Group__0)
		{ after(grammarAccess.getPaperActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePaymentAction
entryRulePaymentAction
:
{ before(grammarAccess.getPaymentActionRule()); }
	 rulePaymentAction
{ after(grammarAccess.getPaymentActionRule()); } 
	 EOF 
;

// Rule PaymentAction
rulePaymentAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPaymentActionAccess().getGroup()); }
		(rule__PaymentAction__Group__0)
		{ after(grammarAccess.getPaymentActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TimeUnit
ruleTimeUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeUnitAccess().getAlternatives()); }
		(rule__TimeUnit__Alternatives)
		{ after(grammarAccess.getTimeUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlanningAccess().getPersonsAssignment_2_0()); }
		(rule__Planning__PersonsAssignment_2_0)
		{ after(grammarAccess.getPlanningAccess().getPersonsAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlanningAccess().getTasksAssignment_2_1()); }
		(rule__Planning__TasksAssignment_2_1)
		{ after(grammarAccess.getPlanningAccess().getTasksAssignment_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); }
		ruleLunchAction
		{ after(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); }
		ruleMeetingAction
		{ after(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); }
		rulePaperAction
		{ after(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); }
		rulePaymentAction
		{ after(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); }
		('min')
		{ after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); }
		('hour')
		{ after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); }
		('day')
		{ after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); }
		('week')
		{ after(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Planning__Group__0__Impl
	rule__Planning__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); }
	'Planning'
	{ after(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Planning__Group__1__Impl
	rule__Planning__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlanningAccess().getNameAssignment_1()); }
	(rule__Planning__NameAssignment_1)
	{ after(grammarAccess.getPlanningAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Planning__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlanningAccess().getAlternatives_2()); }
	(rule__Planning__Alternatives_2)*
	{ after(grammarAccess.getPlanningAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Person__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__0__Impl
	rule__Person__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getPersonKeyword_0()); }
	'Person:'
	{ after(grammarAccess.getPersonAccess().getPersonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getNameAssignment_1()); }
	(rule__Person__NameAssignment_1)
	{ after(grammarAccess.getPersonAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Task__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__0__Impl
	rule__Task__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getTaskKeyword_0()); }
	'Task:'
	{ after(grammarAccess.getTaskAccess().getTaskKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__1__Impl
	rule__Task__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getActionAssignment_1()); }
	(rule__Task__ActionAssignment_1)
	{ after(grammarAccess.getTaskAccess().getActionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__2__Impl
	rule__Task__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getPersonsKeyword_2()); }
	'persons:'
	{ after(grammarAccess.getTaskAccess().getPersonsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__3__Impl
	rule__Task__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); }
		(rule__Task__PersonsAssignment_3)
		{ after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); }
	)
	(
		{ before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); }
		(rule__Task__PersonsAssignment_3)*
		{ after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__4__Impl
	rule__Task__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getPriorityKeyword_4()); }
	'priority:'
	{ after(grammarAccess.getTaskAccess().getPriorityKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__5__Impl
	rule__Task__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getPrioAssignment_5()); }
	(rule__Task__PrioAssignment_5)
	{ after(grammarAccess.getTaskAccess().getPrioAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getGroup_6()); }
	(rule__Task__Group_6__0)?
	{ after(grammarAccess.getTaskAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Task__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group_6__0__Impl
	rule__Task__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); }
	'duration:'
	{ after(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group_6__1__Impl
	rule__Task__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getDlAssignment_6_1()); }
	(rule__Task__DlAssignment_6_1)
	{ after(grammarAccess.getTaskAccess().getDlAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Task__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskAccess().getUnitAssignment_6_2()); }
	(rule__Task__UnitAssignment_6_2)
	{ after(grammarAccess.getTaskAccess().getUnitAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LunchAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LunchAction__Group__0__Impl
	rule__LunchAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LunchAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); }
	'Lunch'
	{ after(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LunchAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LunchAction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LunchAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); }
	(rule__LunchAction__LocationAssignment_1)
	{ after(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MeetingAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MeetingAction__Group__0__Impl
	rule__MeetingAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MeetingAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); }
	'Meeting'
	{ after(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MeetingAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MeetingAction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MeetingAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); }
	(rule__MeetingAction__TopicAssignment_1)
	{ after(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PaperAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PaperAction__Group__0__Impl
	rule__PaperAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PaperAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); }
	'Report'
	{ after(grammarAccess.getPaperActionAccess().getReportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PaperAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PaperAction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PaperAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); }
	(rule__PaperAction__ReportAssignment_1)
	{ after(grammarAccess.getPaperActionAccess().getReportAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PaymentAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PaymentAction__Group__0__Impl
	rule__PaymentAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PaymentAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); }
	'Pay'
	{ after(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PaymentAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PaymentAction__Group__1__Impl
	rule__PaymentAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PaymentAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); }
	(rule__PaymentAction__AmountAssignment_1)
	{ after(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PaymentAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PaymentAction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PaymentAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); }
	'euro'
	{ after(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Planning__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__PersonsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_2_0_0()); }
		rulePerson
		{ after(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Planning__TasksAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_2_1_0()); }
		ruleTask
		{ after(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__ActionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); }
		ruleAction
		{ after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__PersonsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__PrioAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__DlAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getDlINTTerminalRuleCall_6_1_0()); }
		RULE_INT
		{ after(grammarAccess.getTaskAccess().getDlINTTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Task__UnitAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskAccess().getUnitTimeUnitEnumRuleCall_6_2_0()); }
		ruleTimeUnit
		{ after(grammarAccess.getTaskAccess().getUnitTimeUnitEnumRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LunchAction__LocationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MeetingAction__TopicAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PaperAction__ReportAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PaymentAction__AmountAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;