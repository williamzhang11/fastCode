package com.xiu.fastCode.multhread.printzeroevenodd;

public class Solution1 {

	public static void main(String[] args) {
		
		final ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(3);		
		
		new Thread(new Runnable() {

			public void run() {
				try {
					zeroEvenOdd.zero(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					zeroEvenOdd.odd(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {
			
			public void run() {
				try {
					zeroEvenOdd.even(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}
}
