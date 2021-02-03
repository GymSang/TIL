package test.stmt;

public class ContinueTest {

	public static void main(String[] args) {
//		data
//		while(조건에 맞는지를 확인해봐요) {
//			true가 나오면 실행,    실행문;
//			증감치를 줘야함 변화,    증감치;
//			맞으면 또 실행하고 아니면 안하고 반복
//		}
              int i=0;
              for(i=0;i<10;i++) { //i가 for 안으로 들어가서 for안에서만 쓸 수 있는 명령어가 되서 for 문 밖에서는 못찾음)
            	  if(i==5) {
            		  continue;  //continue 만나서 아래로
            	  }
            	  System.out.println(i); //i가 5가 되었을때 생략하고 아래로 가버림
            	  
            	  
              }
              System.out.println("i="+i);
	}

}
////int i=0;
//while(i<100) {
//	  System.out.println(i);
//	  i++;
//	  
//}
//System.out.println("i="+i);