package command;

public class TvClose implements Command {
	
	private Tv tv = null;
	
	public TvClose( final Tv tv ) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.close();
	}

}