package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_Review03 {

	public static void main(String[] args) {
		
		char[][] ch = input();
		output(ch);
	} // end of main()
	
	/*
	문자 배열에 저장된 문자들을 화면에 출력한다.
	*/
	static void output(char[][] ch) {
		for(int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j] + "\t");
			} // end of for j
			System.out.println();
		} // end of for i
	} // end of output()

	/*
	두 정수와 알파벳 문자 하나를 입력받는다
	[예] 3 4 F
	*/	
	static char[][] input() {
		Scanner input = new Scanner(System.in);
		System.out.println(">> 두 정수와 알파벳 문자 하나를 순서대로 입력하세요 [예] 3 4 F");
		String str = input.nextLine();
		
		char[][] ch = makeSquare(str);
		return ch;
	} // end of input()
	
	// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	//		입력받은 문자를 시작으로 저장한다. 
	/*
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 */
	static char[][] makeSquare(String str) { 
		int rpt1 = Character.getNumericValue(str.charAt(0));
		int rpt2 = Character.getNumericValue(str.charAt(2));
		char alp = str.charAt(4);
		
		char[][]  ch = new char[rpt1][rpt2];
		

		for(int i = 0; i < rpt1; i++) {
			for(int j = 0; j < rpt2; j++) {
				ch[i][j] = alp;
				alp++;
			} // end of for j
		} // end of for i
		
		return ch;
	} // end of makeSquare()

} // end of class
