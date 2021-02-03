package test.shape;

public class Circle extends Shape{
	private int radius;
	
	public int getRadius() {
		return radius; //리턴할 수 있게
	}

	public void setRadius(int radius) {
		if(radius>0) {//반드시 유효값 검사
		this.radius = radius; //외부로부터 값을 받아들여
		} else {System.out.println("반지름은 0보다 커야합니다.");
		
		}
	}
		

	public void area() {//재정의 AreaCircle에서 Area로 구현내용이 바뀌어서
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}
}
