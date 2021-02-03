package my.shop;

public class Test {

	public static void main(String[] args) {
		Vip cust1=new Vip();
		Guest cust2=new Guest();
		Black cust3=new Black();
		
		Monitor m=new Monitor();
		m.monitorPoint(cust1);  //왜 sysout이 안붙었는데 출력이 되는거지?
		m.monitorPoint(cust2);
		m.monitorPoint(cust3);
		

	}

}
