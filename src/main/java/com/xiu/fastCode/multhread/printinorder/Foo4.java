package com.xiu.fastCode.multhread.printinorder;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//CyclicBarrier
public class Foo4 {

	CyclicBarrier cb1 = new CyclicBarrier(2);
	CyclicBarrier cb2 = new CyclicBarrier(2);

	public void first(Runnable printFirst) throws InterruptedException {
		System.out.println("1");
		try {
			cb1.await();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

	public void second(Runnable printSecond) throws InterruptedException {

		try {
			cb1.await();
			System.out.println("2");
			cb2.await();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

	public void third(Runnable printThird) throws InterruptedException {

		try {
			cb2.await();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("3");

	}
}
