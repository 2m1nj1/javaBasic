package g_pract02;

public class Account {
	private String userName;
	private String accntNo;
	private int left_money;
	
	//  생성자 함수
	public Account(String userName, String accntNo, int left_money) {
		this.userName = userName;
		this.accntNo = accntNo;
		this.left_money = left_money;
	} // end of Account()
	
	public void input_money(int money) {
		// 돈 입금
		left_money += money;
		
		System.out.println("입금한 금액 : " + money);
		System.out.println("잔액 : " + left_money);
	} // end of input_money()
	
	public void output_money(int money) {
		
		if(money > left_money) {
			// 잔액 부족 시
			money = 0;
			System.out.println("잔액이 부족합니다.");
		} else {
			// 잔액 충분 => 출금
			left_money -= money;
		} // end of if
		
		System.out.println("출금한 금액 : " + money);
		System.out.println("잔액 : " + left_money);
	} // end of output_money()
	
	public void accntInfo() {
		// 계좌정보 출력
		System.out.println("=======================================================");
		System.out.println("예금주 : " + userName + ", 계좌번호 : " + accntNo + ", 잔액 : " + left_money);
	} // end of accntInfo()
	
} // end of class
