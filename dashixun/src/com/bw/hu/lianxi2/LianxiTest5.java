/**
 * 
 */
package com.bw.hu.lianxi2;

import java.util.Scanner;

import org.junit.Test;

/**
 * @author ������
 *
 * 2018��2��14������5:58:03
 */
public class LianxiTest5 {

	@Test
	public void test(){
		while(true){
			Scanner sc = new Scanner(System.in);
			int nextInt = sc.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("����������һ");
				break;
			case 2:
				System.out.println("���������ڶ�");
				break;	
			case 3:
				System.out.println("������������");
				break;
			case 4:
				System.out.println("������������");
				break;
			case 5:
				System.out.println("������������");
				break;
			case 6:
				System.out.println("������������");
				break;
			case 7:
				System.out.println("������������");
				break;
			default:
				System.out.println("...");
				break;
			}
		}
	}
}
