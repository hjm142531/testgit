/**
 * 
 */
package com.bw.hu.lianxi;

import org.junit.Test;

/**
 * @author 胡建明
 *
 * 2018年2月4日下午2:47:24
 */
public class ExceptionTest {

	@Test
	public void test() throws Exception{
		A a = new A();
		a.setAge(20);
		System.out.println(a);
		try {
			a.Jisuan(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println("我运行了");
	

	
	
}

class A{
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "A [age=" + age + "]";
	}
	
	public void Jisuan(int b){
		System.out.println(age / b);
	}
}}

class Ex extends Exception{

	public Ex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ex(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public Ex(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public Ex(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public Ex(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
