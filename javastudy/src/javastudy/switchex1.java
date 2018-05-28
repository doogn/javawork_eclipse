package javastudy;

import java.util.Scanner;  //Scanner 사용을 위한 라이브러리 호출

public class switchex1 {

	public static void main(String[] args) {

		//기본 switch
		int num = 6;
		switch(num){
		case 1:
			System.out.println("SK");
			break;
		case 6:
			System.out.println("KTF");
			break;
		default: System.out.println("unknown");
		}
		
		//키보드로부터 입력받아서 처리
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재 월을 입력하세요");
		int month = 0;
		month = scanner.nextInt();
		switch(month){
		case 3: case 4: case 5:  //if ((month >= 3) && (month <= 5))
			System.out.println("현재 봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 가을입니다");
			break;
		default:
			System.out.println("현재 겨울입니다");
		}
		
		//연산식을 간단한 수식으로 작성하는 예
		int score = 0;
		System.out.println("점수를 입력하세요>>");
		score = scanner.nextInt();
		switch(score/10){  //십의 자릿수 (99~90)/10 => 9 
							//(int 형태에서 소숫점 아래는 자동으로 버림)
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default:
			System.out.println("C");
		}

		
		
		scanner.close();
		
		
	}

}
