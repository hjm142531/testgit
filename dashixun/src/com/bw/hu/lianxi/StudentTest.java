/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

/**
 * @author ������
 *
 * 2018��2��7������8:36:05
 */
public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("����",12);
		Student student1 = new Student("����",42);
		Student student2 = new Student("����",54);
		Student student3 = new Student("����",123);
		Student student4 = new Student("����",64);
		List<Student> list = Arrays.asList(student,student1,student2,student3,student4);
		Collections.sort(list);
		System.out.println(list);
	}
	@Test
	public void test1(){
		String str = "1,3,2,1,5";
		String[] split = str.split(",");
		System.out.println(split);
		HashSet<String[]> set = new HashSet<>();
		set.add(split);
		String string = set.toString();
		System.out.println(string);
	}
	
}
