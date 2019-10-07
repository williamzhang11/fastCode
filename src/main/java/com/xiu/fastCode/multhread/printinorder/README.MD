# Print in Order(按序打印) 

[leetcode1114]( https://leetcode-cn.com/problems/print-in-order/)

思路：

目的：不管多个线程启动顺序如何，其方法执行顺序是一致的"onetwothree"。

这是一个典型的执行屏障问题，可以通过构造屏障实现。

可以构造2道屏障，B线程等待A屏障，C线程等待B屏障。

A线程会释放A屏障，B线程释放B屏障

可以利用线程同步机制实现执行屏障:

5种解法：

第一种：ReentranctLock(管程模型：让线程独占临界区)
第二种：Countdownlatch（用于一个线程等待多个线程的场景）
第三种：Semaphore（信号量模型：让多个线程共享临界区）
第四种：CyclicBarrier（用于多个线程之间互相等待的场景）
第五种：无锁



https://zhuanlan.zhihu.com/p/81626432
