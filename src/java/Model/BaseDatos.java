package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        String stBloque = "BEGIN ",
               stEntero   = "<I>",
               stCaracter = "<S>",
               stCursor   = "<C>",
               stDecimal  = "<D>",
               stBlob     = "<B>",
               stDesfragm;
        ArrayList ParamOut;
        int inCantEspa = ryValores.size();
        boolean blFuncion;
        try
        {
            blFuncion = stSql.contains("<") && stSql.contains(">");
                if(blFuncion)
                {
                  stDesfragm = stSql;
                
                //stDesfragm.indexOf("<E>"); retorna cuantas veces se encuentra '<E>' dentro de la cadena
                    inPosicion++;
                    stBloque = stSql.replace("<I>", "?");
                
                }
            stBloque = stBloque + stSql + " END;";
            conectar();
            cs = cn.prepareCall(stBloque);
            if(blFuncion)
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
            if(blFuncion)
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