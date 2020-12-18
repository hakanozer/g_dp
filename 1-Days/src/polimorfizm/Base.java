package polimorfizm;

public class Base {
	
	int number = 0;
	
	public Base() {
		System.out.println("Base Call");
	}
	
	public Base( int number ) {
		this.number = number;
	}
	
	public void action() {}
	
	final void minus() {
		System.out.println("minus call");
	}

}
