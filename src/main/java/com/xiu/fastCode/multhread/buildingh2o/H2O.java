package com.xiu.fastCode.multhread.buildingh2o;

import java.util.concurrent.Semaphore;

public class H2O {

	public H2O() {

	}

	Semaphore h = new Semaphore(2);
	Semaphore o = new Semaphore(0);

	public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		h.acquire();
		releaseHydrogen.run();
		//System.out.println("H");
		o.release();
	}

	public void oxygen(Runnable releaseOxygen) throws InterruptedException {
		o.acquire(2);
		releaseOxygen.run();
		//System.out.println("O");
		h.release(2);
	}
}
