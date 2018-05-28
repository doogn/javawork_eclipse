package javastudy;

import java.util.*;

public class StringEx2 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	char ch = ' ';
	
	//사용자로부터 입력받은 문자를 숫자/영문자로 구분
	System.out.println("문자를 하나 입력하세요>>");
	
	String input = scanner.nextLine();
	ch = input.charAt(0);
	
	if('0' <= ch && ch <= '9') {
		System.out.println("입력하신 문자는 숫자입니다\n");
	}
	if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
		System.out.println("입력하신 문자는 영문자입니다\n");
	}
		
	
	//사용자로부터 입력받은 영문자를 대=>소, 소=>대로 변환
	System.out.println("문자를 하나 입력하세요>>");
	
	char ch2 = ' ';
	String input2 = scanner.nextLine();
	ch2 = input2.charAt(0);
	
	if('a' <= ch2 && ch2 <= 'z') {
		ch2 = (char) (ch2 - 32);
	} else if ('A' <= ch2 && ch2 <= 'Z') {
		ch2 = (char) (ch2 + 32);
	}
		System.out.println(ch2);
		System.out.println(input2.toUpperCase());
		//toLowerCase(): 소문자로

	scanner.close();
		
	}
	
	
}

