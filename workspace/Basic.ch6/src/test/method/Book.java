package test.method;

public class Book {

	public void want(String ...all) {//...all = var args
//		for(int i=0;i<all.length;i++)
//		System.out.println(all[i]);
		System.out.println(all);
		for(String s:all) {
			System.out.println(s);
		}
	}
	
	public void test() {
		want();
	}
}
