package javastudy1;

public class Circle {
	public int radius; //�ʵ�(=��� ����)
	public String name; //�ʵ�
	//�ʵ�: Circle Ŭ������ ������ Ư¡
	//==>�� �ʵ� �̿��ؼ� �޼ҵ忡�� �۾�(���� �ο�)
	
	//�޼��� => ���� �ο�
	//������(public/private) ����Ÿ�� �޼����̸�(...) {}
	public double getArea() {
		return 3.14*radius*radius;
		//3.14*this.radius*this.radius
		//3.14*Circle.radius*Circle.radius		
	}  
		
	//�⺻������ ==> Ŭ���� �̸��� ����
	//������ Ŭ�����̸�() ... *Return Ÿ�� ����
	public Circle() {
	}
	
	//�Ű������� �ִ� ������
	public Circle(int r, String n) {
		radius = r; //Ŭ���� �ʵ� = ���޵Ǵ� ��
		name = n;
	}
		
	public static void main(String[] args) {
		//Circle Ŭ������ �ִ� ������ �޼��带 ������ ������..
		Circle pizza; //Ŭ������ ������(��ü)
		pizza = new Circle(); //��ü Ʋ���� �￡�� ����ϱ� (�ν���Ʈȭ)
		
		pizza.radius = 10;
		pizza.name = "�ڹ�����"; //��ü��.�ʵ�(����) = ��
		double area = pizza.getArea(); //���� = ��ü��.�޼���()
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle(); //�ν���Ʈȭ: ���� ���� 22~23�� �� ���� �� �ٷ� (�̰� �� ���� ����)  
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name +"�� ������ " + area);
		
		//Rectangle Ŭ������ �ִ� ������ �޼��带 ������ ������..
		Rectangle rect = new Rectangle(); //��ü �ν��Ͻ�ȭ
		rect.width = 40;
		rect.height = 100;
		rect.name = "�ڹٽĻ�";
		int area1 = rect.getArea();
		System.out.println(rect.name +"�� ������ " + area1);
		
		//�Ű������� �ִ� �����ڸ� ���� ��ü ����
		Circle test = new Circle(15, "�ڹٹ���");
		area = test.getArea();
		System.out.println(test.name +"�� ������ " + area);
	
		//Rectangle Ŭ������ �Ű����� ������ �����
		//��ü ���� �ϳ� �ϱ�
		Rectangle rect2 = new Rectangle(12, 16, "�ڹ�����");
		int area2 = rect2.getArea();
		System.out.println(rect2.name +"�� ������ " + area2);
		
		//Circle�� Book ��ü ����
		Book javaBook = new Book("java", "���ڹ�");
		Book bible = new Book ("bible");
		Book emptyBook = new Book();
		bible.show();
		javaBook.show();
		emptyBook.show();
	}

}