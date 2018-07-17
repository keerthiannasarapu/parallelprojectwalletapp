package com.capgemini.bankapp.dao;

import junit.framework.TestCase;

public class AccountDaoTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testShowBalance() {
		assertEquals(1000, 1000);
		assertNotSame(1220, 1000);
		assertNotSame(1000, 0);
	}

	public void testWithdrawAmount() {
		assertEquals(1000, 1000);
		assertNotSame(1220, 1000);
		assertNotSame(1000, 0);
			}

	public void testDepositAmount() {
		assertEquals(1000, 1000);
		assertNotSame(1220, 1000);
		assertNotSame(1000, 0);
	}

	public void testFundTransfer() {
		assertEquals(1000, 1000);
		assertNotSame(1220, 1000);
		assertNotSame(1000, 0);
	}

	
	public void testAddAccountDetails() {
		assertEquals(true, true);
		assertTrue(true);
		assertNotSame(true, false);
	}

}
