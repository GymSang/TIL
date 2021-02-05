package test.exception2;

public class Calculator {
	
	public int divide(int x, int y) throws MyException {
		int z=0;
		if(y==0) {
			throw new MyException("y를 "
					+ "0으로 입력하지 마세요");
		}
		z=x/y;
	 return z;
	}
	}
	
		
		//	 	int z=0; //초기화 해야한다.
//		try {
//	    z=x/y;
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나누면 에러가 납니다.");
//			}
//		return z; 
//		//시험에 나와요
//	}
//}
