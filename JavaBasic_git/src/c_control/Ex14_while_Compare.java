package c_control;

import java.util.Scanner;

public class Ex14_while_Compare {

	public static void main(String[] args) {

		/*
		 *  for 문 이용
		 */

//		int rpt = 0;
//
//		Scanner input = new Scanner(System.in);
//		System.out.print("구구단 출력 몇 번 반복 할까요? = > ");
//		rpt = input.nextInt();
//		
//		
//		for(int j = 0; j < rpt; j++) {
//			
//			System.out.print("몇 단 출력 할까요? = > ");
//			int num = input.nextInt();
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n", num, i, num * i);
//			} // end of for i
//		} // end of for j
		
		
		/*
		 * while 문 이용
		 */		
//		while (true) {
//			Scanner input = new Scanner(System.in);
//			System.out.print("몇 단 출력 할까요? = > ");
//			int num = input.nextInt();
//			
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n", num, i, num * i);
//			} // end of for i
//			
//			System.out.print("종료할까요? (Y/N) = > ");
//			String answerExit = input.next();
//			//String answerExit = input.nextLine();
//			
//			if (answerExit.equals("Y") || answerExit.equals("y")) {
//				// if 조건에 해당 될 때에 break; 실행하여 while 종료
//				break;
//			}
//		} // end of while
		
		
		/*
		 * do while 문 : 일단 한번 수행 뒤에 조건 만족을 확인하고 반복 여부 결정
		 */
		String answerExit = "";
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("몇 단 출력 할까요? = > ");
			int num = input.nextInt();
			
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			} // end of for i
			
			System.out.print("다시할까요? (Y/N) = > "); // do while문에 맞게 문구 수정 필요
			answerExit = input.next();
			//String answerExit = input.nextLine();
		} while(answerExit.equals("Y") || answerExit.equals("y")); // end of do while
		

	} // end of void main

} // end of class 
