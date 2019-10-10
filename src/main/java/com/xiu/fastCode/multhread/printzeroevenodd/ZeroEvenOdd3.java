package com.xiu.fastCode.multhread.printzeroevenodd;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class ZeroEvenOdd3 {

	private int n;

	public ZeroEvenOdd3(int n) {
		this.n = n;
	}

	Semaphore z = new Semaphore(1);
	Semaphore e = new Semaphore(0);
	Semaphore o = new Semaphore(0);

	public void zero(IntConsumer printNumber) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			z.acquire();
			System.out.println(0);
			if ((i & 1) == 0) {
				o.release();
			} else {
				e.release();
			}
		}
	}

	public void even(IntConsumer printNumber) throws InterruptedException {
		for (int i = 2; i <= n; i += 2) {
			e.acquire();
			System.out.println(i);
			z.release();
		}
	}

	public void odd(IntConsumer printNumber) throws InterruptedException {
		for (int i = 1; i <= n; i += 2) {
			o.acquire();
			System.out.println(i);
			z.release();
		}
	}
}
