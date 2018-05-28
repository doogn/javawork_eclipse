package midReview;

public class Ex3_CarSales {

	public static void main(String[] args) {

		//배열 다루기
		int[][] salesTable = { {72, 85, 94, 97},
				{112, 172, 68, 82}, {42, 88, 90, 52},
				{95, 63, 107, 75}, {42, 57, 68, 100} };
		String[] names = {"홍길동", "임꺽정", "김갑동",
				"이칠복", "강진주"};
		
		double[] rowAverage = new double[5];
		double[] columnAverage = new double[4];
		
		//변수 선언 (배열접근을 위한, 결과를 저장하기 위한)
		int i, j, sum;
		//제목 출력
		System.out.println("판매원 \t 1분기 \t 2분기 \t 3분기 \t 4분기 \t");
		System.out.println("---------------------------------------");
		
		//배열에 접근해서 값 출력
		for (i=0; i<5; i++) {
			System.out.print(names[i]);
			for (j=0; j<4; j++ ) {
				System.out.print("\t" + salesTable[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
				
		//가로평균 ==> ex> 홍길동 1~4분기 판매대수 평균
		//2차원 배열일 경우: 배열명.length => 행의 개수
		//배열명[인덱스번호].length => 열의 개수
		for (i=0; i<salesTable.length; i++) {
			sum = 0;
			for (j=0; j<salesTable[i].length; j++) {
				sum = sum + salesTable[i][j];
			}
			rowAverage[i] = sum / 4.0;  //int / double => double로 계산됨
			System.out.println(names[i] + "의 평균 판매대수는 " + rowAverage[i]);
		}
		
		System.out.println();
		
		//세로평균 ==> ex> 1/4분기 총판매대수 평균
		for (j=0; j<salesTable[1].length; j++) {
			sum = 0;
			for (i=0; i<salesTable.length; i++) {
				sum = sum + salesTable[i][j];
			}
			columnAverage[j] = sum / 5.0;  //int / double => double로 계산됨
			System.out.println((j+1)+ "분기의 평균 판매대수는 " + columnAverage[j]);
		}
		
	}

}
