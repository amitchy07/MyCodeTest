package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMyThread implements Runnable {
	
	private AtomicInteger count=new AtomicInteger();

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			count.incrementAndGet();
		}
		
	}
	
	public int getAtomicInt()
	{
		return this.count.get();
	}
	
	private void processingSomething(int i) {
		 try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
