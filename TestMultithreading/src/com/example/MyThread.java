package com.example;

public class MyThread  implements Runnable   {
	
	private int count;

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			processingSomething(i);
			count++;
		}		
	}
	
	private void processingSomething(int i) {
		 try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	public int getCount()
	{
		
		return this.count;
		
	}

}
