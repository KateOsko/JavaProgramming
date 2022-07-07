package day27_05_19;

import day26_05_11.driver_task.ChromeDriver;
import day26_05_11.driver_task.FireFoxDriver;
import day26_05_11.driver_task.SafariDriver;
import day26_05_11.driver_task.WebDriver;

public class DriverUtil {

    public static WebDriver getDriver(String browserName){

        WebDriver driver;

        switch(browserName){
            case "chrome":
                driver = new ChromeDriver();
                break;

                case "safari":
                driver = new SafariDriver();
                break;

            case"firefox":
                driver = new FireFoxDriver();
                break;

            default:
                System.out.println("Unknown browser");
                driver = null;
        }
        return driver;
    }
}
