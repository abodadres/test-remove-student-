package student;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class studentClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//		driver.findElement(By.tagName("option"));
//		driver.findElement(By.tagName("option"));
//		
		List<WebElement> mystudent = driver.findElements(By.tagName("option"));
		
		for (int i=0 ; i < mystudent.size();i++ ) {
			i=i+3;
		
			mystudent.get(i).click();
			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			
		}
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("/html/body/form/select")).click();
//		Date currentTime = new Date();
//
//		String myUpdatedate = currentTime.toString();
//
//		String NewDate = myUpdatedate.replace(":", "-");
//
//
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File file = ts.getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(file, new File("./ScreenShot_Folder/" + NewDate + ".jpg"));
		
	
	}
}
