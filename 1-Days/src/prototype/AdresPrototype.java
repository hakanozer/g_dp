package prototype;

public class AdresPrototype implements Cloneable {
	
	private String sehir;
	private String semt;
	private String no;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getSemt() {
		return semt;
	}

	public void setSemt(String semt) {
		this.semt = semt;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "AdresPrototype [sehir=" + sehir + ", semt=" + semt + ", no=" + no + "]";
	}


}
