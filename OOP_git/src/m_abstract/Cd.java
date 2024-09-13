package m_abstract;

public class Cd extends Item {
	
	private String singer;
	
	public Cd() {
		this("0", "제목없음", "무명");
	} // end of Cd()
	
	public Cd(String no, String name, String singer) {
		super(no, name);
		this.singer = singer;
	} // end of Cd()
	
	public void output() {
		System.out.println("CD 번호 : " + no);
		System.out.println("CD 이름 : " + name);
		System.out.println("CD 가수 : " + singer);
	} // end of output()
}
