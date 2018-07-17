package com.capgemini.bankapp.service;

import com.capgemini.bankapp.bean.AccountDetails;
import com.capgemini.bankapp.dao.AccountDao;

public class AccountService implements IAccountService{
	
	AccountDao accDao=new AccountDao();

	public double showBalance() {
		// TODO Auto-generated method stub
		return accDao.showBalance();
	}

	public double withdrawAmount(Double amount) {
		// TODO Auto-generated method stub
		return accDao.withdrawAmount(amount);
	}

	public double depositAmount(double balance) {
		// TODO Auto-generated method stub
		return accDao.depositAmount(balance);
	}

	public void fundTransfer(int acc2,double amt) {
		// TODO Auto-generated method stub
		accDao.fundTransfer(acc2, amt);
	}

	public void printTransaction() {
		// TODO Auto-generated method stub
	accDao.printTransaction();
	}

	public boolean addAccountDetails(AccountDetails pojoacc) {
		// TODO Auto-generated method stub
		return accDao.addAccountDetails(pojoacc);
	}

	

}
