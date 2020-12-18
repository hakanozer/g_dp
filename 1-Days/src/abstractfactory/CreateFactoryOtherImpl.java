package abstractfactory;

public class CreateFactoryOtherImpl implements AbstractFactory {

	@Override
	public Elma getElma() {
		return new YesilElma();
	}

	@Override
	public Biber getBiber() {
		return new KirmiziBiber();
	}

}
