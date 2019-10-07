package com.xiu.fastCode.multhread.printinorder;

import java.util.concurrent.CountDownLatch;
//Countdownlatch
public class Foo2 {

		CountDownLatch stage1 = new CountDownLatch(1);
		CountDownLatch stage2 = new CountDownLatch(1);
	
		public void first(Runnable printFirst) throws InterruptedException {
			System.out.println("1");
			stage1.countDown();
		}
	
		public void second(Runnable printSecond) throws InterruptedException {
			stage1.await();
			System.out.println("2");
			stage2.countDown();
		}
	
		public void third(Runnable printThird) throws InterruptedException {
			stage2.await();
			System.out.println("3");
				
			
		}
}
