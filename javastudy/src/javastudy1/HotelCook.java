package javastudy1;

public class HotelCook implements BurgerCook {
//인터페이스에 있는 메서드를 구현(implement)하는 부분
	
	public void makeBurger() {
		System.out.println("호텔 햄버거");

	}

	public void makeSalad() {
		System.out.println("호텔 샐러드");

	}

}