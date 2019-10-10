package com.xiu.fastCode.multhread.printzeroevenodd;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class ZeroEvenOdd2 {

	private int n;

	public ZeroEvenOdd2(int n) {
		this.n = n;
	}

    Lock lock = new ReentrantLock();
    Condition z = lock.newCondition();
    Condition num = lock.newCondition();
    volatile boolean zTurn = true;
    volatile int zIndex = 0;

	public void zero(IntConsumer printNumber) throws InterruptedException {

		for(;zIndex<n;) {
            lock.lock();
            try {
        	while(!zTurn) {
        		z.await();
        	}
        	//printNumber.accept(0);
        	System.out.println(0);
        	zTurn = false;
        	num.signalAll();
                zIndex++;
            }finally {
        	lock.unlock();
            }
        }

	}

	// 偶数
	public void even(IntConsumer printNumber) throws InterruptedException {

		for(int i=2; i<=n; i+=2) {
            lock.lock();
            try {
        	while(zTurn || (zIndex&1)==1) {
        		num.await();
        	}
        	//printNumber.accept(i);
        	System.out.println(i);
        	zTurn = true;
        	z.signal();
            }finally {
        	lock.unlock();
            }
        }
	}

	// 奇数
	public void odd(IntConsumer printNumber) throws InterruptedException {

		for(int i=1; i<=n; i+=2) {
            lock.lock();
            try {
        	while(zTurn || (zIndex&1)==0) {
        		num.await();
        	}
        	//printNumber.accept(i);
        	System.out.println(i);
        	zTurn = true;
        	z.signal();
            }finally {
        	lock.unlock();
            }
        }
	}
}
