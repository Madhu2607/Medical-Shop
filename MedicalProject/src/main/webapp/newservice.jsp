<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","madhuri@2001");
	PreparedStatement stat=con.prepareStatement("select * from billform where quant=?");
	stat.setInt(1,Integer.parseInt(request.getParameter("t1")));
	ResultSet rs=stat.executeQuery();
	if(rs.next())
		out.println("<h1> User id already exist try another id</h1>");
		else
		{
			stat=con.prepareStatement("insert into useraccount1 values(?,?,?,?,?,?)");
			stat.setInt(1,Integer.parseInt(request.getParameter("t1")));
			stat.setString(3, request.getParameter("t2"));
			stat.setString(4, request.getParameter("t3"));
			stat.setString(5, request.getParameter("t4"));
			stat.setInt(6,Integer.parseInt(request.getParameter("t5")));
			stat.setInt(6,Integer.parseInt(request.getParameter("t6")));
			stat.setInt(6,Integer.parseInt(request.getParameter("t7")));

			stat.executeUpdate();
			out.println("<h2> Account opened successfully </h3>");
		}
	rs.close();
	con.close();

}
catch(Exception e)
{
	out.println(e);
}
%>

%>
</body>
</html>