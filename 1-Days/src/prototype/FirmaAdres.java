package prototype;

public class FirmaAdres extends AdresPrototype {

	private String firmaBaslik;
	
	public FirmaAdres( String sehir, String semt, String no, String firmaBaslik ) {
		setSehir(sehir);
		setSemt(semt);
		setNo(no);
		setFirmaBaslik(firmaBaslik);
	}

	public String getFirmaBaslik() {
		return firmaBaslik;
	}

	public void setFirmaBaslik(String firmaBaslik) {
		this.firmaBaslik = firmaBaslik;
	}
	
	
	
}
