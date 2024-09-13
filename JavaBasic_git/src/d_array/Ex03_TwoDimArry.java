package d_array;

public class Ex03_TwoDimArry {

	public static void main(String[] args) {

		char[][] alpha = new char[3][4];
		char ch = 'A';

		// 값 입력
		for (int i = 0; i < alpha.length; i++) {
			for(int j = 0; j<4; j++) {
				alpha[i][j] = ch;
				ch++;
			} // end of for j
			
		} // end of for i

		// 값 출력
		for (int i = 0; i < alpha.length; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(alpha[i][j] + " ");
			} // end of for j
			System.out.println();
		} // end of for i

	} // end of void main

} // end of class
