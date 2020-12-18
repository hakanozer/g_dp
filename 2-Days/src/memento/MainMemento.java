package memento;

public class MainMemento {

	public static void main(String[] args) {
		
		final Document document = new Document();
		
		document.addData(0, "İstanbul");
		document.addData(1, "Bursa");
		document.addData(2, "Ankara");
		document.addData(3, "Adana");
		document.addData(4, "İzmir");
		document.addData(5, "Samsun");
		
		// step -1
		final Memento memento = document.createMemento();
		System.out.println("Step 1 : " + document.toString());
		
		// step -2
		document.removeData(3);
		document.addData(3, "Gaziantep");
		System.out.println("Step 2 : " + document.toString());
		
		
		// step -3 -> back
		document.setMemento(memento);
		System.out.println("Step 3 : " + document.toString());
		
	}
}
