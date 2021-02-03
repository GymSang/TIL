package test.array.copy;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) { //for(초기치, 조건, 연산자)
			System.out.print(newStrArray[i] + ",");
		}
        for(String s:newStrArray) { //이걸 하나씩 꺼냈을때의 데이터를 앞에 씁니다. 그리고 이름을 씁니다. :배열의 이름을 뒤에 씁니다 , 향상된 for 문
            System.out.println(s);}
	}

}
