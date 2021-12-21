package tets.Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\resoureces\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		
	}

}
