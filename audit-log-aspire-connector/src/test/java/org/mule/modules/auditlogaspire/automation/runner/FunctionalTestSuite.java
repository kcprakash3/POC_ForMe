package org.mule.modules.auditlogaspire.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.auditlogaspire.automation.functional.GetCompanyTestCases;
import org.mule.modules.auditlogaspire.automation.functional.GreetTestCases;
import org.mule.modules.auditlogaspire.AuditLogAspireConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({ GetCompanyTestCases.class, GreetTestCases.class })
public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite() {
		ConnectorTestContext.initialize(AuditLogAspireConnector.class);
	}

	@AfterClass
	public static void shutdownSuite() {
		ConnectorTestContext.shutDown();
	}

}