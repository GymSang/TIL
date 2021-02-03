package test1;

public class MyProfile {
       String name;
       int age;
       double tall;
       char gender;
       boolean isGood;
       
       public void setProfile(String name1, 
    		   int age1, double tall1, char gender1, boolean isGood1 ) {
       
       //메써드 뒤에는 (), 그뒤에 {} { //정의한다
       //데이터를 표현한다 스트링으로 //이 안에 영역되 있으면 로칼 데이터(스택안에있다)
    	   
       // 여기에 설정값을 넣고 하는건가? 첫번째//
    	   
       name=name1;
       age=age1;
       tall=tall1;
       gender=gender1;
       isGood=isGood1;
       }
       //메소드 선언
       public void printProfile() {   //이거 추가하니까 왼쪽에 추가안해도 양식이 완성되서 알아서 출력되는거 같다.출력하는일
              System.out.println(name);
              System.out.println(age);
              System.out.println(tall);
              System.out.println(gender);
              System.out.println(isGood);
              //세팅과 동시의 출력?, method한테는 method 일만 시키자(왜그럴까?)
    	  
       }
       
}
