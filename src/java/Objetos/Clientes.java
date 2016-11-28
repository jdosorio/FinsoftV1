package Objetos;

import java.sql.Date;

/**
 *
 * @author FELIPE
 */
public class Clientes
{
    private final String Tabla = "CLIENTES";
    
    private int    ClieCodi = 0;
    private String ClieNom1 = "";
    private String ClieNom2 = "";
    private String ClieApe1 = "";
    private String ClieApe2 = "";
    private String ClieIden = "";
    private Date   ClieFena = null;
    private String ClieTel1 = "";
    private String ClieTel2 = "";
    private String ClieCorr = "";
    private String ClieDire = "";
    private int    ClieSaba = 0;
    private String ClieEsta = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setClieCodi(int ClieCodi)
    {
        this.ClieCodi = ClieCodi;
    }
    public int getClieCodi()
    {
        return ClieCodi;
    }
    
    public void setClieNom1(String ClieNom1)
    {
        this.ClieNom1 = ClieNom1;
    }
    public String getClieNom1()
    {
        return ClieNom1;
    }
    
    public void setClieNom2(String ClieNom2)
    {
        this.ClieNom2 = ClieNom2;
    }
    public String getClieNom2()
    {
        return ClieNom2;
    }
    
    public void setClieApe1(String ClieApe1)
    {
        this.ClieApe1 = ClieApe1;
    }
    public String getClieApe1()
    {
        return ClieApe1;
    }
    
    public void setClieApe2(String ClieApe2)
    {
        this.ClieApe2 = ClieApe2;
    }
    public String getClieApe2()
    {
        return ClieApe2;
    }
    
    public void setClieIden(String ClieIden)
    {
        this.ClieIden = ClieIden;
    }
    public String getClieIden()
    {
        return ClieIden;
    }
    
    public void setClieFena(Date ClieFena)
    {
        this.ClieFena = ClieFena;
    }
    public Date getClieFena()
    {
        return ClieFena;
    }
    
    public void setClieTel1(String ClieTel1)
    {
        this.ClieTel1 = ClieTel1;
    }
    public String getClieTel1()
    {
        return ClieTel1;
    }
    
    public void setClieTel2(String ClieTel2)
    {
        this.ClieTel2 = ClieTel2;
    }
    public String getClieTel2()
    {
        return ClieTel2;
    }
    
    public void setClieCorr(String ClieCorr)
    {
        this.ClieCorr = ClieCorr;
    }
    public String getClieCorr()
    {
        return ClieCorr;
    }
    
    public void setClieDire(String ClieDire)
    {
        this.ClieDire = ClieDire;
    }
    public String getClieDire()
    {
        return ClieDire;
    }
    
    public void setClieSaba(int ClieSaba)
    {
        this.ClieSaba = ClieSaba;
    }
    public int getClieSaba()
    {
        return ClieSaba;
    }
    
    public void setClieEsta(String ClieEsta)
    {
        this.ClieEsta = ClieEsta;
    }
    public String getClieEsta()
    {
        return ClieEsta;
    }
}