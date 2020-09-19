package com.example;

public class MyThreadSimple implements Runnable {
	
	public void run()
	{
		try {			
			System.out.println("I am :" +Thread.currentThread().getName() );
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
