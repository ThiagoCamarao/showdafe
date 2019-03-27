<%-- 
    Document   : mostra
    Created on : 13/03/2019, 20:16:36
    Author     : tuxcuiabano
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
<style>
body {
  background-color: gray;
}

h1 {
  color: whitesmoke;
  margin-left: 40px;
} 

#centro {
    width:100px;
    height:100px;
    margin-left: 20px;
    align:left;
}

</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Obras</h1>
        <%
          String driver = "org.apache.derby.jdbc.ClientDriver";
          String url = "jdbc:derby://localhost:1527/arte";
          String username = "teste";
          String password = "teste";
          try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM formulario";
            ResultSet resultados = statement.executeQuery(sql);

            while(resultados.next()){
 
             
             out.println("<b><p>Titulo:</p>" + resultados.getString("titulo")+ " </br> - ");
             out.println("<b><p>Data:</p>" + resultados.getString("data")+ " </br> - ");
             out.println("<b><p>Tecnica:</p>" + resultados.getString("tecnica")+ " </br> - ");
             out.println("<b><p>Dimensoes:</p>" + resultados.getString("dimensoes")+ " </br> - ");
             out.println("<b><p>Autor:</p>" + resultados.getString("autor")+ " </br> - ");
             out.println("<b><p>Procedencia:</p>" + resultados.getString("procedencia")+ " </br> - ");
             out.println("<b><p>Tipo:</p>" + resultados.getString("tipo")+ " </br> - ");
             out.println("<b><p>Imagem:</p>" + resultados.getString("imagem")+ " </br> - ");
             
             out.println( resultados.getString("data")+ "<br>");
             out.println( "---------------------------------------------------------<br><br>");

           }
            
         connection.close();
          } catch(ClassNotFoundException cnfe) {
              out.println("Erro loading driver" + cnfe);
          } catch(SQLException sqle) {
              out.println("Erro loading driver" + sqle);
          }
        
        %>
        
    </body>
</html>
