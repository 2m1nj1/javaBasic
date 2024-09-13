package c_control;

import java.util.Scanner;

public class Ex08_for_Pract03 {
	
	public static void main (String[] args) {
		
		String str = "";
		int str_length = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("입력하시오 => ");
		str = input.nextLine(); 	// 띄어쓰기도 입력받아야 되기 때문에 nextLine()
		str_length = str.length();	// 입력받은 문자열의 길이
		
		// 문자열의 길이만큼 for문 반복하여 뒷글자부터 출력
		for(int i = str_length ; i>0 ; i--) {
			char j = str.charAt(i-1);
			System.out.printf("%c", j);
		} // end of for
		
	} // end of void main

} // end of class
