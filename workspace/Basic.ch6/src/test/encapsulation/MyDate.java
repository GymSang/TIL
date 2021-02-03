package test.encapsulation;

public class MyDate {
//	int year; 
//	int month;
//	int day;
//	int year,month,day 이렇게 쓸 수도 있다
	private int year;
	private int month;
	private int day; //이렇게 하면 같은 패키지내에서 이 클래스에서만 사용가능 다른곳에서는 보이지 않는다
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	//외부에서 값을 받아들이도록 정리(int year2);
	public void setYear(int year2){
		if(year2>0 && year2<2022) { 
	    	 //0보다 커야하고 그리고[&&]
			//들어온 값이 맞는지 확인 = 유효성 검사가 필요
			year=year2;
//			return "정상입니다";
	} else {
			System.out.println("똑바로써라 연도");
//		    return "똑바로써라";
		}
		
	}

	public void setMonth(int month) {//source - generate getters and setters 하니까 나왔어
		if(month>0 && month<13) {
		this.month = month;
	}else {
		
		System.out.println("똑바로써라 월");
	}
	}

	public void setDay(int day) {
		if(day>0 && day<32) {
		this.day = day;
	}else {
		System.out.println("똑바로써라 날짜");
	}
		}
		
}
// 캡슐화 그냥 나열하면 안되니까 private로 묶어놓고 유효성검사로 한다 씨발 뭔소리야 개 빻으년아
