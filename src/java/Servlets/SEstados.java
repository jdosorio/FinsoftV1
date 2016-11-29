package Servlets;

import Controlador.CEstados;
import Controlador.CMensajes;
import Objetos.Estados;
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
@WebServlet(name = "SEstados", urlPatterns = {"/SEstados"})
public class SEstados extends HttpServlet {

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
                Estados Esta = new Estados();
                Esta.setEstaCodi(request.getParameter("txEstaCodi"));
                Esta.setEstaDesc(request.getParameter("txEstaDesc"));
                Esta.setEstaFunc(request.getParameter("txEstaFunc"));
                String Accion = request.getParameter("btSubmit");
                CEstados cEsta = new CEstados(Esta);
                
                if(cEsta.EstaCrud(Accion))
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
                            Esta = cEsta.getEstado();
                            out.println("<table>");
                                out.println("<tr>");
                                    out.println("<td> <label>Código de Estado:</label> "+Esta.getEstaCodi()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Descripción de Estado:</label> "+Esta.getEstaDesc()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Función de Estado:</label> "+Esta.getEstaFunc()+"</td>");
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
