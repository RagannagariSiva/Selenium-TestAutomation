package AssignWork;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_DemoApp_OptionsFetch {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("select3"));
		Select s1=new Select(dropdown);
		List<WebElement> opt = s1.getOptions();
		LinkedList<String> country=new LinkedList<String>();
		
		for(WebElement we:opt)
		{
			String text=we.getText();
			System.out.println(we.getText());
			country.add(text);
			
		}
        Collections.sort(country,Collections.reverseOrder());
		
		System.out.println("==============================");
		
		for(String text:country)
		{
			System.out.println(text);
		}
		System.out.println("============================");
		s1.selectByValue("India");
		WebElement select=s1.getFirstSelectedOption();
		System.out.println(select.getText());
		System.out.println("============================");
		
		WebElement drop=driver.findElement(By.id("select5"));
		Select s2=new Select(drop);
		List<WebElement> option = s2.getOptions();
		
		for(WebElement w2:option)
		{
			String text=w2.getText();
			System.out.println(w2.getText());
			
		}
		System.out.println("============================");
		s2.selectByValue("Andhra Pradesh");
		WebElement selected=s2.getFirstSelectedOption();
		System.out.println(selected.getText());
		System.out.println("============================");
		
		WebElement dropd=driver.findElement(By.xpath("//option[@id='optionCity']/.."));
		Select s3=new Select(dropd);
		List<WebElement> options = s3.getOptions();
		LinkedList<String> state=new LinkedList<String>();
		for(WebElement w3:options)
		{
			String text=w3.getText();
			System.out.println(w3.getText());
			state.add(text);
		}
        Collections.sort(state);
		
		System.out.println("==============================");
		
		for(String text:state)
		{
			System.out.println(text);
		}
		System.out.println("============================");
		s3.selectByValue("Anantapur");
		WebElement se=s3.getFirstSelectedOption();
		System.out.println(se.getText());
		System.out.println("============================");
		driver.quit();
	}

}
