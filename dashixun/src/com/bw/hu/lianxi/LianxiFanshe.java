/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author ������
 *
 * 2018��2��8������7:15:57
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
