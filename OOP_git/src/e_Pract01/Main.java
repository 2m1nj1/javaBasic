package e_Pract01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Product prd = null;		// 클래스 변수 선언
		prd = new Product();	// 객체 생성
		
		Scanner input = new Scanner(System.in);
		System.out.print("상품번호를 입력하세요 -> ");
		prd.setProductNo(input.nextLine());
		System.out.print("상품명을 입력하세요 -> ");
		prd.setProductName(input.nextLine());
		System.out.print("초기재고량을 입력하세요 -> ");
		prd.setStock(input.nextInt());
		
		input.nextLine();
		System.out.println();
		System.out.print("판매량을 입력하세요 -> ");
		prd.sale(input.nextInt());
		
		System.out.println();
		System.out.print("입고량을 입력하세요 -> ");
		prd.income(input.nextInt());
		
		
		
	} // end of main()
} // end of class
