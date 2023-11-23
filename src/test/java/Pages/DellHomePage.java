package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DellHomePage {
@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li/button/span")
List <WebElement>  menus;
@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li/button")
List<WebElement> submenus;
@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li/ul/li[3]/ul/li/a")
List<WebElement> products;



public DellHomePage() {
	PageFactory.initElements(Config.driver, this);
	
}

 public void mouseHoverMenuByName(String menuName, String subMenuName) {
	 try {
		 
	
	for (WebElement  menu:menus) {
		  
	if (menu.getText().contains(menuName))	{
  Config.action = new Actions(Config.driver);
	 
	 Config.action.moveToElement(menu).perform();
	 
	 for (WebElement submenu:submenus) {
		 
		   if(submenu.getText().contains(subMenuName)) {
		   Config.action.moveToElement(submenu).perform();
		   }	  
		   }	
	 }
	 }
	
	 } catch (Exception   e) {   
	 }  
	}		
	   
		  
 public void clickProduct (String productName)  {
	 try {
		 
	 for (WebElement product:products) {
		 
		 if (product.getText().contains(productName)) {
	
		Thread.sleep(2000);
                 Thread.sleep(2000);
		 product.click();
		 }		 
	 }


 } catch (Exception   e) {
	 

}	
	
 }	
	
 }	
	
	