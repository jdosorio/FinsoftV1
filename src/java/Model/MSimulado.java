package Model;

import Objetos.Clientes;
import Objetos.Simulado;
import Objetos.Usuarios;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MSimulado extends BaseDatos
{
    public boolean insertar(Simulado Simu)
    {
        try
        {
            ryValores.add(Simu.getSimuClie());
            ryValores.add(Simu.getSimuAdic());
            ryValores.add(Simu.getSimuToin());
            ryValores.add(Simu.getSimuAple());
            ryValores.add(Simu.getSimuInma());
            ryValores.add(Simu.getSimuSalm());
            ryValores.add(Simu.getSimuEmba());
            ryValores.add(Simu.getSimuPudc());
            ryValores.add(Simu.getSimuPucn());
            ryValores.add(Simu.getSimuTasa());
            ryValores.add(Simu.getSimuOdli());
            ryValores.add(Simu.getSimuAsfi());
            ryValores.add(Simu.getSimuIva());
            ryValores.add(Simu.getSimuGmf());
            ryValores.add(Simu.getSimuVlde());
            ryValores.add(Simu.getSimuVlcr());
            ryValores.add(Simu.getSimuEsta());
            ryValores.add(Simu.getSimuUsua());
            ryValores.add(Simu.getSimuUssi());
            ryValores.add(Simu.getSimuPape());
            ryValores.add(Simu.getSimuPlaz());
            
            stSql = "pgSimulado.prInseSimu(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    
    public boolean actualiz(Simulado Simu)
    {
        try
        {
            ryValores.add(Simu.getSimuCodi());
            ryValores.add(Simu.getSimuClie());
            ryValores.add(Simu.getSimuFees());
            ryValores.add(Simu.getSimuAdic());
            ryValores.add(Simu.getSimuToin());
            ryValores.add(Simu.getSimuAple());
            ryValores.add(Simu.getSimuInma());
            ryValores.add(Simu.getSimuSalm());
            ryValores.add(Simu.getSimuEmba());
            ryValores.add(Simu.getSimuPudc());
            ryValores.add(Simu.getSimuPucn());
            ryValores.add(Simu.getSimuTasa());
            ryValores.add(Simu.getSimuPlaz());
            ryValores.add(Simu.getSimuOdli());
            ryValores.add(Simu.getSimuAsfi());
            ryValores.add(Simu.getSimuIva());
            ryValores.add(Simu.getSimuGmf());
            ryValores.add(Simu.getSimuVlde());
            ryValores.add(Simu.getSimuVlcr());
            ryValores.add(Simu.getSimuEsta());
            ryValores.add(Simu.getSimuUsua());
            ryValores.add(Simu.getSimuFesi());
            ryValores.add(Simu.getSimuUssi());
            ryValores.add(Simu.getSimuPape());
            stSql = "pgSimulado.prActuSimu(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            parametros(0);
            return true;
        }
        catch(Exception x)
        {
            return false;
        }
    }
    
    public ArrayList<Simulado> consulta(Clientes Clie) throws Exception
    {
        ArrayList<Simulado> Simus = new ArrayList<>();
        try
        {
            Simulado Simu = new Simulado();
            conectar();
            cs = cn.prepareCall("BEGIN pgSimulado.prConsSimu(?,?,?,?,?); END;");
            cs.setString(1, Clie.getClieIden());
            cs.setString(2, Clie.getClieNom1());
            cs.setString(3, Clie.getClieTel1());
            cs.setString(4, Clie.getClieTel2());
            cs.registerOutParameter(5, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(5);
            while(rs.next())
            {
                Simu.setSimuCodi(rs.getInt(1));
                Simu.setSimuClie(rs.getInt(2));
                Simu.setSimuFees(rs.getDate(3));
                Simu.setSimuAdic(rs.getDouble(4));
                Simu.setSimuToin(rs.getDouble(5));
                Simu.setSimuAple(rs.getDouble(6));
                Simu.setSimuInma(rs.getDouble(7));
                Simu.setSimuSalm(rs.getDouble(8));
                Simu.setSimuEmba(rs.getString(9));
                Simu.setSimuPudc(rs.getDouble(10));
                Simu.setSimuPucn(rs.getDouble(11));
                Simu.setSimuTasa(rs.getDouble(12));
                Simu.setSimuOdli(rs.getInt(13));
                Simu.setSimuAsfi(rs.getDouble(14));
                Simu.setSimuIva(rs.getDouble(15));
                Simu.setSimuGmf(rs.getDouble(16));
                Simu.setSimuVlde(rs.getDouble(17));
                Simu.setSimuVlcr(rs.getDouble(18));
                Simu.setSimuEsta(rs.getString(19));
                Simu.setSimuUsua(rs.getInt(20));
                Simu.setSimuFesi(rs.getDate(21));
                Simu.setSimuUssi(rs.getString(22));
                Simu.setSimuPape(rs.getDouble(23));
                Simu.setSimuPlaz(rs.getInt(24));
                Simus.add(Simu);
            }
            return Simus;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
        public String[][] consulta() throws Exception
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
            stSql = "SELECT SIM.SIMUUSUA,CONCAT( CONCAT( CONCAT( CONCAT( CONCAT(USU.USUANOM1, ' '), USU.USUANOM2), ' '),USU.USUAAPE1),' ')AS \"COMERCIAL\", SUM(SIM.SIMUVLCR) AS \"SUMA\" " +
            "FROM SIMULADO SIM " +
            "INNER JOIN USUARIOS USU " +
            "ON SIM.SIMUUSUA = USU.USUACODI " +
            "GROUP BY SIM.SIMUUSUA,USU.USUANOM1,USU.USUANOM2,USU.USUAAPE1";
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
}