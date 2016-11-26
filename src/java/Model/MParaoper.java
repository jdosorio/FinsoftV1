package Model;

import Objetos.Paraoper;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MParaoper extends BaseDatos
{
    public boolean insertar(Paraoper Paop)
    {
        try
        {
            ryValores.add(Paop.getPaopCodi());
            ryValores.add(Paop.getPaopDesc());
            ryValores.add(Paop.getPaopValo());
            ryValores.add(Paop.getPaopModu());
            stSql = "pgParaoper.prInsePaop(?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Paraoper Paop)
    {
        try
        {
            ryValores.add(Paop.getPaopCodi());
            stSql = "pgParaoper.prElimPaop(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Paraoper Paop)
    {
        try
        {
            ryValores.add(Paop.getPaopCodi());
            ryValores.add(Paop.getPaopDesc());
            ryValores.add(Paop.getPaopValo());
            ryValores.add(Paop.getPaopModu());
            stSql = "pgParaoper.prActuPaop(?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Paraoper consulta(Paraoper Paop) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgPerfiles.prConsPerf(?,?); END;");
            cs.setString(1, Paop.getPaopCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Paop.setPaopCodi(rs.getString(1));
                Paop.setPaopDesc(rs.getString(2));
                Paop.setPaopValo(rs.getString(3));
                Paop.setPaopModu(rs.getString(4));
            }
            return Paop;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}
