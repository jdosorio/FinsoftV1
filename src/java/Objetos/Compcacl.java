package Objetos;

/**
 *
 * @author FELIPE
 */
public class Compcacl
{
    private final String Tabla = "COMPCACL";
    
    private int    CoccCodi = 0;
    private String CoccEnba = "";
    private int    CoccVacr = 0;
    private int    CoccVafu = 0;
    private int    CoccVapr = 0;
    private String CoccOpco = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setCoccCodi(int CoccCodi)
    {
        this.CoccCodi = CoccCodi;
    }
    public int getCoccCodi()
    {
        return CoccCodi;
    }
    
    public void setCoccEnba(String CoccEnba)
    {
        this.CoccEnba = CoccEnba;
    }
    public String getCoccEnba()
    {
        return CoccEnba;
    }
    
    public void setCoccVacr(int CoccVacr)
    {
        this.CoccVacr = CoccVacr;
    }
    public int getCoccVacr()
    {
        return CoccVacr;
    }
    
    public void setCoccVafu(int CoccVafu)
    {
        this.CoccVafu = CoccVafu;
    }
    public int getCoccVafu()
    {
        return CoccVafu;
    }
    
    public void setCoccVapr(int CoccVapr)
    {
        this.CoccVapr = CoccVapr;
    }
    public int getCoccVapr()
    {
        return CoccVapr;
    }
    
    public void setCoccOpco(String CoccOpco)
    {
        this.CoccOpco = CoccOpco;
    }
    public String getCoccOpco()
    {
        return CoccOpco;
    }
}