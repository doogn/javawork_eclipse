package javastudy;

import java.util.Scanner;

public class Whileex {

	public static void main(String[] args) {
		
		// �Է��� ������ ��� ���ϱ�
		Scanner scanner = new Scanner(System.in);
		
		int count=0, n=0;
		double sum=0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��Ͻÿ�");
		while ((n = scanner.nextInt()) !=0 ){
			sum += n;
			count ++;
		}
		System.out.println("�ڷ��� ������ " + count +"���̸�");
		System.out.println("������ " + sum +"�̰�");
		System.out.println("����� " + sum/count + "�Դϴ�");

		// a���� z���� ����ϱ� (ASCII �ڵ� �� �̿�)
		char a = 'a';
		
		do {
			System.out.print(a);
			a = (char)(a+1);
		} while (a <= 'z');
		
		scanner.close();
		
	}
}