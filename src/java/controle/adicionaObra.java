package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Obra;
import modelo.ObraDAO;

/**
 *
 * @author tuxcuiabano
 * 
 */
@WebServlet("/adicionaUsuario")
public class adicionaObra extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
                // pegando os parâmetros do request           
                String titulo = request.getParameter("titulo");
                String data = request.getParameter("data");
                String tecnica = request.getParameter("tecnica");
                String dimensoes = request.getParameter("dimensoes");
                String autor = request.getParameter("autor");
                String procedencia = request.getParameter("procedencia");
                String tipo = request.getParameter("tipo");
                String imagem = request.getParameter("imagem");

                
                // monta um objeto usuario
                Obra obra = new Obra();
                obra.setTitulo(titulo);
                obra.setData(data);
                obra.setTecnica(tecnica);
                obra.setDimensoes(dimensoes);
                obra.setAutor(autor);
                obra.setProcedencia(procedencia);
                obra.setTipo(tipo);
                obra.setImagem(imagem);
                
                //chama o Dao e o método adiciona
                out.println("result");
                ObraDAO dao =  new ObraDAO();
                dao.adiciona(obra);
         
                //envia para o JSP
                out.println("result");
                request.setAttribute("nomeobra", obra.getTitulo());
                RequestDispatcher view= request.getRequestDispatcher("result.jsp");
                view.forward(request, response);
                
                

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(adicionaObra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adicionaObra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(adicionaObra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adicionaObra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
