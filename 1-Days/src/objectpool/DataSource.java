package objectpool;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
	
	static DataSource intance = new DataSource();
	
	List<Connection> pools = new ArrayList<>();
	
	
	public DataSource() {
		init();
	}
	
	public void init() {
		for (int i = 0; i < 5; i++) {
			pools.add(new Connection());
		}
	}
	
	
	static Connection getConnection() throws Exception {
		if ( intance.pools.size() == 0 ) {
			throw new Exception();
		}
		
		Connection con = intance.pools.get(0);
		intance.pools.remove(0);
		System.out.println(con);
		return con;
	}
	
	static void release( Connection con ) {
		if ( con != null ) {
			intance.pools.add(con);
		}
	}
	
	

}
