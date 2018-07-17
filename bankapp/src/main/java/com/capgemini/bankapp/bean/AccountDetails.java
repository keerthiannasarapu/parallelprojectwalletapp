package com.capgemini.bankapp.bean;

public class AccountDetails {
	
	
	private double balance;
	private int accountNo;
	private int accountNo2;
	/**
	 * @return the accountNo2
	 */
	public int getAccountNo2() {
		return accountNo2;
	}
	/**
	 * @param accountNo2 the accountNo2 to set
	 */
	public void setAccountNo2(int accountNo2) {
		this.accountNo2 = accountNo2;
	}
	private String branch;
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the accountNo
	 */
	public int getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountDetails [balance=" + balance + ", accountNo=" + accountNo + ", accountNo2=" + accountNo2
				+ ", branch=" + branch + "]";
	}
	
	
	
}
