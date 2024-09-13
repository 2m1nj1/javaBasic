package c_control;

import java.util.Scanner;

public class Ex17_Pract01 {

	public static void main(String[] args) {
		
		
		// 문제 1
		Scanner input = new Scanner(System.in);
		System.out.print("자연수 숫자를 입력하세요 = > ");
		int num = input.nextInt();
		int cnt = 0;
		
		if (num < 0) {
			System.out.println("잘못된 값을 입력했습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
	
		for(int i = 0; i < num; i++) {
			
			for(int k = 0; k < i; k++) {
				System.out.print("  ");
			} // end of for k
			
			for(int j = 0; j < num-i; j++) {
				System.out.print(cnt+1 + " ");
				cnt++;
			} // end of for j
			
			System.out.println();
		} // end of for i
		
	} // end of void main

} // end of class
