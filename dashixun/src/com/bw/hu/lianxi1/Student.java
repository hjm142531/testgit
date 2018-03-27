/**
 * 
 */
package com.bw.hu.lianxi1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.junit.Test;

/**
 * @author 胡建明
 *
 * 2018年2月6日下午6:59:13
 */
public class Student {

	public int status;
	private String name;
	private int age;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
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
	public Student(int status, String name, int age) {
		super();
		this.status = status;
		this.name = name;
		this.age = age;
	}
	public void lean(){
		System.out.println("在学习");
	}
	public void add(String a){
		System.out.println("在学习");
	}
	
	@Test
	public void getClassTest(){
		Student student = new Student();
		Class<? extends Student> class1 = student.getClass();
		String name2 = student.getClass().getName();
		try {
			Class<?> forName = Class.forName(name2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + status;
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
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [status=" + status + ", name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		
		 Student student = new Student();
		 Class<? extends Student> class1 = student.getClass();
		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			if("lean".equals(method.getName())){
				Student newInstance;
				try {
					newInstance = Student.class.newInstance();
					System.out.println(method.invoke(newInstance, null));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
}