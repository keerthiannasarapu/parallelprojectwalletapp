package com.capgemini.bankapp.bean;

import junit.framework.TestCase;

public class AccountDetailsTest extends TestCase {
AccountDetails acctest =new AccountDetails();
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGetAccountNo2() {
	acctest.setAccountNo2(1234);
	assertEquals(1234, 1234);
	assertNotSame(1234, 4567);
	assertNotSame(123, 0);
	}

	public void testGetAccountNo() {
		acctest.setAccountNo2(1234);
		assertEquals(1234, 1234);
		assertNotSame(1234, 4567);
		assertNotSame(123, 0);
		}
		
	

	public void testGetBranch() {
		acctest.setBranch("hyd");
		assertEquals("hyd", "hyd");
		assertNotSame("hyd", " ");
		assertNotSame("hyd", "warangal");
	
	}

}
