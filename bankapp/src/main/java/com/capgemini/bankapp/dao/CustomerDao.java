package com.capgemini.bankapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bankapp.bean.CustomerDetails;

public class CustomerDao implements ICustomerDao{
	List<CustomerDetails> list=new ArrayList<CustomerDetails>();

	public boolean addCustomerDetails(CustomerDetails pojocust) {
		// TODO Auto-generated method stub
		list.add(pojocust);
		
		return false;
	}

	
}
