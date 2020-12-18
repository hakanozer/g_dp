package observer;

public class MainObserver {

	public static void main(String[] args) {
		
		News google = new GoogleNews();
		
		Customer ali = new User("Ali Bilmem");
		Customer veli = new User("Veli Bilmem");
		Customer ayse = new User("Ayşe Bilmem");
		Customer mehmet = new User("Mehmet Bilmem");
		
		google.customerAdd(ali);
		google.customerAdd(veli);
		google.customerAdd(ayse);
		google.customerAdd(mehmet);
		
		google.newsSend();
		
		google.customerRemove(ayse);
		google.newsSend();
		

	}

}
