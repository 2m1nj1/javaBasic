package e_method;

/*
 * call by Reference
 * 메소드의 인자(파라미터)가 참조형인 경우
 * 
 * = > 주소를 복사
 */

public class Ex06_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");	// 참조형 
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("2. A = " + a + ", B = " + b);
		// a와 b는 참조형 변수이기 때문에 class내 타 멤버 함수로 인해 영향을 받게 된다.
		
	} // end of main()

	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("1. A = " + a + ", B = " + b);
	} // end of add()
	
} // end of class
