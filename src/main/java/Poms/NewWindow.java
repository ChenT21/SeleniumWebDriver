package Poms;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewWindow {

	WebDriver driver;
	
	String window = "//*[@id='Wikipedia1_wikipedia-search-form']/div/span[1]/a/img";
	
	public NewWindow(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void select() {
		WebElement nw = driver.findElement(By.xpath(window));
		nw.click();
	}
	public void goToWindow(String ventana) {
		
		switch (ventana) { 
	    case "Automation Testing Practice":
	    	ArrayList<String> tab1 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tab1.get(0));
	     break;
	    case "Google":
	    	ArrayList<String> tab2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tab2.get(1));
	     break;
	    case "YouTube":
	    	ArrayList<String> tab3 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tab3.get(2));
	     break;
	    case  "Amazon":
	    	ArrayList<String> tab4 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tab4.get(3));
		     break;
	    case "Mercado Libre México":
	    	ArrayList<String> tab5 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tab5.get(4));
		     break;
	  }
		
		
	}
	
}
