package Controlador;

import Model.MEntibanc;
import Objetos.Entibanc;

/**
 *
 * @author FELIPE
 */
public class CEntibanc
{
    Entibanc Enba = null;
    public CEntibanc()
    {
        
    }
    
    public CEntibanc(Entibanc Enba)
    {
        this.Enba = Enba;
    }
    
    public boolean EnbaCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MEntibanc mEnba = new MEntibanc();
            
            switch(Accion)
            {
                case "Consultar":
                    Enba = mEnba.consulta(Enba);
                    blRespuest = Enba.getEnbaDesc() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mEnba.actualiz(Enba);
                break;
                
                case "Guardar":
                    blRespuest = mEnba.insertar(Enba);
                break;
                
                case "Eliminar":
                    blRespuest = mEnba.eliminar(Enba);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Entibanc getEstado()
    {
        return Enba;
    }
}