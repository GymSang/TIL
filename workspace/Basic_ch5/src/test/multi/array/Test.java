package test.multi.array;

public class Test {

	public static void main(String[] args) {
		int [][]all =new int [3][2];   //3행 2열짜리 배열, []두개 2차원, 3개 3차원.. 앞에만 비워두고 뒤에 값을 넣을순 없어 
        System.out.println(all);   //결괏값 2차원 I인트 @주소값
        System.out.println(all[0]); //결괏값 1차원 I인트 @주소값
        System.out.println(all[1]); //결괏값 1차원 I인트 @주소값
        System.out.println(all[2]); //결괏값 1차원 I인트 @주소값
        all[0][0]=100;
        System.out.println(all[0][0]);//왜 100이고 왜 0이냐 그냥 위에 지정해놔서 그런건가
        System.out.println(all[2][1]);
        all[2][1]=1000;
        System.out.println(all[2][1]);//이건 또 1000이네
        System.out.println(all.length);       //이건 뭐야 시발
        System.out.println(all[0].length);    
        
        char[][]all2= {{'a','b'},{'c','d','e'}}; //new 2차원 배열을 만들건데 char[2] 방 2개짜리 먼저, []뒤에는 고정할수가 없어왜냐면 앞엔 두개고 뒤엔 cde 3개니까, 선언생성초기화를 한번에 하는방법?
	}

}
