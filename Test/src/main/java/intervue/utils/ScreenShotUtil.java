package intervue.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {
	
	public ScreenShotUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	WebDriver driver;
	public void take() {
		TakesScreenshot scrn = (TakesScreenshot)driver;
		File file =scrn.getScreenshotAs(OutputType.FILE);
		String path ="C:\\Users\\acer\\Pictures\\Failed Cases\\"+"Login"+".png";
		
		try {
			FileUtils.copyFile(file, new File(path));
			System.out.println("ScreenSHot saved to : "+ path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
