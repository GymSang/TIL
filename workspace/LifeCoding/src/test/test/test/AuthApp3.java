package test.test.test;

public class AuthApp3 {

	public static void main(String[] args) {
		
//		String [] users = {"aa", "bb", "cc"};
		String [][] users = {
				{"aa", "1111"},
				{"aa", "2222"},
				{"aa", "3333"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId) &&
					current[1].equals(inputPass)
							) {
				isLogined = true;
				break;
			}
		}
			
		System.out.println("hi,");
		if(isLogined) {
			System.out.println("master!");
			
		}else {
			System.out.println("fuck you");
		}
		
		
	}

}
