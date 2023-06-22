package com.jspiders.multithreads.Resource;

public class Account {
   int accountBalence;

public Account(int accountBalence) {
	super();
	this.accountBalence = accountBalence;
}
  public void checkAmount() {
  System.out.println("The Current Balance is=" + accountBalence);
}
  public void depositeAmount(int amount) {
	  accountBalence += amount;
	  System.out.println("Balance added Successfully=" + amount);
	  checkAmount();
	
}
  public void WithdrawalAmount(int amount) {
	  if(accountBalence>amount) {
		System.out.println("The amount is withdrawal Successfully=" + amount);
		accountBalence -=amount;
		 checkAmount();
	}else {
		System.out.println("Insufficient Balance");
	}
	
}
}
