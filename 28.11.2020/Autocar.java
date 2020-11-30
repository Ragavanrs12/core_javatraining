package com.thirdware.thread;

public class Autocar {




	int qty = 5000;//initial Qty

	synchronized void Deliver(int qty) {
		System.out.println("car manufacturing started..");

		if (this.qty < qty) {
			System.out.println("Short of "+(qty-this.qty)+" Units ");
			try {
				System.out.println("waiting for manufacturing...");
				wait();
				
			} catch (Exception e) {
				
			}
		}
		this.qty -= qty;
		System.out.println("Delivery completed...");
	}

	synchronized void Manufacture(int qty) {
		System.out.println("Manufacturing Started...");
		this.qty += qty;
		System.out.println("Manufacturing completed... ");
		notify();
	}

	public static void main(String args[]) {
		Autocar c = new Autocar();
		new Thread() {
			public void run() {
				c.Deliver(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.Manufacture(10000);
			}
		}.start();

	}

}