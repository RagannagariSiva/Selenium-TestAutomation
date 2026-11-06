package DDT_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData 
{
    public static void main(String[] args) throws IOException 
    {
        FileInputStream fis = new FileInputStream("./Excel/flipkart.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheetAt(0);
        int lastRow = sheet.getLastRowNum();
        int lastCell = sheet.getRow(0).getLastCellNum();
        for (int r = 0; r <= lastRow; r++) {
            XSSFRow row = sheet.getRow(r);
            for (int c = 0; c < lastCell; c++) {
                XSSFCell cel = row.getCell(c);
                String value = cel.getStringCellValue();
                System.out.print(value + "\t");
            }
            System.out.println(" ");
        }
        book.close();
        fis.close();
    }
}