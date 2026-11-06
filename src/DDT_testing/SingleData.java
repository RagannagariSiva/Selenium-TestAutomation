package DDT_testing;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class SingleData 
{
    public static void main(String[] args) throws IOException 
    {
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("logindata");
        XSSFRow row_0 = sheet.createRow(0);
        XSSFCell cell_0 = row_0.createCell(0);
        XSSFCell cell_1 = row_0.createCell(1);
        cell_0.setCellValue("Admin");
        cell_1.setCellValue("Admin@123");

        FileOutputStream fos = new FileOutputStream("./Excel/output.xlsx");
        book.write(fos);
        book.close();
        fos.close();
        System.out.println("data is written");
    }
}