package tet.array;

public class MemberDB {
	String memberNames[]=new String[100];
	
	public void setMemberName(String name) {
		for(int i=0;i<memberNames.length;i++) {
			if(memberNames[i]==null) {
				memberNames[i]=name;
				break;
				
				
			}
		}
     
    	  }
	 public void printNames() {
   	  for(int i=0;i<memberNames.length;i++) {
   		System.out.println(memberNames[i]);    }
	}
}

