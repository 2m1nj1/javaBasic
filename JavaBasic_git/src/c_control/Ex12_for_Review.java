package c_control;

import java.util.Scanner;

public class Ex12_for_Review {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("자연수 N을 입력하시오 = > ");
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			
//			for(int k = num-1; k > i; k--) {
//				System.out.print(" ");
//			} // end of for k
			
			for(int k = 0; k < num-i-1; k++) {
				System.out.print("\t");
			} // end of for k
			
			for(int j = 0; j <= i; j++) {
				System.out.print(j+1 + "\t");
			} // end of for j
			
			System.out.println();
			
		} // end of for i
		
		
	} // end of void main

} // end of class
