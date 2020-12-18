package polimorfizm;

public class B extends Base {
	
	@Override
	public void action() {
		System.out.println("B action Call - " + number);
	}
	
	public int sum( int a, int b ) {
		return a + b;
	}
	
	
}