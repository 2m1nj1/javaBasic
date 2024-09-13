package j_access2.sub;

/*
 * 접근 지정자
 * 
 * 		- private : 다른 class에서 접근 불가 (다른 클래스X 다른 패키지X)
 * 		- public : 모든 곳에서 접근 가능 (다른 클래스O 다른 패키지O)
 * 		- protected :
 * 		- default (아무것도 지정하지 않음 ) : 동일한 패키지에서만 접근 가능 (다른 클래스O 다른 패키지X)
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
