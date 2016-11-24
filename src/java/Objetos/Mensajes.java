package Objetos;

/**
 *
 * @author FELIPE
 */
public class Mensajes
{
    private final String Tabla = "MENSAJES";
    
    private int    MensCodi = 0;
    private String MensDesc = "";
    private String MensCaus = "";
    private String MensSolu = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setMensCodi(int MensCodi)
    {
        this.MensCodi = MensCodi;
    }
    public int getMensCodi()
    {
        return MensCodi;
    }
    
    public void setMensDesc(String MensDesc)
    {
        this.MensDesc = MensDesc;
    }
    public String getMensDesc()
    {
        return MensDesc;
    }
    
    public void setMensCaus(String MensCaus)
    {
        this.MensCaus = MensCaus;
    }
    public String getMensCaus()
    {
        return MensCaus;
    }
    
    public void setMensSolu(String MensSolu)
    {
        this.MensSolu = MensSolu;
    }
    public String getMensSolu()
    {
        return MensSolu;
    }
}