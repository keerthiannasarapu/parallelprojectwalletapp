package com.capgemini.bankapp.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.capgemini.bankapp.bean.AccountDetails;

public class AccountDao implements IAccountDao{
	
	List<AccountDetails> list=new ArrayList();
	List< String> list2=new ArrayList<String>();
	
	
AccountDetails pojoacc=new AccountDetails();

	public double showBalance() {
		// TODO Auto-generated method stub
		Iterator it=list.iterator();
		while (it.hasNext()) {
			AccountDetails pojo = (AccountDetails) it.next();
			System.out.println("the amount you have is " +pojo.getBalance());
			
		}
		return 0;
	}

	public double withdrawAmount(Double amount) {
		double bal;
		// TODO Auto-generated method stub
		Iterator it=list.iterator();
		while (it.hasNext()) {
			AccountDetails pojo = (AccountDetails) it.next();
			 bal=pojo.getBalance();
			 bal=bal-amount;
			 pojo.setBalance(bal);
			 
			System.out.println("the remaining balance is"+bal);
		
			System.out.println(pojo.getBalance());
			
			
			
		}
		list2.add("the amount debited is"+amount+"on "+LocalDate.now());
		return 0.0;
	}

	public double depositAmount(double balance) {
		// TODO Auto-generated method stub
		double bal1;
		Iterator it=list.iterator();
		while (it.hasNext()) {
			AccountDetails pojo = (AccountDetails) it.next();
			bal1=pojo.getBalance();
			bal1=bal1+balance;
			pojo.setBalance(bal1);
			System.out.println("the remaining balance is"+bal1);
			
		}
		list2.add("the amount credited is"+balance+"on"+LocalDate.now());
		return 0;
	}

	public void fundTransfer(int acc2,double amt) {
		// TODO Auto-generated method stub
		double bal2;
		Iterator it=list.iterator();
		while (it.hasNext()) {
			AccountDetails pojo = (AccountDetails) it.next();
			bal2=pojo.getBalance();
			bal2=bal2-amt;
			pojo.setBalance(bal2);
			System.out.println("the amount after transfering is"+bal2);
		
		}	
		list2.add("the amount transferd to accountNo"+acc2+", and the amount is"+amt+"on"+LocalDate.now());
		 
	}

	public void printTransaction() {
		// TODO Auto-generated method stub
		System.out.println(list2);
	}

	public boolean addAccountDetails(AccountDetails pojoacc) {
		// TODO Auto-generated method stub
		list.add(pojoacc);
		return false;
	}
	
	

}
