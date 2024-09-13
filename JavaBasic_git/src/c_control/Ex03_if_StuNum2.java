package c_control;

import java.util.Scanner;

public class Ex03_if_StuNum2 {

	public static void main(String[] args) {
		// String stuNum = "2017111001";
		
		String stuNum = "";
		int cnt_stuNum = 0;
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		while(i == 0) {
			System.out.printf("학번 10자리를 입력하세요. = > ");
			stuNum = input.next();
			
			cnt_stuNum = (Integer)stuNum.length(); // 입력된 문자열의 길이 확인
			
			// 학번이 10자리가 아닌 경우
			if(cnt_stuNum == 10) {
				break;
			} // end of if
			
			System.out.println("잘못된 학번을 입력했습니다.");
			System.out.println();
		} // end of for

		String entYear = stuNum.substring(0, 4); // 입학년도
		String collNum = stuNum.substring(4, 5); // 1: 공대, 2: 사회대
		// System.out.println(collNum);
		String departNum = stuNum.substring(5, 7);

		String collage = "";
		String depart = "";

		if (collNum.equals("1")) {
			// 1 : 공대
			collage = "공대";

			switch (departNum) {
			case "11":
				depart = "컴퓨터학과"; break;
			case "12":
				depart = "소프트웨어학과"; break;
			case "13":
				depart = "모바일학과"; break;
			case "22":
				depart = "자바학과"; break;
			case "33":
				depart = "서버학과"; break;
			}

		} else if (collNum.equals("2")) {
			// 2 : 사회대
			collage = "사회대";

			switch (departNum) {
			case "11":
				depart = "사회학과"; break;
			case "12":
				depart = "경영학과"; break;
			case "13":
				depart = "경제학과"; break;
			}
		}

		System.out.println(stuNum + " 는 " + entYear + "년도에 입학한 " + collage + " " + depart + " 학생입니다.");

	}

}
