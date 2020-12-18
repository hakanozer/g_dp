package iterator;

public class AGroup<T> implements Group {

	private Object[] uls = new Object[4];
	
	public T[] getUls() {
		return (T[]) uls;
	}

	public void setUls(T[] uls) {
		this.uls = uls;
	}


	public AGroup() {
		
		
		User u1 = new User("Ali", 10);
		User u2 = new User("Veli", 11);
		User u3 = new User("Zehra", 12);
		User u4 = new User("Ahmet", 13);
		
		uls[0] = u1;
		uls[1] = u2;
		uls[2] = u3;
		uls[3] = u4;		
		
	}

	@Override
	public Iterator getIterator() {
		return new ArrayIterator( getUls() );
	}

}
