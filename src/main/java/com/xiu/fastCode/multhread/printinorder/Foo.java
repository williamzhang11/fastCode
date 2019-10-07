package com.xiu.fastCode.multhread.printinorder;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {

	ReentrantLock lock = new ReentrantLock();
	Condition aCondition = lock.newCondition();
	Condition bCondition = lock.newCondition();
	Condition cCondition = lock.newCondition();
	private volatile String flag = "one";

	public Foo() {
	}

	public void first(Runnable printFirst) throws InterruptedException {

		lock.lock();
		
		try {

		while (!"one".equals(flag)) {
			aCondition.await();
		}

		//printFirst.run();
		System.out.println("one");
		flag = "two";
		bCondition.signal();
		}finally {
			
			lock.unlock();
		}

	}

	public void second(Runnable printSecond) throws InterruptedException {
		lock.lock();
		
		try {
			
			while (!"two".equals(flag)) {
				bCondition.await();

			}
			System.out.println("two");
			//printSecond.run();
			flag = "three";
			cCondition.signal();
		}finally {
			lock.unlock();
			
		}
		

	}

	public void third(Runnable printThird) throws InterruptedException {
		
		lock.lock();
		
		try {
			while (!"three".equals(flag)) {
				cCondition.await();
			}
			System.out.println("three");
			//printThird.run();
			flag = "one";
			aCondition.signal();
			
		}finally {
			lock.unlock();
		}
		
	}
}
