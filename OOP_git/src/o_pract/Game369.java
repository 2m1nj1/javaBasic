package o_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		
		int num = 0;
		
		// 숫자 입력 받고 확인하기
		while (true) {
			System.out.print(">> 숫자를 입력하세요! (1 <= N <= 100,000) : ");
			Scanner input = new Scanner(System.in);
			num = input.nextInt(); // 숫자 입력 받기
			
			// 숫자 확인하기
			if (chkNum(num) != 1) {
				break;
			} // end of if
		} // end of while
		
		
		ArrayList<String> numGame = new ArrayList<String>();
		ArrayList<String> num369 = new ArrayList<String>();
		int cnt369 = 0;
		
		for (int i = 0; i < num; i++) {
			String str = (new Integer(i+1)).toString();
			numGame.add(str);
			
			if(str.indexOf("3") != -1 | str.indexOf("6") != -1 | str.indexOf("9") != -1) {
				//System.out.println("짝");
				numGame.set(i, "짝!(" + (i+1) + ")");
				num369.add(new Integer(i+1).toString());
				cnt369++;
			}
			
			System.out.print(numGame.get(i));
			
			if(i == num -1) {
				continue;
			}
			
			System.out.print(" - ");
		} // end of for
		
		System.out.println();
		System.out.println("============================");
		System.out.print(num369); // 3,6,9 포함되어있는 숫자 list 출력
		System.out.print("에 숫자 3,6,9가 포함되어 총 ");
		System.out.print(cnt369); // 3,6,9 포함되어있는 숫자 cnt 
		System.out.print("회 손뼉을 칩니다.");
	} // end of main()

	
	public static int chkNum(int num) {
		int chk = 0;
		
		if (num < 1 | num > 100000) {
			System.err.println("범위에 맞지 않는 숫자입니다. 다시 입력하세요.");
			chk = 1;
		} // end of if
		
		return chk;
	} // end of chkNum()
} // end of class
