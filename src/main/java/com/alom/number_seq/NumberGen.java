package com.alom.number_seq;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NumberGen {

	private int number = 1;
	private int noOfthreads ;
	private int seqTill;
	
	public NumberGen(int noOfthreads, int seqTill) {
		this.noOfthreads = noOfthreads;
		this.seqTill = seqTill;
	}
	
	public void printNumber(int thread) {
		synchronized(this) {
			while(number<seqTill-1) {
				while(number % noOfthreads != thread) {
					try {
						wait();
					} catch (InterruptedException e) {
						log.debug("exception occured in number generator");
					}
				}
				
				System.out.println(Thread.currentThread().getName() + " : " + number++);
				notifyAll();
			}
		}
	}
	
}
