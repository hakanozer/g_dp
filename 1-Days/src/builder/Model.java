package builder;

public class Model {
	
	private String model;
	

	public Model(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Model [model=" + model + "]";
	}
	
	

}
