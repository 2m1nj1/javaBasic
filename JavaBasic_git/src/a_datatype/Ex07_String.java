package a_datatype;

/*
 * [주의] String 이름으로 클래스명 지정하면 안된다. 
 * 
 * [ 데이터 타입 - 자료형 ]
 * 1. 기본형
 * 2. 참조형 : 배열, 클래스
 * 		=> 반드시 예약어 new를 메모리 확보를 해야한다.
 * 
 * 		* String 은 JAVA가 제공하는 Class
 */

public class Ex07_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 30;
		
		String name;
		name = new String("홍길동");
		
		String name2 = new String("홍길동");
		
		
		/*
		 * name 변수 값과 name2 변수의 값이 같다면 "이름이 같다" 출력
		 * 그렇지 않다면 "이름이 다르다" 출력
		 */
		
		if (name == name2) { // 주소값을 비교한 것. String은 참조형이기 때문에
			System.out.println("주소가 같다");
		} else {
			System.out.println("주소가 다르다");
		} // end of if
		
		/*
		 * [Result]
		 * 주소가 다르다
		 */
		
		
		if (name.equals(name2)) { // >>진짜<< 문자열을 비교하는 방법
			System.out.println("이름이 같다");
		} else {
			System.out.println("이름이 다르다");
		} // end of if
		
		/*
		 * [Result]
		 * 이름이 같다
		 */
		
		
		
		
	} // end of void main

} // end of class
