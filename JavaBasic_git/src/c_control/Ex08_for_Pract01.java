package c_control;

public class Ex08_for_Pract01 {
	
	public static void main (String[] args) {
		
		/*
		 * 문제1) 1 ~ N까지의 숫자를 다음처럼 출력하라
		 * 
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 */
		
		for(int i=1 ; i<=15 ; i++) {
			System.out.print(i + " ");
			
			// 5의 배수의 차례에 \n 출력
			if(i % 5 == 0) {
				System.out.println();
			}
		} // end of fpr
		
	}
}
