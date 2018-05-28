package javastudy;

public class Op1 {

	public static void main(String[] args) {
		
		//변수선언
		int remainder = 25%2; //변수타입 변수명=값
		System.out.println("25÷2의 나머지는 "+remainder+"입니다.");
		
		//테스트
		int a;
		a=1;
		System.out.println("a++= "+ a++);
		System.out.println("a= "+ a);
		
		
		//비교연산자
		int x=0, y=1;
		boolean z;
		z= ((x<1) || (y--<1)); //0<1(true) or 1<1(false)
		System.out.println("결과는: " +z);
		z= ((x<1) && (y--<1)); //0<1(true) or 1<1(false)
		System.out.println("결과는: " +z);
		
		//대입연산자
		int value=1;
		value+=2; //value=value+2
		System.out.println("결과: " +value);
		
		//부호연산자
		x=1;
		y=1;
		System.out.println("x= "+x+" x++= "+x++); //x=x+1
		System.out.println("x= "+x+" --x= "+--x); //x=x+1
		System.out.println("y= "+y+" y++= "+y++); //x=x+1
		System.out.println("y= "+y+" --y= "+--y); //x=x+1	
		
		//조건연산자
		x=3;
		y=(x==1)? 10: 20;  //조건? 참일때 10: 거짓일때 20;
		System.out.println("결과는: "+y);
		
		
	}

}
