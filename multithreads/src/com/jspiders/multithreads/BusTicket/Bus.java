package com.jspiders.multithreads.BusTicket;
public class Bus{
	int avaiableTicket;

	public Bus(int avaiableTicket) {
		this.avaiableTicket = avaiableTicket;
	}
	
	public synchronized void sheetAvailble(int noOfTicket) {
		System.out.println("Try to Book Ticket="+noOfTicket);
		if (noOfTicket>avaiableTicket) {
//			System.out.println("Try to book ticket="+noOfTicket);
			System.out.println(noOfTicket+"Sheets are not available");
			System.out.println("Please try again later...!!!! ");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		avaiableTicket-=noOfTicket;
		System.out.println("Ticket is booked="+noOfTicket);
	}
    public synchronized void restoreSheet (int noOfTicket) {
		System.out.println("Ticket are available="+noOfTicket);
		System.out.println("start the booking...!!!");
		avaiableTicket+=noOfTicket;
		this.notify();
	}
}