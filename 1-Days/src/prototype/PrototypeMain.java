package prototype;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		final Adres adres = new Adres("İstanbul", "Beşiktaş", "34");
		//System.out.println(adres.toString());
		
		
		final Adres adres2 = (Adres) adres.clone();
		adres2.setNo("06");
		//System.out.println(adres2.toString());
		
		
		final SahisAdres sahis1 = new SahisAdres("İzmir", "Buca", "35", "Ali Bilmem", 12345678);
		System.out.println(sahis1.toString());
		final SahisAdres sahis2 = (SahisAdres) sahis1.clone();
		sahis2.setAdi("Erkan Bilirim");
		System.out.println(sahis2.toString());
		System.out.println(sahis1.toString());
		
		
		//System.out.println(adres.getClass().hashCode());
		//System.out.println(adres2.getClass().hashCode());
		//System.out.println(sahis1.getClass().hashCode());
		//System.out.println(sahis2.getClass().hashCode());
		
		
	}

}
