package test.static_;

public class Test {
	static int i=10;
	public static void main(String[] args) {
		
			A o1=new A("이지은");
			o1.count++;
			
			A o2=new A("이지안");
			o2.count++;
			
			o1.printCount();
			
	}

}

class A{
	 String name;
	 static int count=0; //방문횟수
     static public void printCount() {
    	 System.out.println(count);
     }
     A(String name){
    	 this.name=name;
     }
}