/*
 * generated by Xtext 2.25.0
 */
package persons.tasks3.merger.mdsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import persons.tasks3.merger.mdsl.parser.antlr.internal.InternalMergerDslParser;
import persons.tasks3.merger.mdsl.services.MergerDslGrammarAccess;

public class MergerDslParser extends AbstractAntlrParser {

	@Inject
	private MergerDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMergerDslParser createParser(XtextTokenStream stream) {
		return new InternalMergerDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Planning";
	}

	public MergerDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MergerDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
