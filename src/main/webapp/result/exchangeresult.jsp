<%-- 
    Document   : exchangeresult
    Created on : 2020/8/3, 下午 08:43:39
    Author     : User
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exchange Result</title>
    </head>
    <body style="padding: 15px">
        <h1>Exchange Result</h1>
           <form class="pure-form" method="get" action="/JavaWeb0727/form/exchangeform.jsp">
            <fieldset>
                <legend>Exchange Result</legend>
                台幣:<%=request.getAttribute("money")%>
                <p />
                換匯結果:<%=request.getAttribute("list")%>
                <p />
                <table class="pure-table pure-table-bordered">
                    <thead>
                        <tr>
                            <th>幣別</th>
                            <th>換匯結果</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<Map<String, Double>> list = (List)request.getAttribute("list");
                            for(Map<String, Double> map : list) {
                                String key = map.keySet().iterator().next();
                                Double value = map.get(key);
                        %>
                            <tr>
                                <td><%=key %></td>
                                <td align="right"><%=String.format("$ %,.2f", value) %></td>
                            </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
                <p />
                <button type="submit" class="pure-button pure-button-primary">Back</button>
            </fieldset>
        </form>
        
    </body>
</html>
