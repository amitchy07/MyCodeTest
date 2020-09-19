package com.example.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExampleWithWaitAndNotify {

	public static void main(String[] args) {
		
		List<Integer> taskQueue=new ArrayList<>();
		Integer MAX_CAPACITY=3;
		Thread p= new Thread(new Producer(taskQueue, MAX_CAPACITY));
		Thread c=new Thread(new Consumer(taskQueue));
		p.start();
		c.start();
		
		

	}

}
