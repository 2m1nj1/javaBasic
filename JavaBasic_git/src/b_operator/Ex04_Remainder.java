package b_operator;

import java.util.Scanner;

public class Ex04_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 나머지 연산자 활용 : 홀/짝수 구할 때
//		int num = 10;
//		
//		if( num % 2 == 0 ) {
//			System.out.printf("%d는 짝수 입니다.\n", num);
//		} else {
//			System.out.printf("%d는 홀수 입니다.\n", num);
//		}

		// 숫자 하나를 입력 받아 해당하는 수자가 3의 배수인지 아닌지 결과를 출력
		int num = 0; // 변수 선언, 초기화
		
		Scanner input = new Scanner(System.in); // Scanner 생성
		
		System.out.print("숫자를 입력하세요. = > ");
		num = input.nextInt();
		
		if ( num % 3 == 0 ) {
			System.out.printf("%d는 3의 배수가 맞습니다!", num);
		} else {
			System.out.printf("%d는 3의 배수가 아닙니다...", num);
		} // end of if
		
		
		/*
		 * [ 결 과 ]
		 * 숫자를 입력하세요. = > 7
		 * 7는 3의 배수가 아닙니다...
		 * 
		 */
		
		
		
	} // end of void main

} // end of class
