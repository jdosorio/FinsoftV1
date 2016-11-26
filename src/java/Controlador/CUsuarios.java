package Controlador;

import Model.MUsuarios;
import Objetos.Usuarios;

/**
 *
 * @author FELIPE
 */
public class CUsuarios
{
    Usuarios Usua;
    
    public CUsuarios()
    {
        
    }
    public CUsuarios(Usuarios Usua)
    {
        this.Usua = Usua;
    }
    
    public boolean UsuaCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
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
    
    public Object[] ValiSesi(String Login, String Contrase) throws Exception
    {
        Object[] Result = new Object[2];
        int inMensCodi = 0;
        try
        {
            MUsuarios mUsua = new MUsuarios();
            Result = mUsua.Sesion(Login, Contrase);
            if((int)Result[1] == 0)
            {
                inMensCodi = 2;
            }
            else
            {
                if((String)Result[0] == "N")
                {
                    inMensCodi = 3;
                }
                else
                {
                    this.Usua.setUsuaCodi((int)Result[1]);
                    UsuaCrud("Consultar");
                    
                }
            }
            
            return Result;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}
