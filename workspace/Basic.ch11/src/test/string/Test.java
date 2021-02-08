package test.string;

public class Test {

		public static void main(String[] args) {
			String s1=new String("java");
			String s3="java";
			
			StringBuffer sb1=new StringBuffer("java");
			
			StringBuffer sb2=sb1.append("1"); //append 추가하다
			
			
			System.out.println(sb1);
			System.out.println(sb2);
			System.out.println(sb1==sb2);
//			s1.concat("1");
//			s2.concat("1");
//			s3.concat("1");
//			s4.concat("1"); //원본 문자열에 변경을 일으켰을때 어떤 변화가 일어나는지 보자
//			System.out.println(s1);
//			System.out.println(s2);
//			System.out.println(s3);
//			System.out.println(s4);
			
		}
}
