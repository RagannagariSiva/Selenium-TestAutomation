package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2_Axis {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/Follow-Table.html");
		// A----->20---->M
		driver.findElement(By.xpath("//td[.='A']/../following-sibling::tr[1]/td[2]/../following-sibling::tr[1]/td[2]"));
		// D----->C------>15
		driver.findElement(By.xpath("//td[.='D']/../td[.='C']/../following-sibling::tr[3]/td[1]"));
		// D----->30 ----->40
		driver.findElement(By.xpath("//td[.='D']/../following-sibling::tr[1]/td[3]/../td[4]"));
		// 18----->N----->M
		driver.findElement(By.xpath("//td[.='18']/../preceding-sibling::tr[1]/td[2]/../td[3]"));
		// 16----->N------>D
		driver.findElement(By.xpath("//td[.='16']/../preceding-sibling::tr[1]/td[2]/../preceding-sibling::tr[2]/td[4]"));
		
	}

}
