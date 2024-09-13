package c_control;

import java.util.Scanner;

public class Ex03_if_StuNum {

	public static void main(String[] args) {
		
		//String stuNum = "2017111001";
		
		String stuNum = "";
		Scanner input = new Scanner(System.in);
		
		System.out.printf("학번 10자리를 입력하세요. = > ");
		stuNum = input.next();
		
		String entYear = stuNum.substring(0,4); // 입학년도
		String collNum = stuNum.substring(4,5); // 1: 공대, 2: 사회대
		//System.out.println(collNum);
		String departNum = stuNum.substring(5,7);
		
		String collage = "";
		String depart = "";
		

		
		if(collNum.equals("1")) {
			// 1 : 공대
			collage = "공대";
			
			if(departNum.equals("11")) {
				depart = "컴퓨터학과";
			} else if (departNum.equals("12")) {
				depart = "소프트웨어학과";
			} else if (departNum.equals("13")) {
				depart = "모바일학과";
			} else if (departNum.equals("22")) {
				depart = "자바학과";
			} else if (departNum.equals("33")) {
				depart = "서버학과";
			}
		} else if (collNum.equals("2")) {
			// 2 : 사회대
			collage = "사회대";
			
			if(departNum.equals("11")) {
				depart = "사회학과";
			} else if (departNum.equals("12")) {
				depart = "경영학과";
			} else if (departNum.equals("13")) {
				depart = "경제학과";
			} 
		}
		
		
		System.out.println(stuNum + " 는 " + entYear + "년도에 입학한 " + collage + depart + " 학생입니다.");

	}

}
