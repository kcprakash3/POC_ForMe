package org.mule.modules.auditlogaspire.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.auditlogaspire.AuditLogAspireConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class GetCompanyTestCases extends
		AbstractTestCase<AuditLogAspireConnector> {

	public GetCompanyTestCases() {
		super(AuditLogAspireConnector.class);
	}

	@Before
	public void setup() {
		// TODO
	}

	@After
	public void tearDown() {
		// TODO
	}

	@Test
	public void verify() {
		java.lang.String expected = null;
		java.lang.String friend = null;
		java.lang.String company = null;
		assertEquals(getConnector().getCompany(friend, company), expected);
	}

}