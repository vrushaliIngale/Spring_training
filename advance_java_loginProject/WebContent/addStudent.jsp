<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Student data</h2>
<form action="addStudent" method=post></form>
<input type = "text" name= "requestAction" value="add">
<table>
       <tr>
           <td>STudent Id:</td>
           <td><input type ="text" name="id"></td>
       </tr>
       <tr>
           <td>STudent Name:</td>
           <td><input type ="text" name="name"></td>
       </tr>
       <tr>
           <td>Course:</td>
           <td><input type ="text" name="course"></td>
       </tr>
       <tr>
      <td> &nbsp;</td>
      <td><input type = "submit" name = "Add Student" /></td>
      </tr>
</table>
</body>
</html>