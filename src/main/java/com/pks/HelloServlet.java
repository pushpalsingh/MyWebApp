package com.pks;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        req.setAttribute("name", req.getParameter("name")); // Get request parameter
        req.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(req, resp);
    }
}
