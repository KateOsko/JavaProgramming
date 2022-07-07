package day27_05_19;

import day26_05_11.driver_task.SafariDriver;
import day26_05_11.driver_task.WebDriver;

public class PO3_instanceOf {
    public static void main(String[] args) {

        //Create a method that will return us a webdriver based on user inputs

        WebDriver driver = DriverUtil.getDriver("safari");
        if(driver instanceof SafariDriver){
            ((SafariDriver) driver).fast();
        }
    }
}
