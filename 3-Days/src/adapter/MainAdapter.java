package adapter;

public class MainAdapter {

	public static void main(String[] args) {
		
		IUser user = new UserAdapterImpl();
		int aa =  ((UserAdapterImpl) user).a;
		user.profile();
		
		
	}
	
}
