package com.example.producerConsumer;

import java.util.List;

public class Consumer implements Runnable {
	
	private final List<Integer> taskQueue;
	
	public Consumer(List<Integer> taskQueue)
	{
		this.taskQueue=taskQueue;
	}

	@Override
	public void run() {
		while (true)
		{
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private void consume() throws InterruptedException {
		
		synchronized (taskQueue) {
			while(taskQueue.isEmpty())
			{
				System.out.println("Queue is Empty Current Thread :"+Thread.currentThread().getName());
				taskQueue.wait();
			}
			
			Thread.sleep(5000);
			int i=taskQueue.remove(0);
			System.out.println("Consumed :"+i);
			taskQueue.notifyAll();		
			
		}
		
	}

}
