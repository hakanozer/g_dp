package command;

public class Client {
	
	private Command[] commands = new Command[2];
	
	public Client() {
		final Tv tv = new Tv();
		commands[0] = new TvOpen(tv);
		commands[1] = new TvClose(tv);
	}
	
	public void call( final int i ) {
		if ( i > commands.length || i < 0) {
			throw new RuntimeException("Commant Count Fail");
		}
		commands[i].execute();
	}

}
