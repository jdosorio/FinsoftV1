package Model;

import Objetos.Mensajes;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author FELIPE
 */
public class MMensajes extends BaseDatos
{
    Mensajes Mens = null;
    
    public MMensajes()
    {
        
    }
    
    public MMensajes(Mensajes Mens)
    {
        this.Mens = Mens;
    }
    
    public String getMensaje(int inMensCodi) throws Exception
    {
        String mensaje = null;
        try
        {
            stSql = "BEGIN ? := pgMensajes.fnMensaje(?); END;";
            conectar();
            cs = cn.prepareCall(stSql);
            cs.registerOutParameter(1, OracleTypes.VARCHAR);
            cs.setInt(2, inMensCodi);
            cs.execute();
            mensaje = cs.getString(1);
            return mensaje;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}
