package factorymethod;

import java.util.Random;

public interface IDocument {
	
	String getDocumentType();
	
	default public int sum( int a, int b ) {
		return a + b;
	}
	
	class Util extends Random {

		private static final long serialVersionUID = 1L;
		
		
	}

}
