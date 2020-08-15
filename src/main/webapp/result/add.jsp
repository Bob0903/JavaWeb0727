<%-- 
    Document   : add
    Created on : 2020/8/10, 下午 07:10:55
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            
            <%
              int x = Integer.parseInt(request.getAttribute("x")+"");
              int y = Integer.parseInt(request.getAttribute("y")+"");
              int sum  = x + y;
              out.println(x + y);
              request.setAttribute("sum", sum);
              
            %>
        </h1>
    </body>
</html>
