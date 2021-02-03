package test.datatype;

public class StringTest {

	public static void main(String[] args) {
		// String 을 primitive 타입으로 안쓰시는 이유가 있나요?

		String s1=new String("java");
		String s2=new String("java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		String s3="java";
		String s4="java";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
	}

}
