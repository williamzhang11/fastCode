package com.xiu.fastCode.multhread.printfoobaralternately;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FooBar {
	private int n;

	public FooBar(int n) {
		this.n = n;
	}

	Lock lock = new ReentrantLock();
	Condition condition1 = lock.newCondition();
	Condition condition2 = lock.newCondition();
	volatile Integer flag = 1;

	public void foo(Runnable printFoo) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			lock.lock();
			try {
				while (flag != 1) {
					condition1.await();
				}
				System.out.println("foo");
				//printFoo.run();
				flag = 2;
				condition2.signal();
			} finally {

				lock.unlock();
			}

		}

	}

	public void bar(Runnable printBar) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			lock.lock();
			try {
				while (flag != 2) {
					condition2.await();
				}

				System.out.println("bar");
				//printBar.run();
				flag = 1;
				condition1.signal();
			} finally {

				lock.unlock();
			}

		}
	}
}
