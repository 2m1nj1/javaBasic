package e_method;

import java.util.Scanner;

public class Ex08_Pract {

	public static void main(String[] args) {
		
		int[] score = new int[3];
		double avg = 0.0;
		
		score = input();
		avg = calculate(score);
		output(avg);
		
	} // end of main()

	
	// 국/영/수 점수 입력 받기
	static int[] input() {
		int[] score = new int[3];
		
		Scanner input = new Scanner(System.in);
		System.out.print("국어 점수 = > ");
		score[0] = input.nextInt();
		System.out.print("영어 점수 = > ");
		score[1] = input.nextInt();
		System.out.print("수학 점수 = > ");
		score[2] = input.nextInt();
		
		return score;
	} // end of input()
	
	
	// 입력 받은 점수들로 총점과 평균을 구해 출력
	static double calculate(int[] score) {
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		} // end of for
		
		avg = (double) total / score.length;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.1f", avg);
		System.out.println();
		
		return avg;
	} // end of calculate()
	
	
	// 평균값을 받아서 학점을 구하여 출력
	static void output(double avg) {
		switch ((int)avg/10) {
		case 10 :										// case9 코드 실행
		case 9 : System.out.println("A학점"); break;		// 90점 대
		case 8 : System.out.println("B학점"); break;		// 80점 대
		default : System.out.println("F학점"); break;		// 70점 대
		} // end of switch 
	} // end of output()
	
} // end of class
