package c_exercise;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		CalculatorExpr cal = new CalculatorExpr();
			Scanner input = new Scanner(System.in);
		
		
		int exit = 0;
		while(exit == 0) {
			System.out.println(">> 첫번째 숫자를 입력하세요.");
			cal.setNum1(input.nextInt());
			System.out.println(">> 두번째 숫자를 입력하세요.");
			cal.setNum2(input.nextInt());
			input.nextLine();
			
			System.out.println("추출된 숫자 : " + cal.getNum1() + ", " + cal.getNum2());
			System.out.println("덧셈 : " + cal.getAddtion());
			System.out.println("뺄셈 : " + cal.getSubtraction());
			System.out.println("곱셈 : " + cal.getMultiplication());
			System.out.println("나눗셈 : " + cal.getDivision());
			
			System.out.println(">> 계속 진행할까요? Y/N");
			String str = input.nextLine();
			
			if(str == "Y" | str == "y") {
				exit = 1;
				System.out.println("프로그램을 종료합니다!");
			} else if (str == "N" | str == "n") {
				continue;
			} // end of if
		} // end of while
		
	} // end of main()
} // end of class
