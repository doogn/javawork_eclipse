package javastudy;

public class ArrayEx2 {

	public static void main(String[] args) {

		//4�� GPA ���ϱ�
		double score[][] = { { 3.3, 3.4 }, // 1�г� 1, 2�б� ����
						{ 3.5, 3.6 }, // 2�г� 1, 2�б� ����
						{ 3.7, 4.0 }, // 3�г� 1, 2�б� ����
						{ 4.1, 4.2 } }; // 4�г� 1, 2�б� ����
		double sum = 0;

		for (int year = 0; year < score.length; year++) // �� �г⺰�� �ݺ�
		for (int term = 0; term < score[year].length; term++) // �� �г��� �б⺰�� �ݺ�
		sum += score[year][term]; // ��ü ���� ��
		int n = score.length; // �迭�� �� ����, 4
		int m = score[0].length; // �迭�� �� ����, 2

		System.out.println("4�� ��ü ���� ����� " + sum / (n * m));

		//2���� �迭 ����
		int point[][] = new int[2][3];  //2*3�� 2���� �迭
			//2���� �迭�� �����ؼ� �� ����
		point[0][0] = 50;  // (1�� x 1��)
		point[0][1] = 30;  // (1�� x 2��)
		point[0][2] = 40;  // (1�� x 3��)
		point[1][0] = 60;  // (2�� x 1��)
		point[1][1] = 70;  // (2�� x 2��)
		point[1][2] = 80;  // (2�� x 3��)
		//int point[][] ={{50,30,40}, {60,70,80}}
			//�迭�� �� ���
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(point[i][j]+ " ");
			}
			System.out.println("");
		}

		//2���� �迭�� �հ�, ��� ���ϱ�
		int point2[][] = {{3,4}, {4,4}, {4,3}, {2,3}};
		double sum2 = 0;
		double avg = 0.0;
		for(int i=0; i<point2.length; i++){
			for(int j=0;j<point2[i].length; j++){
				sum2 += point2[i][j];
			}
		}
		avg = sum2 / ((point2.length)*(point2[0].length));
			// ��� = (�հ�) / (���� ����)*(���� ����))
		System.out.println("�հ�� "+sum2+", "+"����� "+avg+"�Դϴ�.");


	}

}