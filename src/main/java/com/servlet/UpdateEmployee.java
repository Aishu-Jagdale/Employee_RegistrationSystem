package com.servlet;

import java.io.IOException;

import com.dao.EmployeeDAO;
import com.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/updateEmployee")
public class UpdateEmployee extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dept = request.getParameter("department");

        Employee emp = new Employee(name, email, dept);
        emp.setId(id);
        dao.updateEmployee(emp);

        response.sendRedirect("listEmployee");
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee emp = dao.getEmployeeById(id);
        request.setAttribute("employee", emp);
        request.getRequestDispatcher("update-employee.jsp").forward(request, response);
    }
}
