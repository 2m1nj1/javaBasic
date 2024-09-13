package a_datatype;

import java.util.Scanner;

public class Ex10_nextNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testNext, testNextLine;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("[next()] 값을 입력하시오 => ");
		testNext = input.next(); // 개행문자 무시하고 입력을 받는다.
		System.out.printf("next()를 이용한 입력 값 = %s", testNext);
		
		System.out.println();
		
		testNextLine = input.nextLine();
		// 위의 next() 입력을 위해 enter를 친 것이 입력 되어 프로그램 자체가 종료되기 때문에
		// 일부러 미리 enter 값을 제외 하기 위해서 nextLine()을 한 번 더 입력
		
		System.out.print("[nextLine()] 값을 입력하시오 => ");
		testNextLine = input.nextLine();
		System.out.printf("nextLine()을 이용한 입력 값 = %s", testNextLine);
		
		
	} // end of void main

} // end of class
