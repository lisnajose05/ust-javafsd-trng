package sql.ust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/ustDB","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employee");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getInt(2)+" ");
			System.out.println(rs.getString(3)+" ");
			
		}
		con.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}
	public static int calculate(int a,int b) {
		return a+b;
	}

}
