package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class ArabaFabrika {
	
	private List<Araba> arabaListesi = new ArrayList<>();
	
	public ArabaFabrika() {
		createAuto();
	}
	
	public abstract void createAuto();

	public List<Araba> getArabaListesi() {
		return arabaListesi;
	}

	public void setArabaListesi(List<Araba> arabaListesi) {
		this.arabaListesi = arabaListesi;
	}

	
	
}
