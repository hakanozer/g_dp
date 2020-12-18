package factory;

public class AudiFabrika extends ArabaFabrika {

	@Override
	public void createAuto() {
		getArabaListesi().add(new A5(150));
		getArabaListesi().add(new A6(180));
	}

}
