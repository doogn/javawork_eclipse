package javastudy1;

public class Rectangle {
	int width;   //�ʵ� ==> �����ϸ� default (public)
	int height;
	String name;
	int getArea() {
		return width*height;
	}
	
	//�⺻������ (�Ű������� �ִ� �����ڸ� ����Ϸ��� �⺻�����ڵ� �����ؾ� ��(?))
	public Rectangle() {
	}
	
	//�Ű������� �ִ� ������
	public Rectangle(int w, int h, String n) {
	width = w;  // this.width = w;
	height = h;  // this.height = h;
	name = n;
	}
	
}