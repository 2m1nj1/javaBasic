package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex03_Baseball {

	public static void main(String[] args) {
			
		int[] baseball = new int [3];
		
		for(int i = 0; i < baseball.length; i++) {
			baseball[i] = (int)(Math.random()*10);
			
			// 같은 숫자 확인하기
			for(int j = 0; j < i; j++) {
				if(baseball[j] == baseball[i]) {
					i--;
				} // end of if
			} // end of for j
			
			System.out.println(baseball[i]);
					
		} // end of for i
		
		
//		for(int i = 0; i < baseball.length; i++) {
//			System.out.print(" >> " + baseball[i] + " ");
//		} // end of for
		
		
		// -----------------------------------------------------
		// 2. 사용자 입력값 answer 에 각각의 숫자로 저장
		// e.g.  3 4 5
		int [] answer = new int[3];
		
		System.out.println();
		System.out.println("==========================");
		System.out.print("답을 입력하세요 = > ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int ansCnt = answer.length;

		for (int i = 0; i < ansCnt; i++) {
			answer[i] = Integer.parseInt(st.nextToken());
 		}
		
//		for(int i = 0; i < ansCnt; i++) {
//			System.out.print(" >> " + answer[i] + " ");
//		} // end of for
		
		
		// -----------------------------------------------------
		// 3. 값 비교
		int strike = 0, ball = 0;
		
		for (int i = 0; i < baseball.length; i++) {
			for (int j = 0; j < ansCnt; j++) {
				if (baseball[i] == answer[j]) {
					if (i == j)
						strike++;
					else
						ball++;
				}
			} // end of for j
		} // end of for i
		
		System.out.println(" 스트라이크 : " + strike + ", 볼 : " + ball);

	} // end of void main

} // end of class
