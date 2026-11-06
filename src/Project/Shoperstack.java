
package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shoperstack {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void launchBrowser() {

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().window().maximize();
        driver.get("https://www.shoppersstack.com/");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".MuiBackdrop-root")));

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));

        loginButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
    }

    @Test
    public void validLogin() {

        driver.findElement(By.id("Email"))
              .sendKeys("kalyani23454@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("Rkalyani23454@");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Login']"))).click();

        // Add an assertion for the actual successful-login result.
    }

    @Test
    public void invalidLogin() {

        driver.findElement(By.id("Email"))
              .sendKeys("kalyani454@gmail.com");

        driver.findElement(By.id("Password"))
              .sendKeys("Rkalyani454@");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Login']"))).click();

        // Add an assertion for the actual error message.
    }

    @AfterMethod(alwaysRun = true)
    public void closeApp() {

        if (driver != null) {
            driver.quit();
        }
    }
}
