package javastudy;

import java.util.Scanner;

public class Arrayex1 {

	public static void main(String[] args) {

		//변수를 이용한 예
		int score1, score2, score3;
		score1 = 100;
		score2 = 33;
		score3 = 44;
		int sum1 = score1 + score2 + score3;
		System.out.println(sum1);
		
		//배열을 이용한 예
		int sum2 = 0;
		int[] scores = {100,33,44};
		//int scores[] = {100,33,44};
		for(int i=0; i<3; i++){
			sum2 += scores[i];
			//sum2 = sum2 + scores[i];
		}
		System.out.println(sum2);
				
		//배열 new 연산자로 선언
		int sum3 = 0;
		String[] name = new String[3];
			//타입[] 배열명 = new 타입 [배열크기];
		name[0] = "이름1";
		name[1] = "이름2";
		name[2] = "이름3";
			//String[] name = {"이름1", "이름2", "이름3"};
			//배열에 값 저장
			//배열값 출력
		for(int i=0; i<name.length; i++){
			System.out.println(name[i]);
		}
		
		//키보드로부터 입력받아서 최대값 구하기
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		System.out.println("5개의 정수를 입력하세요>>");
			//배열에 값 저장하기
		for(int i=0; i<intArray.length; i++){
			intArray[i] = scanner.nextInt();
			//최대값 비교하기
			if (intArray[i] > max){
				max = intArray[i];
			}
		}
			//배열값 처리 결과 출력
		System.out.println("가장 큰 값은 "+max+"입니다");
				
		
		//배열 접근을 for-each 문으로 사용한 예
		String f[] = {"값1", "값2", "값3"};
			//배열 값에 접근 (for-each 문)
		for(String s : f){  //f[0], f[1], ...
			System.out.print(s+ " ");
			System.out.println(" ");
		}
		//for (int i=0; i<f.length; i++){
		//System.out.print(f[i]+" ");
		
		
		//5개의 정수를 입력받아서 3의 배수만 출력하기 (꼭 배열 이용)
		int num[] = new int[5];
		System.out.println("5개의 정수를 입력하세요>>");
		for(int i=0; i<num.length; i++){
			num[i] = scanner.nextInt();
			if (num[i]%3 == 0){
				System.out.println(num[i]+"는 3의 배수입니다");
			}
			else System.out.println(num[i]+"는 3의 배수가 아닙니다");
		}
				
		scanner.close();
		
	}

}
