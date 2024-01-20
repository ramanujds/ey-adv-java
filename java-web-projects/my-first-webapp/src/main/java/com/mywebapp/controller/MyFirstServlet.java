package com.mywebapp.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myfirstservlet")
public class MyFirstServlet extends HttpServlet {

//    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//
//        String name = req.getParameter("name");
//        PrintWriter out = res.getWriter();
//        res.setContentType("text/html");
//        out.println("<!DOCTYPE html>");
//        out.println("<html><body>");
//        out.println("<h1>Hello "+name+", I am your Servlet</h1>");
//        out.println("</body></html>");
//
//    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String name = req.getParameter("name");

        // Forwarding request to another servlet
//        RequestDispatcher rd = req.getRequestDispatcher("show.jsp");
//        req.setAttribute("username", name);
//        rd.forward(req, res);

        // Redirecting request to another servlet or jsp

//        res.sendRedirect("show.jsp?username="+name);

        // Redirecting request to another servlet or jsp using cookies

//        Cookie cookie = new Cookie("username", name);
//        res.addCookie(cookie);
//        res.sendRedirect("show.jsp");

        // Redirecting request to another servlet or jsp using session

//        HttpSession session = req.getSession();
//        session.setAttribute("username", name);
//        res.sendRedirect("show.jsp");

        // ServletContext

        ServletContext context = req.getServletContext();
        context.setAttribute("username", name);
        res.sendRedirect("show.jsp");



    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html><body>");
        out.println("<h1 style='color:red'>Sorry requested method is not supported</h1>");
        out.println("</body></html>");

    }

}
