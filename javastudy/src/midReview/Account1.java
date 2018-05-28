package midReview;

public class Account1 {  //main 메서드가 없는 class

		private String ownername;   
		private int accountnumber;
		private int balance;
		// 필드가 private일 때는 ==> setter/getter 메서드로 접근 (캡슐화, 정보은닉)
		// 필드가 public일때는 ==> 객체명.필드= 값 (생성자) 로 접근
		
		// 생성자 => 기본 생성자 1개
		public Account1() {
			super();
		}
		
		// 생성자 => 매개변수가 있는 생성자 (3개)
		public Account1(String ownername, int accountnumber, int balance) {
			super();
			this.ownername = ownername;
			this.accountnumber = accountnumber;
			this.balance = balance;
		}

		// getter/setter 메서드 (public일 때는 굳이 필요 없음)
		
		public String getOwnername() {
			return ownername;
		}

		public void setOwnername(String ownername) {
			this.ownername = ownername;
		}

		public int getAccountnumber() {
			return accountnumber;
		}

		public void setAccountnumber(int accountnumber) {
			this.accountnumber = accountnumber;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		// 추가 기능 메서드
		public void deposit(int amount ) {
			this.balance = this.balance + amount; // this 생략해도 됨
		}
		
		public void withdraw(int amount ) {
			this.balance = this.balance - amount;
		}
		
		// 결과 출력 메서드
		public String toString() {
			String resultString = "";
			resultString += "예금주 이름" + getOwnername() + "\n";
			resultString += "계좌번호" + getAccountnumber() + "\n";
			resultString += "잔고" + getBalance() + "\n";
			return resultString;
		}

	
}
