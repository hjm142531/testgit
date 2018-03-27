/**
 * 
 */
package com.bw.hu.lianxi2;

/**
 * @author 胡建明
 *
 * 2018年3月23日上午7:32:49
 */
public abstract class AbstractTest {

	public static void test() {};
	public static void main(String[] args) {
		
	}
}

class Test1 extends AbstractTest{
	
	public static void main(String[] args) {
		AbstractTest abstractTest = new Test1();
		
	}
}
