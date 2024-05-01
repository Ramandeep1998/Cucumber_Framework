package page;

import base.basetest;

import org.openqa.selenium.By;

public class Homepage extends basetest {

	public static String homburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
	public static String singin_link_xpaht = "//*[@id=\"menu\"]/a[2]/li";

	public void clickonmenu() throws InterruptedException {

		Thread.sleep(6000);
		driver.findElement(By.xpath(homburger_menu_xpath)).click();

	}

	public  void clicksignin() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath(singin_link_xpaht)).click();

	}

}
