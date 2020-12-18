package memento;

import java.util.ArrayList;
import java.util.List;

public class Document {
	
	
	private List<String> datas = new ArrayList<>();
	
	public void addData( int index, String data ) {
		getDatas().add(index, data);
	}
	
	public void removeData( int index ) {
		getDatas().remove(index);
	}

	public List<String> getDatas() {
		return datas;
	}

	public void setDatas(List<String> datas) {
		this.datas = datas;
	}
	
	
	public Memento createMemento() {
		return new Memento(datas.toArray());
	}
	
	
	public void setMemento( final Memento memento ) {
		
		getDatas().clear();
		final Object[] objects = memento.getElements();
		for (int i = 0; i < objects.length; i++) {
			String st = (String) objects[i];
			getDatas().add(st);
		}
		
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < getDatas().size(); i++) {
			builder.append(getDatas().get(i)).append(System.lineSeparator());
		}
		
		return builder.toString();
	}
	
	

}
