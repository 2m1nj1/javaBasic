package d_array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		Scanner input = new Scanner(System.in);
	
		for (int i = 0; i < s.length; i++) {	
			
			// *** 배열 하나하나에 객체 따로 잡아줘야 한다.
			s[i] = new Student();
			
			System.out.println(">> 학생명 입력");
			s[i].setName(input.nextLine());
			System.out.println(">> 국어 점수 입력");
			s[i].setKor(input.nextInt());
			System.out.println(">> 영어 점수 입력");
			s[i].setEng(input.nextInt());
			System.out.println(">> 수학 점수 입력");
			s[i].setMath(input.nextInt());
			input.nextLine();
			
			System.out.println("총점 : " + s[i].calTotal());
			System.out.println("평균 : " + s[i].calAvg());
		} // end of for i
		
		
		
	} // end of main
} // end of calss
