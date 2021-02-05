package test.abstract_;

public class Cat extends Animal {
	public Cat() {
		this.kind = "고양이";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
