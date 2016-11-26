package Model;

import Objetos.Clientes;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MClientes extends BaseDatos
{
    public boolean insertar(Clientes Clie)
    {
        try
        {
            ryValores.add(Clie.getClieNom1());
            ryValores.add(Clie.getClieNom2());
            ryValores.add(Clie.getClieApe1());
            ryValores.add(Clie.getClieApe2());
            ryValores.add(Clie.getClieIden());
            ryValores.add(Clie.getClieFena());
            ryValores.add(Clie.getClieTel1());
            ryValores.add(Clie.getClieTel2());
            ryValores.add(Clie.getClieCorr());
            ryValores.add(Clie.getClieDire());
            ryValores.add(Clie.getClieSaba());
            ryValores.add(Clie.getClieEsta());
            stSql = "pgClientes.prInseClie(?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Clientes Clie)
    {
        try
        {
            ryValores.add(Clie.getClieCodi());
            stSql = "pgClientes.prElimClie(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Clientes Clie)
    {
        try
        {
            ryValores.add(Clie.getClieCodi());
            ryValores.add(Clie.getClieNom1());
            ryValores.add(Clie.getClieNom2());
            ryValores.add(Clie.getClieApe1());
            ryValores.add(Clie.getClieApe2());
            ryValores.add(Clie.getClieIden());
            ryValores.add(Clie.getClieFena());
            ryValores.add(Clie.getClieTel1());
            ryValores.add(Clie.getClieTel2());
            ryValores.add(Clie.getClieCorr());
            ryValores.add(Clie.getClieDire());
            ryValores.add(Clie.getClieSaba());
            ryValores.add(Clie.getClieEsta());
            stSql = "pgClientes.prActuClie(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    /*
    public Clientes consulta(Clientes Clie) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgUsuarios.prConsUsua(?,?); END;");
            cs.setInt(1, Clie.getClieCodi());
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
    }*/
}
