package Model;

import Objetos.Modulos;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MModulos extends BaseDatos
{
    public boolean insertar(Modulos Modu)
    {
        try
        {
            ryValores.add(Modu.getModuCodi());
            ryValores.add(Modu.getModuDesc());
            stSql = "pgModulos.prInseModu(?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Modulos Modu)
    {
        try
        {
            ryValores.add(Modu.getModuCodi());
            stSql = "pgModulos.prElimModu(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Modulos Modu)
    {
        try
        {
            ryValores.add(Modu.getModuCodi());
            ryValores.add(Modu.getModuDesc());
            stSql = "pgModulos.prActuModu(?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Modulos consulta(Modulos Modu) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgModulos.prConsModu(?,?); END;");
            cs.setString(1, Modu.getModuCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Modu.setModuCodi(rs.getString(1));
                Modu.setModuDesc(rs.getString(2));
            }
            return Modu;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    /*public Modulos consulta(Modulos Modu) throws Exception
    {
        try
        {
            stSql = "<B> := pgModulos.prConsModu(?,<S>,<S>);";
            parametros(1);
            return Modu;
        }
        catch(Exception x)
        {
            throw x;
        }
    }*/
}