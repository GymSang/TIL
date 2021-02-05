package test.exception;

public class Test {

	public static void main(String[] args) {
		//먹구름도 구름인거지
		try {    //try {일어날 수 일 } catch(일어날수 잇는 예외){}
		int x=100;
		args[0]=null;
		int y=Integer.parseInt(args[0].trim());
		System.out.println(x/y);
	}catch(ArithmeticException e) 
		{System.out.println("0으로 나누지 마세요");
	}catch(NumberFormatException e) 
		{System.out.println("숫자로 바꿀수 없는 입력이에요");
	}catch(ArrayIndexOutOfBoundsException e) 
		{System.out.println("숫자를 입력하세요");
	}catch(Exception e)  //익셉션은 여기 있어야한다. 위에 있으면 위에서 익셉션 잡아버린다.
		{System.out.println("오류가 발생했어요");
	}System.out.println("아주 중요한 일 시작...");	
  }
}


