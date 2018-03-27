/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author 胡建明
 *
 * 2018年2月7日下午8:34:08
 */
public class Student implements Comparable<Student>{

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
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
