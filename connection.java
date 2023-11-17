import java.sql.*;
public class connection{
	public static void main(String args[])
	{
		Connection conn = null;
		try{
		String UserName = "root";
		String Password = "root";
		String url = "jdbc:mysql://localhost:3306/school";
		Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection(url,UserName,Password);
		System.out.println("eastablished");
		}
		catch(Exception e){
			System.out.println("cannot connect to the server");
		}finally{
		if(conn != null)
		{
			try{
				conn.close();
				System.out.println("Database coonection terminated");
			}
			catch(Exception e){/*ignore close erro*/}
			}
		}
				
}
	}
