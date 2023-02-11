import java.sql.*;
public class Demo {
	
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/sukritidb";
		String uname="root";
		String pass="Lol!";
		String query = "select sname from student where rollno=2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		// fetching data
		rs.next();
		String name = rs.getString("sname");
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
