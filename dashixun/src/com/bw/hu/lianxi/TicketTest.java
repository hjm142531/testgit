/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.HashMap;

/**
 * @author 胡建明
 *
 * 2018年2月5日下午6:57:05
 */
public class TicketTest {

	public static void main(String[] args) {
		HashMap<String, Boolean> map = new HashMap<String ,Boolean>();
		for(int i=0;i<100;i++){
			map.put("D"+i, false);
		}
		TicketSell ticketSell1 = new TicketSell("张三",map);
		TicketSell ticketSell2 = new TicketSell("李四",map);
		TicketSell ticketSell3 = new TicketSell("王五",map);
		TicketSell ticketSell4 = new TicketSell("赵六",map);
		Thread thread1 = new Thread(ticketSell1);
		Thread thread2 = new Thread(ticketSell2);
		Thread thread3 = new Thread(ticketSell3);
		Thread thread4 = new Thread(ticketSell4);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
