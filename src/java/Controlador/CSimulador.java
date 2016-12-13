package Controlador;

import Model.MSimulado;
import Objetos.Clientes;
import Objetos.Simulado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan y Karol
 */
public class CSimulador {
     Simulado Simu = null;
     ArrayList<Simulado> Simus = new ArrayList<>();
     boolean blRespuest;
    public CSimulador()
    {
        
    }
     public CSimulador(Simulado Simu)
    {
        this.Simu = Simu;
    }
     
     public boolean SimuCrud(String Accion) throws Exception
    {
        blRespuest = false;
        try
        {
            MSimulado mSimu = new MSimulado();
            
            switch(Accion)
            {
                case "Consultar":
                    Simu = mSimu.consulta(Simu);
                    blRespuest = Simu != null;
                break;        
                case "Actualizar":
                    blRespuest = mSimu.actualiz(Simu);
                break;
                
                case "Guardar":
                    blRespuest = mSimu.insertar(Simu);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public boolean Listar(String Iden, String Nom1, String Tel1, String Tel2) throws Exception
    {
        try
        {
            Clientes Clie = new Clientes();
            Clie.setClieIden(Iden);
            Clie.setClieNom1(Nom1);
            Clie.setClieTel1(Tel1);
            Clie.setClieTel2(Tel2);
            MSimulado mSimu = new MSimulado();
            Simus = mSimu.consulta(Clie);
            blRespuest = Simus.size() > 0;
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public void pintarSimus(HttpServletResponse response) throws IOException
    {
        PrintWriter out;
        try
        {
            response.setContentType("text/html");
            out = response.getWriter();
            out.println("<table class='table table-striped table-bordered'>");
            out.println("<thead>");
                out.println("<tr>");
                    out.println("<th>Código</th>");
                    out.println("<th>Cliente</th>");
                    out.println("<th>Fecha Estudio</th>");
                    out.println("<th>Ingreso Adicional</th>");
                    out.println("<th>Total Ingresos</th>");
                    out.println("<th>Salud y Pensión</th>");
                    out.println("<th>Ingresos menos Aportes</th>");
                    out.println("<th>Salario Libre Mensual</th>");
                    out.println("<th>Embargado</th>");
                    out.println("<th>P. Data Credito</th>");
                    out.println("<th>P. Cifin</th>");
                    out.println("<th>Tasa</th>");
                    out.println("<th>Desembolso Libre</th>");
                    out.println("<th>Asesoria Financiera</th>");
                    out.println("<th>Iva</th>");
                    out.println("<th>GMF</th>");
                    out.println("<th>Valor Desembolso</th>");
                    out.println("<th>Valor Credito</th>");
                    out.println("<th>Estado</th>");
                    out.println("<th>Código Usuario</th>");
                    out.println("<th>Fecha del Sistema</th>");
                    out.println("<th>Usuario del Sistema</th>");
                    out.println("<th>Papelería</th>");
                    out.println("<th>Papelería</th>");
                    out.println("<th>N° Dias Plazo</th>");
                out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");
            for (int i = 0; i < Simus.size(); i++)
            {
                out.println("<tr>");
                    out.println("<td> <a href='Simulador.jsp?urlSimuCodi="+Simus.get(i).getSimuCodi()+"'> "+ Simus.get(i).getSimuCodi() +" </a> </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuClie()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuFees()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuAdic()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuToin()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuAple()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuInma()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuSalm()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuEmba()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuPudc()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuPucn()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuTasa()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuPlaz()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuOdli()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuAsfi()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuIva()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuGmf()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuVlde()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuVlcr()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuEsta()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuUsua()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuFesi()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuUssi()+"  </td>");
                    out.println("<td>  "+ Simus.get(i).getSimuPape()+"  </td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
        }
        catch(Exception x)
        {
            out = response.getWriter();
            out.println("<script> alert('" + x.toString() + "'); </script>");
        }
    }
    
    public String [][] Listar() throws Exception
    {
        try
        {
            MSimulado mSimu = new MSimulado();
            String matriz [][];
            matriz = mSimu.consulta();
            //blRespuest = matriz.length > 0;
            return matriz;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
     public String [][] ListarDes() throws Exception
    {
        try
        {
            MSimulado mSimu = new MSimulado();
            String matriz [][];
            matriz = mSimu.consultaDes();
            //blRespuest = matriz.length > 0;
            return matriz;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
     
    public Simulado getSimulado()
    {
        return Simu;
    }
    
    public ArrayList<Simulado> getSimulados()
    {
        return Simus;
    }
}
