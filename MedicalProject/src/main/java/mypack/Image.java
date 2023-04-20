package mypack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Image {

	public static void main(String[] args) {
   try
   {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","madhuri@2001");
	   String q="insert into image() values(?)";
	   PreparedStatement stat=con.prepareStatement(q);
	   FileInputStream fis=new FileInputStream("home2.jpg");
	   stat.setBinaryStream(1,fis,fis.available());
	   stat.executeUpdate();
	   
   
   con.close();
   
   }
   catch(Exception e)
   {
	   System.out.println(e);
   }
	}
}
