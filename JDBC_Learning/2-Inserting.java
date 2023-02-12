import java.sql.*;
import java.util.*;
public class Demo {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Enter Name & Roll");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int r = sc.nextInt();
		
//  inserting data into mysql table
		String insert_query = "insert into student values("+r+",'"+name+"')"; //if we had 10 datafield then each time we have to manually write double quotes efficiently
		System.out.println(insert_query);
		String url="jdbc:mysql://localhost:3306/sukritidb";
		String uname="root";
		String pass="Lol!";
		Class.forName("com.mysql.cj.jdbc.Driver"); // don't need to write this anymore
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(insert_query);// st.executeUpdate(query) DML mode od SQL
		
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------
    //BETTER WAY TO DO IT -- using PreparedStatement Interface instead of Statement
    //inserting data into mysql table
		String insert_query = "insert into student values(?,?)";//changed
		String url="jdbc:mysql://localhost:3306/sukritidb";
		String uname="root";
		String pass="Telusko@123";
		Class.forName("com.mysql.cj.jdbc.Driver");// don't need to write this anymore
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = con.prepareStatement(insert_query);//changed
		st.setInt(1,r);//added
		st.setString(2, name);//added
		int count = st.executeUpdate();// st.executeUpdate(don't pass query) 
		
		System.out.println(count+" rows affected");
		
		st.close();
		con.close();
	}

}
