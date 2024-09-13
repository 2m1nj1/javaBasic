package a_datatype;

import java.util.Scanner;

public class Ex09_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor, eng, math;
		int total;
		double avg;
		
		Scanner input = new Scanner(System.in); // input 이라는 이름의 Scanner 선언 
		
		System.out.printf("국어 점수를 입력해주세요 => ");
		kor = input.nextInt(); // Scanner를 통해서 받은 값을 변수 kor에 대입
		
		System.out.printf("영어 점수를 입력해주세요 => ");
		eng = input.nextInt();
		
		System.out.printf("수학 점수를 입력해주세요 => ");
		math = input.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		System.out.println();
		System.out.println("=================");
		System.out.println("- 국어 점수 : " + kor);
		System.out.println("- 영어 점수 : " + eng);
		System.out.println("- 수학 점수 : " + math);
		System.out.println("-----------------");
		System.out.println("- 총    점 : " + total);
		//System.out.println("- 평    균 : " + avg);
		System.out.printf("- 평    균 : %.1f\n", avg);
		System.out.println("=================");
		
		
		
	} // end of void main

} // end of class
