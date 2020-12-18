package factorymethod;

public class MainFactoryMethod {

	public static void main(String[] args) {
		
		IDocument documentPdf = DocumentFactory.createDocument(EType.pdf);
		IDocument documentWord = DocumentFactory.createDocument(EType.word);
		
		documentCall(documentPdf);
		documentCall(documentWord);
		
		
	}
	
	public static void documentCall( IDocument document ) {
		if ( document instanceof Pdf ) {
			((Pdf) document).callAction();
		}
		System.out.println(document.getDocumentType());
	}

}
