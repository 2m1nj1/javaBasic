package e_method;

public class Ex06_CallByString {

	public static void main(String[] args) {
		String a = "안녕";
		String b = "하이";
		
		add(a, b);
		System.out.println("2. A = " + a + ", B = " + b);
		
		// Console result
		// 1. A = 안녕하이, B = 하이
		// 2. A = 안녕, B = 하이
		
	} // end of main()
	
	static void add(String a, String b) {
		a += b;
		System.out.println("1. A = " + a + ", B = " + b);
	} // end of add()

} // end of class
