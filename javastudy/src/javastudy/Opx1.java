package javastudy;

import java.util.Scanner;

public class Opx1 {

	public static void main(String[] args) {
	//����: �� ������ ������ �Է¹޾� ���, ���, �������� ���ϱ�
		
	Scanner scanner = new Scanner (System.in);
	//Ű����� �Է¹ޱ� ���� ��ü ���� ==> 1�ܰ�
	System.out.println("������ �Է��ϼ���: ");
	int time=scanner.nextInt();
	//2�ܰ�: Ű����� �Է��� ���� �о��
	//nextIn(): //������ ����
	
	int second=time%60; //��
	int minute=(time/60)%60; //��
	int hour=(time/60/60)%60;  //��
	System.out.println(time+"�ʴ� "+hour+"�� "+minute+"�� "+second+"���Դϴ�.");
		
	
	// �Էµ� ������ ¦������ Ȧ������ ����ϴ� ���α׷��� ���� �����ڸ� �̿��Ͽ� �ۼ�
	
	System.out.println("������ �Է��ϼ���: ");
	int a=scanner.nextInt();
	String b = (a%2==0) ? "¦��":"Ȧ��";
	System.out.println(a+"�� "+b+"�Դϴ�.");

	scanner.close();
	
	}

}
