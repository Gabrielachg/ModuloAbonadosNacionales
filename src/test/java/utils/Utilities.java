package utils;

import activity.androidViews.AndroidPopup;
import activity.bnbBank.*;
import java.security.SecureRandom;
import static utils.Constantes.REGISTRO_DE_ABONADOS;

public class Utilities {
    AndroidPopup androidPopup = new AndroidPopup();
    MainPageBNB mainPageBNB = new MainPageBNB();
    OperacionesPage operacionesPage = new OperacionesPage();
    AbonadosPage abonadosPage = new AbonadosPage();
    RegistroDeAbonadoPage registroDeAbonadoPage = new RegistroDeAbonadoPage();

    GrupoAbonados grupoAbonados = new GrupoAbonados();

    public String createRandomName(){
        String nameGroup = "Grupo ";
        SecureRandom randomNumber = new SecureRandom();
        String value = Integer.toString(randomNumber.nextInt(1000));
        return nameGroup.concat(value);
    }

    public void createAbonado(String nombreGrupo, String cuenta, String nombreAbonado, String carnetAbonado, String nombreBanco) {
        mainPageBNB.popupButton.waitTime();
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
        registroDeAbonadoPage.bancoDropDownMenu.scrollAndClick(nombreBanco);
        registroDeAbonadoPage.tipoProductoDropdownMenu.click();
        registroDeAbonadoPage.cajaAhorroTextbutton.click();
        registroDeAbonadoPage.numeroCuentaTextbox.setText(cuenta);
        if (registroDeAbonadoPage.bancoNameTextLabel.getText().equals("BANCO NACIONAL DE BOLIVIA "))
            registroDeAbonadoPage.verificarCuentaButton.click();
        registroDeAbonadoPage.nombreAbonadoTextbox.setText(nombreAbonado);
        registroDeAbonadoPage.tipoDocumentoDropDownMenu.click();
        registroDeAbonadoPage.selectCarnetTextButton.click();
        registroDeAbonadoPage.NumeroDocumentoTextbox.setText(carnetAbonado);
        registroDeAbonadoPage.registrarButton.scrollAndClick("Registrar");
        registroDeAbonadoPage.aceptarButton.click();
    }

    public void eliminarGrupo(String grupo) {
        abonadosPage.irAtrasButton.click();
        grupoAbonados.ingresarGrupo(grupo).waitTime();
        grupoAbonados.ingresarGrupo(grupo).click();
        grupoAbonados.eliminarGrupoButton.click();
        grupoAbonados.aceptarEliminarGrupoButton.click();
    }

}
