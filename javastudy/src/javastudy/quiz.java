package javastudy;

public class quiz {

	public static void main(String[] args) {

		// 1부터 20까지의 정수 중에서 3의 배수의 총합을 구하세요
		int sum = 0;
		for (int i=1; i<=20; i++) {
		if (i%3 != 0) continue;
		sum += i;
		}
		System.out.println("1~20까지의 정수 중 3의 배수의 총합은 "+sum+"입니다.");
		
		// 1~20까지의 정수에서 3의 배수와 2의 배수가 아닌 수의 합
		sum = 0;
		for (int i=1; i<=20; i++) {
		if (i%3==0 || i%2==0) continue;
		sum += i;
		}
		System.out.println("1~20 중 3의 배수와 2의 배수가 아닌 수의 합은 "+sum+"입니다.");
		
	}
}