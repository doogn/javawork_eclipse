package javastudy1;

public class Book {
	String title;
	String author;
	public void show() {
		System.out.println(title + " " + author);
	}

	//�⺻ ������
	public Book() {
		this("",""); //Book(String, String); ������ ȣ�� - �׻� ���� ���� ��� ��
		System.out.println("������ ȣ���");
 	}
	
	//�Ű������� �ϳ��� �ִ� ������
	public Book(String title){
		this(title,"���ڹ̻�");
	}
	
	//�Ű������� �� ���� �ִ� ������
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
		
}
