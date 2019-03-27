<%-- 
    Document   : result
    Created on : 16/03/2019, 21:33:05
    Author     : tuxcuiabano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Sucesso</title>
    </head>
    <body>
        <h1>Obra
        <%
              out.print(request.getAttribute("nomeobra"));  
         %>
        
        cadastrado com sucesso!
        
        </h1>
    </body>
</html>
