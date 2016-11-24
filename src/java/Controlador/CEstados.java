package Controlador;

import Model.MEstados;
import Objetos.Estados;

/**
 *
 * @author FELIPE
 */
public class CEstados
{
    Estados Esta = null;
    public CEstados()
    {
        
    }
    
    public CEstados(Estados Esta)
    {
        this.Esta = Esta;
    }
    
    public boolean EstaCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MEstados mEsta = new MEstados();
            
            switch(Accion)
            {
                case "Consultar":
                    Esta = mEsta.consulta(Esta);
                    blRespuest = Esta.getEstaDesc() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mEsta.actualiz(Esta);
                break;
                
                case "Guardar":
                    blRespuest = mEsta.insertar(Esta);
                break;
                
                case "Eliminar":
                    blRespuest = mEsta.eliminar(Esta);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Estados getEstado()
    {
        return Esta;
    }
}
