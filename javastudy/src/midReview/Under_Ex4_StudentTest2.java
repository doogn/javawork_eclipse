package midReview;

public class Under_Ex4_StudentTest2 extends Ex4_StudentTest2{
	//상속에서는 내 것에 해당하는 값만 정의
	//사용은 부모 것도 같이 사용 가능
	private String clubName;
	//생성자 필요 ==> 매개변수 없는 것, 매개변수 1개 ==>

	public Under_Ex4_StudentTest2() {
		super();
	}
	
	public Under_Ex4_StudentTest2(String clubName) {
		super();
		this.clubName = clubName;
	}
	
	public Under_Ex4_StudentTest2(String name, int assignmentScore, int examScore, String clubName) {
		super(name, assignmentScore, examScore);
		this.clubName = clubName;
	}
	
	//setter / getter 메서드
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName ) {
		this.clubName = clubName;
	}
	
	//toString
	public String toString() {
		return super.toString() + "동아리 이름 " + getName();
	}
		
	
}
