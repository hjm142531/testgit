/**
 * 
 */
package com.bw.hu.lianxi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author 胡建明
 *
 * 2018年2月8日上午7:22:44
 */
public class LianxiLiST {

	public static void main(String[] args) {
		Student student = new Student(1,"张三",3);
		Student student1 = new Student(2,"李四",4);
		Student student2 = new Student(3,"王五",5);
		Student student3 = new Student(1,"张三",3);
		List<Student> list = Arrays.asList(student,student1,student2,student3);
		HashSet<Student> set = new HashSet<>();
		set.addAll(list);
		System.out.println(set);
	}
}
