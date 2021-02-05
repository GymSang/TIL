package test.abstract_;

public class Dog extends Animal {
	public Dog() {
		this.kind = "댕댕이";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}