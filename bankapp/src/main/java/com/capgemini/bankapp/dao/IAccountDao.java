package com.capgemini.bankapp.dao;

import com.capgemini.bankapp.bean.AccountDetails;

public interface IAccountDao {
	public boolean addAccountDetails(AccountDetails pojoacc);
	public double showBalance();
	public double withdrawAmount(Double amount);
	public double depositAmount(double balance);
	public void fundTransfer(int acc2,double amt);
	public void printTransaction();

}
