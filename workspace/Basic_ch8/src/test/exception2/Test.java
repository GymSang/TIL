package test.exception2;

public class Test {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int result=0;
		try{
		  result = c.divide(100, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally { //무조건 동작해야한다면 finally
		System.out.println(result);
		System.out.println("되게 중요한 일");
	}

}
}
