package e_method;

import java.util.Scanner;

public class Ex05_ConceptPract {

	public static void main(String[] args) {
		char alp = '0';
		
		Scanner input = new Scanner(System.in);
		System.out.print("대소문자 알파벳 하나를 입력하세요 = > ");
		String str = input.nextLine();
		alp = str.charAt(0);
		
		boolean chkLowResult = checkLower(alp);
		char chkUpResult = checkUpper(alp);
		
		System.out.println("checkLower = " + chkLowResult);
		System.out.println("checkUpper = " + chkUpResult);
		
	} // end of main()
	
	static boolean checkLower(char alp) {
		
		boolean result = true;
		
		if (alp >= 'a' & alp <= 'z' ) {
			result = true;
		} else if (alp >= 'A' & alp <= 'Z') {
			result = false;
		}
		
		return result;
	} // end of checkLower()
	
	static char checkUpper(char alp) {
		
		char result = 0;
		
		if (alp >= 'a' & alp <= 'z' ) {
			result = (char) (alp - 32);
		} else if (alp >= 'A' & alp <= 'Z') {
			result = (char) (alp + 32);
		}
		
		return result;
	} // end of checkUpper()

} // end of class
