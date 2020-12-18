package abstractfactory;

public class CreateFactoryImpl implements AbstractFactory {

	@Override
	public Elma getElma() {
		return new KirmiziElma();
	}

	@Override
	public Biber getBiber() {
		return new YesilBiber();
	}

}
