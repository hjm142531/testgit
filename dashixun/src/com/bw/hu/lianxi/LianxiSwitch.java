/**
 * 
 */
package com.bw.hu.lianxi;

import java.util.Scanner;

/**
 * @author ������
 *
 * 2018��2��7������8:43:37
 */
public class LianxiSwitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				while(true){
					Scanner sc = new Scanner(System.in);
					int i = sc.nextInt();
					switch (i) {
					case 1:
						System.out.println("��������һ");
						break;
					case 2:
						System.out.println("�������ڶ�");
						break;
					case 3:
						System.out.println("����������");
						break;
					case 4:
						System.out.println("����������");
						break;
					case 5:
						System.out.println("����������");
						break;
					case 6:
						System.out.println("����������");
						break;
					case 7:
						System.out.println("����������");
						break;
					default:
						System.out.println("�������Ĺ���ȥ��");
						break;
					}
				}
	}
}
