package state;

public class EngineOffState implements State {

	@Override
	public void on(Engine engine) {
		System.out.println("EngineOffState Status Close ");
	}

	@Override
	public void off(Engine engine) {
		
		engine.setState(new EngineOnState());
		System.out.println("EngineOffState Status Open ");
		
	}

}
