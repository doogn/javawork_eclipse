package midterm;

import java.util.Scanner;

public class Exam1_54 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[3][2];
		int count = 0;
		int sum = 0;
	
		
		while (count < 3) {
			System.out.print("판매원의 번호를 입력하세요: ");
			int employeeNo = scanner.nextInt();
			if (employeeNo == 1 || employeeNo == 2 || employeeNo ==3) {
				arr[count][0] = employeeNo;
				System.out.print("판매원" + (count+1) + "의 매출액을 입력하세요: ");
				int sales = scanner.nextInt();
				arr[count][1] = sales;
				count += 1;			
				sum += sales;
			} else {
				System.out.println("잘못된 사원번호입니다. 다시 입력하세요: ");
			}
		}
		

		
		
		System.out.println("판매원들의 매출액");
		System.out.println("-----------------------");
		for (int i=0; i<arr.length; i++) {
		System.out.println("판매원 " + arr[i][0] + "\t" + arr[i][1]);
		}
		
		System.out.println();
		System.out.println("총 매출액: " + sum);
		System.out.println("평균 매출액: " + (sum/count));
		//System.out.println("최대 매출액: " + max + "( 사원번호: "+ ㅁㅁ);
		//System.out.println("최저 매출액: " + ㅁㅁ + "( 사원번호: " + ㅁㅁ);
		
	}

}
