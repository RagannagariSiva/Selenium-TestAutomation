package DDT_testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataProperty {

public static void main(String[] args) throws IOException   
{
		
//		FileOutputStream fos=new FileOutputStream("./PropertyFiles/writeFile.properties",true);  //for Getting Old data
		FileOutputStream fos=new FileOutputStream("./PropertyFiles/writeFile.properties");
		Properties pos=new Properties();
		pos.setProperty("Module", "CheckOut");
		pos.setProperty("Browser", "FireFox");
		pos.setProperty("version", "153.0.3");
		pos.store(fos, "Execution Details");
		System.out.println("Data is Writen");
		fos.close();
	}

}
