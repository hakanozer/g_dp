package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			Singleton singleton = Singleton.instance();
			System.out.println(singleton.getClass().hashCode());
			singleton.printName(i);
		}
		

	}

}
