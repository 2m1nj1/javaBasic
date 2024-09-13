package b_operator;

import java.util.Scanner;

public class Ex12_OperEx3Review {
	
	public static void main (String[] args) {
		
		
		// 두 수를 입력 받고 둘 중 큰 수를 출력 
		
		int a, b;
		int max;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하세요 = > ");
		a = input.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 = > ");
		b = input.nextInt();
		
		if ( a == b ) {
			System.out.println();
			System.out.println("두 수는 같습니다.");
		} else {
			max = ( a > b )? a : b;
			System.out.println();
			System.out.println(">> 두 숫자 중 큰 값은 " + max + "입니다.");
		} // end of if
		
	} // end of void main

} // end of class
