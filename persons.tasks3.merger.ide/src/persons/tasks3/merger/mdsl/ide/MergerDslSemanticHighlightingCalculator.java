package persons.tasks3.merger.mdsl.ide;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
//import org.xtext.example.mydsl.myDsl.Model;
//import org.xtext.example.mydsl.services.MyDslGrammarAccess;

import com.google.inject.Inject;
import org.eclipse.xtext.resource.XtextResource;

import persons.tasks3.merger.mdsl.mergerDsl.Planning;
import persons.tasks3.merger.mdsl.services.MergerDslGrammarAccess;

public class MergerDslSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	
	public static class MergerDslHighlightingStyles implements HighlightingStyles {
		public static String KEYWORD_RED_ID = KEYWORD_ID + "Red";
	}

	@Inject
	MergerDslGrammarAccess ga;

	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {System.out.println("highlightElementhighlightElementhighlightElementhighlightElement");
		if (object instanceof Planning) {System.out.println("highlighthighlighthighlighthighlighthighlighthighlighthighlighthighlighthighlighthighlighthighlight");
			Keyword keyword = ga.getPersonAccess().getPersonKeyword_0();
			for (ILeafNode n : NodeModelUtils.findActualNodeFor(object).getLeafNodes()) {
				//if (keyword == n.getGrammarElement()) {
					acceptor.addPosition(n.getOffset(), n.getLength(), MergerDslHighlightingStyles.KEYWORD_RED_ID);
				//}
			}
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}
// @Override
/*   public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor)
   {
      if (resource == null || resource.getParseResult() == null)
         return;

      INode root = resource.getParseResult().getRootNode();
      for (INode node : root.getAsTreeIterable())
      {
         if (node.getSemanticElement() instanceof DocCommentElement)
         {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                  MyHighlightingConfiguration.DOCUMENTATION_COMMENT_ID);
         }
      }
   }*/
}

