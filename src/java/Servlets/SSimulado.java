/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.CMensajes;
import Controlador.CSimulador;
import Controlador.CUsuarios;
import Objetos.Simulado;
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
@WebServlet(name = "SSimulado", urlPatterns = {"/SSimulado"})
public class SSimulado extends HttpServlet {

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
                //Simulado Simu = new Simulado();
                //String Accion = request.getParameter("btSubmit");
                  String data = request.getParameter("data_form");

                out.println(data);
                /*if(inUsuaCodi != -1)
                {
                    Simu.setUsuaCodi(inUsuaCodi);
                }
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
                
                CSimulador cSimu = new CSimulador(Simu);
                
                if(cSimu.SimuCrud(Accion))
                {
                    switch(Accion)
                    {
                        case "Guardar":
                            CMensajes.Mensaje(2, response);
                        break;
                        case "Actualizar":
                            CMensajes.Mensaje(3, response);
                        break;
                        /*case "Eliminar":
                            CMensajes.Mensaje(4, response);
                        break;
                        case "Consultar":
                            Simu = cSimu.getUsuario();
                            out.println("<table>");
                                out.println("<tr>");
                                    out.println("<td> <label>Código de Usuario:</label> "+Usua.getUsuaCodi()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Primer Nombre Usuario:</label> "+Usua.getUsuaNom1()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Segundo Nombre Usuario:</label> "+Usua.getUsuaNom2()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Primer Apellido Usuario:</label> "+Usua.getUsuaApe1()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Segundo Apellido Usuario:</label> "+Usua.getUsuaApe2()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Identificación Usuario:</label> "+Usua.getUsuaIden()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Correo Usuario:</label> "+Usua.getUsuaCorr()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Telefono#1 Usuario:</label> "+Usua.getUsuaTel1()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Telefono#2 Usuario:</label> "+Usua.getUsuaTel2()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Login Usuario:</label> "+Usua.getUsuaNick()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Contraseña Usuario:</label> "+Usua.getUsuaPass()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Perfil Usuario:</label> "+Usua.getUsuaPerf()+"</td>");
                                out.println("</tr>");
                                out.println("<tr>");
                                    out.println("<td> <label>Estado de Usuario:</label> "+Usua.getUsuaEsta()+"</td>");
                                out.println("</tr>");
                            out.println("</table>");
                        break;*/
                  //  }
                //}/*
                /*else
                {
                    if(Accion.equals("Consultar"))
                    {
                        CMensajes.Mensaje(8, response);
                    }
                    else
                    {
                        CMensajes.Mensaje(5, response);
                    }
                }*/
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
