package bnbTest;

import activity.androidViews.AndroidPopup;
import activity.bnbBank.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singletonSession.Session;
import utils.Utilities;

import static utils.Constantes.*;

public class GrupoTest {

    Utilities utils = new Utilities();
    Login login = new Login();

    AndroidPopup androidPopup = new AndroidPopup();
    MainPageBNB mainPageBNB = new MainPageBNB();
    OperacionesPage operacionesPage = new OperacionesPage();
    GrupoAbonados grupoAbonados = new GrupoAbonados();

    @BeforeEach
    public void init() {
        login.user.setText(USUARIO);
        login.password.setText(PASSWORD);
        login.loginButton.click();
    }

    @AfterEach
    public void closeApp() {
        grupoAbonados.grupoButton.click();
        grupoAbonados.eliminarGrupoButton.click();
        grupoAbonados.aceptarEliminarGrupoButton.click();
        Session.getInstance().closeApp();
    }

    @Test
    public void verifyCreateGrupo() {
        String nombreGrupo = utils.createRandomName();
        mainPageBNB.popupButton.click();
        androidPopup.mientrasLaAppEsteUsoButton.click();
        mainPageBNB.operacionesButton.click();
        operacionesPage.abonadosButton.click();
        operacionesPage.abonadosNacionalesButton.click();
        operacionesPage.addGroupAbonadosButton.click();
        operacionesPage.registrarGrupoTextbox.setText(nombreGrupo);
        operacionesPage.aceptarButton.click();
        Assertions.assertTrue(grupoAbonados.ingresarGrupo(nombreGrupo).isControlDisplayed());
    }

}
