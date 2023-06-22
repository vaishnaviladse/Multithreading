package com.jspiders.multithreads.main;

import com.jspiders.multithreads.Resource.MyResource;
import com.jspiders.multithreads.thread.ThreadR;
import com.jspiders.multithreads.thread.ThreadR1;

public class DeadlockMain {
 public static void main(String[] args) {
	 MyResource myResource=new MyResource();
	 ThreadR threadR=new ThreadR(myResource);
	 threadR.setName("T1");
	 ThreadR1 threadR1=new ThreadR1(myResource);
	 threadR1.setName("T2");
	    
	 threadR.start();
	 threadR1.start();
	 
} 
  
}
