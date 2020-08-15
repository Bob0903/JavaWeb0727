/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebFilter("/secure/mycar/*")

public class MyCarFilter extends HttpFilter{

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String age = req.getParameter("age");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/form/mycarform.jsp");
        try {
            if(age == null || Integer.parseInt(age) < 18) {
//                res.sendRedirect("/JavaWeb0727/form/mycarform.jsp");
                rd.forward(req, res);
            } else {
                chain.doFilter(req, res);
            }
        } catch (Exception e) {
//            res.sendRedirect("/JavaWeb0727/form/mycarform.jsp");
            rd.forward(req, res);
        }
    }
    
    
    
    
}
