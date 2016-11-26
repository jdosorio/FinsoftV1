package Model;

import Objetos.Compcacl;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MCompcacl extends BaseDatos
{
    public boolean insertar(Compcacl Cocc)
    {
        try
        {
            ryValores.add(Cocc.getCoccEnba());
            ryValores.add(Cocc.getCoccVacr());
            ryValores.add(Cocc.getCoccVafu());
            ryValores.add(Cocc.getCoccVapr());
            ryValores.add(Cocc.getCoccOpco());
            stSql = "pgCompcacl.prInseCocc(?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean eliminar(Compcacl Cocc)
    {
        try
        {
            ryValores.add(Cocc.getCoccCodi());
            stSql = "pgCompcacl.prElimCocc(?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public boolean actualiz(Compcacl Cocc)
    {
        try
        {
            ryValores.add(Cocc.getCoccCodi());
            ryValores.add(Cocc.getCoccEnba());
            ryValores.add(Cocc.getCoccVacr());
            ryValores.add(Cocc.getCoccVafu());
            ryValores.add(Cocc.getCoccVapr());
            ryValores.add(Cocc.getCoccOpco());
            stSql = "pgCompcacl.prActuCocc(?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public Compcacl consulta(Compcacl Cocc) throws Exception
    {
        try
        {
            conectar();
            cs = cn.prepareCall("BEGIN pgCompcacl.prConsCocc(?,?); END;");
            cs.setInt(1, Cocc.getCoccCodi());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                Cocc.setCoccCodi(rs.getInt(1));
                Cocc.setCoccEnba(rs.getString(2));
                Cocc.setCoccVacr(rs.getInt(3));
                Cocc.setCoccVafu(rs.getInt(4));
                Cocc.setCoccVapr(rs.getInt(5));
                Cocc.setCoccOpco(rs.getString(6));
            }
            return Cocc;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}