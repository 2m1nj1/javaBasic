package c_control;

import java.time.LocalDate;
import java.util.Calendar;

public class Ex04_if_Age {

	public static void main(String[] args) {
		
		String resiNum = "990105-2012345";
		
		String str_yearBirth = resiNum.substring(0,2); // 99
		int int_yearBirth = Integer.parseInt(str_yearBirth);
		String str_monthBirth = resiNum.substring(2,4);
		int int_monthBirth = Integer.parseInt(str_monthBirth);
		String str_dayBirth = resiNum.substring(4,6);
		int int_dayBirth = Integer.parseInt(str_dayBirth);
		// 참조형과 기본형끼리는 casting이 안되기 때문에 문자열을 형변환 해줘야 한다.
		
		//올해 년도 구하기
		LocalDate now = LocalDate.now();
		// Calendar cal = Calendar.getInstance();
		
		int currYear = now.getYear(); // 올해 년도 
		int currMonth = now.getMonthValue();
		int currDay = now.getDayOfMonth();
		int korAge = 0;
		int age = 0;
		int cent = 0;
		int temp = 0;
		
		String genderNum = resiNum.substring(7,8);
		
		if(genderNum.equals("1") | genderNum.equals("2")) {
			cent = 1900;
		} else if (genderNum.equals("3") | genderNum.equals("4")) {
			cent = 2000;
		}
		
		korAge = currYear - (cent + int_yearBirth) + 1;
		
		// 만 나이
		// temp = currYear - (cent + int_yearBirth);
		if(currMonth * 100 + currDay < int_monthBirth * 100 + int_dayBirth ) {
			age = korAge - 2;
		} else {
			age = korAge - 1;
		}
		
		System.out.println("한국	나이 : " + korAge);
		System.out.println("만	나이 : " + age);


	}

}
