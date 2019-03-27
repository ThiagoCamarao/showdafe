<%-- 
    Document   : mostra_usuario
    Created on : 16/03/2019, 21:54:37
    Author     : tuxcuiabano
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Obra"%>
<%@page import="modelo.ObraDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Obras</title>
    </head>
    <body>
    <body>
        <h1>Lista de usuários </h1>
        <%   
          List<Obra> lista = (List)request.getAttribute("listaObras"); 
          for (Obra obra : lista) {
          out.println("<b>Titulo: </b>" + obra.getTitulo()+"<br> ");  
          out.println("<b>Data: </b>" + obra.getData()+"<br> ");
          out.println("<b>Tecnica: </b>" + obra.getTecnica()+"<br> ");
          out.println("<b>Dimensoes: </b>" + obra.getDimensoes()+"<br> ");
          out.println("<b>Autor: </b>" + obra.getAutor()+"<br> ");
          out.println("<b>Procedencia: </b>" + obra.getProcedencia()+"<br> ");
          out.println("<b>Tipo: </b>" + obra.getTipo()+"<br> ");
          out.println("<b>Imagem: </b>" + obra.getImagem()+"<br> ");
          out.println("______________________________________________________<br>");
         }
         %>     
        
    </body>
</html>
