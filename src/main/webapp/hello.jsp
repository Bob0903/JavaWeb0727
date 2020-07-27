<%-- 
    Document   : hello.jsp
    Created on : 2020/7/27, 下午 09:02:45
    Author     : User
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><% Date today = new Date();
        out.print(today);
        %>
    </body>
</html>
