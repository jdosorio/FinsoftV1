package Objetos;

/**
 *
 * @author FELIPE
 */
public class Perfiles
{
    private final String Tabla = "PERFILES";
    
    private String PerfCodi = "";
    private String PerfDesc = "";
    private String PerfTipo = "";
    private String PerfFunc = "";
    private String PerfEsta = "";
    
    public void setPerfCodi(String PerfCodi)
    {
        this.PerfCodi = PerfCodi;
    }
    public String getPerfCodi()
    {
        return PerfCodi;
    }
    
    public void setPerfDesc(String PerfDesc)
    {
        this.PerfDesc = PerfDesc;
    }
    public String getPerfDesc()
    {
        return PerfDesc;
    }
    
    public void setPerfTipo(String PerfTipo)
    {
        this.PerfTipo = PerfTipo;
    }
    public String getPerfTipo()
    {
        return PerfTipo;
    }
    
    public void setPerfFunc(String PerfFunc)
    {
        this.PerfFunc = PerfFunc;
    }
    public String getPerfFunc()
    {
        return PerfFunc;
    }
    
    public void setPerfEsta(String PerfEsta)
    {
        this.PerfEsta = PerfEsta;
    }
    public String getPerfEsta()
    {
        return PerfEsta;
    }
}