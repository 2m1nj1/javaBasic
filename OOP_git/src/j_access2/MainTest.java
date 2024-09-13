package j_access2;

import j_access2.sub.Access;

// Access 클래스와 MainTest 클래스가 다른 패키지(폴더)에 있는 경우

public class MainTest {

	public static void main(String[] args) {
		
		Access acc = new Access();
		//acc.a = "PRIVATE CHANGE";	// private만 변경이 안되고 나머지는 변경 가능
		acc.b = "PUBLIC CHANGE";
		
		//acc.c = "PROTECTED CHANGE";
		//acc.d = "DEFAULT CHANGE";
		
		acc.output();
	} // end of main()
} // end of class
