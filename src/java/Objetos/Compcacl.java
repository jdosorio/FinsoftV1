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
    private double CoccVacr = 0;
    private double CoccVafu = 0;
    private double CoccVapr = 0;
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
    
    public void setCoccVacr(double CoccVacr)
    {
        this.CoccVacr = CoccVacr;
    }
    public double getCoccVacr()
    {
        return CoccVacr;
    }
    
    public void setCoccVafu(double CoccVafu)
    {
        this.CoccVafu = CoccVafu;
    }
    public double getCoccVafu()
    {
        return CoccVafu;
    }
    
    public void setCoccVapr(double CoccVapr)
    {
        this.CoccVapr = CoccVapr;
    }
    public double getCoccVapr()
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