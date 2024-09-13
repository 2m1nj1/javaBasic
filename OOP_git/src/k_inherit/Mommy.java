package k_inherit;

public class Mommy extends Object { // 직접 타이핑 하지 않아도 기본적으로 Object 클래스를 상속한다

	public Mommy() {
		System.out.println("엄마 생성");
	} // end of Mommy()
	
	public void gene() {
		System.out.println("부모는 부모다");
	} // end of gene()
	
	public void job() {
		System.out.println("엄마는 대장");
	} // end of job()

} // end of class
