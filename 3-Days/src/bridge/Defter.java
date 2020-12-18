package bridge;

public class Defter extends Envanter {

	public Defter(Uretim uretim) {
		super(uretim);
	}

	@Override
	public void produce() {
		getUretim().uretimDefter();
	}

}