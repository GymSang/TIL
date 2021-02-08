//package test.collection;
//
//import java.util.ArrayList;
//
//public class ListTest {
//
//	public static void main(String[] args) {
//		ArrayList list=new ArrayList();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("1");
//		list.add(new ListTest());
//		System.out.println(list); //toString 메서드가 오버라이딩 되어있다.
//		System.out.println(list.size()); // 순서도 있고 중복도 허용합니다.
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); //0번에 있는거 꺼내겠습니다.
//		}
//		
//	}
//
//}
package test.collection;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("1");
		
		for(String s:list) {			
			System.out.println(s);			
		}
	}

}
