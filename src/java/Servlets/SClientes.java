package Servlets;

import Controlador.CMensajes;
import Controlador.CClientes;
import Objetos.Clientes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FELIPE
 */
@WebServlet(name = "SClientes", urlPatterns = {"/SClientes"})
public class SClientes extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try
            {
                Clientes Clie = new Clientes();
                int inClieCodi = Integer.parseInt(request.getParameter("txClieCodi"));
                Clie.setClieCodi(inClieCodi);
                Clie.setClieNom1(request.getParameter("txClieNom1"));
                Clie.setClieNom2(request.getParameter("txClieNom2"));
                Clie.setClieApe1(request.getParameter("txClieApe1"));
                Clie.setClieApe2(request.getParameter("txClieApe2"));
                Clie.setClieIden(request.getParameter("txClieIden"));
                Clie.setClieFena(request.getParameter("txClieFena"));
                Clie.setClieTel1(request.getParameter("txClieTel1"));
                Clie.setClieTel2(request.getParameter("txClieTel2"));
                Clie.setClieCorr(request.getParameter("txClieCorr"));
                Clie.setClieDire(request.getParameter("txClieDire"));
                Double dbClieSaba = Double.valueOf(request.getParameter("txClieSaba"));
                Clie.setClieSaba(dbClieSaba);
                Clie.setClieEsta(request.getParameter("txClieEsta"));
                
                CClientes cClie = new CClientes(Clie);
                
                if(cClie.ClieCrud(request.getParameter("btSubmit")))
                {
                    CMensajes.Mensaje(1, response);
                }
                else
                {
                    CMensajes.Mensaje(5, response);
                }
            }
            catch(Exception x)
            {
                CMensajes.Mensaje(x.toString(), response);
            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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