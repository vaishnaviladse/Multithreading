package com.jspiders.multithreads.BusTicket;

public class Busmain {
 public static void main(String[] args) {
	Bus bus=new Bus(9);
    Passenger passenger=new Passenger(bus);
    Restore restore=new Restore(bus);
    
    
    passenger.start();
    restore.start();
}
}
