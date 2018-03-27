/**
 * 
 */
package com.bw.hu.lianxi2;

import org.junit.Test;

/**
 * @author 胡建明
 *
 * 2018年2月14日下午6:05:38
 */
public class LianxiTest6 {

	@Test
	public void test(){
		LianxiStatic.Static();
	}
}
class LianxiStatic{
	public static void Static(){
		System.out.println("这是一个静态方法");
	}
}