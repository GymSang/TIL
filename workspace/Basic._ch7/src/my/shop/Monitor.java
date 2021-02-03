package my.shop;

public class Monitor {

		public void monitorPoint(Customer c) {
			c.calcPoint();  //확장성이 좋고 성능도 좋다 / 오버라이딩된 method
		}
		
		public void monitorPoint(Vip c) {
			c.getAddress();
			
		}
		
		public void monitorPoin(Black c) {
		    c.getCustNo();
		}
            
		}

