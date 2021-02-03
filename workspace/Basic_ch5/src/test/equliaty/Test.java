package test.equliaty;

public class Test {

	public static void main(String[] args) {
		byte b=1;
		int i=1;
		double d=1.0;
		System.out.println(i==d);
        
		Test t1=new Test(); //100번지, 200번지가 달라서 false인가 그렇다
		Test t2=new Test();
		Test t3=t1;
		System.out.println(t3==t1);
	}

}
