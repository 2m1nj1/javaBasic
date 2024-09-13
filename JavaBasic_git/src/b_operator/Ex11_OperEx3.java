package b_operator;

import java.util.Scanner;

public class Ex11_OperEx3 {
	
	public static void main(String[] args) {
		
		int point = 0;
		String result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요. = > ");
		point = input.nextInt();
		
		if ( point > 80 ) {
			result = "합격";
		} else {
			result = "불합격";
		}
		
		System.out.println("당신은 " + result + "입니다.");
		
		// 삼항 연산자
		String result2 = ( point > 80 )? "합격" : "불합격" ;
		System.out.println("당신은 " + result2 + "입니다.");
		
	} // end of void main
	
} // end of class
