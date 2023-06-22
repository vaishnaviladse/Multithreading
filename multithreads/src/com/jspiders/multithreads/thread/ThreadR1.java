package com.jspiders.multithreads.thread;

import com.jspiders.multithreads.Resource.MyResource;

public class ThreadR1 extends Thread {
	
		
		   MyResource resource;

		public ThreadR1(MyResource resource) {
			
			this.resource = resource;
		}
		   @Override
			public void run() {
				synchronized (resource.resource1) {
					System.out.println(this.getName()+"Locked"+resource.resource1);
					synchronized (resource.resource2) {
						System.out.println(this.getName()+"Locked"+resource.resource2);
					}
					System.out.println(this.getName()+"released"+ resource.resource2);
				}
				System.out.println(this.getName()+"released" + resource.resource1);
			}
		}

