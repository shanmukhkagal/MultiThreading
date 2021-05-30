package com.multithread;

public class CharThread extends Thread{
	public void run() {
		for (char i = 65; i <= 90; i++) {
		System.out.println(i);
		try {
			sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}
