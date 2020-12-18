package polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class MainPoli {

	public static void main(String[] args) {
		
		String name = "Ali";
		
		// list
		List<String> ls = new ArrayList<>();
		ArrayList<String> als = new ArrayList<>();
		// ls 
		// List -> A
		// -> Arraylist -> B
		// List + Arraylist -> C
		
		Object oa = new A();
		Base ba = new A();
		
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		
		fncAction(a);
		fncAction(b);
		fncAction(c);
		
	}
	
	
	public static void fncAction( Base base ) {
		
		if ( base instanceof B ) {
			B b = (B) base;
			int sm = b.sum(10, 30);
			System.out.println("Sm : " + sm);
		}

		base.action();
	}

}
