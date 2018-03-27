/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author 胡建明
 *
 * 2018年2月6日上午8:50:40
 */
public class MyThread implements Runnable{

		public static void main(String[] args) {
			
			
			 MyThread thread1 = new MyThread();
			 MyThread thread2 = new MyThread();
			 MyThread thread3 = new MyThread();
			 MyThread thread4 = new MyThread();
			 MyThread thread5 = new MyThread();
			 MyThread thread6 = new MyThread();
			 MyThread thread7 = new MyThread();
			 MyThread thread8 = new MyThread();
			 MyThread thread9 = new MyThread();
			 MyThread thread10 = new MyThread();
			 
			 
			 Thread thread11 = new Thread(thread1);
			 Thread thread22 = new Thread(thread2);
			 Thread thread33 = new Thread(thread3);
			 Thread thread44 = new Thread(thread4);
			 Thread thread55 = new Thread(thread5);
			 Thread thread66 = new Thread(thread6);
			 Thread thread77 = new Thread(thread7);
			 Thread thread88 = new Thread(thread8);
			 Thread thread99 = new Thread(thread9);
			 Thread thread101 = new Thread(thread10);
			 
			 
			 thread11.start();
			 thread22.start();
			 thread33.start();
			 thread44.start();
			 thread55.start();
			 thread66.start();
			 thread77.start();
			 thread88.start();
			 thread99.start();
			 thread101.start();
			 
		}
		
	@Override
	public void run() {
			System.out.println("开启了一个线程");
	}

}
