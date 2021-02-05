package test.shape;

import java.awt.Button;
import java.awt.Component;

public class Test {

	public static void main(String[] args) {
		
		Button com = new Button("전송");
        System.out.println(com.getLabel());
		//		Shape s=new Shape();
		Shape s=new Circle();
		s.area();
//		Circle c=new Circle();
//		c.setRadius(5);
//		Rectangle r=new Rectangle();
//		r.setH(-1);
//		r.setW(-2);
//		Triangle t=new Triangle();
//		t.setH(1);
//		t.setW(2);
//		Printer out=new Printer();
//		out.print((Shape)c); //타입 casting 원 넓이
//		out.print(c); //자기타입에 더 타당한곳으로 들어간다.
//		out.print(r);
//		out.print(t);
//        //out.print("java");
//		//'if' 'else if'에 안걸려서 출력안됨
//        //타입 제한을 잘 한것처럼 보이지만 확장성이 떨어진다.
//        //if 체크 캐스팅 3대 악성이 다 들어갔다.
//        //이걸 해결하려면 상속을 정교하게 세분해야겠다.
//        //Shape.java를 만들자
//        //Shape를 만들자 java에 에러가 생겼다.=robust하다
        }

}
