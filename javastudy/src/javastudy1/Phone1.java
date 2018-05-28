package javastudy1;

import java.util.Scanner;

public class Phone1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("이름과 전화번호를 입력>>");  //print도 메서드. 몇가지 자주 쓰는 기능은 new 안해도 자동으로 가져다 쓰게 해놓음
	String name1 = scanner.next();
	String tel1 = scanner.next();
	Phone a = new Phone(name1, tel1);  //객체 생성
	System.out.println(a.getName() +"의 번호는 "+a.getTel());
	
	scanner.close();
	}
	
}
