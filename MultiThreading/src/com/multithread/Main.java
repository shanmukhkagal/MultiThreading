package com.multithread;

public class Main {
	
	public static void main(String[] args) {
		CharThread charThread = new CharThread();
		
		Thread numberThread = new Thread(new NumThread());
		charThread.start();
		numberThread.start();
		
		charThread.setDaemon(true);
		
	}
}
