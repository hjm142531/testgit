/**
 * 
 */
package com.bw.hu.lianxi2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * @author ������
 * �Զ�����������
 * 2018��2��13������5:20:17
 */
public class LianxiTest3 {

	@Test
	public void test(){
		Student student = new Student("����",123);
		Student student2 = new Student("����",12);
		Student student3 = new Student("����",1233);
		Student student4 = new Student("����",1213);
		Student student5 = new Student("����",1253);
		List<Student> list = Arrays.asList(student,student2,student3,student4,student5);
		Collections.sort(list);
		System.out.println(list);
	}
	
}

class Student implements Comparable<Student>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
}
