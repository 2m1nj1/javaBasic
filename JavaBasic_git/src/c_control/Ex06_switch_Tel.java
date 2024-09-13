package c_control;

import java.util.Scanner;

/*
 * 콘솔로 전화번호 입력 받아서
 * 지역 번호 추출
 * switch 문장을 이용하여 지역이름 출력하기 
 */

public class Ex06_switch_Tel {

	public static void main(String[] args) {
		
		System.out.printf("전화번호를 입력해주세요 (하이픈/띄어쓰기 제외) = > ");
		
		Scanner input = new Scanner(System.in);
		String telNum = input.next();
		
		String localNum = telNum.substring(0,3);
		String localName = "";
		
		switch(localNum) {
		case "02" :
			localName = "서울"; break;
		case "051" :
			localName = "부산"; break;
		case "053" :
			localName = "대구"; break;
		case "032" :
			localName = "인천"; break;
		case "062" :
			localName = "광주"; break;
		case "042" :
			localName = "대전"; break;
		case "031" :
			localName = "경기"; break;
		default :
			 localName = "한국";
		}
		
		
		System.out.println("해당 전화번호는 " + localName + "지역 전화번호 입니다.");
		
		
		
	} // end of void main

} // end of class
