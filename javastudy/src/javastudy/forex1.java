package javastudy;

import java.util.Scanner;

public class forex1 {

	public static void main(String[] args) {
		
		//ȭ�鿡 1~5���� ���� ����ִ� ����
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.println("");
		
		//���� ����� for������ �����Ͽ� ���
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println("");
		
		
		//ȭ�鿡 1���� 10���� ���� ����� ����ϴ� ����
		int sum = 0;
		for(int i2=1; i2<=10; i2++) {
			sum += i2;
			System.out.print(i2);
			
			if(i2<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.println(sum);
			}
		}
		System.out.println("");
		
		//����ڷκ��� �Է¹��� ���� �ݺ�
		int dan;
		System.out.println("���� �Է��ϼ���>>");
		Scanner scanner = new Scanner(System.in);
		dan = scanner.nextInt();
		for (int i3=1; i3<=9; i3++){
			System.out.println(dan +"*" + i3 + " = " + dan*i3);
		}
		System.out.println();
		
		//2�� ��ø�� �̿��� ������ ����ϱ�
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
				
		// �Է¹��� ������ ������ ����ϱ�
		int dan2;
		System.out.println("���� �Է��ϼ���>>");
		dan2 = scanner.nextInt();
		
		for (int i=1; i<=dan2; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
                }
			System.out.println();
		}
	
		scanner.close();
		
	}
	
}

