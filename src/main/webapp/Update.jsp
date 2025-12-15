<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.model.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("employee");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <link rel="stylesheet" href="style.css"> <!-- agar CSS hai -->
</head>
<body>
    <h2>Update Employee</h2>

    <form action="updateEmployee" method="post">
        <input type="hidden" name="id" value="<%= emp.getId() %>"/>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="<%= emp.getName() %>" required/><br/><br/>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%= emp.getEmail() %>" required/><br/><br/>

        <label for="department">Department:</label>
        <input type="text" id="department" name="department" value="<%= emp.getDepartment() %>" required/><br/><br/>

        <input type="submit" value="Update Employee"/>
        <a href="listEmployee">Cancel</a>
    </form>
</body>
</html>
