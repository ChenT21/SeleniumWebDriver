package Poms;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	WebDriver driver;
	String searchBarId = "APjFqb";
	String Result = "//h3[text()='Wikipedia']";
	String text = "//h3[@class='LC20lb MBeuO DKV0Md']";
	String parrafo = "//*[@id=\"mw-content-text\"]/div[1]/p";

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
	public void clickResultById(int result) {
		List <WebElement> list = driver.findElements(By.xpath(text));
		list.get(result).click();
		System.out.println(list.size());
	}
	public void printTitle() {
		System.out.println(driver.getTitle());
	}
	public void printParrafo() {
		
		List <WebElement> list = driver.findElements(By.xpath(parrafo));
				
		for(int i = 3; i >= 0; i--) {
			System.out.println(list.get(i).getText());
			
		}
		
	}
	
	public void printResults() {
		List <WebElement> list = driver.findElements(By.xpath(text));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
		
	}
}
