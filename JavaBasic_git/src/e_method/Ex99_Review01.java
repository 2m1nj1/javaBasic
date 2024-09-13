package e_method;

public class Ex99_Review01 {

	public static void main(String[] args) {
		System.out.println("A");
		test();
		System.out.println("B");
	} // end of main()
	
	static void test() {
		System.out.println("C");
		sample();
		imsi();
		System.out.println("D");
	} // end of test()
	
	static void sample() {
		System.out.println("E");
	} // end of sample()
	
	static void imsi() {
		System.out.println("F");
	} // end of imsi()
	
} // end of class
