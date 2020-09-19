package com.example;

public class TestMultithreding {

	public static void main(String[] args) throws InterruptedException {
		
	   MyThreadSimple mts=new MyThreadSimple();
	   for(int i=0;i<10;i++)
	   {
		   Thread thread=new Thread(mts);
		   thread.start();
		  // thread.sleep(100);
		   
	   }
	   
	  
	}

}
