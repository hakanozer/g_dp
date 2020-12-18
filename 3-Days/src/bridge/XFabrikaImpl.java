package bridge;

public class XFabrikaImpl implements Uretim {
	
	private XFabrika xfab = new XFabrika();

	@Override
	public void uretimKalem() {
		xfab.fncTukenmezKalem();
		
	}

	@Override
	public void uretimDefter() {
		xfab.fncKareliDefter();
		
	}

	
	
}
