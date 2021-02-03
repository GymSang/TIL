 package test.datatype;

 
 import java.util.Date;
 
public class Test {

	
	
	
	public static void main(String[] args) {
		
		
   
		
	
	int age=31;
	double tall=173.5;
	char gender='남';
	boolean isPretty=true;
	
	 //MemberName name=new MemberName();
	String name=new String("김상");
	//MyDate birthday=new MyDate();
	Date birthday=new Date(1991,5,28);
	
    System.out.println(age);
    System.out.println(tall);
    System.out.println(gender);
    System.out.println(isPretty);
	System.out.println(name);
	System.out.println(birthday.getYear()+"년"+birthday.getMonth()+"월"+birthday.getDate()+"일");
	
    
    
	
	
	}
}
 

