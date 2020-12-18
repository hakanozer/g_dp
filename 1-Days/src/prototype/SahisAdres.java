package prototype;

public class SahisAdres extends AdresPrototype {
	
	private String adi;
	private int tc;
	
	public SahisAdres( String sehir, String semt, String no, String adi, int tc ) {
		setSehir(sehir);
		setSemt(semt);
		setNo(no);
		setAdi(adi);
		setTc(tc);
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getTc() {
		return tc;
	}

	public void setTc(int tc) {
		this.tc = tc;
	}

	@Override
	public String toString() {
		return "SahisAdres [adi=" + adi + ", tc=" + tc + ", getSehir()=" + getSehir() + ", getSemt()=" + getSemt()
				+ ", getNo()=" + getNo() + "]";
	}

	
	
	
}
