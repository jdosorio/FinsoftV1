package Objetos;

/**
 *
 * @author FELIPE
 */
public class Entibanc
{
    private final String Tabla = "ENTIBANC";
    private String EnbaCodi = "";
    private String EnbaDesc = "";
    private String EnbaEsta = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setEnbaCodi(String EnbaCodi)
    {
        this.EnbaCodi = EnbaCodi;
    }
    public String getEnbaCodi()
    {
        return EnbaCodi;
    }
    
    public void setEnbaDesc(String EnbaDesc)
    {
        this.EnbaDesc = EnbaDesc;
    }
    public String getEnbaDesc()
    {
        return EnbaDesc;
    }
    
    public void setEnbaEsta(String EnbaEsta)
    {
        this.EnbaEsta = EnbaEsta;
    }
    public String getEnbaEsta()
    {
        return EnbaEsta;
    }
}