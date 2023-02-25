package activity.bnbBank;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class AbonadosPage {

    String nameAbonadoXpath = "//*[@class='android.widget.TextView'][@text='%s']";
    public final Button addAbonadoButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362646"));
    //public final Button selectBankOptionButton = new Button(By.xpath("//*[@class='android.widget.TextView'][@text='Selecciona un banco']"));
   // public final Button optionsAbonadoButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362698"));
    public final Button eliminarAbonadoButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131365057"));
    public final Button aceptarEliminarAbonadoButton = new Button(By.id("android:id/button1"));
    //public final Button nameAbonadoText = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362644"));
    public final Button irAtrasButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362708"));
    public TextBox abonadoText(String nameAbonado){
        return new TextBox(By.xpath(String.format(nameAbonadoXpath, nameAbonado)));
    }

}
