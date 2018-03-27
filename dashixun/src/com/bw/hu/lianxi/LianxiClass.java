/**
 * 
 */
package com.bw.hu.lianxi;

/**
 * @author 胡建明
 *
 * 2018年2月7日下午8:53:41
 */
public class LianxiClass {

	public static void main(String[] args) {
		Lianxi1 lianxi1 = new Lianxi1("张三");
		Lianxi2 lianxi2 = new Lianxi2("张三");
		boolean equals = lianxi2.equals(lianxi2);
		System.out.println(equals);
	}
}
class Lianxi1{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lianxi1 other = (Lianxi1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Lianxi1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lianxi1(String name) {
		super();
		this.name = name;
	}
	
}
class Lianxi2{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lianxi2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lianxi2(String name) {
		super();
		this.name = name;
	}
	
}