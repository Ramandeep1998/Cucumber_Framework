package page;

import org.openqa.selenium.By;

import base.basetest;

public class signin extends basetest{
 public String username="//*[@id=\"usr\"]";
 public String passwrod = "//*[@id=\"pwd\"]";
 public String login_btn= "//*[@id=\"second_form\"]/input";
 public String registration_btn="//*[@id=\"NewRegistration\"]";
 
 public void send_username()
 {
	 driver.findElement(By.xpath(username)).sendKeys("user");
 }
 
 public void send_password()
 {
	 driver.findElement(By.xpath(passwrod)).sendKeys("abc");
 }
 
 public void clicklogin()
 {
	 driver.findElement(By.xpath(login_btn)).click();
 }
 
 public void Click_registration()
 {
	 driver.findElement(By.xpath(registration_btn)).click();
 }
}
