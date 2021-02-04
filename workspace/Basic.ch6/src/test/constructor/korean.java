package test.constructor;

public class korean {
  String nation = "대한민국";
  String name;
  String ssn;
  
  //생성자
  public korean(String n, String s) {
	  name=n;
	  ssn=s;
	 
  }
  public korean() {
	  this("홍길동","000000-0000000");
	  
  }
}
