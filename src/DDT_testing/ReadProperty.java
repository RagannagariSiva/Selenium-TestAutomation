package DDT_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperty {

	public static void main(String[] args) throws IOException, InterruptedException   {
		
		FileInputStream fos=new FileInputStream("./PropertyFiles/confgFile.properties");
		Properties pos=new Properties();
		pos.load(fos);
		String url=pos.getProperty("testUrl");
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		System.out.println(url);
		String browser=pos.getProperty("browser");
		System.out.println(browser);
		fos.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
