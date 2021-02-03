package tet.array;

public class StringTest {

	public static void main(String[] args) {
		String []all=new String[5];
		System.out.println(all);
		System.out.println(all[0]);
        String s1=new String("java"); //이게 스트링객체래
        all[0]=s1;
        all[1]=new String("java"); //string은 내부적으로 캐릭터 배열을 가져요 ㅆ비ㅏㄹ char[]
        all[2]="java";
        all[3]="java";
        for(int i=0;i<all.length;i++) {
        System.out.println(all[i]);
        }
        
        
	}

}
////string membernames [] = new string[100];
//memberNames[0]="김상원";
//memberNames[1]="아이유";
