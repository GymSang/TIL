package my.fly;

public class Airplane extends Vehicle {
	
//	@Override
//	public int transfer(int start, int end) {
//		int distance=end-start;
//		return distance;
//	}
//	
	public void flight() {
		int distance=transfer(10,1000);
		System.out.println(distance+"거리만큼 엔진을 가동해서 난다");
	}

}
