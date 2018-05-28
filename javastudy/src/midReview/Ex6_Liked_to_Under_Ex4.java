package midReview;

public class Ex6_Liked_to_Under_Ex4 {

public static void main(String[] args) {
	//하위클래스 선언 ==> 상위클래스 내용도 같이 사용 가능
	
	Under_Ex4_StudentTest2 std5 = new Under_Ex4_StudentTest2();
	std5.setName("자기 이름 ");
	std5.setClubName("프로그래밍 ");
	System.out.println(std5);

	System.out.println();
	
	//하위클래스 ==> 생성자를 통해서
	Under_Ex4_StudentTest2 std6 = new Under_Ex4_StudentTest2("김길동", 10, 40, "독서");
	System.out.println(std6);
	
	}
}
