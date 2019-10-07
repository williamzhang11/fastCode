package com.xiu.fastCode.multhread.printinorder;

//Semaphore
import java.util.concurrent.Semaphore;
public class Foo3 {

		Semaphore state1 = new Semaphore(1);
		Semaphore state2 = new Semaphore(0);
		Semaphore state3 = new Semaphore(0);
	
	
		public void first(Runnable printFirst) throws InterruptedException {
			state1.acquire();
			System.out.println("1");
			state2.release();
		}
	
		public void second(Runnable printSecond) throws InterruptedException {
			state2.acquire();
			System.out.println("2");
			state3.release();
		}
	
		public void third(Runnable printThird) throws InterruptedException {
			state3.acquire();
			System.out.println("3");
				
			
		}
}
