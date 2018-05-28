package midReview;

import java.util.Scanner;

public class Ex1_ToeicScore {

	public static void main(String[] args) {
	//조건문 연습 문제
	double grade;  //평점
	int toeicscore;  //토익점수
	
	//Scanner 클래스 사용
	Scanner scan = new Scanner(System.in);
	System.out.print("평점 입력 >> ");
	grade = scan.nextDouble();
	
	System.out.print("토익점수 입력 >> ");
	toeicscore = scan.nextInt();
	
	//조건
	if(toeicscore >= 700) {
		if(grade >= 4.0) {
			System.out.println("면접 대상임");
		} else if(grade >= 3.5) {
			System.out.println("서류전형 대상임");
		} else if(grade > 3.0 ) {
			System.out.println("필기시험 대상임");
		} else
			System.out.println("지원할 수 없음");
	} else {
		System.out.println("지원할 수 없음");
	}
	
	}

}
