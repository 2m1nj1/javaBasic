package b_operator;

import java.util.Scanner;

public class Task2_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		int max;
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("첫번째 숫자를 입력하세요 => ");
		num1 = input.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 => ");
		num2 = input.nextInt();
		System.out.printf("세번째 숫자를 입력하세요 => ");
		num3 = input.nextInt();
		
		if (num1 > num2) {
			
			max = num1;
			if (num1 < num3) max = num3;
			
		} else
		{
			max = num2;
			if (num2 < num3) max = num3;
		}
		
		System.out.printf("가장 큰 숫자는 %d 입니다\n", max);
		
		
		
	} // end of void main

} // end of void class
