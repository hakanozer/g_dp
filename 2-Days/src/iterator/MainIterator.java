package iterator;

public class MainIterator {

	public static void main(String[] args) {
		
		AGroup<User> aGroup = new AGroup<>();
		Iterator<User> iteratorA = aGroup.getIterator();
		while( iteratorA.hasNext() ) {
			final User user = iteratorA.next();
			System.out.println( user.getName() + "  " + user.getNumber() );
		}

		
	}

}
