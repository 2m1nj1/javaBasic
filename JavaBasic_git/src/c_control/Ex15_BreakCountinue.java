package c_control;

public class Ex15_BreakCountinue {

	public static void main(String[] args) {

//		END : 
//		for (int i = 0; i < 2; i++) {
//			
//			for (int j = 0; j < 3; j++) {
//				if (j == 1)
//					//continue; //00 02 데이타 10 12 데이타
//					//break;
//					//break END; // label의 반복문을 벗어난다
//					continue END; //00 10
//				System.out.printf(" < %d, %d > \n", i, j);
//			} // end of for j
//			
//			
//			System.out.println("데이타");
//		} // end of for i

		int i = 0, j = 0, k = 0;

		OUTER: for (i = 0; i < 10; i++) {

			MIDDLE: for (j = 0; j < 3; j++) {

				INNER: for (k = 0; k < 4; k++) {
					if (i == 4 && j == 2)
						break OUTER;
				}
			}
		}

		System.out.println(i);

		System.out.println(j);

		System.out.println(k);
	} // end of void

}
