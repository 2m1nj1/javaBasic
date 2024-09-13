package n_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {

	public static void main (String[] args) {
		
		// Generic : 데이터 타입을 명확하게 지정
		ArrayList<String> list = new ArrayList<String>(4);
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");
		
		
		System.out.println(list);
		
		list.set(3, "lion");
		System.out.println(list);
		
		list.add("tiger");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		/*
		// [ New for ] : 집합인 걸 쓸 때 사용 가능
		for (String temp : list) {
			System.out.println(temp);
		} // end of for temp
		
		// [ Original for ]
		// 범위를 넘는 데이터가 들어왔을 때, 데이터 사이즈를 2배 씩 늘린다...! 
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		} // end of for i
		*/
	} // end of main
} // end of class
