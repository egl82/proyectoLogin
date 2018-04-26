<%-- 
    Document   : registro
    Created on : 14-nov-2017, 13:11:23
    Author     : Emmanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
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
        <h1>REGISTRO</h1>
        <form action="nuevousuario" method ="post">  
            <input type="text" name="firstname" required="" placeholder="NOMBRE"/>          
            <input type="text" name="lastname" required="" placeholder="APELLIDO"/>           
            <input type="email" name="email" required="" placeholder="EMAIL"/>
            <input type="text" name="uname" required="" placeholder="NOMBRE DE USUARIO"/>            
            <input type="password" name="pass" required="" placeholder="CONTRASEÑA"/>
            <br>
            <label>¿Eres Influencer o Marca? </label>
            <select name="rango" size="1">
                <option value="">-</option>
                <option value="marca">Marca</option>
                <option value="influencer">Influencer</option>
            </select>
            <br>
            <br>
            <input type="submit" value="Registrarse" class="btn btn-primary btn-block btn-large"/>
        </form>
        </div>
    </body>
</html>
