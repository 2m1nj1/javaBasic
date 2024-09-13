package c_control;

public class Ex17_TreeSixNine {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			int num = i; 					// 변수 i의 값을 변수 num에 대입
			boolean num369 = false;			// boolean형 변수 초기화
			
			while (num != 0) {
				// 입력된 숫자가 0이 아닐 때, while문 실행
				
				int remain = num%10;		// int형 변수 reamin(나머지)에 num%10의 값 입력
											// e.g.	num : 37	remain : 7 
				
				if (remain == 3 | remain == 6 | remain == 9) {
					// remain(나머지)가 3이거나 6이거나 9일 때, if문 실행
					System.out.print("짝"); 	// Console에 "짝" 출력
					num369 = true;			// boolean형 변수 num369에 true값 대입
				} // end of if num
				
				num = num/10; 				// int형 변수 num에 num/10의 값 대입
											// e.g. num : 3
											//		while 반복 (예시의 37은 37/10 = 3이니, 한번 더 반복!)
			} // end of while num
			
			
			if(!num369) System.out.println(i);	// boolean형 변수 num369의 값이 false일 때, 정수형 변수 i 값 출력
			else System.out.println();			// 							 ture 일 때, \n

		} // end of for i

	} // end of void main

} // end of class
