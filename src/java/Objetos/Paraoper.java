package Objetos;

/**
 *
 * @author FELIPE
 */
public class Paraoper
{
    private final String Tabla = "PARAOPER";
    
    private String PaopCodi = "";
    private String PaopDesc = "";
    private String PaopValo = "";
    private String PaopModu = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setPaopCodi(String PaopCodi)
    {
        this.PaopCodi = PaopCodi;
    }
    public String getPaopCodi()
    {
        return PaopCodi;
    }
    
    public void setPaopDesc(String PaopDesc)
    {
        this.PaopDesc = PaopDesc;
    }
    public String getPaopDesc()
    {
        return PaopDesc;
    }
    
    public void setPaopValo(String PaopValo)
    {
        this.PaopValo = PaopValo;
    }
    public String getPaopValo()
    {
        return PaopValo;
    }
    
    public void setPaopModu(String PaopModu)
    {
        this.PaopModu = PaopModu;
    }
    public String getPaopModu()
    {
        return PaopModu;
    }
}