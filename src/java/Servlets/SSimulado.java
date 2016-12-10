package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Objetos.Simulado;
import Objetos.Clientes;
import Controlador.CClientes;
import Controlador.CMensajes;
import Controlador.CSimulador;


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
                Simulado Simu = new Simulado();
                Clientes Clie = new Clientes();
                Clie.setClieIden(request.getParameter("txClieIden"));
                String Accion = "Guardar";
                CClientes cClie = new CClientes(Clie);
                
                if(cClie.ClieCrud("Consultar"))
                {
                    Clie = cClie.getCliente();
                }
                else
                {
                    Clie.setClieIden(request.getParameter("txClieIden"));
                    Clie.setClieNom1(request.getParameter("txClieNom1"));
                    Clie.setClieNom2(request.getParameter("txClieNom2"));
                    Clie.setClieApe1(request.getParameter("txClieApe1"));
                    Clie.setClieApe2(request.getParameter("txClieApe2"));
                    Clie.setClieFena(request.getParameter("txClieFena"));
                    Clie.setClieTel1(request.getParameter("txClieTel1"));
                    Clie.setClieTel2(request.getParameter("txClieTel1"));
                    Clie.setClieDire(request.getParameter("txClieDire"));
                    Clie.setClieCorr(request.getParameter("txClieCorr"));
                    Clie.setClieEsta("act");
                    Double dbClieSaba = Double.valueOf(request.getParameter("txClieSaba"));
                    Clie.setClieSaba(dbClieSaba);
                    cClie = new CClientes(Clie);
                    if(cClie.ClieCrud("Guardar"))
                    {
                        if(cClie.ClieCrud("Consultar"))
                        {
                            Clie = cClie.getCliente();
                        }
                    }
                }
                String stSimuTico = request.getParameter("SimuTico");
                String stSiobObse = request.getParameter("SiobObse");
                double dbSimuToeg = Double.valueOf(request.getParameter("SimuToeg"));
                double dbSimuCuot = Double.valueOf(request.getParameter("SimuCuot"));
                
                Simu.setSimuClie(Clie.getClieCodi());
                Simu.setSimuEmba(request.getParameter("SimuEmba"));
                double dbSimuPucn = Double.valueOf(request.getParameter("SimuPucn"));
                Simu.setSimuPucn(dbSimuPucn);
                double dbSimuPudc = Double.valueOf(request.getParameter("SimuPudc"));
                Simu.setSimuPudc(dbSimuPudc);
                double dbSimuAdic = Double.valueOf(request.getParameter("SimuAdic"));
                Simu.setSimuAdic(dbSimuAdic);
                double dbSimuToin = Double.valueOf(request.getParameter("SimuToin"));
                Simu.setSimuToin(dbSimuToin);
                double dbSimuInma = Double.valueOf(request.getParameter("SimuInma"));
                Simu.setSimuInma(dbSimuInma);
                double dbSimuAple = Double.valueOf(request.getParameter("SimuAple"));
                Simu.setSimuAple(dbSimuAple);
                double dbSimuSalm = Double.valueOf(request.getParameter("SimuSalm"));
                Simu.setSimuSalm(dbSimuSalm);
                double dbSimuVlcr = Double.valueOf(request.getParameter("SimuVlcr"));
                Simu.setSimuVlcr(dbSimuVlcr);
                int inSimuPlaz = Integer.valueOf(request.getParameter("SimuPlaz"));
                Simu.setSimuPlaz(inSimuPlaz);
                double dbSimuAsfi = Double.valueOf(request.getParameter("SimuAsfi"));
                Simu.setSimuAsfi(dbSimuAsfi);
                double dbSimuIva  = Double.valueOf(request.getParameter("SimuIva"));
                Simu.setSimuIva(dbSimuIva);
                double dbSimuPape = Double.valueOf(request.getParameter("SimuPape"));
                Simu.setSimuPape(dbSimuPape);
                double dbSimuGmf  = Double.valueOf(request.getParameter("SimuGmf"));
                Simu.setSimuGmf(dbSimuGmf);
                double dbSimuVlde = Double.valueOf(request.getParameter("SimuVlde"));
                Simu.setSimuVlde(dbSimuVlde);
                int inSimuOdli = Integer.valueOf(request.getParameter("SimuOdli"));
                Simu.setSimuOdli(inSimuOdli);
                Simu.setSimuEsta(request.getParameter("SimuEsta"));
                double dbSimuTasa = Double.valueOf(request.getParameter("SimuTasa"));
                Simu.setSimuTasa(dbSimuTasa);
                CSimulador cSimu = new CSimulador(Simu);
                if(cSimu.SimuCrud("Guardar"))
                {
                    switch(Accion)
                    {
                        case "Guardar":
                            CMensajes.Mensaje(2, response);
                        break;
                        case "Actualizar":
                            CMensajes.Mensaje(3, response);
                        break;
                        case "Consultar":
                            /*Simu = cSimu.getSimulado();
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
                            out.println("</table>");*/
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
