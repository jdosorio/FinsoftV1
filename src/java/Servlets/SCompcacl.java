package Servlets;

import Controlador.CMensajes;
import Controlador.CCompcacl;
import Objetos.Compcacl;
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
@WebServlet(name = "SCompcacl", urlPatterns = {"/SCompcacl"})
public class SCompcacl extends HttpServlet {

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
                Compcacl Cocc = new Compcacl();
                int inCoccCodi = Integer.parseInt(request.getParameter("txCoccCodi"));
                Cocc.setCoccCodi(inCoccCodi);
                Cocc.setCoccEnba(request.getParameter("txCoccEnba"));
                double inCoccVacr = Double.valueOf(request.getParameter("txCoccVacr"));
                Cocc.setCoccVacr(inCoccVacr);
                double inCoccVafu = Double.valueOf(request.getParameter("txCoccVafu"));
                Cocc.setCoccVafu(inCoccVafu);
                double inCoccVapr = Double.valueOf(request.getParameter("txCoccVapr"));
                Cocc.setCoccVapr(inCoccVapr);
                Cocc.setCoccOpco(request.getParameter("txCoccOpco"));
                CCompcacl cCocc = new CCompcacl(Cocc);
                
                if(cCocc.CoccCrud(request.getParameter("btSubmit")))
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