<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.model.Employee"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IList</title>
<style>
        body {
            font-family: Arial;
            background-color: #f5f5f5;
            margin: 40px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        a {
            text-decoration: none;
            color: #007bff;
        }
        a:hover {
            color: #0056b3;
        }
        .add-btn {
            display: block;
            width: 150px;
            margin: 20px auto;
            background-color: #28a745;
            color: white;
            text-align: center;
            padding: 10px;
            border-radius: 5px;
        }
        .add-btn:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <h2 style="text-align:center;">Employee List</h2>

<%
    List<Employee> list = (List<Employee>) request.getAttribute("listEmployee");
    if (list != null && !list.isEmpty()) {
%>

    <table border="1" align="center" cellpadding="8">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Position</th>
            <th>Action</th>
        </tr>
        <% for (Employee e : list) { %>
        <tr>
            <td><%= e.getId() %></td>
            <td><%= e.getName() %></td>
            <td><%= e.getEmail() %></td>
            <td><%= e.getDepartment() %></td>
            <td>
                <a href="UpdateEmployee?id=<%= e.getId() %>">Edit</a> |
                <a href="DeleteEmployee?id=<%= e.getId() %>"
                   onclick="return confirm('Are you sure you want to delete this employee?')">Delete</a>
            </td>
        </tr>
        <% } %>
    </table>

<%
    } else {
%>
    <h3 style="text-align:center; color:red;">No employee found!</h3>
<%
    }
%>

</body>
</html>