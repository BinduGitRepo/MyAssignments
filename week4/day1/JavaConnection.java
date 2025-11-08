package week4.day1;

public class JavaConnection implements DataBaseConnection{
	
	@Override
	public void connectDB() {
		System.out.println("connect to database");
	}

	@Override
	public void disconnectDB() {
		System.out.println("disconnect to database connection");
	}

	@Override
	public void ExecuteUpdate() {
		System.out.println("execute the query");
	}
	
public static void main(String[] args) {
		
		JavaConnection javaConnection = new JavaConnection();
		javaConnection.connectDB();
		javaConnection.disconnectDB();
		javaConnection.ExecuteUpdate();
		

	}


}
