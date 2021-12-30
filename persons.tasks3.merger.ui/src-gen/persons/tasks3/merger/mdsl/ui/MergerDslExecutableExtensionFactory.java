/*
 * generated by Xtext 2.25.0
 */
package persons.tasks3.merger.mdsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import persons.tasks3.merger.ui.internal.MergerActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MergerDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MergerActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MergerActivator activator = MergerActivator.getInstance();
		return activator != null ? activator.getInjector(MergerActivator.PERSONS_TASKS3_MERGER_MDSL_MERGERDSL) : null;
	}

}
