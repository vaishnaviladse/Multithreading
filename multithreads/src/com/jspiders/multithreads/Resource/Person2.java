package com.jspiders.multithreads.Resource;

public class Person2 extends Thread{
 Account account;
 
	public Person2(Account account) {
	this.account = account;
}

	@Override
	public synchronized void run() {
	account.depositeAmount(3000);
	account.WithdrawalAmount(1500);
	}
}
