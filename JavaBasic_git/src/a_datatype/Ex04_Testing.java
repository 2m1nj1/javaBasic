package a_datatype;

/*
 * [참고] 자료형
 * 
 * 1. 기본형
 * 	' 논리형 : boolean
 * 	' 문자형 : char(2Byte)
 * 	' 정수형 : byte(1Byte), short(2Byte), int(4Byte), long(8Byte)
 * 	' 실수형 : float(4Byte), double(8Byte)
 * 
 * 2. 참조형 : 배열, 클래스
 * 
 * 
 * [기본]
 * 	변수의 자료형과 값의 자료형이 일치해야한다.
 * 	
 * 	ㄴ 하지만...
 * 	변수의 자료형과 값의 자료형이 안 맞는 경우
 * 		` 변수의 자료형 > 값의 자료형 : 메모리 낭비가 될 뿐.. 자동 해결
 * 		` 변수의 자료형 < 값의 자료형 : 자료형 변경이 필요하다 (casting)
 * 
 */

public class Ex04_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float f;
		double f_d;
		// f = 3.6; // Error
		f = (float)3.6; // casting
		f_d = 3.6;
		
		System.out.println("f = " + f);
		System.out.println("f_d = " + f_d);
		
		// -------------------------------
		
		double d; // 8B
		d = 100; // (공간) 8B = (값) 4B
		System.out.println("d = " + d);
		
		// -------------------------------
		// 정수형 변수 i에 36.99 실수 대입하고 출력
		int i;
		// i = 36.99 // Error
		i = (int)36.99;
		System.out.println("i = " + i); // 36
		
		// -------------------------------
		
		int su;
		su = 1000000000;
		// su = 10000000000; // Error! 공간 부족
		
		long big;
		big = 10000000000L;
		// big = 10000000000; // Error! 숫자 뒤에 대문자 L을 붙이지 않으면 값은 정수형으로 인식하는데 정수형의 크기보다 큰 숫자라서 error 발생
		
	}

}
