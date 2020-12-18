package polimorfizm;

public class A extends Base {
	
	public A() {
		super(10);
		super.action();
	}
	
	@Override
	public void action() {
		minus();
		System.out.println("A action Call - " + number);
	}
	
}
