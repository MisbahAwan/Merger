/*
 * generated by Xtext 2.25.0
 */
package persons.tasks3.merger.mdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MergerDslStandaloneSetup extends MergerDslStandaloneSetupGenerated {

	public static void doSetup() {
		new MergerDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		
	}
}