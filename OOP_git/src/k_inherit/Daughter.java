package k_inherit;

//************ 상속
public class Daughter extends Mommy {
	
	public Daughter() {
		System.out.println("딸 생성");
	} // end of Daughter()
	
	// Overriding : 부모 클래스와 자식 클래스가 똑같은 함수명을 가지고 있음
	public void gene() {
		System.out.println("자식은 자식이다");
	} // end of gene()
	
	public void study() {
		System.out.println("딸은 백수");
	} // end of job()
}
