<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">
<%
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","madhuri@2001");
	PreparedStatement stat=con.prepareStatement("insert into contact values(?,?,?,?)");
	stat.setString(1,request.getParameter("t1"));
	stat.setString(2,request.getParameter("t2"));
	stat.setString(3,request.getParameter("t3"));
	stat.setString(4,request.getParameter("t4"));
  stat.executeUpdate();
   out.println("<h1><center> <u> Data Insert Successfully</u></center></h1>");
	con.close();
		
}
catch(Exception e)
{
	out.println(e);
}
%>
<center><img src="thumb.png" width="304" height="220"/></center>
</body>
</html>
</body>
</html>