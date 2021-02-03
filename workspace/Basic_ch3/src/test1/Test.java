package test1;

public class Test {

	public static void main(String[] args) {
		MyProfile m1=new MyProfile();
		m1.setProfile("김상원",  31, 173.5, '남', true); //method 호출 [그다음 이걸로 하는건가 두번째]
		System.out.println(m1);
		m1.printProfile(); //추가된 양식
		
		MyProfile m2=new MyProfile();
		m2.setProfile("아이유", 29, 161.8, '여', true); 
		System.out.println(m2);
		m2.printProfile(); //추가된 양식
	}

}
//아하 method 이럴때 쓰는거구나. 데이터를 세팅하거나 일을 시킬때?