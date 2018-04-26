<%-- 
    Document   : index
    Created on : 14-nov-2017, 13:04:51
    Author     : Emmanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
      
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
         <header>
            <div class="container">
                <section id="menu">
                    <ul>
                        <a href="index.jsp">INFLUENCER</a>
                        <a href="index.jsp">MARCA</a>
                        <a href="registro.jsp">REGISTRO</a>
                        <a href="mainpage.html">PÁGINA PRINCIPAL</a>
                        
                    </ul>
                </section> 
            </div> 
        </header>           
        <div class="login">
            <h1>LOGIN</h1>
            <div class="container">
                <form action="iniciar" method ="post">
                    <input type="text" name="usuario" required="" placeholder="USUARIO"/>
                    <input type="password" name="pass" required="" placeholder="CONTRASEÑA"/>
                    <input type="submit" value="Iniciar sesion"  class="btn btn-primary btn-block btn-large"/>
                </form>
            </div>
            <a href="registro.jsp"> <h1>¿NO TIENES CUENTA? REGISTRATE</h1></a>
        </div>
    </body>
</html>
