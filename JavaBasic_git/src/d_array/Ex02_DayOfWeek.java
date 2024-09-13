package d_array;

import java.util.*;

public class Ex02_DayOfWeek {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 날짜 확인");
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+1 + "월"); // 0~11 : 1~12월
		System.out.println(cal.get(Calendar.DATE) + "일");
		
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 1~7 : 일~토
		
		String[] DayOfWeek = { "일", "월", "화", "수", "목", "굼", "토" };
		//System.out.println(DayOfWeek[cal.get(Calendar.DAY_OF_WEEK) - 1] + "요일");
		int DayOfWeekNum = cal.get(Calendar.DAY_OF_WEEK) - 1;	// 위 코드의 println 내 변수가 너무 길어서 위로 한번 빼줌
		System.out.println(DayOfWeek[DayOfWeekNum] + "요일");
		
		

		System.out.println();
		System.out.println("현재 시간 확인");
		System.out.println(cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초");

	} // end of void main

} // end of class
