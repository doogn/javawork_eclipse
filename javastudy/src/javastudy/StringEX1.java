package javastudy;

import java.util.Scanner;

public class StringEX1 {

	public static void main(String[] args) {

		//문자열은 ==> 배열처럼 인덱스 번호를 가지면서 저장 (Java 뿐 아니라 모든 언어가 다 그럼)
		String a = "Hello";
		String b = new String("Java");  //1차원 배열처럼 인식(위의 Line 8처럼 선언해도 괜찮음)
		
		System.out.println(a.length());
		System.out.println(a.substring(0, 2));
		System.out.println(a.charAt(3));
		String s[] = a.split(",");
			//문자열을 ,로 구분해서 배열에 저장
		
		//for(int i=0; i<s.length(); i++) {  (*****라인 19~21까지 이상함*****)
			//System.out.println(s[i]);
		//}
		
		//문자열 + 배열을 활용한 영문을 입력하면 한글로 변경
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복", "미래"};
			//사용자로부터 입력받아서 사용
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("영어단어 입력 >>");
			String s1=scanner.nextLine();
			if(s1.equals("exit"))
				break;
			int i;
			for(i=0; i<eng.length; i++){
				if (eng[i].equals(s1)){
					System.out.println(kor[i]);
					break;
				}
			}
			if(i==eng.length)
				System.out.println("그런 영어 단어가 없습니다");
		}
		
		scanner.close();
	
	}

}
