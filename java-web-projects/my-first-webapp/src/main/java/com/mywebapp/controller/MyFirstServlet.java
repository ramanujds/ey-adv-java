package com.mywebapp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
        RequestDispatcher rd = req.getRequestDispatcher("show.jsp");
        req.setAttribute("username", name);
        rd.forward(req, res);


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
