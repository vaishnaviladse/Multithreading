package com.jspiders.multithreads.BusTicket;

public class Passenger extends Thread {
   Bus bus;

public Passenger(Bus bus) {
	
	this.bus = bus;
}
   @Override
	public void run() {
		bus.sheetAvailble(15);
	}
}
