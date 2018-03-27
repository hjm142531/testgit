/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 胡建明
 *
 * 2018年2月5日下午6:53:00
 */
public class TicketSell implements Runnable{

	private String name;
	private Map<String,Boolean> map = new HashMap<String ,Boolean>();
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Boolean> getMap() {
		return map;
	}
	public void setMap(Map<String, Boolean> map) {
		this.map = map;
	}
	public TicketSell() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketSell(String name, Map<String, Boolean> map) {
		super();
		this.name = name;
		this.map = map;
	}
	
	public void sellTicket(){
		Set<Entry<String, Boolean>> set = map.entrySet();
		
		for (Entry<String, Boolean> entry : set) {
			synchronized(map){
				String key = entry.getKey();
				Boolean value = entry.getValue();
				if(value==false){
					map.put(key, true);
					System.out.println(name+"卖出了"+key);
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		// TODO Auto-generated method stub
		sellTicket();
	}
}
