package b_operator;

import java.util.Scanner;

public class Task1_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * [ 윤년 조건 ]
		 * >> 4로 나누어 떨어지면 윤년 O
		 * >> 100으로 나누어 떨어지면 윤년 X
		 * >> 400으로 나누어 떨어지면 윤년 O
		 */
		
		int year = 0;
		int chk_leap = 0 ;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("년도를 입력해주세요 => ");
		year = input.nextInt();
		
		
		if(year % 4 == 0) {		
			if(year%100 == 0 & year%400 != 0 ) {
				chk_leap = 2; // 윤년 X
			} else {
				chk_leap = 1;
			}
		} else {
			chk_leap = 2; // 윤년 X
		}
		
		
		if(chk_leap == 1) {
			// 윤년 O
			System.out.printf("%d년은 윤년입니다.\n", year);
		} else if (chk_leap == 2) {
			// 윤년 X
			System.out.printf("%d년은 윤년이 아닙니다.\n", year);
		}
		
		
		
	} // end of void main

} // end of class
