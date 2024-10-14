package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverUtility w;
	public static FileLib f;
	@BeforeTest
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		f=new FileLib();
		String url = f.getPropertyData("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException {
		w=new WebDriverUtility();
		w.verifyTitle("Login");
		LoginPage l=new LoginPage(driver);
		String un = f.getPropertyData("un");
		String pwd = f.getPropertyData("pwd");
		l.setLogin(un,pwd);
	}
	@AfterMethod
	public void logout() {
		TaskListPage t=new TaskListPage(driver);
		t.setLogout();
		//		driver.findElement(By.id("logoutLink")).click();
	}

	@AfterTest
	public void closeBrowser() {
		//		driver.manage().window().minimize();
		driver.quit();
	}
}
