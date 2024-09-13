package n_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex04_Lotto {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		/*
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45); // 0 ~ 45
			lotto.add(num);
		} // end of for i
		// [ Console ] 
		// [ 0, 5, 1 ] <= 중복 숫자가 3개 나왔다는 거
		// set으로 for문을 돌리면... 
		// 동일한 숫자는 나오지 않지만, 돌리는 횟수가 6번이고 쌓이는 숫자가 6개는 아니라서
		// 중복 숫자가 나올 시, 그 중복 숫자 갯수 만큼 결과 값이 덜 나온다.
		 */
		
		while (lotto.size() < 6) {
//			int num = (int)(Math.random()*45) + 1; // 0 ~ 45
//			lotto.add(num);
			
			lotto.add((int)(Math.random()*45) + 1);
		} // end of while
		
		List list = new ArrayList(lotto);
		Collections.sort(list);
		System.out.println(list);
		
	} // end of main()

} // end of class_Ex04_Lotto
