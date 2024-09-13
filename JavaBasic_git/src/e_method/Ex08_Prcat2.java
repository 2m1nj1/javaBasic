package e_method;

public class Ex08_Prcat2 {

	public static void main(String[] args) {
		muliple(2,3);
		muliple(4, 'ㅋ');
		muliple(2, 3, 'ㅋ');
		
	} // end of main()

	static void muliple(int a, int b) {
		System.out.println(a*b);
	} // end of mmuliple

	static void muliple(int a, char ch) {
		for(int i = 0; i < a; i++) {
			System.out.print(ch);
		} // end of for
		System.out.println();
	} // end of mmuliple

	static void muliple(int n, int m, char ch) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(ch);
			} // end of for j
		} // end of for i
	} // end of mmuliple

}
