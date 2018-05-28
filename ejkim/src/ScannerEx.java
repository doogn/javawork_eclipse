import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {

        //객체 생성
        //클래스 변수 = new 클래스 () ;
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 두 개 입력하세요");
        int x = in.nextInt();  //객체사용법: 객체변수명.메소드();
        int y = in.nextInt();  //객체사용법: 객체변수명.메소드();
        System.out.printf("%d * %d은 %d입니다.\n", x, y, x*y);

        System.out.println("이름과 나이를 입력하세요");
        String name = in.next();
        int age=in.nextInt();
        System.out.println("당신의 이름은 "+name+", "+"당신의 나이는 "+age+" 입니다");

        //문제: 직사각형의 가로, 세로 값을 입력받아서
        //넓이를 구하는 실습
        System.out.println("직사각형의 가로, 세로를 입력하세요");
        int a = in.nextInt();  //객체사용법: 객체변수명.메소드();
        int b = in.nextInt();  //객체사용법: 객체변수명.메소드();
        System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이는 %d입니다.\n", a, b, a*b);

    }
}
