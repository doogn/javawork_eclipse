public class VarEx {


    public static void main(String[] args) {
        //변수 + 정수, 실수 리터럴 사용법

            int mach; //변수 선언 ==> 4byte
            int distance;
            mach=340; //int mach = 340; 초기화
            distance=mach*60*60;
            System.out.println("1시간 동안 소리가 가는 거리: " + distance + "m");

            double radius;
            double area;
            final double PI=3.141592;
            radius = 10.5;
            area = radius * radius * PI;
            System.out.println("반지름이 " + radius + "인 원의 넓이: " + area);
            radius = 100.5;
            area = radius * radius * PI;
            System.out.println("반지름이 " + radius + "인 원의 넓이: " + area);

            //문자, 논리

            char ga1 = '가';
            char ga2 = '\uac00';
            String str = "hello";
            boolean cham = true;

            System.out.println("문자출력 " + ga1 +" "+ ga2);
            System.out.println(str);
            System.out.println("논리 "+cham);


            // 타입 변환 응용

            int i;
            double d;
            double d1;
            i=7/4; //타입변환을 하지 않고 계산 ==> 손실이 생김
            System.out.println(i);
            d=7/(double)4;
            d1=7/4.0;
            System.out.println("출력결과: " + d + " " + d1);
            double d2=1.999999;
            int j = (int) d2;
            System.out.println(j);
            byte b = (byte) 300;
            System.out.println(b);

    }

}
