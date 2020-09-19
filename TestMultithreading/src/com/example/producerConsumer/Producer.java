package com.example.producerConsumer;

import java.util.List;

public class Producer implements Runnable {
	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;

	public Producer(List<Integer> taskQueue, int MAX_CAPACITY) {
		this.taskQueue = taskQueue;
		this.MAX_CAPACITY = MAX_CAPACITY;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			try {
				produce(count++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void produce(int i) throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Queue is full Current Thread -> " + Thread.currentThread().getName());
				taskQueue.wait();
			}

			Thread.sleep(5000);
			taskQueue.add(i);
			System.out.println("Produced : " + i);
			taskQueue.notifyAll();
		}

	}

}
