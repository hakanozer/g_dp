package bridge;

public class YFabrikaImpl implements Uretim {
	
	private YFabrika yfab = new YFabrika();

	@Override
	public void uretimKalem() {
		yfab.fncDolmaKalem();
	}

	@Override
	public void uretimDefter() {
		yfab.fncCizgiliDefter();
	}

}
