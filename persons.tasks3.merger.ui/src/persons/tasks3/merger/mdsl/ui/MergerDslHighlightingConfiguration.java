package persons.tasks3.merger.mdsl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import persons.tasks3.merger.mdsl.ide.MergerDslSemanticHighlightingCalculator.MergerDslHighlightingStyles;

public class MergerDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(MergerDslHighlightingStyles.KEYWORD_RED_ID, "KeywordRed", keywordRedTextStyle());
		super.configure(acceptor);
	}
	
	public TextStyle keywordRedTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

}