/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.Scanner;

/**
 * @author 胡建明
 *
 * 2018年2月7日下午8:43:37
 */
public class LianxiSwitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				while(true){
					Scanner sc = new Scanner(System.in);
					int i = sc.nextInt();
					switch (i) {
					case 1:
						System.out.println("今天星期一");
						break;
					case 2:
						System.out.println("今天星期二");
						break;
					case 3:
						System.out.println("今天星期三");
						break;
					case 4:
						System.out.println("今天星期四");
						break;
					case 5:
						System.out.println("今天星期五");
						break;
					case 6:
						System.out.println("今天星期六");
						break;
					case 7:
						System.out.println("今天星期日");
						break;
					default:
						System.out.println("火星来的滚回去吧");
						break;
					}
				}
	}
}
