package com.jspiders.multithreads.shop;

public class Shopmain {
     public static void main(String[] args) {
		Shop shop=new Shop(5);
		Customer customer=new Customer(shop);
		Supplier supplier= new Supplier(shop);
		customer.start();
		supplier.start();
		
	}
}
