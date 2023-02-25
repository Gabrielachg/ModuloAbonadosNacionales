package activity.bnbBank;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class GrupoAbonados {
    String xpathGroup = "//*[@class='android.widget.TextView'][@text='%s']";

    public final Button eliminarGrupoButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131365057"));
    public final TextBox MessageDeleteGrupoText = new TextBox(By.id("android:id/message"));
    public final Button aceptarEliminarGrupoButton = new Button(By.id("android:id/button1"));
    public final Button grupoButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131365099"));
    public Button ingresarGrupo(String groupName){
        return new Button(By.xpath(String.format(xpathGroup, groupName)));
    }
}
