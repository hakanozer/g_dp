package observer;

import java.util.ArrayList;
import java.util.List;

public class GoogleNews implements News {
	
	private List<Customer> cls = new ArrayList<>();

	public List<Customer> getCls() {
		return cls;
	}

	public void setCls(List<Customer> cls) {
		this.cls = cls;
	}

	@Override
	public void customerAdd(Customer customer) {
		getCls().add(customer);
	}

	@Override
	public void customerRemove(Customer customer) {
		getCls().remove(customer);
	}

	@Override
	public void newsSend() {
		for (int i = 0; i < getCls().size(); i++) {
			getCls().get(i).update();
		}
		
	}

	
	
}
