package my.fly;

public class Superman extends Human {
	
	@Override
	public void eat() {
		//슈퍼잇 있으면 밥먹고 빵먹고 없으면 빵
		super.eat();
		System.out.println("빵도 먹는다");
	}
	public void flying() {
		System.out.println("망토를 날리며 난다");
	}
}
