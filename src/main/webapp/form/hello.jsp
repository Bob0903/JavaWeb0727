<%-- 
    Document   : hello
    Created on : 2020/8/21, 下午 07:06:17
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    double getBMI(double h,double w)
    {
        double bmi = w/Math.pow(h/100, 2);
        return bmi;
    }

%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
               double h = 170.0;
               double w = 60.0;
               double bmi = getBMI(h, w);
               out.print(bmi);
            %>
            
            
            
        </h1>
    </body>
</html>
