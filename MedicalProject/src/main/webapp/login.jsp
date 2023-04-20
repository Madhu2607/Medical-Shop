<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<%
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");
if(s1.equals("admin")&&s2.equals("admin123"))
{
	response.sendRedirect("admin.html");
}
else
{
	response.sendRedirect("Error.html");

}

%>
</body>
</html>