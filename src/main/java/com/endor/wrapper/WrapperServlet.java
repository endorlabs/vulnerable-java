package com.endor.wrapper;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WrapperServlet extends GenericServlet
{
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        String name = request.getParameter("username");

        PrintWriter out = response.getWriter();
        out.println(name);
    }
}
