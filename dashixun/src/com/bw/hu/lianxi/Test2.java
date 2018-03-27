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
 * 2018年2月5日下午7:42:17
 */
public class Test2 {

	public static void main(String[] args) {
//		ne
		HashMap<String, Boolean> hashMap = new HashMap<>();
		hashMap.put("1", false);
		hashMap.put("2", false);
		hashMap.put("3", false);
		Set<Entry<String,Boolean>> entrySet = hashMap.entrySet();
		for (Entry<String, Boolean> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
