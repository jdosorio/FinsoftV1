package Controlador;

import Model.MSimulado;
import Objetos.Clientes;
import Objetos.Simulado;
import java.util.ArrayList;

/**
 *
 * @author Juan y Karol
 */
public class CSimulador {
     Simulado Simu = null;
     ArrayList<Simulado> Simus = new ArrayList<>();
     boolean blRespuest;
    public CSimulador()
    {
        
    }
     public CSimulador(Simulado Simu)
    {
        this.Simu = Simu;
    }
     
     public boolean SimuCrud(String Accion) throws Exception
    {
        blRespuest = false;
        try
        {
            MSimulado mSimu = new MSimulado();
            
            switch(Accion)
            {
                        
                case "Actualizar":
                    blRespuest = mSimu.actualiz(Simu);
                break;
                
                case "Guardar":
                    blRespuest = mSimu.insertar(Simu);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public boolean Listar(String Iden, String Nom1, String Tel1, String Tel2) throws Exception
    {
        try
        {
            Clientes Clie = new Clientes();
            Clie.setClieIden(Iden);
            Clie.setClieNom1(Nom1);
            Clie.setClieTel1(Tel1);
            Clie.setClieTel2(Tel2);
            MSimulado mSimu = new MSimulado();
            Simus = mSimu.consulta(Clie);
            blRespuest = Simus.size() > 0;
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
     
    public Simulado getSimulado()
    {
        return Simu;
    }
    
    public ArrayList<Simulado> getSimulados()
    {
        return Simus;
    }
}