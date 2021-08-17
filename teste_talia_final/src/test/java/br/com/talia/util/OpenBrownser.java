package br.com.talia.util;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrownser {

	static WebDriver driver;
	static WebDriverWait wait;

	public void open(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\TESTE\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(site);
			//driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("-------  error ao abrir navegador  -------" + e.getMessage());
		}
		System.out.println("--------- START TEST ----------");
	}

	@AfterClass
	public void close() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("-------  error ao fechar navegador  -------" + e.getMessage());
		}
		System.out.println("--------- FINISH TEST ---------");
	}

}
