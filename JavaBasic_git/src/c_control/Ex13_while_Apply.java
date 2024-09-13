package c_control;

import java.util.Scanner;
import java.util.*;

public class Ex13_while_Apply {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("예 : 국어/수학/영어 (90 80 70) = > ");
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str); // 기본 구분자 : 공백
		// StringTokenizer st = new StringTokenizer(str, "/"); // 기본 구분자 : 공백
		
		int tmp  = st.countTokens();
		//System.out.println(tmp);
		
		// 반복 횟수 정해져 있다면
//		for (int i = 0; i <= tmp; i++) {
//			System.out.println("i = " + i);
//			String token = st.nextToken();
//			System.out.println("점수 : " + token);
//		}
//		
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("점수 : " + token);
		} // end of while
		
	} // end of void main

} // end of class
