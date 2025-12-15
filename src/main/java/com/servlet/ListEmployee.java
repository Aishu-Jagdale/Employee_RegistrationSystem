package com.servlet;

import java.io.IOException;
import java.util.List;

import com.dao.EmployeeDAO;
import com.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/listEmployee")
public class ListEmployee extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Employee> list = dao.getAllEmployees();
        request.setAttribute("employeeList", list);
        request.getRequestDispatcher("list-employee.jsp").forward(request, response);
    }
}
