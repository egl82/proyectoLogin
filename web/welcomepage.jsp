<%-- 
    Document   : welcomepage
    Created on : 14-nov-2017, 13:45:58
    Author     : Emmanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome page</title>
    </head>
    <body>
        <h1>Welcome!!!!!!!!!!!!!!!!!!</h1>
        <br>
        <h2>Agrega una campaña</h2>

        <form action="agregarProducto" method ="post">
            <fieldset>  
                <label>Nombre de la Campaña</label> 
                <input type="text" name="producto" required="" placeholder="AÑADE EL NOMBRE DE TU CAMPAÑA"/>  

                <label> Categoria</label> 
                <select name="categoria" size="1" required="">
                    <option value="deporte">DEPORTE</option>
                    <option value="ocio">OCIO</option>
                    <option value="naturaleza">NATURALEZA</option>
                    <option value="otras">OTRAS</option>
                </select>
                <label> Descripción</label> 
                <input type="text" name="descripcion" placeholder="AÑADE UNA BREVE DESCRIPCÓN..."/>
                <input type="submit" value="Agregar campaña"/>
            </fieldset>
        </form>



    </body>
</html>
