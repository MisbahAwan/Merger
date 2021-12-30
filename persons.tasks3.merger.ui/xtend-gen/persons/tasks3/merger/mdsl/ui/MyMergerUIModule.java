package persons.tasks3.merger.mdsl.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import persons.tasks3.merger.mdsl.ide.MergerDslSemanticHighlightingCalculator;

@SuppressWarnings("all")
public class MyMergerUIModule {
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return MergerDslHighlightingConfiguration.class;
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return MergerDslSemanticHighlightingCalculator.class;
  }
}
