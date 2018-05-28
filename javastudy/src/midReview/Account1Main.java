package midReview;

import java.util.Scanner;

public class Account1Main {

	public static void main(String[] args) {
		//객체 인스턴스화
		Account1 acct = new Account1(); //기본생성자로 객체 만듦
		
		//setter 접근
		acct.setBalance(10000);
		acct.setOwnername("홍길동");
		acct.setAccountnumber(101);
		acct.deposit(3000);
		
		//결과 출력
		System.out.println(acct);
		
		//생성자로 객체 생성
		Account1 acct2 = new Account1("홍길동", 102, 10000);
		acct2.deposit(5000);
		
		//결과 출력
		System.out.println(acct2);
		
		//그밖의 작업
		acct.withdraw(400);
		acct2.withdraw(5000);
		System.out.println(acct);
		System.out.println(acct2);
		
		//Scanner로 입력받음
		Account1 acct3 = new Account1();
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		acct3.setOwnername(name);
		System.out.print("계좌번호를 입력하세요: ");
		int number = scan.nextInt();
		acct3.setAccountnumber(number);
		System.out.println("입금 금액: ");
		int money = scan.nextInt();
		acct3.deposit(money);
		
		System.out.println(acct3);
		
	}

}
