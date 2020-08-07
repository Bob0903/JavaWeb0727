<%-- 
    Document   : exchangeform
    Created on : 2020/8/3, 下午 08:42:53
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.3/build/pure-min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exchange Form</title>
    </head>
    <body style="padding:15px">
        <h1>Exchange Form</h1>
        <form class="pure-form" method="post" action="/JavaWeb0727/servlet/exchange">
            <fieldset>
                <legend>Exchange Form</legend>
                <input type="number" name="money" placeholder="請輸入金額(台幣)" />
                <p />
                <label for="default-remember">
                    <input type="checkbox" id="default-remember" name="currency" value="USD" />USD
                </label>
                <label for="default-remember1">
                    <input type="checkbox" id="default-remember1" name="currency" value="JPY" />JPY
                </label>
                <label for="default-remember2">
                    <input type="checkbox" id="default-remember2" name="currency" value="EUR" />EUR
                </label>
                <label for="default-remember3">
                    <input type="checkbox" id="default-remember3" name="currency" value="CNY" />CNY
                </label>
                <p />
                <button type="submit" class="pure-button pure-button-primary">Submit</button>
            </fieldset>
        </form>
    </body>
</html>
