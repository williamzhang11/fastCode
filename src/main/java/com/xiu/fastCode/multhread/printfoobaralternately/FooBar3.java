package com.xiu.fastCode.multhread.printfoobaralternately;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class FooBar3 {
	private int n;

	public FooBar3(int n) {
		this.n = n;
	}

    Semaphore foo = new Semaphore(1);
    Semaphore bar = new Semaphore(0);
	
	
	public void foo(Runnable printFoo) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			foo.acquire();
			System.out.println("foo");
			bar.release();

		}
	}

	public void bar(Runnable printBar) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			
			bar.acquire();
			System.out.println("bar");
			foo.release();
		}
	}
}
