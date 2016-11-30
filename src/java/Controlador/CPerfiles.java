package Controlador;

import Model.MPerfiles;
import Objetos.Perfiles;

/**
 *
 * @author FELIPE
 */
public class CPerfiles
{
    Perfiles Perf = null;
    public CPerfiles()
    {
        
    }
    public CPerfiles(Perfiles Perf)
    {
        this.Perf = Perf;
    }
    
    public boolean PerfCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MPerfiles mPerf = new MPerfiles();
            
            switch(Accion)
            {
                case "Consultar":
                    Perf = mPerf.consulta(Perf);
                    blRespuest = Perf.getPerfDesc() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mPerf.actualiz(Perf);
                break;
                
                case "Guardar":
                    blRespuest = mPerf.insertar(Perf);
                break;
                
                case "Eliminar":
                    blRespuest = mPerf.eliminar(Perf);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Perfiles getPerfil()
    {
        return Perf;
    }
}