/**
 * 
 */
package com.bw.hu.lianxi2;

import org.junit.Test;

/**
 * @author ������
 * 99�˷���
 * 2018��2��13������5:28:29
 */
public class LianxiTest4 {

	@Test
	public void test(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
