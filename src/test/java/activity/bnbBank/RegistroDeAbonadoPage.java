package activity.bnbBank;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class RegistroDeAbonadoPage {
    public final Button bancoDropDownMenu = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363821"));
    public final Button bancoNameTextLabel = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363925"));
    public final Button tipoProductoDropdownMenu = new Button(By.xpath("//*[@class='android.widget.TextView'][@text='Seleccione tipo producto']"));
    public final Button cajaAhorroTextbutton = new Button(By.xpath("//*[@class='android.widget.TextView'][@text='Caja De Ahorro']"));
    public final TextBox numeroCuentaTextbox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362628"));
    public final Button verificarCuentaButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131361957"));
    public final TextBox nombreAbonadoTextbox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362624"));
    public final TextBox NumeroDocumentoTextbox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362629"));
    public final Button registrarButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131361929"));
    public final Button aceptarButton = new Button(By.id("android:id/button1"));
    public final Button tipoDocumentoDropDownMenu = new Button(By.xpath("//*[@class='android.widget.TextView'][@text='Seleccione tipo documento']"));
    public final Button selectCarnetTextButton = new Button(By.xpath("//*[@class='android.widget.TextView'][@text='Carnet De Identidad']"));

}
