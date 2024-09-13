package f_constructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정보를 입력할 학생 수를 입력 =- > ");
		int stuNum = input.nextInt(); // 학생 수 
		
		Student s[] = new Student[stuNum]; // 학생 수 만큼의 배열 생성
		
		// 학생 수 만큼 정보를 입력 받는 code 반복
		for (int i = 0; i < stuNum; i++) {
			
			System.out.print(">> 학생 이름 -> ");
			String name = input.next();
			System.out.print(">> 국어 점수 -> ");
			int kor = input.nextInt();
			System.out.print(">> 영어 점수-> ");
			int eng = input.nextInt();
			System.out.print(">> 수학 점수 -> ");
			int math = input.nextInt();
			
			s[i] = new Student(name, kor, eng, math);
			System.out.println(s[i].getName() + "님의 총점 : " + s[i].calTotal());
			System.out.println(s[i].getName() + "님의 평균 : " + s[i].calAvg());
		} // end of for
		
	} // end of main()

} // end of class
