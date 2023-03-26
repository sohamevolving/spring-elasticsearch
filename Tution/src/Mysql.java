import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Mysql {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/java";         //db is the name of the database
		String user ="root";                                                  
		String password = "Sohamroy@900";

		try {

			//1. Create a connection
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute Query
			for(int i=0;i<11;i++)
			{
				String sql = "insert into javainsertion "
						+"(Id, Name, Age)"
						+ " values (5,'name',10)";
				myStmt.executeUpdate(sql);
				System.out.println("Insert complete.");

			}
			

            //4. Close connection
			myConn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
}





