package n_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {

		List result = method();
		
		System.out.println(result);
		
		for(int i = 0; i < result.size(); i++) {
			Object obj = result.get(i);
			System.out.println(obj);
		} // end of for
	} // end of main()

	static List method() {
		// DATA : 이렇게 우리가 지정해주면 데이터가 몇개인지 알지만... 실제로는 몇개가 들어올지 모르는 상황
		String 	name 	= "홍길자";
		Integer age 	= 100; // java v1.5 이후 부터는 int - Integer 호환
		Double	height	= 190.99;
		
		// 그래서 !!! 동적으로 메모리를 할당해주는 List 라는 게존재
		List list = new ArrayList();
		// Object[] obj = new Object[num] : 필수 형식
		// 하지만!? ArrayList는 그럴 필요가 없다~ (대신 메모리 낭비를 하는 편...)
		
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
		
	} // end of method()
	
} // end of class
