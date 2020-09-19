package com.example;

public class MainMathClass {
	
	public static void main(String[] args) {
		MathClass mc=new MathClass();
		
		Runnable r=new Runnable() {			
			@Override
			public void run() {
				try {
					mc.printNumber(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		};
		
		new Thread(r,"One").start();
		new Thread(r,"Two").start();
		new Thread(r,"Three").start();
		new Thread(r,"Four").start();
		new Thread(r,"Five").start();
	}

}
