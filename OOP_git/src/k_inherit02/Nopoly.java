package k_inherit02;

import java.util.Scanner;

public class Nopoly {

	public static void main(String[] args) {
		
		Book b = null;
		Dvd d = null;
		Cd c = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 상품 선택 (1.책 2.DVD 3.CD) -> ");
		int sel = input.nextInt();
		
		switch(sel) {
		case 1: b = new Book("001", "자바책", "ICT", "자바쌤"); break;
		case 2: d = new Dvd("002", "아바타", "AI", "자바쌤"); break;
		case 3: c = new Cd(); break;
		} // end of switch
		
		switch(sel) {
		case 1: b.output(); break;
		case 2: d.output(); break;
		case 3: c.output(); break;
		} // end of switch
		
	} // end of main()

} // end of class
