package javastudy;

import java.util.Scanner;

public class StringEX1 {

	public static void main(String[] args) {

		//���ڿ��� ==> �迭ó�� �ε��� ��ȣ�� �����鼭 ���� (Java �� �ƴ϶� ��� �� �� �׷�)
		String a = "Hello";
		String b = new String("Java");  //1���� �迭ó�� �ν�(���� Line 8ó�� �����ص� ������)
		
		System.out.println(a.length());
		System.out.println(a.substring(0, 2));
		System.out.println(a.charAt(3));
		String s[] = a.split(",");
			//���ڿ��� ,�� �����ؼ� �迭�� ����
		
		//for(int i=0; i<s.length(); i++) {  (*****���� 19~21���� �̻���*****)
			//System.out.println(s[i]);
		//}
		
		//���ڿ� + �迭�� Ȱ���� ������ �Է��ϸ� �ѱ۷� ����
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ", "�̷�"};
			//����ڷκ��� �Է¹޾Ƽ� ���
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("����ܾ� �Է� >>");
			String s1=scanner.nextLine();
			if(s1.equals("exit"))
				break;
			int i;
			for(i=0; i<eng.length; i++){
				if (eng[i].equals(s1)){
					System.out.println(kor[i]);
					break;
				}
			}
			if(i==eng.length)
				System.out.println("�׷� ���� �ܾ �����ϴ�");
		}
		
		scanner.close();
	
	}

}
