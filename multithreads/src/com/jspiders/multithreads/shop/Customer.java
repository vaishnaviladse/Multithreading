
package com.jspiders.multithreads.shop;

public class Customer extends Thread {
     Shop shop;
     public Customer(Shop shop) {
		this.shop=shop;
	}
     @Override
    public void run() {
    	shop.orderProducts(10);
    }
     
}
