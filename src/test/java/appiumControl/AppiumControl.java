package appiumControl;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import singletonSession.Session;

public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator=locator;
    }


    public void findControl(){
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click(){
        this.findControl();
        this.control.click();
    }

    public String getText(){
        this.findControl();
        return this.control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void setText(String text) {
        this.findControl();
        this.control.sendKeys(text);
    }

    public String getAttribute(String attribute) {
        this.findControl();
        return this.control.getAttribute(attribute);
    }

    public void waitTime(){
        WebDriverWait wait = new WebDriverWait(Session.getInstance().getDriver(),60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
    }
    public void scrollAndClick(String visibleText) {
       ((AndroidDriver<?>) Session.getInstance().getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +visibleText +"\"))").click();

    }
}
