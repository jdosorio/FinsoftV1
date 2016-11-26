package Servlets;

import Controlador.CMensajes;
import Controlador.CUsuarios;
import Objetos.Usuarios;
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
@WebServlet(name = "SUsuarios", urlPatterns = {"/SUsuarios"})
public class SUsuarios extends HttpServlet {

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
                Usuarios Usua = new Usuarios();
                Usua.setUsuaNom1(request.getParameter("txUsuaNom1"));
                Usua.setUsuaNom2(request.getParameter("txUsuaNom2"));
                Usua.setUsuaApe1(request.getParameter("txUsuaApe1"));
                Usua.setUsuaApe2(request.getParameter("txUsuaApe2"));
                Usua.setUsuaIden(request.getParameter("txUsuaIden"));
                Usua.setUsuaCorr(request.getParameter("txUsuaCorr"));
                Usua.setUsuaTel1(request.getParameter("txUsuaTel1"));
                Usua.setUsuaTel2(request.getParameter("txUsuaTel2"));
                Usua.setUsuaNick(request.getParameter("txUsuaNick"));
                Usua.setUsuaPass(request.getParameter("txUsuaPass"));
                Usua.setUsuaPerf(request.getParameter("txUsuaPerf"));
                Usua.setUsuaEsta(request.getParameter("txUsuaEsta"));
                String Accion = request.getParameter("btSubmit");
                
                CUsuarios cUsua = new CUsuarios(Usua);
                if((!request.getParameter("txUsuaCodi").isEmpty() || !request.getParameter("txUsuaIden").isEmpty())
                    )
                {
                    int inUsuaCodi = Integer.parseInt(request.getParameter("txUsuaCodi"));
                    Usua.setUsuaCodi(inUsuaCodi);
                   //cUsua.ValiExis(Usua);
                }
                if(cUsua.UsuaCrud(Accion))
                {
                    switch(Accion)
                    {
                        case "Guardar":
                            CMensajes.Mensaje(2, response);
                        break;
                        case "Actualizar":
                            CMensajes.Mensaje(3, response);
                        break;
                        case "Eliminar":
                            CMensajes.Mensaje(4, response);
                        break;
                    }
                    
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
