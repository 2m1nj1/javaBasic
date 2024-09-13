package f_constructor;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		
		Student s1 = new Student();
						// 생성자 함수 
		
		System.out.println("======= 초기화 값 ====== ");
		System.out.println(s1.getName() + "님의 총점 : " + s1.calTotal());
		System.out.println(s1.getName() + "님의 평균 : " + s1.calAvg());
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print(">> 학생 이름 -> ");
		String name = input.next();
		System.out.print(">> 국어 점수 -> ");
		int kor = input.nextInt();
		System.out.print(">> 영어 점수-> ");
		int eng = input.nextInt();
		System.out.print(">> 수학 점수 -> ");
		int math = input.nextInt();
		
		// setter는 객체 생성 후, 값을 집어 넣는다면
		// constructor는 객체 생성 + 값 집어 넣기를 동시에 한다
		Student s2 = new Student(name, kor, eng, math);
		System.out.println(s2.getName() + "님의 총점 : " + s2.calTotal());
		System.out.println(s2.getName() + "님의 평균 : " + s2.calAvg());
		
	} // end of main()

} // end of class
