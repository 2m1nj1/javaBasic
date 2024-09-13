package c_control;

import java.util.Scanner;

public class Ex13_while_MutiTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("구구단을 실행하고자 하는 숫자 N을 입력하시오 = > ");
		int num = input.nextInt();
		
		
		// for 문
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//		} // end of for i
		
		int i = 1;
		for (; i <= 9;) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			i++;
		} // end of for i
		
		

	} // end of void main

} // end of class
