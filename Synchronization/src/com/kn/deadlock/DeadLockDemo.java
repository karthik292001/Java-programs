package com.kn.deadlock;

public class DeadLockDemo {

	public static void main(String[] args) {
		Hospital h=new Hospital();
		
		Tom tom=new Tom(h);
		Jerry jerry=new Jerry(h);
		
		Thread t1=new Thread(tom);
		Thread t2=new Thread(jerry);
		
		t1.start();
		t2.start();
	}

}
