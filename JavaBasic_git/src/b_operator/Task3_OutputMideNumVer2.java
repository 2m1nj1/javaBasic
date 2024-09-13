package b_operator;

import java.util.Scanner;

public class Task3_OutputMideNumVer2 {

	public static void main(String[] args) {
		
		int num1, num2, num3; // 입력 받은 숫자 저장용 변수
		int temp; // 임시 저장용 변수
		// int max, mid, min;
		// 기존 변수를 활용하지 않고 다른 변수에 저장해야 한다면...
		// 위 변수에 입력 받은 숫자를 비교 후 대입
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("첫번째 숫자를 입력하세요 => ");
		num1 = input.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 => ");
		num2 = input.nextInt();
		System.out.printf("세번째 숫자를 입력하세요 => ");
		num3 = input.nextInt();
		System.out.println("--------------------------------------");
		System.out.printf(">> 입력 받은 숫자는 %d, %d, %d 입니다.\n", num1, num2, num3);
		
		// 1) 가장 큰 변수 알아내기
		// num1이 가장 큰 경우는 코드를 굳이 짤 필요없이 그대로 num1 자리 유지
		
		if (num2 >= num1 && num2 >= num3) {
			// num2가 가장 큰 경우, num2 num1 자리를 바꿔준다.
			temp = num1; // 기존 num1 값을 temp에 임시로 넣어둔다.
			num1 = num2;
			num2 = temp;
		} else if (num3 >= num1 && num3 >= num1) {
			// num3이 가장 큰 경우, num3 num1 자리를 바꿔준다.
			temp = num1; // 기존 num1 값을 temp에 임시로 넣어둔다.
			num1 = num3;
			num3 = temp;
		}
		
		// 2) 두번째로 큰 변수 알아내기 
		if (num2 < num3) {
			// num2 와 num3 크기 비교
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		
		System.out.println("--------------------------------------");
		System.out.printf(">> 큰 숫자부터 정렬하면 %d, %d, %d 입니다.\n", num1, num2, num3);
		System.out.println("--------------------------------------");
		System.out.printf(">> 중간 숫자는 %d 입니다.\n", num2);
		
		
		
		
	}

}
