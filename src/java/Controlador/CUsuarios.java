package Controlador;

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
    
    public boolean ValidarSesion()
    {
        return true;
    }
}
