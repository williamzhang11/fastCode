package com.xiu.fastCode.multhread.printfoobaralternately;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FooBar2 {
	private int n;

	public FooBar2(int n) {
		this.n = n;
	}

	CyclicBarrier cyclicBarrier1 = new CyclicBarrier(2);
	
	volatile boolean fin = true;
	
	public void foo(Runnable printFoo) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			
			while (!fin);
			
			System.out.println("foo");
			fin =false;
			try {
				cyclicBarrier1.await();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//printFoo.run();

		}
	}

	public void bar(Runnable printBar) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			
			try {
				cyclicBarrier1.await();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				System.out.println("bar");
				fin = true;
				//printBar.run();
		}
	}
}
