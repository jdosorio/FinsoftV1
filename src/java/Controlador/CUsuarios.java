package Controlador;

import Model.MUsuarios;
import Objetos.Usuarios;
import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 * @author FELIPE
 */
public class CUsuarios
{
    Usuarios Usua;
    boolean blRespuest;
    
    public CUsuarios()
    {
        
    }
    public CUsuarios(Usuarios Usua)
    {
        this.Usua = Usua;
    }
    
    public boolean UsuaCrud(String Accion) throws Exception
    {
        blRespuest = false;
        try
        {
            MUsuarios mUsua = new MUsuarios();
            
            switch(Accion)
            {
                case "Consultar":
                    Usua = mUsua.consulta(Usua);
                    blRespuest = Usua.getUsuaNom1() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mUsua.actualiz(Usua);
                break;
                
                case "Guardar":
                    blRespuest = mUsua.insertar(Usua);
                break;
                
                case "Eliminar":
                    blRespuest = mUsua.eliminar(Usua);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public Usuarios getUsuario()
    {
        return Usua;
    }
    
    public Usuarios ValiSesi(String Login, String Contrase, HttpServletResponse response) throws Exception
    {
        Object[] Result = new Object[2];
        String stRespuest = "";
        int inCodigo = -1;
        try
        {
            Usua = new Usuarios();
            MUsuarios mUsua = new MUsuarios();
            Result = mUsua.Sesion(Login, Contrase);
            stRespuest = (String)Result[0];
            inCodigo = (int)Result[1];
            if(inCodigo == 0)
            {
                //CMensajes.Mensaje(6, response);//Usuario no existe
                //response.sendRedirect("login.jsp");
                Usua.setUsuaNick("");
            }
            else
            {
                if(stRespuest.equals("N"))
                {
                    //CMensajes.Mensaje(7, response);//Clave incorrecta
                    //response.sendRedirect("login.jsp");
                    Usua.setUsuaNick(Login);
                    Usua.setUsuaNom1("N");
                }
                else
                {
                    Usua.setUsuaCodi(inCodigo);
                    if(UsuaCrud("Consultar"))
                    {
                        response.sendRedirect("view.jsp");
                    }
                }
            }
            return Usua;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public boolean GeneRepo() throws Exception
    {
        String UsuaAll[][];
        try
        {
            MUsuarios mUsua = new  MUsuarios();
            UsuaAll = mUsua.consultaAll(Usua);
            int Filas = UsuaAll.length;
            if(Filas > 0)
            {
                String rutaArchivo = System.getProperty("user.home")+"/Usuarios.xls";
                File archivoXLS = new File(rutaArchivo);
                HSSFWorkbook libro = new HSSFWorkbook();
                HSSFCellStyle style = libro.createCellStyle();
                style.setFillForegroundColor(HSSFColor.BLUE_GREY.index);
                style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Usuarios del Sistema");
                
                Row fila = hoja.createRow(0);
                Cell celda = fila.createCell(0);
                celda.setCellValue("Código");
                celda = fila.createCell(1);
                celda.setCellValue("Primer Nombre");
                celda = fila.createCell(2);
                celda.setCellValue("Segundo Nombre");
                celda = fila.createCell(3);
                celda.setCellValue("Primer Apellido");
                celda = fila.createCell(4);
                celda.setCellValue("Segundo Apellido");
                celda = fila.createCell(5);
                celda.setCellValue("Identificación");
                celda = fila.createCell(6);
                celda.setCellValue("Correo");
                celda = fila.createCell(7);
                celda.setCellValue("Celular");
                celda = fila.createCell(8);
                celda.setCellValue("Fijo");
                celda = fila.createCell(9);
                celda.setCellValue("Nikcname");
                celda = fila.createCell(10);
                celda.setCellValue("Contraseña");
                celda = fila.createCell(11);
                celda.setCellValue("Perfil");
                celda = fila.createCell(12);
                celda.setCellValue("Estado");
                
                for(int i=0;i<Filas;i++)
                {
                    fila = hoja.createRow(i+1);
                    for(int x=0; x<UsuaAll[i].length; x++)
                    {
                        celda = fila.createCell(x);
                        celda.setCellValue(UsuaAll[i][x]);
                    }
                }
                libro.write(archivo);
                archivo.close();
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    
    public boolean ValiExis()
    {
        try
        {
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
}