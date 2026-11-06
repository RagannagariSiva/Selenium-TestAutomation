package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Arrributes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");

        Thread.sleep(2000);

        WebElement search_tf = driver.findElement(By.name("search_query"));

        Thread.sleep(1000);

        // To fetch the size of the WebElement
        Dimension size = search_tf.getSize();

        System.out.println("The size of the element is: " + size);

        Thread.sleep(1000);

        System.out.println("The height of the element is: " + size.getHeight());

        Thread.sleep(1000);

        System.out.println("The width of the element is: " + size.getWidth());

        // To fetch the location of the WebElement
        Point loc = search_tf.getLocation();

        Thread.sleep(1000);

        System.out.println("The location of the element is: " + loc);

        int x = loc.getX();

        int y = loc.getY();

        // To fetch the attribute value
        String placeholder = search_tf.getAttribute("placeholder");

        Thread.sleep(1000);

        System.out.println("The placeholder of the element is: " + placeholder);

        // To fetch CSS components
        String font_family = search_tf.getCssValue("font-family");

        Thread.sleep(1000);

        System.out.println("The font family of the element is: " + font_family);

        Thread.sleep(1000);

        System.out.println("The role of the element is: " + search_tf.getAttribute("role"));

        Thread.sleep(1000);

        System.out.println("The accessible name of the element is: " + search_tf.getAccessibleName());

        Thread.sleep(2000);
    }
}