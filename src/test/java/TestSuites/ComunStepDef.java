package TestSuites;

import Helper.Config;
import Helper.Utils;
import io.cucumber.java.en.Given;




public class ComunStepDef {
	@Given("admin is on HomePage")
	
	public void admin_is_on_home_page() throws Exception {
	Config.Confchrome();
	Config.navigate(Utils.getProperty("Web_Portail_Link"));
	Config.MaximaseWindow();
	}

}
