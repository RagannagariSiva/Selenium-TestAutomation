package DDT_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fls = new FileInputStream("./Excel/Data.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fls);
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row_0 = sheet.getRow(1);
		XSSFCell cell_0 = row_0.getCell(0);
		XSSFCell cell_1 = row_0.getCell(1);
		String usn_1 = cell_0.getStringCellValue();
		String psw_1 = cell_1.getStringCellValue();
		System.out.println(usn_1+" "+psw_1);
		book.close();
		fls.close();
		
	}


}
