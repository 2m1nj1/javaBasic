package e_method;

/*
 * Overloading
 * 	- method(함수)명이 동일한 함수들
 * 	- 인자, 자료형, 갯수가 다른 경우
 */


public class Ex08_Overloading {

	public static void main(String[] args) {
		String str = new String("홍길순");
		StringBuffer sb = new StringBuffer("홍길자");
		char[] ch = new char[] {'홍', '길', '동'};
		
		System.out.println(str);	// printString
		System.out.println(sb);		// printObject
		System.out.println(ch);		// printCharArray
	} // end of main()

} // end of class
