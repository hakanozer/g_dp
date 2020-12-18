package state;

public class EngineOnState implements State {

	@Override
	public void on(Engine engine) {
		System.out.println("EngineOnState Status Open ");
	}

	@Override
	public void off(Engine engine) {
		engine.setState(new EngineOffState());
		System.out.println("EngineOnState Status Close ");
	}

}
