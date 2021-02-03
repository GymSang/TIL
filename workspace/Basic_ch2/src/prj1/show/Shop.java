package prj1.show;

public class Shop {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.name="김상원";
		c1.address="남양주";
		c1.gender='남';
		
		System.out.println(c1);
		System.out.println(c1.name);
		System.out.println("["+c1.gender+"]");
		System.out.println(c1.age);
        System.out.println(c1.tall);
        System.out.println(c1.isGood);
        
        Customer c2=new Customer();
        c1.name="김경은";
		c1.address="서울";
		c1.gender='여';
		
		System.out.println(c2);
		System.out.println(c2.name);
		System.out.println("["+c2.gender+"]");
		System.out.println(c2.age);
        System.out.println(c2.tall);
        System.out.println(c2.isGood);

	}

}
