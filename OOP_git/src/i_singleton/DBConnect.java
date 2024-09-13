package i_singleton;

public class DBConnect {

	private DBConnect() {
		System.out.println("실제 디비에 연결함");
	} // end of DBConnect()
	
	static DBConnect dbconn;
	
	// static이 붙은 애들은 먼저 메모리에 올라오는데...
	// 그래서 static 변수만 사용 가능... 
	// private 변수 사용 시 인식 못함... 갸웃...
	public static DBConnect getInstance() {
		if (dbconn == null) dbconn = new DBConnect();
		return dbconn;
	} // end of getInstance()
} // end of class
