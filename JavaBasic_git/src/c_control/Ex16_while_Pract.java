package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex16_while_Pract {

	public static void main(String[] args) {
		
		// 문제 1 
//		Scanner input = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 (e.g. 1 2 3 4) = > ");
//		String str = input.nextLine();
//		
//		StringTokenizer st = new StringTokenizer(str);
//		
//		int max = 0;
//		
//		while (st.hasMoreTokens()) {
//			String token = st.nextToken();
//			//System.out.println(token);
//			int num = Integer.parseInt(token); // num은 기본형이고 str은 참조형이라서 (int)로 형변환 불가
//			if (max < num) {
//				max = num;
//			}
//		} // end of while
//		
//		System.out.println("가장 큰 수 : " + max );
		
		
		// 문제 2
//		Scanner input = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 (e.g . 1 2 3 4) = > ");
//		String str = input.nextLine();
//		
//		StringTokenizer st  = new StringTokenizer(str);
//		
//		int evenCnt = 0;
//		int oddCnt = 0;
//		
//		while (st.hasMoreTokens()) {
//			String token = st.nextToken();
//			int num  = Integer.parseInt(token);
//			
//			if(num%2 == 0) {
//				// 짝수
//				evenCnt++;
//			} else {
//				// 홀수
//				oddCnt++;
//			}
//		} // end of while
//		
//		System.out.println("짝수 : " + evenCnt);
//		System.out.println("홀수 : " + oddCnt);
		
		
		// 문제 3
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int avg = 0;
		int zeroCnt = 0;
		boolean chk = true;
		
		// 잘못된 값을 입력 했을 때 재입력을 위한 while문
		while (chk) {
			System.out.println("숫자 10개를 입력하세요 (e.g. 1 2 3 4 5 6 7 8 9 10)");
			System.out.println(" * 0 입력 시 숫자 10개가 아니여도 진행 가능 ");
			System.out.print(" = > ");
			String str = input.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			
			int tokenCnt = st.countTokens(); // 입력 받은 숫자 갯수
			
			if (tokenCnt != 10 && str.indexOf("0") < 0) {
	 			// 입력된 숫자의 갯수가 10개가 아니라면 다시 입력하게 하기
				System.out.println("[ Error! ] 입력한 숫자가 10개가 아닙니다.");
				continue;
			} else {
				// 입력된 숫자의 갯수가 10개라면 마저 진행
				chk = false;
			} // end of if tokenCnt
			
			// hasMoreTokens() : 배열에서 분리할 토큰이 남아있는지 확인
			// 배열에 분리할 토큰이 남아있다면 while문 실행
			while(st.hasMoreTokens()) {
				String token = st.nextToken();		// 다음 토큰을 token 변수에 대입해요
				int num = Integer.parseInt(token);	// 대입한 값을 Integer로 형변환해서 변슈 int에 대입해요
				
				// num 값이 0이라면...
				// (int형으로 형변환한) 토큰의 값이 0 이라면...
				if(num == 0) {
					// 변수 zeroCnt 값을 +1
					zeroCnt++;
				} // end of if num
				
				// 합을 구할 때는 0이 몇개 있든 상관 없지만...
				sum += num;
				// 평균을 구할 때 0의 갯수를 포함해서 계산하면 안돼요
				avg = sum/(tokenCnt-zeroCnt);
				
			} // end of while
			
		} // end of while chk
		
	
		System.out.println(sum + " " + avg);
		
	} // end of void main

} // end of class
