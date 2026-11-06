package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_element {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
        Thread.sleep(2000);

        WebElement contact_form =driver.findElement(By.id("contact_me"));

        WebElement first_name =contact_form.findElement(By.name("first-name"));

        WebElement last_name =contact_form.findElement(By.name("last-name"));

        WebElement submitBtn =contact_form.findElement(By.xpath("//input[@value='SUBMIT']"));

        first_name.sendKeys("Admin");
        Thread.sleep(2000);
        last_name.sendKeys("Rajesh");
        Thread.sleep(2000);
        last_name.clear();
        Thread.sleep(2000);
        submitBtn.submit();
        Thread.sleep(2000);
        driver.quit();
    }
}