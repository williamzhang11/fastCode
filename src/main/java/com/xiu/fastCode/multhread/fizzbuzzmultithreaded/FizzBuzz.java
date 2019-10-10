package com.xiu.fastCode.multhread.fizzbuzzmultithreaded;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class FizzBuzz {

	private int n;

	public FizzBuzz(int n) {
		this.n = n;
	}

	Semaphore s1 = new Semaphore(0);
	Semaphore s2 = new Semaphore(0);
	Semaphore s3 = new Semaphore(0);
	Semaphore s4 = new Semaphore(1);

	// printFizz.run() outputs "fizz".3
	public void fizz(Runnable printFizz) throws InterruptedException {

		for (int i = 3; i <= n; i++) {
			// 只能被3整除
			if (i % 3 == 0 && i % 5 != 0) {

				s1.acquire();
				//System.out.println("fizz");
				printFizz.run();
				s4.release();
			}

		}
	}

	// printBuzz.run() outputs "buzz".5
	public void buzz(Runnable printBuzz) throws InterruptedException {

		for (int i = 5; i <= n; i++) {
			// 只能被5整除
			if (i % 3 != 0 && i % 5 == 0) {
				s2.acquire();
				//System.out.println("buzz");
				printBuzz.run();
				s4.release();
			}
		}
	}

	// printFizzBuzz.run() outputs "fizzbuzz".35
	public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
		for (int i = 15; i <= n; i++) {
			// 同时被3和5整除
			if (i % 3 == 0 && i % 5 == 0) {
				s3.acquire();
				//System.out.println("fizzbuzz");
				printFizzBuzz.run();
				s4.release();
			}

		}
	}

	// printNumber.accept(x) outputs "x", where x is an integer.
	public void number(IntConsumer printNumber) throws InterruptedException {

		for (int i = 1; i <= n; i++) {
			
			
			
			if (i % 3 == 0 && i % 5 != 0) {
				s4.acquire();
				s1.release();
				
				continue;
			}
			if (i % 3 != 0 && i % 5 == 0) {
				s4.acquire();
				s2.release();
				continue;
			}

			// 同时被3和5整除
			if (i % 3 == 0 && i % 5 == 0) {
				s4.acquire();
				s3.release();
				continue;
			}
			s4.acquire();
			//System.out.println(i);
			printNumber.accept(i);
			
			s4.release();
		}
	}

}
