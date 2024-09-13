package n_collection;

import java.util.HashSet;
import java.util.Set;

public class Ex04_Set {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<String>();
		
		set.add("zebra");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("dog"); // 중복 add X
		set.add("dog");	// 중복 add X
		
		// remove 할 때도 특정 index를 못 지우고 특정 값 만 지울 수 있지만...
		// 이런 걸 왜 쓰나 싶을 수도 있지만...
		// e.g.
		// 로또! 숫자 중복 되면 안되잖아?! 
		// 이런 경우에 set을 사용한다!
		
		System.out.println(set);
		
	} // end of main()

} // end of class
