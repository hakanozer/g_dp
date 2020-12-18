package objectpool;

public class ConnectionPoolMain {

	public static void main(String[] args) throws Exception {
		
		Connection c1 = DataSource.getConnection();
		Connection c2 = DataSource.getConnection();
		Connection c3 = DataSource.getConnection();
		Connection c4 = DataSource.getConnection();
		Connection c5 = DataSource.getConnection();
		
		c1.name = "Ali";
		c2.name = "Veli";
		c1.printName();
		c2.printName();
		DataSource.release(c1);
		
		Connection c6 = DataSource.getConnection();

	}

}
