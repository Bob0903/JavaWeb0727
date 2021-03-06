<%-- 
    Document   : loginform
    Created on : 2020/8/17, 下午 06:59:31
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    String email = "";
    Cookie [] cookies = request.getCookies();
    if(cookies != null)
    {
        for(Cookie c: cookies)
        {
            if(c.getName().equals("email"))
            {
                email = c.getValue();
                break;
            }
        }
    }
    else
    {
        email = request.getAttribute("email")== null ? "" : request.getAttribute("email") + "";
    }


%>
<html>
    <head>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body style="padding:20px">
        <form class="pure-form" method="post" action="/JavaWeb0727/servlet/result">
            <fieldset>
                <legend>Login Form</legend>
                <input type="email" name="email" placeholder="Email" value="<%= email%>" /><p/>
                <input type="password" name="password" placeholder="Password" /><p/>
                <label for="default-remember"><p/>
                    <input type="checkbox" name="remember" id="default-remember" />&nbsp;Remember me</label><p/>
                <button type="submit" class="pure-button pure-button-primary">Sign in</button>
            </fieldset>
        </form>
    </body>
</html>
