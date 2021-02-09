package test.thread;

public class Test {

	public static void main(String[] args) {
		A obj1=new A();
		A obj2=new A();
		
		obj1.start();
		obj2.start();
	
		}

}

class A extends Thread{
	public void run() {
		for(int i=0;i<111;i++) {
			System.out.println(i);
		}
	
	}
}