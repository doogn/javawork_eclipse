package javastudy1;

class Shape {
	public void draw(){
		System.out.println("����");	
	} //������(public/private => �����ϸ� default��) ����Ÿ�� �޼����̸�(�Ű�����..)	
}

class Line extends Shape {
	public void draw(){
		System.out.println("��");	
	}
}

class Rect1 extends Shape {  //���� package�� �̹� �������� Rect Ŭ������ �־ ��ġ�⿡ Rect1�� �ٲ�
	public void draw(){
		System.out.println("�簢��");	
	}
}
	
class Circle1 extends Shape {  //���� package�� �̹� �������� Circle Ŭ������ �־ ��ġ�⿡ Circle1�� �ٲ�
	public void draw(){
		System.out.println("��");	
	}
}	

public class OverridingEx {
	static void paint(Shape p){
		p.draw();  //���� Ŭ������ �ִ� draw()
	}
	
	public static void main(String[] args) {
		//�޼��� ȣ��
		Line line = new Line();
		paint(line); //Shape line ==> line�� draw ȣ��
		//�������̵��� �޼���� �ϴ� ���ļ� ����� ���̹Ƿ�
		//���� Ŭ������ �ִ� �޼��尡 �켱������ ����
		//paint (new Line()); ���� �� �ٷ� �ᵵ ��
		line.draw();  //����
	
				
	}

}
