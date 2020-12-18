package factory;

public class MainFactory {

	public static void main(String[] args) {
		
		BmwFabrika bmwFabrika = new BmwFabrika();
		//bmwFabrika.getArabaListesi().add(new Z4(210));
		
		AudiFabrika audiFabrika = new AudiFabrika();
		
		fabrikaArac(bmwFabrika);
		fabrikaArac(audiFabrika);

	}
	
	public static void fabrikaArac( ArabaFabrika fabrika ) {
		for (Araba item : fabrika.getArabaListesi()) {
			System.out.println(item.toString());
		}
	}

}
