package javastudy;

public class quiz {

	public static void main(String[] args) {

		// 1���� 20������ ���� �߿��� 3�� ����� ������ ���ϼ���
		int sum = 0;
		for (int i=1; i<=20; i++) {
		if (i%3 != 0) continue;
		sum += i;
		}
		System.out.println("1~20������ ���� �� 3�� ����� ������ "+sum+"�Դϴ�.");
		
		// 1~20������ �������� 3�� ����� 2�� ����� �ƴ� ���� ��
		sum = 0;
		for (int i=1; i<=20; i++) {
		if (i%3==0 || i%2==0) continue;
		sum += i;
		}
		System.out.println("1~20 �� 3�� ����� 2�� ����� �ƴ� ���� ���� "+sum+"�Դϴ�.");
		
	}
}