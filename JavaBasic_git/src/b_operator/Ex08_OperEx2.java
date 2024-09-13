package b_operator;

public class Ex08_OperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 15;			// 00000000 00000000 00000000 00001111
		int b = 10;			// 00000000 00000000 00000000 00001010
		
		int and = a & b;	// 00000000 00000000 00000000 00001010
		System.out.println("and = " + and); // 10
		
		int or = a | b;		// 00000000 00000000 00000000 00001111
		System.out.println("or = " + or); // 15
		
		int xor = a ^ b;		// 00000000 00000000 00000000 00000101
		System.out.println("xor = " + xor); // 5
		
	} // end of void main

} // end of class
