package account;

		import java.io.IOException;
		import java.sql.*;
		import javax.servlet.ServletException;
		import javax.servlet.annotation.WebServlet;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
		/**
		* Servlet implementation class deposit
		*/
		@WebServlet("/deposite")
		public class deposite extends HttpServlet {
		private static final long serialVersionUID = 1L;

		 /**
		 * @see HttpServlet#HttpServlet()
		 */
		 public deposite() {
		 super();
		 // TODO Auto-generated constructor stub
		 }
		/**
		* @see HttpServlet#doGet(HttpServletRequest request,
		HttpServletResponse response)
		*/
		protected void doGet(HttpServletRequest request, HttpServletResponse
		response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());
		}
		/**
		* @see HttpServlet#doPost(HttpServletRequest request,
		HttpServletResponse response)
		*/
		protected void doPost(HttpServletRequest request, HttpServletResponse
		response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int flag=0;
		double bal=0;
		try
		{
			// JDBC driver name and database URL
    	    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    	    final String DB_URL = "jdbc:mysql://localhost/banking";

    	   //  Database credentials
    	   final String USER = "root";
    	   final String PASS = "shivani@001";
    	   System.out.println("hi");
           Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);;
          // PreparedStatement stmt = null;
           Statement st = conn.createStatement();
           //STEP 2: Register JDBC driver
		  Class.forName(JDBC_DRIVER);
		
		  //STEP 3: Open a connection
		  System.out.println("Connecting to a selected database...");
		  
		  System.out.println("Connected database successfully...");
		int id1 = Integer.parseInt(request.getParameter("id"));
		String uname = request.getParameter("username");
		double amt =Double.parseDouble(request.getParameter("balance"));
		String qry = "select * from account where id='"+id1+"'";
		ResultSet rs = st.executeQuery(qry);
		while(rs.next())
		{
		if(id1==rs.getInt("id"))
		{
		flag=1;
		bal=rs.getDouble("balance");
		}
		}
		if(flag==1)
		{
		String qry1="update account set balance=balance+'"+amt+"' where id='"+id1+"'";
		st.executeUpdate(qry1);
		System.out.println("Deposit Successfully :-) ");
		}
		else
		{
		System.out.println("Account not found :-( ");
		}
		
	
		}
		catch(Exception e)
		{
		System.out.println("Error: "+e);
		}
		}
		
	}

