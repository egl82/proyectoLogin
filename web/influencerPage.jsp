<%-- 
    Document   : influencerPage
    Created on : 27-abr-2018, 0:57:28
    Author     : Emmanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Influencer </title>
    </head>
    <body>
        <h1>Hello Welcome <%=request.getAttribute("usuario") %></h1>
       Welcome <%=request.getAttribute("userName") %>
        <%=request.getAttribute("uname") %>
    </body>
</html>
