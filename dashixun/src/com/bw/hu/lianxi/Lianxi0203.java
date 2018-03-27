/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;



/**
 * @author 胡建明
 *
 * 2018年2月3日上午11:13:54
 */
public class Lianxi0203 {
	
	@Test
	public void test(){
		Student s1 = new Student("张三",12);
		Student s2 = new Student("李四",121);
		Student s3 = new Student("王五",1241);
		Student s4 = new Student("赵六",122);
		List<Student> list = Arrays.asList(s1,s2,s3,s4);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
}
