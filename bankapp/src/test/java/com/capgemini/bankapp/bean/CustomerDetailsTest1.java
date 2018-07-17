package com.capgemini.bankapp.bean;

import junit.framework.TestCase;

public class CustomerDetailsTest1 extends TestCase {
	CustomerDetails pojotest=new CustomerDetails();
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGetFirstname() {
		pojotest.setFirstname("annasa");
		assertEquals("annasa", "annasa");
		assertNotSame("annasa", " ");
		assertNotSame("annasa", "keerthi");
		
	}

	public void testGetLastname() {
		pojotest.setLastname("annasa");
		assertEquals("annasa", "annasa");
		assertNotSame("annasa", " ");
		assertNotSame("annasa", "keerthi");
	}

	public void testGetAge() {
		pojotest.setAge(54);
		assertEquals(54, 54);
		assertNotSame(54, 12);
		assertNotSame(54, 0);
		
	}

	public void testGetGender() {
		pojotest.setGender("male");
		assertEquals("male", "male");
		assertEquals("female", "female");
		assertNotSame("male", "female");
		assertNotSame("male", " ");
	}

	public void testGetUsername() {
		pojotest.setUsername("annasa");
		assertEquals("annasa", "annasa");
		assertNotSame("annasa", " ");
		assertNotSame("annasa", "keerthi");
	}

	public void testGetPassword() {
		pojotest.setPassword("annasa");
		assertEquals("annasa", "annasa");
		assertNotSame("annasa", " ");
		assertNotSame("annasa", "keerthi");
	}

	public void testGetAddress() {
		pojotest.setAddress("hyd");
		assertEquals("hyd", "hyd");
		assertNotSame("hyd", " ");
		assertNotSame("hyd", "warangal");
	
	}

	public void testGetPhonenumber() {
		pojotest.setPhonenumber(1234567894);
		assertEquals(1234567894, 1234567894);
		assertNotSame(1232323456, 1223456567);
		assertNotSame(1234567821, 0);
	}

	public void testGetAadharcardNumber() {
		pojotest.setAadharcardNumber(1234567894);
		assertEquals(1234567894, 1234567894);
		assertNotSame(1232323456, 1223456567);
		assertNotSame(1234567821, 0);
	}

	
}
