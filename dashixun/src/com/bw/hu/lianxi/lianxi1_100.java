/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author 胡建明
 *
 * 2018年2月7日下午8:28:11
 */
public class lianxi1_100 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
