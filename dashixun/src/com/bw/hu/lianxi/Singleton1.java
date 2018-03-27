/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author ������
 *
 * 2018��2��3������4:47:52
 */
public class Singleton1 {
    private Singleton1() {};
    private static Singleton1 single = new Singleton1();
    public static Singleton1 getInstance() {
        return single;
   }
}
