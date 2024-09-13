package e_Pract02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(">> 입력 할 학생 수는? ");
		int stuNum = input.nextInt();
		input.nextLine();
		Student[] stu = new Student[stuNum];
		
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
			System.out.print(">> " + (i+1) + "번째 학생의 정보 입력? ");
			stu[i].setStuInfo(input.nextLine());
			//System.out.println(stu[i].getStuInfo());
		} // end of for i
		
		// 그냥 받는 대로 출력 
		for (int i = 0; i < stu.length; i++) {
			stu[i].output();
		} // end of for i
		
		
		
	} // end of main()
} // end of class
