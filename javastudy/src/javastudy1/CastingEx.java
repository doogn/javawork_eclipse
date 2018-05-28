package javastudy1;

//Person 클래스
class Person {
	String name;
	String id;
	//name 매개변수만 있는 생성자
	public Person(String name) {
		this.name = name;
	}
}		
	
//student 클래스 (하위)
class Student extends Person {
	String grade;
	String department;
	//생성자 자동 완성이 안됨 ==> 별도로 추가
	public Student(String name){
		super(name); //상위클래스의 생성자 호출
	}
	public String toString() {
		return "이름은 " + name + ", 아이디는 " + id + " / " + department + " " + grade + "입니다.";
	}
}

public class CastingEx {
	
	public static void main(String[] args) {
		Person p = new Student("마룬5");
		//p=s와 동일한 표현 (업캐스팅)
		//하위를 상위에 대입
		//상위 = 하위 (업캐스팅)
		//상위는 하위에 접근 오류
		//p.id = "1234"; // 얘만 OK
		//p.grade = "A등급";  //이 상태로는 에러 ==> 형변환 필요
		//p.department = "실용음악학과";  //이 상태로는 에러 ==> 형변환 필요
		//형변환이 필요
		Student s = (Student) p;
		//다운캐스팅 => 강제로 형을 변환 (반드시 명시적 타입 변환 지정)
		s.id = "1234";
		s.grade = "A등급";
		s.department = "실용음악학과";

		//결과 출력하기 
		System.out.println(s);
	}

}
