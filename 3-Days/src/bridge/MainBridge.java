package bridge;

public class MainBridge {

	public static void main(String[] args) {
		
		Uretim xFabrikaImpl = new XFabrikaImpl();
		Envanter defter = new Defter( xFabrikaImpl );
		Envanter kalem = new Kalem( xFabrikaImpl );
		call(defter);
		call(kalem);
		
		Uretim yFabrikaImpl = new YFabrikaImpl();
		defter = new Defter( yFabrikaImpl );
		kalem = new Kalem( yFabrikaImpl );
		call(defter);
		call(kalem);
		
	}
	
	public static void call( Envanter envanter ) {
		envanter.produce();
	}

}
