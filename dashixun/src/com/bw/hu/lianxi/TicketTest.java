/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.HashMap;

/**
 * @author ������
 *
 * 2018��2��5������6:57:05
 */
public class TicketTest {

	public static void main(String[] args) {
		HashMap<String, Boolean> map = new HashMap<String ,Boolean>();
		for(int i=0;i<100;i++){
			map.put("D"+i, false);
		}
		TicketSell ticketSell1 = new TicketSell("����",map);
		TicketSell ticketSell2 = new TicketSell("����",map);
		TicketSell ticketSell3 = new TicketSell("����",map);
		TicketSell ticketSell4 = new TicketSell("����",map);
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
