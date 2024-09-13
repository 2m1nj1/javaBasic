package c_control;

public class Ex10_for_OverlapAlp {

	public static void main(String[] args) {
		
		// 문제1
//		for(int i = 0; i < 26; i++) {
//			for(char ch = 'A'; ch <= 'A'+i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=====================================");
//		
//		//문제2
//		for(int i = 0; i < 26; i++) {
//			for(char ch = 'A'; ch <= 'Z'-i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("=====================================");
//		
//		// 문제3
//		for (int i = 0; i < 26; i++) {
//			for (char ch = 'Z'; ch >= 'Z' - i; ch--) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		
		System.out.println("=====================================");
		
		// 문제4
		for (int i = 0; i < 26; i++) {

			for (char ch = 'A'; ch <= 'Z'-i; ch++) {	
				char res = (char)(ch+i);
				System.out.print(res);
			}
			System.out.println();
		}		
		
	
	} // end of void main
	
} // end of calss
