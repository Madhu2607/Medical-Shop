<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<html>
<body>
<style>
.content-table
{
border-collapse:collapse;
margin:25px 0;
font-size:0.9cn;
min-width:400px;
border-spacing:0;
text-align:center;
font-radius:5px 5px 0 0;
overflow:hidden;
box-shadow:0 0 20px rgba(0,0,0,0.15);


}
.content-table thead tr
{
  background-color:#009879;
  color:#fffffff;
  text-align:left;
  font-weight:bold;
  font-size:18px;
}
 th
 {
   padding:10px 20px;
   
}
.ttbody tr
{
 border-bottom:1px solid #dddddd;
 
 
} 
.ttbody tr:first-of-type
{
background-color:#;
}
.ttbody tr:last-of-type
{
 border-bottom:1px solid black;
}
.ttbody tr.active-row
{
font-weight:bold;
color:#009879;
}

</style>
<%
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","madhuri@2001");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from billform7");
	out.println("<center><h2> Medical Invoice</h2></center>");
    out.println("<hr>");
    out.println("<center><table class='content-table' >");
    out.println("<thead><tr><th>Quantity</th> <th>Item Name</th><th>MFG</th><th>Batch No.</th><th>M.R.P.</th><th>Exp.Date</th><th>Rate</th><th>Amount Rs.</th></tr></thead>");
    while(rs.next())
    {
	%>
	<tbody class="ttbody">
    <tr class='active-row'>
	<th scope="row"> <%=rs.getString(1)%></th>
		<th scope="row"> <%=rs.getString(2)%></th>
		<th scope="row"> <%=rs.getString(3)%></th>
		<th scope="row"> <%=rs.getString(4)%></th>
		<th scope="row"> <%=rs.getDouble(5)%></th>
		<th scope="row"> <%=rs.getString(6)%></th>
		<th scope="row"> <%=rs.getFloat(7)%></th>
		<th scope="row"> <%=rs.getFloat(8)%></th>
	</tr>
	</tbody>
	
	<%
    }		
	rs.close();
	con.close();
	out.println("</center></table>");
		
}
catch(Exception e)
{
	out.println(e);
}
%>
<button><a href="service.html">Edit</a></button>
</body>
</html>