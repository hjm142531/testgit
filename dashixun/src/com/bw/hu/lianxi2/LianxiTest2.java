/**
 * 
 */
package com.bw.hu.lianxi2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * @author ������
 * ����һ��map��������ݣ���1������2��������1������3��������2������4������ѭ�������ֵ��
 * 2018��2��13������5:17:49
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
