package test.constructor;

public class Car {
	String company = "현대자동차";
	String model,color;
	int maxSpeed;
	
	//생성자
	public Car() {
	}
	
	public Car(String model) {
		this(model, "은색", 250);
	}

	
	public Car(String model, String color) {
		this(model, color, 250);
	}

	public Car(String model, String color, int maxSpeed) 
	{this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	
			
}
