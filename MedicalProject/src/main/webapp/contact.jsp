<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html>
<body>
<style>

 body {
  background-image:url("home1.jpg");
  background-color: lighten($grey, 10%);
  font-size: 100%;
 
}
form
{
 margin-left:150px;
 margin-top:50px;
}

</style>
<form method="post" action="contactdata.jsp">
  <div class="container">
  <div class="row header">
    <h1>CONTACT US &nbsp;</h1>
    <h3>Fill out the form below to learn more!</h3>
  </div>
  <div class="row body">
    
      <ul>
        
        <li>
          <p class="left">
            <label for="first_name">first name</label>
            <input type="text" name="first_name" placeholder=" First_Name" />
          </p></li>
          <li>
          <p class="pull-right">
            <label for="last_name">last name</label>
            <input type="text" name="last_name" placeholder="last_Name" />      
          </p>
        </li>
        
        <li>
          <p>
            <label for="email">email <span class="req">*</span></label>
            <input type="email" name="email" placeholder="abc@gmail.com" />
          </p>
        </li>        
       
        <li>
          <label for="comments">comments</label>
          <textarea cols="46" rows="3" name="comments"></textarea>
        </li>
        
       <br> 
          <input type="submit" value="submit"/>
          
        
      </ul>
    </form>  
  </div>
</div>