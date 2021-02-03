package test.stmt;

public class ForTest {

	public static void main(String[] args) {
              int i=0;
              for(i=0;i<100;i++) { //i가 for 안으로 들어가서 for안에서만 쓸 수 있는 명령어가 되서 for 문 밖에서는 못찾음)
            	  System.out.println(i);
            	  
            	  
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