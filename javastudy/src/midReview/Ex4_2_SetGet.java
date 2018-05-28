package midReview;

public class Ex4_2_SetGet {

	public static void main(String[] args) {

	//setter 메서드를 통해서 객체에 접근
		Ex4_StudentTest2 std3 = new Ex4_StudentTest2();
		std3.setName("김의진");
		std3.setAssignmentScore(99);
		std3.setExamScore(88);
		System.out.println(std3);
		
	//생성자를 통해서 객체 접근
		Ex4_StudentTest2 std4 = new Ex4_StudentTest2("김사랑", 99, 33);
		System.out.println(std4);	
				
	}

}
