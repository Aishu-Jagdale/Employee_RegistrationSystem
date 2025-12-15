package com.servlet;

import java.io.IOException;

import com.dao.EmployeeDAO;
import com.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/addEmployee")
public class AddEmployee extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dept = request.getParameter("department");

        Employee emp = new Employee(name, email, dept);
        dao.addEmployee(emp);

        response.sendRedirect("listEmployee"); // redirect to list after add
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("add-employee.jsp").forward(request, response);
    }
}
