/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.runner.Request;

/**
 * @author ������
 *
 * 2018��2��8������7:49:59
 */
public class LianxiString {

	public static void main(String[] args) {
		String[] split = Test.s.split(",");
		TreeSet<String[]> set = new TreeSet<>();
		set.add(split);
		set.toString();
		
		
	}
	static class Test{
		static String s = "1,3,1,3,1,2,4,5";
	}
}
