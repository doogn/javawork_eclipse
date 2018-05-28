package javastudy1;

public class Book {
	String title;
	String author;
	public void show() {
		System.out.println(title + " " + author);
	}

	//기본 생성자
	public Book() {
		this("",""); //Book(String, String); 생성자 호출 - 항상 위에 먼저 써야 함
		System.out.println("생성자 호출됨");
 	}
	
	//매개변수가 하나가 있는 생성자
	public Book(String title){
		this(title,"작자미상");
	}
	
	//매개변수가 두 개가 있는 생성자
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
		
}
