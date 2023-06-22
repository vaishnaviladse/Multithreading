package com.jspiders.multithreadsAccountmain;

import com.jspiders.multithreads.Resource.Account;
import com.jspiders.multithreads.Resource.Person1;
import com.jspiders.multithreads.Resource.Person2;

public class Accountmain {
    public static void main(String[] args) {
		Account account=new Account(10000);
        
		Person1 person1=new Person1(account);
		Person2 person2=new Person2(account);
		
		person1.start();
		person2.start();
		
	}
}
