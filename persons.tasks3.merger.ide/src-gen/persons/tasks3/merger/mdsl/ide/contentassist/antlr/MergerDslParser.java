/*
 * generated by Xtext 2.25.0
 */
package persons.tasks3.merger.mdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import persons.tasks3.merger.mdsl.ide.contentassist.antlr.internal.InternalMergerDslParser;
import persons.tasks3.merger.mdsl.services.MergerDslGrammarAccess;

public class MergerDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MergerDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MergerDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPlanningAccess().getAlternatives_2(), "rule__Planning__Alternatives_2");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getPlanningAccess().getGroup(), "rule__Planning__Group__0");
			builder.put(grammarAccess.getPersonAccess().getGroup(), "rule__Person__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_6(), "rule__Task__Group_6__0");
			builder.put(grammarAccess.getLunchActionAccess().getGroup(), "rule__LunchAction__Group__0");
			builder.put(grammarAccess.getMeetingActionAccess().getGroup(), "rule__MeetingAction__Group__0");
			builder.put(grammarAccess.getPaperActionAccess().getGroup(), "rule__PaperAction__Group__0");
			builder.put(grammarAccess.getPaymentActionAccess().getGroup(), "rule__PaymentAction__Group__0");
			builder.put(grammarAccess.getPlanningAccess().getNameAssignment_1(), "rule__Planning__NameAssignment_1");
			builder.put(grammarAccess.getPlanningAccess().getPersonsAssignment_2_0(), "rule__Planning__PersonsAssignment_2_0");
			builder.put(grammarAccess.getPlanningAccess().getTasksAssignment_2_1(), "rule__Planning__TasksAssignment_2_1");
			builder.put(grammarAccess.getPersonAccess().getNameAssignment_1(), "rule__Person__NameAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getActionAssignment_1(), "rule__Task__ActionAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getPersonsAssignment_3(), "rule__Task__PersonsAssignment_3");
			builder.put(grammarAccess.getTaskAccess().getPrioAssignment_5(), "rule__Task__PrioAssignment_5");
			builder.put(grammarAccess.getTaskAccess().getDlAssignment_6_1(), "rule__Task__DlAssignment_6_1");
			builder.put(grammarAccess.getTaskAccess().getUnitAssignment_6_2(), "rule__Task__UnitAssignment_6_2");
			builder.put(grammarAccess.getLunchActionAccess().getLocationAssignment_1(), "rule__LunchAction__LocationAssignment_1");
			builder.put(grammarAccess.getMeetingActionAccess().getTopicAssignment_1(), "rule__MeetingAction__TopicAssignment_1");
			builder.put(grammarAccess.getPaperActionAccess().getReportAssignment_1(), "rule__PaperAction__ReportAssignment_1");
			builder.put(grammarAccess.getPaymentActionAccess().getAmountAssignment_1(), "rule__PaymentAction__AmountAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MergerDslGrammarAccess grammarAccess;

	@Override
	protected InternalMergerDslParser createParser() {
		InternalMergerDslParser result = new InternalMergerDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MergerDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MergerDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
