package b_operator;

public class Ex05_Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 4; 				// 00000000 00000000 00000000 00000100
		int result = a >> 2; 	// 00000000 00000000 00000000 00000001 
		
		System.out.println("a>>2 한 결과 : " + result); // 1
		
		// ------------------------------------------------------------
		
		int result2 = a << 2;	// 00000000 00000000 00000000 00010000
		
		System.out.println("a<<2 한 결과 : " + result2); // 16
		
		// ------------------------------------------------------------
		
		int b = -4;
		int resultB1 = b >> 2;
		int resultB2 = b >>> 2;
		
		System.out.println("b>>2 한 결과 : " + resultB1);
		System.out.println("b>>>2 한 결과 : " + resultB2);
		
		// ------------------------------------------------------------
		
	}

}
