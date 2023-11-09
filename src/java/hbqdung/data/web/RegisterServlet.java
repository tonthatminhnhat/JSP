/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package hbqdung.data.web;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
      @Override
           protected void doGet(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException{
                request.setAttribute("title", "Register Page");
                 request.getRequestDispatcher("./views/register.jsp").include(request,response);
           }
} 
