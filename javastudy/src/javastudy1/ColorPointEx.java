package javastudy1;

//Point 클래스
class Point {
	private int x, y;
	//기본생성자 생략 ==> 컴파일러에 의해 자동으로 설정
	void set(int x, int y){ //메서드 정의
		this.x = x;
		this.y = y;
	}
	void showPoint() { //메서드 정의
		System.out.println("("+ x + ", " + y + ")");
	}
}

//상속받을 ColorPoint 클래스
class ColorPoint extends Point { //하위 클래스 extends 상위 클래스
	//하위 클래스에서만 사용할 추가 기능 확장
	private String color;
	void setColor(String color){
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color+" ");
		showPoint(); //상위에 있는 메서드 호출
	}
	
}
	
class DetailedColorPoint extends ColorPoint {
	private String detail;
	void setDetail(String detail){
		this.detail = detail;
	}
	void showDetailedColorPoint() {
		System.out.print(detail + " ");
		showColorPoint();
	}
}
	

public class ColorPointEx {
	
	public static void main(String[] args) {
	//객체 생성
		Point p = new Point();
		p.set(1, 2); //set 메서드 호출
		p.showPoint(); //Point 클래스내에서 것만 호출
	//객체 생성 ==> 상속받은 객체
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); //Point 클래스(상위) 것을 호출
		cp.setColor("red"); //ColorPoint에 있는 것 호출
		cp.showColorPoint();
	//객체 생성 ==> 상속받은 개체 2
		DetailedColorPoint dcp = new DetailedColorPoint();
		dcp.set(5, 6);
		dcp.setColor("pink");
		dcp.setDetail("cherry-blossom-like");
		dcp.showDetailedColorPoint();
	}

}
