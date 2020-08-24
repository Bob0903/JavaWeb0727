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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebFilter("/servlet/result")
public class LoginFilter extends HttpFilter{

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        //res.getWriter().print("filter OK");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String remember = req.getParameter("remember");
        if(remember != null)
        {
            Cookie cookie = new Cookie("email",email);//建立Cookie物件
            cookie.setMaxAge(500);//存續時間
            res.addCookie(cookie);//加入到response物件
        }
        else
        {
            Cookie cookie2 = new Cookie("email","");//建立Cookie物件
            cookie2.setMaxAge(1);//存續時間
            res.addCookie(cookie2);//加入到response物件
        }
        if(email.contains("admin"))
        {
            chain.doFilter(req, res);
        }
        else
        {   //重導至
            req.setAttribute("email", email);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/form/loginform.jsp");
            rd.forward(req, res);
        }
        
        
        
//        res.getWriter().println(email);
//        res.getWriter().println(password);
//        res.getWriter().println(remember);
//        chain.doFilter(req, res);
    }
    
    
    
    
    
}
