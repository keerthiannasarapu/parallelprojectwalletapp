package com.capgemini.bankapp.service;

import com.capgemini.bankapp.bean.CustomerDetails;
import com.capgemini.bankapp.dao.CustomerDao;

public class CustomerService implements ICustomerService{
	CustomerDao custDao=new CustomerDao();

	public boolean addCustomerDetails(CustomerDetails pojocust) {
		// TODO Auto-generated method stub
		return custDao.addCustomerDetails(pojocust);
	}

}
