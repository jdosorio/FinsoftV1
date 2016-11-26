package Controlador;

import Objetos.Mensajes;
import Model.MMensajes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FELIPE
 */
public class CMensajes
{
    Mensajes Mens = null;
    public CMensajes()
    {
        
    }
    
    public CMensajes(Mensajes Mens)
    {
        this.Mens = Mens;
    }
    
    public static void Mensaje(int inMensCodi, HttpServletResponse response) throws Exception
    {
        String mensaje = null;
        PrintWriter msg;
        try
        {            
            MMensajes mMens = new MMensajes();
            mensaje = mMens.getMensaje(inMensCodi);
            if(mensaje == null)
            {
                mensaje = "[0] - Mensaje No Definido.";
            }
            else
            {
                mensaje = "[" + inMensCodi + "] - " + mensaje;
            }
            mensaje = "<script> alert('" + mensaje + "'); </script>";
            response.setContentType("text/html");
            msg = response.getWriter();
            msg.println(mensaje);
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public static void Mensaje(String mensaje, HttpServletResponse response) throws IOException
    {
        PrintWriter msg;
        try
        {
            mensaje = "<script> alert('" + mensaje + "'); </script>";
            response.setContentType("text/html");
            msg = response.getWriter();
            msg.println(mensaje);
        }
        catch(Exception x)
        {
            msg = response.getWriter();
            msg.println("<script> alert('" + x.toString() + "'); </script>");
        }
    }
}