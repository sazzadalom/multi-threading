package com.alom.number_seq;

/*
 * @author sazzad.alom
 * @since October, 2026
 * version 1.0.0
 * 
 * Write a Java program to print a sequence of numbers up to N using 3 threads.
 * For example, if we want to print a sequence of numbers up to 10 then it will look like this:
 * Thread-1 : 1
 * Thread-2 : 2
 * Thread-3 : 3
 * Thread-1 : 4
 * Thread-2 : 5
 * Thread-3 : 6
 * Thread-1 : 7
 * Thread-2 : 8
 * Thread-3 : 9
 * Thread-1 : 10
 * */


public class NumberExecutor implements Runnable {

	private int thread;
	private NumberGen numberGen;
	
	public NumberExecutor(int thread, NumberGen numberGen) {
		this.thread = thread;
		this.numberGen = numberGen;
	}
	
	@Override
	public void run() {
		numberGen.printNumber(thread);
	}

}
