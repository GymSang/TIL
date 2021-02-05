package test.abstract_;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰드아");
	}

	public abstract void sound();
}

