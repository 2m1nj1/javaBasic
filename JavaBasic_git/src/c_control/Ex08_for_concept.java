package c_control;

public class Ex08_for_concept {

	public static void main(String[] args) {
		
//		int result = 0;
//		for(int a=1 ; a<=100 ; a++) {
//			result = result + a;
//		} // end of for
//		
//		System.out.println("결과 : " + result);
//
//		for ( char ch = 'A' ; ch<='Z' ; ch++) {
//			System.out.println(ch);
//		} // end of for
//		
//		for ( char ch = '가' ; ch<='힣' ; ch++) {
//			System.out.println(ch);
//		} // end of for
//
//		for(int a = 10 ; a>=0 ; a--) {
//			System.out.println(a);
//		} // end of for
//		
//		for (char ch = 'Z' ; ch>='A' ; ch--) {
//			System.out.println(ch);
//		}
//

		// 1부터 10까지의 홀수의 합과 짝수의 합을 구하기
		int odd = 0; // 홀수
		int even = 0; // 짝수
		
		for (int i=1 ; i<=10 ; i++) {
			if (i % 2 == 0) {
				even += i;
				//System.out.println("짝수 더하기! " + even);
			} else {
				odd += i;
				//System.out.println("홀수 더하기! " + odd);
			}
		} // end of for
		
		System.out.println();
		System.out.println("====================");
		System.out.println();
		System.out.println(">> 홀수의 합 : " + odd);
		System.out.println(">> 짝수의 합 : " + even);
		
	} // end of void main

} // end of class
