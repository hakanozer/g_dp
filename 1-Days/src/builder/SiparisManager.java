package builder;

public class SiparisManager {
	
	private SiparisBuilder builder;
	
	public Araba order( String marka, String model, String renk, int beygirGucu ) {
		
		if ( marka.equals("audi") ) {
			builder = new AudiSiparisBuilder();
		}else if ( marka.equals("ford") ) {
			builder = new FordSiparisBuilder();
		}
		
		builder.setBeygirGucu(beygirGucu);
		builder.setMarka(marka);
		builder.setModel(model);
		builder.setRenk(renk);
		
		return builder.getAraba();
	}

	@Override
	public String toString() {
		return "SiparisManager [marka=" + builder.getAraba().getMarka() + "model=" + builder.getAraba().getModel() + " ]";
	}
	
	

}
