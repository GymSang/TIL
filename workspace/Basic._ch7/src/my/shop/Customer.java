package my.shop;

public class Customer {
	private String name;
	private int custNo;
	private String address;
//	    String type; //VIP인지 블랙리스트인지 감별 
////	절차 중심적 사고  - new class [ black, vip, guest]
////	   고객  <- VIP
////	     <- 게스트
////	     <- 블랙리스트
	public void calcPoint() { //점수 계산할거야
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//유효성 검사
		this.name = name;
		
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		//유효성 검사
		this.custNo = custNo;
	
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		//유효성 검사
		this.address = address;
		
	}
	
	
}
