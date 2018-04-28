<%-- 
    Document   : marcaPage
    Created on : 27-abr-2018, 0:52:11
    Author     : Emmanuel
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="model.Producto"%>
<%@page import="controller.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página principal - Marca</title>
    </head>
    <body>
        <h1>Hola <%=request.getAttribute("uname")%></h1>
        <p> Veamos tus campañas activas</p>
        <p> De momento me conformo con ver esto!!!!!</p>

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
        <h1>Consulta a base de datos</h1>
        <table border="1">
            <tr>
                <td>id</td>
                <td>nombre</td>
                <td>apellido</td>
                <td>telefono</td>
            </tr>
            <%
                LinkedList<Producto> lista = Consultas.getProducto();
                for (int i = 0; i < lista.size(); i++) {
                    out.println("<tr>");
                    
                    out.println("<td>" + lista.get(i).getNombre() + "</td>");
                    out.println("<td>" + lista.get(i).getCategoria() + "</td>");
                    out.println("<td>" + lista.get(i).getDescripcion() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table>




    </body>
</html>
