package javastudy;

public class ArrayEx2 {

	public static void main(String[] args) {

		//4년 GPA 구하기
		double score[][] = { { 3.3, 3.4 }, // 1학년 1, 2학기 평점
						{ 3.5, 3.6 }, // 2학년 1, 2학기 평점
						{ 3.7, 4.0 }, // 3학년 1, 2학기 평점
						{ 4.1, 4.2 } }; // 4학년 1, 2학기 평점
		double sum = 0;

		for (int year = 0; year < score.length; year++) // 각 학년별로 반복
		for (int term = 0; term < score[year].length; term++) // 각 학년의 학기별로 반복
		sum += score[year][term]; // 전체 평점 합
		int n = score.length; // 배열의 행 개수, 4
		int m = score[0].length; // 배열의 열 개수, 2

		System.out.println("4년 전체 평점 평균은 " + sum / (n * m));

		//2차원 배열 선언
		int point[][] = new int[2][3];  //2*3의 2차원 배열
			//2차원 배열에 접근해서 값 저장
		point[0][0] = 50;  // (1행 x 1열)
		point[0][1] = 30;  // (1행 x 2열)
		point[0][2] = 40;  // (1행 x 3열)
		point[1][0] = 60;  // (2행 x 1열)
		point[1][1] = 70;  // (2행 x 2열)
		point[1][2] = 80;  // (2행 x 3열)
		//int point[][] ={{50,30,40}, {60,70,80}}
			//배열의 값 출력
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(point[i][j]+ " ");
			}
			System.out.println("");
		}

		//2차원 배열로 합계, 평균 구하기
		int point2[][] = {{3,4}, {4,4}, {4,3}, {2,3}};
		double sum2 = 0;
		double avg = 0.0;
		for(int i=0; i<point2.length; i++){
			for(int j=0;j<point2[i].length; j++){
				sum2 += point2[i][j];
			}
		}
		avg = sum2 / ((point2.length)*(point2[0].length));
			// 평균 = (합계) / (행의 개수)*(열의 개수))
		System.out.println("합계는 "+sum2+", "+"평균은 "+avg+"입니다.");


	}

}