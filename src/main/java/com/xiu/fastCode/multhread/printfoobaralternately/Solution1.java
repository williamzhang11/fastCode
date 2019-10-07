package com.xiu.fastCode.multhread.printfoobaralternately;

public class Solution1 {

	public static void main(String[] args) throws InterruptedException {

		final FooBar foo = new FooBar(10);

		new Thread(new Runnable() {

			public void run() {
				try {
					foo.foo(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {

			public void run() {
				try {
					foo.bar(null);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

	}
}
