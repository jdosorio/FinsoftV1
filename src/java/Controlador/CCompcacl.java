package Controlador;

import Model.MCompcacl;
import Objetos.Compcacl;

/**
 *
 * @author FELIPE
 */
public class CCompcacl
{
    Compcacl Cocc = null;
    public CCompcacl()
    {
        
    }
    public CCompcacl(Compcacl Cocc)
    {
        this.Cocc = Cocc;
    }
    
    public boolean CoccCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MCompcacl mCocc = new MCompcacl();
            
            switch(Accion)
            {
                case "Consultar":
                    Cocc = mCocc.consulta(Cocc);
                    blRespuest = Cocc.getCoccEnba() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mCocc.actualiz(Cocc);
                break;
                
                case "Guardar":
                    blRespuest = mCocc.insertar(Cocc);
                break;
                
                case "Eliminar":
                    blRespuest = mCocc.eliminar(Cocc);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}