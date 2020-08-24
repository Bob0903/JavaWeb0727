/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.controller;

import com.bigdata.Sales;
import com.bigdata.model.SalesModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */

@WebServlet("/servlet/bigdata")
public class BigDataServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String country = req.getParameter("country");
        // 設定 request attribute
        if(country == null || country.length() == 0)
            req.setAttribute("saleses", SalesModel.getSaleses());
        else
            req.setAttribute("saleses", SalesModel.getSaleses(country));
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/form/bigdataform.jsp");
        rd.forward(req, resp);
    }
   
    
    
    
}
