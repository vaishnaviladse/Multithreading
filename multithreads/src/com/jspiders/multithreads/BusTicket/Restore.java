package com.jspiders.multithreads.BusTicket;

public class Restore extends Thread {
    Bus bus;

	public Restore(Bus bus) {
		this.bus = bus;
	}
     @Override
    public void run() {
    	bus.restoreSheet(50);
    }
}
