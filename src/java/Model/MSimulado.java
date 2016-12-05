package Model;

import Objetos.Simulado;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MSimulado extends BaseDatos
{
    public boolean insertar(Simulado Simu)
    {
        try
        {
            ryValores.add(Simu.getSimuClie());
            ryValores.add(Simu.getSimuFees());
            ryValores.add(Simu.getSimuAdic());
            ryValores.add(Simu.getSimuToin());
            ryValores.add(Simu.getSimuAple());
            ryValores.add(Simu.getSimuInma());
            ryValores.add(Simu.getSimuSalm());
            ryValores.add(Simu.getSimuEmba());
            ryValores.add(Simu.getSimuPudc());
            ryValores.add(Simu.getSimuPucn());
            ryValores.add(Simu.getSimuTasa());
            ryValores.add(Simu.getSimuPlaz());
            ryValores.add(Simu.getSimuOdli());
            ryValores.add(Simu.getSimuAsfi());
            ryValores.add(Simu.getSimuIva());
            ryValores.add(Simu.getSimuGmf());
            ryValores.add(Simu.getSimuVlde());
            ryValores.add(Simu.getSimuVlcr());
            ryValores.add(Simu.getSimuEsta());
            ryValores.add(Simu.getSimuUsua());
            ryValores.add(Simu.getSimuFesi());
            ryValores.add(Simu.getSimuUssi());
            ryValores.add(Simu.getSimuPape());
            
            stSql = "pgSimulado.prInseSimu(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    
    public boolean actualiz(Simulado Simu)
    {
        try
        {
            ryValores.add(Simu.getSimuCodi());
            ryValores.add(Simu.getSimuClie());
            ryValores.add(Simu.getSimuFees());
            ryValores.add(Simu.getSimuAdic());
            ryValores.add(Simu.getSimuToin());
            ryValores.add(Simu.getSimuAple());
            ryValores.add(Simu.getSimuInma());
            ryValores.add(Simu.getSimuSalm());
            ryValores.add(Simu.getSimuEmba());
            ryValores.add(Simu.getSimuPudc());
            ryValores.add(Simu.getSimuPucn());
            ryValores.add(Simu.getSimuTasa());
            ryValores.add(Simu.getSimuPlaz());
            ryValores.add(Simu.getSimuOdli());
            ryValores.add(Simu.getSimuAsfi());
            ryValores.add(Simu.getSimuIva());
            ryValores.add(Simu.getSimuGmf());
            ryValores.add(Simu.getSimuVlde());
            ryValores.add(Simu.getSimuVlcr());
            ryValores.add(Simu.getSimuEsta());
            ryValores.add(Simu.getSimuUsua());
            ryValores.add(Simu.getSimuFesi());
            ryValores.add(Simu.getSimuUssi());
            ryValores.add(Simu.getSimuPape());
            stSql = "pgSimulado.prActuSimu(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Simulado consulta(Simulado Simu) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgSimulado.prConsSimu(?,?); END;");
            cs.setInt(1, Simu.getSimuCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Simu.setSimuCodi(rs.getInt(1));
                Simu.setSimuClie(rs.getInt(2));
            }
            return Simu;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}