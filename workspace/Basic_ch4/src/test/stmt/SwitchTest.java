package test.stmt;

public class SwitchTest {

	public static void main(String[] args) {
//		data
//		switch(조건 - 조건식의 값을 가져야 한다. 어떤 식)
//		case 값: 실행문;
//		break;
//		case 값: 실행문;
//		break;
		
		int month=105;
		switch(month) {//byte,short,int,char을 리턴하는 4개의 값, long은 안된대
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			    System.out.println(month+"월은 31일까지 있습니다.");
	    break;

		case 2: System.out.println(month+"월은 28일까지 있습니다.");
       break;
        
		case 4:
		case 6:
		case 9:
		case 11:
		        System.out.println(month+"월은 30일까지 있습니다.");
		 
		break;
		default :        System.out.println("올바른 값이 아닙니다.");
		        
		
		}

	}

}
