package javastudy1;

//Point Ŭ����
class Point {
	private int x, y;
	//�⺻������ ���� ==> �����Ϸ��� ���� �ڵ����� ����
	void set(int x, int y){ //�޼��� ����
		this.x = x;
		this.y = y;
	}
	void showPoint() { //�޼��� ����
		System.out.println("("+ x + ", " + y + ")");
	}
}

//��ӹ��� ColorPoint Ŭ����
class ColorPoint extends Point { //���� Ŭ���� extends ���� Ŭ����
	//���� Ŭ���������� ����� �߰� ��� Ȯ��
	private String color;
	void setColor(String color){
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color+" ");
		showPoint(); //������ �ִ� �޼��� ȣ��
	}
	
}
	
class DetailedColorPoint extends ColorPoint {
	private String detail;
	void setDetail(String detail){
		this.detail = detail;
	}
	void showDetailedColorPoint() {
		System.out.print(detail + " ");
		showColorPoint();
	}
}
	

public class ColorPointEx {
	
	public static void main(String[] args) {
	//��ü ����
		Point p = new Point();
		p.set(1, 2); //set �޼��� ȣ��
		p.showPoint(); //Point Ŭ���������� �͸� ȣ��
	//��ü ���� ==> ��ӹ��� ��ü
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); //Point Ŭ����(����) ���� ȣ��
		cp.setColor("red"); //ColorPoint�� �ִ� �� ȣ��
		cp.showColorPoint();
	//��ü ���� ==> ��ӹ��� ��ü 2
		DetailedColorPoint dcp = new DetailedColorPoint();
		dcp.set(5, 6);
		dcp.setColor("pink");
		dcp.setDetail("cherry-blossom-like");
		dcp.showDetailedColorPoint();
	}

}
