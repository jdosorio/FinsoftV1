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
            ryValores.add(Simu.getSimuCodi());
            stSql = "pgSimulado.prInseSimu(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
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
            stSql = "pgSimulado.prActuSimu(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    /*
    public Simulado consulta(Simulado Simu) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgSimulado.prConsSimu(?,?); END;");
            cs.setString(1, Simu.getSimuCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Simu.setSimuCodi(rs.getString(1));
                Simu.setSimuDesc(rs.getString(2));
            }
            return Simu;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    /*public Simulado consulta(Simulado Simu) throws Exception
    {
        try
        {
            stSql = "<B> := pgSimulado.prConsSimu(?,<S>,<S>);";
            parametros(1);
            return Simu;
        }
        catch(Exception x)
        {
            throw x;
        }
    }*/
}