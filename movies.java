import java.sql.*;
class movie
{
public static void main(String args[])
{
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movies?","root","anusha3467");
Statement s = con.createStatement();
String sq = "select * from movie";
ResultSet rs = s.executeQuery(sq);
while(rs.next())
{
System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
}
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}
