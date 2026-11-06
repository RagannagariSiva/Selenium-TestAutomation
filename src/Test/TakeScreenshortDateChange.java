package Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshortDateChange {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().fullscreen();

        driver.get("https://www.zomato.com/");

        Thread.sleep(2000);

        TakesScreenshot st = (TakesScreenshot) driver;

        File temp = st.getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        String date = sdf.format(d);
        File perm = new File("/Users/shiva/Documents/Selenium/ScreenShot/File" + date + ".png");
        FileHandler.copy(temp, perm);
        Thread.sleep(2000);
        driver.quit();
    }
}