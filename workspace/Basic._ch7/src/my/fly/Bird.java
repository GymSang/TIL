package my.fly;

public class Bird extends Animal implements Flyer{
	
	@Override
	public void eat() {
		System.out.println("벌레를 잡아먹는다.");
	}
	
	public void fly() {
		System.out.println("날개로 난다");
	}

}
