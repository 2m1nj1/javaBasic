package c_control;

import java.util.Scanner;

public class Ex10_for_Quad {

	public static void main(String[] args) {
		
		int row = 0, col =0;
		int cnt = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하세요 = > ");
		row = input.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 = > ");
		col = input.nextInt();
		
//		for(int i = 0; i < row; i++) {
//			for (int j = 0; j < col ; j++) { // j++, cnt++ 같이 해도 된다
//				System.out.print(cnt + "\t");
//				cnt++;
//			}
//			System.out.println();
//		}
		
//		for(int cnt = 1, i = 0; i < row; i++) {
//			for (int j = 0; j < col ; j++, cnt++) { // j++, cnt++ 같이 해도 된다
//				System.out.print(cnt + "\t");
//			}
//			System.out.println();
//		}
		
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				System.out.printf(i*j + "\t");
			}
			System.out.println();
		}
		
	
	} // end of void main

} // end of class
