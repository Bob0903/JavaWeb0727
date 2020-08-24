/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.github.javafaker.Faker;
/**
 *
 * @author User
 */


@WebServlet("/servlet/session/getauth")
public class GetAuthSessionServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 建立 Session 物件
        HttpSession session = req.getSession(true);
//        session.setMaxInactiveInterval(5);
        resp.getWriter().print(session.getId());
        
        Faker faker = new Faker();
        String username = faker.name().firstName();
        session.setAttribute("username", username);
        
        resp.getWriter().print("Hello " + session.getAttribute("username"));
        
    }
    
    
    
    
    
    
}
