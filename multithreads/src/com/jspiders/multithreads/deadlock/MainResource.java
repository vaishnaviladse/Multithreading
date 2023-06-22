package com.jspiders.multithreads.deadlock;


public class MainResource {
  public static void main(String[] args) {
	FirstResource firstResource=new FirstResource();
	
	Jayesh jayesh=new Jayesh(firstResource);
	jayesh.setName("Prajwal ");
	Prajwal prajwal=new Prajwal(firstResource);
	prajwal.setName("Jayesh ");
	
	
	
    jayesh.start();
    prajwal.start();
}
}
