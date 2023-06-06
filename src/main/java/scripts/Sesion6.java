package scripts;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;
import Poms.NewWindow;
import sun.tools.jconsole.Tab;

public class Sesion6 {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		NewWindow nw = new NewWindow(driver);
		
		//Click 4 veces
		Thread.sleep(1000);
		nw.select();
		nw.select();
		nw.select();
		nw.select();
		
		//Tab 1
		Thread.sleep(1000);
		ArrayList<String> tab1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab1.get(0));
		System.out.println(driver.getTitle());
		
		//Tab2
		ArrayList<String> tab2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab2.get(1));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//Tab 3
		Thread.sleep(1000);
		ArrayList<String> tab3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab3.get(2));
		driver.get("https://www.youtube.com/?hl=es-419&gl=MX");
		System.out.println(driver.getTitle());
		
		//Tab 4
		Thread.sleep(1000);
		ArrayList<String> tab4 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab4.get(3));
		driver.get("https://www.amazon.com.mx/");
		System.out.println(driver.getTitle());
		
		//Tab 5
		Thread.sleep(1000);
		ArrayList<String> tab5 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab5.get(4));
		driver.get("https://www.mercadolibre.com.mx/");
		System.out.println(driver.getTitle());
		
		//Redireccion de ventana
		nw.goToWindow("Youtube");
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}

}
