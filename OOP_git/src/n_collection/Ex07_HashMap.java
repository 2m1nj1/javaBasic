package n_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex07_HashMap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		
		
		//	 "아이디(key)", "비밀번호(value)"
		map.put("minji", "1229");
		map.put("ichiro", "0726");
		map.put("samatoki", "1111");
		map.put("minji", "0105"); // key 값이 동일하면, 값을 덮어버림
		
		while(true) {
			System.out.print("아이디 -> ");
			String id = input.nextLine();
			System.out.print("비밀번호 -> ");
			String pw = input.nextLine();
			
			if (map.containsKey(id)) {
				if ((map.get(id)).equals(pw) ) {
					System.out.println("로그인 성공!");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue; // 이게 없으면 뒤에 구현 부분을 실행 하게 된다...
				}
			} else {
				System.out.println("존재하지 않는 ID 입니다.");
				continue;
			} // end of if
			
			// ~~ 구현 부분 ~~ 
		} // end of while
		
		
		
		
	} // end of main()

} // end of class
