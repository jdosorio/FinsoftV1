package Objetos;

/**
 *
 * @author FELIPE
 */
public class Estados
{
    private final String Tabla = "ESTADOS";
    
    private String EstaCodi = "";
    private String EstaDesc = "";
    private String EstaFunc = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setEstaCodi(String EstaCodi)
    {
        this.EstaCodi = EstaCodi;
    }
    public String getEstaCodi()
    {
        return EstaCodi;
    }
    
    public void setEstaDesc(String EstaDesc)
    {
        this.EstaDesc = EstaDesc;
    }
    public String getEstaDesc()
    {
        return EstaDesc;
    }
    
    public void setEstaFunc(String EstaFunc)
    {
        this.EstaFunc = EstaFunc;
    }
    public String getEstaFunc()
    {
        return EstaFunc;
    }
}