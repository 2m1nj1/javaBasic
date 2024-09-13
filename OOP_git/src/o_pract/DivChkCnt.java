package o_pract;

import java.util.*;

public class DivChkCnt {

	public static void main(String[] args) {
		
		// 3개의 숫자 입력 받기
		int mod1 		= inputNum();
		int mod2 		= inputNum();
		int max_range 	= inputNum();
		
		int result 		= solution(mod1, mod2, max_range);
		
		System.out.printf("mod1 = %d, mod2 = %d, max_range = %d 일 때, ", mod1, mod2, max_range);
		System.out.printf("1 이상 %d 이하의 자연수 중 조건에 맞는 숫자는 ", max_range);
		System.out.print("의 " + result + "개가 존재하므로 " + result + "를 return 합니다.");
		
	} // end of main()
	
	public static int solution(int mod1, int mod2, int max_range) {
		int result = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= max_range; i++) {
			if (i % mod1 == 0 & i % mod2 != 0) {
				list.add(i);
				result++;
			} // end of if
		} // end of for i

		return result;
	} // end of solution()
	
	public static int chkNum(int num) {
		int chk = 0;
		
		if (num < 1 | num > 100000) {
			System.err.println("범위에 맞지 않는 숫자입니다. 다시 입력하세요.");
			chk = 1;
		} // end of if
		
		return chk;
	} // end of chkNum()
	
	
	public static int inputNum() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		// 숫자 확인
		while(true) {
			System.out.println(">> 숫자를 입력하세요. (1 <= N <= 100,000,000) ");
			num = input.nextInt();
			
			if (chkNum(num) != 1) {
				break;
			} // end of if
		} // end of while
		
		return num;
	} // end of inputNum()

} // end of class
