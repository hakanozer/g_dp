package iterator;

public class BGroup implements Group {

	private Customer[] uls = new Customer[4];
	
	public Customer[] getUls() {
		return uls;
	}

	public void setUls(Customer[] uls) {
		this.uls = uls;
	}


	public BGroup() {
		Customer u1 = new Customer("ali@ali.com", 23456789);
		Customer u2 = new Customer("veli@veli.com", 456423456);
		Customer u3 = new Customer("zehra@zehra.com", 1231231231);
		Customer u4 = new Customer("ahmet@ahmet.com", 23423423);
		
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
