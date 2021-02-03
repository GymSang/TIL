package my.shop;

public class Vip extends Customer {
	
	@Override //annotation 머릿말 /의미가 있는 주석/ 이거 있으면 오버라이드, 없으면 오버로드로 간주
	public void calcPoint() {
			System.out.println("100포인트 적립되었습니다.");
	}
}
