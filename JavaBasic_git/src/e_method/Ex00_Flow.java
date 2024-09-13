package e_method;

public class Ex00_Flow {
	
	public static void method() {
		System.out.println("method 실행");
	} // end of void method
	
	public static void main(String[] args) {

		System.out.println("main 시작");
		
		method();
		method();
		method();
		
		
		System.out.println("main 끝");
	} // end of void main
	
} // end of class
