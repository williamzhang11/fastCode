package com.xiu.fastCode.multhread.printinorder;

public class Solution1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		final Foo5 foo = new Foo5();
		
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					foo.third(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					foo.second(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {
			
			public void run() {
				try {
					foo.first(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		

		

		
		

		

	
		
		

		



		



	}
}
