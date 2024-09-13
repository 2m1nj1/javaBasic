package b_operator;

import java.util.Scanner;

public class Task3_OutputMidNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		int max, mid, min;
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("첫번째 숫자를 입력하세요 => ");
		num1 = input.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 => ");
		num2 = input.nextInt();
		System.out.printf("세번째 숫자를 입력하세요 => ");
		num3 = input.nextInt();

		if (num1 > num2) {

			max = num1;
			
			if (num1 < num3)
			{	
				max = num3;
				mid = num1;
				min = num2;
			} else {
				// num1 > num3
				// max = num1;
				mid = (num2 > num3)? num2 : num3;
				min = (num2 > num3)? num3 : num2;
			}
				
		} else {
			
			// num1 < num2
			max = num2;
			
			if (num2 < num3)
			{
				max = num3;
				mid = num2;
				min = num1;
			} else {
				// num2 > num3
				// max = num2;
				mid = (num1 > num3)? num1 : num3;
				min = (num1 > num3)? num3 : num1;
				       
			} //end of if (num2 < num3)
		} // end of if (num1 > num2)

		System.out.printf("중간 숫자는 %d 입니다\n", mid);
		
	} // end of void main

} // end of class
