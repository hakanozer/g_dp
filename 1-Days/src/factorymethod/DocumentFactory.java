package factorymethod;

public class DocumentFactory {
	
	public static IDocument createDocument( final EType type ) {
		
		IDocument document = null;
		if ( type == EType.pdf ) {
			document = new Pdf();
		}else if ( type == EType.word ) {
			document = new Word();
		}else {
			throw new RuntimeException("Document type name error");
		}
		
		return document;
	}

}
