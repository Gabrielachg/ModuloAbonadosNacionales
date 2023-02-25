package activity.bnbBank;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class OperacionesPage {

    public final Button abonadosButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/" +
            "android.widget.TableRow[5]/android.widget.LinearLayout[2]/android.widget.LinearLayout"));

    public final Button abonadosNacionalesButton =
            new Button(By.xpath("//*[@class='android.widget.TextView'][@text='Abonados Nacionales']"));
    public final Button addGroupAbonadosButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362647"));
    public TextBox registrarGrupoTextbox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131365229"));
    public final Button aceptarButton = new Button(By.id("android:id/button1"));

    public final Button verAbonadosButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131365198"));

}
