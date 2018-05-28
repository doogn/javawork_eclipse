package javastudy;

import java.util.Scanner;

public class Whileex {

	public static void main(String[] args) {
		
		// 입력한 정수의 평균 구하기
		Scanner scanner = new Scanner(System.in);
		
		int count=0, n=0;
		double sum=0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하시오");
		while ((n = scanner.nextInt()) !=0 ){
			sum += n;
			count ++;
		}
		System.out.println("자료의 개수는 " + count +"개이며");
		System.out.println("총합은 " + sum +"이고");
		System.out.println("평균은 " + sum/count + "입니다");

		// a부터 z까지 출력하기 (ASCII 코드 값 이용)
		char a = 'a';
		
		do {
			System.out.print(a);
			a = (char)(a+1);
		} while (a <= 'z');
		
		scanner.close();
		
	}
}