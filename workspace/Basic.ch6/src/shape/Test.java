package test.shape;

public class Test {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Printer out=new Printer();
		out.print(c);
		out.print(r);
		out.print(t);
        out.print("java");//if else if에 안걸려서 출력안됨
        //타입 제한을 잘 한것처럼 보이지만 확장성이 떨어진다.
        //if 체크 캐스팅 3대 악성이 다 들어갔다.
        //이걸 해결하려면 상속을 정교하게 세분해야겠다.
        }

}
