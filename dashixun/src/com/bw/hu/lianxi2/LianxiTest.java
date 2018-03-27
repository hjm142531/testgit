/**
 * 
 */
package com.bw.hu.lianxi2;

import org.junit.Test;

/**
 * @author 胡建明
 * 1-100偶数和
 * 2018年2月13日下午5:15:33
 */
public class LianxiTest {

	@Test
	public void test(){
		int sum = 0;
		for(int i=0;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
