package c_control;

import java.util.Scanner;

public class Ex11_for_Test01 {

	public static void main(String[] args) {
		
		// [ 연습 ] for 중첩 - 숫자 사각형
		
		int num1 = 0, num2 =0;

		// (문제 1)
		System.out.println("========== 문제 1 ==========");
		
		Scanner input1 = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하세요 = > ");
		num1 = input1.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 = > ");
		num2 = input1.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		System.out.println();
		
				
		
		// (문제 2)
		System.out.println("========== 문제 2 ==========");
		
		Scanner input2 = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요 = > ");
		num1 = input2.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			for(int j = 0; j < num1; j++) {
				System.out.print(i+num1*j + "\t");
			}
			System.out.println();
		}
		
		// (문제 3)
		System.out.println("========== 문제 3 ==========");

		Scanner input3 = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 = > ");
		num1 = input3.nextInt();
		System.out.print("두번째 숫자를 입력하세용 = > ");
		num2 = input3.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			if (i%2 != 0) {
				//홀수 행
				for(int j = 1; j <= num2; j++) {
					System.out.print((i-1)*num2+j + "\t");
				}
				System.out.println();
			} else {
				// 짝수 행
				for(int j = 0; j < num2; j++) {
					System.out.print(i*num2-j + "\t");
				} // end of for(j)
				System.out.println();
			} // end of if
		} // end of for(i)
		
		System.out.println("===========================");
		System.out.println();
		
				
	} // end of void main

} // end of class
