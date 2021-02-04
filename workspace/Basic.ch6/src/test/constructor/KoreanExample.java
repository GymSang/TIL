package test.constructor;

public class KoreanExample {

	public static void main(String[] args) {
		korean k1 = new korean("박자바", "910528-1234567");
				System.out.println("k1.name :" +k1.name);
				System.out.println("k1.ssn :" +k1.ssn);
		korean k2 = new korean("이자바", "770228-2234567");
				System.out.println("k2.name :" +k2.name);
				System.out.println("k2.ssn :" +k2.ssn);
         
		korean k3=new korean();
		
	}

}
