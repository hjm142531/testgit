/**
 * 
 */
package com.bw.hu.lianxi2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * @author 胡建明
 * 定义一个map，添加内容（“1”，“2”）（“1”，“3”）（“2”，“4”），循环输出键值对
 * 2018年2月13日下午5:17:49
 */
public class LianxiTest2 {

	@Test
	public void test(){
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
