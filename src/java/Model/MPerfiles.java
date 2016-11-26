package Model;

import Objetos.Perfiles;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MPerfiles extends BaseDatos
{
    public boolean insertar(Perfiles Perf)
    {
        try
        {
            ryValores.add(Perf.getPerfCodi());
            ryValores.add(Perf.getPerfDesc());
            ryValores.add(Perf.getPerfTipo());
            ryValores.add(Perf.getPerfFunc());
            ryValores.add(Perf.getPerfEsta());
            stSql = "pgPerfiles.prInsePerf(?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Perfiles Perf)
    {
        try
        {
            ryValores.add(Perf.getPerfCodi());
            stSql = "pgPerfiles.prElimPerf(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Perfiles Perf)
    {
        try
        {
            ryValores.add(Perf.getPerfCodi());
            ryValores.add(Perf.getPerfDesc());
            ryValores.add(Perf.getPerfTipo());
            ryValores.add(Perf.getPerfFunc());
            ryValores.add(Perf.getPerfEsta());
            stSql = "pgPerfiles.prActuPerf(?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Perfiles consulta(Perfiles Perf) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgPerfiles.prConsPerf(?,?); END;");
            cs.setString(1, Perf.getPerfCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Perf.setPerfCodi(rs.getString(1));
                Perf.setPerfDesc(rs.getString(2));
                Perf.setPerfTipo(rs.getString(3));
                Perf.setPerfFunc(rs.getString(4));
                Perf.setPerfEsta(rs.getString(5));
            }
            return Perf;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}