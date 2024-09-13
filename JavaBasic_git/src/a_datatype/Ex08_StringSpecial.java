package a_datatype;


/*
 *  String 은 참조형 클래스
 *  
 *  	=> 참조형은 무조건 new 연산자로 메모리 확보를 해야한다.
 *  	=> 단, 하나 String 특권으로 new 생략해도 된다.
 */

public class Ex08_StringSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String name 	= new String("홍길동"); 	//=> 참조형은 무조건 new 연산자로 메모리 확보를 해야한다.
		String name 	= "홍길동";
		String name2 	= "홍길동"; 				//=> 단, 하나 String 특권으로 new 생략해도 된다.
		
		
		if (name == name2) { // 주소값을 비교한 것. String은 참조형이기 때문에
			System.out.println("주소가 같다");
		} else {
			System.out.println("주소가 다르다");
		} // end of if
		
		/*
		 * [Result]
		 * 주소가 같다
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
