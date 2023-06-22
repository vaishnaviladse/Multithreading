package com.jspiders.multithreads.Resource;


public class Person1 extends Thread{
	
	Account account;
	
	
 public Person1(Account account) {
		
		this.account = account;
	}


@Override
public synchronized void run() {
	account.depositeAmount(5000);
	account.WithdrawalAmount(3000);
}

}
