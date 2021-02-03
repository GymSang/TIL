package test.shape;
public class Printer {	
	public void print(Shape s) {
		s.area();
	}
	public void print(Circle c) {
		System.out.println(c.getRadius());
	}
	public void print(Rectangle r) {
		System.out.println(r.getW());
	}
}

//	public void print(Shape o) {
//		if(o instanceof Circle) {
//			Circle c=(Circle)o;
//			c.radius=5;
//			c.areaCircle();
//		}else if(o instanceof Rectangle) {
//			Rectangle r=(Rectangle)o;
//			r.h=3;
//			r.w=4;
//			r.areaRec();
//		}else if(o instanceof Triangle) {
//			Triangle t=(Triangle)o;
//			t.h=8;
//			t.w=2;
//			t.areaTri();
//		}
//		
//	}

