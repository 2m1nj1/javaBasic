package o_pract;

import java.util.*;

public class AryChk {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Scanner input = new Scanner(System.in);
		String stop = "";
		
		while(true) {
			int i = input.nextInt();
			list.add(i);
			
			System.out.println(">> 숫자를 더 입력할까요? Y/N ");
			stop = input.nextLine();
			if (stop.equals("N") | stop.equals("n")) {
				break;
			} // end of if
		} // end of while
		
		
		
		
	} // end of main
	
	public static void solution() {
		
	} // end of solution()
	
	

} // end of class
