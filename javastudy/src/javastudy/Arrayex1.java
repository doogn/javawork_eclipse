package javastudy;

import java.util.Scanner;

public class Arrayex1 {

	public static void main(String[] args) {

		//������ �̿��� ��
		int score1, score2, score3;
		score1 = 100;
		score2 = 33;
		score3 = 44;
		int sum1 = score1 + score2 + score3;
		System.out.println(sum1);
		
		//�迭�� �̿��� ��
		int sum2 = 0;
		int[] scores = {100,33,44};
		//int scores[] = {100,33,44};
		for(int i=0; i<3; i++){
			sum2 += scores[i];
			//sum2 = sum2 + scores[i];
		}
		System.out.println(sum2);
				
		//�迭 new �����ڷ� ����
		int sum3 = 0;
		String[] name = new String[3];
			//Ÿ��[] �迭�� = new Ÿ�� [�迭ũ��];
		name[0] = "�̸�1";
		name[1] = "�̸�2";
		name[2] = "�̸�3";
			//String[] name = {"�̸�1", "�̸�2", "�̸�3"};
			//�迭�� �� ����
			//�迭�� ���
		for(int i=0; i<name.length; i++){
			System.out.println(name[i]);
		}
		
		//Ű����κ��� �Է¹޾Ƽ� �ִ밪 ���ϱ�
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		System.out.println("5���� ������ �Է��ϼ���>>");
			//�迭�� �� �����ϱ�
		for(int i=0; i<intArray.length; i++){
			intArray[i] = scanner.nextInt();
			//�ִ밪 ���ϱ�
			if (intArray[i] > max){
				max = intArray[i];
			}
		}
			//�迭�� ó�� ��� ���
		System.out.println("���� ū ���� "+max+"�Դϴ�");
				
		
		//�迭 ������ for-each ������ ����� ��
		String f[] = {"��1", "��2", "��3"};
			//�迭 ���� ���� (for-each ��)
		for(String s : f){  //f[0], f[1], ...
			System.out.print(s+ " ");
			System.out.println(" ");
		}
		//for (int i=0; i<f.length; i++){
		//System.out.print(f[i]+" ");
		
		
		//5���� ������ �Է¹޾Ƽ� 3�� ����� ����ϱ� (�� �迭 �̿�)
		int num[] = new int[5];
		System.out.println("5���� ������ �Է��ϼ���>>");
		for(int i=0; i<num.length; i++){
			num[i] = scanner.nextInt();
			if (num[i]%3 == 0){
				System.out.println(num[i]+"�� 3�� ����Դϴ�");
			}
			else System.out.println(num[i]+"�� 3�� ����� �ƴմϴ�");
		}
				
		scanner.close();
		
	}

}
