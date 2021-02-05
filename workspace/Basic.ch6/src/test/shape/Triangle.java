package test.shape;

public class Triangle extends Shape{
	private int w,h;
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		if(w>0) {this.w = w;
		} else { System.out.println("0보다 큰 수여야 합니다.");
		
		}
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		if(h>0) { this.h = h;} else { System.out.println("0보다 커야합니다");
		}
	}
	

	public void area() { //재정의
		System.out.println("삼각형의 넓이="+(w*h/2));
	}

}
