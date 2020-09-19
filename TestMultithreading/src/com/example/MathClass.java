package com.example;

public class MathClass {

	synchronized void printNumber(Integer n) throws InterruptedException {
		

			for (Integer i = 0; i < n; i++) {
				System.out.println("Thread is :" + Thread.currentThread().getName() + ": " + i);
				Thread.sleep(2000);
			}
		}
	

}
