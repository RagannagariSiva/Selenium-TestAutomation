package Flie_flip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKartPuma {

    public static void main(String[] args) throws InterruptedException 
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Puma Shoes");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='Fo1I0b']/following-sibling::a"));
        for (int i = 0; i < links.size(); i++) 
        {
            WebElement link = links.get(i);
            String url = link.getText();
            System.out.println(url);
        }
        Thread.sleep(2000);
        driver.quit();
    }
}