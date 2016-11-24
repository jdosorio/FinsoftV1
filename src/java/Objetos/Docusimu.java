package Objetos;

import java.sql.Date;

/**
 *
 * @author FELIPE
 */
public class Docusimu
{
    private final String Tabla = "DOCUSIMU";
    
    int    DosiSimu = 0;
    int    DosiSecu = 0;
    String DosiDocu = "";
    Date   DosiFesi = null;
    String DosiUssi = "";
    
    public String getTabla()
    {
        return Tabla;
    }
    
    public void setDosiSimu(int DosiSimu)
    {
        this.DosiSimu = DosiSimu;
    }
    public int getDosiSimu()
    {
        return DosiSimu;
    }
    
    public void setDosiSecu(int DosiSecu)
    {
        this.DosiSecu = DosiSecu;
    }
    public int getDosiSecu()
    {
        return DosiSecu;
    }
    
    public void setDosiDocu(String DosiDocu)
    {
        this.DosiDocu = DosiDocu;
    }
    public String getDosiDocu()
    {
        return DosiDocu;
    }
    
    public void setDosiFesi(Date DosiFesi)
    {
        this.DosiFesi = DosiFesi;
    }
    public Date getDosiFesi()
    {
        return DosiFesi;
    }
    
    public void setDosiUssi(String DosiUssi)
    {
        this.DosiUssi = DosiUssi;
    }
    public String getDosiUssi()
    {
        return DosiUssi;
    }
}