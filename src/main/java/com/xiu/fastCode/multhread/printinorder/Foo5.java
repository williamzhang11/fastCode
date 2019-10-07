package com.xiu.fastCode.multhread.printinorder;

//CyclicBarrier
public class Foo5 {

	volatile int stage = 1;

	public void first(Runnable printFirst) throws InterruptedException {
		System.out.println("1");
		stage = 2;
	}

	public void second(Runnable printSecond) throws InterruptedException {

		while (stage != 2)
			;
		System.out.println("2");
		stage = 3;

	}

	public void third(Runnable printThird) throws InterruptedException {
		while (stage != 3)
			;
		System.out.println("3");

	}
}
