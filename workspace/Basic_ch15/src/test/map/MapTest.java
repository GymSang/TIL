package test.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class MapTest {

	public static void main(String[] args) {
		Hashtable map=new Hashtable();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "1");
		map.put("d", new MapTest()); //이름은 겹치면 절대 안돼여
		
		System.out.println(map);
		System.out.println(map.size());
		
		Object o1=map.get("a");
		Object o2=map.get("c");
		System.out.println(o1==o2);

		Enumeration enu=map.keys();
	}

}
