package DDT_testing;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleData_IntoExcel {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("flipkartlinks");
        for (int i = 0; i < links.size(); i++) {
            WebElement link = links.get(i);
            String url = link.getAttribute("href");
            XSSFRow row = sheet.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(url);
        }

        FileOutputStream fos = new FileOutputStream("./Excel/flipkart.xlsx");
        book.write(fos);
        book.close();
        fos.close();
        System.out.println("Data is written");
        Thread.sleep(2000);
        driver.quit();
    }
}
