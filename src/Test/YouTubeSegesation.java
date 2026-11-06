package Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class YouTubeSegesation {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().fullscreen();;
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("virat");
        Thread.sleep(2000);
        List<WebElement> links=driver.findElements(By.xpath("//div[@role='option']"));
        for(WebElement link:links) {
            String text=link.getText();
            System.out.println(text);
            if(text.toLowerCase().contains("virat kohli batting"))
            {

                File temp=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileHandler.copy(temp,new File("./screenshort/viratSegesationPage.png"));
                link.click();
                Thread.sleep(2000);
                temp=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileHandler.copy(temp,new File("./screenshort/viratBating.png"));

                break;
            }
        }

        driver.quit();
    }
}