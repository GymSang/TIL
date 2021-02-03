package test2;

public class Calculator {

	int sum;
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
    public void mod(int a, int b) {
    	System.out.println(a%b);
    }
		
	public void sum(int a) {
		sum=sum+a;
		//같은 sum을 생략할때 sum+=a;
		//sum-=a; / sum*=a 등등
		
		System.out.println(sum);
	}
}
//method 영역에서는 method 안에있는 명령어가 먼저 수행된다.