package midReview;

public class Ex5_StudentClass {

	public static void main(String[] args) {
		//클래스 선언
		Ex4_StudentTest std1 = new Ex4_StudentTest();
		//클래스의 멤버 변수에 접근 ==> 객체명.멤버변수, 객체명.메서드()
		std1.name="선남";
		std1.assignmentScore = 91;
		std1.examScore = 88;
		System.out.println(std1.toString());

		Ex4_StudentTest std2 = new Ex4_StudentTest();
		//클래스의 멤버 변수에 접근 ==> 객체명.멤버변수, 객체명.메서드()
		std2.name="선녀";
		std2.assignmentScore = 94;
		std2.examScore = 77;
		System.out.println(std2.toString());	
		
		
		
	}

}
