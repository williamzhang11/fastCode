package com.xiu.fastCode.multhread.fizzbuzzmultithreaded;

public class Solution1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		final FizzBuzz foo = new FizzBuzz(15);
		
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					foo.buzz(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					foo.fizz(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {
			
			public void run() {
				try {
					foo.fizzbuzz(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					foo.number(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		

		

		
		

		

	
		
		

		



		



	}
}
