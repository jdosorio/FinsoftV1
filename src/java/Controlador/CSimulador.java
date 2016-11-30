/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Model.MSimulado;
import Objetos.Modulos;
import Objetos.Simulado;

/**
 *
 * @author Juan y Karol
 */
public class CSimulador {
     Simulado Simu = null;
    public CSimulador()
    {
        
    }
     public CSimulador(Simulado Simu)
    {
        this.Simu = Simu;
    }
     
     public boolean SimuCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
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
     
      public Simulado getSimulado()
    {
        return Simu;
    }
}
