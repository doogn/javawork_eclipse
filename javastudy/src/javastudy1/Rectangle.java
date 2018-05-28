package javastudy1;

public class Rectangle {
	int width;   //필드 ==> 생략하면 default (public)
	int height;
	String name;
	int getArea() {
		return width*height;
	}
	
	//기본생성자 (매개변수가 있는 생성자를 사용하려면 기본생성자도 생성해야 됨(?))
	public Rectangle() {
	}
	
	//매개변수가 있는 생성자
	public Rectangle(int w, int h, String n) {
	width = w;  // this.width = w;
	height = h;  // this.height = h;
	name = n;
	}
	
}