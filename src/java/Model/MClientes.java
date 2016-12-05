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
    
    public Clientes consulta(Clientes Clie) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgClientes.prConsClie(?,?,?); END;");
            cs.setInt(1, Clie.getClieCodi());
            cs.setString(2, Clie.getClieIden());
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(3);
            if(rs.next())
            {
                Clie.setClieCodi(rs.getInt(1));
                Clie.setClieNom1(rs.getString(2));
                Clie.setClieNom2(rs.getString(3));
                Clie.setClieApe1(rs.getString(4));
                Clie.setClieApe2(rs.getString(5));
                Clie.setClieIden(rs.getString(6));
                Clie.setClieFena(rs.getDate(7));
                Clie.setClieTel1(rs.getString(8));
                Clie.setClieTel2(rs.getString(9));
                Clie.setClieCorr(rs.getString(10));
                Clie.setClieDire(rs.getString(11));
                Clie.setClieSaba(rs.getInt(12));
                Clie.setClieEsta(rs.getString(13));
            }
            return Clie;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}