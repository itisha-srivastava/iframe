package com.IFrame.www;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://toolsqa.com/iframe-practice-page/");
		String webtext = driver.findElement(By.cssSelector("#page > div.page-title.title-center.solid-bg > div > div > div > div.wf-td.hgroup > h1")).getText();
		System.out.println("Default Website Text is" + webtext);
		WebElement iframe = driver.findElement(By.cssSelector("#IF2"));
		driver.switchTo().frame(iframe);
		String iframetext = driver.findElement(By.cssSelector("#post-9 > div > div:nth-child(1) > h5")).getText();
		System.out.println("iframe text is" + iframetext);
		Assert.assertEquals("Unique & Clean",iframetext);
		System.out.println("Result Passed");
		driver.switchTo().defaultContent();
	}
}

