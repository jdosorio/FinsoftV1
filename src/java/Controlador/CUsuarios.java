package Controlador;

import Model.MUsuarios;
import Objetos.Usuarios;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FELIPE
 */
public class CUsuarios
{
    Usuarios Usua;
    boolean blRespuest;
    
    public CUsuarios()
    {
        
    }
    public CUsuarios(Usuarios Usua)
    {
        this.Usua = Usua;
    }
    
    public boolean UsuaCrud(String Accion) throws Exception
    {
        blRespuest = false;
        try
        {
            MUsuarios mUsua = new MUsuarios();
            
            switch(Accion)
            {
                case "Consultar":
                    Usua = mUsua.consulta(Usua);
                    blRespuest = Usua.getUsuaNom1() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mUsua.actualiz(Usua);
                break;
                
                case "Guardar":
                    blRespuest = mUsua.insertar(Usua);
                break;
                
                case "Eliminar":
                    blRespuest = mUsua.eliminar(Usua);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Usuarios ValiSesi(String Login, String Contrase, HttpServletResponse response) throws Exception
    {
        Object[] Result = new Object[2];
        try
        {
            MUsuarios mUsua = new MUsuarios();
            Result = mUsua.Sesion(Login, Contrase);
            if((int)Result[1] == 0)
            {
                CMensajes.Mensaje(6, response);//Usuario no existe
                response.sendRedirect("login.jsp");
            }
            else
            {
                if((String)Result[0] == "N")
                {
                    CMensajes.Mensaje(7, response);//Clave incorrecta
                    response.sendRedirect("login.jsp");
                }
                else
                {
                    Usua.setUsuaCodi((int)Result[1]);
                    if(UsuaCrud("Consultar"))
                    {
                        response.sendRedirect("view.jsp");
                    }
                }
            }
            return Usua;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    public boolean ValiExis()
    {
        try
        {
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}