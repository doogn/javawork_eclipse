package javastudy;

import java.util.*;

public class StringEx2 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	char ch = ' ';
	
	//����ڷκ��� �Է¹��� ���ڸ� ����/�����ڷ� ����
	System.out.println("���ڸ� �ϳ� �Է��ϼ���>>");
	
	String input = scanner.nextLine();
	ch = input.charAt(0);
	
	if('0' <= ch && ch <= '9') {
		System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�\n");
	}
	if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
		System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�\n");
	}
		
	
	//����ڷκ��� �Է¹��� �����ڸ� ��=>��, ��=>��� ��ȯ
	System.out.println("���ڸ� �ϳ� �Է��ϼ���>>");
	
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
		//toLowerCase(): �ҹ��ڷ�

	scanner.close();
		
	}
	
	
}

