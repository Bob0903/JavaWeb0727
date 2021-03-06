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
//電腦選號 Servlet


@WebServlet(name = "lotto",
        urlPatterns = {"/servlet/lotto"},
        initParams = {@WebInitParam(name = "n",value = "6"),
                      @WebInitParam(name = "range",value = "49")})
//@WebServlet("/servlet/lotto")
public class LottoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //UTF-8編碼
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //1~49取n組，不可重複
        //取得 n 參數
        String n = req.getParameter("n");
        int range = Integer.parseInt(getInitParameter("range"));
        if(n == null)
        {
            n = getInitParameter("n");
        }
        Set<Integer> set = new LinkedHashSet<>();
        Random r = new Random();
        while(set.size() < Integer.parseInt(n))
        {
            set.add(r.nextInt(range) + 1);
        }
        //顯示在網頁上
        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<header>");
        out.print("<title>本期樂透電腦選號</title>");
        out.print("</header>");
        out.print("<body>");
        out.print("<h1>");
        out.print("本期樂透開獎號碼：");
        out.print(set.toString());
        out.print("</h1>");
        out.print("</body>");
        out.print("</html>");
        
    }
    
}
