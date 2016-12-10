/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.CMensajes;
import Controlador.CSimulador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan y Karol
 */
@WebServlet(name = "SIndicadores", urlPatterns = {"/SIndicadores"})
public class SIndicadores extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            try
           {
               CSimulador cSimu = new CSimulador();
               if(cSimu.Listar(request.getParameter("txClieIden"),request.getParameter("txClieNom1"),
                               request.getParameter("txClieTel1"),request.getParameter("txClieTel2")))
               {
                   out.println("<table border='1'>");
                   for (int i = 0; i < cSimu.getSimulados().size(); i++)
                   {
                       out.println("<tr>");
                          out.println("<td>  "+ cSimu.getSimulados().get(i).getSimuCodi() +"  </td>");
                          out.println("<td>  "+ cSimu.getSimulados().get(i).getSimuAdic()+"  </td>");
                       out.println("</tr>");
                   }
                   out.println("</table>");
               }
           }
           catch(Exception e)
           {
               CMensajes.Mensaje(e.toString(), response);
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
