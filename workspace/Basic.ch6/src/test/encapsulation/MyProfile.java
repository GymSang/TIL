package test.encapsulation;

public class MyProfile {
	String name="김상원";
	MyDate birthday=new MyDate();
	
	public void setBirthday() {
		birthday.setYear(1991);
		birthday.setMonth(5);
		birthday.setDay(28);
		
		System.out.println(birthday.getYear()+"년"+birthday.getMonth()+"월"+birthday.getDay()+"일");
	}
	

}
