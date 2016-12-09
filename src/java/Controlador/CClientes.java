package Controlador;

import Objetos.Clientes;
import Model.MClientes;
import java.io.File;
import java.io.FileOutputStream;
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
public class CClientes
{
    Clientes Clie = null;
    public CClientes()
    {
        
    }
    public CClientes(Clientes Clie)
    {
        this.Clie = Clie;
    }
    
    public boolean ClieCrud(String Accion) throws Exception
    {
        boolean blRespuest = false;
        try
        {
            MClientes mClie = new MClientes();
            
            switch(Accion)
            {
                case "Consultar":
                    Clie = mClie.consulta(Clie);
                    blRespuest = Clie.getClieNom1() != null;
                break;
                
                case "Actualizar":
                    blRespuest = mClie.actualiz(Clie);
                break;
                
                case "Guardar":
                    blRespuest = mClie.insertar(Clie);
                break;
                
                case "Eliminar":
                    blRespuest = mClie.eliminar(Clie);
                break;
            }
            return blRespuest;
        }
        catch(Exception x)
        {
            throw x;
        }
    }
    public Clientes getCliente()
    {
        return Clie;
    }
    
    public boolean GeneRepo(Double dbSalario2) throws Exception
    {
        String ClieAll[][];
        try
        {
            MClientes mClie = new  MClientes();
            ClieAll = mClie.consultaAll(Clie,dbSalario2);
            int Filas = ClieAll.length;
            if(Filas > 0)
            {
                String rutaArchivo = System.getProperty("user.home")+"/Clientes.xls";
                File archivoXLS = new File(rutaArchivo);
                HSSFWorkbook libro = new HSSFWorkbook();
                HSSFCellStyle style = libro.createCellStyle();
                style.setFillForegroundColor(HSSFColor.BLUE_GREY.index);
                style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Clientes del Sistema");
                
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
                celda.setCellValue("Fecha Nacimiento");
                celda = fila.createCell(7);
                celda.setCellValue("Celular");
                celda = fila.createCell(8);
                celda.setCellValue("Fijo");
                celda = fila.createCell(9);
                celda.setCellValue("Correo");
                celda = fila.createCell(10);
                celda.setCellValue("Direccion");
                celda = fila.createCell(11);
                celda.setCellValue("Salario");
                celda = fila.createCell(12);
                celda.setCellValue("Estado");
                
                for(int i=0;i<Filas;i++)
                {
                    fila = hoja.createRow(i+1);
                    for(int x=0; x<ClieAll[i].length; x++)
                    {
                        celda = fila.createCell(x);
                        celda.setCellValue(ClieAll[i][x]);
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
}