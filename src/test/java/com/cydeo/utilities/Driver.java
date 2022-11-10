package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

//    /*
//     Creating a private constructor, so we are closing access to the object of this class
//     from outside of any classes
//     */
//    private Driver(){}
//
//    /*
//    Making our 'driver' instance private, so that it is not reachable from outside of any class
//    We make it static, because we want it to run before anyting else,
//    also we will use it in static method
//     */
//    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
//
//    /*
//    Create re-usable utility method which will return same driver instance when we call it.
//     */
//    public static WebDriver getDriver(){
//
//        if(driverPool.get() == null){  // if driver/browser was never opened
//
//            String browserType = ConfigReader.getProperty("browser");
//
//        /*
//        Depending on the browserType our switch statement will determine
//        to open specific type of browser/driver
//         */
//            switch(browserType){
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    driverPool.set(new ChromeDriver());
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                    break;
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    driverPool.set(new FirefoxDriver());
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                    break;
//                case "safari":
//                    WebDriverManager.safaridriver().setup();
//                    driverPool.set(new SafariDriver());
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//                    break;
//                case "EDGE":
//                    WebDriverManager.edgedriver().setup();
//                    driverPool.set(new EdgeDriver());
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//                    break;
//
//            }
//        }
//        // Same driver instance will be returned every time we call Driver.getDriver() method
//        return driverPool.get();
//    }
//
//    /*
//    This method will make sure our driver value is always null after using quit() method
//     */
//    public static void closeDriver(){
//        if(driverPool.get() != null){
//            driverPool.get().quit();  // this line will terminate the existing session. Value will not ever be null
//            driverPool.remove();
//        }
//    }





//     OLD Version
//    /*
//     Creating a private constructor, so we are closing access to the object of this class
//     from outside of any classes
//     */
//    private Driver(){}
//
//    /*
//    Making our 'driver' instance private, so that it is not reachable from outside of any class
//    We make it static, because we want it to run before anyting else,
//    also we will use it in static method
//     */
//    private static WebDriver driver;
//
//    /*
//    Create re-usable utility method which will return same driver instance when we call it.
//     */
//    public static WebDriver getDriver(){
//
//        if(driver == null){  // if driver/browser was never opened
//
//            String browserType = ConfigReader.getProperty("browser");
//
//        /*
//        Depending on the browserType our switch statement will determine
//        to open specific type of browser/driver
//         */
//            switch(browserType){
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                    break;
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                    break;
//                case "safari":
//                    WebDriverManager.safaridriver().setup();
//                    driver = new SafariDriver();
//                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//                    break;
//                case "EDGE":
//                    WebDriverManager.edgedriver().setup();
//                    driver = new EdgeDriver();
//                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//                    break;
//
//            }
//        }
//        // Same driver instance will be returned every time we call Driver.getDriver() method
//        return driver;
//    }
//
//    /*
//    This method will make sure our driver value is always null after using quit() method
//     */
//    public static void closeDriver(){
//        if(driver != null){
//            driver.quit();  // this line will terminate the existing session. Value will not ever be null
//            driver = null;
//        }
//    }


    static String browser;

    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            if (System.getProperty("BROWSER") == null) {
                browser = ConfigReader.getProperty("browser");
            } else {
                browser = System.getProperty("BROWSER");
            }
            System.out.println("Browser: " + browser);
            switch (browser) {
                case "remote-chrome":
                    try {
                        // assign your grid server address
                        String gridAddress = "54.221.70.84";
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote-firefox":
                    try {
                        // assign your grid server address
                        String gridAddress = "174.129.57.203";
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;

                case "ie":
                    if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
