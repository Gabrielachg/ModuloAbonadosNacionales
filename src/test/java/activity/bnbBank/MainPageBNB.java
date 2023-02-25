package activity.bnbBank;

import appiumControl.Button;


import org.openqa.selenium.By;

public class MainPageBNB {
    public final Button popupButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362082"));
    public final Button operacionesButton = new Button(By.xpath("//android.widget.FrameLayout[@content-desc='Operaciones']/android.view.ViewGroup/android.widget.TextView"));

}
