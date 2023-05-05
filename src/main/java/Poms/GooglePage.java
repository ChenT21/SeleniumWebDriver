package Poms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	WebDriver driver;
	String searchBarId = "APjFqb";
	String Result = "//h3[text()='Nintendo - Wikipedia']";
	String text = "mw-page-title-main";

	public GooglePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void  typeOnSearchBar(String value) {
		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public void clickResult() {
		WebElement fr = driver.findElement(By.xpath(Result));
		fr.click();
	}
	public void printText() {
		WebElement fr = driver.findElement(By.className(text));
		System.out.println(fr.getText());
	}
}
