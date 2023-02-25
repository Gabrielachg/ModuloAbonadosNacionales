package bnbTest;

import activity.androidViews.AndroidPopup;
import activity.bnbBank.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singletonSession.Session;
import utils.Utilities;

import java.util.concurrent.TimeUnit;

import static utils.Constantes.*;

public class AbonadosTest {

    String nombreGrupo = "";
    Utilities utils = new Utilities();
    Login login = new Login();

    AndroidPopup androidPopup = new AndroidPopup();
    MainPageBNB mainPageBNB = new MainPageBNB();
    OperacionesPage operacionesPage = new OperacionesPage();

    AbonadosPage abonadosPage = new AbonadosPage();

    GrupoAbonados grupoAbonados = new GrupoAbonados();

    RegistroDeAbonadoPage registroDeAbonadoPage = new RegistroDeAbonadoPage();

    @BeforeEach
    public void init(){
        login.user.setText(USUARIO);
        login.password.setText(PASSWORD);
        login.loginButton.click();
    }

    @AfterEach
    public void closeApp(){
       utils.eliminarGrupo(nombreGrupo);
       Session.getInstance().closeApp();
    }

    @Test
    public void verifyCreateAbonadoCuentaLocal(){
        nombreGrupo = utils.createRandomName();
        Session.getInstance().getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        mainPageBNB.popupButton.click();
        androidPopup.mientrasLaAppEsteUsoButton.click();
        mainPageBNB.operacionesButton.click();
        operacionesPage.abonadosButton.scrollAndClick(REGISTRO_DE_ABONADOS);
        operacionesPage.abonadosNacionalesButton.click();
        operacionesPage.addGroupAbonadosButton.click();
        operacionesPage.registrarGrupoTextbox.setText(nombreGrupo);
        operacionesPage.aceptarButton.click();
        grupoAbonados.ingresarGrupo(nombreGrupo).click();
        operacionesPage.verAbonadosButton.click();
        abonadosPage.addAbonadoButton.click();
        registroDeAbonadoPage.bancoDropDownMenu.click();
        registroDeAbonadoPage.bancoDropDownMenu.scrollAndClick(BANCO_NACIONAL_BOLIVIA);
        registroDeAbonadoPage.tipoProductoDropdownMenu.click();
        registroDeAbonadoPage.cajaAhorroTextbutton.click();
        registroDeAbonadoPage.numeroCuentaTextbox.waitTime();
        registroDeAbonadoPage.numeroCuentaTextbox.setText(NRO_CUENTA_NACIONAL_BOLIVIA);
        registroDeAbonadoPage.verificarCuentaButton.click();
        registroDeAbonadoPage.registrarButton.scrollAndClick("Registrar");
        registroDeAbonadoPage.aceptarButton.click();
        Assertions.assertTrue(abonadosPage.abonadoText(NOMBRE_ABONADO_NACIONAL_BOLIVIA).isControlDisplayed());
    }


    @Test
    public void verifyDeleteAbonadoOtroBanco() {
        nombreGrupo = utils.createRandomName();
        utils.createAbonado(nombreGrupo,
                CUENTA_PERSONA_GANADERO,
                NOMBRE_CUENTA_GANADERO,
                CARNET_PERSONA_GANADERO,
                BANCO_GANADERO);
        abonadosPage.abonadoText(NOMBRE_CUENTA_GANADERO).click();
        abonadosPage.eliminarAbonadoButton.click();
        abonadosPage.aceptarEliminarAbonadoButton.click();
        Assertions.assertFalse(abonadosPage.abonadoText(NOMBRE_CUENTA_GANADERO).isControlDisplayed());
    }

}
