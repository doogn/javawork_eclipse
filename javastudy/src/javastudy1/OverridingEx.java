package javastudy1;

class Shape {
	public void draw(){
		System.out.println("도형");	
	} //접근자(public/private => 생략하면 default로) 리턴타입 메서드이름(매개변수..)	
}

class Line extends Shape {
	public void draw(){
		System.out.println("선");	
	}
}

class Rect1 extends Shape {  //같은 package에 이미 만들어놓은 Rect 클래스가 있어서 겹치기에 Rect1로 바꿈
	public void draw(){
		System.out.println("사각형");	
	}
}
	
class Circle1 extends Shape {  //같은 package에 이미 만들어놓은 Circle 클래스가 있어서 겹치기에 Circle1로 바꿈
	public void draw(){
		System.out.println("원");	
	}
}	

public class OverridingEx {
	static void paint(Shape p){
		p.draw();  //상위 클래스에 있는 draw()
	}
	
	public static void main(String[] args) {
		//메서드 호출
		Line line = new Line();
		paint(line); //Shape line ==> line에 draw 호출
		//오버라이딩된 메서드는 일단 겹쳐서 사용한 것이므로
		//하위 클래스에 있는 메서드가 우선적으로 실행
		//paint (new Line()); 으로 한 줄로 써도 됨
		line.draw();  //동일
	
				
	}

}
