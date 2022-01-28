package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramu\\eclipse-workspace\\DayFour\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.greenstech.in/selenium-course-content.html");
//		WebElement textvalue = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
//		String text = textvalue.getText();
//	System.out.println(text);
//	WebElement containstext = driver.findElement(By.xpath("//p[contains(text(),'        Learn')] "));
//	String text2 = containstext.getText();
//	System.out.println(text2);
//	
	
	
		driver.get("https://www.facebook.com/");
		WebElement textuser = driver.findElement(By.id("email"));
	textuser.sendKeys("sakthi123@gmail.com");
	String attribute = textuser.getAttribute("value");
	System.out.println(attribute);
	String attribute2 = textuser.getAttribute("id");
	System.out.println(attribute2);
	
//<<<<<<< HEAD
	System.out.println("Arun  edit 1 ");
	System.out.println("Arun edit 2  ");
	System.out.println("Arun edit 3 ");
	System.out.println("Arun edit 4 ");

	
//=======  
	System.out.println("jittu edit 1");
	System.out.println("jittu edit 2");
	System.out.println("jittu edit 3");
	System.out.println("jittu edit 4");

//>>>>>>> 475d8a94b3eff79b5c734311bac8b4f9e3d535ba
	
	
	}

}
