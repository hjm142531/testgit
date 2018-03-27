/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author 胡建明
 *
 * 2018年2月5日下午7:41:26
 */
public class ThreadTest implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("开启了一个线程");
	}

}
