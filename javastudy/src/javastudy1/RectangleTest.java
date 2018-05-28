package javastudy1;

class Rect {  //public은 한 번만 해줘야 함
	private double width, length; //필드 (멤버변수)
	
	//기본 생성자
	public Rect() {
	//	this.width = 10.0;
	//	this.length = 10.0;
		this(10.0, 10.0); //동일
	}
	
	//매개변수 2개 생성자
	public Rect(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	//setter/getter 메서드 정의
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
		
	//계산 메서드
	public double calcArea() {
		return width * length;
	}

	//toString(): 객체의 처리한 결과를 문자열로 리턴
	//상위객체(object)에서 제공하는 메서드
	public String toString(){
		return "가로 "+ width +
		", 세로 " + length +", 넓이는 " + calcArea();
	}
	//출력문장
}

public class RectangleTest {
	public static void main(String[] args) {
		Rect r1 = new Rect(); //기본생성자
		System.out.println("가로 = " + r1.getWidth() +
		", 세로 = " +r1.getLength() + ", 넓이는 = "+r1.calcArea());
		Rect r2 = new Rect(5.5, 10.0); //매개변수 생성자
		System.out.println(r2); //객체 정보출력 ==> toString()
		r2.setWidth(20.0);
		System.out.println(r2.toString());
		
	}
}
