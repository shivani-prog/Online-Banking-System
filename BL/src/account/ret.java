package account;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ret
 */
@WebServlet("/ret")
public class ret extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ret() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				stmt=conn.prepareStatement("select * from account where id=?");
				int id1 =Integer.parseInt(request.getParameter("id"));
				stmt.setInt(1, id1);
				ResultSet rs=stmt.executeQuery();
				java.sql.ResultSetMetaData rsmd=rs.getMetaData();
				out.print("<table width=25% border=1>");
				out.print("<tr>");
				out.print("<td>"+rsmd.getColumnName(1)+"</td>");
				out.print("<td>"+rsmd.getColumnName(2)+"</td>");
				out.print("<td>"+rsmd.getColumnName(3)+"</td>");
				out.print("<td>"+rsmd.getColumnName(4)+"</td>");
				out.print("<td>"+rsmd.getColumnName(5)+"</td></tr>");
				while(rs.next())
				{
				out.print("<tr><td>"+rs.getInt(1)+"</td>");
				out.print("<td>"+rs.getString(2)+"</td>");
				out.print("<td>"+rs.getString(3)+"</td>");
				out.print("<td>"+rs.getString(4)+"</td>");
				out.print("<td>"+rs.getString(5)+"</td></tr>");
				}
				out.print("</table>");
				
				
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}



