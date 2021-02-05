package test.shape;
//이름만으로도 의미가 있다. shape가.
public abstract class Shape {
	abstract public void area();//앞에 지정자가 있으면 정의, (); 있으면 호출
		//구현할 내용
		//구현할 내용이 없어도 할 가치가 있다. 
		//tri, cir, rec 에서 재정의 할걸 기대하고, 오버라이딩할걸 기대하고 한건데
	
	
}
class Polygon extends Shape{

	@Override
	public void area() {
		System.out.println("오각형의 넓이=:");
		
	}
	
}