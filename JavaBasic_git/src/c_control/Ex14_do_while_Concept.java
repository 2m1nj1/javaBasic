package c_control;

import java.util.Scanner;

public class Ex14_do_while_Concept {

	public static void main(String[] args) {
		
//		int sum = 0 ;
//		int i = 0;
//		
//		do {
//			sum += i;
//			i++;
//		} while (i <=10);
//		
//		System.out.println(sum);
//		
		
		int num = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("구구단을 실행하고자 하는 숫자 N을 입력하시오 = > ");
		num = input.nextInt();
		
		int j = 1;
		do {
			System.out.printf("%d * %d = %d\n", num, j, num*j);
			j++;
		} while (j <= 9);
		
		
	}

}
