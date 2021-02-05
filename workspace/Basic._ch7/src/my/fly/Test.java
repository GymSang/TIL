package my.fly;

public class Test {

	public static void main(String[] args) {
		
		Animal ani = new Human();
		ani.eat();
		
		Bird b=new Bird();
		Superman s=new Superman();
		Airplane a=new Airplane();
		

		Show show=new Show();
		show.airShow(b);
		show.airShow(s);
		show.airShow(a);
		show.airShow("java");

	}

}
