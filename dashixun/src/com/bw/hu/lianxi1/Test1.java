/**
 * 
 */
package com.bw.hu.lianxi1;

/**
 * @author 胡建明
 *
 * 2018年3月1日上午10:47:00
 */
public class Test1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=1000;i++){
			if(i%3==0&&i%5==0&&i%7==0){
				sum+=i;
			}
	}
		System.out.println("和为"+sum);
}
}