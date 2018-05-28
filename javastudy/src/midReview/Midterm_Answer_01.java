package midReview;

import java.util.Scanner;

public class Midterm_Answer_01 {

	public static void main(String[] args) {
		
		int[] sales = new int[3];
		int snumber;
		int sum;
		double average;
		int maxid, maxsales;
		int minid, minsales;
		int i;
		Scanner scan = new Scanner(System.in);
		for (i=0; i < sales.length; i++) {
			System.out.println("판매원의 번호를 입력하세요: ");
			snumber = scan.nextInt();
			System.out.println("판매원 " + snumber + "의 매출액을 입력하세요: ");
			sales[snumber - 1] = scan.nextInt();
		}
		
		System.out.println("\n판매원들의 매출액");
		System.out.println("-------------------");
		
		sum=0;
		for (i = 0; i < sales.length; i++) {
			System.out.println("판매원 " + (i + 1) + " " + sales[i]);
			sum += sales[i];
		}
		
		maxid = 0;
		maxsales = sales[0];
		minid = 0;
		minsales = sales[0];
		for (i = 1; i < sales.length; i++) {
			if (sales[i] > maxsales) {
				maxid = i;
				maxsales = sales[i];
			}
			if (sales[i] < minsales) {
				minid = i;
				minsales = sales[i];
			}
			
			System.out.println("\n총 매출액: " + sum);
			average = (double) sum / 3;
			System.out.println("평균 매출액: " + average);
			System.out.println("최대 매출액: " + maxsales + " (사원 번호 " + (maxid + 1) + ")");
			System.out.println("최저 매출액: " + minsales + " (사원 번호 " + (minid + 1) + ")");
	
		}		
		
	}

}
