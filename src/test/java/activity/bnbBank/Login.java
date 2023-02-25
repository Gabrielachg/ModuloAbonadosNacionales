package activity.bnbBank;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class Login {
    public TextBox user = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362565"));
    public TextBox password = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362569"));
    public final Button loginButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362077"));
}
