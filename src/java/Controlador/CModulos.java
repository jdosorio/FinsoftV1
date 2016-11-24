package Controlador;

import Model.MModulos;
import Objetos.Modulos;

/**
 *
 * @author FELIPE
 */
public class CModulos
{
    Modulos Modu = null;
    public CModulos()
    {
        
    }
    
    public CModulos(Modulos Modu)
    {
        this.Modu = Modu;
    }
    
    public boolean ModuCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MModulos mModu = new MModulos();
            
            switch(Accion)
            {
                case "Consultar":
                    Modu = mModu.consulta(Modu);
                    blRespuest = Modu.getModuDesc() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mModu.actualiz(Modu);
                break;
                
                case "Guardar":
                    blRespuest = mModu.insertar(Modu);
                break;
                
                case "Eliminar":
                    blRespuest = mModu.eliminar(Modu);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Modulos getModulo()
    {
        return Modu;
    }
}