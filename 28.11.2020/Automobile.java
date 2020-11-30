package com.thirdware.thread;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class Automobile {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<>();

        Thread thread1 = new StringThread(list, "HELLO");
        thread1.start();

        Thread thread2 = new StringThread(list, "WORLD");
        thread2.start();

        thread1.join();
        thread2.join();
       
        Thread thread3 = new StringThread(list, "HELLO");
        thread3.start();

        Thread thread4 = new StringThread(list, "WORLD");
        thread4.start();
        thread3.join();
        thread4.join();
	} 
}
