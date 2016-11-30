package Servlets;

import Controlador.CMensajes;
import Controlador.CParaoper;
import Objetos.Paraoper;
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
@WebServlet(name = "SParaoper", urlPatterns = {"/SParaoper"})
public class SParaoper extends HttpServlet {

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
                Paraoper Paop = new Paraoper();
                Paop.setPaopCodi(request.getParameter("txPaopCodi"));
                Paop.setPaopDesc(request.getParameter("txPaopDesc"));
                Paop.setPaopValo(request.getParameter("txPaopValo"));
                Paop.setPaopModu(request.getParameter("txPaopModu"));
                String Accion = request.getParameter("btSubmit");
                CParaoper cPaop = new CParaoper(Paop);
                
                if(cPaop.PaopCrud(Accion))
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
                        case "Consultar":
                            Paop = cPaop.getParametro();
                            out.println("<table>");
                                out.println("<tr>");
                                    out.println("<td> <label>Código de Parámetro:</label> "+Paop.getPaopCodi()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Descripción de Parámetro:</label> "+Paop.getPaopDesc()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Valor de Parámetro:</label> "+Paop.getPaopValo()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Módulo de Parámetro:</label> "+Paop.getPaopModu()+"</td>");
                                out.println("</tr>");
                            out.println("</table>");
                        break;
                    }
                }
                else
                {
                    if(Accion.equals("Consultar"))
                    {
                        CMensajes.Mensaje(8, response);
                    }
                    else
                    {
                        CMensajes.Mensaje(5, response);
                    }
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
