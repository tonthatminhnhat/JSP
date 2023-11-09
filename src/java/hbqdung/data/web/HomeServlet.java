/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package hbqdung.data.web;

import hbqdung.data.dao.Database;
import hbqdung.data.model.Category;
import hbqdung.data.model.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       List<Category> listCategory= Database.getCategoryDao().findAll();
       List<Product>   listProduct  = Database.getProductDao().findAll();
       request.setAttribute("listProduct", listProduct);
       request.setAttribute("listCategory", listCategory);
       request.setAttribute("title", "Home Page");
       request.getRequestDispatcher("./views/home.jsp").include(request, response);
        
    }
    }

   

