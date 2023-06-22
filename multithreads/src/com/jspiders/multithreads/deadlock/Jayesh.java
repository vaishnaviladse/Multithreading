package com.jspiders.multithreads.deadlock;

public class Jayesh extends Thread {
      FirstResource firstResource;

	public Jayesh(FirstResource firstResource) {
		
		this.firstResource = firstResource;
	}
	@Override
	public void run() {
		synchronized (firstResource.Bike) {
			System.out.println(this.getName()+"is not giving the  "+ firstResource.Bike);
			synchronized (firstResource.Key) {
				System.out.println(this.getName()+" is not giving the "+ firstResource.Key);
			}
			System.out.println(this.getName()+"Released "+firstResource.Key);
		}
		System.out.println(this.getName()+"Released "+ firstResource.Bike);
	}
      
}
