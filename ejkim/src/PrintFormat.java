public class PrintFormat {

    public static void main(String[] args) {

        int i = 97;
        String s = "java";
        double f = 3.14f;

        System.out.printf("정수출력: %d\n", i);
        System.out.printf("정수출력: [%10d]\n", i);
        System.out.printf("문자출력: %s\n", s);
        System.out.printf("문자출력: [%10s]\n", s);
        System.out.printf("실수출력: %5.1f\n", f);

    }

}
