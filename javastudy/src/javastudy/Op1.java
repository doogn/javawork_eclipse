package javastudy;

public class Op1 {

	public static void main(String[] args) {
		
		//��������
		int remainder = 25%2; //����Ÿ�� ������=��
		System.out.println("25��2�� �������� "+remainder+"�Դϴ�.");
		
		//�׽�Ʈ
		int a;
		a=1;
		System.out.println("a++= "+ a++);
		System.out.println("a= "+ a);
		
		
		//�񱳿�����
		int x=0, y=1;
		boolean z;
		z= ((x<1) || (y--<1)); //0<1(true) or 1<1(false)
		System.out.println("�����: " +z);
		z= ((x<1) && (y--<1)); //0<1(true) or 1<1(false)
		System.out.println("�����: " +z);
		
		//���Կ�����
		int value=1;
		value+=2; //value=value+2
		System.out.println("���: " +value);
		
		//��ȣ������
		x=1;
		y=1;
		System.out.println("x= "+x+" x++= "+x++); //x=x+1
		System.out.println("x= "+x+" --x= "+--x); //x=x+1
		System.out.println("y= "+y+" y++= "+y++); //x=x+1
		System.out.println("y= "+y+" --y= "+--y); //x=x+1	
		
		//���ǿ�����
		x=3;
		y=(x==1)? 10: 20;  //����? ���϶� 10: �����϶� 20;
		System.out.println("�����: "+y);
		
		
	}

}
