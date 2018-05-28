package javastudy1;

public class Circle {
	public int radius; //필드(=멤버 변수)
	public String name; //필드
	//필드: Circle 클래스가 가지는 특징
	//==>이 필드 이용해서 메소드에서 작업(역할 부여)
	
	//메서드 => 역할 부여
	//접근자(public/private) 리턴타입 메서드이름(...) {}
	public double getArea() {
		return 3.14*radius*radius;
		//3.14*this.radius*this.radius
		//3.14*Circle.radius*Circle.radius		
	}  
		
	//기본생성자 ==> 클래스 이름과 동일
	//접근자 클래스이름() ... *Return 타입 없음
	public Circle() {
	}
	
	//매개번수가 있는 생성자
	public Circle(int r, String n) {
		radius = r; //클래스 필드 = 전달되는 값
		name = n;
	}
		
	public static void main(String[] args) {
		//Circle 클래스에 있는 변수와 메서드를 가져다 쓰려면..
		Circle pizza; //클래스명 변수명(객체)
		pizza = new Circle(); //객체 틀에서 찍에서 사용하기 (인스턴트화)
		
		pizza.radius = 10;
		pizza.name = "자바피자"; //객체명.필드(변수) = 값
		double area = pizza.getArea(); //변수 = 객체명.메서드()
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); //인스턴트화: 위의 라인 22~23의 두 줄을 한 줄로 (이게 더 많이 쓰임)  
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은 " + area);
		
		//Rectangle 클래스에 있는 변수와 메서드를 가져다 쓰려면..
		Rectangle rect = new Rectangle(); //객체 인스턴스화
		rect.width = 40;
		rect.height = 100;
		rect.name = "자바식빵";
		int area1 = rect.getArea();
		System.out.println(rect.name +"의 면적은 " + area1);
		
		//매개변수가 있는 생성자를 통해 개체 생성
		Circle test = new Circle(15, "자바버거");
		area = test.getArea();
		System.out.println(test.name +"의 면적은 " + area);
	
		//Rectangle 클래스에 매개변수 생성자 만들기
		//객체 생성 하나 하기
		Rectangle rect2 = new Rectangle(12, 16, "자바전병");
		int area2 = rect2.getArea();
		System.out.println(rect2.name +"의 면적은 " + area2);
		
		//Circle에 Book 개체 조립
		Book javaBook = new Book("java", "김자바");
		Book bible = new Book ("bible");
		Book emptyBook = new Book();
		bible.show();
		javaBook.show();
		emptyBook.show();
	}

}