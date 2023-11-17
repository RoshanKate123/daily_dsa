import java.sql.*;
class FirstJDBC{
	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/roshandb";
			String userName = "root";
			String password = "Rowdy@911";
			Connection con = DriverManager.getConnection(url,userName,password);
			
			if(con.isClosed()){
				System.out.println("Connection is still closed");
			}
			else{
				System.out.println("Connection is created");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}