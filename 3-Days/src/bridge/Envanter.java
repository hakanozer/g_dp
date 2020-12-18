package bridge;

public abstract class Envanter {
	
	private Uretim uretim;
	
	public abstract void produce();
	
	public Envanter( Uretim uretim ) {
		setUretim(uretim);
	}

	public Uretim getUretim() {
		return uretim;
	}

	public void setUretim(Uretim uretim) {
		this.uretim = uretim;
	}
	

}
