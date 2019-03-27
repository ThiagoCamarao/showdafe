package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author tuxcuiabano
 */
public class ObraDAO {
    
    
     // a conexão com o banco de dados
  private Connection connection;
  
           public ObraDAO() throws ClassNotFoundException {
             this.connection = new ConnectionFactory().getConnection();
         }
    
     
   //método para adicionar usuário        

    /**
     *
     * @param obra
     */
    public void adiciona(Obra obra) {

     String sql = "INSERT INTO formulario VALUES (titulo,data,tecnica,dimensoes,autor,procedencia,tipo,procedencia,imagem)"+
             " values (?,?,?,?,?,?,?,?)";

     try {
          
         // prepared statement para inserção
         PreparedStatement stmt = connection.prepareStatement(sql);

         // seta os valores
         stmt.setString(1,obra.getTitulo());
         stmt.setString(2,obra.getData());
         stmt.setString(3,obra.getTecnica());
         stmt.setString(4, obra.getDimensoes());
         stmt.setString(5, obra.getAutor());
         stmt.setString(6, obra.getProcedencia());
         stmt.setString(7, obra.getTipo());
         stmt.setString(8, obra.getImagem());

         // executa
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
    
    
    public List<Obra> getLista() {
             try {
                
                 List<Obra> obras = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from formulario");
                 ResultSet rs = stmt.executeQuery();

                 while (rs.next()) {

                     // criando o objeto Obra
                     Obra obra;
                     obra = new Obra();         
                     obra.setTitulo(rs.getString("titulo"));
                     obra.setData(rs.getString("data"));
                     obra.setTecnica(rs.getString("tecnica"));
                     obra.setDimensoes(rs.getString("dimensoes"));
                     obra.setAutor(rs.getString("autor"));
                     obra.setProcedencia(rs.getString("procedencia"));
                     obra.setTipo(rs.getString("tipo"));
                     obra.setImagem(rs.getString("imagem"));


                     // adicionando o objeto à lista
                     obras.add(obra);
                 }
                 rs.close();
                 stmt.close();
                 return obras;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }
    
    
    
    
    
    
}
