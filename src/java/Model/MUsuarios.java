package Model;

import Objetos.Usuarios;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
            stSql = "pgUsuarios.prActuUsua(?,?,?,?,?,?,?,?,?,?,?,?,?);";
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
            cs = cn.prepareCall("BEGIN pgUsuarios.prConsUsua(?,?,?); END;");
            
            cs.setInt(1, Usua.getUsuaCodi());
            cs.setString(2, Usua.getUsuaIden());
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            
            cs.execute();
            rs = (ResultSet)cs.getObject(3);
            if(rs.next())
            {
                Usua.setUsuaCodi(rs.getInt(1));
                Usua.setUsuaNom1(rs.getString(2));
                Usua.setUsuaNom2(rs.getString(3));
                Usua.setUsuaApe1(rs.getString(4));
                Usua.setUsuaApe2(rs.getString(5));
                Usua.setUsuaIden(rs.getString(6));
                Usua.setUsuaCorr(rs.getString(7));
                Usua.setUsuaTel1(rs.getString(8));
                Usua.setUsuaTel2(rs.getString(9));
                Usua.setUsuaNick(rs.getString(10));
                Usua.setUsuaPass(rs.getString(11));
                Usua.setUsuaPerf(rs.getString(12));
                Usua.setUsuaEsta(rs.getString(13));
            }
            return Usua;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public String[][] consultaAll(Usuarios Usua) throws Exception
    {
        String[][] Matriz;
        int filas = 0;
        int columnas = 0;
        int i = 0;
        try
        {
            conectar();
            /*
                Se hizo de esta forma por funcionalidad del ResultSet
            */
            stSql = "SELECT *" +
                    "  FROM USUARIOS" +
                    " WHERE UsuaEsta LIKE NVL('"+Usua.getUsuaEsta()+"','%')" +
                    "   AND UsuaPerf LIKE NVL('"+Usua.getUsuaPerf()+"','%')";
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
            //cs.execute();
            //rs = (ResultSet)cs.getObject(3);
            rs = st.executeQuery(stSql);
            rs.last();
            filas = rs.getRow();
            rs.beforeFirst();
            ResultSetMetaData rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            Matriz = new String[filas][columnas];
            while(rs.next() && i < filas)
            {
                for(int j=0;j<columnas;j++)
                {
                    Matriz[i][j] = rs.getString(j+1);
                }
                i++;                    
            }
            return Matriz;
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