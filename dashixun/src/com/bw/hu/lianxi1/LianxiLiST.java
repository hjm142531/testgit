/**
 * 
 */
package com.bw.hu.lianxi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author ������
 *
 * 2018��2��8������7:22:44
 */
public class LianxiLiST {

	public static void main(String[] args) {
		Student student = new Student(1,"����",3);
		Student student1 = new Student(2,"����",4);
		Student student2 = new Student(3,"����",5);
		Student student3 = new Student(1,"����",3);
		List<Student> list = Arrays.asList(student,student1,student2,student3);
		HashSet<Student> set = new HashSet<>();
		set.addAll(list);
		System.out.println(set);
	}
}
