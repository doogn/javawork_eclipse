package midReview;

import java.util.Scanner;

public class Ex2_GradeCount {

	public static void main(String[] args) {
		int score;
		int totalCount = 0;
		int Acount, Bcount,Ccount, Dcount, Fcount;
		Acount = Bcount = Ccount = Dcount = Fcount = 0;
		
		//Scanner 클래스 사용
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 (음수 입력시 종료) >> ");
		score = scan.nextInt();
		while (score >=0) {  //while(true)
			totalCount++;
			if(score >= 90) {
				Acount++;
			} else if(score >= 80) {
				Bcount++;
			} else if(score >= 70) {
				Ccount++;
			} else if(score >= 60) {
				Dcount++;
			} else Fcount++;
			
			System.out.print("점수 입력 (음수 입력시 종료) >> ");
			score = scan.nextInt();
		}
		
		//화면에 값 출력
		System.out.println();
		System.out.println("총 학점수 = " + totalCount);
		System.out.println("A 학점수 = " + Acount);
		System.out.println("B 학점수 = " + Bcount);
		System.out.println("C 학점수 = " + Ccount);
		System.out.println("D 학점수 = " + Dcount);
		System.out.println("F 학점수 = " + Fcount);

	}

}
