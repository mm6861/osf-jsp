package com.osf.test.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam2 {
 public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<>();
	for(int i=100;i>0;i--) {
		map.put(i, "test" +i);
	}
	Iterator<Integer> it = map.keySet().iterator();
	while(it.hasNext()) {
		Integer key = it.next();
		System.out.println(key);
	}
}
}
