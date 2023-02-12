import java.sql.*;
class StudentDao
{
	Connection con = null;
	void connection(String url, String un, String pass) throws SQLException 
	{
			 con = DriverManager.getConnection(url,un,pass);
	}
	void fetchData(int r) throws SQLException 
	{
		String query = "select sname from student where rollno="+r;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String n = rs.getString(1);
		System.out.println("Name associated with rollno "+r+" is "+n);
	}
	void insertData(Student ob) throws SQLException 
	{
		String query = "insert into student value(?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, ob.r);
		pst.setString(2, ob.n);
		int rs = pst.executeUpdate();
	}
}
class Student
{
	int r;
	String n;
	Student (int r, String n)
	{
		this.r = r;
		this.n = n;					
	}
}
public class DAO {
	public static void main(String[] args) throws Exception {
		StudentDao dao = new StudentDao();
		String url="jdbc:mysql://localhost:3306/sukritidb";
		String uname="root";
		String pass="Telusko@123";
		int roll = 5;
		dao.connection(url, uname, pass);
		dao.fetchData(roll);
		
		Student stu = new Student(11,"Jack");
		dao.insertData(stu);
	}

}
