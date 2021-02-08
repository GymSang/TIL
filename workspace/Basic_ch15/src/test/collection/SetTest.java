package test.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>(); //제네릭, 타입 파라미터<String>
		set.add("1");
		set.add("2");
		set.add("3");
		//set.add(new SetTest());
		//set.add(new SetTest());
		set.add("1");
		System.out.println(set);
		System.out.println(set.size());
		Iterator<String> ite=set.iterator();
		System.out.println(ite);
		while(ite.hasNext()) {
			String o=ite.next();
			System.out.println(o);
		}
	}

}
