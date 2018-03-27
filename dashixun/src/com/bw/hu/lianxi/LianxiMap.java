/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 胡建明
 *
 * 2018年2月7日下午8:29:34
 */
public class LianxiMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "2");
		map.put("1", "3");
		map.put("2", "4");
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
