package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 
		ExecutorService es=Executors.newFixedThreadPool(5);
		Future<Integer> future=es.submit(new CallableFutureSample());
		System.out.println("I am seprate task from future");
		System.out.println("Future is: "+future.get());
		System.out.println("I am seprate task from future");

	}

}
