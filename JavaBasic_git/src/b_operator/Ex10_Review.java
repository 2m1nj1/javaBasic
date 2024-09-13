package b_operator;

import java.util.Scanner;

public class Ex10_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("문자 하나를 입력하세요 = > ");
		
		char ch = input.next().charAt(0);
		// .charAt(N) : 앞 N자리 수만 출력
		
		System.out.println("입력 문자 : " + ch);
		System.out.println();
		
		// 유니코드 크기 비교 할 시, 그냥 문자로 입력해도 괜찮다.
		// 유니코드 값이 A < B < C..., 대문자<소문자 인 것만 기억해두면 된다. 
		if( 'Z' >= ch & ch >= 'A' ) {
			System.out.println("입력한 문자는 대문자입니다.");
		} else if ( 'z' > ch & ch >= 'a' ) {
			System.out.println("입력한 문자는 소문자입니다.");
		} else {
			System.out.println("입력한 문자는 기타문자입니다.");
		} // end of if
		
	} // end of void main

} // end of class
