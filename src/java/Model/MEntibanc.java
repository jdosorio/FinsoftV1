package Model;

import Objetos.Entibanc;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MEntibanc extends BaseDatos
{
    public boolean insertar(Entibanc Enba)
    {
        try
        {
            ryValores.add(Enba.getEnbaCodi());
            ryValores.add(Enba.getEnbaDesc());
            ryValores.add(Enba.getEnbaEsta());
            stSql = "pgEntibanc.prInseEnba(?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Entibanc Enba)
    {
        try
        {
            ryValores.add(Enba.getEnbaCodi());
            stSql = "pgEntibanc.prElimEnba(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Entibanc Enba)
    {
        try
        {
            ryValores.add(Enba.getEnbaCodi());
            ryValores.add(Enba.getEnbaDesc());
            ryValores.add(Enba.getEnbaEsta());
            stSql = "pgEntibanc.prActuEnba(?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Entibanc consulta(Entibanc Enba) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgEntibanc.prConsEnba(?,?); END;");
            cs.setString(1, Enba.getEnbaCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Enba.setEnbaCodi(rs.getString(1));
                Enba.setEnbaDesc(rs.getString(2));
                Enba.setEnbaEsta(rs.getString(3));
            }
            return Enba;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}
