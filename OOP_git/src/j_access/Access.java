package j_access;

/*
 * 접근 지정자
 * 
 * 		- private : 다른 class에서 접근 불가
 * 		- public : 
 * 		- protected :
 * 		- default (아무것도 지정하지 않음 ) :
 * 
 */

public class Access {
	
	private 	String a = "PRIVATE DATA";
	public		String b = "PUBLIC DATA";
	protected 	String c = "PROTECTED DATA";
				String d = "DEFAULT DATA";
	
	public void output() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	} // end of output()
	
} // end of class
