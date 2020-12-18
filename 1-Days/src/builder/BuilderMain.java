package builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		SiparisManager manager = new SiparisManager();
		Araba a1 = manager.order("audi", "A6", "Siyah", 230);
		System.out.println(manager.toString());
		
		manager = new SiparisManager();
		Araba a2 = manager.order("ford", "focus", "Beyaz", 30);
		System.out.println(manager.toString());

	}

}
