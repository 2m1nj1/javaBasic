package c_control;

import java.util.Scanner;

public class Ex08_for_Pract02 {
	
	public static void main (String[] args) {
		/*
		 * 문제2) 문자열 처리하기
		 * 문자 N (a~z, A~Z)를 입력받아
		 * N이 소문자면, a ~ N까지 출력
		 */
		
		char ch = '0';
		
		Scanner input = new Scanner(System.in);
		System.out.printf("문자 하나를 입력하시오. => ");
		// ch = (char)input.nextInt(); // error 나지는 않지만 나중에 복잡한 code 작성시 error 날 확률이 높음
		ch = input.next().charAt(0);
		
		// 소문자 / 대문자 확인
		if( ch >= 'a' & ch <= 'z') {
			// 반복 출력
			for (char i = 'a' ; i<=ch ; i++) {
				System.out.println(i);
			}
		} else if ( ch >= 'A' & ch <= 'Z') {
			for (char i = 'A' ; i<=ch ; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Error!");
		}
		
	} // end of void main


}
