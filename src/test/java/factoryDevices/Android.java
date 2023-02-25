package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy J7 Prime");
        capabilities.setCapability("appPackage","bnb.com.bo.bnbmovil");
        capabilities.setCapability("appActivity","bnb.bnbmovil.loginBiometric.FakeLauncherActivity");

        capabilities.setCapability("platformName","Android");
        AppiumDriver driver= null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;
    }
}
