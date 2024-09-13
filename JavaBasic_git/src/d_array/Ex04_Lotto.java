package d_array;

public class Ex04_Lotto {

	public static void main(String[] args) {

		int[][] lotto = new int[5][6];

		// 값 입력
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				lotto[i][j] = (int) (Math.random() * 45) + 1;

				// 조 내 중복 숫자 확인
				for (int k = 0; k < j; k++) {
					if (lotto[i][j] == lotto[i][k]) {
						j--;
					} // end of if
				} // end of for k
			} // end of for j
		} // end of for i

		// 값 출력

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j] + "\t");
			}
			System.out.print("\n\n");
		}

	} // end of void main

} // end of class
