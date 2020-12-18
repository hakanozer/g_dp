package adapter;

public class UserAdapterImpl extends AdapterUser implements IUser {
	
	int a = 10;

	@Override
	public void profile() {
		
		control();
		System.out.println("User Profile Call");
	}

}
