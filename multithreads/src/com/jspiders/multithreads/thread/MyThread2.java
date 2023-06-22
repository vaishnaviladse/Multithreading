package com.jspiders.multithreads.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("Name of thread:" +Thread.currentThread().getName());
		System.out.println("Priority of thread:" +Thread.currentThread().getPriority());
		
	}
		
	}
}
    