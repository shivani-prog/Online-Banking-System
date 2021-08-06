package account;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class delete extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
	try {
		final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost/banking";
		final String USER="root";
		final String PASS="shivani@001";
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("hi");
		Connection conn=null;
		PreparedStatement stmt=null;	
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.prepareStatement("DELETE from account where id=?");
			int id1 =Integer.parseInt(request.getParameter("id"));
			stmt.setInt(1, id1);
			stmt.executeUpdate();
			stmt = conn.prepareStatement("select * from account ");
			out.print("<table width=25% border=1>");
			out.print("<center><h1>Result:</h1></center>");
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			out.print("<tr>");
			out.print("<td>"+rsmd.getColumnName(1)+"</td>");
			out.print("<td>"+rsmd.getColumnName(2)+"</td> </tr>");
			while(rs.next())
			{
			out.print("<tr><td>"+rs.getInt(1)+"</td>");
			out.print("<td>"+rs.getString(2)+"</td> </tr>");
			}
			out.print("</table>");
			System.out.println("retrive records into the table...");
			}
			catch(Exception e)
			{
			System.out.println("wrong");
			e.printStackTrace();
			}
			}
			protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
			doGet(request, response);
			}
			}
