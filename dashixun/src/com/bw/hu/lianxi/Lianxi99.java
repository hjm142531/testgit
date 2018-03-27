/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author 胡建明
 *
 * 2018年2月7日下午8:39:57
 */
public class Lianxi99 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
