package javastudy;

import java.util.Scanner;  //Scanner ����� ���� ���̺귯�� ȣ��

public class switchex1 {

	public static void main(String[] args) {

		//�⺻ switch
		int num = 6;
		switch(num){
		case 1:
			System.out.println("SK");
			break;
		case 6:
			System.out.println("KTF");
			break;
		default: System.out.println("unknown");
		}
		
		//Ű����κ��� �Է¹޾Ƽ� ó��
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� �Է��ϼ���");
		int month = 0;
		month = scanner.nextInt();
		switch(month){
		case 3: case 4: case 5:  //if ((month >= 3) && (month <= 5))
			System.out.println("���� ���Դϴ�");
			break;
		case 6: case 7: case 8:
			System.out.println("���� �����Դϴ�");
			break;
		case 9: case 10: case 11:
			System.out.println("���� �����Դϴ�");
			break;
		default:
			System.out.println("���� �ܿ��Դϴ�");
		}
		
		//������� ������ �������� �ۼ��ϴ� ��
		int score = 0;
		System.out.println("������ �Է��ϼ���>>");
		score = scanner.nextInt();
		switch(score/10){  //���� �ڸ��� (99~90)/10 => 9 
							//(int ���¿��� �Ҽ��� �Ʒ��� �ڵ����� ����)
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default:
			System.out.println("C");
		}

		
		
		scanner.close();
		
		
	}

}
