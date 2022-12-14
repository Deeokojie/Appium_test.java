import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


package test;

public class base class {
    @before test 

    public void set up () {

        desiredcapabilities caps = new desiredcapabilities ();
        
        cap.setcapability("platform name", "android");
        cap.setcapability(compatabiltytype.platform_name, "android");
        cap.setcapability(moblie compatabiltytype.platform_name, "android");
        cap.setcapability(moblie compatabiltytype.platform_version, "7.1.2");
        cap.setcapability(moblie compatabiltytype.device_name, "android111");
        cap.setcapability(moblie compatabiltytype.UDID, " "); // 40 characher lenght
        cap.setcapability(moblie compatabiltytype.new.comand.timeout, 60);
        cap.setcapability(moblie compatabiltytype.app "") 
        cap.setcapability(moblie compatabiltytype.browser_name, "chrome");
        url = new url ("http://127.0.0.1:4723/wd/hub");
        driver  = new appiumdriver<mobile element> (url, caps);
        system.out.println("cause is : texp.get cause()");
        driver = new android driver <mobile element> (url, caps); system.out.println ("message is : texp.getmessage()");
        driver = new ios driver(mobile element)(url, caps);
        exp.printstacktrace();

        @after test
        public void tear down (){
            driver.close();
            driver.quit();

        }
    }    
}

