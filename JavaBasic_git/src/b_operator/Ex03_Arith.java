package b_operator;

import java.util.Scanner;

public class Ex03_Arith {
	
	public static void main(String[] args) {
	
		/*
		 * [콘솔창에서]
		 * 첫번째 숫자 입력 = > 
		 * 두번째 숫자 입력 = >
		 * 
		 * [입력 도출 값]
		 * 더하기
		 * 빼기
		 * 곱하기
		 * 나누기 :
		 * 나머지 :
		 */
		
		int num1, num2;
		int sum, sub, mul, div, rem;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf(" 첫번째 숫자를 입력하세요. = > ");
		num1 = input.nextInt();
		
		System.out.printf(" 두번째 숫자를 입력하세요. = > ");
		num2 = input.nextInt();

		System.out.println("\n============================\n");

		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		rem = num1 % num2;
		
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num1, num2, sub);
		System.out.printf("%d * %d = %d\n", num1, num2, mul);
		System.out.printf("%d / %d = %d\n", num1, num2, div);
		System.out.printf("%d %% %d = %d\n", num1, num2, rem);
		
		
		
	} // end of void main

} // end of class
