package javastudy;

import java.util.Scanner;

public class forex1 {

	public static void main(String[] args) {
		
		//화면에 1~5까지 숫자 찍어주는 예제
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.println("");
		
		//위의 결과를 for문으로 변경하여 출력
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println("");
		
		
		//화면에 1부터 10까지 덧셈 결과를 출력하는 예제
		int sum = 0;
		for(int i2=1; i2<=10; i2++) {
			sum += i2;
			System.out.print(i2);
			
			if(i2<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.println(sum);
			}
		}
		System.out.println("");
		
		//사용자로부터 입력받은 값을 반복
		int dan;
		System.out.println("단을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		dan = scanner.nextInt();
		for (int i3=1; i3<=9; i3++){
			System.out.println(dan +"*" + i3 + " = " + dan*i3);
		}
		System.out.println();
		
		//2중 중첩을 이용한 구구단 출력하기
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
				
		// 입력받은 단으로 구구단 출력하기
		int dan2;
		System.out.println("단을 입력하세요>>");
		dan2 = scanner.nextInt();
		
		for (int i=1; i<=dan2; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
                }
			System.out.println();
		}
	
		scanner.close();
		
	}
	
}

