package d_array;

public class Ex03_TwoDimArryPract01 {

	public static void main(String[] args) {

		int a[][] = new int[][] { { 3, -5, 12 }, { -2, 11, 2, -7 }, { 21, -21, -35, -93, -11 }, { 9, 14, 39, -98 } };
		int hap [] = new int[a.length]; // 각 행의 값들의 합을 저장하기 위한 배열
		
		
		// 배열 a 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "/");
			} // end of for j
			System.out.println();
		} // end of for i
		
		
		int sum = 0;
		int sum2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
				sum2 += a[i][j];
			} // end of for j
			hap[i] = sum2;
			sum2 = 0;
		} // end of for i
		

		System.out.println("합 : " + sum);
		System.out.println("====================================");
		
		// =====================================================
		
		// 각 행의 합 출력
		for(int i = 0;i<hap.length; i++) {
			System.out.println(i + "번째 줄의 합 : " + hap[i]);
		} // end of hap
		
		System.out.println("====================================");
		// =====================================================
		
		// 각 행의 합 중에 가장 큰 값 출력
		int max = 0;
		int maxhap = 0;
		for(int i = 0; i<hap.length; i++) {
			if(i==0) maxhap = hap[i];
			
			if(maxhap < hap[i]) {
				maxhap = hap[i];
				max = i;
			}
		}
		
		System.out.println(max + "번째 줄의 합이 가장 큰 수이며, 그 수는 " + maxhap + " 입니다.");
		
		
		
		
		
	} // end of void main

} // end of class
