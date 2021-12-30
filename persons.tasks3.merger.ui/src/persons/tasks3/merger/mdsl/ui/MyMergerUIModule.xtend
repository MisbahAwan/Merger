package persons.tasks3.merger.mdsl.ui

import org.eclipse.ui.plugin.AbstractUIPlugin;
//import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import persons.tasks3.merger.mdsl.ide.MergerDslSemanticHighlightingCalculator;
import persons.tasks3.merger.mdsl.ui.MergerDslHighlightingConfiguration;

class MyMergerUIModule {//extends AbstractGTUiModule {
	
	
	def Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return MergerDslHighlightingConfiguration
	}
	
	def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		MergerDslSemanticHighlightingCalculator
	}
}