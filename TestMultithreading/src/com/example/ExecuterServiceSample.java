package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceSample {

	public static void main(String[] args) throws InterruptedException {
	
		int processorCount= Runtime.getRuntime().availableProcessors();
		System.out.println("Processor Count :"+processorCount);
		//ExecutorService es=Executors.newFixedThreadPool(processorCount);
		ExecutorService es=Executors.newCachedThreadPool();
		
		for(int i=0;i<30;i++)
		{
			es.execute(new MyThreadSimple());	
			Thread.sleep(10000);
			
		}
		System.out.println("Thread Name :" +Thread.currentThread().getName());

	}

}
