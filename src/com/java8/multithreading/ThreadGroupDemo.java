/**
 * 
 */
package com.java8.multithreading;

/**
 * @author KowlutlaSwamy
 *
 */
public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup().getParent();
		Thread[] activeThreads = new Thread[threadGroup.activeCount()];
		threadGroup.enumerate(activeThreads);
		
		for (Thread t : activeThreads) {
			System.out.println(t);
		}
		
	}
	/**
	 * 	Thread[Reference Handler,10,system]
      Thread[Finalizer,8,system]
      Thread[Signal Dispatcher,9,system]
      Thread[Attach Listener,5,system]
      Thread[Notification Thread,9,system]
      Thread[main,5,main]
      Thread[Common-Cleaner,8,InnocuousThreadGroup]
	 */
}
