package my.fly;

public class Human extends Animal {
	@Override
	public void eat() {
		System.out.println("밥먹고산다");
	}
	public void walk() {
		System.out.println("직립보행합니다.");
	}
}
