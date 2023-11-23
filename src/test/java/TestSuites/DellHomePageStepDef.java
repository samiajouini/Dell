package TestSuites;

import org.junit.Assert;

import Pages.DellHomePage;
import Pages.OrdinateurPortable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DellHomePageStepDef {
	   
@When("admin mousHover on menu {string} and submenu {string}")
public void admin_mous_hover_on_menu_and_submenu(String menutiltle, String submenutitle) {
DellHomePage page =new  DellHomePage();
page.mouseHoverMenuByName(menutiltle, submenutitle);


}
   
@When("admin click on product {string}")
public void admin_click_on_product(String productName) throws InterruptedException   {
	DellHomePage page = new  DellHomePage();
	Thread.sleep(3000);
	page.clickProduct(productName);
	
	
}

@Then("admin directed to the page {string}")
public void admin_directed_to_the_page(String expectedMessage) throws InterruptedException {

OrdinateurPortable home =new  OrdinateurPortable();
String actualMessage = home.verifMessage();
Thread.sleep(3000);
Assert.assertEquals(expectedMessage, actualMessage);
home.triProductSortByName("Les mieux notés");
	
	
}

}
