package iterator;

public class ArrayIterator<T> implements Iterator {
	
	private Object[] users;
	private int possition;


	public ArrayIterator(Object[] uls) {
		setUsers(uls);
	}

	public Object[] getUsers() {
		return users;
	}

	public void setUsers(Object[] objects) {
		this.users = objects;
	}

	public int getPossition() {
		return possition;
	}

	public void setPossition(int possition) {
		this.possition = possition;
	}

	@Override
	public boolean hasNext() {
		
		if ( possition >= getUsers().length || getUsers()[possition] == null ) {
			return false;
		}
		
		return true;
	}

	@Override
	public Object next() {
		
		final Object user = getUsers()[possition];
		possition++;
		return user;
	}

}
