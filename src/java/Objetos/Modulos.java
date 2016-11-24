package Objetos;

/**
 *
 * @author FELIPE
 */
public class Modulos
{
    private final String Tabla = "MODULOS";
    
    private String ModuCodi = "";
    private String ModuDesc = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setModuCodi(String ModuCodi)
    {
        this.ModuCodi = ModuCodi;
    }
    public String getModuCodi()
    {
        return ModuCodi;
    }
    
    public void setModuDesc(String ModuDesc)
    {
        this.ModuDesc = ModuDesc;
    }
    public String getModuDesc()
    {
        return ModuDesc;
    }
}