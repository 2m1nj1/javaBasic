package a_datatype;

public class Ex06_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 나이를 저장할 변수를 선언하고, 본인의 나이를 대입한 후 출력
		
		int age = 0;
		int yearBirth = 1999;
		int yearCurr = 2024;
		
		age = yearCurr - yearBirth ;
		
		System.out.println("(println) 내 나이 : " + age);
		System.out.printf("(print) 내 나이 : " + age + "\n");
		System.out.printf("(printf) 내 나이 : %d\n\n", age);
	
		
		// 본인의 키를 소숫점 포함한 데이터로 저장하고 출력
		double height = 0.0;
		
		height = 161.0;
		
		System.out.println("(println) 내 키 : " + height);
		System.out.printf("(print) 내 키 : " + height + "\n");
		System.out.printf("(printf) 내 키 : %.1f\n\n", height);
		
		// 이름을 저장할 변수를 선언하고 이름을 대입 후 출력
		char chName1 = '이';
		char chName2 = '민';
		char chName3 = '지';
		
		/*
		 * [참고]
		 * 문자	: char
		 * 문자열	: String (클래스 - 참조형)
		 */
		String strName = "이민지";
		System.out.println("제 이름은 " + strName + "입니다.");
		
	} // end of void main

} // end of class
