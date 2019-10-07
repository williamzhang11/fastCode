package com.xiu.fastCode.multhread.printfoobaralternately;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FooBar2 {
	private int n;

	public FooBar2(int n) {
		this.n = n;
	}

	
	public void foo(Runnable printFoo) throws InterruptedException {

		for (int i = 0; i < n; i++) {
				System.out.println("foo");
				//printFoo.run();

		}

	}

	public void bar(Runnable printBar) throws InterruptedException {

		for (int i = 0; i < n; i++) {

				System.out.println("bar");
				//printBar.run();
		}
	}
}
