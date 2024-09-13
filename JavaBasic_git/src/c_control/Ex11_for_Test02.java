package c_control;

import java.util.Scanner;

public class Ex11_for_Test02 {

	public static void main(String[] args) {
		
		int n = 0, m = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("삼각형의 크기 n값을 입력하세요 = > ");
		n = input.nextInt();
		System.out.print("종류 m의 값을 입력하세요 = > ");
		m = input.nextInt();

		if (n <= 0 | n > 100 | m <= 0 | m > 3 ) {
			System.out.println("INPUT ERROR!");
			System.exit(0);
		}
		
		if (m == 1) {
			// 종류 1
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					// * 출력 : i행의 별 갯수는 i개
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (m == 2) {
			// 종류 2
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-i; j++) {
					// * 출력 : i행의 별 갯수는 n-i개
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (m == 3) {
			// 종류 3
			for (int i = 0; i < n; i++) {
				for (int k = 1; k < n-i; k++) {
					// 띄어쓰기
					System.out.print(" ");
				}
				for (int j = 0; j < 1+2*i; j++) {
					// * 출력 : i행의 별 갯수는 1+2i개
					System.out.print("*");
				} // end of for(j)
				System.out.println();
			}
		} // end of if
		
		
	} // end of void main

} // end of class
