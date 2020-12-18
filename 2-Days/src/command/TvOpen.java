package command;

public class TvOpen implements Command {
	
	private Tv tv = null;
	
	public TvOpen( final Tv tv ) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.open();
	}

}
