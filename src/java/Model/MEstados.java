package Model;

import Objetos.Estados;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MEstados extends BaseDatos
{
    public boolean insertar(Estados Esta)
    {
        try
        {
            ryValores.add(Esta.getEstaCodi());
            ryValores.add(Esta.getEstaDesc());
            ryValores.add(Esta.getEstaFunc());
            stSql = "pgEstados.prInseEsta(?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Estados Esta)
    {
        try
        {
            ryValores.add(Esta.getEstaCodi());
            stSql = "pgEstados.prElimEsta(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Estados Esta)
    {
        try
        {
            ryValores.add(Esta.getEstaCodi());
            ryValores.add(Esta.getEstaDesc());
            ryValores.add(Esta.getEstaFunc());
            stSql = "pgEstados.prActuEsta(?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Estados consulta(Estados Esta) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgEstados.prConsEsta(?,?); END;");
            cs.setString(1, Esta.getEstaCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Esta.setEstaCodi(rs.getString(1));
                Esta.setEstaDesc(rs.getString(2));
                Esta.setEstaFunc(rs.getString(3));
            }
            return Esta;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}