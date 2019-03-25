package com.osf.test.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class Test {
	private String str;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Test [str=" + str + ", name=" + name + "]";
	}
	
}
public class ReflectionTest {
	
	public static void main(String[] args) {
		Class<?> clazz;
		try {
			clazz = Class.forName("com.osf.test.test.Test");
			Method[] mehtods = clazz.getDeclaredMethods();
			Object obj =clazz.newInstance();
			for(Method m : mehtods) {
				String nName = m.getName();
				int idx = nName.indexOf("set");
				if(idx==0) {
					if("setname".equals(nName.toLowerCase())) {
						m.invoke(obj, "홍길동");
					}
					
				}
			}
			System.out.println(obj);
			Test t = (Test)clazz.newInstance();
			System.out.println(t);
			
			Test t1 = new Test();
			System.out.println(t1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
