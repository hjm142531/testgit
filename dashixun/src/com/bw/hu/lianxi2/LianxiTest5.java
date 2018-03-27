/**
 * 
 */
package com.bw.hu.lianxi2;

import java.util.Scanner;

import org.junit.Test;

/**
 * @author 胡建明
 *
 * 2018年2月14日下午5:58:03
 */
public class LianxiTest5 {

	@Test
	public void test(){
		while(true){
			Scanner sc = new Scanner(System.in);
			int nextInt = sc.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("今天是星期一");
				break;
			case 2:
				System.out.println("今天是星期二");
				break;	
			case 3:
				System.out.println("今天是星期三");
				break;
			case 4:
				System.out.println("今天是星期四");
				break;
			case 5:
				System.out.println("今天是星期五");
				break;
			case 6:
				System.out.println("今天是星期六");
				break;
			case 7:
				System.out.println("今天是星期日");
				break;
			default:
				System.out.println("...");
				break;
			}
		}
	}
}
