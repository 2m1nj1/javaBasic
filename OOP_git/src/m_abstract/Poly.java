package m_abstract;

import java.util.Scanner;


// *** 다형성

public class Poly {

	public static void main(String[] args) {
		
		Item i = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 상품 선택 (1.책 2.DVD 3.CD) -> ");
		int sel = input.nextInt();
		
		switch(sel) {
		case 1: i = new Book("001", "자바책", "ICT", "자바쌤"); break;
		case 2: i = new Dvd("002", "아바타", "AI", "자바쌤"); break;
		case 3: i = new Cd(); break;
		} // end of switch
		
		i.output();
		
	} // end of main()

} // end of class
