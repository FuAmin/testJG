package testJG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TEST01 {
	@Test
	public void test(){
		System.out.println("1111111");
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		System.out.println("222222222");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.close();
	}
	
}
