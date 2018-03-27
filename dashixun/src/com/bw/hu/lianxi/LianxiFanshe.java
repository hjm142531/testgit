/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author 胡建明
 *
 * 2018年2月8日上午7:15:57
 */
public class LianxiFanshe {

	public static void main(String[] args) {
		Class<? extends Class> class1 = Student.class.getClass();
		try {
			Class newInstance = class1.newInstance();
			Student newInstance2 = (Student)newInstance.newInstance();
			newInstance2.getAge();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
