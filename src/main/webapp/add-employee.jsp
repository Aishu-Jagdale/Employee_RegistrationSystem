=<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add employee</title>
</head>
<body>
   <h2>Add new employee</h2>
   <form action="AddEmployee" method="post">
   
   <label>Name:</label>
   <input type="text" name="name" required="required"><br><br>
   
   <label>Email:</label>
   <input type="text" name="email" required="required"> <br><br>
   
     <label>Position:</label>
   <input type="text" name="position" required="required"> <br><br>
   
   <input type="submit" value="Add Employee">
   
   </form>
   <br>
   <a href="index.jsp">Backtohome</a>
   
</body>
</html>