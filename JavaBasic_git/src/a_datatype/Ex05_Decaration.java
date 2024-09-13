package a_datatype;

public class Ex05_Decaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int kor; // 정수형 변수 kor을 선언
//		
//		kor = 30; // 선언한 변수에 30을 대입
//		
//		// 초기화 = 변수 선언 + 값 대입
//		int eng = 50;
		
		int kor = 30, eng = 50;
		
		System.out.println("(println) kor의 값 : " + kor);
		System.out.print("(print) kor의 값 : " + kor + "\n");
		System.out.printf("(printf) kor의 값 : %d", kor);
		
		System.out.println();
		System.out.println();
		
		System.out.println("(println) kor의 값 : " + kor + ", eng의 값 : " + eng);
		System.out.print("(print) kor의 값 : " + kor + ", eng의 값 : " + eng + "\n" );
		System.out.printf("(printf) kor의 값 : %d, eng의 값 : %d\n\n", kor, eng);
		
		
		/*
		 * 
		 * 만약에 국어점수와 영어점수가 동일하니?
		 * 그렇다면 " 두 점수가 동일 " 이라고 출력
		 * 그렇지 않다면 " 두 점수가 다름 " 이라고 출력 
		 * 
		 */
		
		if (kor == eng)
		{
			System.out.println("두 점수가 동일\n");
		} else {
			System.out.println("두 점수가 다름\n");
		} // end of if 
		
		
		// 두 점수 맞바꾸기 => 두 변수의 값을 바꾸기
		// kor = 30, eng = 50
		// 바꾼 후 kor = 50, eng = 30
		
		System.out.println("[두 점수 맞바꾸기]");
		
		int temp = 0; // kor 값을 미리 저장해두기 위한 
		temp = kor;
		kor = eng;
		eng = temp;
		
		System.out.println("(println) kor의 값 : " + kor + ", eng의 값 : " + eng);
		System.out.print("(print) kor의 값 : " + kor + ", eng의 값 : " + eng + "\n" );
		System.out.printf("(printf) kor의 값 : %d, eng의 값 : %d\n\n", kor, eng);
		
		
		
		
		
	} // end of void main

} // end of class
