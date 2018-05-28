package javastudy1;

public class Phone {
	private String name;
	private String tel;
	//필드 (멤버 변수)
	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
		
	//getter / setter 메서드 - 여기서는 setter는 사실 필요 없음
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
