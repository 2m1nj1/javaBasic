package k_inherit02;

public class Dvd extends Item {
	
	private String actor;
	private String supvsion;
	
	public Dvd() {
		this("0", "제목없음", "무명", "유명한");
	} // end of Dvd()
	
	public Dvd(String no, String name, String actor, String supvsion) {
		super(no, name);
		this.actor = actor;
		this.supvsion = supvsion;
	} // end of Dvd()
	
	public void output() {
		System.out.println("DVD 번호 : " + no);
		System.out.println("DVD 이름 : " + name);
		System.out.println("DVD 배우 : " + actor);
		System.out.println("DVD 감독 : " + supvsion);
	} // end of output()
} // end of class
