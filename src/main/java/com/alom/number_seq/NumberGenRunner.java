package com.alom.number_seq;


public class NumberGenRunner {

	private static final int NUMBER_OF_THREADS = 3;
	private static final int PRINT_SEQUENCE_END = 10;
	
	public static void test() throws InterruptedException {
		NumberGen numberGen = new NumberGen(NUMBER_OF_THREADS,PRINT_SEQUENCE_END);
		
		Thread t = new Thread(new NumberExecutor(1,numberGen),"Thread-1");
		Thread tt = new Thread(new NumberExecutor(2,numberGen),"Thread-2");
		Thread ttt = new Thread(new NumberExecutor(0,numberGen),"Thread-3");
		t.start();
		tt.start();
		ttt.start();
		
		t.join();
		tt.join();
		ttt.join();
	}

}
