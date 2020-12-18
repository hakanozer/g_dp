package bridge;

public class Kalem extends Envanter {

	public Kalem(Uretim uretim) {
		super(uretim);
	}

	@Override
	public void produce() {
		getUretim().uretimKalem();
		
	}

}
