/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "area",
        urlPatterns = {"/servlet/area"})
public class AreaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String type = req.getParameter("type");
        PrintWriter out = resp.getWriter();
        if(type.equals("c"))
        {
            int pi = 0;
            int r = Integer.parseInt(req.getParameter("r"));
            pi = (int) (r * r *3.14);
            out.print(pi);
        }
        if(type.equals("r"))
        {
            int rect = 0;
            int w = Integer.parseInt(req.getParameter("w"));
            int h = Integer.parseInt(req.getParameter("h"));
            rect = (int) w * h;
            out.print(rect);
        }
        if(type.equals("t"))
        {
            int tangle = 0;
            int b = Integer.parseInt(req.getParameter("b"));
            int height = Integer.parseInt(req.getParameter("height"));
            tangle = (int)(( b * height) / 2);
            out.print(tangle);
        }
    }
    
    
}
