package midReview;

import java.util.Scanner;

public class Midterm_Answer_01_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num[][] = new int[3][2];
		int total = 0;
		double avg = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println("판매원의 번호를 입력하세요: ");
			num[i][0] = scan.nextInt();
			System.out.println("판매원 " + num[i][0] + "의 매출액을 입력하세요: ");
			num[i][1] = scan.nextInt();
		}

		System.out.println("\n판매원들의 매출액");
		System.out.println("-------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.println("판매원" + num[i][0] + "\t\t" + num[i][1]);
			total += num[i][1];
		}
		
		avg = (double)total / num.length;
		System.out.println("총 매출액 = " + total + "\n평 균 = " + avg);
		int max = num[0][1];
		int min = num[0][1];
		int max1 =0, min1 = 0;
		
		for(int i = 1; i<num.length; i++) {
			if(max < num[i][1]) {
				max = num[i][1];
				max1 = i;
			}
		}
		
		for(int i = 1; i<num.length; i++) {
			if(min > num[i][1]) {
				min = num[i][1];
				min1 = i;
			}
		}
		
		System.out.println("최대 매출액 " + max + "\t판매원" + num[max1][0]);
		System.out.println("최소 매출액 " + min + "\t판매원" + num[min1][0]);
	}
	
}
		