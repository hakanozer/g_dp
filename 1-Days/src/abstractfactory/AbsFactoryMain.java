package abstractfactory;

public class AbsFactoryMain {

	public static void main(String[] args) {
		
		
		CreateFactoryImpl factory = new CreateFactoryImpl();
		Biber biber = factory.getBiber();
		Elma elma = factory.getElma();
		call(biber, elma);
		
		CreateFactoryOtherImpl otherfactory = new CreateFactoryOtherImpl();
		biber = otherfactory.getBiber();
		elma = otherfactory.getElma();
		call(biber, elma);

	}
	
	public static void call( Biber biber, Elma elma ) {
		System.out.println(biber.getType());
		System.out.println(elma.getType());
	}

}
