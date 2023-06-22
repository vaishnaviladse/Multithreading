package com.jspiders.multithreads.deadlock;

public class Prajwal extends Thread {
    FirstResource firstResource;

	public Prajwal(FirstResource firstResource) {
		
		this.firstResource = firstResource;
	}
	@Override
	public void run() {
		synchronized (firstResource.Key) {
			System.out.println(this.getName()+" is not giving the "+firstResource.Key);
			synchronized (firstResource.Bike) {
				System.out.println(this.getName()+"is not giving the "+ firstResource.Bike);
				
			}
			System.out.println(this.getName()+"Released "+firstResource.Bike);
		}
		System.out.println(this.getName()+"Released "+firstResource.Key);
	}
    
}
