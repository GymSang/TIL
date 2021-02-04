package test.constructor;

public class A extends Object{ //extends object는 생략가능-너무너무 당연
       private  int i;
       private String s;
       
	
	
	   public A( ) {
    	   super( );
    	   System.out.println("A() 생성자 호출");
       }
       public A(int i ) {
    	   super( );
    	   System.out.println("A(int i) 생성자 호출");
       }
       public A(int i, String s ) { //같은 변수가 아니라 오류가 발생하지 않는다
    	   super( );
    	   System.out.println("A(int i, String s)생성자 호출");
       }
       
       public static void main(String[] args) {
		A a1=new A();
		A a2=new A(10);
		A a3=new A(20,"java");
		A a4=new A((int)10.0);
		
	}
}
