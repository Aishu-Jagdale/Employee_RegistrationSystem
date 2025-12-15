package com.servlet;

import java.io.IOException;

import com.dao.EmployeeDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/deleteEmployee")
public class deleteEmployee extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        dao.deleteEmployee(id);

        response.sendRedirect("listEmployee");
    }
}
