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
import Objetos.Usuarios;
import javax.servlet.http.HttpSession;


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
                CSimulador cSimu = null;
                if(request.getParameter("SimuCodi") != null)
                {
                    int SimuCodi = Integer.parseInt(request.getParameter("SimuCodi"));
                    Simu.setSimuCodi(SimuCodi);
                    cSimu = new CSimulador(Simu);
                    if(cSimu.SimuCrud("Consultar"))
                    {
                        Simu = cSimu.getSimulado();
                        out.println(Simu.getSimuCodi());
                        out.println(Simu.getSimuClie());
                        out.println(Simu.getSimuFees());
                        out.println(Simu.getSimuAdic());
                        out.println(Simu.getSimuToin());
                        out.println(Simu.getSimuAple());
                        out.println(Simu.getSimuInma());
                        out.println(Simu.getSimuSalm());
                        out.println(Simu.getSimuEmba());
                        out.println(Simu.getSimuPudc());
                        out.println(Simu.getSimuPucn());
                        out.println(Simu.getSimuTasa());
                        out.println(Simu.getSimuOdli());
                        out.println(Simu.getSimuAsfi());
                        out.println(Simu.getSimuIva());
                        out.println(Simu.getSimuGmf());
                        out.println(Simu.getSimuVlde());
                        out.println(Simu.getSimuVlcr());
                        out.println(Simu.getSimuEsta());
                        out.println(Simu.getSimuUsua());
                        out.println(Simu.getSimuFesi());
                        out.println(Simu.getSimuUssi());
                        out.println(Simu.getSimuPape());
                        out.println(Simu.getSimuPlaz());
                    }
                }
                else
                {
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
                    HttpSession sesion = request.getSession(true);
                    Usuarios Usua = (Usuarios)sesion.getAttribute("usuario");
                    Simu.setSimuUsua(Usua.getUsuaCodi());
                    Simu.setSimuUssi(Usua.getUsuaNick());
                    
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
                    cSimu = new CSimulador(Simu);
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
