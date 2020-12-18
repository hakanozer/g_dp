package factorymethod;

public class Pdf implements IDocument {

	@Override
	public String getDocumentType() {
		return "Pdf";
	}
	
	
	public void callAction() {
		sum(30, 50);
		System.out.println("callAction Call");
	}
	
	@Override
	public int sum(int a, int b) {
		return a * b;
	}

	
	
}
