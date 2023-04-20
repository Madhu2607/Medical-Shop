<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<html>
<body>

<style>
body
{
 background-color:lightpink;
}
h1
{
 margin-top:10%;
 color:blue;
}

</style>
<%
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","madhuri@2001");
	PreparedStatement stat=con.prepareStatement("update billform7 set qty=?,mfg=?, bno=?, mrp=?, expdate=?, rate=?, amtrs=? where parti=?");
	stat.setString(1,request.getParameter("t1"));
	stat.setString(2,request.getParameter("t3"));
	stat.setString(3,request.getParameter("t4"));
	stat.setDouble(4,Double.parseDouble(request.getParameter("t5")));
	stat.setString(5,request.getParameter("t6"));
	stat.setFloat(6,Float.parseFloat(request.getParameter("t7")));
	stat.setFloat(7,Float.parseFloat(request.getParameter("t8")));
	stat.setString(8,request.getParameter("t2"));
  stat.executeUpdate();
   out.println("<h1><center> <u>Data Updated Successfully</u></center></h1>");
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