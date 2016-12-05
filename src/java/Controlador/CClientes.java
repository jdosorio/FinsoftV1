package Controlador;

import Objetos.Clientes;
import Model.MClientes;

/**
 *
 * @author FELIPE
 */
public class CClientes
{
    Clientes Clie = null;
    public CClientes()
    {
        
    }
    public CClientes(Clientes Clie)
    {
        this.Clie = Clie;
    }
    
    public boolean ClieCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MClientes mClie = new MClientes();
            
            switch(Accion)
            {
                case "Consultar":
                    Clie = mClie.consulta(Clie);
                    blRespuest = Clie.getClieNom1() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mClie.actualiz(Clie);
                break;
                
                case "Guardar":
                    blRespuest = mClie.insertar(Clie);
                break;
                
                case "Eliminar":
                    blRespuest = mClie.eliminar(Clie);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    public Clientes getCliente()
    {
        return Clie;
    }
}
