package stepdefination;

import org.testng.annotations.Test;
import io.cucumber.java.en.Given;
import page.Homepage; 

public class loginuser extends Homepage{
	
@Test
@Given("user navigate to login page")	
public void user_navigate_to_login() throws Throwable{
	clickonmenu();
	clicksignin();
}
}
