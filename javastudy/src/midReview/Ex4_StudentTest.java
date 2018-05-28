package midReview;

public class Ex4_StudentTest {
//멤버 변수들 ==> 멤버변수(=필드) + 생성자 + 메서드로 구성
	
	public String name;
	public int assignmentScore;
	int examScore;   // default. 같은 클래스 내에서만 사용하므로 public 사용유무 별 차이 없음
	
	//성적 메서드 처리
	public char getGrade() {
		char letterGrade = ' ';
		double total;
		total = assignmentScore * 0.4 + examScore * 0.6;
		if (total >= 90 ) {
			letterGrade = 'A';
		} else if(total >= 80) {
            letterGrade = 'B';
		} else if(total >= 70) {
            letterGrade = 'C';
		} else if(total >= 60) {
            letterGrade = 'D';
		} else letterGrade = 'F';
		
	        return letterGrade;
	    }

	//결과물 출력하는 toString() 메서드
	public String toString() {
		String str = "";
		str += "이름" + name + "\n";
		str += "과제점수" + assignmentScore + "\n";
		str += "시험점수" + examScore + "\n";
		str += "학점" + getGrade() + "\n"; 
		return str;		
	}
	
}
