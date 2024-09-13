package d_array;

public class Ex05_BubbleSort {

	public static void main(String[] args) {

		/*
		 * 두 변수의 값 맞바꾸기 (Swapping)
		 * int a = 5, b = 6;
		 * int temp = a;
		 * a = b; b = temp;
		 */

		int[] lotto = { 45, 2, 15, 27, 10, 42 };

		// 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		// 버블 정렬
		for(int i =lotto.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(lotto[j] > lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
				} // end of if
				
			} // end of for j
			
		} // end of for i
		
		
		// 선택 정렬
		
		
		// 삽입 정렬
		

	} // end of void main

} // end of class
