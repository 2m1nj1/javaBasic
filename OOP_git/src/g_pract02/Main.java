package g_pract02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(">> 예금주 입력 -> ");
		String userName = input.nextLine();
		System.out.print(">> 계좌번호 입력 -> ");
		String accntNo = input.nextLine();
		System.out.print(">> 초기잔액 입력 -> ");
		int left_money = input.nextInt();
		input.nextLine();
		
		Account accnt = new Account(userName, accntNo, left_money);
		
		System.out.print(">> 인출 금액 입력 -> ");
		accnt.output_money(input.nextInt());
		
		System.out.print(">> 입금 금액 입력 -> ");
		accnt.input_money(input.nextInt());
		
		accnt.accntInfo();
		
	} // end of main

} // end of class
