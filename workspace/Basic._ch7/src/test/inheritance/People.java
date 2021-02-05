package test.inheritance;

public class People {
	private String name,ssn;

	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People {
    
	Student(){    //컴파일 에러입니다. 왜냐면 슈퍼에 상속받는 생성자가 없어서요
		super();
	}

}