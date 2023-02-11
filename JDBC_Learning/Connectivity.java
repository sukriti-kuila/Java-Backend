import java.sql.*;
public class Demo {
	
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/sukritidb";
		String uname="root";
		String pass="Lol!";
		String query = "select sname from student where rollno=2"; // database has 2 columns "sname" and "rollno"
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
//		fetching a single data
//		rs.next();
//		String name = rs.getString("sname");
//		System.out.println(name);
		
//		fetching whole table
		while(rs.next())
		{
			System.out.println("Name "+rs.getString(2)+" & Roll "+rs.getInt(1));
		}
		
		st.close();
		con.close();
	}

}
