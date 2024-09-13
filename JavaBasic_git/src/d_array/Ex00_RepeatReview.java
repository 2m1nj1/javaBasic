package d_array;

public class Ex00_RepeatReview {

	public static void main(String[] args) {

		// Math.random(); // 0.0 ~ 1.0 랜덤값
		// int temp = (int)(Math.random() * 10); // 0 ~ 10 랜덤값

		// for 문
		System.out.println("[ for ]");
		for (int i = 0; i < 6; i++) {
			int temp = (int) (Math.random() * 45) + 1; // 1 ~ 10 랜덤값
			System.out.print(temp + " / ");
		}
		
		System.out.println();
		System.out.println("==========================================");

		// while 문
		System.out.println("[ while ]");
		int j = 0;
		while (j < 6) {
			int temp = (int) (Math.random() * 45) + 1; // 1 ~ 10 랜덤값
			System.out.print(temp + " / ");
			j++;
		}
		
		System.out.println();
		System.out.println("==========================================");

		// do while문
		System.out.println("[ do while ]");
		int k = 0;
		do {
			int temp = (int) (Math.random() * 45) + 1; // 1 ~ 10 랜덤값
			System.out.print(temp + " / ");
			k++;
		} while (k < 6);

	} // end of void main

} // end of class
