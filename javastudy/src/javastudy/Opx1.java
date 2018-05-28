package javastudy;

import java.util.Scanner;

public class Opx1 {

	public static void main(String[] args) {
	//문제: 초 단위로 정수를 입력받아 몇시, 몇분, 몇초인지 구하기
		
	Scanner scanner = new Scanner (System.in);
	//키보드로 입력받기 위한 객체 생성 ==> 1단계
	System.out.println("정수를 입력하세요: ");
	int time=scanner.nextInt();
	//2단계: 키보드로 입력한 값을 읽어옴
	//nextIn(): //정수로 저장
	
	int second=time%60; //초
	int minute=(time/60)%60; //분
	int hour=(time/60/60)%60;  //시
	System.out.println(time+"초는 "+hour+"시 "+minute+"분 "+second+"초입니다.");
		
	
	// 입력된 정수가 짝수인지 홀수인지 출력하는 프로그램을 조건 연산자를 이용하여 작성
	
	System.out.println("정수를 입력하세요: ");
	int a=scanner.nextInt();
	String b = (a%2==0) ? "짝수":"홀수";
	System.out.println(a+"는 "+b+"입니다.");

	scanner.close();
	
	}

}
