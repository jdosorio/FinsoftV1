package Model;

import Objetos.Usuarios;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MUsuarios extends BaseDatos
{
    public boolean insertar(Usuarios Usua)
    {
        try
        {
            ryValores.add(Usua.getUsuaNom1());
            ryValores.add(Usua.getUsuaNom2());
            ryValores.add(Usua.getUsuaApe1());
            ryValores.add(Usua.getUsuaApe2());
            ryValores.add(Usua.getUsuaIden());
            ryValores.add(Usua.getUsuaCorr());
            ryValores.add(Usua.getUsuaTel1());
            ryValores.add(Usua.getUsuaTel2());
            ryValores.add(Usua.getUsuaNick());
            ryValores.add(Usua.getUsuaPass());
            ryValores.add(Usua.getUsuaPerf());
            ryValores.add(Usua.getUsuaEsta());
            stSql = "pgUsuarios.prInseUsua(?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Usuarios Usua)
    {
        try
        {
            ryValores.add(Usua.getUsuaCodi());
            stSql = "pgUsuarios.prElimUsua(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Usuarios Usua)
    {
        try
        {
            ryValores.add(Usua.getUsuaCodi());
            ryValores.add(Usua.getUsuaNom1());
            ryValores.add(Usua.getUsuaNom2());
            ryValores.add(Usua.getUsuaApe1());
            ryValores.add(Usua.getUsuaApe2());
            ryValores.add(Usua.getUsuaIden());
            ryValores.add(Usua.getUsuaCorr());
            ryValores.add(Usua.getUsuaTel1());
            ryValores.add(Usua.getUsuaTel2());
            ryValores.add(Usua.getUsuaNick());
            ryValores.add(Usua.getUsuaPass());
            ryValores.add(Usua.getUsuaPerf());
            ryValores.add(Usua.getUsuaEsta());
            stSql = "pgPerfiles.prActuPerf(?,?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Usuarios consulta(Usuarios Usua) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgUsuarios.prConsUsua(?,?); END;");
            cs.setInt(1, Usua.getUsuaCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Usua.setUsuaNom1(rs.getString(1));
                Usua.setUsuaNom2(rs.getString(2));
                Usua.setUsuaApe1(rs.getString(3));
                Usua.setUsuaApe2(rs.getString(4));
                Usua.setUsuaIden(rs.getString(5));
                Usua.setUsuaCorr(rs.getString(6));
                Usua.setUsuaTel1(rs.getString(7));
                Usua.setUsuaTel2(rs.getString(8));
                Usua.setUsuaNick(rs.getString(9));
                Usua.setUsuaPass(rs.getString(10));
                Usua.setUsuaPerf(rs.getString(11));
                Usua.setUsuaEsta(rs.getString(12));
            }
            return Usua;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Object[] Sesion(String Login, String Contrase) throws Exception
    {
        Object[] Result = new Object[2];
        try
        {
            stSql = "BEGIN ? := pgUsuarios.fnInicSesi(?,?,?); END;";
            conectar();
            cs = cn.prepareCall(stSql);
            cs.registerOutParameter(1, OracleTypes.VARCHAR);
            cs.registerOutParameter(4, OracleTypes.NUMBER);
            cs.setString(2, Login);
            cs.setString(3, Contrase);
            cs.execute();
            Result[0] = cs.getString(1);
            Result[1] = cs.getInt(4);
            return Result;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}
