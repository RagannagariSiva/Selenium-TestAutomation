package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Dime_Posit {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement search_tf = driver.findElement(By.xpath("//*[@class='ytSearchboxComponentSearchButton']"));

        Thread.sleep(2000);

        Rectangle rec = search_tf.getRect();
        rec.getX();
        rec.getWidth();
        System.out.println("The Dimension of the element is: " + rec.getDimension());
        System.out.println("The Position of the element is: " + rec.getPoint());

        Thread.sleep(2000);

        driver.quit();
    }
}