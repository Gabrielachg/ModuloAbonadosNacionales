package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCloud implements IDevice {
    @Override
    public AppiumDriver create() {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "");
        caps.setCapability("browserstack.key", "");

        // Set URL of the application under PruebaUnicode
        caps.setCapability("app", "bs://");

        // Specify device and os_version for testing
        caps.setCapability("device", "Galaxy J7 Prime");
        caps.setCapability("os_version", "8.1.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "ModuloAbonadosNacionales");
        caps.setCapability("build", "1.0");
        caps.setCapability("name", "bnbBank");

        AndroidDriver<AndroidElement> driver;
        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
             driver = new AndroidDriver<AndroidElement>(
                    new URL("http://hub.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        return driver;
    }
}
