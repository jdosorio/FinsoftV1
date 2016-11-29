package Controlador;

import Model.MParaoper;
import Objetos.Paraoper;

/**
 *
 * @author FELIPE
 */
public class CParaoper
{
    Paraoper Paop = null;
    public CParaoper()
    {
        
    }
    public CParaoper(Paraoper Paop)
    {
        this.Paop = Paop;
    }
    
    public boolean PaopCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MParaoper mPaop = new MParaoper();
            
            switch(Accion)
            {
                case "Consultar":
                    Paop = mPaop.consulta(Paop);
                    blRespuest = Paop.getPaopDesc() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mPaop.actualiz(Paop);
                break;
                
                case "Guardar":
                    blRespuest = mPaop.insertar(Paop);
                break;
                
                case "Eliminar":
                    blRespuest = mPaop.eliminar(Paop);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Paraoper getParametro()
    {
        return Paop;
    }
}