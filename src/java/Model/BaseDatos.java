package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import oracle.jdbc.OracleTypes;

public class BaseDatos
{
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String jdbc = "oracle.jdbc.driver.OracleDriver";
    private final String Usuario = "FINASOFT";
    private final String Contraseña = "FINASOFT";
    protected String stTabla = "";
    protected String stSql = "";
    protected ArrayList ryValores = new ArrayList();
    protected PreparedStatement ps = null;
    protected Statement st = null;
    protected Connection cn = null;
    protected ResultSet rs = null;
    protected CallableStatement cs = null;
    
    protected void conectar() throws Exception
    {
        try
        {
            Class.forName(jdbc);
            cn = DriverManager.getConnection(url, Usuario, Contraseña);
        }
        catch(ClassNotFoundException | SQLException x)
        {
            throw x;
        }
    }
    
    protected void parametros(int out) throws Exception
    {
        int inPosicion = 0, inEspacio  = 0;
        int y = 0, z = 0;
        String stAbre   = "<", stCierra = ">";
        String stBloque = "BEGIN ", stEnd    = " END;";
        
        /* Tipos de valores para comparar */
        String stEntero   = stAbre + "I" + stCierra,
               stCaracter = stAbre + "S" + stCierra,
               stCursor   = stAbre + "C" + stCierra,
               stDecimal  = stAbre + "D" + stCierra,
               stBoleano  = stAbre + "B" + stCierra,
               stFile     = stAbre + "F" + stCierra,
               stMaxiCara = stAbre + "M" + stCierra, //Gran Cantidad de caracteres(Blob,Clob)
               stFecha    = stAbre + "T" + stCierra; // Tiempo
        
        String VectPara[] = {stEntero, stCaracter, stCursor, stDecimal, stBoleano, stFile, stMaxiCara, stFecha};
        ArrayList<ArrayList> ryParamOut = new ArrayList<>();
        ArrayList ryFila = new ArrayList();
        
        int inCantEspa = ryValores.size();
        boolean blParaSali, blParaLoop; //Parametros de salida
        int inOrder = 0;
        try
        {
            blParaSali = stSql.contains(stAbre) && stSql.contains(stCierra);
            if(blParaSali)
            {
                blParaLoop = true;
                while(blParaLoop)
                {
                    for(int i = 0; i < VectPara.length; i++)
                    {
                        if(stSql.contains(VectPara[i]))
                        {
                            inOrder = stSql.indexOf(VectPara[i]);
                            
                            ryFila.clear();
                            ryFila.add(inOrder);
                            ryFila.add(VectPara[i]);
                            ryParamOut.add(ryFila);
                            stSql = stSql.replaceFirst(VectPara[i], "?");
                            blParaLoop = stSql.contains(stAbre) && stSql.contains(stCierra);
                            if(!blParaLoop)
                            {
                                break;
                            }
                        }
                    }
                }
                inPosicion++;
                /*for(int i = 0; i < ryParamOut.size(); i++)
                {
                    for (int j = 0; j < 10; j++)
                    {
                        ryParamOut.get(i).get(j);
                    }
                }*/
            }
            stBloque = stBloque + stSql + stEnd;
            conectar();
            cs = cn.prepareCall(stBloque);
            if(blParaSali)
            {
                cs.registerOutParameter(inPosicion, OracleTypes.OTHER);
            }
            for(int i = 0; i < inCantEspa; i++)
            {
                inPosicion++;
                cs.setObject(inPosicion, ryValores.get(inEspacio));
                inEspacio++;
            }
            inPosicion = inCantEspa;
            while(inPosicion < (out + inCantEspa))
            {
                inPosicion++;
                z++;
                cs.registerOutParameter(inPosicion, OracleTypes.OTHER);
            }
            cs.execute();
            ryValores.clear();
            if(blParaSali)
            {
                ryValores.add(cs.getObject(1));
                y++;
            }
            while(y < z)
            {
                ryValores.add(cs.getObject(y));
                y++;
            }
        }
        catch (Exception x)
        {
            throw x;
        }
        finally
        {
            cn.close();
        }
    }
    
    protected boolean insert(Object[] bjValores) throws Exception
    {
        int inCadena = 0;
        int inColumnas = 0;
        String sentencia = "";
        try
        {
            parametros(0);
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet)cs.getObject(3);
            
            while(rs.next())
            {
                inColumnas++;
                sentencia = sentencia + rs.getString(1) + ",";
            }
            inCadena = sentencia.length() - 1;
            sentencia = sentencia.substring(0, inCadena);
            sentencia = sentencia + ") VALUES(";
            while(inColumnas > 0)
            {
                sentencia = sentencia + "?,";
                inColumnas--;
            }
            inCadena = sentencia.length() - 1;
            sentencia = sentencia.substring(0, inCadena);
            sentencia = sentencia + ")";
            
            ps = cn.prepareStatement(sentencia);
            ps.execute();
            return true;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    protected void ejecutar()
    {
        
    }
}