package javastudy1;

//Person Ŭ����
class Person {
	String name;
	String id;
	//name �Ű������� �ִ� ������
	public Person(String name) {
		this.name = name;
	}
}		
	
//student Ŭ���� (����)
class Student extends Person {
	String grade;
	String department;
	//������ �ڵ� �ϼ��� �ȵ� ==> ������ �߰�
	public Student(String name){
		super(name); //����Ŭ������ ������ ȣ��
	}
	public String toString() {
		return "�̸��� " + name + ", ���̵�� " + id + " / " + department + " " + grade + "�Դϴ�.";
	}
}

public class CastingEx {
	
	public static void main(String[] args) {
		Person p = new Student("����5");
		//p=s�� ������ ǥ�� (��ĳ����)
		//������ ������ ����
		//���� = ���� (��ĳ����)
		//������ ������ ���� ����
		//p.id = "1234"; // �길 OK
		//p.grade = "A���";  //�� ���·δ� ���� ==> ����ȯ �ʿ�
		//p.department = "�ǿ������а�";  //�� ���·δ� ���� ==> ����ȯ �ʿ�
		//����ȯ�� �ʿ�
		Student s = (Student) p;
		//�ٿ�ĳ���� => ������ ���� ��ȯ (�ݵ�� ����� Ÿ�� ��ȯ ����)
		s.id = "1234";
		s.grade = "A���";
		s.department = "�ǿ������а�";

		//��� ����ϱ� 
		System.out.println(s);
	}

}
